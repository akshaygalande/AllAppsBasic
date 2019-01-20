package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class que1 extends AppCompatActivity {
//***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que1);

    }
    public void OnRadioButtonClicked(View view){
        boolean checked=((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.games:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Games is hobbie",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.draw:
                if (checked)
                    Toast.makeText(getApplicationContext(),"DDrawing is hobbie",Toast.LENGTH_SHORT).show();
                    break;
            case R.id.reading:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Reading is hobbie",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void OnCheckBoxClicked(View view) {
        boolean check=((CheckBox)view).isChecked();
        switch(view.getId()) {
            case R.id.cgame:
                if (check)
                    Toast.makeText(getApplicationContext(),"Games is hobbie",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cdraw:
                if (check)
                    Toast.makeText(getApplicationContext(),"DDrawing is hobbie",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cread:
                if (check)
                    Toast.makeText(getApplicationContext(),"Reading is hobbie",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
