package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.content.*;
import android.view.*;
import android.graphics.*;

public class que31 extends AppCompatActivity {
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    RelativeLayout rl;
    RadioButton r1,r2,r3;
    int ccode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que31);
        r1 = (RadioButton)findViewById(R.id.r1);
        r2 = (RadioButton)findViewById(R.id.r2);
        r3 = (RadioButton)findViewById(R.id.r3);
        rl = (RelativeLayout)findViewById(R.id.relative_layout);
        SharedPreferences pref = getSharedPreferences("color",MODE_PRIVATE);
        final SharedPreferences.Editor ed = pref.edit();
        if(pref.contains("color_id"))
            rl.setBackgroundColor(pref.getInt("color_id",0));

        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccode = Color.RED;
                rl.setBackgroundColor(ccode);
                ed.putInt("color_id",ccode);
                ed.apply();
                ed.commit();
            }
        });
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccode = Color.BLUE;
                rl.setBackgroundColor(ccode);
                ed.putInt("color_id",ccode);
                ed.apply();
                ed.commit();
            }
        });
        r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ccode = Color.GREEN;
                rl.setBackgroundColor(ccode);
                ed.putInt("color_id",ccode);
                ed.apply();
                ed.commit();
            }
        });



    }

}
