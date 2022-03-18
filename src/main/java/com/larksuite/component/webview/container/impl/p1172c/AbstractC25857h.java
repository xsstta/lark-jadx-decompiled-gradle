package com.larksuite.component.webview.container.impl.p1172c;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.larksuite.component.webview.container.impl.c.h */
public interface AbstractC25857h {
    /* renamed from: a */
    void mo67252a();

    /* renamed from: a */
    void mo67253a(View view, int i, WebChromeClient.CustomViewCallback customViewCallback);

    /* renamed from: a */
    void mo67254a(View view, WebChromeClient.CustomViewCallback customViewCallback);

    /* renamed from: a */
    void mo67255a(WebView webView);

    /* renamed from: a */
    boolean mo67257a(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams);

    /* renamed from: a */
    boolean mo67258a(WebView webView, boolean z, boolean z2, Message message);
}
