package com.upc.gmt.catalogo;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.upc.gmt.bean.Colorproducto;
import com.upc.gmt.bean.Producto;
import com.upc.gmt.bean.Talla;
import com.upc.gmt.bean.Temporada;
import com.upc.gmt.bean.Tipoproducto;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.model.Material;
import com.upc.gmt.pedido.PedidoActivity;
import com.upc.gmt.util.Util;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

public class CatalogoActivity extends AppCompatActivity {

    Spinner spnTallaCalzado;
    Spinner spnColor;
    //    Spinner spnMaterial;
    Spinner spnTipoCalzado;
    Spinner spnTemporada;
    Spinner spnPrecioCalzado;

    TextView tvTotalCatalogo;

    GridView gvCalzados;

    List<Producto> listaProducto;

    ProgressDialog progressDialog;
    int progresoCarga = 0;

    String descTipoProd = "";
    String descColor = "";
    Integer descTalla = 0;
    //    String descMaterial = "";
    String descTemporada = "";
    Double precioIni = 0.00;
    Double precioFin = 0.00;

    List<Tipoproducto> listaTipoProducto;
    List<Talla> listaTalla;
    List<Colorproducto> listaColor;
    List<Material> listaMaterial;
    List<Temporada> listaTemporada;
    List<String> listaPrecios;

    static Producto productoSeleccionado;

    MenuItem menuItemCarrito;

    int myLastVisiblePos;

    LinearLayout lyCatalogo;

    AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

        ad = new AlertDialog.Builder(this);

        lyCatalogo = (LinearLayout) findViewById(R.id.lyCatalogo);

        spnTallaCalzado = (Spinner) findViewById(R.id.spnCatalogoTaC);
        spnColor = (Spinner) findViewById(R.id.spnCatalogoColor);
//        spnMaterial = (Spinner) findViewById(R.id.spnCatalogoMaterial);
        spnTipoCalzado = (Spinner) findViewById(R.id.spnCatalogoTC);
        spnTemporada = (Spinner) findViewById(R.id.spnCatalogoTemporada);
        spnPrecioCalzado = (Spinner) findViewById(R.id.spnCatalogoPC);

        tvTotalCatalogo = (TextView) findViewById(R.id.tvTotalCatalogo);

        //Lista Precios
        listaPrecios = new ArrayList<>();
        listaPrecios.add("PRECIOS");
        listaPrecios.add("DE S/ 0 A 49 SOLES");
        listaPrecios.add("DE S/ 50 A 99 SOLES");
        listaPrecios.add("DE S/ 100 A 149 SOLES");
        listaPrecios.add("DE S/ 150 A MÁS");

        ArrayAdapter<String> arrayPrecioCalzado = new ArrayAdapter<String>(getApplicationContext(), R.layout.simple_spinner_item, listaPrecios);
        arrayPrecioCalzado.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spnPrecioCalzado.setAdapter(arrayPrecioCalzado);

        /*ArrayAdapter<String> arrayPrecioCalzado = new ArrayAdapter<>(getApplicationContext(),R.layout.simple_spinner_dropdown_item,listaPrecios);
        spnPrecioCalzado.setAdapter(arrayPrecioCalzado);*/


