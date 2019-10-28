package com.upc.gmt.pedido;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.model.Producto;
import com.upc.gmt.util.Util;

import java.util.List;

import static com.upc.gmt.comercialgb.R.layout.calzado;

/**
 * Created by MALEX on 31/08/2017.
 */

public class PedidoArrayAdapter extends ArrayAdapter {

    private Context context;
    private List<Producto> lista;
    private LayoutInflater inflater;

    public PedidoArrayAdapter(Context context, List<Producto> lista) {
        super(context, calzado, lista);
        this.context = context;
        this.lista = lista;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.pedido, parent, false);
        }

        convertView.setTag(position);

        ImageView btnQuitar = (ImageView) convertView.findViewById(R.id.btnQuitar);
        btnQuitar.setTag(position);

        CheckBox chbArticulo = (CheckBox) convertView.findViewById(R.id.chbArticulo);
        chbArticulo.setTag(position);

        chbArticulo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                double totalPrecio = 0.00;
                ListView lvPedidos = (ListView) buttonView.getRootView().findViewById(R.id.lvPedidos);
                int posicion = (int) buttonView.getTag();
                Log.d("posicion", "" + posicion);
                Producto pp = Util.LISTA_PRODUCTOS_PEDIDO.get(posicion);
                pp.setChecked(isChecked);
//                    Util.LISTA_PRODUCTOS_PEDIDO.set(posicion, pp);
//                    ListView lvPedidos = PedidoActivity.lvPedidos;
                for (int i = 0; i < lvPedidos.getCount(); i++) {
//                        Log.i("OnCheckedChangeListener", "i: " + i);

                    View viewPedido = Util.getViewByPosition(i, lvPedidos);

//                        lvPedidos.setItemChecked(i, true);
//                        View viewPedido = lvPedidos.getAdapter().getView(0, null, lvPedidos);

//                        View viewPedido = lvPedidos.getChildAt(i); // USAR SELECTITEM
//                        Log.i("viewPedido", "position: " + viewPedido.getTag());
                    EditText txtCantidadPedido = (EditText) viewPedido.findViewById(R.id.txtCantidadPedido);
                    CheckBox chbArticulo = (CheckBox) viewPedido.findViewById(R.id.chbArticulo);
                    Producto p = Util.LISTA_PRODUCTOS_PEDIDO.get(i);
                    if (p.isChecked()) {
                        if (txtCantidadPedido.getText().toString().equals("")) {
                            Toast.makeText(getContext().getApplicationContext(), "CANTIDAD NO PERMITIDA", Toast.LENGTH_LONG).show();
                            chbArticulo.setChecked(false);
                            return;
                        }
                        int cantidad = Integer.parseInt(txtCantidadPedido.getText().toString());
                        if (cantidad < 1) {
                            Toast.makeText(getContext().getApplicationContext(), "CANTIDAD NO PERMITIDA", Toast.LENGTH_LONG).show();
                            chbArticulo.setChecked(false);
                            return;
                        }
//                        if (Util.USUARIO_SESSION.getIdTipoUsuario() != 2 && cantidad > 3) {
//                            Toast.makeText(getContext().getApplicationContext(), "SOLO PUEDE COMPRAR HASTA 3 PARES DEL MISMO CALZADO", Toast.LENGTH_LONG).show();
//                            chbArticulo.setChecked(false);
//                            return;
//                        }
                        if (p.getStockVenta().intValue() < cantidad) {
                            Toast.makeText(getContext().getApplicationContext(), "LA CANTIDAD INGRESADA SUPERA EL STOCK DISPONIBLE (" + p.getStockVenta().intValue() + ")", Toast.LENGTH_LONG).show();
                            chbArticulo.setChecked(false);
                            return;
                        }
                        p.setCantidad(cantidad);
                        Util.LISTA_PRODUCTOS_PEDIDO.set(i, p);
                        txtCantidadPedido.setEnabled(false);
                        TextView tvTotalArticulo = (TextView) viewPedido.findViewById(R.id.tvTotalArticulo);
//                        if (Util.USUARIO_SESSION.getIdTipoUsuario() == 2) {
                            double subTotal = (p.getCantidad() * p.getPrecioVendedor().doubleValue());
                        tvTotalArticulo.setText("SubTotal del Calzado: S/ " + Util.formatearDecimales(subTotal));
                            totalPrecio += (p.getCantidad() * p.getPrecioVendedor().doubleValue());
//                        } else {
//                            double subTotal = (p.getCantidad() * p.getPrecioUnitario().doubleValue());
//                            tvTotalArticulo.setText("SubTotal del Calzado: S/ " + Util.formatearDecimales(subTotal));
//                            totalPrecio += (p.getCantidad() * p.getPrecioUnitario().doubleValue());
//                        }
                    } else {
                        txtCantidadPedido.setEnabled(true);
                    }
                }
                TextView vTotalPedido = (TextView) buttonView.getRootView().findViewById(R.id.tvTotalPedido);
                vTotalPedido.setText("PRECIO TOTAL DE CALZADOS: S/ " + Util.formatearDecimales(totalPrecio));
                Util.PRECIO_TOTAL_CALZADOS = totalPrecio;
            }
        });

        Producto p = lista.get(position);

