package com.bytedance.ies.bullet.service.base.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.ies.bullet.service.base.YieldError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J0\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J0\u0010\u0010\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J0\u0010\u0011\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J:\u0010\u0012\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0017J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0019H\u0016J2\u0010\u001a\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J2\u0010\u001a\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0014\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010!H\u0016J\u0016\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001cH\u0016J\u001e\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010$\u001a\u00020\fH\u0016J&\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0016¨\u0006&"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/web/WebChromeClientDelegate;", "Landroid/webkit/WebChromeClient;", "()V", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "getVideoLoadingProgressView", "Landroid/view/View;", "onJsAlert", "", "view", "Landroid/webkit/WebView;", "url", "", "message", "result", "Landroid/webkit/JsResult;", "onJsBeforeUnload", "onJsConfirm", "onJsPrompt", "defaultValue", "Landroid/webkit/JsPromptResult;", "onPermissionRequest", "", "request", "Landroid/webkit/PermissionRequest;", "Lcom/bytedance/ies/bullet/service/base/web/IPermissionRequest;", "onShowFileChooser", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "Lcom/bytedance/ies/bullet/service/base/web/IFileChooserParams;", "openFileChooser", "uploadMsg", "acceptType", "capture", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.web.c */
public class WebChromeClientDelegate extends WebChromeClient {
    /* renamed from: a */
    public void mo52791a(ValueCallback<Uri> valueCallback) {
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
    }

    /* renamed from: a */
    public void mo52792a(ValueCallback<Uri> valueCallback, String str) {
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
        Intrinsics.checkParameterIsNotNull(str, "acceptType");
    }

    /* renamed from: a */
    public void mo52793a(ValueCallback<Uri> valueCallback, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
        Intrinsics.checkParameterIsNotNull(str, "acceptType");
        Intrinsics.checkParameterIsNotNull(str2, "capture");
    }

    /* renamed from: a */
    public void mo52794a(IPermissionRequest bVar) {
    }

    public Bitmap getDefaultVideoPoster() {
        throw new YieldError("An operation is not implemented");
    }

    public View getVideoLoadingProgressView() {
        throw new YieldError("An operation is not implemented");
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        IPermissionRequest bVar;
        if (permissionRequest != null) {
            bVar = C14421d.m58171a(permissionRequest);
        } else {
            bVar = null;
        }
        mo52794a(bVar);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        IFileChooserParams aVar;
        if (fileChooserParams != null) {
            aVar = C14421d.m58170a(fileChooserParams);
        } else {
            aVar = null;
        }
        return mo52795a(webView, valueCallback, aVar);
    }

    /* renamed from: a */
    public boolean mo52795a(WebView webView, ValueCallback<Uri[]> valueCallback, IFileChooserParams aVar) {
        throw new YieldError("An operation is not implemented");
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        throw new YieldError("An operation is not implemented");
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        throw new YieldError("An operation is not implemented");
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        throw new YieldError("An operation is not implemented");
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        throw new YieldError("An operation is not implemented");
    }
}
