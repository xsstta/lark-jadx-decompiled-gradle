package com.bytedance.ee.bear.document;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ee.util.common.C13606d;

/* renamed from: com.bytedance.ee.bear.document.a */
public class C5622a extends WebViewClient {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.document.a$a */
    public static class C5624a {

        /* renamed from: a */
        public static final C5622a f15944a = new C5622a();
    }

    private C5622a() {
    }

    /* renamed from: a */
    public static C5622a m22827a() {
        return C5624a.f15944a;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C13606d.m55245a("BackgroundWebViewClient", new RuntimeException("load url when webview is in background!"));
        return true;
    }
}
