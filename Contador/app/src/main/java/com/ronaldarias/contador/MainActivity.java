package com.ronaldarias.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    //variable para contar las pulsaciones
    public int contador;
    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoResultado = (TextView)findViewById(R.id.txtContador);

        contador = 0;
    }

    //metodo para incrementar
    public void incrementarContador(View Vista){
        contador++;
        textoResultado.setText("" + contador);
    }

    //metodo para decrementar
    public void decrementarContador(View Vista){
        contador--;
        if(contador < 0){
            CheckBox negativos = (CheckBox)findViewById(R.id.negativos);
            if(!negativos.isChecked())  //si no esta activado
                contador = 0;
        }
        textoResultado.setText("" + contador);
    }

    //metodo para resetear
    public void resetContador(View Vista){
        EditText numero_reset = (EditText)findViewById(R.id.txtReseteo);

        //en caso de q no se introduzca un valor salta la excepcion
        try{
            contador = Integer.parseInt(numero_reset.getText().toString()); //toString() porq no devuelve un String
        }catch (Exception e){
            contador = 0;
        }

        numero_reset.setText("");
        textoResultado.setText("" + contador);

        //almacena dentro de la instancia, el dispositivo que se usa para leer la informacion
        InputMethodManager miTeclado = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);

        //ocultar el teclado despues de escribir la casilla de texto del reset
        miTeclado.hideSoftInputFromWindow(numero_reset.getWindowToken(), 0);
    }

    /*
    //metodo para mostrar el resultado del contador
    public void mostrarResultado(){
        //R.id.txtContador es la ruta en recursos del txt del contador
        TextView textoResultado = (TextView)findViewById(R.id.txtContador);
        textoResultado.setText(""+contador);
    }*/
}
