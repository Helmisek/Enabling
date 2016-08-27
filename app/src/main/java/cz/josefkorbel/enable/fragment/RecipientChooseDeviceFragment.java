package cz.josefkorbel.enable.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Field;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.activity.RecipientChoosingActivity;

/**
 * Created by Jsf on 27. 8. 2016.
 */


// TODO BUG #1 tahle classa pujde asi cela predelat
public class RecipientChooseDeviceFragment extends Fragment implements View.OnClickListener {

    private String deviceTypeSelected;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_welcome_device_selection, container, false);

        TextView button_hand    = (TextView) rootView.findViewById(R.id.hand_button);
        TextView button_arm     = (TextView) rootView.findViewById(R.id.arm_button);
        TextView button_finger  = (TextView) rootView.findViewById(R.id.finger_button);

        button_hand.setOnClickListener(this);
        button_arm.setOnClickListener(this);
        button_finger.setOnClickListener(this);

        return rootView;
    }


    /// Tady to pada na tom commitu 
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.hand_button:
                deviceTypeSelected = "hand";
                new RecipientChoosingActivity().commitFragment(new RecipientChooseSideFragment());
                break;
            case R.id.arm_button:
                deviceTypeSelected = "arm";
                new RecipientChoosingActivity().commitFragment(new RecipientChooseSideFragment());
                break;
            case R.id.finger_button:
                deviceTypeSelected = "finger";
                new RecipientChoosingActivity().commitFragment(new RecipientChooseSideFragment());
                break;
        }

    }


}
