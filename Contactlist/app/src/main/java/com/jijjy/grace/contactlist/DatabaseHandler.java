package com.jijjy.grace.contactlist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by grace on 3/16/16.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    //All static variables
    //Database version
    public static final int DATABASE_VERSION = 1;

    //Database name
    public  static final String DATABASE_NAME = "contactsManager";

    //Contacts name
    public static final String TABLE_CONTACTS = "contacts";

    //contacts table column names
    public static final String KEY_ID = "id";
    public static final String KEY_NAME = "name";
    public static final String KEY_PH_NO = "phone_number";

    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_CONTACTS + KEY_ID + "INTEGER_PRIIMARY_KEY," + KEY_NAME + " TEXT," + KEY_PH_NO + " TEXT" + ")";
         db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

        onCreate(db);
    }

    //creating new contact
    public void addContact(Contacts contacts){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contacts.getName());
        values.put(KEY_PH_NO, contacts.getPhoneNumber());

        //inserting a row
        db.insert(TABLE_CONTACTS, null, values);
        db.close();//closing data connection

    }

    //getting a single contact
    public Contacts getContacts(int id){
        SQLiteDatabase db = getReadableDatabase();

        Cursor cursor = db.query(TABLE_CONTACTS, new String[]{KEY_ID,KEY_NAME, KEY_PH_NO},KEY_ID + "=?" + new String[] {String.valueOf(id)}, null, null, null, null);
        if (cursor != null);
        cursor.moveToFirst();

        Contacts contacts = new Contacts(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));

        return contacts;

    }

    //getting list of contact
    public List<Contacts> getAllContacts() {
        List<Contacts> contactsList = new ArrayList<Contacts>();

        String selectQuery = "SELECT * FROM " + TABLE_CONTACTS;
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);


        //looping through all rows and adding to the list
        if (cursor.moveToFirst()){
            do{
                Contacts contacts = new Contacts();
                contacts.setID(Integer.parseInt(cursor.getString(0)));
                contacts.setNAME(cursor.getString(1));
                contacts.setPHONENUMBER(cursor.getString(2));

                contactsList.add(contacts);
            } while (cursor.moveToNext());
        }

        return contactsList;
    }
    public int getContactsCount() {
        String countQuery = "SELECT * FROM "+ TABLE_CONTACTS;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        return cursor.getCount();
    }

    //updating single contact
    public int updateContact(Contacts contacts){
        SQLiteDatabase db = this.getReadableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, contacts.getName());
        values.put(KEY_PH_NO, contacts.getPhoneNumber());

        // updating row
        return db.update(TABLE_CONTACTS, values, KEY_ID + " = ?",
                new String[]{String.valueOf(contacts.getID())});
    }

    public void deleteContacts(Contacts contacts){
        SQLiteDatabase db = this.getReadableDatabase();
        db.delete(TABLE_CONTACTS, KEY_ID + " = ?",
                new String[]{String.valueOf(contacts.getID())});
        db.close();
    }
}
