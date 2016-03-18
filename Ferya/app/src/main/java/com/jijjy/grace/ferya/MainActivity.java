package com.jijjy.grace.ferya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView ntextFieldCondition;
    Button nButtonSunny;
    Button nButtonFoggy;
    Button nNext;
    Firebase nRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        ntextFieldCondition = (TextView)findViewById(R.id.textViewCondition);
        nButtonSunny = (Button)findViewById(R.id.buttonSunny);
        nButtonFoggy = (Button)findViewById(R.id.buttonFoggy);
        nNext = (Button)findViewById(R.id.next);
        nRef = new Firebase("https://newandroid.firebaseio.com/condition");

        nRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                ntextFieldCondition.setText(text);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        nButtonFoggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nRef.setValue("Foggy");
            }
        });

        nButtonSunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nRef.setValue("Sunny");
            }
        });

        nNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getBaseContext(),form.class);
                startActivity(j);
            }
        });

    }
}
