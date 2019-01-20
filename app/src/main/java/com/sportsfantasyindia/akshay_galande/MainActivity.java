package com.sportsfantasyindia.akshay_galande;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button q1,q2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1=findViewById(R.id.q1);
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que1.class);
                startActivity(intent);
            }
        });
        q2=findViewById(R.id.q2);
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que2.class);
                startActivity(intent);
            }
        });
        Button q3=findViewById(R.id.q3);
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que3.class);
                startActivity(intent);
            }
        });
        Button q4=findViewById(R.id.q4);
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que4.class);
                startActivity(intent);
            }
        });
        Button b5=findViewById(R.id.q5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que5.class);
                startActivity(intent);
            }
        });
        Button b6=findViewById(R.id.q6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que6.class);
                startActivity(intent);
            }
        });
        Button b7=findViewById(R.id.q7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que7.class);
                startActivity(intent);
            }
        });
        Button b8=findViewById(R.id.q8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que8.class);
                startActivity(intent);
            }
        });
        Button b9=findViewById(R.id.q9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que9.class);
                startActivity(intent);
            }
        });
        Button b10=findViewById(R.id.q10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que10.class);
                startActivity(intent);
            }
        });
        Button b11=findViewById(R.id.q11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que11.class);
                startActivity(intent);
            }
        });
        Button b12=findViewById(R.id.q12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que12.class);
                startActivity(intent);
            }
        });
        Button b13=findViewById(R.id.q13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que13.class);
                startActivity(intent);
            }
        });
        Button b14=findViewById(R.id.q14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que14.class);
                startActivity(intent);
            }
        });
        Button b15=findViewById(R.id.q15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que15.class);
                startActivity(intent);
            }
        });
        Button b16=findViewById(R.id.q16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que16.class);
                startActivity(intent);
            }
        });
        Button b17=findViewById(R.id.q17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que17.class);
                startActivity(intent);
            }
        });
        Button b18=findViewById(R.id.q18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que18.class);
                startActivity(intent);
            }
        });
        Button b19=findViewById(R.id.q19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que19.class);
                startActivity(intent);
            }
        });
        Button b20=findViewById(R.id.q20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que20.class);
                startActivity(intent);
            }
        });
        Button b21=findViewById(R.id.q21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que21.class);
                startActivity(intent);
            }
        });
        Button b22=findViewById(R.id.q22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que22.class);
                startActivity(intent);
            }
        });
        Button b23=findViewById(R.id.q23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que23.class);
                startActivity(intent);
            }
        });
        Button b24=findViewById(R.id.q24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que24.class);
                startActivity(intent);
            }
        });
        Button b25=findViewById(R.id.q25);
        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que25.class);
                startActivity(intent);
            }
        });
        Button b26=findViewById(R.id.q26);
        b26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Intent intent=new Intent(MainActivity.this,que26.class);
                startActivity(intent);
            }
        });
        Button b27=findViewById(R.id.q27);
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que27.class);
                startActivity(intent);
            }
        });
        Button b28=findViewById(R.id.q28);
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que28.class);
                startActivity(intent);
            }
        });
        Button b29=findViewById(R.id.q29);
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que29.class);
                startActivity(intent);
            }
        });
        Button b30=findViewById(R.id.q30);
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que30.class);
                startActivity(intent);
            }
        });
        Button b31=findViewById(R.id.q31);
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que31.class);
                startActivity(intent);
            }
        });
        Button b32=findViewById(R.id.q32);
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que32.class);
                startActivity(intent);
            }
        });
        Button b33=findViewById(R.id.q33);
        b33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,que33.class);
                startActivity(intent);
            }
        });

    }
}
