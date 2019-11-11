package com.upc.gmt.comercialgb;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.upc.gmt.bean.Empleado;
import com.upc.gmt.util.Util;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtPassword;
    EditText txtIP;

    String usuario;
    String password;

    AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        alertDialog = new AlertDialog.Builder(this);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtIP = (EditText) findViewById(R.id.txtIP);

        txtIP.setText(Util.URL_WEB_SERVICE);

        txtIP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.i("beforeTextChanged", s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.i("onTextChanged", s.toString());
                Util.URL_WEB_SERVICE = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i("afterTextChanged", s.toString());
            }
        });

    }

    public void onValidarIngreso(View v) {
        usuario = txtUsuario.getText().toString();
        password = txtPassword.getText().toString();
        new HttpRequestTaskLogin().execute();
        //Intent i = new Intent(getApplicationContext(),com.upc.gmt.comercialgb.MenuPrincipalActivity.class);
        //startActivity(i);
    }

    public void onRecuperClave(View v) {
        Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.RecuperarClaveActivity.class);
        startActivity(i);
    }

    public void onRegistrar(View v) {
        Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.AgregarUsuarioActivity.class);
        startActivity(i);
    }


    private class HttpRequestTaskLogin extends AsyncTask<Void, Void, Empleado> {
        @Override
        protected Empleado doInBackground(Void... params) {
            try {
                String URL = Util.URL_SERVICE_BASE + "/empleado/login/" + usuario + "/" + password;
//                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
//                        .queryParam("codUsuario", usuario)
//                        .queryParam("password", password);

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Log.i("Login URL", URL);
//                Usuario usuario = restTemplate.getForObject(builder.build().encode().toUri(), Usuario.class);
                ResponseEntity<Empleado> response = restTemplate.getForEntity(URL, Empleado.class);
                Empleado usuario = response.getBody();
                Log.i("Usuario", usuario.toString());
                Util.COOKIES_SESSION = response.getHeaders().get("Set-Cookie");
                return usuario;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Empleado empleado) {
            //TEST
//            empleado = new Usuario();
//            empleado.setCodUsuario("00000");
            if (null != empleado) {
                Util.EMPLEADO_SESSION = empleado;
                Toast.makeText(LoginActivity.this,
                        "BIENVENIDO " + empleado.getNombre().toUpperCase()
                        , Toast.LENGTH_SHORT).show();
//                new HttpRequestTaskCliente().execute();
//                if (Util.REGRESAR_A_CATALOGO) {
//                    finish();
//                } else {
                    Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.MenuPrincipalActivity.class);
                    startActivity(i);
//                }
            } else {
//                Util.EMPLEADO_SESSION = new Usuario();
//                Util.EMPLEADO_SESSION.setIdTipoUsuario(1);
//                Toast.makeText(LoginActivity.this,
//                        "CREDENCIALES INCORRECTAS"
//                        , Toast.LENGTH_LONG).show();

                alertDialog.setTitle("MENSAJE");
                alertDialog.setMessage("CREDENCIALES INCORRECTAS");
                alertDialog.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alertDialog.show();
            }

        }

    }
/*
    private class HttpRequestTaskCliente extends AsyncTask<Void, Void, Cliente> {
        @Override
        protected Cliente doInBackground(Void... params) {
            try {
                String URL = Util.URL_WEB_SERVICE + "/cliente";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//                        .queryParam("idCliente", Util.EMPLEADO_SESSION.getIdCliente());

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                Cliente cliente = restTemplate.getForObject(builder.build().encode().toUri(), Cliente.class);
                if(cliente != null)
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
            } else {
//                Util.CLIENTE_SESSION = new Cliente();
            }

        }

    }
*/
}


