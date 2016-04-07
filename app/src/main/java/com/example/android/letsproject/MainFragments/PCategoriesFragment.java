package com.example.android.letsproject.MainFragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.letsproject.Adapters.PCategoriesAdapter;
import com.example.android.letsproject.CreateProjectActivity;
import com.example.android.letsproject.MainActivity;
import com.example.android.letsproject.ProjectsActivity;
import com.example.android.letsproject.R;


public class PCategoriesFragment extends Fragment {

    private PCategoriesAdapter PCategoriesAdapter;
    private GridView gridView;
    private Intent selectedItemIntent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_pcategories, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Categories");

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent newIntent = new Intent(getContext(), CreateProjectActivity.class);
                getContext().startActivity(newIntent);

//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        gridView = (GridView) view.findViewById(R.id.projects_categories_grid_view);

        createCategoriesMenu();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(selectedItemIntent);
            }
        });

        return view;
    }

    private void createCategoriesMenu(){
        PCategoriesAdapter = new PCategoriesAdapter(getContext());
        gridView.setAdapter(PCategoriesAdapter);
        selectedItemIntent = new Intent(getContext(), ProjectsActivity.class);
    }



}
