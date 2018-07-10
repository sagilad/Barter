package com.dor.gilad.barter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by GILADSAG on 9/19/2017.
 */

public class HeartFragment extends Fragment{
    private static final String TAG = "SettingsFragment";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.heart_fragment,container,false);
        return view;
    }
}


