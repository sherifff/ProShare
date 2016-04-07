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
public class NotificationsAdapter extends BaseAdapter{

    private Context mContext;

    public NotificationsAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return 5;
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
            view = LayoutInflater.from(mContext).inflate(R.layout.notifications_list_item, parent, false);
        }

        ImageView imageView = (ImageView) view.findViewById(R.id.notification_image);
        TextView text = (TextView) view.findViewById(R.id.notification_text);
        TextView timeText = (TextView) view.findViewById(R.id.notification_time);


        switch (position){
            case 0:
                imageView.setImageResource(R.drawable.p2);
                text.setText("Sherif Mohi wants to join your project 'Snow Fight'");
                timeText.setText("2 mins ago");
                break;
            case 1:
                imageView.setImageResource(R.drawable.p6);
                text.setText("Ayman Genidy is following you");
                timeText.setText("1 hour ago");
                break;
            case 2:
                imageView.setImageResource(R.drawable.p4);
                text.setText("Amr Mohamed added a comment on your project 'Snow Fight'");
                timeText.setText("2 hours ago");
                break;
            case 3:
                imageView.setImageResource(R.drawable.p10);
                text.setText("Nader Ali is following you");
                timeText.setText("1 day ago");
                break;
            case 4:
                imageView.setImageResource(R.drawable.p11);
                text.setText("Mohaned Elsaid commented on a project you are following 'ProShare'");
                timeText.setText("1 day ago");
                break;

        }

        return view;
    }
}
