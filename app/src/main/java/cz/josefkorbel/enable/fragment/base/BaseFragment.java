package cz.josefkorbel.enable.fragment.base;

/**
 * Created by Jsf on 23. 8. 2016.
 */
import android.databinding.ViewDataBinding;
import android.support.design.widget.Snackbar;

import cz.josefkorbel.enable.util.SnackbarProvider;
import cz.kinst.jakub.viewmodelbinding.ViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelFragment;


public abstract class BaseFragment<T extends ViewDataBinding, S extends ViewModel<T>> extends ViewModelFragment<T, S> implements SnackbarProvider {

    @Override
    public void showSnackBar(String text) {
        Snackbar.make(getBinding().getRoot(), text, Snackbar.LENGTH_SHORT).show();
    }
}
