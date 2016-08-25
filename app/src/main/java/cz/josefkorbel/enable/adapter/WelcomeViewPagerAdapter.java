package cz.josefkorbel.enable.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import cz.josefkorbel.enable.fragment.DevicesHandsFragment;
import cz.josefkorbel.enable.fragment.WelcomeBuildFragment;
import cz.josefkorbel.enable.fragment.WelcomeChooseFragment;
import cz.josefkorbel.enable.fragment.WelcomeJoinFragment;

/**
 * Created by Jsf on 25. 8. 2016.
 */

public class WelcomeViewPagerAdapter extends FragmentStatePagerAdapter {

    /**
     * Three Tabs
     * 1. Join Community
     * 2. Build 3D device
     * 3. Who are you
     */
    private final int NUMBER_OF_TABS = 3;

    public WelcomeViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new WelcomeJoinFragment();
        } else if (position == 1) {
            return new WelcomeBuildFragment();
        } else {
            return new WelcomeChooseFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }
}
