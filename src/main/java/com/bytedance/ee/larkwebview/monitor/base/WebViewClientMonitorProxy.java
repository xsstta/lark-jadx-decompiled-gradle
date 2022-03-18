package com.bytedance.ee.larkwebview.monitor.base;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.bytedance.ee.larkwebview.monitor.webview.WebMonitorManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J$\u0010\u0011\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\"\u0010\u0014\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\"\u0010\u0019\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\"\u0010\u001c\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u001fJ\u001a\u0010 \u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\"H\u0007J\u0018\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/base/WebViewClientMonitorProxy;", "", "mDependency", "Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;", "(Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;)V", "mCurrentUrl", "", "mErrorCode", "", "mIsError", "", "cleanError", "", "onPageFinished", "view", "Landroid/webkit/WebView;", "url", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "setError", "isError", "errorCode", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.monitor.a.a */
public final class WebViewClientMonitorProxy {

    /* renamed from: a */
    private boolean f35427a;

    /* renamed from: b */
    private int f35428b;

    /* renamed from: c */
    private String f35429c = "";

    /* renamed from: d */
    private final IMonitorDependency f35430d;

    /* renamed from: a */
    private final void m54615a() {
        this.f35427a = false;
        this.f35428b = -1;
    }

    public WebViewClientMonitorProxy(IMonitorDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "mDependency");
        this.f35430d = aVar;
    }

    /* renamed from: a */
    private final void m54616a(boolean z, int i) {
        this.f35427a = z;
        this.f35428b = i;
    }

    /* renamed from: a */
    public final void mo49850a(WebView webView, String str) {
        if (this.f35427a) {
            WebMonitorManager.f35486a.mo49867a(this.f35430d, this.f35428b);
        } else {
            WebMonitorManager.f35486a.mo49866a(this.f35430d);
        }
        m54615a();
    }

    /* renamed from: a */
    public final boolean mo49852a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Intrinsics.checkParameterIsNotNull(renderProcessGoneDetail, "detail");
        WebMonitorManager.f35486a.mo49878c(this.f35430d);
        return false;
    }

    /* renamed from: a */
    public final void mo49847a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        Intrinsics.checkParameterIsNotNull(sslError, "error");
        m54616a(true, sslError.getPrimaryError());
    }

    /* renamed from: a */
    public final void mo49848a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Intrinsics.checkParameterIsNotNull(webResourceError, "error");
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            m54616a(true, webResourceError.getErrorCode());
        }
        if (Build.VERSION.SDK_INT >= 23) {
            WebMonitorManager.f35486a.mo49875b(this.f35430d, webResourceError.getErrorCode());
        }
    }

    /* renamed from: a */
    public final void mo49849a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Intrinsics.checkParameterIsNotNull(webResourceResponse, "errorResponse");
        WebMonitorManager.f35486a.mo49870a(this.f35430d, Integer.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getMimeType());
    }

    /* renamed from: a */
    public final void mo49851a(WebView webView, String str, Bitmap bitmap) {
        if (!TextUtils.isEmpty(this.f35429c)) {
            WebMonitorManager.f35486a.mo49881d(this.f35430d, this.f35429c);
        }
        WebMonitorManager.f35486a.mo49879c(this.f35430d, str);
        WebMonitorManager.f35486a.mo49874b(this.f35430d);
        this.f35429c = str;
    }
}
