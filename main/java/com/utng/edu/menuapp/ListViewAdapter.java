package com.utng.edu.menuapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alo_m on 12/03/2018.
 */

public class ListViewAdapter extends BaseAdapter {
    Activity activity;
    List<User> lstUsers;
    LayoutInflater inflater;


    public ListViewAdapter(Activity activity, List<User> lstUsers) {
        this.activity = activity;
        this.lstUsers = lstUsers;
    }

    @Override
    public int getCount() {
        return lstUsers.size();
    }

    @Override
    public Object getItem(int i) {
        return lstUsers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater = (LayoutInflater)activity.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.listview_item,null);

        TextView txtUser = (TextView)itemView.findViewById(R.id.list_name);
        TextView txtComment = (TextView)itemView.findViewById(R.id.list_comment);

        txtUser.setText(lstUsers.get(i).getName());
        txtComment.setText(lstUsers.get(i).getComment());

        return itemView;
    }
}
