package com.ss.android.lark.live.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.live.webview.f */
public class C41541f extends WebViewClient {

    /* renamed from: a */
    private final AbstractC41537c f105604a;

    /* renamed from: b */
    private final AbstractC41532b f105605b;

    public C41541f(AbstractC41537c cVar, AbstractC41532b bVar) {
        this.f105604a = cVar;
        this.f105605b = bVar;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AbstractC41537c cVar = this.f105604a;
        if (cVar != null) {
            cVar.mo149284b(webView.getTitle());
        }
        AbstractC41532b bVar = this.f105605b;
        if (bVar != null) {
            bVar.mo149278a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        AbstractC41537c cVar;
        if (webView.canGoBack() && (cVar = this.f105604a) != null) {
            cVar.mo149289f();
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        AbstractC41532b bVar = this.f105605b;
        if (bVar != null) {
            bVar.mo149279a(webView, str, bitmap);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        NullPointerException e;
        String str2 = "";
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        try {
            str = Uri.parse(webView.getUrl()).getHost();
            try {
                str2 = Uri.parse(sslError.getUrl()).getHost();
            } catch (NullPointerException e2) {
                e = e2;
            }
        } catch (NullPointerException e3) {
            e = e3;
            str = str2;
            Log.m165384e("VcLiveWebViewClient", "onReceivedSslError", e);
            if (!TextUtils.isEmpty(str)) {
            }
            Log.m165389i("VcLiveWebViewClient", "sub resource ssl error , not handle");
            return;
        }
        if (!TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.equals(str2)) {
            Log.m165389i("VcLiveWebViewClient", "sub resource ssl error , not handle");
            return;
        }
        Log.m165389i("VcLiveWebViewClient", "main resource ssl error , callback error");
        AbstractC41532b bVar = this.f105605b;
        if (bVar != null) {
            bVar.mo149277a(webView, sslError.getPrimaryError(), sslError.toString(), sslError.getUrl());
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        AbstractC41532b bVar = this.f105605b;
        if (bVar != null) {
            bVar.mo149277a(webView, i, str, str2);
        }
    }
}
