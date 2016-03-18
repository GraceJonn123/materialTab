package com.jijjy.grace.fb;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.github.paolorotolo.appintro.AppIntro;

/**
 * Created by grace on 3/16/16.
 */
public class App_Activity extends AppIntro {

    // Please DO NOT override onCreate. Use init.
    @Override
    public void init(Bundle savedInstanceState) {

        // Add your slide's fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        addSlide(SampleSlide.newInstance(R.layout.fragment_frag12));
        addSlide(SampleSlide.newInstance(R.layout.fragment_frag22));
        addSlide(SampleSlide.newInstance(R.layout.fragment_frag32));

        // SHOW or HIDE the status bar
        showStatusBar(true);
        // Hide Skip/Done button
        showSkipButton(true);
        showDoneButton(true);


        // Animations -- use only one of the below. Using both could cause errors.
        setFadeAnimation();
    }

    //
    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        loadMainActivity();
        Toast.makeText(getApplicationContext(), getString(R.string.skip_button), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        loadMainActivity();

    }

    @Override
    public void onSlideChanged() {
        // Do something when slide is changed
    }
}
