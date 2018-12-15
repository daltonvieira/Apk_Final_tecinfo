package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Act_Lista_De_Locais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__lista__de__locais);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intentRecebido = getIntent();
        String identificador =  intentRecebido.getStringExtra("identificador");
        getSupportActionBar().setTitle("");
        getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.color.Cor_Icones_NavDrawer));

        android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
        ArrayAdapter adapter = new ListViewAdapter(this, adicionarLocais());
        lista.setAdapter(adapter);


        if (identificador.equals("1")){
            getSupportActionBar().setTitle("Restaurante");

        }else if (identificador.equals("2")){
            getSupportActionBar().setTitle("Bar");

        }else if (identificador.equals("3")){

        }


    }

    private ArrayList<ListView> adicionarLocais(){
        ArrayList<ListView> list = new ArrayList<ListView>();

        ListView e = new ListView("Colégio Estadual Atheneu Sergipense",
                "Rua Pacatuba S/N", R.drawable.fotousuario_apagar, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2 );
        list.add(e);
        e = new ListView("Escola Estadual General Siqueira",
                "Rua Sergipe S/N",  R.drawable.fotousuario_apagar, R.drawable.star1 , R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
        list.add(e);
        e = new ListView("Escola  Siqueira",
                "Rua Sergipe S/N",  R.drawable.fotousuario_apagar, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
        list.add(e);

        e = new ListView("Escola  Atheneu Siqueira",
                "Rua Sergipe S/N",  R.drawable.fotousuario_apagar, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
        list.add(e);

        e = new ListView("Escola  Kilindu Siqueira",
                "Rua Sergipe S/N",  R.drawable.fotousuario_apagar, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
        list.add(e);

        //aioyfoiahfoiahfoahfoahfoafafaf

        return list;

    }

}
