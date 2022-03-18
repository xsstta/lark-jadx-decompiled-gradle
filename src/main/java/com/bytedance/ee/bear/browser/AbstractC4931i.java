package com.bytedance.ee.bear.browser;

import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.jsbridge.AbstractC7943b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.util.io.NonProguard;

/* renamed from: com.bytedance.ee.bear.browser.i */
public interface AbstractC4931i {
    /* renamed from: a */
    Context mo19421a();

    /* renamed from: a */
    void mo19422a(View.OnTouchListener onTouchListener);

    /* renamed from: a */
    void mo19423a(WebChromeClient webChromeClient);

    /* renamed from: a */
    void mo19425a(WebViewClient webViewClient);

    /* renamed from: a */
    void mo19426a(WebViewClient webViewClient, int i);

    /* renamed from: a */
    void mo19427a(String str);

    /* renamed from: a */
    void mo19428a(String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo19429a(String str, JSONObject jSONObject, ValueCallback<String> valueCallback);

    /* renamed from: a */
    void mo19430a(String str, AbstractC7943b bVar);

    /* renamed from: a */
    void mo19431a(String str, AbstractC7945d dVar);

    /* renamed from: a */
    void mo19432a(String str, AbstractC7948j jVar);

    /* renamed from: a */
    void mo19433a(String str, NonProguard nonProguard);

    /* renamed from: a */
    void mo19434a(String str, NonProguard nonProguard, ValueCallback<String> valueCallback);

    /* renamed from: b */
    WebView mo19435b();

    /* renamed from: b */
    void mo19436b(View.OnTouchListener onTouchListener);

    /* renamed from: b */
    void mo19437b(WebChromeClient webChromeClient);

    /* renamed from: b */
    void mo19438b(WebViewClient webViewClient);

    /* renamed from: b */
    void mo19439b(String str);

    /* renamed from: c */
    IBridge mo19440c();

    /* renamed from: c */
    void mo19441c(String str);
}
