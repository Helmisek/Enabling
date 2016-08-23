package cz.josefkorbel.enable.fragment;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.activity.base.BaseActivity;
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
}
