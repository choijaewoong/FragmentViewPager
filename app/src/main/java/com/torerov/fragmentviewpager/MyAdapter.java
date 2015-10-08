package com.torerov.fragmentviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tacademy on 2015-10-08.
 */
public class MyAdapter extends FragmentPagerAdapter {


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TitleFragment.newInstance("title: " + position);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public float getPageWidth(int position) {
        return 0.93f;
    }


}
