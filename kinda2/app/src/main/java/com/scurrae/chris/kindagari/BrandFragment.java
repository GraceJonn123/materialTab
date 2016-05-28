package com.scurrae.chris.kindagari;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/**
 * Created by chris on 3/7/16.
 */
public class BrandFragment extends Fragment{
    public BrandFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
//        int rotation = getWindowManager().getDefaultDisplay()
//                .getRotation();
//        if(rotation == Surface.ROTATION_90 || rotation = Surface.ROTATION_270){
//            View view = inflater.inflate(R.layout.brands, container, false);
//            return view;
//        }else {
//            View view = inflater.inflate(R.layout.brand_l, container, false);
//            return view;
//        }
        View view = inflater.inflate(R.layout.brands, container, false);
        return view;
    }
}
