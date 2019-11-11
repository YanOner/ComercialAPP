package com.upc.gmt.pedido;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.upc.gmt.bean.Costoubigeo;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.util.Util;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TipoEntregaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TipoEntregaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TipoEntregaFragment extends Fragment {

    Spinner spnDepartamento;
    Spinner spnProvincia;
    Spinner spnDistrito;

    RadioButton rdRecojoAlmacen;
    RadioButton rdEnvioDomicilio;

    List<Costoubigeo> listaDepartamento;
    List<Costoubigeo> listaProvincia;
    List<Costoubigeo> listaDistrito;

    LinearLayout layoutDomicilio;

    String idUbigeoDepartamento;
    String idUbigeoProvincia;
    String idUbigeoDistrito;

    EditText txtDireccionEnvio;

    TextView txtCostoEnvio;
    TextView txtDirAlmacen;

    ToggleButton btnAceptarCosto;

    double costoEnvio;

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public TipoEntregaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TipoEntregaFragment.
     */
    public static TipoEntregaFragment newInstance(String param1, String param2) {
        TipoEntregaFragment fragment = new TipoEntregaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tipo_entrega, container, false);
    }

    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(Uri uri);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                if (id == R.id.rdRecojoAlmacen) {
                    txtDirAlmacen.setVisibility(View.VISIBLE);
                    layoutDomicilio.setVisibility(View.INVISIBLE);
                    RegistrarPedidoActivity.tipoEntrega = 0;
                    Util.PRECIO_COSTO_ENVIO = 0.00;
                } else if (id == R.id.rdEnvioDomicilio) {
                    new HttpRequestTaskDepartamentos().execute();
                    txtDirAlmacen.setVisibility(View.INVISIBLE);
                    layoutDomicilio.setVisibility(View.VISIBLE);
                    RegistrarPedidoActivity.tipoEntrega = 1;
                    txtDireccionEnvio.setText("");
                    btnAceptarCosto.setChecked(false);
                    txtDireccionEnvio.setEnabled(true);
                    spnDepartamento.setEnabled(true);
                    spnProvincia.setEnabled(true);
                    spnDistrito.setEnabled(true);
                }
                RegistrarPedidoActivity.actualizarTotalPagar();
            }
        };

        txtDireccionEnvio = (EditText) getView().findViewById(R.id.txtDireccionEnvio);
        txtCostoEnvio = (TextView) getView().findViewById(R.id.txtCostoEnvio);
        txtDirAlmacen = (TextView) getView().findViewById(R.id.txtDirAlmacen);
        btnAceptarCosto = (ToggleButton) getView().findViewById(R.id.btnAceptarCosto);

        rdRecojoAlmacen = (RadioButton) getView().findViewById(R.id.rdRecojoAlmacen);
        rdEnvioDomicilio = (RadioButton) getView().findViewById(R.id.rdEnvioDomicilio);
        spnDepartamento = (Spinner) getView().findViewById(R.id.spnDepartamento);
        spnProvincia = (Spinner) getView().findViewById(R.id.spnProvincia);
        spnDistrito = (Spinner) getView().findViewById(R.id.spnDistrito);

        spnProvincia.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.simple_spinner_item, new String[]{"PROVINCIA"}));
        spnDistrito.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.simple_spinner_item, new String[]{"DISTRITO"}));

        if (!RegistrarPedidoActivity.direccionEntrega.equals("")) {
            txtDireccionEnvio.setText(RegistrarPedidoActivity.direccionEntrega);
        }

        btnAceptarCosto.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnAceptarCosto.isChecked()) {
                    if (txtDireccionEnvio.getText().toString().equals("") && costoEnvio != 0) {
                        Toast.makeText(getContext(), "POR FAVOR INGRESAR UNA DIRECCIÓN", Toast.LENGTH_LONG).show();
                        btnAceptarCosto.setChecked(false);
                        return;
                    }
                    RegistrarPedidoActivity.flagCostoAceptado = true;
                    if (costoEnvio != 0) {
                        Util.PRECIO_COSTO_ENVIO = costoEnvio;
                    }
                    spnDepartamento.setEnabled(false);
                    spnProvincia.setEnabled(false);
                    spnDistrito.setEnabled(false);
                    txtDireccionEnvio.setEnabled(false);

                } else {
                    RegistrarPedidoActivity.flagCostoAceptado = false;
                    Util.PRECIO_COSTO_ENVIO = 0;
                    spnDepartamento.setEnabled(true);
                    spnProvincia.setEnabled(true);
                    spnDistrito.setEnabled(true);
                    txtDireccionEnvio.setEnabled(true);
                }
                RegistrarPedidoActivity.actualizarTotalPagar();
            }
        });

        spnDepartamento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String desDepartamento = (String) parent.getItemAtPosition(position);
                idUbigeoDepartamento = "";
                for (Costoubigeo cu : listaDepartamento) {
                    if (desDepartamento.equals(cu.getDepartamento())) {
                        idUbigeoDepartamento = cu.getCodubigeocosto().substring(0, 2);
                        break;
                    }
                }
                Log.i("idUbigeoDepartamento", idUbigeoDepartamento);
                if (!idUbigeoDepartamento.equals("")) {
                    RegistrarPedidoActivity.indexDepartamento = position;
                    new HttpRequestTaskProvincias().execute();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spnProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (listaProvincia == null || listaProvincia.size() == 0) {
                    return;
                }
                String desProvincia = (String) parent.getItemAtPosition(position);
                idUbigeoProvincia = "";
                for (Costoubigeo cu : listaProvincia) {
                    if (desProvincia.equals(cu.getProvincia())) {
                        idUbigeoProvincia = cu.getCodubigeocosto().substring(0, 4);
                        break;
                    }
                }
                Log.i("idUbigeoProvincia", idUbigeoProvincia);
                if (!idUbigeoProvincia.equals("")) {
                    RegistrarPedidoActivity.indexProvincia = position;
                    new HttpRequestTaskDistrito().execute();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spnDistrito.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (listaDistrito == null || listaDistrito.size() == 0) {
                    return;
                }
                costoEnvio = 0.00;
                String desDistritro = (String) parent.getItemAtPosition(position);
                idUbigeoDistrito = "";
                for (Costoubigeo cu : listaDistrito) {
                    if (desDistritro.equals(cu.getDistrito())) {
                        idUbigeoDistrito = cu.getCodubigeocosto().substring(0, 6);
                        costoEnvio = cu.getCostoenvio().doubleValue();
                        break;
                    }
                }
                Log.i("idUbigeoDistrito", idUbigeoDistrito);
                Log.i("costoEnvio", "" + costoEnvio);
                if (!idUbigeoDistrito.equals("")) {
                    RegistrarPedidoActivity.indexDistrito = position;
                    RegistrarPedidoActivity.codigoUbigeo = idUbigeoDistrito;
                    Util.PRECIO_COSTO_ENVIO = costoEnvio;
                    txtCostoEnvio.setText("Costo de Envío: " + costoEnvio);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        rdRecojoAlmacen.setOnClickListener(ocl);
        rdEnvioDomicilio.setOnClickListener(ocl);

        layoutDomicilio = (LinearLayout) getView().findViewById(R.id.layoutDomicilio);

        if (RegistrarPedidoActivity.tipoEntrega == 1) {
            new HttpRequestTaskDepartamentos().execute();
            txtDirAlmacen.setVisibility(View.INVISIBLE);
            layoutDomicilio.setVisibility(View.VISIBLE);
            rdEnvioDomicilio.setChecked(true);
            if (Util.PRECIO_COSTO_ENVIO != 0 && RegistrarPedidoActivity.flagCostoAceptado) {
                btnAceptarCosto.setChecked(true);
                txtDireccionEnvio.setEnabled(false);
                spnDepartamento.setEnabled(false);
                spnProvincia.setEnabled(false);
                spnDistrito.setEnabled(false);
            } else {
                btnAceptarCosto.setChecked(false);
                txtDireccionEnvio.setEnabled(true);
                spnDepartamento.setEnabled(true);
                spnProvincia.setEnabled(true);
                spnDistrito.setEnabled(true);
            }
        } else {
            txtDirAlmacen.setVisibility(View.VISIBLE);
            layoutDomicilio.setVisibility(View.INVISIBLE);
            rdRecojoAlmacen.setChecked(true);
            Util.PRECIO_COSTO_ENVIO = 0;
            RegistrarPedidoActivity.actualizarTotalPagar();
        }

        txtDireccionEnvio.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                RegistrarPedidoActivity.direccionEntrega = txtDireccionEnvio.getText().toString();
            }
        });

        super.onViewCreated(view, savedInstanceState);//siempre final

    }

    private class HttpRequestTaskDepartamentos extends AsyncTask<Void, Void, List<Costoubigeo>> {
        @Override
        protected List<Costoubigeo> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskCostoUbigeo");
            try {
                String URL = Util.URL_SERVICE_BASE + "/costoubigeo/departamentos";
                Log.i("URL", URL);
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ParameterizedTypeReference<List<Costoubigeo>> responseType = new ParameterizedTypeReference<List<Costoubigeo>>() {
                };
                ResponseEntity<List<Costoubigeo>> respuesta = restTemplate.exchange(URL, HttpMethod.GET, null, responseType);
                List<Costoubigeo> lista = respuesta.getBody();
                return lista;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("doInBackground", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Costoubigeo> lista) {
            Log.i("onPostExecute", "HttpRequestTaskCostoUbigeo");
            Log.i("LISTA", "Departamentos: " + lista.size());
            listaDepartamento = lista;
            List<String> items = new ArrayList<>();
            //items.add("DEPARTAMENTO");
            for (Costoubigeo tp : lista) {
                items.add(tp.getDepartamento());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getActivity().getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnDepartamento.setAdapter(array);
            spnDepartamento.setSelection(RegistrarPedidoActivity.indexDepartamento);
            Log.i("onPostExecute", "fin");
        }
    }

    private class HttpRequestTaskProvincias extends AsyncTask<Void, Void, List<Costoubigeo>> {
        @Override
        protected List<Costoubigeo> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskProvincias");
            try {
                String URL = Util.URL_SERVICE_BASE + "/costoubigeo/provincias/" + idUbigeoDepartamento;

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//                        .queryParam("codUbigeoCosto", idUbigeoDepartamento);
                Log.i("URL", builder.toUriString());
                ParameterizedTypeReference<List<Costoubigeo>> responseType = new ParameterizedTypeReference<List<Costoubigeo>>() {
                };
                ResponseEntity<List<Costoubigeo>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, null, responseType);
                List<Costoubigeo> lista = respuesta.getBody();
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
        protected void onPostExecute(List<Costoubigeo> lista) {
            Log.i("onPostExecute", "HttpRequestTaskProvincias");
            Log.i("LISTA", "PROVINCIA: " + lista.size());
            listaProvincia = lista;
            List<String> items = new ArrayList<>();
            for (Costoubigeo p : lista) {
                items.add(p.getProvincia());
            }
            ArrayAdapter<String> arrayProvincia = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.simple_spinner_item, items);
            arrayProvincia.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnProvincia.setAdapter(arrayProvincia);
            spnProvincia.setSelection(RegistrarPedidoActivity.indexProvincia);
        }

    }

    /*DISTRITO*/
    private class HttpRequestTaskDistrito extends AsyncTask<Void, Void, List<Costoubigeo>> {
        @Override
        protected List<Costoubigeo> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskDistrito");
            try {
                String URL = Util.URL_SERVICE_BASE + "/costoubigeo/distritos/" + idUbigeoProvincia;
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);
//                        .queryParam("codUbigeoCosto", idUbigeoProvincia);
                Log.i("URL", builder.toUriString());
                ParameterizedTypeReference<List<Costoubigeo>> responseType = new ParameterizedTypeReference<List<Costoubigeo>>() {
                };
                ResponseEntity<List<Costoubigeo>> respuesta = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, null, responseType);
                List<Costoubigeo> lista = respuesta.getBody();
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
        protected void onPostExecute(List<Costoubigeo> lista) {
            Log.i("onPostExecute", "HttpRequestTaskDistrito");
            Log.i("LISTA", "DISTRITO: " + lista.size());
            listaDistrito = lista;
            List<String> items = new ArrayList<>();
            for (Costoubigeo p : lista) {
                items.add(p.getDistrito());
            }
            ArrayAdapter<String> arrayDistrito = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.simple_spinner_item, items);
            arrayDistrito.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnDistrito.setAdapter(arrayDistrito);
            spnDistrito.setSelection(RegistrarPedidoActivity.indexDistrito);
        }

    }

}