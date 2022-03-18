package com.ss.android.lark.jsbridge;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.ss.android.lark.jsbridge.c */
public class C40667c extends WebChromeClient {

    /* renamed from: a */
    BridgeWebView f103272a;

    public C40667c(BridgeWebView bridgeWebView) {
        this.f103272a = bridgeWebView;
    }

    public void onReceivedTitle(WebView webView, String str) {
        this.f103272a.mo146768a(false, false);
    }

    public void onProgressChanged(WebView webView, int i) {
        boolean z;
        BridgeWebView bridgeWebView = this.f103272a;
        if (i < 30) {
            z = true;
        } else {
            z = false;
        }
        bridgeWebView.mo146768a(z, false);
    }
}
