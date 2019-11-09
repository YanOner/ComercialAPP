package com.upc.gmt.comercialgb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.upc.gmt.catalogo.CatalogoActivity;
import com.upc.gmt.util.Util;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onLogin(View v) {
        Util.REGRESAR_A_CATALOGO = false;
        Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.LoginActivity.class);
        startActivity(i);
    }

    public void onAbrirCatalogo(View v) {
//        Util.EMPLEADO_SESSION = new Usuario();
//        Util.EMPLEADO_SESSION.setIdTipoUsuario(1);
        Intent i = new Intent(getApplicationContext(), CatalogoActivity.class);
        startActivity(i);
    }
}

