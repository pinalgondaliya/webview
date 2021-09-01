package com.oscar.career.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class webVewAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_vew);

        WebView wb = findViewById(R.id.wb);
        wb.loadUrl("https://developer.android.com/training/volley");

        wb.getSettings().setJavaScriptEnabled(true);

    }
}