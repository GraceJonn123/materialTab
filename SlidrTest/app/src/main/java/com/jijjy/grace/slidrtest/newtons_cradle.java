package com.jijjy.grace.slidrtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.victor.loading.newton.NewtonCradleLoading;

public class newtons_cradle extends AppCompatActivity {

    private NewtonCradleLoading newtonCradleLoading;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtons_cradle);
        newtonCradleLoading = (NewtonCradleLoading) findViewById(R.id.newton_cradle_loading);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (newtonCradleLoading.isStart()) {
                    button.setText(R.string.start);
                    newtonCradleLoading.stop();
                } else {
                    button.setText(R.string.stop);
                    newtonCradleLoading.start();
                }
            }
        });
    }

    @Override
    protected void onStop() {
        startActivity(new Intent(getBaseContext(), rotate.class));
        super.onStop();
    }
}
