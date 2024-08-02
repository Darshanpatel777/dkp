package com.example.mathpuzzles;

import static com.example.mathpuzzles.MainActivity.edit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

public class Continue extends AppCompatActivity {

    ImageView puz;
    TextView txt,bord;
    Button remove,d1,d2,d3,d4,d5,d6,d7,d8,d9,d0,sub,skip;

    int imagearray[] = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,
            R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,R.drawable.p11};

    String[] ans = {"1","2","3","4","5","6","7","8","9","10","11"};

    int h=0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_continue);


        txt = findViewById(R.id.anstext);

        puz = findViewById(R.id.vpager);
        skip = findViewById(R.id.skip);
        bord = findViewById(R.id.levelbord);
        remove = findViewById(R.id.remove);
        sub = findViewById(R.id.sub);
        d1 = findViewById(R.id.one);
        d2 = findViewById(R.id.two);
        d3 = findViewById(R.id.three);
        d4 = findViewById(R.id.four);
        d5 = findViewById(R.id.five);
        d6 = findViewById(R.id.six);
        d7 = findViewById(R.id.seven);
        d8 = findViewById(R.id.eight);
        d9 = findViewById(R.id.nine);
        d0 = findViewById(R.id.zero);



        setbutton (d1,"1");
        setbutton (d2,"2");
        setbutton (d3,"3");
        setbutton (d4,"4");
        setbutton (d5,"5");
        setbutton (d6,"6");
        setbutton (d7,"7");
        setbutton (d8,"8");
        setbutton (d9,"9");
        setbutton (d0,"0");
        setbutton (remove,"@drawable/delete");

        h = getIntent().getIntExtra("level",0);


        bord.setText("Puzzle" +  (h + 1));
        puz.setBackgroundResource(imagearray[h]);


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(txt.getText().equals(ans[h]))
                {
                    edit.putString("key" +h,MainActivity.com);
                    h++;
                    edit.putInt("value",h);
                    edit.apply();

                    startActivity(new Intent(Continue.this,winpager.class).putExtra("level",h));
                    finish();
                }
            }
        });


        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edit.putString("key" +h,MainActivity.skip);
                h++;
                edit.putInt("value",h);
                edit.apply();
                bord.setText("LEVEL" +  (h + 1));
                puz.setBackgroundResource(imagearray[h]);
            }
        });

    }

    private void setbutton(Button btn, String s) {

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (s.equals("@drawable/delete"))
                {
                    if (!txt.getText().toString().equals(""))
                    {
                        txt.setText(txt.getText().toString().substring(0, txt.getText().toString().length() - 1));
                    }
                }
              else
                {
                    txt.setText(txt.getText().toString().concat(s));
                }

            }
        });
    }
}