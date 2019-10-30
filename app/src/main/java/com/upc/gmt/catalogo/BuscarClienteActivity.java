package com.upc.gmt.catalogo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.upc.gmt.comercialgb.R;
import com.upc.gmt.model.Cliente;
import com.upc.gmt.util.Util;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

public class BuscarClienteActivity extends AppCompatActivity {

    Spinner spnTipoDococumento;
    EditText txtNumeroDocumento;
//    TextView tvNumeroDoc;

    String tipoDocumento = "";
    String numeroDocumento = "";

    AlertDialog.Builder ad;

    BuscarClienteActivity buscarClienteActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cliente);
        setTitle("BUSCAR CLIENTE");

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        ad = new AlertDialog.Builder(this);

        buscarClienteActivity = this;

        spnTipoDococumento = (Spinner) findViewById(R.id.spnTipoDoc);
        txtNumeroDocumento = (EditText) findViewById(R.id.txtNumeroDoc);
//        tvNumeroDoc = (TextView) findViewById(R.id.tvNumeroDoc);

        txtNumeroDocumento.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});

        List<String> listaTipoDoc = new ArrayList<>();
        listaTipoDoc.add("DNI");
        listaTipoDoc.add("RUC");
        ArrayAdapter arrayTipoDoc = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, listaTipoDoc);
        arrayTipoDoc.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spnTipoDococumento.setAdapter(arrayTipoDoc);

        spnTipoDococumento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tipoDoc = (String) parent.getItemAtPosition(position);
                if (tipoDoc.equals("DNI")) {
                    txtNumeroDocumento.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
                } else {
                    txtNumeroDocumento.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onClickBuscarCliente(View v) {
        tipoDocumento = spnTipoDococumento.getSelectedItem().toString();
        numeroDocumento = txtNumeroDocumento.getText().toString();

        if (tipoDocumento.equals("DNI") && numeroDocumento.length() != 8) {
            ad.setTitle("VALIDACIÓN");
            ad.setMessage("El número de DNI debe ser 8 dígitos.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        } else if (tipoDocumento.equals("RUC") && numeroDocumento.length() != 11) {
            ad.setTitle("VALIDACIÓN");
            ad.setMessage("El número de RUC debe ser 11 dígitos.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        }

        new HttpRequestTaskBuscarCliente().execute();
    }

    public void onClickRegresar(View v) {
        finish();
    }

    private class HttpRequestTaskBuscarCliente extends AsyncTask<Void, Void, Cliente> {
        @Override
        protected Cliente doInBackground(Void... params) {
            try {
                String URL = Util.URL_WEB_SERVICE_V2 + "/cliente/buscar";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
                        .queryParam("tipoDocumento", tipoDocumento)
                        .queryParam("numeroDocumento", numeroDocumento);

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

//                Cliente cliente = restTemplate.getForObject(builder.build().encode().toUri(), Cliente.class);
//                Log.i("Cliente", cliente.toString());

                Cliente cliente = new Cliente();
                cliente.setRUC(numeroDocumento);

                return cliente;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Cliente cliente) {
            //TEST
            if (numeroDocumento.equals("00000000")) cliente = null;
            if (null != cliente) {
                Util.CLIENTE_SESSION = cliente;
                ad.setTitle("MENSAJE");
                ad.setMessage("Cliente encontrado: " + cliente);
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        buscarClienteActivity.finish();
                    }
                });
                ad.show();
            } else {
//                Util.CLIENTE_SESSION = new Cliente();
                ad.setTitle("MENSAJE");
                ad.setMessage("Cliente no encontrado, ¿Desea registrar al Cliente?");
                ad.setPositiveButton("SI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
            }
        }

    }

}
