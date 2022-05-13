package com.example.fragmentss2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class svAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Sv> svList;

    public svAdapter(Context context, int layout, List<Sv> svList) {
        this.context = context;
        this.layout = layout;
        this.svList = svList;
    }

    @Override
    public int getCount() {
        return svList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txtTen = view.findViewById(R.id.txtHoten);
            view.setTag(holder);
        }
        else {
            holder = (ViewHolder) view.getTag();
        }
        Sv sv = svList.get(i);
        holder.txtTen.setText(sv.getHoten());
        return view;
    }
}
