package com.example.android.letsproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class CreateProjectFragment extends Fragment {

    public CreateProjectFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_create_project, container, false);

        Button doneButton = (Button) view.findViewById(R.id.done_project_button);

        doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });

//        List<String> spinnerArray =  new ArrayList<String>();
//        spinnerArray.add("item1");
//        spinnerArray.add("item2");
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                getContext(),
//                R.layout.category_spinner_item,
//                spinnerArray);
//
//        adapter.setDropDownViewResource(R.layout.category_spinner_item);
//        Spinner sItems = (Spinner) view.findViewById(R.id.categories_spinner);
//        sItems.setAdapter(adapter);

        return view;
    }
}
