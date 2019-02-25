package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wv extends AppCompatActivity {
    private WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wv);

        w1=findViewById(R.id.wv);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl( MainActivity.s1);

    }
}
