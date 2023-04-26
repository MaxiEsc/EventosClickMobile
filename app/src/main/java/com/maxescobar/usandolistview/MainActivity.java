package com.maxescobar.usandolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvVista;
    private ListView listaNombres;

    private String nombres [] = {"Sonic","Verde","Salud","Valentin","Savedra","Septiembre","Sanic",
            "Amarillo","Enfermedad","Diablo","Sarmiento","julio","Sasala","Marron","Cielo","Facundo",
            "Concia","SaludMental","Fader","Azul","Feo","Valencia","Sea","Martin"};
    private String edades [] = {"19","74","54","34","76","18","19","74","54","34","76","18",
            "19","74","54","34","76","18","19","74","54","34","76","18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvVista = (TextView) findViewById(R.id.tv_Subtitulo);
        listaNombres = (ListView) findViewById(R.id.lv_Nombres);

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, R.layout.list_item_nombres, nombres);
        listaNombres.setAdapter(adapter);

        listaNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter,View view, int i, long l){
               tvVista.setText("La edad de " + listaNombres.getItemAtPosition(i) + " es " + edades[i] + " Años");
            }
        });
    }


}