package cz.josefkorbel.enable.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.databinding.FragmentMapBinding;
import cz.josefkorbel.enable.fragment.base.BaseFragment;
import cz.josefkorbel.enable.viewmodel.MapFragmentViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelBindingConfig;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class MapFragment extends BaseFragment<FragmentMapBinding,MapFragmentViewModel> {
    @Override
    public ViewModelBindingConfig<MapFragmentViewModel> getViewModelBindingConfig() {
        return new ViewModelBindingConfig<>(R.layout.fragment_map, MapFragmentViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        // Font for actionbar
        TextView devices = (TextView) rootView.findViewById(R.id.map_toolbar_name);
        Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "fonts/Montserrat-Bold.ttf");
        devices.setTypeface(tf);


        return rootView;
    }
}
