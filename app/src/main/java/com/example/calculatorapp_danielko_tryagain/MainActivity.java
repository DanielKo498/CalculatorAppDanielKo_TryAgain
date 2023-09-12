package com.example.calculatorapp_danielko_tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String result = "";
    double num1;
    double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = "";
    }

    public void switchScreens(View v){


    }

    public void numbers(View v){
        EditText input1 = findViewById(R.id.num1);
        if(v.getId() == R.id.button1){
            result += 1;
            input1.setText(result);
        }
        // get number
        // if number equals this then set it or add to the editText
        // set
    }

    public void add(View v){

        EditText input1 = findViewById(R.id.num1);
        double num1 = Double.parseDouble(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        double num2 = Double.parseDouble(input2.getText().toString());
        double sum = num1 + num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + sum);
    }

    public void subtract(View v){
        EditText input1 = findViewById(R.id.num1);
        double num1 = Double.parseDouble(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        double num2 = Double.parseDouble(input2.getText().toString());
        double sum = num1 - num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + sum);
    }

    public void multiply(View v){
        EditText input1 = findViewById(R.id.num1);
        double num1 = Double.parseDouble(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        double num2 = Double.parseDouble(input2.getText().toString());
        double product = num1*num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + product);
    }

    public void divide(View v){
        EditText input1 = findViewById(R.id.num1);
        double num1 = Double.parseDouble(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        double num2 = Double.parseDouble(input2.getText().toString());
        double answer = num1/num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + answer);
    }
    // hello
}