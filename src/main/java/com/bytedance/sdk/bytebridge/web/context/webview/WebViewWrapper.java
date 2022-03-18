package com.bytedance.sdk.bytebridge.web.context.webview;

import android.app.Activity;
import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002J \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0015H\u0017J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006!"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/context/webview/WebViewWrapper;", "Lcom/bytedance/sdk/bytebridge/web/context/webview/NativeWebView;", "webView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "count", "", "getWebView", "()Landroid/webkit/WebView;", "addJavascriptInterface", "", "jsInterface", "", "name", "", "equals", "", "other", "evaluateJavascript", "script", "resultCallback", "Landroid/webkit/ValueCallback;", "getActivity", "Landroid/app/Activity;", "getNativeWebView", "getUrl", "hashCode", "loadUrl", "url", "onRegister", "onUnRegister", "shouldRemove", "Companion", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.c.a.b */
public final class WebViewWrapper extends NativeWebView {

    /* renamed from: a */
    public static final ConcurrentHashMap<WebView, WebViewWrapper> f50634a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final Companion f50635b = new Companion(null);

    /* renamed from: c */
    private final WebView f50636c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/context/webview/WebViewWrapper$Companion;", "", "()V", "webViewWrapperContainer", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/webkit/WebView;", "Lcom/bytedance/sdk/bytebridge/web/context/webview/WebViewWrapper;", "getWebViewWrapper", "webView", "remove", "", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.sdk.bytebridge.web.c.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.webview.NativeWebView
    /* renamed from: c */
    public WebView mo69871c() {
        return this.f50636c;
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: b */
    public String mo69588b() {
        return this.f50636c.getUrl();
    }

    public int hashCode() {
        return this.f50636c.hashCode();
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: a */
    public Activity mo69585a() {
        Context context = this.f50636c.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        return (Activity) context;
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: a */
    public void mo69586a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f50636c.loadUrl(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WebViewWrapper) || !Intrinsics.areEqual(this.f50636c, ((WebViewWrapper) obj).f50636c)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: a */
    public void mo69587a(String str, ValueCallback<String> valueCallback) {
        Intrinsics.checkParameterIsNotNull(str, "script");
        this.f50636c.evaluateJavascript(str, valueCallback);
    }
}
