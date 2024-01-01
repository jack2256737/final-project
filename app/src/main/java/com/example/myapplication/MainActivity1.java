package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity1 extends AppCompatActivity {

    private Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        Intent intent_toPage2 = new Intent(this,MainActivity2.class);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",1);
                startActivity(intent_toPage2);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",2);
                startActivity(intent_toPage2);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",3);
                startActivity(intent_toPage2);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",4);
                startActivity(intent_toPage2);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",5);
                startActivity(intent_toPage2);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",6);
                startActivity(intent_toPage2);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",7);
                startActivity(intent_toPage2);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent_toPage2.putExtra("URL_key",8);
                startActivity(intent_toPage2);
            }
        });

    }
}
