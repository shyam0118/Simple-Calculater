package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Add(View v){
        EditText t1 = (EditText)findViewById(R.id.editTextNumber);
        String val1 = t1.getText().toString();
        int n1 = Integer.parseInt(val1);

        EditText t2 = (EditText)findViewById(R.id.editTextNumber2);
        String val2 = t2.getText().toString();
        int n2 = Integer.parseInt(val2);

        EditText t3 = (EditText)findViewById(R.id.editTextNumber3);

        int ans = n1 + n2;
        t3.setText(""+ans);
    }
    public void subtract(View v){
        EditText t1 = (EditText)findViewById(R.id.editTextNumber);
        String val1 = t1.getText().toString();
        int n1 = Integer.parseInt(val1);

        EditText t2 = (EditText)findViewById(R.id.editTextNumber2);
        String val2 = t2.getText().toString();
        int n2 = Integer.parseInt(val2);

        EditText t3 = (EditText)findViewById(R.id.editTextNumber3);

        int ans = n1 - n2;
        t3.setText(""+ans);
    }
    public void multiply(View v){
        EditText t1 = (EditText)findViewById(R.id.editTextNumber);
        String val1 = t1.getText().toString();
        int n1 = Integer.parseInt(val1);

        EditText t2 = (EditText)findViewById(R.id.editTextNumber2);
        String val2 = t2.getText().toString();
        int n2 = Integer.parseInt(val2);

        EditText t3 = (EditText)findViewById(R.id.editTextNumber3);

        int ans = n1 * n2;
        t3.setText(""+ans);
    }

    public void divide(View v) {
        EditText t1 = (EditText)findViewById(R.id.editTextNumber);
        String val1 = t1.getText().toString();
        int n1 = Integer.parseInt(val1);

        EditText t2 = (EditText)findViewById(R.id.editTextNumber2);
        String val2 = t2.getText().toString();
        int n2 = Integer.parseInt(val2);

        EditText t3 = (EditText)findViewById(R.id.editTextNumber3);

        int ans = n1 / n2;
        t3.setText(""+ans);
    }
}