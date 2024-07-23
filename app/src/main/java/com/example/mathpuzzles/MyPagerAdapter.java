package com.example.mathpuzzles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class MyPagerAdapter  extends PagerAdapter {

    Continue aContinue;

    int[] imagearray;

    public MyPagerAdapter(Continue aContinue, int[] imagearray) {
        this.aContinue = aContinue;
        this.imagearray = imagearray;
    }



    @Override
    public int getCount() {
        return imagearray.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ImageView img;

        View vv = LayoutInflater.from(aContinue).inflate(R.layout.lew, container, false);

        img = vv.findViewById(R.id.img);
        img.setBackgroundResource(imagearray[position]);
        container.addView(vv);


        return  vv;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

       container.removeView((View) object);
    }
}
