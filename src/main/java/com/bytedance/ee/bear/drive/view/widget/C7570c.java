package com.bytedance.ee.bear.drive.view.widget;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.drive.view.widget.c */
public class C7570c extends WebViewClient {

    /* renamed from: a */
    private ArrayList<C7571d> f20565a = new ArrayList<>();

    /* renamed from: a */
    public void mo29707a(C7571d dVar) {
        this.f20565a.add(dVar);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Iterator<C7571d> it = this.f20565a.iterator();
        while (it.hasNext()) {
            it.next().mo29373a(webView, str);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Iterator<C7571d> it = this.f20565a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().mo29430b(webView, str)) {
                z = true;
            }
        }
        return z;
    }
}
