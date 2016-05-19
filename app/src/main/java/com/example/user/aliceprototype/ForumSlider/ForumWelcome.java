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

public class ForumWelcome extends Fragment {

    public static ForumWelcome newInstance() {
        ForumWelcome fragment = new ForumWelcome();
        return fragment;
    }

    public ForumWelcome() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.forum_layout_welcome, null);
        return root;
    }
}