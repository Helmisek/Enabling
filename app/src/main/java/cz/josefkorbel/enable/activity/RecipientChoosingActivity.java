package cz.josefkorbel.enable.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.fragment.RecipientChooseDeviceFragment;
import cz.josefkorbel.enable.fragment.RecipientChooseSideFragment;

/**
 * Created by Jsf on 25. 8. 2016.
 */

public class RecipientChoosingActivity extends AppCompatActivity {

    final int container_id = R.id.recipient_choose_container;
    String deviceTypeSelected;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipient_choose);

        commitFragment(new RecipientChooseDeviceFragment());
    }

    public void commitFragment(Fragment fragment){
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.recipient_choose_container, fragment);
        fragmentTransaction.commit();
    }


}
