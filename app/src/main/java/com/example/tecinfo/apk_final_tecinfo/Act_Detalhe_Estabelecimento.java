package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Act_Detalhe_Estabelecimento extends AppCompatActivity
    implements Fragment_Ambiente.OnFragmentInteractionListener,
        Fragment_Pratos.OnFragmentInteractionListener,
        Fragment_Cardapio.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__detalhe__estabelecimento);
        //#############################################
        //####Botões que iram chamar os Fragments######
        //#############################################
        ImageButton btn_Ambiente = findViewById(R.id.btn_Ambiente);
        ImageButton btn_Pratos = findViewById(R.id.btn_Pratos);
        ImageButton btn_Cardapio = findViewById(R.id.btn_Cardapio);
        btn_Ambiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment_Ambiente();
                getSupportFragmentManager() .beginTransaction() .replace(R.id.parafragmet, fragment) .commit();
            }
        });

        btn_Pratos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment_Pratos();
                getSupportFragmentManager() .beginTransaction() .replace(R.id.parafragmet, fragment) .commit();
            }
        });

        btn_Cardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment_Cardapio();
                getSupportFragmentManager() .beginTransaction() .replace(R.id.parafragmet, fragment) .commit();
            }
        });

        //##########################################
        //##########################################
        //##########################################

        Intent it = getIntent();
        String listNome = (String) it.getSerializableExtra("Nome");
        String listCidade = (String) it.getSerializableExtra("Cidade");
        ImageView listImagem = (ImageView) it.getSerializableExtra("Imagem");
        String listEndereco = (String) it.getSerializableExtra("Endereço");
        String identificador = (String) it.getSerializableExtra("Identificador");
        Integer id_list = (Integer) it.getSerializableExtra("Id_List");

        TextView txt_Nome = findViewById(R.id.txt_Nome);
        TextView txt_Comentario = findViewById(R.id.txt_Comentario);
        TextView txt_Tipo = findViewById(R.id.txt_Tipo);
        TextView txt_Status = findViewById(R.id.txt_Status);
        TextView txt_Horario = findViewById(R.id.txt_Horario);
        TextView txt_Endereco = findViewById(R.id.txt_Endereco);
        TextView txt_Telefone = findViewById(R.id.txt_Telefone);
        TextView txt_Site = findViewById(R.id.txt_Site);
        ImageView img = findViewById(R.id.img);

        txt_Nome.setText(listNome);

        if (identificador.equals("1")) {
            txt_Tipo.setText("Restaurante");
            txt_Status.setText("Aberto");
            txt_Horario.setText("Horário:  11:00–00:00");

            if (id_list == 0 || id_list == 6) {
                String comentario = (String) "Restaurante e bar serve menu de especialidades regionais," +
                        " em casa animada com salão aberto para a calçada.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_1);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3322-4232");
                txt_Site.setText("http://www.bardocuscuz.com/");
            }else if (id_list == 1 || id_list == 7){
                String comentario = (String) "Bacalhau, paella e carnes assadas em espaço com decoração contemporânea," +
                        " área infantil e clima descontraído.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_2);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3341-6464");
                txt_Site.setText("http://campinagrill.com.br");
            }else if (id_list == 2 || id_list == 8){
                String comentario = (String) "Restaurante espaçoso serve menu de especialidades nordestinas diversas " +
                        "em ambiente familiar rústico-elegante.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_3);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3321-2877");
                txt_Site.setText("https://pt-br.facebook.com/pages/Manoel-da-Carne-de-Sol");

            }else if(id_list == 3 || id_list == 9){
                String comentario = (String) "O menu chinês fumegante inventivo e tradicional à la carte, em espaço despretensioso," +
                        " aberto e ventilado.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_4);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3341-1812");
                txt_Site.setText("http://www.restaurantechinataiwan.com.br/");

            }else if (id_list == 4 || id_list == 10){
                String comentario = (String) "O menu chinês fumegante inventivo e tradicional à la carte, em espaço despretensioso," +
                        " aberto e ventilado.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_5);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3341-1812");
                txt_Site.setText("http://www.restaurantechinataiwan.com.br/");

            }



        } else{
            Toast.makeText(getApplicationContext(), "afafaf", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
