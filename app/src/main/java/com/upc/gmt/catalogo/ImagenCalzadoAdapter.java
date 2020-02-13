package com.upc.gmt.catalogo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.upc.gmt.comercialgb.R;
import com.upc.gmt.model.ProductoBean;

import java.util.List;

/**
 * Created by MALEX on 31/08/2017.
 */

public class ImagenCalzadoAdapter extends BaseAdapter {

    private Context context;
    private List<ProductoBean> lista;

    public ImagenCalzadoAdapter(Context context, List<ProductoBean> lista) {
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        View gridView;


        if (convertView == null) {

            gridView = new View(context);

            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.calzado, null);

            ProductoBean p = lista.get(position);

            // set value into textview
            TextView tvNombre = (TextView) gridView.findViewById(R.id.grid_item_label_nombre);
            tvNombre.setText(p.getNombre());

            TextView tvCodigo = (TextView) gridView.findViewById(R.id.grid_item_label_codigo);
            tvCodigo.setText(p.getCodigo());

            TextView tvPrecio = (TextView) gridView.findViewById(R.id.grid_item_label_precio);
            tvPrecio.setText(p.getPrecio());

            // set image based on selected text
            ImageView imageView = (ImageView) gridView.findViewById(R.id.grid_item_image);

//            String calzado = "rojo";
//            if (calzado.equals("rojo")) {
//                imageView.setImageResource(R.mipmap.calzado_rojo);
//            } else if (calzado.equals("amarillo")) {
//                imageView.setImageResource(R.mipmap.calzado_amarillo);
//            } else if (calzado.equals("verde")) {
//                imageView.setImageResource(R.mipmap.calzado_verde);
//            } else {
//                imageView.setImageResource(R.mipmap.calzado_rojo);
//            }
//            Picasso picasso = Picasso.with(context);
//            picasso.setIndicatorsEnabled(true);
//            picasso.setLoggingEnabled(true);
            try {
//                Picasso.with(context).load(Util.URL_SERVICE_BASE+"/imagen/ver?nombre="+p.get+"_"+p.getIdColor()+"_1.jpg").resize(100, 100).into(imageView);
            } catch (Exception e) {
                e.printStackTrace();
//                Log.e("ERROR", e.getMessage());
            }

        } else {
            gridView = convertView;
        }

        return gridView;
    }
}
