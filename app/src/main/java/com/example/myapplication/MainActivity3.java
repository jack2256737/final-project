package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private TextView textViewFinalScore;
    private Button btn_ret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textViewFinalScore = findViewById(R.id.textViewFinalScore);
        btn_ret = findViewById(R.id.btn_ret);

        int finalScore = getIntent().getIntExtra("final_score", 0);
        int finalScore1 = finalScore*2/3;
        String passStatus = (finalScore1 >= 60) ? "恭喜!!" : "再接再厲。";
        String message = "你的總分：" + finalScore1 + "，" + passStatus;

        textViewFinalScore.setText(message);

        btn_ret=findViewById(R.id.btn_ret);
        Intent intent_toPage1 = new Intent(this,MainActivity1.class);
        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent_toPage1);
            }
        });
    }
}
