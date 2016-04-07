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
 * Created by AbdElrahman on 11/2/2016.
 */
public class ProjectsAdapter extends BaseAdapter {

    private Context mContext;

    public ProjectsAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return 10;
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
            view = LayoutInflater.from(mContext).inflate(R.layout.projects_list_item, parent, false);
        }




        ImageView imageView = (ImageView) view.findViewById(R.id.project_list_cover);
        TextView titleTextView = (TextView) view.findViewById(R.id.project_list_title);
        TextView creatorTextView = (TextView) view.findViewById(R.id.project_list_creator);
        TextView descTextView = (TextView) view.findViewById(R.id.project_list_description);


        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.g_1);
                titleTextView.setText("Project Ghost");
                creatorTextView.setText("Abd-Elrahman");
                descTextView.setText("The game is set in a quasi-victorian setting with the core gameplay centered on stealth, theft...");
                break;
            case 1:
                imageView.setImageResource(R.drawable.game2);
                titleTextView.setText("Project Wars");
                creatorTextView.setText("Sherif");
                descTextView.setText("The Project Wars is a F2P Third Person Shooter Multiplayer Online Battle Arena. Set in a dark...");
                break;
            case 2:
                imageView.setImageResource(R.drawable.game3);
                titleTextView.setText("Extraterrestrial ");
                creatorTextView.setText("Walid");
                descTextView.setText("The project as a whole is not fully complete there is still much work to be done, hence why I need a team...");
                break;
            case 3:
                imageView.setImageResource(R.drawable.game4);
                titleTextView.setText("Snow Fight");
                creatorTextView.setText("Amr");
                descTextView.setText("Every player spawn on an igloo with a freezing indicator, when it goes all the way down, the player...");
                break;
            case 4:
                imageView.setImageResource(R.drawable.game5);
                titleTextView.setText("Arx Imperialis");
                creatorTextView.setText("Yaser");
                descTextView.setText("The game is an open-world adventure RPG, set on a legendary island, where the player has to find a special...");
                break;
            case 5:
                imageView.setImageResource(R.drawable.game6);
                titleTextView.setText("Voltage");
                creatorTextView.setText("Mohamed");
                descTextView.setText("Voltage is a futuristic third person shooter with an emphasis on dodging and maneuverability. Player...");
                break;

        }


        return view;
    }
}
