package com.ss.android.lark.openapi.webcore.p2398a;

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

/* renamed from: com.ss.android.lark.openapi.webcore.a.e */
public interface AbstractC48781e {
    /* renamed from: a */
    void mo170413a(WebView webView, float f, float f2);

    /* renamed from: a */
    void mo170414a(WebView webView, int i, String str, String str2);

    /* renamed from: a */
    void mo170415a(WebView webView, Message message, Message message2);

    /* renamed from: a */
    void mo170416a(WebView webView, ClientCertRequest clientCertRequest);

    /* renamed from: a */
    void mo170417a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2);

    /* renamed from: a */
    void mo170418a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    /* renamed from: a */
    void mo170419a(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse);

    /* renamed from: a */
    void mo170420a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError);

    /* renamed from: a */
    void mo170421a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse);

    /* renamed from: a */
    void mo170422a(WebView webView, String str, Bitmap bitmap);

    /* renamed from: a */
    void mo170423a(WebView webView, String str, String str2, String str3);

    /* renamed from: a */
    void mo170424a(WebView webView, String str, boolean z);

    /* renamed from: a */
    boolean mo170425a(WebView webView, KeyEvent keyEvent);

    /* renamed from: a */
    boolean mo170426a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail);

    /* renamed from: a */
    boolean mo170427a(WebView webView, WebResourceRequest webResourceRequest);

    /* renamed from: a */
    boolean mo170428a(WebView webView, String str);

    /* renamed from: b */
    WebResourceResponse mo170429b(WebView webView, WebResourceRequest webResourceRequest);

    /* renamed from: b */
    void mo170430b(WebView webView, Message message, Message message2);

    /* renamed from: b */
    void mo170431b(WebView webView, KeyEvent keyEvent);

    /* renamed from: b */
    void mo170432b(WebView webView, String str);

    /* renamed from: c */
    void mo170433c(WebView webView, String str);

    /* renamed from: d */
    void mo170434d(WebView webView, String str);

    /* renamed from: e */
    WebResourceResponse mo170435e(WebView webView, String str);
}
