package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    TextView Answer;
    Button add, sub, mult, div, mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirst = findViewById(R.id.etFirst);
        etSecond = findViewById(R.id.etSecond);

        Answer = findViewById(R.id.Answer);
        add = findViewById(R.id.btnAdd);
        sub = findViewById(R.id.btnSub);
        mult = findViewById(R.id.btnmult);
        div = findViewById(R.id.btndiv);
        mod = findViewById(R.id.btnmod);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s;
                f = Integer.parseInt(etFirst.getText().toString());
                s = Integer.parseInt(etSecond.getText().toString());
                f = f + s;
                Answer.setText("Ans = "+f);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s;
                f = Integer.parseInt(etFirst.getText().toString());
                s = Integer.parseInt(etSecond.getText().toString());
                f = f - s;
                Answer.setText("Ans = "+f);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s;
                f = Integer.parseInt(etFirst.getText().toString());
                s = Integer.parseInt(etSecond.getText().toString());
                f = f * s;
                Answer.setText("Ans = "+f);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s;
                f = Integer.parseInt(etFirst.getText().toString());
                s = Integer.parseInt(etSecond.getText().toString());
                f = f / s;
                Answer.setText("Ans = "+f);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s;
                f = Integer.parseInt(etFirst.getText().toString());
                s = Integer.parseInt(etSecond.getText().toString());
                f = f % s;
                Answer.setText("Ans = "+f);
            }
        });
    }
}