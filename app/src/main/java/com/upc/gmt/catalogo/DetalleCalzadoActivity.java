package com.upc.gmt.catalogo;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import com.upc.gmt.bean.Producto;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.model.Venta;
import com.upc.gmt.pedido.PedidoActivity;
import com.upc.gmt.util.Util;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetalleCalzadoActivity extends AppCompatActivity {

    ProgressDialog progressDialog;
    AlertDialog.Builder alertDialog;

    LinearLayout lyDetalleCalzado;

    TextView tvDetalleNombre;
    TextView tvDetalleCodigo;
    TextView tvDetallePrecio;
    Spinner spnColores;
    Spinner spnTallas;
    TextView tvDetalleMaterial;
    TextView tvDetalleCliente;

    ImageView imageView;
    String idProducto;
    String SKU;
    //    String idColorImg;
    String idColor;
    String nroTalla;
    int indexTalla;
    int indexColor;

    List<String> listaMateriales;
    Map<String, String> mapaColores;
    //    List<String> listaTallas;
    List<Producto> listaColorTalla;

    boolean flagCarga = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_calzado);

        alertDialog = new AlertDialog.Builder(this);

        Bundle extras = getIntent().getExtras();

        idProducto = extras.getString("idProducto");
        Log.i("onCreate-idProducto", idProducto);
        SKU = extras.getString("SKU");
        Log.i("onCreate-SKU", SKU);
        idColor = extras.getString("idColor");
        Log.i("onCreate-idColor", idColor);
        nroTalla = extras.getString("nroTalla");
        Log.i("onCreate-nroTalla", nroTalla);

        tvDetalleNombre = (TextView) findViewById(R.id.tvDetalleNombre);
        tvDetalleCodigo = (TextView) findViewById(R.id.tvDetalleCodigo);
        tvDetallePrecio = (TextView) findViewById(R.id.tvDetallePrecio);
        spnColores = (Spinner) findViewById(R.id.spnDetalleColores);
        spnTallas = (Spinner) findViewById(R.id.spnDetalleTallas);
        tvDetalleMaterial = (TextView) findViewById(R.id.tvDetalleMaterial);
        tvDetalleCliente = (TextView) findViewById(R.id.tvDetalleCliente);

        spnColores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String desColor = (String) parent.getItemAtPosition(position);
                String idColorNuevo = "";
                for (Map.Entry<String, String> entry : mapaColores.entrySet()) {
                    if (desColor.equals(entry.getValue())) {
                        idColorNuevo = entry.getKey();
                        break;
                    }
                }
                Log.i("idColor", idColorNuevo);
                if (!idColorNuevo.equals("")) {
                    idColor = idColorNuevo;
                    progressDialog.setMessage("Cargando Calzado...");
                    progressDialog.show();
                    new HttpRequestTaskTallas().execute();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spnTallas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                nroTalla = (String) parent.getItemAtPosition(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        lyDetalleCalzado = (LinearLayout) findViewById(R.id.lyDetalleCalzado);

        for (int i = 1; i <= 5; i++) {
            imageView = new ImageView(this);
            imageView.setId(Integer.parseInt(idProducto + i));
            imageView.setClickable(true);
            imageView.setAdjustViewBounds(true);
            imageView.setPadding(2, 2, 2, 2);
//            Double random = Math.random()*10;
//            if(random.intValue() > 6){
//                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.calzado_verde));
//            }else if(random.intValue() > 3){
//                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.calzado_amarillo));
//            }else{
//                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.calzado_rojo));
//            }
//            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setMaxWidth(300);
            imageView.setMaxHeight(300);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    int id = v.getId();
//                    ImageView iv = (ImageView) v.findViewById(id);
//                    imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    Intent i = new Intent(getApplicationContext(), FullScreenImageActivity.class);
                    BitmapDrawable d = (BitmapDrawable) v.getTag();
                    Bitmap bmp = d.getBitmap();
//                    Bitmap bmp = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                    byte[] byteArray = stream.toByteArray();
                    i.putExtra("nombre", "Calzado Demo " + byteArray.length);
                    i.putExtra("imagen", byteArray);
                    startActivity(i);
                }
            });

            Target target = new Target() {
                @Override
                public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                    imageView.setImageBitmap(bitmap);
                    Drawable image = imageView.getDrawable();
                    imageView.setTag(image);
//                    lyDetalleCalzado.addView(imageView);
                }

                @Override
                public void onBitmapFailed(Drawable errorDrawable) {
                }

                @Override
                public void onPrepareLoad(Drawable placeHolderDrawable) {
                }
            };
            Log.i("DETALLE IMG", SKU + "_" + idColor + "_" + i + ".jpg");
            try {
                int id = getResources().getIdentifier(SKU.toLowerCase() + "_" + idColor + "_" + i, "mipmap", getPackageName());
                Picasso.with(getApplicationContext()).load(id).resize(150, 150).centerCrop().into(target);
//                Picasso.with(getApplicationContext()).load(Util.URL_WEB_SERVICE + "/verImagen?nombre=" + SKU + "_" + idColorImg + "_" + i + ".jpg").into(imageView);
//                imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), id));
//                imageView.setDrawingCacheEnabled(true);
//                imageView.setImageResource(id);
//                imageView.setImageBitmap(b);
//                imageView.setTag(imageView.getDrawable());
            } catch (Exception e) {
                Log.e("DETALLE IMG", e.getMessage());
            }

            lyDetalleCalzado.addView(imageView);
        }

