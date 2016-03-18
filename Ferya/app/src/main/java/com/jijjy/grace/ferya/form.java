package com.jijjy.grace.ferya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.sql.Ref;

public class form extends AppCompatActivity {

    EditText nName;
    EditText nEmail;
    EditText nNumber;
    Button nbuttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        nName = (EditText)findViewById(R.id.Name);
        nEmail = (EditText)findViewById(R.id.Email);
        nNumber = (EditText)findViewById(R.id.Number);
        nbuttonSubmit = (Button)findViewById(R.id.buttonSubmit);
        final Firebase firebase = new Firebase("https://newandroid.firebaseio.com");

        firebase.child("message").setValue("Do you have data?");

        firebase.child("message").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                System.out.println(dataSnapshot.getValue());
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
