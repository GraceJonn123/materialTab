package com.jijjy.grace.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        EditText e1 = (EditText)findViewById(R.id.ans);
        EditText e2 = (EditText)findViewById(R.id.number1);
        TextView t1 = (TextView)findViewById(R.id.texty);

        int num1 = Integer.parseInt(e2.getText().toString());
        int num2 = 3600;
        int ans = num1 * num2;
        e1.setText(Integer.toString(ans));
    }
}
