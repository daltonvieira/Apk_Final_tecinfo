package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Act_Detalhe_Estabelecimento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__detalhe__estabelecimento);

        Intent it = getIntent();
        String parametro = (String) it.getSerializableExtra("nome");

        TextView txt = (TextView) findViewById(R.id.txt_parametro);
        txt.setText(parametro);
    }
}
