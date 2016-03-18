package com.jijjy.grace.ferya;

import android.widget.Button;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by grace on 3/18/16.
 */
public class CrowdWeather extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }

}
