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
 * Created by AbdElrahman on 25/2/2016.
 */
public class PCategoriesAdapter extends BaseAdapter {

    private Context mContext;

    public PCategoriesAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return 8;
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
            view = LayoutInflater.from(mContext).inflate(R.layout.pcategories_list_item, parent, false);
        }


        ImageView imageView = (ImageView) view.findViewById(R.id.category_cover);
        TextView textView = (TextView) view.findViewById(R.id.category_title);

        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.sw_dev);
                textView.setText(R.string.application_development_title);
                break;
            case 1:
                imageView.setImageResource(R.drawable.game_dev);
                textView.setText(R.string.game_development_title);
                break;
            case 2:
                imageView.setImageResource(R.drawable.mob_dev);
                textView.setText(R.string.mobile_development_title);
                break;
            case 3:
                imageView.setImageResource(R.drawable.web_dev);
                textView.setText(R.string.web_development_title);
                break;
            case 4:
                imageView.setImageResource(R.drawable.design);
                textView.setText(R.string.design_title);
                break;
            case 5:
                imageView.setImageResource(R.drawable.mech);
                textView.setText(R.string.mechanics_title);
                break;
            case 6:
                imageView.setImageResource(R.drawable.music);
                textView.setText(R.string.music_title);
                break;
            case 7:
                imageView.setImageResource(R.drawable.film);
                textView.setText(R.string.film_and_animations_title);
                break;

        }

        return view;
    }
}
