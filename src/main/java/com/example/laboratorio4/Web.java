package com.example.laboratorio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com/JDiegoS/Laboratorio-2");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();

        }
        super.onBackPressed();
    }

}
