package com.jijjy.grace.trial;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class App_Activity extends AppIntro {

    // Please DO NOT override onCreate. Use init.
    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        addSlide(SampleSlide.newInstance(R.layout.first_fragment));
        addSlide(SampleSlide.newInstance(R.layout.second_fragment));
        addSlide(SampleSlide.newInstance(R.layout.third_fragment));

        // SHOW or HIDE the status bar
        showStatusBar(true);
        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);


        // Animations -- use only one of the below. Using both could cause errors.
        setFadeAnimation();
    }


    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
//        loadMainActivity();
        Intent wwot = new Intent(this, MainActivity.class);
        startActivity(wwot);
    }

    @Override
    public void onSlideChanged() {
        // Do something when slide is changed
    }
}