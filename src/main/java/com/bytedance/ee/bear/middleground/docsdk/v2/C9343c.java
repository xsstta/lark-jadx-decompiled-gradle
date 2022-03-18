package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.content.Context;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.jsbridge.AbstractC7943b;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.bear.jsbridge.BridgeWrapper;
import com.bytedance.ee.bear.jsbridge.C7939a;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.util.io.NonProguard;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.v2.c */
public class C9343c implements AbstractC4931i {

    /* renamed from: a */
    private final WebView f25093a;

    /* renamed from: b */
    private final BridgeWrapper f25094b;

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19422a(View.OnTouchListener onTouchListener) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19423a(WebChromeClient webChromeClient) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19425a(WebViewClient webViewClient) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19426a(WebViewClient webViewClient, int i) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19436b(View.OnTouchListener onTouchListener) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19437b(WebChromeClient webChromeClient) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19438b(WebViewClient webViewClient) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public WebView mo19435b() {
        return this.f25093a;
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: c */
    public IBridge mo19440c() {
        return this.f25094b;
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19433a(String str, NonProguard nonProguard) {
        mo19434a(str, nonProguard, (ValueCallback<String>) null);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19434a(String str, NonProguard nonProguard, ValueCallback<String> valueCallback) {
        C11755a.m48727a(this.f25093a, str, nonProguard, valueCallback);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public Context mo19421a() {
        return this.f25093a.getContext().getApplicationContext();
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: c */
    public void mo19441c(String str) {
        this.f25094b.mo30844a().mo30831a(str);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19439b(String str) {
        mo19428a(str, (JSONObject) null);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19427a(String str) {
        this.f25093a.loadUrl(str);
    }

    public C9343c(WebView webView, C7939a aVar) {
        this.f25093a = webView;
        this.f25094b = new BridgeWrapper(aVar);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19428a(String str, JSONObject jSONObject) {
        mo19429a(str, jSONObject, (ValueCallback<String>) null);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19430a(String str, AbstractC7943b bVar) {
        this.f25094b.mo30844a().mo30832a(str, bVar);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19431a(String str, AbstractC7945d dVar) {
        mo19430a(str, C7939a.m31730a(dVar));
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19432a(String str, AbstractC7948j jVar) {
        this.f25094b.mo30844a().mo30834a(str, jVar);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19429a(String str, JSONObject jSONObject, ValueCallback<String> valueCallback) {
        C11755a.m48726a(this.f25093a, str, jSONObject, valueCallback);
    }
}
