package com.jijjy.grace.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Contacts{
    int _id;
    String _name;
    String _phone_number;

    //empty constructor
    public Contacts(){
    }

    //constructor
    public Contacts(int id,String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;
    }

    //constructor
    public Contacts(String name, String _phone_number){
        this._name = name;
        this._phone_number = _phone_number;
    }

    //getting ID
    public int getID(){
        return this._id;
    }

    //setting ID
    public void setID(int id){
        this._id = id;
    }

    //getting name
    public String getName(){
        return this._name;
    }

    //setting NAME
    public void setNAME(String name){
        this._name = name;
    }

    //getting PHONE NUMBER
    public  String getPhoneNumber(){
        return this._phone_number;
    }

    //setting phone number
    public void setPHONENUMBER(String phonenumber){
        this._phone_number = phonenumber;
    }
}
