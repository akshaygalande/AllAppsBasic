package com.example.akshay.parentalcontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

       final Button login=findViewById(R.id.button);
       final Button signup=findViewById(R.id.button2);
       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent signup=new Intent(logIn.this,signup.class);
               logIn.this.startActivity(signup);

           }
       });
       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });
    }
}
