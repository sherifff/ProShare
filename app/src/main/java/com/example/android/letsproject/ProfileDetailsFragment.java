package com.example.android.letsproject;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class ProfileDetailsFragment extends Fragment {

    public ProfileDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_profile_details, container, false);

        Button followButton = (Button) view.findViewById(R.id.follow_profile_button);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You are following this profile now!", Toast.LENGTH_SHORT).show();
            }
        });

        Button inviteButton = (Button) view.findViewById(R.id.invite_profile_button);

        inviteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Invite!", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
