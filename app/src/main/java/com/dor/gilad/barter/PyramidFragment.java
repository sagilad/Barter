package com.dor.gilad.barter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.transition.TransitionManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * Created by GILADSAG on 9/19/2017.
 */

public class PyramidFragment extends Fragment{
    private static final String TAG = "SettingsFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pyramid_fragment,container,false);
        RelativeLayout relativeLayout = (RelativeLayout)view.findViewById(R.id.pyramid_layout);
        relativeLayout.addView(new new_profile(getActivity()));

        return view;
    }


}


