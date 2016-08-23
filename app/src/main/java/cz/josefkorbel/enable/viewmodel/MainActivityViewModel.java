package cz.josefkorbel.enable.viewmodel;

import android.databinding.ObservableField;

import cz.josefkorbel.enable.databinding.ActivityMainBinding;
import cz.kinst.jakub.view.StatefulLayout;
import cz.kinst.jakub.viewmodelbinding.ViewModel;

/**
 * Created by Jsf on 22. 8. 2016.
 */

public class MainActivityViewModel extends ViewModel<ActivityMainBinding> {

    ObservableField<StatefulLayout.State> state = new ObservableField<>(StatefulLayout.State.PROGRESS);

    @Override
    public void onViewModelCreated() {
        super.onViewModelCreated();
        // Do API Calls, check for connectivity etc
    }
}
