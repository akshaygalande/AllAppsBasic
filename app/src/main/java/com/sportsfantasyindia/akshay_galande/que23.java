package com.sportsfantasyindia.akshay_galande;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class que23 extends AppCompatActivity {
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que23);
    }

    public void open(View view) {
        Intent intent=new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
}