//            chbArticulo.setChecked(p.isChecked());

//            Log.i("Producto "+position, p.toString());

        EditText txtCantidadPedido = (EditText) convertView.findViewById(R.id.txtCantidadPedido);
        if (p.getCantidad() > 0)
            txtCantidadPedido.setText("" + p.getCantidad());

        TextView tvNombre = (TextView) convertView.findViewById(R.id.grid_pedido_label_nombre);
        tvNombre.setText("Nombre: " + p.getDescripcion());

        TextView tvCodigo = (TextView) convertView.findViewById(R.id.grid_pedido_label_codigo);
        tvCodigo.setText("Codigo: " + p.getSKU());

        TextView tvColor = (TextView) convertView.findViewById(R.id.grid_pedido_label_color);
        tvColor.setText("Color: " + p.getColor());

        TextView tvTalla = (TextView) convertView.findViewById(R.id.grid_pedido_label_talla);
        tvTalla.setText("Talla: " + p.getNroTalla().toString());

        TextView tvStock = (TextView) convertView.findViewById(R.id.grid_pedido_label_stock);
        tvStock.setText("Stock: " + p.getStockVenta());

        TextView tvPrecio = (TextView) convertView.findViewById(R.id.grid_pedido_label_precio);
        TextView tvTotalArticulo = (TextView) convertView.findViewById(R.id.tvTotalArticulo);

//        if (Util.USUARIO_SESSION.getIdTipoUsuario() == 2) {
        tvPrecio.setText("Precio: " + p.getPrecioVendedor());
            tvTotalArticulo.setText("SubTotal del Calzado: S/ " + p.getCantidad() * p.getPrecioVendedor().doubleValue());
//        } else {
//            tvPrecio.setText("Precio: " + p.getPrecioUnitario());
//            tvTotalArticulo.setText("SubTotal del Calzado: S/ " + p.getCantidad() * p.getPrecioUnitario().doubleValue());
//        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.grid_pedido_image);

//            Picasso picasso = Picasso.with(context);
//            picasso.setIndicatorsEnabled(true);
//            picasso.setLoggingEnabled(true);
        try {
//                Log.d("PedidoArrayAdapter", p.getSKU()+"_"+p.getIdColor()+"_1.jpg");
//                Picasso.with(context).load(Util.URL_WEB_SERVICE+"/verImagen?nombre="+p.getSKU()+"_"+p.getIdColor()+"_1.jpg").resize(100, 100).into(imageView);
            int id = context.getResources().getIdentifier(p.getSKU().toLowerCase() + "_" + p.getIdColor() + "_1", "mipmap", context.getPackageName());
            Picasso.with(context).load(id).resize(150, 150).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("PedidoArrayAdapter", e.getMessage());
        }

        return convertView;
    }

    //https://stackoverflow.com/questions/39912827/random-checkbox-getting-checked-when-scrolling-down-the-list-view?rq=1
    @Override
    public int getViewTypeCount() {
        if (getCount() < 1) {
            return 1;
        } else {
            return getCount();
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
//http://android.amberfog.com/?p=296
//http://www.vogella.com/tutorials/AndroidListView/article.html
//http://android.amberfog.com/?p=296