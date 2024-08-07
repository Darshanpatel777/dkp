package com.example.mathpuzzles;

import static com.example.mathpuzzles.MainActivity.edit;
import static com.example.mathpuzzles.MainActivity.lock;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class Myclass extends BaseAdapter {

    Context context;

    public Myclass(Context context) {

        this.context = context;
    }

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
        return (long) position;
    }

    @SuppressLint("ResourceType")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView txx;
        convertView = LayoutInflater.from(context).inflate(R.layout.leve, parent, false);

        txx = convertView.findViewById(R.id.txx);

        if (MainActivity.sp.getString("key" + position, "").equals(MainActivity.com)) {
            txx.setBackgroundResource(R.drawable.tick);
            txx.setText("" + (position + 1));
        } else if (MainActivity.sp.getString("key" + position, "").equals(lock) &&
                MainActivity.sp.getString("key" + (position - 1), "").equals(MainActivity.com)) {
            txx.setText("" + (position + 1));

        } else if (MainActivity.sp.getString("key" + position, "").equals(MainActivity.skip)) {
            txx.setText("" + (position + 1));
        } else {
            txx.setBackgroundResource(R.drawable.lock);
        }
//        new*

//        lock mate
        txx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!MainActivity.sp.getString("key" + position, "").equals(MainActivity.lock) ||
                        MainActivity.sp.getString("key" + (position - 1), "").equals(MainActivity.com)) {
                    Intent d = new Intent(context, Continue.class);
                    d.putExtra("level", position);
                    context.startActivity(d);
                }
            }
        });


        return convertView;
    }
}