//        lyDetalleCalzado.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int id = v.getId();
//                ImageView iv = (ImageView) v.findViewById(R.id);
//                iv.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
//                iv.setScaleType(ImageView.ScaleType.FIT_XY);
//            }
//        });

        mostrarCliente();

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Cargando Calzado...");
        progressDialog.show();
        new HttpRequestTaskDetalleCalzado().execute();
    }

    public void mostrarCliente() {
        if (Util.CLIENTE_SESSION != null) {
            if (Util.CLIENTE_SESSION.getRUC() != null && !Util.CLIENTE_SESSION.getRUC().equals("")) {
                tvDetalleCliente.setText("Cliente: " + Util.CLIENTE_SESSION.getNombres() + " (" + Util.CLIENTE_SESSION.getRUC() + ")");
            } else {
                tvDetalleCliente.setText("Cliente: " + Util.CLIENTE_SESSION.getApellidoPaterno() + " (" + Util.CLIENTE_SESSION.getNroDocumentoIdentidad() + ")");
            }
        } else {
            tvDetalleCliente.setText("Cliente: - ");
        }
    }

    @Override
    protected void onStart() {
//        progressDialog.show();
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.carrito, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_carrito:
                Intent i = new Intent(this, PedidoActivity.class);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onClickAgregarPedido(View v) {
//        if (Util.EMPLEADO_SESSION.getCodUsuario() == null || Util.EMPLEADO_SESSION.getCodUsuario().equals("")) {
//            Util.REGRESAR_A_CATALOGO = true;
//            Intent i = new Intent(getApplicationContext(), com.upc.gmt.comercialgb.LoginActivity.class);
//            startActivity(i);
//            return;
//        }

        if (Util.CLIENTE_SESSION == null) {
            alertDialog.setTitle("MENSAJE");
            alertDialog.setMessage("DEBE BUSCAR UN CLIENTE");
            alertDialog.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            alertDialog.show();
            return;
        }

        progressDialog.setMessage("Validando Cliente...");
        progressDialog.show();
        new HttpRequestTaskPedido().execute();
    }

    public void onClickBuscarCliente(View v){
        Util.REGRESAR_A_CATALOGO = true;
        Intent i = new Intent(getApplicationContext(), BuscarClienteActivity.class);
        startActivityForResult(i, 1000);
        return;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("onActivityResult", requestCode + "-" + resultCode);
        if (requestCode == 1000) {
            mostrarCliente();
        }
    }

    public void onRegresarMenu(View v) {
        finish();
    }

    private class HttpRequestTaskDetalleCalzado extends AsyncTask<Void, Void, Producto> {
        @Override
        protected Producto doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskDetalleCalzado");
            try {
//                String URL = Util.URL_WEB_SERVICE + "/verDetalleCalzado";
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_CATALOGO + "/producto/detalle/" + idProducto;
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//                        .queryParam("idProducto", idProducto);
                Log.i("URL", builder.toUriString());
                ParameterizedTypeReference<Map<String, Object>> responseType = new ParameterizedTypeReference<Map<String, Object>>() {
                };
                ResponseEntity<Map<String, Object>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, null, responseType);
                Map<String, Object> mapa = respuesta.getBody();
                Log.i("respuesta", mapa.toString());
                ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
                List<Producto> lista = mapper.convertValue(mapa.get("detalle"), new TypeReference<List<Producto>>() {
                });
                listaMateriales = new ArrayList<>();
                for (Producto p : lista) {
                    listaMateriales.add(p.getComponente() + ": " + p.getMaterial());
                }
                List<Producto> colores = mapper.convertValue(mapa.get("colores"), new TypeReference<List<Producto>>() {
                });
                mapaColores = new HashMap<>();
                for (int i = 0; i < colores.size(); i++) {
                    Producto p = colores.get(i);
                    mapaColores.put(p.getIdColor(), p.getColor());
                }
//                List<Producto> tallas = mapper.convertValue(mapa.get("tallas"), new TypeReference<List<Producto>>(){});
//                listaTallas = new ArrayList<>();
//                for (int i = 0; i<tallas.size(); i++) {
//                    Producto p = tallas.get(i);
//                    if(nroTalla.equals(p.getNroTalla().toString()))indexTalla = i;
//                    listaTallas.add(p.getNroTalla() + " (Stock: "+ p.getStockVenta() + ")");
//                }
                return lista.get(0);
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("HttpRequestTask", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new Producto();
        }

        @Override
        protected void onPostExecute(Producto p) {
            Log.i("onPostExecute", "HttpRequestTaskDetalleCalzado");
            Log.i("Producto", p.toString());
            if (p.getIdproducto() != null) {
                tvDetalleNombre.setText(p.getDescripcion());
                tvDetalleCodigo.setText(p.getSku());
//                if (Util.EMPLEADO_SESSION.getIdTipoUsuario() == 2) {
                tvDetallePrecio.setText("S/ " + Util.formatearDecimales(p.getPreciounitario().doubleValue()));
//                } else {
//                    tvDetallePrecio.setText("Precio  :" + p.getPrecioUnitario());
//                }
                List<String> colores = new ArrayList<>();
                int contador = 0;
                for (Map.Entry<String, String> entry : mapaColores.entrySet()) {
//                    if (contador == 1) {
//                        idColor = entry.getKey();
//                    }
                    if (idColor.equals(entry.getKey())) indexColor = contador;
                    colores.add(entry.getValue());
                    contador++;
                }
                ArrayAdapter arrayColores = new ArrayAdapter(getApplicationContext(), R.layout.simple_spinner_item, colores);
                arrayColores.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
//                Spinner spn = (Spinner) findViewById(R.id.spnDetalleColores);
                spnColores.setAdapter(arrayColores);
                Log.i("indexColor", "" + indexColor);
                spnColores.setSelection(indexColor);
//                ArrayAdapter spnTallas = new ArrayAdapter(getApplicationContext(), R.layout.simple_spinner_item, listaTallas);
//                spnTallas.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
//                Spinner spn1 = (Spinner) findViewById(R.id.spnDetalleTallas);
//                spn1.setAdapter(spnTallas);
//                spn1.setSelection(indexTalla);
                String material = "";
                for (String m : listaMateriales) {
                    material += m + System.getProperty("line.separator");
                }
                tvDetalleMaterial.setText(material);
                progressDialog.dismiss();
            }
            Log.i("onPostExecute", "fin");
        }

    }

    private class HttpRequestTaskTallas extends AsyncTask<Void, Void, List<Producto>> {
        @Override
        protected List<Producto> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskTallas");
            try {
//                String URL = Util.URL_WEB_SERVICE + "/verDetalleCalzadoTallas";
                String URL = Util.URL_SERVICE_BASE + Util.URL_SERVICE_CATALOGO + "/producto/detalle/tallas/" + idProducto + "/" + idColor;
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//                        .queryParam("idProducto", idProducto)
//                        .queryParam("idColor", idColor);
                Log.i("URL", builder.toUriString());
                ParameterizedTypeReference<List<Producto>> responseType = new ParameterizedTypeReference<List<Producto>>() {
                };
                ResponseEntity<List<Producto>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, null, responseType);
                List<Producto> lista = respuesta.getBody();
                Log.i("respuesta", lista.toString());
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
            Log.i("onPostExecute", "HttpRequestTaskTallas");
            Log.i("LISTA", "Tamaño: " + lista.size());
            listaColorTalla = lista;
            List<String> items = new ArrayList<>();
            indexTalla = 0;
            for (int i = 0; i < lista.size(); i++) {
                Producto p = lista.get(i);
                if (nroTalla.equals(p.getNroTalla().toString()) && flagCarga) {
                    flagCarga = false;
                    indexTalla = i;
                }
                items.add(p.getNroTalla().toString() + " (Stock: " + p.getStockVenta() + ")");
            }
            ArrayAdapter<String> arrayTallaCalzado = new ArrayAdapter<String>(getApplicationContext(), R.layout.simple_spinner_item, items);
            arrayTallaCalzado.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnTallas.setAdapter(arrayTallaCalzado);
            Log.i("indexTalla", "" + indexTalla);
            spnTallas.setSelection(indexTalla);
//            cargarImagenesDetalle();
            progressDialog.dismiss();
            Log.i("onPostExecute", "fin");
        }

    }

    private class HttpRequestTaskPedido extends AsyncTask<Void, Void, List<Venta>> {
        @Override
        protected List<Venta> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskPedido");
            try {
//                String URL = Util.URL_WEB_SERVICE + "/pedidosXestado";
//                RestTemplate restTemplate = new RestTemplate();
//                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//
//                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL)
//                        .queryParam("idCliente", Util.CLIENTE_SESSION.getIdCliente())
//                        .queryParam("idEstadoVenta", 1);//Pendiente
//                Log.i("URL", builder.toUriString());
//                ParameterizedTypeReference<List<Venta>> responseType = new ParameterizedTypeReference<List<Venta>>() {
//                };
//                ResponseEntity<List<Venta>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, null, responseType);
//                List<Venta> lista = respuesta.getBody();
//                Log.i("respuesta", lista.toString());
//                return lista;
                return new ArrayList<>();
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("HttpRequestTask", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Venta> lista) {
            Log.i("onPostExecute", "HttpRequestTaskPedido");
            Log.i("LISTA", "Tamaño: " + lista.size());
            if (lista != null && lista.size() > 3) {
                Toast.makeText(DetalleCalzadoActivity.this, "USTED CUENTA CON MÁS DE 3 PEDIDOS EN PENDIENTE DE PAGO Y NO PUEDE REALIZAR OTRO PEDIDO", Toast.LENGTH_LONG).show();
            } else {
                Log.i("DATOS PEDIDO", idProducto + "-" + idColor + "-" + nroTalla.substring(0, 2));
                Producto p = new Producto();
                try {
                    p = (Producto) CatalogoActivity.productoSeleccionado.clone();
                } catch (Exception e) {
                    Log.e("ERROR", e.getMessage());
                }
                p.setIdproducto(Integer.parseInt(idProducto));
                p.setIdColor(idColor);
                p.setNroTalla(Integer.parseInt(nroTalla.substring(0, 2)));
                p.setColor(spnColores.getSelectedItem().toString());
//                p.setCantidad(1);
                boolean existe = false;
                for (Producto ps : Util.LISTA_PRODUCTOS_PEDIDO) {
                    if (p.getIdproducto() == ps.getIdproducto() &&
                            p.getIdColor().equals(ps.getIdColor()) &&
                            p.getNroTalla().equals(ps.getNroTalla())) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    Log.i("Producto al Pedido", p.toString());
                    Util.LISTA_PRODUCTOS_PEDIDO.add(p);
                    Toast.makeText(DetalleCalzadoActivity.this, "EL CALZADO " + p.getDescripcion() + " FUE AGREGADO AL PEDIDO", Toast.LENGTH_LONG).show();
                    finish();
                } else {
//                    Toast.makeText(DetalleCalzadoActivity.this, "ESTE CALZADO YA EXISTE EN EL PEDIDO", Toast.LENGTH_LONG).show();
                    alertDialog.setTitle("MENSAJE");
                    alertDialog.setMessage("EL CALZADO YA EXISTE EN EL PEDIDO");
                    alertDialog.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    alertDialog.show();
                }
            }
            progressDialog.dismiss();
            Log.i("onPostExecute", "fin");
        }

    }


}
