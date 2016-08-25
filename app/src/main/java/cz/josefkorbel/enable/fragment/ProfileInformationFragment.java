package cz.josefkorbel.enable.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.databinding.FragmentProfileInformationBinding;
import cz.josefkorbel.enable.fragment.base.BaseFragment;
import cz.josefkorbel.enable.viewmodel.ProfileInfoViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class ProfileInformationFragment extends BaseFragment<FragmentProfileInformationBinding,ProfileInfoViewModel> {

    @Override
    public ViewModelBindingConfig<ProfileInfoViewModel> getViewModelBindingConfig() {
        return new ViewModelBindingConfig<>(R.layout.fragment_profile_information, ProfileInfoViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        // Custom font bullshit

        EditText et1 = (EditText) rootView.findViewById(R.id.et1);
        EditText et2 = (EditText) rootView.findViewById(R.id.et2);
        EditText et3 = (EditText) rootView.findViewById(R.id.et3);
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Montserrat-Bold.ttf");
        et1.setTypeface(tf);
        et2.setTypeface(tf);
        et3.setTypeface(tf);

        return rootView;
    }
}
