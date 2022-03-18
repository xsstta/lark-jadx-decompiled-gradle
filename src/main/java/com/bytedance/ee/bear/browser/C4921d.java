package com.bytedance.ee.bear.browser;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.larkwebview.base.AbstractC13402a;
import com.bytedance.ee.larkwebview.base.C13405d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.browser.d */
public class C4921d extends C13405d {

    /* renamed from: a */
    private List<WebViewClient> f14475a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void mo19387a(WebViewClient webViewClient) {
        if (!this.f14475a.contains(webViewClient)) {
            this.f14475a.add(webViewClient);
        }
    }

    /* renamed from: a */
    public void mo19388a(Comparator<WebViewClient> comparator) {
        ArrayList arrayList = new ArrayList(this.f14475a);
        Collections.sort(arrayList, comparator);
        this.f14475a.clear();
        this.f14475a.addAll(arrayList);
    }

    /* renamed from: a */
    private boolean m20284a(WebView webView, String str) {
        for (WebViewClient webViewClient : this.f14475a) {
            if (webViewClient.shouldOverrideUrlLoading(webView, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m20283a(WebView webView, WebResourceRequest webResourceRequest) {
        for (WebViewClient webViewClient : this.f14475a) {
            if (webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m20278a(WebView webView, String str, Bitmap bitmap) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onPageStarted(webView, str, bitmap);
        }
    }

    /* renamed from: a */
    private void m20277a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    /* renamed from: a */
    private void m20280a(WebView webView, String str, boolean z) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        }
    }

    /* renamed from: a */
    private boolean m20281a(WebView webView, KeyEvent keyEvent) {
        for (WebViewClient webViewClient : this.f14475a) {
            if (webViewClient.shouldOverrideKeyEvent(webView, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m20279a(WebView webView, String str, String str2, String str3) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    /* renamed from: a */
    private boolean m20282a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        for (WebViewClient webViewClient : this.f14475a) {
            if (webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo19389b(WebViewClient webViewClient) {
        this.f14475a.remove(webViewClient);
    }

    public C4921d(AbstractC13402a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        m20289c(webView, str);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        m20290d(webView, str);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        m20288b(webView, str);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        super.onReceivedClientCertRequest(webView, clientCertRequest);
        m20273a(webView, clientCertRequest);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        super.onUnhandledKeyEvent(webView, keyEvent);
        m20287b(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ee.larkwebview.base.C13405d
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return m20283a(webView, webResourceRequest);
    }

    /* renamed from: a */
    public void mo19386a(int i, WebViewClient webViewClient) {
        if (!this.f14475a.contains(webViewClient)) {
            this.f14475a.add(i, webViewClient);
        }
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ee.larkwebview.base.C13405d
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse b = m20285b(webView, webResourceRequest);
        if (b != null) {
            return b;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient, com.bytedance.ee.larkwebview.base.C13405d
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m20284a(webView, str);
    }

    /* renamed from: b */
    private WebResourceResponse m20285b(WebView webView, WebResourceRequest webResourceRequest) {
        for (WebViewClient webViewClient : this.f14475a) {
            WebResourceResponse shouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            if (shouldInterceptRequest != null) {
                return shouldInterceptRequest;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m20289c(WebView webView, String str) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onLoadResource(webView, str);
        }
    }

    /* renamed from: d */
    private void m20290d(WebView webView, String str) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onPageCommitVisible(webView, str);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (m20282a(webView, renderProcessGoneDetail) || super.onRenderProcessGone(webView, renderProcessGoneDetail)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (m20281a(webView, keyEvent) || super.shouldOverrideKeyEvent(webView, keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m20287b(WebView webView, KeyEvent keyEvent) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    /* renamed from: a */
    private void m20273a(WebView webView, ClientCertRequest clientCertRequest) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    /* renamed from: b */
    private void m20288b(WebView webView, String str) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onPageFinished(webView, str);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        m20280a(webView, str, z);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        super.onFormResubmission(webView, message, message2);
        m20286b(webView, message, message2);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        m20278a(webView, str, bitmap);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        m20277a(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        m20275a(webView, sslErrorHandler, sslError);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onScaleChanged(WebView webView, float f, float f2) {
        super.onScaleChanged(webView, f, f2);
        m20270a(webView, f, f2);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        super.onTooManyRedirects(webView, message, message2);
        m20272a(webView, message, message2);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        m20276a(webView, webResourceRequest, webResourceError);
    }

    /* renamed from: a */
    private void m20270a(WebView webView, float f, float f2) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onScaleChanged(webView, f, f2);
        }
    }

    /* renamed from: b */
    private void m20286b(WebView webView, Message message, Message message2) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onFormResubmission(webView, message, message2);
        }
    }

    /* renamed from: a */
    private void m20272a(WebView webView, Message message, Message message2) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        }
    }

    /* renamed from: a */
    private void m20275a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    /* renamed from: a */
    private void m20276a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        m20271a(webView, i, str, str2);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        m20274a(webView, httpAuthHandler, str, str2);
    }

    @Override // com.bytedance.ee.larkwebview.base.C13405d
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        super.onReceivedLoginRequest(webView, str, str2, str3);
        m20279a(webView, str, str2, str3);
    }

    /* renamed from: a */
    private void m20271a(WebView webView, int i, String str, String str2) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onReceivedError(webView, i, str, str2);
        }
    }

    /* renamed from: a */
    private void m20274a(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        for (WebViewClient webViewClient : this.f14475a) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }
}
