package cz.josefkorbel.enable.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.databinding.FragmentProfileBinding;
import cz.josefkorbel.enable.fragment.base.BaseFragment;
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
        return rootView;
    }
}
