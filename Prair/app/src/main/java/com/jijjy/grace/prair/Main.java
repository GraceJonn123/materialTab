package com.jijjy.grace.prair;

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

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //get a reference to the button

        Button mainnext  = (Button)findViewById(R.id.mainnext);
        Button cheermain  = (Button)findViewById(R.id.cheermain);
        Button cheerprev  = (Button)findViewById(R.id.cheerprev);
        Button cheernext  = (Button)findViewById(R.id.cheernext);
        Button twomain  = (Button)findViewById(R.id.twomain);
        Button twoprev  = (Button)findViewById(R.id.twoprev);
        Button twonext  = (Button)findViewById(R.id.twonext);
        Button valamain  = (Button)findViewById(R.id.valamain);
        Button valaprev  = (Button)findViewById(R.id.valaprev);
        Button valanext  = (Button)findViewById(R.id.valanext);
        Button dakmain  = (Button)findViewById(R.id.dakmain);
        Button dakprev  = (Button)findViewById(R.id.dakprev);
        Button daknext  = (Button)findViewById(R.id.daknext);
        Button finmain  = (Button)findViewById(R.id.finmain);
        Button didimain  = (Button)findViewById(R.id.didimain);
        Button didiprev  = (Button)findViewById(R.id.didiprev);
        Button didinext  = (Button)findViewById(R.id.didinext);

        //set a click listener that writes that

        cheermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId()) {

                    case R.id.mainnext:
                        Intent ef = new Intent(getApplicationContext(), Two.class);
                        startActivity(ef);
                        break;

                    case R.id.cheermain:
                        Intent in = new Intent(getApplicationContext(), Main.class);
                        startActivity(in);
                        break;

                    case R.id.cheernext:
                        Intent en = new Intent(getApplicationContext(), Didi.class);
                        startActivity(en);
                        break;

                    case R.id.cheerprev:
                        Intent on = new Intent(getApplicationContext(), Dak.class);
                        startActivity(on);
                        break;

                    case R.id.twomain:
                        Intent at = new Intent(getApplicationContext(), Main.class);
                        startActivity(at);
                        break;

                    case R.id.twonext:
                        Intent et = new Intent(getApplicationContext(), Vala.class);
                        startActivity(et);
                        break;

                    case R.id.twoprev:
                        Intent it = new Intent(getApplicationContext(), Main.class);
                        startActivity(it);
                        break;


                    case R.id.valamain:
                        Intent im = new Intent(getApplicationContext(), Main.class);
                        startActivity(im);
                        break;

                    case R.id.valanext:
                        Intent em = new Intent(getApplicationContext(), Dak.class);
                        startActivity(em);
                        break;

                    case R.id.valaprev:
                        Intent om = new Intent(getApplicationContext(), Two.class);
                        startActivity(om);
                        break;


                    case R.id.dakmain:
                        Intent il = new Intent(getApplicationContext(), Main.class);
                        startActivity(il);
                        break;

                    case R.id.daknext:
                        Intent el = new Intent(getApplicationContext(), Cheer.class);
                        startActivity(el);
                        break;

                    case R.id.dakprev:
                        Intent ol = new Intent(getApplicationContext(), Dak.class);
                        startActivity(ol);
                        break;


                    case R.id.didimain:
                        Intent ik = new Intent(getApplicationContext(), Main.class);
                        startActivity(ik);
                        break;

                    case R.id.didinext:
                        Intent ek = new Intent(getApplicationContext(), Fin.class);
                        startActivity(ek);
                        break;

                    case R.id.didiprev:
                        Intent ok = new Intent(getApplicationContext(), Cheer.class);
                        startActivity(ok);
                        break;


                    case R.id.finmain:
                        Intent is = new Intent(getApplicationContext(), Main.class);
                        startActivity(is);
                        break;

                    case R.id.finprev:
                        Intent os = new Intent(getApplicationContext(), Didi.class);
                        startActivity(os);
                        break;


                    default:
                        break;
                }
            }
        });
    }

}
