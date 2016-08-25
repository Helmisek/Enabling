package cz.josefkorbel.enable.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.activity.base.BaseActivity;
import cz.josefkorbel.enable.adapter.DevicesViewPagerAdapter;
import cz.josefkorbel.enable.adapter.WelcomeViewPagerAdapter;
import cz.josefkorbel.enable.databinding.ActivityWelcomeBinding;
import cz.josefkorbel.enable.viewmodel.WelcomeActivityViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Jsf on 24. 8. 2016.
 */

public class WelcomeActivity extends BaseActivity<ActivityWelcomeBinding, WelcomeActivityViewModel> {


    @Override
    public ViewModelBindingConfig<WelcomeActivityViewModel> getViewModelBindingConfig() {
        return new ViewModelBindingConfig<>(R.layout.activity_welcome,WelcomeActivityViewModel.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // ViewPager
        //Declaring All The Variables Needed
        final TabLayout tabLayout;
        final ViewPager viewPager;
        WelcomeViewPagerAdapter viewPagerAdapter;


        viewPager = (ViewPager) findViewById(R.id.welcome_viewpager);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        /**
         Creating Adapter and setting that adapter to the viewPager
         */
        viewPagerAdapter = new WelcomeViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        indicator.setViewPager(viewPager);













    }
}
