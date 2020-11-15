package com.example.easyfindhostel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] hostel_image;
    String[] hostel_name;
    String[] hostel_address;
    Context context;
    private LayoutInflater inflater;

    public CustomAdapter() {
    }

    public CustomAdapter( Context context, String[] hostel_name,String[] hostel_address,int[] hostel_image) {
        this.hostel_image = hostel_image;
        this.hostel_name = hostel_name;
        this.hostel_address = hostel_address;
        this.context = context;
    }

    @Override
    public int getCount() {
        return hostel_name.length;
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

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_item_view, parent, false);

        }

        ImageView imageView=convertView.findViewById(R.id.imageViewid);
        TextView hostel_text=convertView.findViewById(R.id.hostel_name_id);
        TextView hostel_address_text=convertView.findViewById(R.id.hostel_description_id);

        imageView.setImageResource(hostel_image[position]);
        hostel_text.setText(hostel_name[position]);
        hostel_address_text.setText(hostel_address[position]);

        return convertView;
    }
}
