package com.upc.gmt.catalogo;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.upc.gmt.bean.Producto;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.util.Util;

import java.util.List;

import static com.upc.gmt.comercialgb.R.layout.calzado;

/**
 * Created by MALEX on 31/08/2017.
 */

public class ImagenCalzadoArrayAdapter extends ArrayAdapter {

    private Context context;
    private List<Producto> lista;
    private LayoutInflater inflater;

    public ImagenCalzadoArrayAdapter(Context context, List<Producto> lista) {
        super(context, calzado, lista);
        this.context = context;
        this.lista = lista;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

//        View gridView;

        if (convertView == null) {
            convertView = inflater.inflate(calzado, parent, false);
        }
//            gridView = new View(context);

        // get layout from mobile.xml
//            gridView = inflater.inflate(R.layout.calzado, null);

        Producto p = lista.get(position);

        // set value into textview
        TextView tvNombre = (TextView) convertView.findViewById(R.id.grid_item_label_nombre);
        tvNombre.setText(p.getDescripcion());

        TextView tvCodigo = (TextView) convertView.findViewById(R.id.grid_item_label_codigo);
        tvCodigo.setText("Talla: " + p.getNroTalla());

        TextView tvPrecio = (TextView) convertView.findViewById(R.id.grid_item_label_precio);
//        int tipoUsuario = Util.EMPLEADO_SESSION.getIdTipoUsuario();
//        if (tipoUsuario == 2) {//Revendedor
//            tvPrecio.setText("S/ " + p.getPrecioVendedor().doubleValue());
//        } else {
        tvPrecio.setText("S/ " + Util.formatearDecimales(p.getPreciounitario().doubleValue()));
//        }

        // set image based on selected text
        ImageView imageView = (ImageView) convertView.findViewById(R.id.grid_item_image);

//            Double random = Math.random()*15;
//            if (random.intValue() > 9) {
//                imageView.setImageResource(R.mipmap.calzado_rojo);
//            } else if (random.intValue() > 4) {
//                imageView.setImageResource(R.mipmap.calzado_amarillo);
//            } else {
//                imageView.setImageResource(R.mipmap.calzado_verde);
//            }

//            Picasso picasso = Picasso.with(context);
//            picasso.setIndicatorsEnabled(true);
//            picasso.setLoggingEnabled(true);
        try {
            Log.i("DEBUG", p.getSku() + "_" + p.getIdColor() + "_1.jpg");
//                Picasso.with(context).load(Util.URL_WEB_SERVICE+"/verImagen?nombre="+p.getSKU()+"_"+p.getIdColor()+"_1.jpg").into(imageView);
//            int id = context.getResources().getIdentifier(p.getSku().toLowerCase() + "_" + p.getIdColor() + "_1", "mipmap", context.getPackageName());
            int id = context.getResources().getIdentifier("acm19421_5_1", "mipmap", context.getPackageName());
            Picasso.with(context).load(id).resize(150, 150).centerCrop().into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("ERROR", e.getMessage());
        }

        return convertView;
    }
}
