package com.upc.gmt.pedido;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.upc.gmt.bean.Producto;
import com.upc.gmt.comercialgb.MenuPrincipalActivity;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.util.Constantes;
import com.upc.gmt.util.Util;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;

public class RegistrarPedidoActivity extends AppCompatActivity
        implements TipoEnvioFragment.OnFragmentInteractionListener,
        TipoEntregaFragment.OnFragmentInteractionListener,
        TipoPagoFragment.OnFragmentInteractionListener,
        ComprobantePagoFragment.OnFragmentInteractionListener {

    static ProgressDialog progressDialog;

    public static Activity objeto;

    ListView lvRegistrarPedido;
    FrameLayout fragPedido;

    static TextView tvTotalPagar;
    static TextView tvPedidoCliente;

    EditText txtPedidoRuc;
    EditText txtPedidoRS;

    static int tipoEntrega;
    static int tipoPago;
    static int tipoComprobante;
    static String RUC;
    static String RS;
    static String tramaPedido;
    static String tramaPedidoDetalleReparto;
    static String codigoUbigeo;
    static int indexDepartamento;
    static int indexProvincia;
    static int indexDistrito;
    static int nroCuotas;
    static String codigoBanco;
    static String nroCuenta;
    static int indexBanco;
    static String direccionEntrega;
    static String celular;
    static String txtNroTarjetaVisa;
    static String txtNombreVisa;
    static String txtApellidoVisa;
    static String txtFechaVisa;
    static String txtVisaCSV;
    static boolean flagCostoAceptado;

    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_pedido);

        setTitle("REGISTRAR PEDIDO (" + Util.CLIENTE_SESSION.getNombres() + " - " + Util.CLIENTE_SESSION.getNrodocumentocli() + ")");

        ad = new AlertDialog.Builder(this);

        objeto = this;

        progressDialog = new ProgressDialog(this);

        tipoEntrega = Constantes.TIPO_ENTREGA_ALMACEN;
        tipoPago = Constantes.ID_FORMA_PAGO_EFECTIVO;
        tipoComprobante = 0;
        RUC = "";
        RS = "";
        tramaPedido = "";
        codigoUbigeo = "";
        indexDepartamento = 0;
        indexProvincia = 0;
        indexDistrito = 0;
        nroCuotas = 5;
        codigoBanco = "";
        nroCuenta = "";
        indexBanco = 0;
        direccionEntrega = "";
        celular = Util.CLIENTE_SESSION.getCelular();
        txtNroTarjetaVisa = "";
        txtNombreVisa = "";
        txtApellidoVisa = "";
        txtFechaVisa = "";
        txtVisaCSV = "";

        flagCostoAceptado = false;

        txtPedidoRuc = (EditText) findViewById(R.id.txtPedidoRuc);
        txtPedidoRS = (EditText) findViewById(R.id.txtPedidoRS);

        tvTotalPagar = (TextView) findViewById(R.id.tvTotalPagar);
        tvPedidoCliente = (TextView) findViewById(R.id.tvPedidoCliente);

        if (Util.CLIENTE_SESSION != null) {
            tvPedidoCliente.setText("Cliente: " + Util.CLIENTE_SESSION.getNombres() + " (" + Util.CLIENTE_SESSION.getNrodocumentocli() + ")");
        }

        BigDecimal total = new BigDecimal(Util.PRECIO_TOTAL_CALZADOS);
        total.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        tvTotalPagar.setText("TOTAL A PAGAR: S/ " + Util.formatearDecimales(total.doubleValue()));

        String[] items = {"TIPO DE ENTREGA", "TIPO DE PAGO", "COMPROBANTE DE PAGO"};
        lvRegistrarPedido = (ListView) findViewById(R.id.lvRegistrarPedido);
        lvRegistrarPedido.setAdapter(new ArrayAdapter<String>(this, R.layout.simple_listview_item, items));

        lvRegistrarPedido.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
//                Log.i("ITEM", item);
                if (item.equals("TIPO DE ENTREGA")) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragPedido, new TipoEntregaFragment())
//                            .replace(R.id.fragPedido, new TipoEnvioFragment())
                            .commit();
                } else if (item.equals("TIPO DE PAGO")) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragPedido, new TipoPagoFragment())
                            .commit();
                } else if (item.equals("COMPROBANTE DE PAGO")) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragPedido, new ComprobantePagoFragment())
                            .commit();
                }
            }
        });

        fragPedido = (FrameLayout) findViewById(R.id.fragPedido);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragPedido, new TipoEntregaFragment())
