package com.example.android.letsproject.MainFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.android.letsproject.MainActivity;
import com.example.android.letsproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class EditMyProfileFragment extends Fragment {


    public EditMyProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("My Profile");

        View view = inflater.inflate(R.layout.fragment_edit_my_profile, container, false);

        Button doneButton = (Button) view.findViewById(R.id.done_edit_profile_button);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getActivity().finish();
                ((MainActivity) getActivity()).navigationView.getMenu().getItem(0).setChecked(true);
                ((MainActivity) getActivity()).setFragment(0);
                ((MainActivity) getActivity()).drawerLayout.closeDrawer(GravityCompat.START);
            }
        });

        return view;
    }

}
