package com.example.web;

import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);

        // Configura as opções do WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);  // Ativa o suporte a JavaScript

        // Configura o WebViewClient personalizado
        webView.setWebViewClient(new CustomWebViewClient());

        // Carrega a página da web desejada
        webView.loadUrl("https://gestal.epizy.com/");
    }

    @Override
    public void onBackPressed() {
        // Verifica se é possível navegar para trás no histórico do WebView
        if (webView.canGoBack()) {
            webView.goBack();  // Navega para trás
        } else {
            super.onBackPressed();
        }
    }

    private class CustomWebViewClient extends WebViewClient {
        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, android.net.http.SslError error) {
            handler.proceed(); // Ignora o erro de certificado SSL
        }
    }
}

