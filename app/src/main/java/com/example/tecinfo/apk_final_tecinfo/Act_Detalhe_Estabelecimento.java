package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
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
        Fragment_Avaliacao.OnFragmentInteractionListener,
        Fragment_Cardapio.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__detalhe__estabelecimento);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Fragment fragment = new Fragment_Ambiente();
        getSupportFragmentManager().beginTransaction().replace(R.id.parafragmet, fragment).commit();
        //#############################################
        //####Botões que iram chamar os Fragments######
        //#############################################
        final ImageButton btn_Ambiente = findViewById(R.id.btn_Ambiente);
        final ImageButton btn_Pratos = findViewById(R.id.btn_Pratos);
        final ImageButton btn_Cardapio = findViewById(R.id.btn_Cardapio);
        final ImageButton btn_Avaliacao = findViewById(R.id.btn_Avaliacao);
        final ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.layout_Endereco);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Act_Mapa.class);
                startActivity(it);
                finish();
            }
        });


        btn_Ambiente.setBackgroundResource(R.color.Cor_troca_de_botao);
        btn_Ambiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment_Ambiente();
                getSupportFragmentManager().beginTransaction().replace(R.id.parafragmet, fragment).commit();
                btn_Ambiente.setBackgroundResource(R.color.Cor_troca_de_botao);
                btn_Pratos.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Cardapio.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Avaliacao.setBackgroundResource(R.color.Cor_troca_de_botao_b);
            }
        });

        btn_Pratos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment_Pratos();
                getSupportFragmentManager().beginTransaction().replace(R.id.parafragmet, fragment).commit();
                btn_Ambiente.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Pratos.setBackgroundResource(R.color.Cor_troca_de_botao);
                btn_Cardapio.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Avaliacao.setBackgroundResource(R.color.Cor_troca_de_botao_b);
            }
        });

        btn_Cardapio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment_Cardapio();
                getSupportFragmentManager().beginTransaction().replace(R.id.parafragmet, fragment).commit();
                btn_Ambiente.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Pratos.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Cardapio.setBackgroundResource(R.color.Cor_troca_de_botao);
                btn_Avaliacao.setBackgroundResource(R.color.Cor_troca_de_botao_b);
            }
        });

        btn_Avaliacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Fragment_Avaliacao();
                getSupportFragmentManager().beginTransaction().replace(R.id.parafragmet, fragment).commit();
                btn_Ambiente.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Pratos.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Cardapio.setBackgroundResource(R.color.Cor_troca_de_botao_b);
                btn_Avaliacao.setBackgroundResource(R.color.Cor_troca_de_botao);

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
            getSupportActionBar().setTitle("Restaurante");
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
            } else if (id_list == 1 || id_list == 7) {
                String comentario = (String) "Bacalhau, paella e carnes assadas em espaço com decoração contemporânea," +
                        " área infantil e clima descontraído.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_2);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3341-6464");
                txt_Site.setText("http://campinagrill.com.br");
            } else if (id_list == 2 || id_list == 8) {
                String comentario = (String) "Restaurante espaçoso serve menu de especialidades nordestinas diversas " +
                        "em ambiente familiar rústico-elegante.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_3);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3321-2877");
                txt_Site.setText("https://pt-br.facebook.com/pages/Manoel-da-Carne-de-Sol");

            } else if (id_list == 3 || id_list == 9) {
                String comentario = (String) "O menu chinês fumegante inventivo e tradicional à la carte, em espaço despretensioso," +
                        " aberto e ventilado.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_4);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3341-1812");
                txt_Site.setText("http://www.restaurantechinataiwan.com.br/");

            } else if (id_list == 4 || id_list == 10) {
                String comentario = (String) "O menu chinês fumegante inventivo e tradicional à la carte, em espaço despretensioso," +
                        " aberto e ventilado.";
                txt_Comentario.setText(comentario);
                img.setImageResource(R.drawable.r_5);
                txt_Endereco.setText(listEndereco + listCidade);
                txt_Telefone.setText("(83) 3341-1812");
                txt_Site.setText("http://www.restaurantechinataiwan.com.br/");

            }


        } else if (identificador.equals("2")) {
            getSupportActionBar().setTitle("Pizzaria");
            txt_Tipo.setText("Pizzaria");
            txt_Status.setText("Aberto");
            txt_Horario.setText("Horário:  16:00–00:00");
            txt_Endereco.setText(listEndereco + listCidade);


            if (id_list == 0 || id_list == 6) {
                String comentario = (String) "Rede de restaurantes delivery/para viagem com grande variedade de pizzas," +
                        " frango e outros.";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3077-7777");
                txt_Site.setText("https://www.dominos.com.br/");
                img.setImageResource(R.drawable.p_1);

            } else if (id_list == 1 || id_list == 7) {
                String comentario = (String) "Rede de pizzarias com ambiente familiar que serve pizzas à la carte.";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3066-2217");
                txt_Site.setText("https://www.pizzahut.com.br/\n");
                img.setImageResource(R.drawable.p_2);

            } else if (id_list == 2 || id_list == 8) {
                String comentario = (String) "Rede de pizzarias com ambiente familiar que serve pizzas à la carte.";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3201-0456");
                txt_Site.setText("http://pizzariadobeguinha.wixsite.com/pizzaria-do-beguinha");
                img.setImageResource(R.drawable.p_3);

            } else if (id_list == 3 || id_list == 9) {
                String comentario = (String) "Espaço simples e boêmio com área externa coberta que" +
                        " serve pizzas tradicionais com sabores doces e mistos.";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 98676-1702");
                txt_Site.setText("https://pizzariaexpress-pizzarestaurant.negocio.site/");
                img.setImageResource(R.drawable.p_4);

            }

        } else if (identificador.equals("3")) {
            getSupportActionBar().setTitle("Parques");
            txt_Tipo.setText("Parques");
            txt_Status.setText("Aberto");
            txt_Horario.setText("Horário:  24h");
            txt_Endereco.setText(listEndereco + listCidade);

            if (id_list == 0 || id_list == 6) {
                String comentario = (String) "Um parque muito legal criado pelo nosso amigo gilmar";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3337-4122");
                txt_Site.setText("remigio.pb.gov.br");
                img.setImageResource(R.drawable.parque_1);

            } else if (id_list == 1 || id_list == 7) {
                String comentario = (String) "Parque urbano com obelisco alto, palmeiras e outras árvores, além de quiosques," +
                        " bancos e teatro ao ar livre.";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3337-4122");
                txt_Site.setText("campinagrande.pb.gov.br");
                img.setImageResource(R.drawable.parque_2);
            } else if (id_list == 2 || id_list == 8) {
                String comentario = (String) "Criado Também  por nosso amigo Gilmar, Fica com Deus man";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3337-4122");
                txt_Site.setText("campinagrande.pb.gov.br");
                img.setImageResource(R.drawable.parque_3);

            } else if (id_list == 3 || id_list == 9) {
                String comentario = (String) "Parque massa criado por Gilmarbrow";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3337-4122");
                txt_Site.setText("m.facebook.com/parquedacrianca);");
                img.setImageResource(R.drawable.parque_4);

            } else if (id_list == 4 || id_list == 10) {
                String comentario = (String) "Criado por Gilmar para seu melhor conforto";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3337-4122");
                txt_Site.setText("campinagrande.pb.gov.br");
                img.setImageResource(R.drawable.parque_5);

            }

        } else if (identificador.equals("4")) {
            getSupportActionBar().setTitle("Piscinas");
            txt_Tipo.setText("Piscinas");
            txt_Status.setText("Aberto");
            txt_Horario.setText("Horário:  07:00–00:00");

            if (id_list == 0 || id_list == 6) {
                String comentario = (String) "Gilmar pai velho criou tudo";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 99996-0289");
                txt_Site.setText("http://afrafep.com.br/a");
                img.setImageResource(R.drawable.pisc_1);

            } else if (id_list == 1 || id_list == 7) {
                String comentario = (String) "Somos amigos, amigos do peito " +
                        "Amigos de uma vez " +
                        "Somos amigos, amigos do peito " +
                        "Amigos de vocês";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3099-6620");
                txt_Site.setText("http://www.piscinafiber.com.br/ ");
                img.setImageResource(R.drawable.pisc_2);

            } else if (id_list == 2 || id_list == 8) {
                String comentario = (String) "Viver a vida" +
                        "Viajando nas canções" +
                        "Viver cantando" +
                        "Alegrando os corações";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText(" 99151-2303");
                txt_Site.setText("http://www.piscinafiber.com.br/ ");
                img.setImageResource(R.drawable.pisc_3);

            } else if (id_list == 3 || id_list == 9) {
                String comentario = (String) "Uni, duni, duni, tê " +
                        "Oh, oh, oh, oh, oh, oh " +
                        "Salamê minguê " +
                        "Oh, oh, oh, oh, oh, oh " +
                        "Sorvete colorê " +
                        "Sonho encantado, onde está você?";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(83) 3099-6620");
                txt_Site.setText("http://www.piscinafiber.com.br/ ");
                img.setImageResource(R.drawable.pisc_4);

            }


        } else if (identificador.equals("5")) {
            getSupportActionBar().setTitle("Lanchonete");

        } else if (identificador.equals("6")) {
            getSupportActionBar().setTitle("Outros");
            txt_Status.setText("Aberto");
            txt_Horario.setText("Horário:  07:00–00:00");
            Toast.makeText(getApplicationContext(), "lfgjkalkjfa", Toast.LENGTH_LONG).show();

            if (1 == 1) {

                String comentario = (String) "Bom para levar crianças";
                txt_Comentario.setText(comentario);
                txt_Telefone.setText("(81) 3371-9111");
                txt_Tipo.setText("Pescaria e Lazer");
                txt_Site.setText("coqueiralpark.com.br");
                img.setImageResource(R.drawable.outro_1);}

//            } else if (id_list == 1 || id_list == 7) {
//
//                String comentario = (String) "Eu quis saber da minha estrela guia " +
//                        "Onde andaria meu sonho encantado " +
//                        "Fada-madrinha, vara de condão " +
//                        "Esse meu coração sonhando acordado";
//                txt_Comentario.setText(comentario);
//                txt_Telefone.setText("(81) 99926-7878");
//                txt_Tipo.setText("Espaço Lazer");
//                txt_Site.setText("hquewrgsgsrk.com.br");
//                img.setImageResource(R.drawable.outro_2);
//
//            } else if (id_list == 2 || id_list == 8) {
//
//                String comentario = (String) "Piuí Piuí, Piuí Abacaxi Choque choque choque, choque por aí";
//                txt_Comentario.setText(comentario);
//                txt_Telefone.setText("(83) 3513-8961");
//                txt_Tipo.setText("Lago");
//                txt_Site.setText("lagoscountryeresort.com.br");
//                img.setImageResource(R.drawable.outro_3);
//
//            } else if (id_list == 3 || id_list == 9) {
//
//                String comentario = (String) "Não é sobre ter todas as pessoas do mundo pra si";
//                txt_Comentario.setText(comentario);
//                txt_Telefone.setText("(84) 98712-5922");
//                txt_Tipo.setText("Lazer e Descanso ");
//                txt_Site.setText("gilmar.com.br");
//                img.setImageResource(R.drawable.outro_4);
//
//            } else if (id_list == 4 || id_list == 10) {
//
//                String comentario = (String) "Love of my life, you've hurt me " +
//                        "You've broken my heart " +
//                        "And now you leave me";
//                txt_Comentario.setText(comentario);
//                txt_Telefone.setText("(83) 98873-6770");
//                txt_Tipo.setText("Lazer e Descanso ");
//                txt_Site.setText("recantodolazer.com.br");
//                img.setImageResource(R.drawable.outro_5);
//
//            }

        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
