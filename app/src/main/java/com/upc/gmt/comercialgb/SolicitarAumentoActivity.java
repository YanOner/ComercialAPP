package com.upc.gmt.comercialgb;

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
import android.widget.EditText;
import android.widget.TextView;

import com.upc.gmt.catalogo.BuscarClienteActivity;
import com.upc.gmt.model.Solicitud;
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
import java.util.List;

public class SolicitarAumentoActivity extends AppCompatActivity {

    ProgressDialog progressDialog;

    EditText txtCreditoTotalAumento;
    EditText txtCreditoDisponibleAumento;
    EditText txtDeudaPendienteAumento;
    EditText txtCantidadAumento;

    TextView txtDetalleAumento;
    TextView txtClienteCredito;

    double cantidadIncremento = 0;

    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aumento_credito);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        ad = new AlertDialog.Builder(this);

        progressDialog = new ProgressDialog(this);

        txtCreditoTotalAumento = (EditText) findViewById(R.id.txtCreditoTotalAumento);
        txtCreditoDisponibleAumento = (EditText) findViewById(R.id.txtCreditoDisponibleAumento);
        txtDeudaPendienteAumento = (EditText) findViewById(R.id.txtDeudaPendienteAumento);
        txtCantidadAumento = (EditText) findViewById(R.id.txtCantidadAumento);

        txtDetalleAumento = (TextView) findViewById(R.id.txtDetalleAumento);
        txtClienteCredito = (TextView) findViewById(R.id.tvClienteCredito);

