package com.example.watchmenss;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ad on 08/06/2020.
 */

public class CustomAdapter extends BaseAdapter {

    Activity activity;
    List<UserModel> users;
    LayoutInflater inflater;

    public CustomAdapter(Activity activity) {
        this.activity = activity;
    }

    public CustomAdapter(Activity activity, List<UserModel> users) {
        this.activity = activity;
        this.users = users;

        inflater = activity.getLayoutInflater();
    }

    public int getCount(){
        return users.size();
    }
    public Object getItem(int i)
    {
        return i;
    }
    public long getItemId(int i)
    {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder = null;
        if(view == null)
        {
            view = inflater.inflate(R.layout.list_view_item,viewGroup,false);
            holder = new ViewHolder();
            holder.textViewUsername = (TextView)view.findViewById(R.id.textview_username);
            holder.imageViewCheckbox = (ImageView)view.findViewById(R.id.imageview_checkbox);

            view.setTag(holder);
        }
        else
            holder = (ViewHolder)view.getTag();

        UserModel model = users.get(i);

        holder.textViewUsername.setText(model.getUsername());

        if(model.isSelected())
            holder.imageViewCheckbox.setBackgroundResource(R.drawable.toggleon);
        else
            holder.imageViewCheckbox.setBackgroundResource(R.drawable.toggleoff);

        return view;
    }
    public void updateRecords(List<UserModel> users){
        this.users = users;
        notifyDataSetChanged();
    }

    class ViewHolder{

        TextView textViewUsername;
        ImageView imageViewCheckbox;
    }
}