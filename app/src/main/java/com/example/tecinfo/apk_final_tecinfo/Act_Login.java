package com.example.tecinfo.apk_final_tecinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act__login);

        Button avanca = (Button) findViewById(R.id.btn_Avancar);
        avanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Act_Principal.class);
                startActivity(it);
                finish();

            }
        });
    }
}
