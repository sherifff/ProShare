package com.example.android.letsproject.MainFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.letsproject.Adapters.NotificationsAdapter;
import com.example.android.letsproject.MainActivity;
import com.example.android.letsproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {


    private ListView listView;
    private NotificationsAdapter notificationsAdapter;

    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_notifications, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Notifications");

        listView = (ListView) view.findViewById(R.id.notifications_list_view);

        createProjectsMenu();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Notification", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


    private void createProjectsMenu(){
        notificationsAdapter = new NotificationsAdapter(getActivity());
        listView.setAdapter(notificationsAdapter);
    }


}
