package br.com.etechoracio.viagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtTempoGasto;

    EditText txtVelocidadeMedia;

    EditText txtRendimentoVeiculo;
    TextView lblDistancia;
    TextView lblConsumo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTempoGasto = findViewById(R.id.txtTempoGasto);

        txtVelocidadeMedia = findViewById(R.id.txtVelocidadeMedia);

        txtRendimentoVeiculo = findViewById(R.id.txtRendimentoVeiculo);

        lblDistancia =  findViewById(R.id.lblDistancia);

        lblConsumo =  findViewById(R.id.lblConsumo);

    }

    public void onCalcular(View v){

    double tg = Double.parseDouble(txtTempoGasto.getText().toString());
    double vm = Double.parseDouble(txtVelocidadeMedia.getText().toString());
    double rv = Double.parseDouble (txtRendimentoVeiculo.getText().toString());
    double distancia = tg * vm ;
        lblDistancia.setText(String.valueOf(distancia));

        double consumo = (tg * vm)/rv;
        lblConsumo.setText(String.valueOf(consumo));

    }
}
