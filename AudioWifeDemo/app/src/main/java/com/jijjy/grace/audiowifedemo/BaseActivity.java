package com.jijjy.grace.audiowifedemo;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;

import nl.changer.audiowife.AudioWife;

/**
 * Created by grace on 5/10/16.
 */
public class BaseActivity extends FragmentActivity {

    protected Uri mUri;

    @Override
    protected void onPause() {
        super.onPause();

        // when done playing, release the resources
        AudioWife.getInstance().release();
        mUri = null;
    }
}