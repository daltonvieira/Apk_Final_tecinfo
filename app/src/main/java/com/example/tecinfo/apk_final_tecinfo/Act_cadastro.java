package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_cadastro);

    }
    public void onClickVoltar(View view){
        Intent it = new Intent(Act_cadastro.this, Act_Login.class);
        startActivity(it);
        finish();
    }

    public void onClickProximo(View view){
        Intent it = new Intent(Act_cadastro.this, Act_Cadastro2.class);
        startActivity(it);
        finish();
    }
}
