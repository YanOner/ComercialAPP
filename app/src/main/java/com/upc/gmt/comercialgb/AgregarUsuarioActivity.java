package com.upc.gmt.comercialgb;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class AgregarUsuarioActivity extends AppCompatActivity {

    private int año;
    private int mes;
    private int dia;

    private EditText txtFechaNacimiento;
    private int TIPO_DIALOGO = 0;
    private DatePickerDialog.OnDateSetListener onSelectorFecha;

    Spinner spnTipoDoc;
    LinearLayout lyDNI;
    LinearLayout lyRS;
    LinearLayout lyRUC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_usuario);

        txtFechaNacimiento = (EditText) findViewById(R.id.txtFechaNacimiento);
        Calendar calendario = Calendar.getInstance();
        año = calendario.get(Calendar.YEAR);
        mes = calendario.get(Calendar.MONTH);
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mostrarFecha();

        onSelectorFecha = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                año = year;
                mes = month;
                dia = dayOfMonth;
                mostrarFecha();
            }
        };


        lyDNI = (LinearLayout) findViewById(R.id.lyDNI);
        lyRS = (LinearLayout) findViewById(R.id.lyRS);
        lyRUC = (LinearLayout) findViewById(R.id.lyRUC);

        spnTipoDoc = (Spinner) findViewById(R.id.spnTipoDoc);
        List<String> listaTipoDoc = new ArrayList<>();
        listaTipoDoc.add("DNI");
        listaTipoDoc.add("RUC");
        spnTipoDoc.setAdapter(new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, listaTipoDoc));
        spnTipoDoc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tipoDoc = (String) parent.getItemAtPosition(position);
                if (tipoDoc.equals("DNI")) {
                    lyDNI.setVisibility(View.VISIBLE);
                    lyRS.setVisibility(View.GONE);
                    lyRUC.setVisibility(View.GONE);
                } else {
                    lyDNI.setVisibility(View.GONE);
                    lyRS.setVisibility(View.VISIBLE);
                    lyRUC.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void mostrarFecha() {
        txtFechaNacimiento.setText(año + "-" + mes + "-" + dia);
    }


}
