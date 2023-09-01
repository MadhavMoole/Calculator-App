package com.example.calciapp;

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

    public void numAdd(View view) {
        EditText t1 = (EditText) findViewById(R.id.num1);
        EditText t2 = (EditText) findViewById(R.id.num2);

        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());

        int result = num1 + num2;

        TextView res = (TextView) findViewById(R.id.txtResult);
        res.setText("the sum is: " + result);
    }

    public void numSub(View view) {
        EditText t1 = (EditText) findViewById(R.id.num1);
        EditText t2 = (EditText) findViewById(R.id.num2);

        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());

        int result = num1 - num2;

        TextView res = (TextView) findViewById(R.id.txtResult);
        res.setText("the subtraction is: " + result);
    }

    public void numPro(View view) {
        EditText t1 = (EditText) findViewById(R.id.num1);
        EditText t2 = (EditText) findViewById(R.id.num2);

        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());

        int result = num1 * num2;

        TextView res = (TextView) findViewById(R.id.txtResult);
        res.setText("the product is: " + result);
    }

    public void numDiv(View view) {
        EditText t1 = (EditText) findViewById(R.id.num1);
        EditText t2 = (EditText) findViewById(R.id.num2);

        int num1 = Integer.parseInt(t1.getText().toString());
        int num2 = Integer.parseInt(t2.getText().toString());

        int result = num1 / num2;

        TextView res = (TextView) findViewById(R.id.txtResult);
        res.setText("the quotient is: " + result);
    }
}