package cz.josefkorbel.enable.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import cz.josefkorbel.enable.R;
import cz.josefkorbel.enable.activity.RecipientChoosingActivity;

/**
 * Created by Jsf on 25. 8. 2016.
 */

public class WelcomeChooseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_welcome_choose, container, false);


        TextView recipient_button = (TextView) rootView.findViewById(R.id.ineedhand_button);

        recipient_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO pass progress parameters to new activity to be handled later
                Intent chooseDeviceIntent = new Intent(getContext(), RecipientChoosingActivity.class);
                startActivity(chooseDeviceIntent);

            }
        });
        return rootView;
    }
}
