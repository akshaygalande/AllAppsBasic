package com.sportsfantasyindia.akshay_galande;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
public class que27 extends AppCompatActivity{
    MediaPlayer mediaPlayer;
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que26);

        mediaPlayer=MediaPlayer.create(this,R.raw.a);
    }

    public void play(View view) {
        //mediaPlayer.create(this,R.raw.a);
        mediaPlayer.start();
    }

    public void pause(View view) {
        //mediaPlayer.create(this,R.raw.a);
        mediaPlayer.reset();
    }

}