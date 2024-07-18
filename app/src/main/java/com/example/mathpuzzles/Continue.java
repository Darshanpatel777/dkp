package com.example.mathpuzzles;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Continue extends AppCompatActivity {

    TextView txt;

    Button remove,sub,d1,d2,d3,d4,d5,d6,d7,d8,d9,d0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_continue);

        String s = getIntent().getStringExtra("nothing");

        txt = findViewById(R.id.anstext);

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
        setbutton (sub,"SUBMIT");



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


            }
        });
    }
}