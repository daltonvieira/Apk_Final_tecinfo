package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class Act_Lista_De_Locais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__lista__de__locais);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView tv = (TextView) findViewById(R.id.txt_identificador);

        Intent intentRecebido = getIntent();
        String identificador =  intentRecebido.getStringExtra("identificador");
        getSupportActionBar().setTitle("");
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.Cor_Icones_NavDrawer));


        if (identificador.equals("1")){
            getSupportActionBar().setTitle("Restaurante");

        }else if (identificador.equals("2")){
            getSupportActionBar().setTitle("Bar");

        }else if (identificador.equals("3")){

        }


    }
}
