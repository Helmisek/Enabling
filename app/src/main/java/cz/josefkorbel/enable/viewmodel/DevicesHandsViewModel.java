package cz.josefkorbel.enable.viewmodel;

import android.databinding.ObservableField;

import cz.josefkorbel.enable.databinding.FragmentDevicesHandsBinding;
import cz.kinst.jakub.view.StatefulLayout;
import cz.kinst.jakub.viewmodelbinding.ViewModel;

/**
 * Created by Jsf on 23. 8. 2016.
 */

public class DevicesHandsViewModel extends ViewModel<FragmentDevicesHandsBinding> {
    public ObservableField<StatefulLayout.State> state = new ObservableField<>(StatefulLayout.State.PROGRESS);

    @Override
    public void onViewModelCreated() {
        super.onViewModelCreated();
        // Download Hands
    }
}
