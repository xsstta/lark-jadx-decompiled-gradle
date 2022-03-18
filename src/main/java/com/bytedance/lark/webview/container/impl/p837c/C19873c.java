package com.bytedance.lark.webview.container.impl.p837c;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.lark.jsbridge.C40666b;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.lark.webview.container.impl.c.c */
public class C19873c {

    /* renamed from: a */
    private boolean f48542a;

    /* renamed from: b */
    private String f48543b;

    /* renamed from: a */
    public void mo67353a(Context context, WebView webView, boolean z, boolean z2) {
        if (z) {
            this.f48542a = false;
        } else if (!this.f48542a || z2) {
            if (TextUtils.isEmpty(this.f48543b)) {
                this.f48543b = C40666b.m160676a(context, "WebViewJavascriptBridgeAdapt.js");
            }
            if (webView != null) {
                webView.evaluateJavascript("javascript:" + this.f48543b, null);
                this.f48542a = true;
                return;
            }
            Log.m165389i("JSSDKAdapter", "tryInjectJsBridge but webView is null");
        }
    }
}
