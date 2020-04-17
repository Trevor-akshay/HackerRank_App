package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView hackerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hackerview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = hackerview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        hackerview.loadUrl("https://www.hackerrank.com");
        hackerview.setWebViewClient(new WebViewClient());


    }

    @Override
    public void onBackPressed() {
        if (hackerview.canGoBack()) {
            hackerview.goBack();
        } else {
            super.onBackPressed();
        }
    }
}