        //GRILLA DE CALZADOS
        gvCalzados = (GridView) findViewById(R.id.gvCatalogo);
        gvCalzados.setAdapter(new ImagenCalzadoArrayAdapter(getApplicationContext(), new ArrayList<Producto>()));
        gvCalzados.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                int currentFirstVisPos = view.getFirstVisiblePosition();
                Long tsLong = System.currentTimeMillis() / 1000;
                int currentSec = tsLong.intValue();
//                Log.d("currentFirstVisPos",""+currentFirstVisPos);
//                Log.d("currentSec",""+currentSec);
                if (currentFirstVisPos < 10) {
                    lyCatalogo.setVisibility(View.VISIBLE);
                } else {
                    lyCatalogo.setVisibility(View.GONE);
                }
                myLastVisiblePos = currentFirstVisPos;
            }
        });
        //EVENTO DE LA GRILLA
        gvCalzados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("CATALOGO POSICION", "" + position);
                productoSeleccionado = listaProducto.get(position);
                Log.i("productoSeleccionado", productoSeleccionado.toString());
                Toast.makeText(view.getContext().getApplicationContext(), productoSeleccionado.getDescripcion(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), DetalleCalzadoActivity.class);

                i.putExtra("idProducto", productoSeleccionado.getIdproducto().toString());
                i.putExtra("idColor", productoSeleccionado.getIdColor());
                i.putExtra("nroTalla", productoSeleccionado.getNroTalla().toString());
                i.putExtra("SKU", productoSeleccionado.getSku());
                startActivityForResult(i, 1000);
            }
        });

        //EVENTO SELECCIONAR SPINNER
        spnTipoCalzado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                descTipoProd = (String) parent.getItemAtPosition(position);
                if (position == 0) descTipoProd = "";
                Log.i("VALOR", descTipoProd);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spnTallaCalzado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                try {
                    descTalla = Integer.parseInt((String) parent.getItemAtPosition(position));
                } catch (Exception e) {
                    descTalla = 0;
                }
                Log.i("VALOR", "" + descTalla);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spnColor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                descColor = (String) parent.getItemAtPosition(position);
                if (position == 0) descColor = "";
                Log.i("VALOR", descColor);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
