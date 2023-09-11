package com.example.calculatorapp_danielko_tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v){
        EditText input1 = findViewById(R.id.num1);
        int num1 = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        int num2 = Integer.parseInt(input2.getText().toString());
        int sum = num1 + num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + sum);
    }

    public void subtract(View v){
        EditText input1 = findViewById(R.id.num1);
        int num1 = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        int num2 = Integer.parseInt(input2.getText().toString());
        int sum = num1 - num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + sum);
    }

    public void multiply(View v){
        EditText input1 = findViewById(R.id.num1);
        int num1 = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        int num2 = Integer.parseInt(input2.getText().toString());
        int product = num1*num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + product);
    }

    public void divide(View v){
        EditText input1 = findViewById(R.id.num1);
        int num1 = Integer.parseInt(input1.getText().toString());
        EditText input2 = findViewById(R.id.num2);
        int num2 = Integer.parseInt(input2.getText().toString());
        int answer = num1/num2;
        TextView answerTV = findViewById(R.id.answerTV);
        answerTV.setText("" + answer);
    }
    // hello
}