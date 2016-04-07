package com.example.android.letsproject.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.letsproject.R;

/**
 * Created by AbdElrahman on 12/2/2016.
 */
public class ProfilesAdapter extends BaseAdapter {

    private Context mContext;

    public ProfilesAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return 12;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.profiles_list_item, parent, false);
        }

        ImageView imageView = (ImageView) view.findViewById(R.id.profile_list_pic);
        TextView firstName = (TextView) view.findViewById(R.id.profile_list_first_name);
        TextView lastName = (TextView) view.findViewById(R.id.profile_list_last_name);
        TextView prof = (TextView) view.findViewById(R.id.profile_list_profession);
        TextView skills = (TextView) view.findViewById(R.id.profile_list_skills);
        TextView proj = (TextView) view.findViewById(R.id.projects_list_number);


        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.p1);
                firstName.setText("AbdElrahman");
                lastName.setText("Elessawy");
                prof.setText("Developer");
                skills.setText("Java, C++, +2");
                proj.setText("3 Projects");

                break;
            case 1:
                imageView.setImageResource(R.drawable.p2);
                firstName.setText("Sherif");
                lastName.setText("Mohi");
                prof.setText("Designer");
                skills.setText("Android, Java, +1");
                proj.setText("5 Projects");
                break;
            case 2:
                imageView.setImageResource(R.drawable.p3);
                firstName.setText("Walid");
                lastName.setText("El-shafai");
                prof.setText("Developer");
                skills.setText("Java, PHP, +5");
                proj.setText("4 Projects");
                break;
            case 3:
                imageView.setImageResource(R.drawable.p4);
                firstName.setText("Amr");
                lastName.setText("Mohamed");
                prof.setText("Developer");
                skills.setText("Java, Android, +2");
                proj.setText("2 Projects");
                break;
            case 4:
                imageView.setImageResource(R.drawable.p5);
                firstName.setText("AbdElrahman");
                lastName.setText("Ali");
                prof.setText("Writer");
                skills.setText("Short Stories");
                proj.setText("1 Project");
                break;
            case 5:
                imageView.setImageResource(R.drawable.p6);
                firstName.setText("Ayman");
                lastName.setText("Ginedy");
                prof.setText("Musician");
                skills.setText("Guiter, Violin, +1");
                proj.setText("No Projects");
                break;
            case 6:
                imageView.setImageResource(R.drawable.p7);
                firstName.setText("Ahmed");
                lastName.setText("Nabil");
                prof.setText("Filmmaker");
                skills.setText("Filming");
                proj.setText("1 Project");
                break;
            case 7:
                imageView.setImageResource(R.drawable.p8);
                firstName.setText("Hassan");
                lastName.setText("Abdo");
                prof.setText("Product Manager");
                skills.setText("Leadership, +1");
                proj.setText("4 Projects");
                break;
            case 8:
                imageView.setImageResource(R.drawable.p9);
                firstName.setText("Khaled");
                lastName.setText("Abd-Elnaser");
                prof.setText("Artist");
                skills.setText("Acting");
                proj.setText("No Projects");
                break;
            case 9:
                imageView.setImageResource(R.drawable.p10);
                firstName.setText("Nader");
                lastName.setText("Ali");
                prof.setText("Artist");
                skills.setText("Painting, Design, +5");
                proj.setText("2 Projects");
                break;
            case 10:
                imageView.setImageResource(R.drawable.p11);
                firstName.setText("Mohanad");
                lastName.setText("Elsaid");
                prof.setText("Photographer");
                skills.setText("Adobe Photoshop, +3");
                proj.setText("No Projects");
                break;
            case 11:
                imageView.setImageResource(R.drawable.p12);
                firstName.setText("Ahmed");
                lastName.setText("Ali");
                prof.setText("Engineer");
                skills.setText("Mechanical, +7");
                proj.setText("1 Project");
                break;

        }
        return view;
    }

}
