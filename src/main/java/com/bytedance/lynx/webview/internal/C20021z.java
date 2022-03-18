package com.bytedance.lynx.webview.internal;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;

/* renamed from: com.bytedance.lynx.webview.internal.z */
public class C20021z extends WebViewClient {

    /* renamed from: a */
    private WebViewClient f48932a;

    /* renamed from: b */
    private IWebViewExtension.RenderProcessGoneListener f48933b;

    /* renamed from: a */
    public void mo67952a(IWebViewExtension.RenderProcessGoneListener renderProcessGoneListener) {
        this.f48933b = renderProcessGoneListener;
    }

    public C20021z(WebViewClient webViewClient) {
        this.f48932a = webViewClient;
    }

    public void onLoadResource(WebView webView, String str) {
        this.f48932a.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        this.f48932a.onPageCommitVisible(webView, str);
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f48932a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.f48932a.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f48932a.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.f48932a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f48932a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void onPageFinished(WebView webView, String str) {
        if (webView.isAttachedToWindow()) {
            C19981o.m72874a();
        }
        this.f48932a.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f48932a.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f48932a.shouldOverrideUrlLoading(webView, str);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f48933b == null) {
            return this.f48932a.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return this.f48933b.onRenderProcessGone(webView, new TTRenderProcessGoneDetail(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit()));
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f48932a.doUpdateVisitedHistory(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f48932a.onFormResubmission(webView, message, message2);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f48932a.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f48932a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f48932a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        this.f48932a.onScaleChanged(webView, f, f2);
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.f48932a.onTooManyRedirects(webView, message, message2);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f48932a.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f48932a.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f48932a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f48932a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.f48932a.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }
}
