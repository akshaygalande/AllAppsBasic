package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class que6 extends AppCompatActivity {
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que6);
        final TextView answer=findViewById(R.id.answer);
        final EditText num=findViewById(R.id.num);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r,sum=0,temp;
                int n=Integer.parseInt(num.getText().toString());
                temp=n;
                while(n>0){
                    r=n%10;
                    sum=(sum*10)+r;
                    n=n/10;
                }
                if(temp==sum)
                    answer.setText("palindrome number ");
                else
                    answer.setText("not palindrome");
            }
        });
    }
}
