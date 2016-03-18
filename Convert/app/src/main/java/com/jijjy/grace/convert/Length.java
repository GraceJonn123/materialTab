package com.jijjy.grace.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);


        EditText e1 = (EditText)findViewById(R.id.eext);
        EditText e2 = (EditText)findViewById(R.id.edi);
        TextView t1 = (TextView)findViewById(R.id.ex);

        int num1 = Integer.parseInt(e2.getText().toString());
        int num2 = 1000;
        int sum = num1 * num2;
        e1.setText(Integer.toString(sum));
    }
}
