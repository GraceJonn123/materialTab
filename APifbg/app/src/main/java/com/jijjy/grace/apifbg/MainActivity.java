package com.jijjy.grace.apifbg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.ConnectionRequest;

import com.facebook.FacebookException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import barreto.simpleloginlibrary.api_login.FacebookSign;
import barreto.simpleloginlibrary.api_login.GoogleSign;

public class MainActivity extends AppCompatActivity
    implements FacebookSign.InfoLoginFaceCallback{

    FacebookSign facebookSign;
    GoogleSign googleSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        facebookSign = new FacebookSign(this,this);

        setContentView(R.layout.activity_main);

//        googleSign = new GoogleSign(this,this);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        facebookSign.resultFaceLogin(requestCode, resultCode, data);
        googleSign.resultGoogleLogin(requestCode,resultCode,data);
    }

    @Override
    public void getInfoFace(String id, String name, String email, String photo){

    }

    @Override
    public void cancelLoginFace() {

    }

    @Override
    public void erroLoginFace(FacebookException e){

    }

//    @Override
//    public void getInfoLoginGoogle(GoogleSignInAccount account){
//
//    }
//    @Override
//    public void connectionFailedApiClient(ConnectionRequest connectionRequest){
//
//    }
//    @Override
//    public void loginFailed(){
//
//    }
}
