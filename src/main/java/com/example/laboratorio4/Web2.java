package com.example.laboratorio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web2 extends AppCompatActivity {
    private WebView webView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);

        webView2 = (WebView) findViewById(R.id.webview);
        webView2.setWebViewClient(new WebViewClient());
        webView2.loadUrl("https://github.com/JDiegoS/Laboratorio-3");

        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
