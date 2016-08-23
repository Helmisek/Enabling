package cz.josefkorbel.enable.fragment;

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
}
