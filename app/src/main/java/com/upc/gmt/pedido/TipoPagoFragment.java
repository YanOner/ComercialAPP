package com.upc.gmt.pedido;

import android.content.Context;
import android.graphics.Color;
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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.upc.gmt.bean.Bancos;
import com.upc.gmt.bean.Cliente;
import com.upc.gmt.comercialgb.R;
import com.upc.gmt.util.Constantes;
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
 * {@link TipoPagoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TipoPagoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TipoPagoFragment extends Fragment {

//    ProgressDialog progressDialog;

    LinearLayout lyBanco;
    LinearLayout lyCuentaBancaria;
    LinearLayout lyNumeroTarjeta;
    LinearLayout lyNombre;
    LinearLayout lyApellido;
    LinearLayout lyFechaCaducidad;
    LinearLayout lyCSV;
    LinearLayout lyLineaCredito;

    RadioButton rdConsignacion;
    RadioButton rdEfectivo;
    RadioButton rdTarjeta;
    RadioButton rdTransferencia;

    EditText txtCelularPedido;

    EditText txtNroTarjetaVisa;
    EditText txtNombreVisa;
    EditText txtApellidoVisa;
    EditText txtFechaVisa;
    EditText txtVisaCSV;

    Spinner spnBanco;
    TextView txtCuentaBancaria;
    TextView txtCredito;

    List<Bancos> listaBancos;

    private OnFragmentInteractionListener mListener;

    public TipoPagoFragment() {
        // Required empty public constructor
    }

    public static TipoPagoFragment newInstance(String param1, String param2) {
        TipoPagoFragment fragment = new TipoPagoFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tipo_pago, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        listaBancos = new ArrayList<>();

        txtCelularPedido = (EditText) getView().findViewById(R.id.txtCelularPedido);
        txtNroTarjetaVisa = (EditText) getView().findViewById(R.id.txtNroTarjetaVisa);
        txtNombreVisa = (EditText) getView().findViewById(R.id.txtNombreVisa);
        txtApellidoVisa = (EditText) getView().findViewById(R.id.txtApellidoVisa);
        txtFechaVisa = (EditText) getView().findViewById(R.id.txtFechaVisa);
        txtVisaCSV = (EditText) getView().findViewById(R.id.txtVisaCSV);

        lyBanco = (LinearLayout) getView().findViewById(R.id.lyBanco);
        spnBanco = (Spinner) getView().findViewById(R.id.spnBanco);
        lyCuentaBancaria = (LinearLayout) getView().findViewById(R.id.lyCuentaBancaria);
        lyNumeroTarjeta = (LinearLayout) getView().findViewById(R.id.lyNumeroTarjeta);
        lyNombre = (LinearLayout) getView().findViewById(R.id.lyNombre);
        lyApellido = (LinearLayout) getView().findViewById(R.id.lyApellido);
        lyFechaCaducidad = (LinearLayout) getView().findViewById(R.id.lyFechaCaducidad);
        lyCSV = (LinearLayout) getView().findViewById(R.id.lyCSV);
        txtCuentaBancaria = (TextView) getView().findViewById(R.id.txtCuentaBancaria);
//        lyLineaCredito = (LinearLayout) getView().findViewById(R.id.lyLineaCredito);
        txtCredito = (TextView) getView().findViewById(R.id.txtCredito);

        spnBanco.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.simple_spinner_item, new String[]{"BANCOS"}));

        spnBanco.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtCuentaBancaria.setText("");
                for (Bancos b : listaBancos) {
                    String banco = (String) parent.getItemAtPosition(position);
                    if (banco.equals(b.getDescripcion())) {
                        txtCuentaBancaria.setText(b.getNrocuenta());
                        RegistrarPedidoActivity.codigoBanco = b.getIdbancos();
                        RegistrarPedidoActivity.nroCuenta = b.getNrocuenta();
                        RegistrarPedidoActivity.indexBanco = position;
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rdConsignacion.setChecked(false);
                rdEfectivo.setChecked(false);
                rdTarjeta.setChecked(false);
                rdTransferencia.setChecked(false);
                int id = v.getId();
//                Log.i("ID",""+id);
                if (id == R.id.rdConsignacion) {
                    rdConsignacion.setChecked(true);
                    RegistrarPedidoActivity.tipoPago = Constantes.ID_FORMA_PAGO_CONSIGNACION;
//                    lyLineaCredito.setVisibility(View.VISIBLE);
                    lyBanco.setVisibility(View.INVISIBLE);
                    lyCuentaBancaria.setVisibility(View.INVISIBLE);
                    lyNumeroTarjeta.setVisibility(View.INVISIBLE);
                    lyNombre.setVisibility(View.INVISIBLE);
                    lyApellido.setVisibility(View.INVISIBLE);
                    lyFechaCaducidad.setVisibility(View.INVISIBLE);
                    lyCSV.setVisibility(View.INVISIBLE);
//                    new HttpRequestTaskCliente().execute();
                } else if (id == R.id.rdEfectivo) {
                    rdEfectivo.setChecked(true);
                    RegistrarPedidoActivity.tipoPago = Constantes.ID_FORMA_PAGO_EFECTIVO;
//                    lyLineaCredito.setVisibility(View.INVISIBLE);
                    lyBanco.setVisibility(View.INVISIBLE);
                    lyCuentaBancaria.setVisibility(View.INVISIBLE);
                    lyNumeroTarjeta.setVisibility(View.INVISIBLE);
                    lyNombre.setVisibility(View.INVISIBLE);
                    lyApellido.setVisibility(View.INVISIBLE);
                    lyFechaCaducidad.setVisibility(View.INVISIBLE);
                    lyCSV.setVisibility(View.INVISIBLE);
                } else if (id == R.id.rdTarjeta) {
                    rdTarjeta.setChecked(true);
                    RegistrarPedidoActivity.tipoPago = Constantes.ID_FORMA_PAGO_VISA;
                    lyBanco.setVisibility(View.INVISIBLE);
//                    lyLineaCredito.setVisibility(View.INVISIBLE);
                    lyCuentaBancaria.setVisibility(View.INVISIBLE);
                    lyNumeroTarjeta.setVisibility(View.VISIBLE);
                    lyNombre.setVisibility(View.VISIBLE);
                    lyApellido.setVisibility(View.VISIBLE);
                    lyFechaCaducidad.setVisibility(View.VISIBLE);
                    lyCSV.setVisibility(View.VISIBLE);
                } else if (id == R.id.rdTransferencia) {
                    new HttpRequestTaskBancos().execute();
                    rdTransferencia.setChecked(true);
                    RegistrarPedidoActivity.tipoPago = Constantes.ID_FORMA_PAGO_TRANSFERENCIA_BANCARIA;
//                    lyLineaCredito.setVisibility(View.INVISIBLE);
                    lyBanco.setVisibility(View.VISIBLE);
                    spnBanco.setVisibility(View.VISIBLE);
                    lyCuentaBancaria.setVisibility(View.VISIBLE);
                    lyNumeroTarjeta.setVisibility(View.INVISIBLE);
                    lyNombre.setVisibility(View.INVISIBLE);
                    lyApellido.setVisibility(View.INVISIBLE);
                    lyFechaCaducidad.setVisibility(View.INVISIBLE);
                    lyCSV.setVisibility(View.INVISIBLE);
                }
            }
        };
        rdConsignacion = (RadioButton) getView().findViewById(R.id.rdConsignacion);
        rdEfectivo = (RadioButton) getView().findViewById(R.id.rdEfectivo);
        rdTarjeta = (RadioButton) getView().findViewById(R.id.rdTarjeta);
        rdTransferencia = (RadioButton) getView().findViewById(R.id.rdTransferencia);

        rdConsignacion.setOnClickListener(ocl);
        rdEfectivo.setOnClickListener(ocl);
        rdTarjeta.setOnClickListener(ocl);
        rdTransferencia.setOnClickListener(ocl);

        txtCelularPedido.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                RegistrarPedidoActivity.celular = txtCelularPedido.getText().toString();
            }
        });
        txtNroTarjetaVisa.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                RegistrarPedidoActivity.txtNroTarjetaVisa = txtNroTarjetaVisa.getText().toString();
            }
        });
        txtNombreVisa.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                RegistrarPedidoActivity.txtNombreVisa = txtNombreVisa.getText().toString();
            }
        });
        txtApellidoVisa.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                RegistrarPedidoActivity.txtApellidoVisa = txtApellidoVisa.getText().toString();
            }
        });
        txtFechaVisa.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("onTextChanged", s.toString() + "-" + start + "-" + before + "-" + count);
                if (s.length() == 2 && count == 1) {
                    txtFechaVisa.setText(s + "/");
                    txtFechaVisa.setSelection(s.length() + 1);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                RegistrarPedidoActivity.txtFechaVisa = txtFechaVisa.getText().toString();
            }
        });
        txtVisaCSV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                RegistrarPedidoActivity.txtVisaCSV = txtVisaCSV.getText().toString();
            }
        });

        if (!RegistrarPedidoActivity.celular.equals("")) {
            txtCelularPedido.setText(RegistrarPedidoActivity.celular);
        }

        if (RegistrarPedidoActivity.tipoPago == Constantes.ID_FORMA_PAGO_VISA) {
            txtNroTarjetaVisa.setText(RegistrarPedidoActivity.txtNroTarjetaVisa);
            txtNombreVisa.setText(RegistrarPedidoActivity.txtNombreVisa);
            txtApellidoVisa.setText(RegistrarPedidoActivity.txtApellidoVisa);
            txtFechaVisa.setText(RegistrarPedidoActivity.txtFechaVisa);
            txtVisaCSV.setText(RegistrarPedidoActivity.txtVisaCSV);
        }

        cargarPantalla();

        super.onViewCreated(view, savedInstanceState);
    }

    private void cargarPantalla() {
        int id = RegistrarPedidoActivity.tipoPago;
        if (id == Constantes.ID_FORMA_PAGO_CONSIGNACION) {
            rdConsignacion.setChecked(true);
//            lyLineaCredito.setVisibility(View.VISIBLE);
            lyBanco.setVisibility(View.INVISIBLE);
            lyCuentaBancaria.setVisibility(View.INVISIBLE);
            lyNumeroTarjeta.setVisibility(View.INVISIBLE);
            lyNombre.setVisibility(View.INVISIBLE);
            lyApellido.setVisibility(View.INVISIBLE);
            lyFechaCaducidad.setVisibility(View.INVISIBLE);
            lyCSV.setVisibility(View.INVISIBLE);
        } else if (id == Constantes.ID_FORMA_PAGO_EFECTIVO) {
            rdEfectivo.setChecked(true);
            lyBanco.setVisibility(View.INVISIBLE);
            lyCuentaBancaria.setVisibility(View.INVISIBLE);
            lyNumeroTarjeta.setVisibility(View.INVISIBLE);
            lyNombre.setVisibility(View.INVISIBLE);
            lyApellido.setVisibility(View.INVISIBLE);
            lyFechaCaducidad.setVisibility(View.INVISIBLE);
            lyCSV.setVisibility(View.INVISIBLE);
        } else if (id == Constantes.ID_FORMA_PAGO_VISA) {
            rdTarjeta.setChecked(true);
            lyBanco.setVisibility(View.INVISIBLE);
            lyCuentaBancaria.setVisibility(View.INVISIBLE);
            lyNumeroTarjeta.setVisibility(View.VISIBLE);
            lyNombre.setVisibility(View.VISIBLE);
            lyApellido.setVisibility(View.VISIBLE);
            lyFechaCaducidad.setVisibility(View.VISIBLE);
            lyCSV.setVisibility(View.VISIBLE);
        } else if (id == Constantes.ID_FORMA_PAGO_TRANSFERENCIA_BANCARIA) {
            rdTransferencia.setChecked(true);
            lyBanco.setVisibility(View.VISIBLE);
            spnBanco.setVisibility(View.VISIBLE);
            lyCuentaBancaria.setVisibility(View.VISIBLE);
            lyNumeroTarjeta.setVisibility(View.INVISIBLE);
            lyNombre.setVisibility(View.INVISIBLE);
            lyApellido.setVisibility(View.INVISIBLE);
            lyFechaCaducidad.setVisibility(View.INVISIBLE);
            lyCSV.setVisibility(View.INVISIBLE);
            new HttpRequestTaskBancos().execute();
        }
        new HttpRequestTaskCliente().execute();
        if (Util.CLIENTE_SESSION.getSaldolineacredito() >= 500) {
            txtCredito.setTextColor(Color.BLACK);
            rdConsignacion.setEnabled(true);
        } else {
            txtCredito.setTextColor(Color.RED);
            rdConsignacion.setEnabled(false);
        }
//        Log.i("getSaldolineacredito", "" + Util.CLIENTE_SESSION.getSaldolineacredito());
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


    private class HttpRequestTaskBancos extends AsyncTask<Void, Void, List<Bancos>> {
        @Override
        protected List<Bancos> doInBackground(Void... params) {
            Log.i("doInBackground", "HttpRequestTaskBancos");
            try {
                String URL = Util.URL_SERVICE_BASE + "/bancos";
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
                ParameterizedTypeReference<List<Bancos>> responseType = new ParameterizedTypeReference<List<Bancos>>() {
                };
                ResponseEntity<List<Bancos>> respuesta = restTemplate.exchange(URL, HttpMethod.GET, null, responseType);
                List<Bancos> lista = respuesta.getBody();
                return lista;
            } catch (Exception e) {
                Log.i("Exception", "ERROR");
                Log.e("doInBackground", e.getMessage(), e);
            }
            Log.i("doInBackground", "fin");
            return new ArrayList<>();
        }

        @Override
        protected void onPostExecute(List<Bancos> lista) {
            Log.i("onPostExecute", "HttpRequestTaskBancos");
            Log.i("LISTA", "Bancos: " + lista.size());
            listaBancos = lista;
            List<String> items = new ArrayList<>();
            //items.add("BANCOS");
            for (Bancos tp : lista) {
                items.add(tp.getDescripcion());
            }
            ArrayAdapter<String> array = new ArrayAdapter<>(getActivity().getApplicationContext(), R.layout.simple_spinner_item, items);
            array.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
            spnBanco.setAdapter(array);
            spnBanco.setSelection(RegistrarPedidoActivity.indexBanco);
            Log.i("onPostExecute", "fin");
        }
    }

    private class HttpRequestTaskCliente extends AsyncTask<Void, Void, Cliente> {
        @Override
        protected Cliente doInBackground(Void... params) {
            try {
                String URL = Util.URL_SERVICE_BASE + "/cliente/" + Util.CLIENTE_SESSION.getNrodocumentocli();
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL);

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                Cliente cliente = restTemplate.getForObject(builder.build().encode().toUri(), Cliente.class);
                if (cliente != null)
                    Log.i("Cliente", cliente.toString());

                return cliente;
            } catch (Exception e) {
                Log.e(this.getClass().getName(), e.getMessage(), e);
            }
            return null;
        }

        @Override
        protected void onPostExecute(Cliente cliente) {
            Util.CLIENTE_SESSION = cliente;
            txtCredito.setText("S/ " + Util.formatearDecimales(cliente.getSaldolineacredito()));
        }

    }

}
