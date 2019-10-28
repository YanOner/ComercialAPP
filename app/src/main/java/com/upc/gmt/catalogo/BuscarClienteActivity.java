package com.upc.gmt.catalogo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.upc.gmt.comercialgb.R;

import java.util.ArrayList;
import java.util.List;

public class BuscarClienteActivity extends AppCompatActivity {

    Spinner spnTipoDoc;
    EditText txtNumeroDoc;
//    TextView tvNumeroDoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_cliente);
        setTitle("BUSCAR CLIENTE");

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        spnTipoDoc = (Spinner) findViewById(R.id.spnTipoDoc);
        txtNumeroDoc = (EditText) findViewById(R.id.txtNumeroDoc);
//        tvNumeroDoc = (TextView) findViewById(R.id.tvNumeroDoc);

        txtNumeroDoc.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});

        List<String> listaTipoDoc = new ArrayList<>();
        listaTipoDoc.add("DNI");
        listaTipoDoc.add("RUC");
        ArrayAdapter arrayTipoDoc = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, listaTipoDoc);
        arrayTipoDoc.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spnTipoDoc.setAdapter(arrayTipoDoc);

        spnTipoDoc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tipoDoc = (String) parent.getItemAtPosition(position);
                if (tipoDoc.equals("DNI")) {
                    txtNumeroDoc.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
                } else {
                    txtNumeroDoc.setFilters(new InputFilter[]{new InputFilter.LengthFilter(11)});
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
