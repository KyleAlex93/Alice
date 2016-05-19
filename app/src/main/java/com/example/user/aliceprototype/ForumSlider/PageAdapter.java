package com.example.user.aliceprototype.ForumSlider;

/**
 * Created by AdminPond on 21/6/2558.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private final int NUM_ITEMS = 3;

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return NUM_ITEMS;
    }

    public Fragment getItem(int position) {
        if (position == 0)
            return ForumWelcome.newInstance();
        else if (position == 1)
            return ForumGeneral.newInstance();
        else if (position == 2)
            return ForumDrugSpecific.newInstance();
        /*else if (position == 3)
            return LayoutFour.newInstance();*/
        return null;
    }
}
