package com.jijjy.grace.background;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by grace on 6/2/16.
 */
public class Pipi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        Button bee = (Button) findViewById(R.id.laster);


        bee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getBaseContext(), third.class);
                startActivity(a);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void playAudio(View view) {
        Intent objIntent = new Intent(this, Player.class);
        startService(objIntent);
    }

    public void stopAudio(View view) {
        Intent objIntent = new Intent(this, Player.class);
        stopService(objIntent);
    }
}