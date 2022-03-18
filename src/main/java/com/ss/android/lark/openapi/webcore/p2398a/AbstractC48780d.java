package com.ss.android.lark.openapi.webcore.p2398a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.ss.android.lark.openapi.webcore.a.d */
public interface AbstractC48780d {
    /* renamed from: a */
    void mo170388a();

    /* renamed from: a */
    void mo170389a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback);

    /* renamed from: a */
    void mo170390a(View view, WebChromeClient.CustomViewCallback customViewCallback);

    /* renamed from: a */
    void mo170391a(PermissionRequest permissionRequest);

    /* renamed from: a */
    void mo170392a(ValueCallback<String[]> valueCallback);

    /* renamed from: a */
    void mo170393a(WebView webView);

    /* renamed from: a */
    void mo170394a(WebView webView, int i);

    /* renamed from: a */
    void mo170395a(WebView webView, Bitmap bitmap);

    /* renamed from: a */
    void mo170396a(WebView webView, String str);

    /* renamed from: a */
    void mo170397a(WebView webView, String str, boolean z);

    /* renamed from: a */
    void mo170398a(String str, int i, String str2);

    /* renamed from: a */
    void mo170399a(String str, GeolocationPermissions.Callback callback);

    /* renamed from: a */
    boolean mo170400a(ConsoleMessage consoleMessage);

    /* renamed from: a */
    boolean mo170401a(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    /* renamed from: a */
    boolean mo170402a(WebView webView, String str, String str2, JsResult jsResult);

    /* renamed from: a */
    boolean mo170403a(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult);

    /* renamed from: a */
    boolean mo170404a(WebView webView, boolean z, boolean z2, Message message);

    /* renamed from: b */
    void mo170405b();

    /* renamed from: b */
    void mo170406b(PermissionRequest permissionRequest);

    /* renamed from: b */
    void mo170407b(WebView webView);

    /* renamed from: b */
    boolean mo170408b(WebView webView, String str, String str2, JsResult jsResult);

    /* renamed from: c */
    boolean mo170409c();

    /* renamed from: c */
    boolean mo170410c(WebView webView, String str, String str2, JsResult jsResult);

    /* renamed from: d */
    Bitmap mo170411d();

    /* renamed from: e */
    View mo170412e();
}
