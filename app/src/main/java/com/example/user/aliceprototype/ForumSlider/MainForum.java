package com.example.user.aliceprototype.ForumSlider;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import android.os.Bundle;

import com.example.user.aliceprototype.R;

import me.relex.circleindicator.CircleIndicator;

public class MainForum extends FragmentActivity {
    PageAdapter adapter;
    ViewPager pager;
    Context context = this;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_forum);

        adapter = new PageAdapter(getSupportFragmentManager());

        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(pager);
        indicator.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
    }
}