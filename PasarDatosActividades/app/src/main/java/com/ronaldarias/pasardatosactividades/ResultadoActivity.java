package com.ronaldarias.pasardatosactividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        //getExtras devuelve un dato tipo Bundle
        //getIntent devuelve el intent q ha comenzado la actividad
        Bundle datos = getIntent().getExtras();

        int num1 = datos.getInt("numero1"); //aqui va la llave como string
        int num2 = datos.getInt("numero2"); //llave:valor
        int resultado = num1 + num2;

        TextView valor_resultado = (TextView) findViewById(R.id.txtResultado);
        valor_resultado.setText("El resultado es: " + resultado);
    }
}
