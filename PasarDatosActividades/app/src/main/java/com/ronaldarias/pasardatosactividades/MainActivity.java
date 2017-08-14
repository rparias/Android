package com.ronaldarias.pasardatosactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View view){

        EditText edtNum1 = (EditText) findViewById(R.id.edtNum1);
        EditText edtNum2 = (EditText) findViewById(R.id.edtNum2);

        Intent intent = new Intent(this, ResultadoActivity.class);

        //putExtra devuelve un objeto tipo Intent, sus parametros son un String y un Bundle
        intent.putExtra("numero1", Integer.parseInt(edtNum1.getText().toString()));
        intent.putExtra("numero2", Integer.parseInt(edtNum2.getText().toString()));

        startActivity(intent);
    }
}
