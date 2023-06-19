package com.example.web;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CustomWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        // Personalize o comportamento para lidar com o carregamento de URL
        return super.shouldOverrideUrlLoading(view, request);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        // Ações a serem executadas quando a página terminar de carregar
        super.onPageFinished(view, url);
    }

    @Override
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        // Ações a serem executadas quando ocorrer um erro no carregamento da página
        super.onReceivedError(view, errorCode, description, failingUrl);
    }

    // Outros métodos a serem sobrescritos, se necessário
}


