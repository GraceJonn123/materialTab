package com.jijjy.grace.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        /**
         * CRUD OPERATIONS
         */

        Log.d("Insert: ", "Inserting...");
        db.addContact(new Contacts("Jijjy", "+2487547854809576"));
        db.addContact(new Contacts("Joe", "+2409576"));
        db.addContact(new Contacts("John", "+24085769576"));
        db.addContact(new Contacts("Jeremy", "+24092039576"));

        Log.d("Reading: ", "Reading all contacts...");
        List<Contacts> contacts = db.getAllContacts();

        for (Contacts cn : contacts){
            String log = "Id: "+ cn.getID()+ " ,Name: "+ cn.getName()+ " ,Phone: "+cn.getPhoneNumber();

            Log.d("Name ", log);
        }

    }
}
