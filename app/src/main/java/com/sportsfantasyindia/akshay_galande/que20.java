package com.sportsfantasyindia.akshay_galande;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;
import android.widget.Toast;

public class que20 extends AppCompatActivity {
NumberPicker numberPicker;
WebView webView;
    //***********************************
    //Create Bu AKSHAY GALANDE
//********************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que20);
        numberPicker=findViewById(R.id.numberpicker);
        numberPicker.setMaxValue(3);
        numberPicker.setMinValue(1);
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
               webView=findViewById(R.id.web);
                WebViewClient webViewClient=new WebViewClient();
                WebSettings webSettings=webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(webViewClient);
//***********************************
                //Create Bu AKSHAY GALANDE
//********************************
               if(newVal==1)
                {
                webView.loadUrl("http://sportsfantasyindia.com");
                }
                if(newVal==2)
                {
                    webView.loadUrl("https://google.com");
                }
                if(newVal==3)
                {
                    webView.loadUrl("https://developer.android.com/");
                }
            }
        });
    }


}