//        new HttpRequestTaskClienteAumento().execute();
//        if (Util.CLIENTE_SESSION != null) {
//            txtClienteCredito.setText("Cliente: " + Util.CLIENTE_SESSION.getNombres() + " (" + Util.CLIENTE_SESSION.getNrodocumentocli() + ")");
//            txtCreditoTotalAumento.setText("S/ " + Util.formatearDecimales(Util.CLIENTE_SESSION.getLineacreditoactual()));
//            txtCreditoDisponibleAumento.setText("S/ " + Util.formatearDecimales(Util.CLIENTE_SESSION.getSaldolineacredito()));
//            txtDeudaPendienteAumento.setText("S/ " + Util.formatearDecimales((Util.CLIENTE_SESSION.getLineacreditoactual() - Util.CLIENTE_SESSION.getSaldolineacredito())));
//            new HttpRequestTaskListaAumento().execute();
//        }
    }

    public void onRegresarMenu(View v) {
        finish();
    }

    public void onBuscarCliente(View v) {
        Intent i = new Intent(getApplicationContext(), BuscarClienteActivity.class);
        startActivityForResult(i, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("onActivityResult", requestCode + "-" + resultCode);
        if (Util.CLIENTE_SESSION != null) {
            txtClienteCredito.setText("Cliente: " + Util.CLIENTE_SESSION.getNombres() + "(" + Util.CLIENTE_SESSION.getNrodocumentocli() + ")");
            txtCreditoTotalAumento.setText("S/ " + Util.formatearDecimales(Util.CLIENTE_SESSION.getLineacreditoactual()));
            txtCreditoDisponibleAumento.setText("S/ " + Util.formatearDecimales(Util.CLIENTE_SESSION.getSaldolineacredito()));
            txtDeudaPendienteAumento.setText("S/ " + Util.formatearDecimales((Util.CLIENTE_SESSION.getLineacreditoactual() - Util.CLIENTE_SESSION.getSaldolineacredito())));
            new HttpRequestTaskListaAumento().execute();
        }
    }

    public void onSolicitarAumento(View v) {
        if (Util.CLIENTE_SESSION == null) {
            ad.setTitle("MENSAJE");
            ad.setMessage("DEBE BUSCAR UN CLIENTE.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        }

        if (!txtCantidadAumento.isEnabled()) {
            ad.setTitle("VALIDACIÓN");
            ad.setMessage("SOLO SE PERMITE 3 SOLICITUDES EN ESTADO PENDIENTE.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        }
        String cantidad = txtCantidadAumento.getText().toString();
        if ("".equals(cantidad)) {
            ad.setTitle("VALIDACIÓN");
            ad.setMessage("INGRESAR UNA CANTIDAD MAYOR O IGUAL A 500.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        }
        cantidadIncremento = Double.parseDouble(cantidad);
        if (cantidadIncremento < 500) {
//            Toast.makeText(getApplicationContext(), "INGRESAR UNA CANTIDAD MAYOR A 0", Toast.LENGTH_LONG).show();
            ad.setTitle("VALIDACIÓN");
            ad.setMessage("INGRESAR UNA CANTIDAD MAYOR O IGUAL A 500.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        }

        progressDialog.setTitle("PROCESANDO...");
        progressDialog.show();
        new HttpRequestTaskRegistrarAumento().execute();

    }

//    private class HttpRequestTaskClienteAumento extends AsyncTask<Void, Void, Cliente> {
//        @Override
//        protected Cliente doInBackground(Void... params) {
//            try {
//                String URL = Util.URL_SERVICE_BASE + "/cliente/" + Util.CLIENTE_SESSION.getNrodocumentocli();
//                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//
//                RestTemplate restTemplate = new RestTemplate();
//                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//
//                Cliente cliente = restTemplate.getForObject(builder.build().encode().toUri(), Cliente.class);
//                if (cliente != null)
//                    Log.i("Cliente", cliente.toString());
//
//                return cliente;
//            } catch (Exception e) {
//                Log.e(this.getClass().getName(), e.getMessage(), e);
//            }
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Cliente cliente) {
//            if (null != cliente) {
//                Util.CLIENTE_SESSION = cliente;
//                txtClienteCredito.setText("Cliente: "+Util.CLIENTE_SESSION.getNombres());
//                txtCreditoTotalAumento.setText("S/ " + Util.formatearDecimales(cliente.getLineacreditoactual()));
//                txtCreditoDisponibleAumento.setText("S/ " + Util.formatearDecimales(cliente.getSaldolineacredito()));
//                txtDeudaPendienteAumento.setText("S/ " + Util.formatearDecimales((cliente.getLineacreditoactual() - cliente.getSaldolineacredito())));
//                new HttpRequestTaskListaAumento().execute();
//            } else {
//                Util.CLIENTE_SESSION = new Cliente();
//            }
//        }
//    }

    private class HttpRequestTaskRegistrarAumento extends AsyncTask<Void, Void, Integer> {
        @Override
        protected Integer doInBackground(Void... params) {
            try {
                String URL = Util.URL_SERVICE_BASE + "/solicitud/registrar";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
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
                body.add("parmCodUsuario", Util.EMPLEADO_SESSION.getCodusuario());
                body.add("cantidadIncremento", cantidadIncremento);

                HttpEntity<?> httpEntity = new HttpEntity<Object>(body, requestHeaders);

                ResponseEntity<Integer> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.POST, httpEntity, responseType);
                Integer codRespuesta = respuesta.getBody();
                Log.i("respuesta", "" + codRespuesta);
                return codRespuesta;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Integer i) {
            progressDialog.dismiss();
            if (i == null || i == 0) {
                ad.setTitle("MENSAJE");
                ad.setMessage("NO SE PUDO REGISTRAR LA SOLICITUD, OCURRIÓ UN ERROR.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
            } else {
                ad.setTitle("MENSAJE");
                ad.setMessage("SE HA GENERADO LA SOLICITUD EXITOSAMENTE.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
            }
            txtCantidadAumento.setText("");
            new HttpRequestTaskListaAumento().execute();
        }

    }

    private class HttpRequestTaskListaAumento extends AsyncTask<Void, Void, List<Solicitud>> {
        @Override
        protected List<Solicitud> doInBackground(Void... params) {
            try {
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                String URL = Util.URL_SERVICE_BASE + "/solicitud/estado";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);

                Log.i("URL", builder.toUriString());

                ParameterizedTypeReference<List<Solicitud>> responseType = new ParameterizedTypeReference<List<Solicitud>>() {
                };

                HttpHeaders requestHeaders = new HttpHeaders();
                requestHeaders.setContentType(MediaType.APPLICATION_JSON);

                MultiValueMap<String, Object> body = new LinkedMultiValueMap<String, Object>();
                body.add("parmNroDocumentoCli", Util.CLIENTE_SESSION.getNrodocumentocli());
                body.add("parmCodUsuario", Util.EMPLEADO_SESSION.getCodusuario());

                HttpEntity<?> httpEntity = new HttpEntity<Object>(body, requestHeaders);
                ResponseEntity<List<Solicitud>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.POST, httpEntity, responseType);
                List<Solicitud> lista = respuesta.getBody();
                Log.i("lista", lista.toString());
                return lista;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Solicitud> lista) {
            String textoDetalle = "N° SOLICITUD    CANTIDAD        FECHA          ESTADO";//
            textoDetalle = String.format("%-70s", textoDetalle) + System.getProperty("line.separator");
            int contadorPendiente = 0;
            for (Solicitud s : lista) {
                String fechaFMT = new SimpleDateFormat("dd/MM/yyyy").format(s.getFechasolicitud());
                String estado;
                switch (s.getIdestadosolicitud()) {
                    case 1:
                        estado = "APROBADO";
                        break;
                    case 2:
                        estado = "PENDIENTE";
                        contadorPendiente++;
                        break;
                    case 3:
                        estado = "RECHAZADO";
                        break;
                    default:
                        estado = "ANULADO";
                }
                textoDetalle += "" + s.getIdsolicitud() + String.format("%25s", "S/ " + s.getMontoincrementocredito().intValue()) + String.format("%14s", fechaFMT) + String.format("%12s", estado);
                textoDetalle = String.format("%-70s", textoDetalle) + System.getProperty("line.separator");
            }
            txtDetalleAumento.setText(textoDetalle);
            if (contadorPendiente >= 3) {
                txtCantidadAumento.setEnabled(false);
            }
        }

    }

}
