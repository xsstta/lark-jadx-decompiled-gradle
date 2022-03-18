package com.ss.android.lark.live.webview;

import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: com.ss.android.lark.live.webview.e */
public class C41540e extends WebChromeClient {

    /* renamed from: a */
    private AbstractC41537c f105602a;

    /* renamed from: b */
    private AbstractC41531a f105603b;

    public C41540e(AbstractC41537c cVar, AbstractC41531a aVar) {
        this.f105602a = cVar;
        this.f105603b = aVar;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        AbstractC41537c cVar = this.f105602a;
        if (cVar != null) {
            cVar.mo149289f();
        }
        AbstractC41531a aVar = this.f105603b;
        if (aVar != null) {
            aVar.mo149301a(i);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        if (this.f105602a != null) {
            if (TextUtils.equals(webView.getUrl(), str) && !TextUtils.isEmpty(webView.getTitle()) && !TextUtils.equals(webView.getUrl(), webView.getTitle())) {
                str = webView.getTitle();
            }
            this.f105602a.mo149284b(str);
        }
    }
}