//                .add(R.id.fragPedido, new TipoEnvioFragment())
                .disallowAddToBackStack()
                .commit();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Log.i("RUN","Inicio");
//                long a = System.currentTimeMillis()+1;
//                long b = System.currentTimeMillis();
//                while(b != a+1500){
//                    b = System.currentTimeMillis();
//                    //Log.i("RUN",b+"-"+a+500);
//                }
//                getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.fragPedido, new TipoPagoFragment())
//                        .commit();
//                Log.i("RUN","FIN");
//            }
//        }).start();
    }

    public static void actualizarTotalPagar() {
        BigDecimal total = new BigDecimal(Util.PRECIO_TOTAL_CALZADOS + Util.PRECIO_COSTO_ENVIO);
        total.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        tvTotalPagar.setText("TOTAL A PAGAR: S/ " + Util.formatearDecimales(total.doubleValue()));
    }

    public void onClickRealizarPedido(View v) {
        if (tipoEntrega == Constantes.TIPO_ENTREGA_DIRECCION && direccionEntrega.equals("")) {//DOMICILIO
//            Toast.makeText(getApplicationContext(), "INGRESAR UNA DIRECCIÓN", Toast.LENGTH_LONG).show();
            ad.setTitle("VALIDACIÓN");
            ad.setMessage("INGRESAR UNA DIRECCIÓN.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoEntregaFragment()).commit();
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoEnvioFragment()).commit();
            return;
        }
        if (tipoEntrega == Constantes.TIPO_ENTREGA_DIRECCION && !flagCostoAceptado) {
//            Toast.makeText(getApplicationContext(), "POR FAVOR ACEPTAR EL COSTO DE ENVIO", Toast.LENGTH_LONG).show();
            ad.setTitle("MENSAJE");
            ad.setMessage("POR FAVOR ACEPTAR EL COSTO DE ENVIO.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoEntregaFragment()).commit();
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoEnvioFragment()).commit();
            return;
        }
        if (celular.equals("")) {
//            Toast.makeText(getApplicationContext(), "POR FAVOR INGRESAR UN NÚMERO DE CELULAR", Toast.LENGTH_LONG).show();
            ad.setTitle("VALIDACIÓN");
            ad.setMessage("POR FAVOR INGRESAR UN NÚMERO DE CELULAR.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
            return;
        }
        if (tipoPago == Constantes.ID_FORMA_PAGO_VISA) {//VISA
            if (txtNroTarjetaVisa.equals("") || txtNroTarjetaVisa.length() != 16) {
//                Toast.makeText(getApplicationContext(), "NÚMERO DE TARJETA INCORRECTO", Toast.LENGTH_LONG).show();
                ad.setTitle("VALIDACIÓN");
                ad.setMessage("NÚMERO DE TARJETA INCORRECTO.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtNombreVisa.equals("")) {
//                Toast.makeText(getApplicationContext(), "INGRESAR UN NOMBRE", Toast.LENGTH_LONG).show();
                ad.setTitle("VALIDACIÓN");
                ad.setMessage("INGRESAR UN NOMBRE.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtApellidoVisa.equals("")) {
//                Toast.makeText(getApplicationContext(), "INGRESAR UN APELLIDO", Toast.LENGTH_LONG).show();
                ad.setTitle("VALIDACIÓN");
                ad.setMessage("INGRESAR UN APELLIDO.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtFechaVisa.equals("") || txtFechaVisa.length() != 5 || !txtFechaVisa.contains("/") || !("" + txtFechaVisa.charAt(2)).equals("/")) {
//                Toast.makeText(getApplicationContext(), "FECHA DE CADUCIDAD INCORRECTO", Toast.LENGTH_LONG).show();
                ad.setTitle("VALIDACIÓN");
                ad.setMessage("FECHA DE CADUCIDAD INCORRECTO.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtVisaCSV.equals("") || txtVisaCSV.length() != 3) {
//                Toast.makeText(getApplicationContext(), "INGRESAR CSV", Toast.LENGTH_LONG).show();
                ad.setTitle("VALIDACIÓN");
                ad.setMessage("INGRESAR CSV.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
        }
        if (tipoComprobante == 1) {
            if (RUC.equals("") || RUC.length() != 11) {
//                Toast.makeText(getApplicationContext(), "INGRESAR UN RUC CORRECTO", Toast.LENGTH_LONG).show();
                ad.setTitle("VALIDACIÓN");
                ad.setMessage("INGRESAR UN RUC CORRECTO.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new ComprobantePagoFragment()).commit();
                return;
            }
            if (RS.equals("")) {
//                Toast.makeText(getApplicationContext(), "INGRESAR UNA RAZÓN SOCIAL", Toast.LENGTH_LONG).show();
                ad.setTitle("VALIDACIÓN");
                ad.setMessage("INGRESAR UNA RAZÓN SOCIAL.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new ComprobantePagoFragment()).commit();
                return;
            }
        }

        Util.PRECIO_TOTAL_PAGAR = Util.PRECIO_COSTO_ENVIO + Util.PRECIO_TOTAL_CALZADOS;

        if (tipoPago == Constantes.ID_FORMA_PAGO_CONSIGNACION) {
            if (Util.CLIENTE_SESSION.getSaldolineacredito() < Util.PRECIO_TOTAL_PAGAR) {
//                Toast.makeText(getApplicationContext(), "NO TIENE SUFICIENTE LÍNEA DE CRÉDITO PARA COMPRAR POR CONSIGNACIÓN", Toast.LENGTH_LONG).show();
                ad.setTitle("MENSAJE");
                ad.setMessage("NO TIENE SUFICIENTE LÍNEA DE CRÉDITO PARA COMPRAR POR CONSIGNACIÓN.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
                return;
            }
        }

        tramaPedido = "";
        for (Producto p : Util.LISTA_PRODUCTOS_PEDIDO) {
            tramaPedido += p.getIdproducto() + "," + p.getIdColor() + "," + p.getNroTalla() + "," + p.getCantidad() + "," + p.getPreciounitario() + "," + p.getDescuentoSeleccionado() + ";";
        }
        if (tramaPedido.length() > 0) {
            tramaPedido = tramaPedido.substring(0, tramaPedido.length() - 1);
        }
        Log.i("tramaPedido", tramaPedido);

        tramaPedidoDetalleReparto = "";
        for (Producto p : Util.LISTA_PRODUCTOS_PEDIDO) {
            tramaPedidoDetalleReparto += p.getIdproducto() + "," + p.getIdColor() + "," + p.getNroTalla() + "," + 1 + "," + codigoUbigeo + "," + p.getCantidad() + "," + Util.PRECIO_COSTO_ENVIO + "," + 1 + "," + tipoEntrega + ";";
        }
        if (tramaPedidoDetalleReparto.length() > 0) {
            tramaPedidoDetalleReparto = tramaPedidoDetalleReparto.substring(0, tramaPedidoDetalleReparto.length() - 1);
        }
        Log.i("tramaPedidoDetalleReparto", tramaPedidoDetalleReparto);

        if (tipoPago == Constantes.ID_FORMA_PAGO_CONSIGNACION) {
            Intent i = new Intent(getApplicationContext(), PedidoConsignacionActivity.class);
            startActivity(i);
        } else {
            progressDialog.setMessage("REGISTRANDO PEDIDO...");
            progressDialog.show();
            new HttpRequestTaskRegistrarPedido().execute();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        Log.i("Uri", "" + uri);
    }

    public class HttpRequestTaskRegistrarPedido extends AsyncTask<Void, Void, Integer> {
        @Override
        protected Integer doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskRegistrarPedido");
            try {
                String URL = Util.URL_SERVICE_BASE + "/venta/registrar";//TEST
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//                        .queryParam("ParmIdCliente", Util.CLIENTE_SESSION.getIdCliente())
//                        .queryParam("ParmTotal", Util.PRECIO_TOTAL_PAGAR)
//                        .queryParam("ParmNroCuotas",//DEV
//                                (tipoPago == 2) ? nroCuotas : 0
//                        )
//                        .queryParam("ParmTipoRecojo", tipoEntrega)
//                        .queryParam("ParmNumOperaBancaria",//DEV
//                                (tipoPago == 4) ? 0 : 0
//                        )
//                        .queryParam("ParmCodTrxTarjeta",//DEV
//                                (tipoPago == 3) ? String.valueOf(currentTimeMillis()) : ""
//                        )
//                        .queryParam("ParmCodUbigeoCosto",//DEV
//                                (tipoEntrega == 1) ? codigoUbigeo : ""
//                        )
//                        .queryParam("ParmIdFomaPago", tipoPago)
//                        .queryParam("ParmDireccionEntrega",
//                                (tipoEntrega == 1) ? direccionEntrega : ""
//                        )
//                        .queryParam("ParmIdBanco",//DEV
//                                (tipoPago == 4) ? codigoBanco : 0
//                        )
//                        .queryParam("ParmNroCuenta", "")
//                        .queryParam("ParmTipoDocumento", tipoComprobante)
//                        .queryParam("ParmRuc", RUC)
//                        .queryParam("ParmRazonSocial", RS)
//                        .queryParam("ParmIdTipoUsuario", Util.EMPLEADO_SESSION.getIdtipousuario().intValue())
//                        .queryParam("tramaPedido", tramaPedido);

                Log.i("URL", builder.toUriString());

                ParameterizedTypeReference<Integer> responseType = new ParameterizedTypeReference<Integer>() {
                };

//                HttpAuthentication httpAuthentication = new HttpBasicAuthentication("username", "password");
                HttpHeaders requestHeaders = new HttpHeaders();
//                requestHeaders.setAuthorization(httpAuthentication);
                requestHeaders.setContentType(MediaType.APPLICATION_JSON);

                MultiValueMap<String, Object> body = new LinkedMultiValueMap<String, Object>();
                //SP_GrabarVenta
                body.add("parmNroDocumentoCli", Util.CLIENTE_SESSION.getNrodocumentocli());
                body.add("parmDescuentoTotal", Util.PRECIO_TOTAL_DESCUENTO);
                body.add("parmTotal", Util.PRECIO_TOTAL_CALZADOS);
                body.add("parmTotalCostoEnvio", Util.PRECIO_COSTO_ENVIO);
                body.add("parmTotalVenta", Util.PRECIO_TOTAL_PAGAR);
                body.add("parmNroCuotas", 0);
                body.add("parmIdFomaPago", tipoPago);
                body.add("parmTipoDocumento", tipoComprobante);
                body.add("parmCodUsuario", Util.EMPLEADO_SESSION.getCodusuario());
                body.add("parmRuc", RUC);//
                body.add("parmRazonSocial", RS);//
                body.add("parmIdBanco", null);//
                body.add("parmCodTrxTarjeta", null);//
                body.add("parmComentarioConsignacion", null);
                //SP_MantDetalleVenta
                body.add("tramaPedidoDetalle", tramaPedido);
                //SP_MantDetalleRepartoVenta
                body.add("tramaPedidoDetalleReparto", tramaPedidoDetalleReparto);

                HttpEntity<?> httpEntity = new HttpEntity<Object>(body, requestHeaders);

                ResponseEntity<Integer> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.POST, httpEntity, responseType);
                Integer codRespuesta = respuesta.getBody();
                Log.i("respuesta", "" + codRespuesta);
                return codRespuesta;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("HttpRequestTask", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return 0;
        }

        @Override
        protected void onPostExecute(Integer respuesta) {
            Log.i("onPostExecute", "HttpRequestTaskRegistrarPedido");
            progressDialog.dismiss();
            if (respuesta != null && respuesta.intValue() != 0) {
//                Toast.makeText(getApplicationContext(), "SE HA REGISTRADO SU PEDIDO N° " + respuesta.intValue(), Toast.LENGTH_LONG).show();
                ad.setTitle("MENSAJE");
                ad.setMessage("SE HA REGISTRADO SU PEDIDO N° " + respuesta.intValue());
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Util.LISTA_PRODUCTOS_PEDIDO = new ArrayList<>();
                        Intent intent = new Intent(getApplicationContext(), MenuPrincipalActivity.class);
                        startActivity(intent);
                        finish();
                        dialogInterface.dismiss();
                    }
                });
                ad.setCancelable(false);
                ad.show();
            } else {
//                Toast.makeText(getApplicationContext(), "NO SE PUDO REGISTRAR EL PEDIDO, OCURRIÓ UN ERROR", Toast.LENGTH_LONG).show();
                ad.setTitle("MENSAJE");
                ad.setMessage("NO SE PUDO REGISTRAR EL PEDIDO, OCURRIÓ UN ERROR.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
            }
            Log.i("onPostExecute", "fin");
        }

    }

}
