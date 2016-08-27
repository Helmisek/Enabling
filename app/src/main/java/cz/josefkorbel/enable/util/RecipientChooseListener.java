package cz.josefkorbel.enable.util;

import android.support.v4.app.Fragment;
import android.view.View;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.activity.RecipientChoosingActivity;
import cz.josefkorbel.enable.fragment.RecipientChooseSideFragment;

/**
 * Created by Jsf on 27. 8. 2016.
 * Function for handling clicks through second part of Onboarding
 * Recipient Choosing
 */

public class RecipientChooseListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.hand_button:
                new RecipientChoosingActivity().commitFragment(new RecipientChooseSideFragment());
                break;
            case R.id.arm_button:
                new RecipientChoosingActivity().commitFragment(new RecipientChooseSideFragment());
                break;
            case R.id.finger_button:
                new RecipientChoosingActivity().commitFragment(new RecipientChooseSideFragment());
                break;
        }

    }


}
