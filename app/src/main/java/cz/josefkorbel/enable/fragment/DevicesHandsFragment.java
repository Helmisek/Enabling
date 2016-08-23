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
import cz.josefkorbel.enable.databinding.FragmentDevicesHandsBinding;
import cz.josefkorbel.enable.fragment.base.BaseFragment;
import cz.josefkorbel.enable.viewmodel.DevicesHandsViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class DevicesHandsFragment extends BaseFragment<FragmentDevicesHandsBinding,DevicesHandsViewModel> {

    @Override
    public ViewModelBindingConfig<DevicesHandsViewModel> getViewModelBindingConfig() {
        return new ViewModelBindingConfig<>(R.layout.fragment_devices_hands, DevicesHandsViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);




        return rootView;
    }
}
