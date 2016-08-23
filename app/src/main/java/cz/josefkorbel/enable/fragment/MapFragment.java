package cz.josefkorbel.enable.fragment;

import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

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


}
