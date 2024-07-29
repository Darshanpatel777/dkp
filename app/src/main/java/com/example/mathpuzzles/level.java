package com.example.mathpuzzles;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class level extends AppCompatActivity {

    GridView list;

    String array[];

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_level);

        list = findViewById(R.id.list);



        int h=  getIntent().getIntExtra("dp",0);

        Myclass ns = new Myclass(array,level.this);
        list.setAdapter(ns);

    }
}