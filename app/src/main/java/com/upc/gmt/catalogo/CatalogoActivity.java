package com.upc.gmt.catalogo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.upc.gmt.comercialgb.R;
import com.upc.gmt.model.Colorproducto;
import com.upc.gmt.model.Material;
import com.upc.gmt.model.Producto;
import com.upc.gmt.model.Talla;
import com.upc.gmt.model.Temporada;
import com.upc.gmt.model.Tipoproducto;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);

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
        listaPrecios.add("De S/ 5 a 49 Soles");
        listaPrecios.add("De S/ 50 a 99 Soles");
        listaPrecios.add("De S/ 100 a 149 Soles");
        listaPrecios.add("De S/ 150 a más");

        ArrayAdapter<String> arrayPrecioCalzado = new ArrayAdapter<String>(getApplicationContext(), R.layout.simple_spinner_item, listaPrecios);
        arrayPrecioCalzado.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        spnPrecioCalzado.setAdapter(arrayPrecioCalzado);

        /*ArrayAdapter<String> arrayPrecioCalzado = new ArrayAdapter<>(getApplicationContext(),R.layout.simple_spinner_dropdown_item,listaPrecios);
        spnPrecioCalzado.setAdapter(arrayPrecioCalzado);*/


        //GRILLA DE CALZADOS
        gvCalzados = (GridView) findViewById(R.id.gvCatalogo);
        gvCalzados.setAdapter(new ImagenCalzadoArrayAdapter(getApplicationContext(), new ArrayList<Producto>()));
        //EVENTO DE LA GRILLA
        gvCalzados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("CATALOGO POSICION", "" + position);
                productoSeleccionado = listaProducto.get(position);
                Toast.makeText(view.getContext().getApplicationContext(), productoSeleccionado.getDescripcion(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(), DetalleCalzadoActivity.class);
                i.putExtra("idProducto", productoSeleccionado.getIdProducto().toString());
                i.putExtra("idColor", productoSeleccionado.getIdColor());
                i.putExtra("nroTalla", productoSeleccionado.getNroTalla().toString());
                i.putExtra("SKU", productoSeleccionado.getSKU());
                startActivity(i);
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
        progressDialog.setMessage("Cargando...");
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
        progressDialog.setMessage("Buscando...");
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
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_carrito:
                Intent i = new Intent(this, PedidoActivity.class);
                startActivity(i);
                return true;
            case R.id.action_carrito_ver_pedido:
                Intent i2 = new Intent(this, PedidoActivity.class);
                startActivity(i2);
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
                String URL = Util.URL_WEB_SERVICE + "/buscarCatalogo";
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
        }

    }

    //Lista de Tallas
    private class HttpRequestTaskTallas extends AsyncTask<Void, Void, List<Talla>> {
        @Override
        protected List<Talla> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskTallas");
            try {
                String URL = Util.URL_WEB_SERVICE + "/verTallas";
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
            items.add("TALLA");
            for (Talla t : lista) {
                items.add(t.getNroTalla().toString());
            }
            ArrayAdapter<String> arrayTallaCalzado = new ArrayAdapter<String>(getApplicationContext(), R.layout.simple_spinner_item, items);
            arrayTallaCalzado.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnTallaCalzado.setAdapter(arrayTallaCalzado);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.setProgress(progresoCarga);
        }

    }

    //Lista Color
    private class HttpRequestTaskColor extends AsyncTask<Void, Void, List<Colorproducto>> {
        @Override
        protected List<Colorproducto> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskColor");
            try {
                String URL = Util.URL_WEB_SERVICE + "/verColores";
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
            items.add("COLOR");
            for (Colorproducto cp : lista) {
                items.add(cp.getColor());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnColor.setAdapter(array);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.setProgress(progresoCarga);
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
                String URL = Util.URL_WEB_SERVICE + "/verTipoCalzados";
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
            items.add("TIPO DE CALZADO");
            for (Tipoproducto tp : lista) {
                items.add(tp.getDescripcion());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnTipoCalzado.setAdapter(array);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.setProgress(progresoCarga);
        }

    }

    //Lista de Temporada
    private class HttpRequestTaskTemporada extends AsyncTask<Void, Void, List<Temporada>> {
        @Override
        protected List<Temporada> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskTemporada");
            try {
                String URL = Util.URL_WEB_SERVICE + "/verTemporadas";
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
            items.add("TEMPORADA");
            for (Temporada t : lista) {
                items.add(t.getDescripcion());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnTemporada.setAdapter(array);
            Log.i("onPostExecute", "fin");
            progresoCarga += 25;
            progressDialog.setProgress(progresoCarga);
        }

    }

}
