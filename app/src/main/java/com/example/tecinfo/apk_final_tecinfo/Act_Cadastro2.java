package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Act_Cadastro2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__cadastro2);
    }

    public void onClickVoltar(View view){
        Intent it = new Intent(Act_Cadastro2.this, Act_cadastro.class);
        startActivity(it);
        finish();
    }

    public void onClickConcluir(View view){
        Intent it = new Intent(Act_Cadastro2.this,Act_Login.class);
        startActivity(it);
        finish();
    }
}
