package com.upc.gmt.comercialgb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MantenimientoCalzadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mantenimiento_calzado);
    }

    public void onMantenimientoAgregarCalzado(View v) {
        Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.AgregarCalzadoActivity.class);

        startActivity(i);
    }

    public void onMantenimientoEliminarCalzado(View v) {
        Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.EliminarCalzadoActivity.class);

        startActivity(i);
    }

    public void onMantenimientoModificarCalzado(View v) {
        Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.ModificarCalzadoActivity.class);

        startActivity(i);
    }
}
