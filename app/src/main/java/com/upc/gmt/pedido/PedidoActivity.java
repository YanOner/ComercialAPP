package com.upc.gmt.pedido;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.upc.gmt.bean.Producto;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.util.Util;

import static com.upc.gmt.util.Util.LISTA_PRODUCTOS_PEDIDO;

public class PedidoActivity extends AppCompatActivity {

    ListView lvPedidos;
    TextView tvTotalPedido;

    PedidoArrayAdapter pedidoArrayAdapter;

    Integer posicionItemPedido;

    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        ad = new AlertDialog.Builder(this);

        if (Util.CLIENTE_SESSION != null) {
            setTitle("VER PEDIDO (" + Util.CLIENTE_SESSION.getNombres() + " - " + Util.CLIENTE_SESSION.getNrodocumentocli() + ")");
        }

        lvPedidos = (ListView) findViewById(R.id.lvPedidos);
        Log.i("LISTA_PRODUCTOS_PEDIDO", "" + Util.LISTA_PRODUCTOS_PEDIDO.size());
        for (Producto p : Util.LISTA_PRODUCTOS_PEDIDO) {
            p.setChecked(false);
        }
        pedidoArrayAdapter = new PedidoArrayAdapter(this, Util.LISTA_PRODUCTOS_PEDIDO);
        lvPedidos.setAdapter(pedidoArrayAdapter);

//        lvPedidos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if(view.getId() == R.id.chbArticulo){
//                    Log.i("getId", ""+view.getId());
//                }
//            }
//        });

        tvTotalPedido = (TextView) findViewById(R.id.tvTotalPedido);

        tvTotalPedido.setText("PRECIO TOTAL DE CALZADOS: S/ 0.00");
        Util.PRECIO_TOTAL_CALZADOS = 0.00;

    }

    public void onClickComprar(View v) {
        if (LISTA_PRODUCTOS_PEDIDO.size() == 0) {
//            Toast.makeText(getApplicationContext(), "NO HAY CALZADOS EN EL PEDIDO", Toast.LENGTH_SHORT).show();
            ad.setTitle("MENSAJE");
            ad.setMessage("NO HAY CALZADOS EN EL PEDIDO.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        }
        boolean validado = true;
//        double totalPrecio = 0.00;

        for (int i = 0; i < Util.LISTA_PRODUCTOS_PEDIDO.size(); i++) {
            Producto p = Util.LISTA_PRODUCTOS_PEDIDO.get(i);
            if (!p.isChecked()) {
                validado = false;
                break;
            }
//            EditText txtCantidadPedido = (EditText) viewPedido.findViewById(R.id.txtCantidadPedido);
//            Producto p = Util.LISTA_PRODUCTOS_PEDIDO.get(i);
//            p.setCantidad(Integer.parseInt(txtCantidadPedido.getText().toString()));
        }

        if (!validado) {
//            Toast.makeText(getApplicationContext(), "POR FAVOR, CONFIRMAR TODOS LOS CALZADOS", Toast.LENGTH_SHORT).show();
            ad.setTitle("MENSAJE");
            ad.setMessage("POR FAVOR, CONFIRMAR TODOS LOS CALZADOS.");
            ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            ad.show();
            return;
        }

        Intent i = new Intent(this, RegistrarPedidoActivity.class);
        startActivity(i);
    }

    public void onQuitarPedido(View v) {
        posicionItemPedido = (Integer) v.getTag();
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setTitle("CONFIRMACIÓN");
        ad.setMessage("¿DESEA REMOVER EL CALZADO DEL PEDIDO?");
        ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                eliminarPedidoItem();
            }
        });
        ad.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        ad.show();
    }

    private void eliminarPedidoItem() {
        if (posicionItemPedido != null) {
            Producto pr = LISTA_PRODUCTOS_PEDIDO.get(posicionItemPedido);
            pedidoArrayAdapter.remove(pr);
            pedidoArrayAdapter.notifyDataSetChanged();
            LISTA_PRODUCTOS_PEDIDO.remove(posicionItemPedido);

            double totalDescuento = 0.00;
            double totalPrecio = 0.00;
            for (Producto p : Util.LISTA_PRODUCTOS_PEDIDO) {
                if (p.isChecked()) {
                    double aplicarDescuento = 1;
                    double tasaDescuento = 1;
                    if (p.getDescuentomaximo().doubleValue() > 0 && p.getDescuentoSeleccionado() != 0) {
                        tasaDescuento = p.getDescuentoSeleccionado() / 100.00;
                        aplicarDescuento = 1 - tasaDescuento;
                    }
                    totalDescuento += (p.getCantidad() * p.getPreciounitario().doubleValue()) * tasaDescuento;
                    totalPrecio += (p.getCantidad() * p.getPreciounitario().doubleValue()) * aplicarDescuento;
                }
            }

            TextView vTotalPedidoDescuento = (TextView) findViewById(R.id.tvTotalPedidoDescuento);
            vTotalPedidoDescuento.setText("TOTAL DESCUENTO APLICADO: S/ " + Util.formatearDecimales(totalDescuento));
            Util.PRECIO_TOTAL_DESCUENTO = totalDescuento;


            TextView vTotalPedido = (TextView) findViewById(R.id.tvTotalPedido);
            vTotalPedido.setText("PRECIO TOTAL DE CALZADOS: S/ " + Util.formatearDecimales(totalPrecio));
            Util.PRECIO_TOTAL_CALZADOS = totalPrecio;

        }
    }
}