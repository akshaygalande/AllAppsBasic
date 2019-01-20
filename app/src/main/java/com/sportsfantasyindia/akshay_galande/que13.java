package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TimePicker;
import android.widget.Toast;

public class que13 extends AppCompatActivity {
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que13);

        Switch wifi=findViewById(R.id.wifi);
        Switch blue=findViewById(R.id.bluetooth);
if(wifi.isChecked() & blue.isChecked()){
    Toast.makeText(getApplicationContext(),"Both are On",Toast.LENGTH_SHORT).show();
}
        else if(wifi.isChecked() ){
            Toast.makeText(getApplicationContext(),"Wifi is On",Toast.LENGTH_SHORT).show();
        }
else if(blue.isChecked() ){
    Toast.makeText(getApplicationContext(),"Bluetooth is On",Toast.LENGTH_SHORT).show();
}
else {
    Toast.makeText(getApplicationContext(),"OFF STATE",Toast.LENGTH_SHORT).show();
}
    }

}
