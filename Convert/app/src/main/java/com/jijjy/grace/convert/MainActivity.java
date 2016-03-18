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
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.weight);
        Button b2 = (Button)findViewById(R.id.length);
        Button b3 = (Button)findViewById(R.id.time);

        Button[] button = {b1,b2,b3};
        for (Button aButton : button) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.weight:
                            Intent i = new Intent(getBaseContext(), Weight.class);
                            startActivity(i);
                            break;
                        case R.id.length:
                            Intent j = new Intent(getBaseContext(), Length.class);
                            startActivity(j);
                            break;
                        case R.id.time:
                            Intent k = new Intent(getBaseContext(), Time.class);
                            startActivity(k);
                            break;
                        default:
                            break;
                    }
                }


            });
        }    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
