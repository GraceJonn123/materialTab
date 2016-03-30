package com.jijjy.grace.retrieve;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //firebase
    Firebase nRootRef;
    ArrayList<String> nMessages = new ArrayList<>();

    //ui
    EditText neditTextMessage;
    Button nbuttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //usually done in an application class
        Firebase.setAndroidContext(this);

        nRootRef = new Firebase("https://retrevar.firebaseio.com/");

        neditTextMessage = (EditText)findViewById(R.id.editTextMessage);
        nbuttonSubmit = (Button)findViewById(R.id.buttonSubmit);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Firebase messagesRef = nRootRef.child("messages");
        messagesRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String message = dataSnapshot.getValue(String.class);
                Log.v("E_VALUE", message);
                neditTextMessage.setText(message);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        nbuttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
