package com.jijjy.grace.qwiz;


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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button b1 = (Button)findViewById(R.id.button);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);
        Button b4 = (Button)findViewById(R.id.button4);
        final TextView t1 = (TextView)findViewById(R.Id.textview2);

        Button[] button = {b1,b2,b3,b4};
        for (Button aButton : button) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button:
                            Intent i = new Intent(getBaseContext(), Local.class);
                            startActivity(i);
                            break;
                        case R.id.button2:
                            Intent j = new Intent(getBaseContext(), Int.class);
                            startActivity(j);
                            break;
                        case R.id.button:
                            Intent i = new Intent(getBaseContext(), Local.class);
                            startActivity(i);
                            break;
                        case R.id.button2:
                            Intent j = new Intent(getBaseContext(), Int.class);
                            startActivity(j);
                            break;
                        default:
                            break;


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "What are you doing", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
