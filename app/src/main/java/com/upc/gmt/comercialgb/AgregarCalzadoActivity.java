package com.upc.gmt.comercialgb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AgregarCalzadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_calzado);

        List<String> listaTipoCalzado = new ArrayList<>();
        listaTipoCalzado.add("");
        listaTipoCalzado.add("BOTAS");
        listaTipoCalzado.add("BOTINES");
        listaTipoCalzado.add("SANDALIAS");
        ArrayAdapter<String> arrayTipoCalzado = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, listaTipoCalzado);
        Spinner spnTipoCalzado = (Spinner) findViewById(R.id.spnCatalogoTC);
        spnTipoCalzado.setAdapter(arrayTipoCalzado);

        List<String> listaTallaCalzado = new ArrayList<>();
        listaTallaCalzado.add("");
        listaTallaCalzado.add("36");
        listaTallaCalzado.add("37");
        listaTallaCalzado.add("38");
        listaTallaCalzado.add("39");
        listaTallaCalzado.add("40");
        listaTallaCalzado.add("41");
        ArrayAdapter<String> arrayTallaCalzado = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, listaTallaCalzado);
        Spinner spnTallaCalzado = (Spinner) findViewById(R.id.spnCatalogoTaC);
        spnTallaCalzado.setAdapter(arrayTallaCalzado);

        List<String> listaTacoCalzado = new ArrayList<>();
        listaTacoCalzado.add("");
        listaTacoCalzado.add("CHINO");
        listaTacoCalzado.add("PLATAFORMA");
        listaTacoCalzado.add("CUADRADO");
        listaTacoCalzado.add("FINO");
        listaTacoCalzado.add("TAPITA");
        ArrayAdapter<String> arrayTacoCalzado = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, listaTacoCalzado);
        Spinner spnTacoCalzado = (Spinner) findViewById(R.id.spnCatalogoTacoC);
        spnTacoCalzado.setAdapter(arrayTacoCalzado);
    }

}
