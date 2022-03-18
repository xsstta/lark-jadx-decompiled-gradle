package com.bytedance.sdk.bridge.js;

import android.app.Activity;
import android.webkit.ValueCallback;
import com.bytedance.sdk.bytebridge.web.context.IWebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/sdk/bridge/js/ByteBridgeIWebView;", "Lcom/bytedance/sdk/bytebridge/web/context/IWebView;", "srcIWebView", "Lcom/bytedance/sdk/bridge/js/webview/IWebView;", "(Lcom/bytedance/sdk/bridge/js/webview/IWebView;)V", "addJavascriptInterface", "", "jsInterface", "", "name", "", "equals", "", "other", "evaluateJavascript", "script", "resultCallback", "Landroid/webkit/ValueCallback;", "getActivity", "Landroid/app/Activity;", "getUrl", "hashCode", "", "loadUrl", "url", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.a */
public final class ByteBridgeIWebView implements IWebView {

    /* renamed from: a */
    private final com.bytedance.sdk.bridge.js.webview.IWebView f50446a;

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: a */
    public Activity mo69585a() {
        com.bytedance.sdk.bridge.js.webview.IWebView bVar = this.f50446a;
        if (bVar != null) {
            return bVar.mo69704b();
        }
        return null;
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: b */
    public String mo69588b() {
        com.bytedance.sdk.bridge.js.webview.IWebView bVar = this.f50446a;
        if (bVar != null) {
            return bVar.mo69706c();
        }
        return null;
    }

    public int hashCode() {
        com.bytedance.sdk.bridge.js.webview.IWebView bVar = this.f50446a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public ByteBridgeIWebView(com.bytedance.sdk.bridge.js.webview.IWebView bVar) {
        this.f50446a = bVar;
    }

    public boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f50446a, obj);
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: a */
    public void mo69586a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        com.bytedance.sdk.bridge.js.webview.IWebView bVar = this.f50446a;
        if (bVar != null) {
            bVar.mo69705b(str);
        }
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.IWebView
    /* renamed from: a */
    public void mo69587a(String str, ValueCallback<String> valueCallback) {
        Intrinsics.checkParameterIsNotNull(str, "script");
        com.bytedance.sdk.bridge.js.webview.IWebView bVar = this.f50446a;
        if (bVar != null) {
            bVar.mo69703a(str, valueCallback);
        }
    }
}
