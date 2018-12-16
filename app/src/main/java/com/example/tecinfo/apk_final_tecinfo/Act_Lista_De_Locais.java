package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

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




        if (identificador.equals("1")){

            getSupportActionBar().setTitle("Restaurantes");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            final ArrayList <ListView> listViews = adicionarLocais(identificador);
            ArrayAdapter adapter = new ListViewAdapter(this, listViews);
            lista.setAdapter(adapter);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent it = new Intent(getApplicationContext(), Act_Detalhe_Estabelecimento.class);
                    it.putExtra("nome", listViews.get(position).getNome());
                    startActivity(it);
                    finish();
                }
            });

        }else if (identificador.equals("2")){
            getSupportActionBar().setTitle("Pizzarias");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            ArrayAdapter adapter = new ListViewAdapter(this, adicionarLocais(identificador));
            lista.setAdapter(adapter);

        }else if (identificador.equals("3")){
            getSupportActionBar().setTitle("Parques");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            ArrayAdapter adapter = new ListViewAdapter(this, adicionarLocais(identificador));
            lista.setAdapter(adapter);

        }else if (identificador.equals("4")){
            getSupportActionBar().setTitle("Piscinas");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            ArrayAdapter adapter = new ListViewAdapter(this, adicionarLocais(identificador));
            lista.setAdapter(adapter);
        }else if (identificador.equals("5")){

            getSupportActionBar().setTitle("Lanchonetes");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            ArrayAdapter adapter = new ListViewAdapter(this, adicionarLocais(identificador));
            lista.setAdapter(adapter);


        }else if (identificador.equals("6")){

            getSupportActionBar().setTitle("Outros");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            ArrayAdapter adapter = new ListViewAdapter(this, adicionarLocais(identificador));
            lista.setAdapter(adapter);


        }


    }

    private ArrayList<ListView> adicionarLocais(String id){
        ArrayList<ListView> list = new ArrayList<ListView>();


        if (id.equals("1")) {
            ListView e = new ListView("Bar do Cuscuz",
                    "R. Dr. Severino Cruz, 771 - Centro", "Campina Grande - PB", R.drawable.r_1, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
            list.add(e);
            e = new ListView("Campina Grill Restaurante",
                    "Rua Manoel Tavares, 1900 - Jardim Tavares", "Campina Grande - PB", R.drawable.r_2, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
            list.add(e);
            e = new ListView("Manoel da Carne de Sol",
                    "R. Félix Araújo, 263 - Centro", "Campina Grande - PB", R.drawable.r_3, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
            list.add(e);

            e = new ListView("Restaurante China Taiwan Campina Grande",
                    "R. Silva Jardim, 150 - Jardim Tavares", "Campina Grande - PB", R.drawable.r_4, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
            list.add(e);

            e = new ListView("Frida Tacos",
                    "R. Odon Bezerra, 392 - Liberdade", "Campina Grande - PB", R.drawable.r_5, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
            list.add(e);

        }else if(id.equals("2")){




        }else if(id.equals("3")){




        }else if(id.equals("4")){




        }else if(id.equals("5")){




        }else if(id.equals("6")){




        }



        return list;

    }


}
