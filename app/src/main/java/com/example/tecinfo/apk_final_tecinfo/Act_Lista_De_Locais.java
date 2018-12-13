package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Act_Lista_De_Locais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act__lista__de__locais);

        TextView tv = (TextView) findViewById(R.id.txt_identificador);

        Intent intentRecebido = getIntent();
        String identificador =  intentRecebido.getStringExtra("identificador");

        tv.setText(identificador);


    }
}
