package com.dor.gilad.barter;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        View view_menu = getLayoutInflater().inflate(R.layout.iconview, null);
        view_menu.findViewById(R.id.icon_bar).setBackgroundResource(R.drawable.selector_menu_icon);
        tabLayout.getTabAt(0).setCustomView(view_menu);

        View view_message = getLayoutInflater().inflate(R.layout.iconview, null);
        view_message.findViewById(R.id.icon_bar).setBackgroundResource(R.drawable.selector_messages_icon);
        tabLayout.getTabAt(1).setCustomView(view_message);

        View view_pyramid = getLayoutInflater().inflate(R.layout.iconview, null);
        view_pyramid.findViewById(R.id.icon_bar).setBackgroundResource(R.drawable.selector_pyramid_icon);
        tabLayout.getTabAt(2).setCustomView(view_pyramid);

        View view_heart = getLayoutInflater().inflate(R.layout.iconview, null);
        view_heart.findViewById(R.id.icon_bar).setBackgroundResource(R.drawable.selector_heart_icon);
        tabLayout.getTabAt(3).setCustomView(view_heart);

        View view_search = getLayoutInflater().inflate(R.layout.iconview, null);
        view_search.findViewById(R.id.icon_bar).setBackgroundResource(R.drawable.selector_search_icon);
        tabLayout.getTabAt(4).setCustomView(view_search);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new SettingsFragment());
        adapter.addFragment(new MessagesFragment());
        adapter.addFragment(new PyramidFragment());
        adapter.addFragment(new HeartFragment());
        adapter.addFragment(new SearchFragment());
        viewPager.setAdapter(adapter);
    }

}
