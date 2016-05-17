package com.jijjy.grace.convert;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        Button b1 = (Button)findViewById(R.id.weight);
        Button b2 = (Button)findViewById(R.id.length);
        Button b3 = (Button)findViewById(R.id.time);

        b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
           Intent i = new Intent(getBaseContext(), Weight.class);
               startActivity(i);
                       }
                    });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getBaseContext(), Length.class);
                            startActivity(j);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getBaseContext(), Time.class);
                            startActivity(k);
            }
        });
    }
}
