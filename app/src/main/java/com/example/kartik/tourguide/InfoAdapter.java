package com.example.kartik.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Activity context, ArrayList<Info> info) {
        super(context, 0, info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Info currentInfo = getItem(position);

        TextView name = listItemView.findViewById(R.id.name);
        name.setText(currentInfo.getName());

        TextView address = listItemView.findViewById(R.id.address);
        address.setText(currentInfo.getAddress());

        ImageView pic = listItemView.findViewById(R.id.pic);
        if (currentInfo.checkImageSource()) {
            pic.setImageResource(currentInfo.getImageId());
            pic.setVisibility(View.VISIBLE);
        } else {
            pic.setVisibility(View.GONE);
        }
        return listItemView;
    }
}