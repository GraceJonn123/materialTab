package com.jijjy.grace.background;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Sec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Button b1 = (Button)findViewById(R.id.last);


        b1.setOnClickListener(new View.OnClickListener() {
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
        Intent objIntent = new Intent(this, PlayAudio.class);
        startService(objIntent);
    }

    public void stopAudio(View view) {
        Intent objIntent = new Intent(this, PlayAudio.class);
        stopService(objIntent);
    }

}
