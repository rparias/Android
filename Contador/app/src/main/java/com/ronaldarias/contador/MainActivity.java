package com.ronaldarias.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    //variable para contar las pulsaciones
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
    }

    //metodo para incrementar
    public void incrementarContador(View Vista){
        contador++;
        mostrarResultado();
    }

    //metodo para decrementar
    public void decrementarContador(View Vista){
        contador--;
        mostrarResultado();
    }

    //metodo para resetear
    public void resetContador(View Vista){
        contador = 0;
        mostrarResultado();
    }

    //metodo para mostrar el resultado del contador
    public void mostrarResultado(){
        //R.id.txtContador es la ruta en recursos del txt del contador
        TextView textoResultado = (TextView)findViewById(R.id.txtContador);
        textoResultado.setText("Contador:" + contador);
    }
}
