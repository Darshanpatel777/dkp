package com.example.mathpuzzles;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Myclass extends BaseAdapter {


    public Myclass(String[] array, com.example.mathpuzzles.level level) {

        this.level = level;
    }

    level level;


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return (long)position;
    }

    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        TextView txx;

        convertView = LayoutInflater.from(level).inflate(R.layout.leve,parent,false);

        txx = convertView.findViewById(R.id.txx);

        txx.setBackgroundResource(R.drawable.lock);



        return convertView;
    }
}
