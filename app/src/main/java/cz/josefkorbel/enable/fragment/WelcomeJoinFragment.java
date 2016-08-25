package cz.josefkorbel.enable.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cz.josefkorbel.enable.R;

/**
 * Created by Jsf on 25. 8. 2016.
 */

public class WelcomeJoinFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_welcome_join, container, false);
        return rootView;
    }
}
