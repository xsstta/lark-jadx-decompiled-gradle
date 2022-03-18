package com.bytedance.sdk.bridge.js.webview;

import android.app.Activity;
import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0017J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0017J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\rH\u0016J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/sdk/bridge/js/webview/WebViewWrapper;", "Lcom/bytedance/sdk/bridge/js/webview/IWebView;", "Lcom/bytedance/sdk/bridge/js/webview/ISafeWebView;", "webview", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "webviewWeakReference", "Ljava/lang/ref/WeakReference;", "addJavascriptInterface", "", "object", "", "name", "", "evaluateJavascript", "script", "resultCallback", "getActivity", "Landroid/app/Activity;", "getSafeUrl", "getUrl", "getWebView", "getWebView$js_bridge_release", "loadUrl", "url", "setPageStartUrl", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.webview.d */
public final class WebViewWrapper implements ISafeWebView, IWebView {

    /* renamed from: a */
    private final WeakReference<WebView> f50512a;

    /* renamed from: d */
    public final WebView mo69730d() {
        return this.f50512a.get();
    }

    @Override // com.bytedance.sdk.bridge.js.webview.ISafeWebView
    /* renamed from: a */
    public String mo69700a() {
        WebView d = mo69730d();
        if (d instanceof ISafeWebView) {
            return ((ISafeWebView) d).mo69700a();
        }
        return null;
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: b */
    public Activity mo69704b() {
        Context context;
        WebView webView = this.f50512a.get();
        Activity activity = null;
        if (webView != null) {
            context = webView.getContext();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = context;
        }
        return activity;
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: c */
    public String mo69706c() {
        WebView webView = this.f50512a.get();
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public WebViewWrapper(WebView webView) {
        Intrinsics.checkParameterIsNotNull(webView, "webview");
        this.f50512a = new WeakReference<>(webView);
    }

    @Override // com.bytedance.sdk.bridge.js.webview.ISafeWebView
    /* renamed from: a */
    public void mo69701a(String str) {
        WebView d = mo69730d();
        if (d instanceof ISafeWebView) {
            ((ISafeWebView) d).mo69701a(str);
        }
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: b */
    public void mo69705b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        WebView webView = this.f50512a.get();
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: a */
    public void mo69702a(Object obj, String str) {
        Intrinsics.checkParameterIsNotNull(obj, "object");
        Intrinsics.checkParameterIsNotNull(str, "name");
        WebView webView = this.f50512a.get();
        if (webView != null) {
            webView.addJavascriptInterface(obj, str);
        }
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: a */
    public void mo69703a(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "script");
        if (obj instanceof ValueCallback) {
            WebView webView = this.f50512a.get();
            if (webView != null) {
                webView.evaluateJavascript(str, (ValueCallback) obj);
                return;
            }
            return;
        }
        WebView webView2 = this.f50512a.get();
        if (webView2 != null) {
            webView2.evaluateJavascript(str, null);
        }
    }
}
