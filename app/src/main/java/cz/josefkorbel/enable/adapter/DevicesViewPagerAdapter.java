package cz.josefkorbel.enable.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import cz.josefkorbel.enable.fragment.DevicesHandsFragment;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class DevicesViewPagerAdapter extends FragmentStatePagerAdapter {

    /**
     * Three Tabs
     * 1. Hands
     * 2. Arms
     * 3. Fingers
     */
    private final int NUMBER_OF_TABS = 3;

    public DevicesViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DevicesHandsFragment();
        } else if (position == 1) {
            return new DevicesHandsFragment();
        } else {
            return new DevicesHandsFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }
}
