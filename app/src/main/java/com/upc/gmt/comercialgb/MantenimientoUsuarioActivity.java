package com.upc.gmt.comercialgb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MantenimientoUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantenimiento_usuario);
    }

    protected void onMantenimientoAgregarUsuario(View v) {
        Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.AgregarUsuarioActivity.class);
        startActivity(i);
    }

    /*protected void onMantenimientoModificarUsuario(View v) {
        Intent i = new Intent(getApplicationContext(),com.upc.gmt.comercialgb.ModificarUsuarioActivity.class);
        startActivity(i);
    }

    protected void onMantenimientoEliminarUsuario(View v) {
        Intent i = new Intent(getApplicationContext(),com.upc.gmt.comercialgb.ModificarEliminarActivity.class);
        startActivity(i);
    }*/
}
