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

public class ForumGeneral extends Fragment {

    public static ForumGeneral newInstance() {
        ForumGeneral fragment = new ForumGeneral();
        return fragment;
    }

    public ForumGeneral() {
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.forum_layout_general, null);
        return root;
    }
}