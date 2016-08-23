package cz.josefkorbel.enable.activity.base;

import android.databinding.ViewDataBinding;
import android.support.design.widget.Snackbar;
import android.view.MenuItem;
import cz.kinst.jakub.viewmodelbinding.ViewModel;
import cz.kinst.jakub.viewmodelbinding.ViewModelActivity;




public abstract class BaseActivity<T extends ViewDataBinding, S extends ViewModel<T>> extends ViewModelActivity<T, S> {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }


}
