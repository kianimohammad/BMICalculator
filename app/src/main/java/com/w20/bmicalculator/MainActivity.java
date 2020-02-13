package com.w20.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText massTxt;
    EditText heightTxt;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * instantiating the variables
        * */
        massTxt = findViewById(R.id.massTxt);
        heightTxt = findViewById(R.id.heightTxt);
        resultTxt = findViewById(R.id.resultTxt);
    }

    public void calculate(View v) {
        if (!massTxt.getText().toString().isEmpty() && !heightTxt.getText().toString().isEmpty()) {
            double mass = Double.valueOf(massTxt.getText().toString());
            double height = Double.valueOf(heightTxt.getText().toString());
            double result = (mass / Math.pow(height, 2));
            resultTxt.setText(String.format("%.2f", result));

            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
            intent.putExtra("resultValue", result);
            startActivity(intent);
        }
    }
}
