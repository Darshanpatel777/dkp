package com.example.mathpuzzles;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txt1,txt2,txt3;

   static SharedPreferences sp;// get

    static SharedPreferences.Editor edit; // set


//    SharedPreferences

    // key = value
//    new *


    static String com = "complate";
    static String lock = "lock";
    static String skip = "skip";


    int h = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sp = getSharedPreferences("mydate",MODE_PRIVATE);
        edit = sp.edit();

        txt1 = findViewById(R.id.ctnew);
        txt2 = findViewById(R.id.pzl);
        txt3 = findViewById(R.id.pro);

      h = sp.getInt("value",0);

     for (int m = 0;m < 10; m++)
        {
            if(sp.getString("key" +m,"").equals(""))
            {
                edit.putString("key" + m,lock);
                edit.apply();
            }
        }
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent d= new Intent(MainActivity.this,Continue.class);
                d.putExtra("level",h);
                startActivity(d);
                finish();
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent d= new Intent(MainActivity.this,level.class);
                startActivity(d);
                finish();
            }
        });

    }
}