package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.*;

public class que21 extends AppCompatActivity {
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que21);
    }

    public void send(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("akshaygalande.com.sportsfantasyindia.dummyintent");
        startActivity(intent);
    }
}
