package com.upc.gmt.util;

import android.view.View;
import android.widget.ListView;

import com.upc.gmt.bean.Empleado;
import com.upc.gmt.bean.Producto;
import com.upc.gmt.model.Cliente;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/**
 * Created by MALEX on 14/09/2017.
 */

public class Util {

    //    public static String URL_WEB_SERVICE = "http://192.168.43.191:8080/ComercialWEB";//CELL
//    public static String URL_WEB_SERVICE = "http://192.168.1.156:8080/ComercialWEB";//ROUTER
//      public static String URL_WEB_SERVICE = "http://192.168.137.1:8080/ComercialWEB";//LAPTOP
    public static String URL_WEB_SERVICE = "http://10.0.2.2:8080/ComercialWEB";//EMULADOR
//    public static String URL_WEB_SERVICE = "http://190.187.111.150:8080/ComercialWEB";//CONECTIFY


    public static String URL_SERVICE_BASE = "http://10.0.2.2:9090";

    public static String URL_SERVICE_CATALOGO = "";//catalogo

    public static String URL_SERVICE_PEDIDO = "";//catalogo

    public static Empleado EMPLEADO_SESSION;

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

    public static String formatearDecimales(Double numero) {
//        return (new DecimalFormat("#,##0.00")).format(numero.doubleValue());
//        return String.format("%,.2f", numero.doubleValue());
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%(,.2f", numero);
        return sb.toString();
    }

}
