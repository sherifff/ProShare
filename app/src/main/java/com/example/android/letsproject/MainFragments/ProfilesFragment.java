package com.example.android.letsproject.MainFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.letsproject.MainActivity;
import com.example.android.letsproject.ProfileDetailsActivity;
import com.example.android.letsproject.Adapters.ProfilesAdapter;
import com.example.android.letsproject.Adapters.ProjectsAdapter;
import com.example.android.letsproject.R;


public class ProfilesFragment extends Fragment {

    private GridView gridView;
    private ProjectsAdapter projectsAdaper;
    private ProfilesAdapter profilesAdapter;
    private Intent selectedItemIntent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_profiles, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Profiles");

        gridView = (GridView) view.findViewById(R.id.profiles_grid_view);

        createProfilesMenu();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(selectedItemIntent);
            }
        });

        return view;
    }

    private void createProfilesMenu(){
        profilesAdapter = new ProfilesAdapter(getContext());
        gridView.setAdapter(profilesAdapter);
        selectedItemIntent = new Intent(getContext(), ProfileDetailsActivity.class);
    }

}
