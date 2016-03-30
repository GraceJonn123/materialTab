package com.jijjy.grace.apitrial;

import android.app.Application;

import com.alelak.soundroid.Soundroid;

/**
 * Created by grace on 3/29/16.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Soundroid.init(this, "02gUJC0hH2ct1EGOcYXQIzRFU91c72Ea");
    }
}
