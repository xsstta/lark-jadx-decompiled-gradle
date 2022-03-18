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
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.bear.jsbridge.BridgeWebViewV2;
import com.bytedance.ee.bear.jsbridge.IBridge;
import com.bytedance.ee.bear.webview.C11755a;
import com.bytedance.ee.larkwebview.bridge.Bridge;
import com.bytedance.ee.larkwebview.bridge.JsCallBack;
import com.bytedance.ee.larkwebview.bridge.Status;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.io.NonProguard;

/* renamed from: com.bytedance.ee.bear.browser.h */
public class C4929h implements AbstractC4931i {

    /* renamed from: a */
    private final WebView f14486a;

    /* renamed from: b */
    private final Bridge f14487b;

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19423a(WebChromeClient webChromeClient) {
    }

    /* renamed from: a */
    public void mo19424a(WebChromeClient webChromeClient, int i) {
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
    public void mo19437b(WebChromeClient webChromeClient) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19438b(WebViewClient webViewClient) {
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: c */
    public IBridge mo19440c() {
        return null;
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public WebView mo19435b() {
        return this.f14486a;
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19433a(String str, NonProguard nonProguard) {
        this.f14487b.mo49771a(str, nonProguard, (ValueCallback<String>) null);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19434a(String str, NonProguard nonProguard, ValueCallback<String> valueCallback) {
        C11755a.m48727a(this.f14486a, str, nonProguard, valueCallback);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19431a(String str, AbstractC7945d dVar) {
        this.f14487b.mo49770a(str, BridgeWebViewV2.m31697a(dVar));
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19430a(String str, AbstractC7943b bVar) {
        C13606d.m55245a("SimpleWebV2", new RuntimeException("please use jsHandler"));
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19432a(String str, AbstractC7948j jVar) {
        this.f14487b.mo49770a(str, BridgeWebViewV2.m31698a(jVar));
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public Context mo19421a() {
        return this.f14486a.getContext().getApplicationContext();
    }

    /* renamed from: a */
    public static AbstractC7947h m20301a(final JsCallBack gVar) {
        return new AbstractC7947h() {
            /* class com.bytedance.ee.bear.browser.C4929h.C49301 */

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17188a(JSONObject jSONObject) {
                gVar.mo49778a(Status.SUCCESS, jSONObject);
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17189a(NonProguard nonProguard) {
                gVar.mo49778a(Status.SUCCESS, nonProguard);
            }

            @Override // com.bytedance.ee.bear.jsbridge.AbstractC7947h
            /* renamed from: a */
            public void mo17190a(String str) {
                gVar.mo49778a(Status.SUCCESS, str);
            }
        };
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: c */
    public void mo19441c(String str) {
        this.f14487b.mo49774b(str);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19422a(View.OnTouchListener onTouchListener) {
        WebView webView = this.f14486a;
        if (webView instanceof BridgeWebViewV2) {
            ((BridgeWebViewV2) webView).mo30807a(onTouchListener);
        } else {
            C13479a.m54759a("SimpleWebV2", "addOnTouchListener", new IllegalStateException("addOnTouchListener NOT on BridgeWebView"));
        }
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19436b(View.OnTouchListener onTouchListener) {
        WebView webView = this.f14486a;
        if (webView instanceof BridgeWebViewV2) {
            ((BridgeWebViewV2) webView).mo30812b(onTouchListener);
        } else {
            C13479a.m54759a("SimpleWebV2", "removeOnTouchListener", new IllegalStateException("removeOnTouchListener NOT on BridgeWebView"));
        }
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: b */
    public void mo19439b(String str) {
        mo19428a(str, (JSONObject) null);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19427a(String str) {
        this.f14486a.loadUrl(str);
    }

    public C4929h(WebView webView, Bridge aVar) {
        this.f14486a = webView;
        this.f14487b = aVar;
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19428a(String str, JSONObject jSONObject) {
        mo19429a(str, jSONObject, (ValueCallback<String>) null);
    }

    @Override // com.bytedance.ee.bear.browser.AbstractC4931i
    /* renamed from: a */
    public void mo19429a(String str, JSONObject jSONObject, ValueCallback<String> valueCallback) {
        this.f14487b.mo49771a(str, jSONObject, valueCallback);
    }
}
