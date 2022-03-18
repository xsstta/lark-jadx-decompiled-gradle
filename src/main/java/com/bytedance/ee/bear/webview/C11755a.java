package com.bytedance.ee.bear.webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p704g.C13665a;

/* renamed from: com.bytedance.ee.bear.webview.a */
public class C11755a {
    /* renamed from: a */
    private static boolean m48728a(WebView webView) {
        if (webView != null) {
            return false;
        }
        C13606d.m55245a("SafeJSExecutor", new IllegalStateException("execJS no webView !"));
        return true;
    }

    /* renamed from: a */
    public static void m48724a(WebView webView, String str) {
        m48726a(webView, str, (JSONObject) null, (ValueCallback<String>) null);
    }

    /* renamed from: a */
    public static void m48725a(WebView webView, String str, JSONObject jSONObject) {
        m48726a(webView, str, jSONObject, (ValueCallback<String>) null);
    }

    /* renamed from: a */
    public static void m48726a(WebView webView, String str, JSONObject jSONObject, ValueCallback<String> valueCallback) {
        if (!m48728a(webView)) {
            webView.evaluateJavascript(C13665a.m55441a(str, jSONObject), valueCallback);
        }
    }

    /* renamed from: a */
    public static void m48727a(WebView webView, String str, NonProguard nonProguard, ValueCallback<String> valueCallback) {
        if (!m48728a(webView)) {
            webView.evaluateJavascript(C13665a.m55441a(str, nonProguard), valueCallback);
        }
    }
}
