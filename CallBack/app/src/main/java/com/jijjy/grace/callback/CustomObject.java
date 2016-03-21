package com.jijjy.grace.callback;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.pddstudio.talking.model.SimpleSpeechObject;

public class CustomObject extends SimpleSpeechObject {

    final Activity activity;
    final String voice;

    public CustomObject(Activity activity, String voice) {
        super();
        super.setVoiceString(voice);
        this.activity = activity;
        this.voice = voice;
    }

    @Override
    public void onSpeechObjectIdentified(){
        ((TextView) activity.findViewById(R.id.textLabel)).setText("Recognized");
    }
}
