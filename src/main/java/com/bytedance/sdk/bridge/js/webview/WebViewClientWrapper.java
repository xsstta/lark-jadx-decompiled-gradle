package com.bytedance.sdk.bridge.js.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
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
import androidx.lifecycle.Lifecycle;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate;
import com.bytedance.sdk.bridge.js.plugin.JSBridgePluginHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0012\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J.\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010 \u001a\u0004\u0018\u00010\tH\u0016J0\u0010!\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\tH\u0016J&\u0010&\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J0\u0010)\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010\t2\b\u0010*\u001a\u0004\u0018\u00010\t2\b\u0010+\u001a\u0004\u0018\u00010\tH\u0016J&\u0010,\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\"\u001a\u0004\u0018\u00010-2\b\u0010\u001b\u001a\u0004\u0018\u00010.H\u0016J\u001c\u0010/\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u000101H\u0016J.\u00102\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001a2\u0006\u00103\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u000105H\u0017J\"\u00106\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u000208H\u0016J&\u0010:\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010;\u001a\u0004\u0018\u00010\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010=\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u001e\u0010@\u001a\u0004\u0018\u00010(2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001aH\u0016J\u001e\u0010@\u001a\u0004\u0018\u00010(2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010A\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0018\u0010B\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010B\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u001aH\u0017R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/bytedance/sdk/bridge/js/webview/WebViewClientWrapper;", "Landroid/webkit/WebViewClient;", "webViewClient", "(Landroid/webkit/WebViewClient;)V", "doUpdateVisitedHistory", "", "view", "Landroid/webkit/WebView;", "url", "", "isReload", "", "onFormResubmission", "dontResend", "Landroid/os/Message;", "resend", "onLoadResource", "onPageCommitVisible", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedClientCertRequest", "request", "Landroid/webkit/ClientCertRequest;", "onReceivedError", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpAuthRequest", "handler", "Landroid/webkit/HttpAuthHandler;", "host", "realm", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedLoginRequest", "account", "args", "onReceivedSslError", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "onSafeBrowsingHit", "threatType", "callback", "Landroid/webkit/SafeBrowsingResponse;", "onScaleChanged", "oldScale", "", "newScale", "onTooManyRedirects", "cancelMsg", "continueMsg", "onUnhandledKeyEvent", "event", "Landroid/view/KeyEvent;", "shouldInterceptRequest", "shouldOverrideKeyEvent", "shouldOverrideUrlLoading", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.webview.c */
public final class WebViewClientWrapper extends WebViewClient {

    /* renamed from: a */
    private final WebViewClient f50511a;

    public WebViewClientWrapper(WebViewClient webViewClient) {
        this.f50511a = webViewClient;
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onLoadResource(webView, str);
        } else {
            super.onLoadResource(webView, str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onPageFinished(webView, str);
        } else {
            super.onPageFinished(webView, str);
        }
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            super.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse shouldInterceptRequest;
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient == null || (shouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, str)) == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        return shouldInterceptRequest;
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        if (this.f50511a == null || Build.VERSION.SDK_INT < 23) {
            super.onPageCommitVisible(webView, str);
        } else {
            this.f50511a.onPageCommitVisible(webView, str);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (this.f50511a == null || Build.VERSION.SDK_INT < 21) {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        } else {
            this.f50511a.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f50511a == null || Build.VERSION.SDK_INT < 26) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        return this.f50511a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (this.f50511a == null || Build.VERSION.SDK_INT < 21) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return this.f50511a.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri uri;
        if (webView != null) {
            JsBridgeDelegate bVar = JsBridgeDelegate.f50450a;
            WebViewWrapper a = JsBridgeDelegate.f50450a.mo69594a(webView);
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            JsBridgeDelegate.m75189a(bVar, a, String.valueOf(uri), (Lifecycle) null, 4, (Object) null);
        }
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(webView, "view");
        Intrinsics.checkParameterIsNotNull(str, "url");
        JsBridgeDelegate.m75189a(JsBridgeDelegate.f50450a, JsBridgeDelegate.f50450a.mo69594a(webView), str, (Lifecycle) null, 4, (Object) null);
        boolean a = JSBridgePluginHelper.f50481a.mo69623a(webView, str);
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            z = webViewClient.shouldOverrideUrlLoading(webView, str);
        } else {
            z = super.shouldOverrideUrlLoading(webView, str);
        }
        if (z || a) {
            return true;
        }
        return false;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.doUpdateVisitedHistory(webView, str, z);
        } else {
            super.doUpdateVisitedHistory(webView, str, z);
        }
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onFormResubmission(webView, message, message2);
        } else {
            super.onFormResubmission(webView, message, message2);
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onScaleChanged(webView, f, f2);
        } else {
            super.onScaleChanged(webView, f, f2);
        }
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onTooManyRedirects(webView, message, message2);
        } else {
            super.onTooManyRedirects(webView, message, message2);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        JSBridgePluginHelper.f50481a.mo69622a(webView, str, bitmap);
        if (webView != null && (webView instanceof ISafeWebView)) {
            ((ISafeWebView) webView).mo69701a(str);
        }
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            super.onPageStarted(webView, str, bitmap);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f50511a == null || Build.VERSION.SDK_INT < 23) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        } else {
            this.f50511a.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (this.f50511a == null || Build.VERSION.SDK_INT < 23) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } else {
            this.f50511a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onReceivedError(webView, i, str, str2);
        } else {
            super.onReceivedError(webView, i, str, str2);
        }
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        } else {
            super.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient webViewClient = this.f50511a;
        if (webViewClient != null) {
            webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        } else {
            super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }
}
