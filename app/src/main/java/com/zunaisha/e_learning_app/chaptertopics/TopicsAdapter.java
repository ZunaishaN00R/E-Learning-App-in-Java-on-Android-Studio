package com.zunaisha.e_learning_app.chaptertopics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zunaisha.e_learning_app.R;

public class TopicsAdapter extends BaseAdapter {

    String topicName[];
    Context context;

    public TopicsAdapter(String[] topicName, Context context) {
        this.topicName = topicName;
        this.context = context;
    }

    @Override
    public int getCount() {return topicName.length;}

    @Override
    public Object getItem(int i) {return topicName[i];}

    @Override
    public long getItemId(int i) {return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridView = view;
        LayoutInflater inflater;
        if (view == view) ;
        {
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.custom_topic_item_layout,null);

        }
        TextView textView = gridView.findViewById(R.id.topic_text);
        textView.setText(topicName[i]);
        return gridView;
    }
}
