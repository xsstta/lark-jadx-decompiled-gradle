package com.bytedance.ee.larkwebview.service;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: com.bytedance.ee.larkwebview.service.c */
public interface AbstractC13468c extends AbstractC13474i {
    /* renamed from: a */
    void mo49920a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo49921a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo49922a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    /* renamed from: a */
    void mo49923a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);
}
