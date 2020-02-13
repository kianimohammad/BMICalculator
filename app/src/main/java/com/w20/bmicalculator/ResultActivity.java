package com.w20.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        res = findViewById(R.id.resField);

        Intent intent = getIntent();
        double result = intent.getExtras().getDouble("resultValue");
        res.setText(String.format("Body Mass: %.2f", result));
    }
}
