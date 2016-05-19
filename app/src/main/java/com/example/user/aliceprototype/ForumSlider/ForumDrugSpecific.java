package com.example.user.aliceprototype.ForumSlider;

/**
 * Created by AdminPond on 21/6/2558.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.aliceprototype.R;

public class ForumDrugSpecific extends Fragment {

    public static ForumDrugSpecific newInstance() {
        ForumDrugSpecific fragment = new ForumDrugSpecific();
        return fragment;
    }

    public ForumDrugSpecific() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.forum_layout_drugspecific, null);
        return root;
    }
}