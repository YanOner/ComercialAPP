package com.upc.gmt.comercialgb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.upc.gmt.catalogo.CatalogoActivity;
import com.upc.gmt.util.Util;

import java.util.ArrayList;

public class MenuPrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Button btnSolicitarAumento = (Button) findViewById(R.id.btnSolicitarAumento);

//        if (Util.EMPLEADO_SESSION.getIdTipoUsuario() == 2) {//REVENDEDOR
            btnSolicitarAumento.setVisibility(View.VISIBLE);
//        } else {
//            btnSolicitarAumento.setVisibility(View.INVISIBLE);
//        }

        setTitle("MENÚ PRINCIPAL (" + Util.EMPLEADO_SESSION.getCorreoelectronico().toUpperCase() + ")");

        Util.CLIENTE_SESSION = null;
        Util.LISTA_PRODUCTOS_PEDIDO = new ArrayList<>();
        Util.PRECIO_TOTAL_DESCUENTO = 0.00;
        Util.PRECIO_TOTAL_CALZADOS = 0.00;
        Util.PRECIO_COSTO_ENVIO = 0.00;
        Util.PRECIO_TOTAL_PAGAR = 0.00;

    }

//    public void onIngresarMantenimientoCalzado(View v){
//        Intent i = new Intent(getApplicationContext(),com.upc.gmt.comercialgb.MantenimientoCalzadoActivity.class);
//        startActivity(i);
//    }

//    public void onIngresarRegistroPedido(View v) {
//        Intent i = new Intent(getApplicationContext(),RegistrarPedidoActivity.class);
//        startActivity(i);
//    }

    public void onAbrirCatalogo(View v) {
        Intent i = new Intent(getApplicationContext(), CatalogoActivity.class);
        startActivity(i);
    }

//    public void onMantenimientoUsuario(View v) {
//        Intent i = new Intent(getApplicationContext(),com.upc.gmt.comercialgb.MantenimientoUsuarioActivity.class);
//        startActivity(i);
//    }

    public void onAumentoLinea(View v) {
        Intent i = new Intent(getApplicationContext(), SolicitarAumentoActivity.class);
        startActivity(i);
    }
}
