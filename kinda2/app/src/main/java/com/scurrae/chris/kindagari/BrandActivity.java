package com.scurrae.chris.kindagari;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by chris on 3/7/16.
 */
public class BrandActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.brand);

//        FragmentManager fM = getFragmentManager();
//        FragmentTransaction fT = fM.beginTransaction();
//
//        Configuration config = getResources().getConfiguration();
//
//        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
//            Brand_lFragment frag_l = new Brand_lFragment();
//            fT.replace(android.R.id.content, frag_l);
//        } else{
//            BrandFragment frag = new BrandFragment();
//            fT.replace(android.R.id.content, frag);
//        }
//        fT.commit();

    }
}
