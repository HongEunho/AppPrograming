package kr.ac.sejong.customlistviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListViewAdapter extends BaseAdapter {

    // Data
    private ArrayList<MyListViewItem> data = new ArrayList<MyListViewItem>();

    public ArrayList<MyListViewItem> getData() {
        return data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1. 만약 view가 아직 없다면 inflat 시킨다.
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }
        // 2. listView_item에 포함된 view를 (예: imageview, textview)를 변수로 잡기
        ImageView profilePictureImageView = convertView.findViewById(R.id.ProfilePicture);
        TextView nameTextView = convertView.findViewById(R.id.name);
        TextView idTextView = convertView.findViewById(R.id.identifier);
        TextView updateTimeTextView = convertView.findViewById(R.id.updateTime);
        TextView tweetTextView = convertView.findViewById(R.id.tweet);

        // 3. data의 item 가져오기
        MyListViewItem item = data.get(position);

        // 4. view에 data를 반영한다.
        profilePictureImageView.setImageDrawable(item.getProfilePicture());
        nameTextView.setText(item.getName());
        idTextView.setText(item.getIdentifier());
        updateTimeTextView.setText(item.getIdentifier());
        tweetTextView.setText(item.getTweet());
        return convertView;
    }
}
