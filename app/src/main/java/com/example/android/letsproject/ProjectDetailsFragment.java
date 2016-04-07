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
public class ProjectDetailsFragment extends Fragment {

    public ProjectDetailsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_project_details, container, false);


        Button joinButton = (Button) view.findViewById(R.id.join_project_button);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Your join request has been sent!", Toast.LENGTH_SHORT).show();
            }
        });

        Button followButton = (Button) view.findViewById(R.id.follow_project_button);

        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You are following this project now!", Toast.LENGTH_SHORT).show();
            }
        });

        Button addCommentButton = (Button) view.findViewById(R.id.add_comment_button);

        addCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Add Comment!", Toast.LENGTH_SHORT).show();
            }
        });

        return  view;
    }
}
