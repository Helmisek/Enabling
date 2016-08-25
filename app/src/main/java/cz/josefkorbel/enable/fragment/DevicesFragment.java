package cz.josefkorbel.enable.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.activity.base.BaseActivity;
import cz.josefkorbel.enable.adapter.DevicesViewPagerAdapter;
import cz.josefkorbel.enable.adapter.ProfileViewPagerAdapter;
import cz.josefkorbel.enable.databinding.FragmentDevicesBinding;
import cz.josefkorbel.enable.fragment.base.BaseFragment;
import cz.josefkorbel.enable.viewmodel.DevicesFragmentViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class DevicesFragment extends BaseFragment<FragmentDevicesBinding,DevicesFragmentViewModel> {
    @Override
    public ViewModelBindingConfig<DevicesFragmentViewModel> getViewModelBindingConfig() {
        return new ViewModelBindingConfig<>(R.layout.fragment_devices, DevicesFragmentViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);




        // ViewPager
        //Declaring All The Variables Needed
        final TabLayout tabLayout;
        final ViewPager viewPager;
        DevicesViewPagerAdapter viewPagerAdapter;



        // Assign views
        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);


        /**
         Creating Adapter and setting that adapter to the viewPager
         */
        viewPagerAdapter = new DevicesViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);


        /**
         TabLayout.newTab() method creates a tab view, Now a Tab view is not the view
         which is below the tabs, its the tab itself.
         */
        final TabLayout.Tab hands = tabLayout.newTab();
        final TabLayout.Tab arms = tabLayout.newTab();
        final TabLayout.Tab fingers = tabLayout.newTab();




        /**
         Setting Title text for our tabs respectively
         */
        hands.setText(R.string.hands);
        arms.setText(R.string.arms);
        fingers.setText(R.string.fingers);



        /**
         Adding the tab view to our tablayout at appropriate positions
         As I want home at first position I am passing home and 0 as argument to
         the tablayout and like wise for other tabs as well
         */
        tabLayout.addTab(hands, 0);
        tabLayout.addTab(arms, 1);
        tabLayout.addTab(fingers, 2);



        /**
         TabTextColor sets the color for the title of the tabs, passing a ColorStateList here makes
         tab change colors in different situations such as selected, active, inactive etc
         TabIndicatorColor sets the color for the indiactor below the tabs
         */

        tabLayout.setTabTextColors(ContextCompat.getColorStateList(rootView.getContext(), R.drawable.tab_selector));
        tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(rootView.getContext(), R.color.blue_light));




        /**
         Adding a onPageChangeListener to the viewPager
         1st we add the PageChangeListener and pass a TabLayoutPageChangeListener so that Tabs Selection
         changes when a viewpager page changes.
         */
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tabLayout.getSelectedTabPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // Unused
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // Unused
            }
        });

        return rootView;
    }
}
