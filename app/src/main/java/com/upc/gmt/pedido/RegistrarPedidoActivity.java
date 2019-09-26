package com.upc.gmt.pedido;

import android.app.Activity;
import android.app.ProgressDialog;
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
import android.widget.Toast;

import com.upc.gmt.comercialgb.MenuPrincipalActivity;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.model.Producto;
import com.upc.gmt.util.Util;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;

import static java.lang.System.currentTimeMillis;

public class RegistrarPedidoActivity extends AppCompatActivity
        implements TipoEntregaFragment.OnFragmentInteractionListener,
        TipoPagoFragment.OnFragmentInteractionListener,
        ComprobantePagoFragment.OnFragmentInteractionListener {

    static ProgressDialog progressDialog;

    public static Activity objeto;

    ListView lvRegistrarPedido;
    FrameLayout fragPedido;

    static TextView tvTotalPagar;

    EditText txtPedidoRuc;
    EditText txtPedidoRS;

    static int tipoEntrega;
    static int tipoPago;
    static int tipoComprobante;
    static String RUC;
    static String RS;
    static String tramaPedido;
    static String codigoUbigeo;
    static int indexDepartamento;
    static int indexProvincia;
    static int indexDistrito;
    static int nroCuotas;
    static int codigoBanco;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_pedido);

        objeto = this;

        progressDialog = new ProgressDialog(this);

        tipoEntrega = 0;
        tipoPago = 1;
        tipoComprobante = 0;
        RUC = "";
        RS = "";
        tramaPedido = "";
        codigoUbigeo = "";
        indexDepartamento = 0;
        indexProvincia = 0;
        indexDistrito = 0;
        nroCuotas = 5;
        codigoBanco = 0;
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
        BigDecimal total = new BigDecimal(Util.PRECIO_TOTAL_CALZADOS);
        total.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        tvTotalPagar.setText("TOTAL A PAGAR: S/ " + String.format("%.2f", total.doubleValue()));

        String[] items = {"TIPO DE ENTREGA", "TIPO DE PAGO", "COMPROBANTE DE PAGO"};
        lvRegistrarPedido = (ListView) findViewById(R.id.lvRegistrarPedido);
        lvRegistrarPedido.setAdapter(new ArrayAdapter<String>(this, R.layout.simple_listview_item, items));

        lvRegistrarPedido.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Log.i("ITEM", item);
                if (item.equals("TIPO DE ENTREGA")) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.fragPedido, new TipoEntregaFragment())
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
        tvTotalPagar.setText("TOTAL A PAGAR: S/ " + String.format("%.2f", total.doubleValue()));
    }

    public void onClickRealizarPedido(View v) {
        if (tipoEntrega == 1 && direccionEntrega.equals("")) {//DOMICILIO
            Toast.makeText(getApplicationContext(), "INGRESAR UNA DIRECCIÓN", Toast.LENGTH_LONG).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoEntregaFragment()).commit();
            return;
        }
        if (tipoEntrega == 1 && !flagCostoAceptado) {
            Toast.makeText(getApplicationContext(), "POR FAVOR ACEPTAR EL COSTO DE ENVIO", Toast.LENGTH_LONG).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoEntregaFragment()).commit();
            return;
        }
        if (celular.equals("")) {
            Toast.makeText(getApplicationContext(), "POR FAVOR INGRESAR UN NÚMERO DE CELULAR", Toast.LENGTH_LONG).show();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
            return;
        }
        if (tipoPago == 3) {//VISA
            if (txtNroTarjetaVisa.equals("") || txtNroTarjetaVisa.length() != 16) {
                Toast.makeText(getApplicationContext(), "NÚMERO DE TARJETA INCORRECTO", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtNombreVisa.equals("")) {
                Toast.makeText(getApplicationContext(), "INGRESAR UN NOMBRE", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtApellidoVisa.equals("")) {
                Toast.makeText(getApplicationContext(), "INGRESAR UN APELLIDO", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtFechaVisa.equals("") || txtFechaVisa.length() != 5 || !txtFechaVisa.contains("/") || !("" + txtFechaVisa.charAt(2)).equals("/")) {
                Toast.makeText(getApplicationContext(), "FECHA DE CADUCIDAD INCORRECTO", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
            if (txtVisaCSV.equals("") || txtVisaCSV.length() != 3) {
                Toast.makeText(getApplicationContext(), "INGRESAR CSV", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new TipoPagoFragment()).commit();
                return;
            }
        }
        if (tipoComprobante == 1) {
            if (RUC.equals("") || RUC.length() != 11) {
                Toast.makeText(getApplicationContext(), "INGRESAR UN RUC CORRECTO", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new ComprobantePagoFragment()).commit();
                return;
            }
            if (RS.equals("")) {
                Toast.makeText(getApplicationContext(), "INGRESAR UNA RAZÓN SOCIAL", Toast.LENGTH_LONG).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragPedido, new ComprobantePagoFragment()).commit();
                return;
            }
        }

        Util.PRECIO_TOTAL_PAGAR = Util.PRECIO_COSTO_ENVIO + Util.PRECIO_TOTAL_CALZADOS;

        if (tipoPago == 2) {
            if (Util.CLIENTE_SESSION.getSaldoLineaCredito() < Util.PRECIO_TOTAL_PAGAR) {
                Toast.makeText(getApplicationContext(), "NO TIENE SUFICIENTE LÍNEA DE CRÉDITO PARA COMPRAR POR CONSIGNACIÓN", Toast.LENGTH_LONG).show();
                return;
            }
        }

        tramaPedido = "";
        for (Producto p : Util.LISTA_PRODUCTOS_PEDIDO) {
            tramaPedido += p.getIdProducto() + "," + p.getIdColor() + "," + p.getNroTalla() + "," + p.getCantidad() + ";";
        }
        if (tramaPedido.length() > 0) {
            tramaPedido = tramaPedido.substring(0, tramaPedido.length() - 1);
        }
//        Log.i("tramaPedido", tramaPedido);
        if (tipoPago == 2) {
            Intent i = new Intent(getApplicationContext(), PedidoConsignacionActivity.class);
            startActivity(i);
//        }else if(tipoPago == 3){
//            progressDialog.setMessage("Conectandose a Visa...");
//            progressDialog.show();
//            long count = System.currentTimeMillis()+2000;
//            while(System.currentTimeMillis() != count){}
//            progressDialog.dismiss();
//            new HttpRequestTaskRegistrarPedido().execute();
//            progressDialog.setMessage("Realizando Pago...");
//            progressDialog.show();
//            new HttpRequestTaskRegistrarPedido().execute();
        } else {
            progressDialog.setMessage("Registrando Pedido...");
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
                String URL = Util.URL_WEB_SERVICE + "/registrarPedido";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
                        .queryParam("ParmIdCliente", Util.USUARIO_SESSION.getIdCliente())
                        .queryParam("ParmTotal", Util.PRECIO_TOTAL_PAGAR)
                        .queryParam("ParmNroCuotas",//DEV
                                (tipoPago == 2) ? nroCuotas : 0
                        )
                        .queryParam("ParmTipoRecojo", tipoEntrega)
                        .queryParam("ParmNumOperaBancaria",//DEV
                                (tipoPago == 4) ? 0 : 0
                        )
                        .queryParam("ParmCodTrxTarjeta",//DEV
                                (tipoPago == 3) ? String.valueOf(currentTimeMillis()) : ""
                        )
                        .queryParam("ParmCodUbigeoCosto",//DEV
                                (tipoEntrega == 1) ? codigoUbigeo : ""
                        )
                        .queryParam("ParmIdFomaPago", tipoPago)
                        .queryParam("ParmDireccionEntrega",
                                (tipoEntrega == 1) ? direccionEntrega : ""
                        )
                        .queryParam("ParmIdBanco",//DEV
                                (tipoPago == 4) ? codigoBanco : 0
                        )
                        .queryParam("ParmNroCuenta", "")
                        .queryParam("ParmTipoDocumento", tipoComprobante)
                        .queryParam("ParmRuc", RUC)
                        .queryParam("ParmRazonSocial", RS)
                        .queryParam("ParmIdTipoUsuario", Util.USUARIO_SESSION.getIdTipoUsuario().intValue())
                        .queryParam("tramaPedido", tramaPedido);
//                        .queryParam("ParmIdProducto", abc)
//                        .queryParam("ParmIdColorProducto", abc)
//                        .queryParam("ParmNroTalla", abc)
//                        .queryParam("ParmCantidad", abc);

                Log.i("URL", builder.toUriString());

                HttpHeaders headers = new HttpHeaders();
                String cookies = "";
                for (String cook : Util.COOKIES_SESSION) {
                    cookies += cook + ";";
                }
                headers.set("Cookie", cookies);
                HttpEntity<String> entity = new HttpEntity<String>(headers);

                ParameterizedTypeReference<Integer> responseType = new ParameterizedTypeReference<Integer>() {
                };
                ResponseEntity<Integer> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.POST, entity, responseType);
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
                Toast.makeText(getApplicationContext(), "SE HA REGISTRADO SU PEDIDO N° " + respuesta.intValue(), Toast.LENGTH_LONG).show();
                Util.LISTA_PRODUCTOS_PEDIDO = new ArrayList<>();
                Intent i = new Intent(getApplicationContext(), MenuPrincipalActivity.class);
                startActivity(i);
                finish();
            } else {
                Toast.makeText(getApplicationContext(), "NO SE PUDO REGISTRAR EL PEDIDO, OCURRIÓ UN ERROR", Toast.LENGTH_LONG).show();
            }
            Log.i("onPostExecute", "fin");
        }

    }

}
