package com.example.android.letsproject;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.letsproject.Adapters.ProjectsAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class ProjectsFragment extends Fragment {

    private GridView gridView;
    private ProjectsAdapter projectsAdapter;
    private Intent selectedItemIntent;

    public ProjectsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_projects, container, false);

        gridView = (GridView) view.findViewById(R.id.projects_grid_view);

        createProjectsMenu();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(selectedItemIntent);
            }
        });

        return view;
    }

    private void createProjectsMenu(){
        projectsAdapter = new ProjectsAdapter(getActivity());
        gridView.setAdapter(projectsAdapter);
        selectedItemIntent = new Intent(getActivity(), ProjectDetailsActivity.class);
    }
}
