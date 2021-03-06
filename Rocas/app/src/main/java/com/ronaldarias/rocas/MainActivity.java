package com.ronaldarias.rocas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //registro el nuevo toolbar
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        //activo el toolbar
        setSupportActionBar(toolbar);
    }

    public void ejecutar_info(View view){
        Intent intent = new Intent(this, InformacionActivity.class);
        startActivity(intent);
    }

    //metodo para salir de la app
    public void salirApp(View view){
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu miMenu){
        //getMenuInflater coloca el menu
        getMenuInflater().inflate(R.menu.menu_en_activity, miMenu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem opcion_menu){
        int id = opcion_menu.getItemId();

        if(id == R.id.itmConfiguracion)
            return true;
        if(id == R.id.itmInfo){
            ejecutar_info(null);
            return true;
        }

        //si no entra solo devuelve una opcion de menu
        return super.onOptionsItemSelected(opcion_menu);
    }
}
