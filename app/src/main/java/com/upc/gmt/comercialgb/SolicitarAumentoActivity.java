package com.upc.gmt.comercialgb;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.upc.gmt.model.Cliente;
import com.upc.gmt.model.Solicitud;
import com.upc.gmt.util.Util;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
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

    int cantidadINT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aumento_credito);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        progressDialog = new ProgressDialog(this);

        txtCreditoTotalAumento = (EditText) findViewById(R.id.txtCreditoTotalAumento);
        txtCreditoDisponibleAumento = (EditText) findViewById(R.id.txtCreditoDisponibleAumento);
        txtDeudaPendienteAumento = (EditText) findViewById(R.id.txtDeudaPendienteAumento);
        txtCantidadAumento = (EditText) findViewById(R.id.txtCantidadAumento);

        txtDetalleAumento = (TextView) findViewById(R.id.txtDetalleAumento);

        new HttpRequestTaskClienteAumento().execute();
    }

    public void onRegresarMenu(View v) {
        finish();
    }

    public void onSolicitarAumento(View v) {
        if (!txtCantidadAumento.isEnabled()) {
            Toast.makeText(getApplicationContext(), "SOLO SE PERMITE 3 SOLICITUDES EN ESTADO PENDIENTE", Toast.LENGTH_LONG).show();
            return;
        }
        String cantidad = txtCantidadAumento.getText().toString();
        if ("".equals(cantidad)) {
            Toast.makeText(getApplicationContext(), "INGRESAR UNA CANTIDAD MAYOR A 0", Toast.LENGTH_LONG).show();
            return;
        }
        cantidadINT = Integer.parseInt(cantidad);
        if (cantidadINT < 1) {
            Toast.makeText(getApplicationContext(), "INGRESAR UNA CANTIDAD MAYOR A 0", Toast.LENGTH_LONG).show();
            return;
        }

        progressDialog.setTitle("Procesando...");
        progressDialog.show();
        new HttpRequestTaskRegistrarAumento().execute();

    }

    private class HttpRequestTaskClienteAumento extends AsyncTask<Void, Void, Cliente> {
        @Override
        protected Cliente doInBackground(Void... params) {
            try {
                String URL = Util.URL_WEB_SERVICE + "/cliente";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
                        .queryParam("idCliente", Util.USUARIO_SESSION.getIdCliente());

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                Cliente cliente = restTemplate.getForObject(builder.build().encode().toUri(), Cliente.class);
                Log.i("Cliente", cliente.toString());

                return cliente;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Cliente cliente) {
            if (null != cliente) {
                Util.CLIENTE_SESSION = cliente;
                txtCreditoTotalAumento.setText("S/. " + String.format("%.2f", cliente.getLineaCreditoActual()));
                txtCreditoDisponibleAumento.setText("S/. " + String.format("%.2f", cliente.getSaldoLineaCredito()));
                txtDeudaPendienteAumento.setText("S/. " + String.format("%.2f", cliente.getLineaCreditoActual() - cliente.getSaldoLineaCredito()));
                new HttpRequestTaskListaAumento().execute();
            } else {
                Util.CLIENTE_SESSION = new Cliente();
            }
        }

    }

    private class HttpRequestTaskRegistrarAumento extends AsyncTask<Void, Void, Integer> {
        @Override
        protected Integer doInBackground(Void... params) {
            try {
                String URL = Util.URL_WEB_SERVICE + "/registrarSolicitud";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
                        .queryParam("idCliente", Util.USUARIO_SESSION.getIdCliente())
                        .queryParam("codUsuario", Util.USUARIO_SESSION.getCodUsuario())
                        .queryParam("montoIncrementoCredito", cantidadINT);

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Log.i("URL", builder.toUriString());
                Integer i = restTemplate.getForObject(builder.build().encode().toUri(), Integer.class);
                Log.i("Resultado", i.toString());
                return i;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Integer i) {
            progressDialog.dismiss();
            if (i == null || i == 0) {
                Toast.makeText(getApplicationContext(), "NO SE PUDO REGISTRAR LA SOLICITUD", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "SE HA GENERADO LA SOLICITUD EXITOSAMENTE", Toast.LENGTH_LONG).show();
            }
            txtCantidadAumento.setText("");
            new HttpRequestTaskListaAumento().execute();
        }

    }

    private class HttpRequestTaskListaAumento extends AsyncTask<Void, Void, List<Solicitud>> {
        @Override
        protected List<Solicitud> doInBackground(Void... params) {
            try {
                String URL = Util.URL_WEB_SERVICE + "/listaSolicitudes";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
                        .queryParam("idCliente", Util.USUARIO_SESSION.getIdCliente())
                        .queryParam("codUsuario", Util.USUARIO_SESSION.getCodUsuario());

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Log.i("URL", builder.toUriString());
                HttpHeaders headers = new HttpHeaders();
                String cookies = "";
                for (String cook : Util.COOKIES_SESSION) {
                    cookies += cook + ";";
                }
                headers.set("Cookie", cookies);
                HttpEntity<String> entity = new HttpEntity<String>(headers);
                ParameterizedTypeReference<List<Solicitud>> responseType = new ParameterizedTypeReference<List<Solicitud>>() {
                };
                ResponseEntity<List<Solicitud>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, entity, responseType);
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
            String textoDetalle = "N° SOLICITUD    CANTIDAD        FECHA          ESTADO   " + System.getProperty("line.separator");
            int contadorPendiente = 0;
            for (Solicitud s : lista) {
                String fechaFMT = new SimpleDateFormat("dd/MM/yyyy").format(s.getFechaSolicitud());
                String estado = "";
                switch (s.getIdestadosolicitud()) {
                    case 1:
                        estado = "PENDIENTE";
                        contadorPendiente++;
                        break;
                    case 2:
                        estado = "RECHAZADO";
                        break;
                    default:
                        estado = "APROBADO";
                }
//                textoDetalle += "" + s.getIdSolicitud() + ".       S/. " + s.getMontoIncrementoCredito().intValue() + "       " + fechaFMT + "   " + estado + System.getProperty("line.separator");
                textoDetalle += "" + s.getIdSolicitud() + String.format("%20s", "S/. " + s.getMontoIncrementoCredito().intValue()) + String.format("%14s", fechaFMT) + String.format("%12s", estado) + System.getProperty("line.separator");

            }
            txtDetalleAumento.setText(textoDetalle);
            if (contadorPendiente >= 3) {
                txtCantidadAumento.setEnabled(false);
            }
        }

    }

}
