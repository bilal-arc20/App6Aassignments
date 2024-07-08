package com.example.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.appproject.R;

public class calculatorActivity extends AppCompatActivity  {
    EditText no1;
    EditText no2;
    Button Add;
    Button Sub;
    Button Mul;
    Button Div;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        no1 = (EditText) findViewById(R.id.editText1);
        no2 = (EditText) findViewById(R.id.editText2);
        Add = (Button) findViewById(R.id.Add);
        Sub = (Button) findViewById(R.id.Sub);
        Mul = (Button) findViewById(R.id.Mul);
        Div = (Button) findViewById(R.id.Div);
        Result = (TextView) findViewById(R.id.textView);


    }

    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        String oper = "";
        num1 = Float.parseFloat(no1.getText().toString());
        num2 = Float.parseFloat(no2.getText().toString());

        Result.setText(num1 + " " + oper + " " + num2 + " = " + result);

    }
}