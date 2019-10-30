package com.upc.gmt.comercialgb;

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

import com.upc.gmt.model.Cliente;
import com.upc.gmt.model.Usuario;
import com.upc.gmt.util.Util;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class LoginActivity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtPassword;
    EditText txtIP;

    String usuario;
    String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        txtIP = (EditText) findViewById(R.id.txtIP);

        txtIP.setText(Util.URL_WEB_SERVICE);

        txtIP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("beforeTextChanged", s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("onTextChanged", s.toString());
                Util.URL_WEB_SERVICE = s.toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("afterTextChanged", s.toString());
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


    private class HttpRequestTaskLogin extends AsyncTask<Void, Void, Usuario> {
        @Override
        protected Usuario doInBackground(Void... params) {
            try {
                String URL = Util.URL_WEB_SERVICE + "/login";
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
                        .queryParam("codUsuario", usuario)
                        .queryParam("password", password);

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                Log.i("Login URL", builder.build().encode().toUri().toString());
//                Usuario usuario = restTemplate.getForObject(builder.build().encode().toUri(), Usuario.class);
                ResponseEntity<Usuario> response = restTemplate.getForEntity(builder.build().encode().toUri(), Usuario.class);
                Usuario usuario = response.getBody();
                Log.i("Usuario", usuario.toString());
                Util.COOKIES_SESSION = response.getHeaders().get("Set-Cookie");
                return usuario;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Usuario usuario) {
            //TEST
//            usuario = new Usuario();
//            usuario.setCodUsuario("00000");
            if (null != usuario) {
                Util.USUARIO_SESSION = usuario;
                Toast.makeText(LoginActivity.this,
                        "BIENVENIDO " + usuario.getCodUsuario()
                        , Toast.LENGTH_SHORT).show();
                new HttpRequestTaskCliente().execute();
                if (Util.REGRESAR_A_CATALOGO) {
                    finish();
                } else {
                    Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.MenuPrincipalActivity.class);
                    startActivity(i);
                }
            } else {
                Util.USUARIO_SESSION = new Usuario();
                Util.USUARIO_SESSION.setIdTipoUsuario(1);
                Toast.makeText(LoginActivity.this,
                        "CREDENCIALES INCORRECTAS"
                        , Toast.LENGTH_LONG).show();
            }

        }

    }

    private class HttpRequestTaskCliente extends AsyncTask<Void, Void, Cliente> {
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
            } else {
//                Util.CLIENTE_SESSION = new Cliente();
            }

        }

    }
}


