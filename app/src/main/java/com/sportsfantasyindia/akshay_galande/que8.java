package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.*;
import android.widget.*;
import android.view.*;

public class que8 extends AppCompatActivity {
    private int progressStatus = 0;
    private Handler handler = new Handler();

    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que8);

        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
        final Button btn = (Button) findViewById(R.id.btn);
        final TextView tv = (TextView) findViewById(R.id.tv);
        final ProgressBar pb = (ProgressBar) findViewById(R.id.pb);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressStatus = 0;
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while(progressStatus < 100){
                            progressStatus +=1;

                            try{
                                Thread.sleep(20);
                            }catch(InterruptedException e){
                                e.printStackTrace();
                            }

                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    pb.setProgress(progressStatus);
                                    tv.setText(progressStatus+"");
                                }
                            });
                        }
                    }
                }).start();
            }
        });

    }
}
