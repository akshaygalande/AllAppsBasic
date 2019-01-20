package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class que16 extends AppCompatActivity {
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que16);
    }

    public void submit(View view) {
        EditText e1,e2,e3;
        e1=findViewById(R.id.uname);
        e2=findViewById(R.id.password);
        e3=findViewById(R.id.phn);

        if(e1.getText().toString().matches(""))
        {
            Toast.makeText(getApplicationContext(),"Enter Username",Toast.LENGTH_SHORT).show();
        }
        if(e2.getText().toString().matches(""))
        {
            Toast.makeText(getApplicationContext(),"Enter password",Toast.LENGTH_SHORT).show();
        }
        if(e3.getText().toString().matches(""))
        {
            Toast.makeText(getApplicationContext(),"Enter phn",Toast.LENGTH_SHORT).show();
        }
    }
}
