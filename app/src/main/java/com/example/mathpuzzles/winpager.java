package com.example.mathpuzzles;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class winpager extends AppCompatActivity {


    TextView complete,con,menu,share;

    int h=0;


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_winpager);


        complete = findViewById(R.id.complete);
        con = findViewById(R.id.con);
        menu = findViewById(R.id.menu);
        share = findViewById(R.id.share);



         h = getIntent().getIntExtra("level",0);

        complete.setText(" LEVEL " + h + " COMPLETED ");


        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(winpager.this,Continue.class).putExtra("level",h));
                finish();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivity(new Intent(winpager.this,MainActivity.class));
            }
        });



    }
}