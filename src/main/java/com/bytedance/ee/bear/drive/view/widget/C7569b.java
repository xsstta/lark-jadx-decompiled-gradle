package com.bytedance.ee.bear.drive.view.widget;

import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.bytedance.ee.bear.drive.view.widget.b */
public class C7569b extends WebChromeClient {
    public void onCloseWindow(WebView webView) {
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return false;
    }
}
