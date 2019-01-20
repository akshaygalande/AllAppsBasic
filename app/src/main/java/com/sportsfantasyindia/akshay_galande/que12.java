package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class que12 extends AppCompatActivity {
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que12);

    }

    public void b2(View view) {
        Toast.makeText(getApplicationContext(),"Button 1 is pressed",Toast.LENGTH_SHORT).show();
    }

    public void b1(View view) {
        Toast.makeText(getApplicationContext(),"Button 2 is pressed",Toast.LENGTH_SHORT).show();
    }
}
