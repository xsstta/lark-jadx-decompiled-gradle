package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.ies.bullet.service.base.YieldError;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u001c\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J0\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J0\u0010\"\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J0\u0010#\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J:\u0010$\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)H\u0017J\u001a\u0010*\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010+\u001a\u00020\nH\u0016J\u001c\u0010,\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010-\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010.\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010/H\u0016J$\u0010.\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0006\u00100\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010/H\u0016J2\u00101\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0014\u00102\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020504\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0016\u00108\u001a\u00020\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u00020503H\u0007J\u001e\u00108\u001a\u00020\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u000205032\u0006\u0010:\u001a\u00020\u0012H\u0007J&\u00108\u001a\u00020\u00072\f\u00109\u001a\b\u0012\u0004\u0012\u000205032\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u0012H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/web/WebChromeClientDispatcher;", "Landroid/webkit/WebChromeClient;", "()V", "webChromeClientDelegates", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate;", "addWebChromeClient", "", "webChromeClient", "index", "", "clear", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "getVideoLoadingProgressView", "Landroid/view/View;", "onConsoleMessage", "message", "", "lineNumber", "sourceID", "onGeolocationPermissionsHidePrompt", "onGeolocationPermissionsShowPrompt", "origin", "callback", "Landroid/webkit/GeolocationPermissions$Callback;", "onHideCustomView", "onJsAlert", "", "view", "Landroid/webkit/WebView;", "url", "result", "Landroid/webkit/JsResult;", "onJsBeforeUnload", "onJsConfirm", "onJsPrompt", "defaultValue", "Landroid/webkit/JsPromptResult;", "onPermissionRequest", "request", "Landroid/webkit/PermissionRequest;", "onProgressChanged", "newProgress", "onReceivedTitle", "title", "onShowCustomView", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "requestedOrientation", "onShowFileChooser", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "openFileChooser", "uploadMsg", "acceptType", "capture", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public class WebChromeClientDispatcher extends WebChromeClient {

    /* renamed from: a */
    private final CopyOnWriteArrayList<WebChromeClientDelegate> f37956a = new CopyOnWriteArrayList<>();

    public Bitmap getDefaultVideoPoster() {
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getDefaultVideoPoster();
            } catch (YieldError unused) {
            }
        }
        return super.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().getVideoLoadingProgressView();
            } catch (YieldError unused) {
            }
        }
        return super.getVideoLoadingProgressView();
    }

    public void onGeolocationPermissionsHidePrompt() {
        super.onGeolocationPermissionsHidePrompt();
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onGeolocationPermissionsHidePrompt();
            } catch (YieldError unused) {
            }
        }
    }

    public void onHideCustomView() {
        super.onHideCustomView();
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHideCustomView();
            } catch (YieldError unused) {
            }
        }
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        super.onPermissionRequest(permissionRequest);
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onPermissionRequest(permissionRequest);
            } catch (YieldError unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo52791a(valueCallback);
            } catch (YieldError unused) {
            }
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onGeolocationPermissionsShowPrompt(str, callback);
            } catch (YieldError unused) {
            }
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onProgressChanged(webView, i);
            } catch (YieldError unused) {
            }
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onReceivedTitle(webView, str);
            } catch (YieldError unused) {
            }
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, customViewCallback);
            } catch (YieldError unused) {
            }
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
        Intrinsics.checkParameterIsNotNull(str, "acceptType");
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo52792a(valueCallback, str);
            } catch (YieldError unused) {
            }
        }
    }

    public void onConsoleMessage(String str, int i, String str2) {
        super.onConsoleMessage(str, i, str2);
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onConsoleMessage(str, i, str2);
            } catch (YieldError unused) {
            }
        }
    }

    public void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, i, customViewCallback);
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().onShowCustomView(view, i, customViewCallback);
            } catch (YieldError unused) {
            }
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onShowFileChooser(webView, valueCallback, fileChooserParams);
            } catch (YieldError unused) {
            }
        }
        return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
        Intrinsics.checkParameterIsNotNull(str, "acceptType");
        Intrinsics.checkParameterIsNotNull(str2, "capture");
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                it.next().mo52793a(valueCallback, str, str2);
            } catch (YieldError unused) {
            }
        }
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsAlert(webView, str, str2, jsResult);
            } catch (YieldError unused) {
            }
        }
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsBeforeUnload(webView, str, str2, jsResult);
            } catch (YieldError unused) {
            }
        }
        return super.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsConfirm(webView, str, str2, jsResult);
            } catch (YieldError unused) {
            }
        }
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Iterator<T> it = this.f37956a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().onJsPrompt(webView, str, str2, str3, jsPromptResult);
            } catch (YieldError unused) {
            }
        }
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }
}