//        spnMaterial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                descMaterial = (String) parent.getItemAtPosition(position);
//                if(position==0)descMaterial="";
//                Log.i("VALOR", descMaterial);
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {}
//        });
        spnTemporada.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                descTemporada = (String) parent.getItemAtPosition(position);
                if (position == 0) descTemporada = "";
                Log.i("VALOR", descTemporada);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spnPrecioCalzado.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String precio = (String) parent.getItemAtPosition(position);
                int contador = 0;
                for (int i = 0; i < listaPrecios.size() && position != 0; i++) {
                    String item = listaPrecios.get(i);
                    if (precio.equals(item)) {
                        contador = i;
                        break;
                    }
                }
                if (contador == 4) {
                    precioIni = 150.00;
                    precioFin = 999.00;
                } else if (contador == 3) {
                    precioIni = 100.00;
                    precioFin = 149.00;
                } else if (contador == 2) {
                    precioIni = 50.00;
                    precioFin = 99.00;
                } else if (contador == 1) {
                    precioIni = 5.00;
                    precioFin = 49.00;
                } else {
                    precioIni = 0.00;
                    precioFin = 0.00;
                }
                Log.i("precioIni", "" + precioIni);
                Log.i("precioFin", "" + precioFin);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        cargarFiltros();
    }

    private void cargarFiltros() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("CARGANDO...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setProgress(progresoCarga);
        progressDialog.setMax(100);
        /*progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(progressDialog != null && progressDialog.getProgress()==100){
                        progressDialog.dismiss();
                        break;
                    }
                }
            }
        }).start();*/

        new HttpRequestTaskTiposCalzado().execute();
        new HttpRequestTaskTallas().execute();
        new HttpRequestTaskColor().execute();
//        new HttpRequestTaskMaterial().execute();
        new HttpRequestTaskTemporada().execute();

    }

    @Override
    public void onPause() {
        super.onPause();
        if ((progressDialog != null) && progressDialog.isShowing())
            progressDialog.dismiss();
        progressDialog = null;
    }

    public void onClickBuscar(View v) {
        progressDialog = new ProgressDialog(v.getContext());
        progressDialog.setMessage("BUSCANDO...");
        progressDialog.show();
        new HttpRequestTaskBuscar().execute();
    }

    public void onClickReiniciar(View v) {
        spnTallaCalzado.setSelection(0);
        spnTemporada.setSelection(0);
        spnTipoCalzado.setSelection(0);
        spnColor.setSelection(0);
        spnPrecioCalzado.setSelection(0);
        gvCalzados.setAdapter(new ImagenCalzadoArrayAdapter(v.getContext().getApplicationContext(), new ArrayList<Producto>()));
        tvTotalCatalogo.setText("ENCONTRADOS: 0");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.carrito, menu);
        menuItemCarrito = menu.findItem(R.id.action_carrito_ver_pedido);
        menuItemCarrito.setTitle("Ver Pedido (" + Util.LISTA_PRODUCTOS_PEDIDO.size() + ")");
        return true;
    }

    private void actulizarMenuCantidadPedido() {
        menuItemCarrito.setTitle("Ver Pedido (" + Util.LISTA_PRODUCTOS_PEDIDO.size() + ")");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        actulizarMenuCantidadPedido();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_carrito:
            case R.id.action_carrito_ver_pedido:
                Intent i = new Intent(this, PedidoActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private class HttpRequestTaskBuscar extends AsyncTask<Void, Void, List<Producto>> {
        @Override
        protected List<Producto> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskBuscar");
            try {
//                String URL = Util.URL_WEB_SERVICE + "/buscarCatalogo";
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_CATALOGO + "/producto/filtros";

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
                        .queryParam("descTipoProd", descTipoProd)
                        .queryParam("descTalla", descTalla)
                        .queryParam("descColor", descColor)
                        .queryParam("descTemporada", descTemporada)
                        .queryParam("precioIni", precioIni)
                        .queryParam("precioFin", precioFin);

                Log.i("BUSCAR", builder.toUriString());

                ParameterizedTypeReference<List<Producto>> responseType = new ParameterizedTypeReference<List<Producto>>() {
                };
                ResponseEntity<List<Producto>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, null, responseType);
                List<Producto> lista = respuesta.getBody();
                return lista;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("HttpRequestTask", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Producto> lista) {
            Log.i("onPostExecute", "HttpRequestTaskBuscar");
            Log.i("LISTA", "Tamaño: " + lista.size());
            listaProducto = lista;
            gvCalzados.setAdapter(new ImagenCalzadoArrayAdapter(getApplicationContext(), lista));
            tvTotalCatalogo.setText("ENCONTRADOS: " + lista.size());
            Log.i("onPostExecute", "fin");
            progressDialog.dismiss();
            if (listaProducto.size() == 0) {
                ad.setTitle("MENSAJE");
                ad.setMessage("NO SE ENCONTRARON CALZADOS.");
                ad.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                ad.show();
            }
        }

    }

    //Lista de Tallas
    private class HttpRequestTaskTallas extends AsyncTask<Void, Void, List<Talla>> {
        @Override
        protected List<Talla> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskTallas");
            try {
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_CATALOGO + "/talla";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ParameterizedTypeReference<List<Talla>> responseType = new ParameterizedTypeReference<List<Talla>>() {
                };
                ResponseEntity<List<Talla>> respuesta = restTemplate.exchange(URL, HttpMethod.GET, null, responseType);
                List<Talla> lista = respuesta.getBody();
                return lista;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("HttpRequestTask", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Talla> lista) {
            Log.i("onPostExecute", "HttpRequestTaskTallas");
            Log.i("LISTA", "Tamaño: " + lista.size());
            listaTalla = lista;
            List<String> items = new ArrayList<>();
            items.add("TALLAS");
            for (Talla t : lista) {
                items.add(t.getNrotalla().toString());
            }
            ArrayAdapter<String> arrayTallaCalzado = new ArrayAdapter<String>(getApplicationContext(), R.layout.simple_spinner_item, items);
            arrayTallaCalzado.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnTallaCalzado.setAdapter(arrayTallaCalzado);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.incrementProgressBy(progresoCarga);
        }

    }

    //Lista Color
    private class HttpRequestTaskColor extends AsyncTask<Void, Void, List<Colorproducto>> {
        @Override
        protected List<Colorproducto> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskColor");
            try {
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_CATALOGO + "/colorproducto";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ParameterizedTypeReference<List<Colorproducto>> responseType = new ParameterizedTypeReference<List<Colorproducto>>() {
                };
                ResponseEntity<List<Colorproducto>> respuesta = restTemplate.exchange(URL, HttpMethod.GET, null, responseType);
                List<Colorproducto> lista = respuesta.getBody();
                return lista;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("HttpRequestTask", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Colorproducto> lista) {
            Log.i("onPostExecute", "HttpRequestTaskColor");
            Log.i("LISTA", "Tamaño: " + lista.size());
            listaColor = lista;
            List<String> items = new ArrayList<>();
            items.add("COLORES");
            for (Colorproducto cp : lista) {
                items.add(cp.getColor());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnColor.setAdapter(array);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.incrementProgressBy(progresoCarga);
        }

    }

    //Lista de Materiales
//    private class HttpRequestTaskMaterial extends AsyncTask<Void, Void, List<Material>> {
//        @Override
//        protected List<Material> doInBackground(Void... params) {
//            Log.i("doInBackground", "HttpRequestTaskMaterial");
//            try {
//                String URL = Util.URL_WEB_SERVICE +"/verMateriales";
//                RestTemplate restTemplate = new RestTemplate();
//                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//                ParameterizedTypeReference<List<Material>> responseType = new ParameterizedTypeReference<List<Material>>() {};
//                ResponseEntity<List<Material>> respuesta = restTemplate.exchange(URL, HttpMethod.GET, null, responseType);
//                List<Material> lista = respuesta.getBody();
//                return lista;
//            } catch (Exception e) {
//                Log.i("Exception", "ERROR");
//                Log.e("HttpRequestTask", e.getMessage(), e);
//            }
//            Log.i("doInBackground", "fin");
//            return new ArrayList<>();
//        }
//
//        @Override
//        protected void onPostExecute(List<Material> lista) {
//            Log.i("onPostExecute", "HttpRequestTaskMaterial");
//            Log.i("LISTA", "Tamaño: "+lista.size());
//            listaMaterial = lista;
//            List<String> items = new ArrayList<>();
//            items.add("MATERIAL");
//            for (Material m:lista) {
//                items.add(m.getDescripcion());
//            }
//            ArrayAdapter<String> array = new ArrayAdapter<>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,items);
//            spnMaterial.setAdapter(array);
//            Log.i("onPostExecute", "fin");
//            progresoCarga+=25;
//            progressDialog.setProgress(progresoCarga);
//        }
//
//    }

    //Lista de Tipos de Calzado
    private class HttpRequestTaskTiposCalzado extends AsyncTask<Void, Void, List<Tipoproducto>> {
        @Override
        protected List<Tipoproducto> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskTiposCalzado");
            try {
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_CATALOGO + "/tipoproducto";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ParameterizedTypeReference<List<Tipoproducto>> responseType = new ParameterizedTypeReference<List<Tipoproducto>>() {
                };
                ResponseEntity<List<Tipoproducto>> respuesta = restTemplate.exchange(URL, HttpMethod.GET, null, responseType);
                List<Tipoproducto> lista = respuesta.getBody();
                return lista;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("doInBackground", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Tipoproducto> lista) {
            Log.i("onPostExecute", "HttpRequestTaskTiposCalzado");
            Log.i("LISTA", "Tipo de Calzado: " + lista.size());
            listaTipoProducto = lista;
            List<String> items = new ArrayList<>();
            items.add("TIPOS DE CALZADO");
            for (Tipoproducto tp : lista) {
                items.add(tp.getDescripcion());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnTipoCalzado.setAdapter(array);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.incrementProgressBy(progresoCarga);
        }

    }

    //Lista de Temporada
    private class HttpRequestTaskTemporada extends AsyncTask<Void, Void, List<Temporada>> {
        @Override
        protected List<Temporada> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskTemporada");
            try {
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_CATALOGO + "/temporada";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ParameterizedTypeReference<List<Temporada>> responseType = new ParameterizedTypeReference<List<Temporada>>() {
                };
                ResponseEntity<List<Temporada>> respuesta = restTemplate.exchange(URL, HttpMethod.GET, null, responseType);
                List<Temporada> lista = respuesta.getBody();
                return lista;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("HttpRequestTask", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Temporada> lista) {
            Log.i("onPostExecute", "HttpRequestTaskTemporada");
            Log.i("LISTA", "Tipo de Taco: " + lista.size());
            listaTemporada = lista;
            List<String> items = new ArrayList<>();
            items.add("TEMPORADAS");
            for (Temporada t : lista) {
                items.add(t.getDescripcion());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnTemporada.setAdapter(array);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.incrementProgressBy(progresoCarga);
        }

    }

}
