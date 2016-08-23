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
import cz.josefkorbel.enable.adapter.ProfileViewPagerAdapter;
import cz.josefkorbel.enable.databinding.FragmentProfileBinding;
import cz.josefkorbel.enable.fragment.base.BaseFragment;
import cz.josefkorbel.enable.util.CustomTabLayout;
import cz.josefkorbel.enable.viewmodel.ProfileFragmentViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class ProfileFragment extends BaseFragment<FragmentProfileBinding,ProfileFragmentViewModel> {

    @Override
    public ViewModelBindingConfig<ProfileFragmentViewModel> getViewModelBindingConfig() {
        return new ViewModelBindingConfig<>(R.layout.fragment_profile, ProfileFragmentViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        TextView toolbar_name = (TextView) rootView.findViewById(R.id.profile_toolbar_name);
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Montserrat-Bold.ttf");
        toolbar_name.setTypeface(tf);


        // ViewPager
        //Declaring All The Variables Needed
        final TabLayout tabLayout;
        final ViewPager viewPager;
        ProfileViewPagerAdapter viewPagerAdapter;



        // Assign views
        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);


        /**
         Creating Adapter and setting that adapter to the viewPager
         */
        viewPagerAdapter = new ProfileViewPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);


        /**
         TabLayout.newTab() method creates a tab view, Now a Tab view is not the view
         which is below the tabs, its the tab itself.
         */
        final CustomTabLayout.Tab information = tabLayout.newTab();
        final CustomTabLayout.Tab device = tabLayout.newTab();




        /**
         Setting Title text for our tabs respectively
         */
        information.setText(R.string.information);
        device.setText(R.string.device);



        /**
         Adding the tab view to our tablayout at appropriate positions
         As I want home at first position I am passing home and 0 as argument to
         the tablayout and like wise for other tabs as well
         */
        tabLayout.addTab(information, 0);
        tabLayout.addTab(device, 1);



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
