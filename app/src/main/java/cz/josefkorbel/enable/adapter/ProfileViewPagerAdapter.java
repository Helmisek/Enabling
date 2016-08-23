package cz.josefkorbel.enable.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import cz.josefkorbel.enable.fragment.ProfileInformationFragment;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class ProfileViewPagerAdapter extends FragmentStatePagerAdapter {

    /**
     * Two Tabs
     * 1. Profile
     * 2. Devices
     */
    private final static int NUMBER_OF_TABS = 2;

    public ProfileViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // TODO MANAGE VIEWPAGER

        if (position == 0) {
            return new ProfileInformationFragment();
        } else {
            return new ProfileInformationFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }
}
