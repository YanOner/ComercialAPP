package com.upc.gmt.pedido;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.upc.gmt.comercialgb.MenuPrincipalActivity;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.comercialgb.SolicitarAumentoActivity;
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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static com.upc.gmt.pedido.RegistrarPedidoActivity.RS;
import static com.upc.gmt.pedido.RegistrarPedidoActivity.RUC;
import static com.upc.gmt.pedido.RegistrarPedidoActivity.tipoComprobante;
import static com.upc.gmt.pedido.RegistrarPedidoActivity.tipoPago;
import static com.upc.gmt.pedido.RegistrarPedidoActivity.tramaPedido;
import static com.upc.gmt.pedido.RegistrarPedidoActivity.tramaPedidoDetalleReparto;

public class PedidoConsignacionActivity extends AppCompatActivity {

    ProgressDialog progressDialog;

    EditText txtCreditoTotal;
    EditText txtCreditoDisponible;
    EditText txtDeudaPendiente;
    EditText txtCreditoDespues;
    EditText txtTotalConsignacion;
    Spinner spnCuotas;
    TextView txtDetalleCuotas;

    List listaCuotas;

    int cuotasSeleccionadas = 4;

    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido_consignacion);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        ad = new AlertDialog.Builder(this);

        progressDialog = new ProgressDialog(this);

        txtCreditoTotal = (EditText) findViewById(R.id.txtCreditoTotal);
        txtCreditoDisponible = (EditText) findViewById(R.id.txtCreditoDisponible);
        txtDeudaPendiente = (EditText) findViewById(R.id.txtDeudaPendiente);
        txtCreditoDespues = (EditText) findViewById(R.id.txtCreditoDespues);
        txtTotalConsignacion = (EditText) findViewById(R.id.txtTotalConsignacion);
        spnCuotas = (Spinner) findViewById(R.id.spnCuotas);

        txtCreditoTotal.setText("S/ " + Util.formatearDecimales(Util.CLIENTE_SESSION.getLineacreditoactual()));
        txtCreditoDisponible.setText("S/ " + Util.formatearDecimales(Util.CLIENTE_SESSION.getSaldolineacredito()));

        txtCreditoDespues.setText("S/ " + Util.formatearDecimales((Util.CLIENTE_SESSION.getSaldolineacredito() - Util.PRECIO_TOTAL_PAGAR)));
        txtTotalConsignacion.setText("S/ " + Util.formatearDecimales(Util.PRECIO_TOTAL_PAGAR));

        txtDeudaPendiente.setText("S/ " + Util.formatearDecimales((Util.CLIENTE_SESSION.getLineacreditoactual() - Util.CLIENTE_SESSION.getSaldolineacredito())));

        //Lista Precios
        listaCuotas = new ArrayList<>();
        listaCuotas.add(" 2   ");
        listaCuotas.add(" 3   ");
        listaCuotas.add(" 4   ");
        listaCuotas.add(" 5   ");
        listaCuotas.add(" 6   ");
        listaCuotas.add(" 7   ");
        listaCuotas.add(" 8   ");

        ArrayAdapter<String> arrayPrecioCalzado = new ArrayAdapter<String>(getApplicationContext(), R.layout.simple_spinner_item, listaCuotas);
        arrayPrecioCalzado.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spnCuotas.setAdapter(arrayPrecioCalzado);

        txtDetalleCuotas = (TextView) findViewById(R.id.txtDetalleCuotas);

        spnCuotas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                cuotasSeleccionadas = position + 2;

                double cuota = Util.PRECIO_TOTAL_PAGAR / cuotasSeleccionadas;

                String textoDetalleCuota = "N° CUOTA  IMPORTE  VENCIMIENTO" + System.getProperty("line.separator");

                for (int i = 1; i <= cuotasSeleccionadas; i++) {
                    Calendar c = Calendar.getInstance();
                    c.set(Calendar.DATE, c.get(Calendar.DATE) + 7 * i);
                    Date fechaVencimiento = c.getTime();
                    String formatoVencimiento = new SimpleDateFormat("dd/MM/yyyy").format(fechaVencimiento);
                    textoDetalleCuota += "       " + i + "         " + Util.formatearDecimales(cuota) + "       " + formatoVencimiento + " " + System.getProperty("line.separator");
                }

                txtDetalleCuotas.setText(textoDetalleCuota);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spnCuotas.setSelection(2);

    }

    public void onSolicitarAumento(View v) {
        Intent i = new Intent(this, SolicitarAumentoActivity.class);
        startActivity(i);
    }

    public void onRegresarConsignacion(View v) {
        finish();
    }

    public void onAceptarConsignacion(View v) {
        progressDialog.setMessage("REGISTRANDO PEDIDO...");
        progressDialog.show();
        new HttpRequestTaskRegistrarPedidoConsignacion().execute();
    }

    public class HttpRequestTaskRegistrarPedidoConsignacion extends AsyncTask<Void, Void, Integer> {
        @Override
        protected Integer doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskRegistrarPedidoConsignacion");
            try {
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_PEDIDO + "/venta/registrar";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//                        .queryParam("ParmTotal", Util.PRECIO_TOTAL_PAGAR)
//                        .queryParam("ParmNroCuotas",
//                                cuotasSeleccionadas
//                        )
//                        .queryParam("ParmTipoRecojo", tipoEntrega)
//                        .queryParam("ParmNumOperaBancaria",
//                                0
//                        )
//                        .queryParam("ParmCodTrxTarjeta",
//                                ""
//                        )
//                        .queryParam("ParmCodUbigeoCosto",
//                                (tipoEntrega == 1) ? codigoUbigeo : ""
//                        )
//                        .queryParam("ParmIdFomaPago", tipoPago)
//                        .queryParam("ParmDireccionEntrega",
//                                (tipoEntrega == 1) ? direccionEntrega : ""
//                        )
//                        .queryParam("ParmIdBanco",
//                                0
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
                body.add("parmNroCuotas", cuotasSeleccionadas);
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
                Log.e("HttpRequestTaskRPConsig", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return 0;
        }

        @Override
        protected void onPostExecute(Integer respuesta) {
            Log.i("onPostExecute", "HttpRequestTaskRegistrarPedidoConsignacion");
            progressDialog.dismiss();
            if (respuesta != null && respuesta.intValue() != Constantes.CODIGO_SERVICIO_ERROR) {
//                Toast.makeText(getApplicationContext(), "SE HA REGISTRADO EL PEDIDO N° " + respuesta.intValue(), Toast.LENGTH_LONG).show();
                ad.setTitle("MENSAJE");
                ad.setMessage("SE HA REGISTRADO EL PEDIDO N° " + respuesta.intValue());
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Util.LISTA_PRODUCTOS_PEDIDO = new ArrayList<>();
                        Intent intent = new Intent(getApplicationContext(), MenuPrincipalActivity.class);
                        startActivity(intent);
                        RegistrarPedidoActivity.objeto.finish();
                        finish();
                        dialogInterface.dismiss();
                    }
                });
                ad.setCancelable(false);// setCanceledOnTouchOutside(false);
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
