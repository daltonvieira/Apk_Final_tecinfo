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
        final String identificador =  intentRecebido.getStringExtra("identificador");
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
                    it.putExtra("Nome", listViews.get(position).getNome());
                    it.putExtra("Imagem", listViews.get(position).getImagen());
                    it.putExtra("Endereço", listViews.get(position).getEndereco());
                    it.putExtra("Cidade", listViews.get(position).getCidade());
                    it.putExtra("Identificador",  identificador);
                    it.putExtra("Id_List", position);
                    startActivity(it);
                    finish();
                    //Toast.makeText(getApplicationContext(), "gjaçjga" +position + identificador, Toast.LENGTH_LONG).show();

                }
            });

        }else if (identificador.equals("2")){
            getSupportActionBar().setTitle("Pizzarias");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            final ArrayList <ListView> listViews = adicionarLocais(identificador);
            ArrayAdapter adapter = new ListViewAdapter(this, listViews);
            lista.setAdapter(adapter);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent it = new Intent(getApplicationContext(), Act_Detalhe_Estabelecimento.class);
                    it.putExtra("Nome", listViews.get(position).getNome());
                    it.putExtra("Imagem", listViews.get(position).getImagen());
                    it.putExtra("Endereço", listViews.get(position).getEndereco());
                    it.putExtra("Cidade", listViews.get(position).getCidade());
                    it.putExtra("Identificador",  identificador);
                    it.putExtra("Id_List", position);
                    startActivity(it);
                    finish();
                }
            });


        }else if (identificador.equals("3")){
            getSupportActionBar().setTitle("Parques");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            final ArrayList <ListView> listViews = adicionarLocais(identificador);
            ArrayAdapter adapter = new ListViewAdapter(this, listViews);
            lista.setAdapter(adapter);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent it = new Intent(getApplicationContext(), Act_Detalhe_Estabelecimento.class);
                    it.putExtra("Nome", listViews.get(position).getNome());
                    it.putExtra("Imagem", listViews.get(position).getImagen());
                    it.putExtra("Endereço", listViews.get(position).getEndereco());
                    it.putExtra("Cidade", listViews.get(position).getCidade());
                    it.putExtra("Identificador",  identificador);
                    it.putExtra("Id_List", position);
                    startActivity(it);
                    finish();
                }
            });

        }else if (identificador.equals("4")){
            getSupportActionBar().setTitle("Piscinas");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            final ArrayList <ListView> listViews = adicionarLocais(identificador);
            ArrayAdapter adapter = new ListViewAdapter(this, listViews);
            lista.setAdapter(adapter);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent it = new Intent(getApplicationContext(), Act_Detalhe_Estabelecimento.class);
                    it.putExtra("Nome", listViews.get(position).getNome());
                    it.putExtra("Imagem", listViews.get(position).getImagen());
                    it.putExtra("Endereço", listViews.get(position).getEndereco());
                    it.putExtra("Cidade", listViews.get(position).getCidade());
                    it.putExtra("Identificador",  identificador);
                    it.putExtra("Id_List", position);
                    startActivity(it);
                    finish();
                }
            });

        }else if (identificador.equals("5")){

            getSupportActionBar().setTitle("Lanchonetes");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            final ArrayList <ListView> listViews = adicionarLocais(identificador);
            ArrayAdapter adapter = new ListViewAdapter(this, listViews);
            lista.setAdapter(adapter);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent it = new Intent(getApplicationContext(), Act_Detalhe_Estabelecimento.class);
                    it.putExtra("Nome", listViews.get(position).getNome());
                    it.putExtra("Imagem", listViews.get(position).getImagen());
                    it.putExtra("Endereço", listViews.get(position).getEndereco());
                    it.putExtra("Cidade", listViews.get(position).getCidade());
                    it.putExtra("Identificador",  identificador);
                    it.putExtra("Id_List", position);
                    startActivity(it);
                    finish();
                }
            });

        }else if (identificador.equals("6")){

            getSupportActionBar().setTitle("Outros");

            android.widget.ListView lista = (android.widget.ListView) findViewById(R.id.lv_Locais);
            final ArrayList <ListView> listViews = adicionarLocais(identificador);
            ArrayAdapter adapter = new ListViewAdapter(this, listViews);
            lista.setAdapter(adapter);

            lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent it = new Intent(getApplicationContext(), Act_Detalhe_Estabelecimento.class);
                    it.putExtra("Nome", listViews.get(position).getNome());
                    it.putExtra("Imagem", listViews.get(position).getImagen());
                    it.putExtra("Endereço", listViews.get(position).getEndereco());
                    it.putExtra("Cidade", listViews.get(position).getCidade());
                    it.putExtra("Identificador",  identificador);
                    startActivity(it);
                    finish();

                }
            });


        }


    }

    private ArrayList<ListView> adicionarLocais(String id){
        ArrayList<ListView> list = new ArrayList<ListView>();


        if (id.equals("1")) {

             int x = 0;
             while (x<5){
                 x++;

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

             }

        }else if(id.equals("2")){
            int x = 0;

            while (x<5){
                x++;

                ListView e = new ListView("Domino's Pizza",
                        "R. João Maria de Souza Ribeiro, 64 - Jardim Tavares", "Campina Grande - PB", R.drawable.p_1, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);
                e = new ListView("Pizza Hut",
                        "Av. Pref. Severino Bezerra Cabral, 1050 - Loja 3005 - Catolé", "Campina Grande - PB", R.drawable.p_2, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);
                e = new ListView("Pizzaria do Beguinha",
                        "Rua Manoel Tavares, 1142 - Lauritzen", "Campina Grande - PB", R.drawable.p_3, R.drawable.star1,R.drawable.p_4, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);
                e = new ListView("Pizzaria Express",
                        "R. Clementino Siqueira, 295 - Jardim Tavares", "Campina Grande - PB", R.drawable.p_4, R.drawable.p_4, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);


            }

        }else if(id.equals("3")){
            int x = 0;

            while (x<5){
                x++;
                ListView e = new ListView("Lagoa Parque Senhor dos Passos",
                        "Av. Joaquim Cavalcante, 361-629", "Remígio - PB", R.drawable.parque_1, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

                e = new ListView("Parque Açude Novo",
                        "R. Dom Pedro II - Centro", "Campina Grande - PB", R.drawable.parque_2, R.drawable.p_4, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

                e = new ListView("Parque Bodocongó",
                        "Av. Juvêncio Arruda, 1232-1310 - Bodocongó", "Campina Grande - PB", R.drawable.parque_3, R.drawable.p_4, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

                e = new ListView("Parque da Criança",
                                "Av. Dr. Elpídio de Almeida, 215 - Catolé", "Campina Grande - PB", R.drawable.parque_4, R.drawable.p_4, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

                e = new ListView("Parque da Liberdade",
                        "R. Getúlio Cavalcante - Liberdade", "Campina Grande - PB", R.drawable.parque_4, R.drawable.p_4, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);



            }

        }else if(id.equals("4")){
            int x = 0;

            while (x<5){
                x++;

                ListView e = new ListView("Afrafep - Balneário",
                        " R. Vicente Gomes Almeida, 58108-293 - Bodocongó", "Campina Grande - PB", R.drawable.pisc_1, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);
                e = new ListView("Balneário Roda D'água",
                        "R. Sn 107 - Aeroporto, Bayeux - PB", "Bayenux - PB", R.drawable.pisc_2, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);
                e = new ListView("Piscina Paraiso Do Castanho",
                        "R. João Miranda, 1417 - Castanho", "Queimadas - PB",  R.drawable.pisc_3, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);
                e = new ListView("Piscinas Fiber ®",
                        "Av. Pref. Severino Bezerra Cabral, 155 - José Pinheiro", "Campina Grande - PB",  R.drawable.pisc_4, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

            }

        }else if(id.equals("5")){
            int x = 0;

            while (x<5){
                x++;

            }

        }else if(id.equals("6")){
            int x = 0;

            while (x<5){
                x++;
                ListView e = new ListView("Coqueiral Park - Pescaria e Lazer",
                        " Avenida Lígia Gomes, II Perimetral Norte, s/n - Ouro Preto", "Olinda - PE", R.drawable.outro_1, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

                e = new ListView("Espaço de Lazer Santa Eufémia",
                        "PE-027, Abreu e Lima - PE", " Abreu e Lima - PE ",  R.drawable.outro_2, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

                e = new ListView("Lagos Country e Resort",
                        "BR-230, 083 - Centro,", "Riachão do Poço - PB",  R.drawable.outro_3, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);

                e = new ListView("Pousada Lazer do Sol",
                        "Thelpa, Lucena - PB, 58315-000", "Lucena - PB",  R.drawable.outro_4, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);

                e = new ListView("Recanto Do Lazer",
                        "Loc Granja Santa Maria, S/N - Zona Rural", "Santa Rita - PB",  R.drawable.outro_5, R.drawable.star1, R.drawable.star1, R.drawable.star1, R.drawable.star2, R.drawable.star2);
                list.add(e);
            }

        }



        return list;

    }


}
