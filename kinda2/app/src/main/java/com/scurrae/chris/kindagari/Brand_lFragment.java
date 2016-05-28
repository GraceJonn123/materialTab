package com.scurrae.chris.kindagari;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by chris on 3/7/16.
 */
public class Brand_lFragment extends Fragment {
    public Brand_lFragment(){}
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.brand_l, container, false);
        return view;

    }
}
