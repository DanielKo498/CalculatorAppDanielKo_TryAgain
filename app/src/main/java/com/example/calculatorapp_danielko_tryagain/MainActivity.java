package com.example.calculatorapp_danielko_tryagain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public String result = "";
    double input1;
    double input2;

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
        TextView input1 = findViewById(R.id.num1);
        if(v.getId() != R.id.addButton && v.getId() != R.id.subtractButton && v.getId() != R.id.divideButton && v.getId() != R.id.multiplyButton){
            Log.i("result", "entered while loop");
            if(v.getId() == R.id.button1){
                result += 1;
                num1 += 1;
                input1.setText(result);
                Log.i("result", num1 + "");
            }
            else if(v.getId() == R.id.button2){
                result += 2;
                num2 += 2;
                input1.setText(result);
            }
        }

        // add operation to result after while loop breaks
        if(v.getId() == R.id.addButton){
            result+= "+";
            input1.setText(result);
        }

//        while(v.getId() != R.id.addButton || v.getId() != R.id.subtractButton || v.getId() != R.id.divideButton || v.getId() != R.id.multiplyButton){
//            if(v.getId() == R.id.button1){
//                result += 1;
//                num2 += 1;
//                input1.setText(result);
//            }
//            if(v.getId() == R.id.button2){
//                result += 2;
//                num2 += 2;
//                input1.setText(result);
//            }
//        }
//        if(v.getId() == R.id.addButton){
//            TextView answerTV = findViewById(R.id.answerTV);
//            String answer = add(num1, num2) + "";
//            answerTV.setText(answer);
//        }


    }

    public static Double add(Double input1, Double input2){
        double num1 = (input1);
        double num2 = (input2);
        double sum = num1 + num2;
        return sum;

    }

    
}