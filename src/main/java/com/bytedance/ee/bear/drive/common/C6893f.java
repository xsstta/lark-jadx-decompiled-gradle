package com.bytedance.ee.bear.drive.common;

import android.webkit.WebView;

/* renamed from: com.bytedance.ee.bear.drive.common.f */
public class C6893f {
    /* renamed from: a */
    public static void m27257a(WebView webView) {
        webView.getSettings().setDefaultTextEncodingName("utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.setScrollBarStyle(0);
        webView.setHorizontalScrollbarOverlay(true);
        webView.setVerticalScrollbarOverlay(true);
        webView.setVerticalScrollBarEnabled(true);
        webView.setHorizontalScrollBarEnabled(true);
    }
}
