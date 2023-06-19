package com.example.web;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewActivity extends Activity {
    private WebView webView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        WebView webView = findViewById(R.id.webview);
        webView.setWebViewClient(new CustomWebViewClient());

        // Inicializa o WebView
        webView = findViewById(R.id.webview);

        // Configura as configurações do WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);  // Habilita o suporte a JavaScript

        // Carrega a URL desejada
        String url = "https://gestal.epizy.com/";
        webView.loadUrl(url);
    }

    @Override
    public void onBackPressed() {
        // Verifica se o WebView pode voltar para a página anterior
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
