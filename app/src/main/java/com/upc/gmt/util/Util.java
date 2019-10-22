package com.upc.gmt.util;

import android.view.View;
import android.widget.ListView;

import com.upc.gmt.model.Cliente;
import com.upc.gmt.model.Producto;
import com.upc.gmt.model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MALEX on 14/09/2017.
 */

public class Util {

    //public static String URL_WEB_SERVICE = "http://192.168.43.172:8080/ComercialWEB";
    public static String URL_WEB_SERVICE = "http://192.168.19.17:8080/ComercialWEB";
//        public static String URL_WEB_SERVICE = "http://10.230.168.210:9090/ComercialWEB";

    public static Usuario USUARIO_SESSION;

    public static Cliente CLIENTE_SESSION;

    public static List<Producto> LISTA_PRODUCTOS_PEDIDO = new ArrayList<>();

    public static double PRECIO_TOTAL_CALZADOS = 0.00;

    public static double PRECIO_COSTO_ENVIO = 0.00;

    public static double PRECIO_TOTAL_PAGAR = 0.00;

    public static boolean REGRESAR_A_CATALOGO = false;

    public static List<String> COOKIES_SESSION;

    public static View getViewByPosition(int pos, ListView listView) {
        final int firstListItemPosition = listView.getFirstVisiblePosition();
        final int lastListItemPosition = firstListItemPosition + listView.getChildCount() - 1;

        if (pos < firstListItemPosition || pos > lastListItemPosition) {
            return listView.getAdapter().getView(pos, null, listView);
        } else {
            final int childIndex = pos - firstListItemPosition;
            return listView.getChildAt(childIndex);
        }
    }
}
