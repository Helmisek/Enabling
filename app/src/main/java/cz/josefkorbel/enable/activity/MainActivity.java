package cz.josefkorbel.enable.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.fragment.DevicesFragment;
import cz.josefkorbel.enable.fragment.MapFragment;
import cz.josefkorbel.enable.fragment.ProfileFragment;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Launch Onboarding
        Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);




        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch(tabId){
                    case R.id.tab_profile:
                        commitFragment(new ProfileFragment());
                        break;
                    case R.id.tab_map:
                        commitFragment(new MapFragment());
                        break;
                    case R.id.tab_devices:
                        commitFragment(new DevicesFragment());
                        break;
                }
            }
        });


    }

    /**
     * Method for changing fragments in main fragment holder.
     * @param fragment new fragment
     */
    private void commitFragment(Fragment fragment){
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.contentContainer, fragment);
        fragmentTransaction.commit();
    }
}
