package com.jijjy.grace.justforthefab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.facebook.login.LoginBehavior;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.common.SignInButton;

import barreto.simpleloginlibrary.api_login.FacebookSign;
import barreto.simpleloginlibrary.api_login.GoogleSign;

public class MainActivity extends AppCompatActivity implements GoogleSign.InfoLoginGoogleCallback, FacebookSign.InfoLoginFaceCallback {

    GoogleSign googleSign;
    FacebookSign facebookSign;

    //for custom buttons
    SignInButton signInButton;
    LoginButton loginButton;

//    Binding views, custom buttons

    private void bindViews(){
        signInButton = (SignInButton)findViewById(R.id.sign_in_button);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                googleSign.signIn();
            }
        });
        loginButton = (LoginButton)findViewById(R.id.login_button);
        facebookSign.signInWithFaceButton(loginButton);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //fragmentActivity and interface listener
        googleSign = new GoogleSign(this, this);

        //like wise
        facebookSign = new FacebookSign(this, this);

        setContentView(R.layout.activity_main);

        bindViews();//calling the method
    }
}