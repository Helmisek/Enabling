package cz.josefkorbel.enable.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import cz.josefkorbel.enable.R;

/**
 * Created by Jsf on 25. 8. 2016.
 */

public class RecipientChoosingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_welcome_device_selection);
    }


}
