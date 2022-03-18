package com.bytedance.ee.bear.document;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.document.g */
public class C5806g extends WebChromeClient {

    /* renamed from: a */
    private final WebViewClient f16315a;

    public C5806g(WebViewClient webViewClient) {
        this.f16315a = webViewClient;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        C13479a.m54764b("DocWebChromeClient", "onCreateWindow");
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f16315a);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
