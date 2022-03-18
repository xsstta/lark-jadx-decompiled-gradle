package com.bytedance.sdk.bridge.lynx;

import android.app.Activity;
import com.lynx.tasm.behavior.AbstractC26684l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxWebViewDelegate;", "Lcom/bytedance/sdk/bridge/lynx/ILynxCellWebView;", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "(Lcom/lynx/tasm/behavior/LynxContext;)V", "LYNX_SCHEMA", "", "TAG", "getContext", "()Lcom/lynx/tasm/behavior/LynxContext;", "addJavascriptInterface", "", "object", "", "name", "evaluateJavascript", "script", "resultCallback", "getActivity", "Landroid/app/Activity;", "getUrl", "loadUrl", "url", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.lynx.j */
public final class LynxWebViewDelegate extends ILynxCellWebView {

    /* renamed from: a */
    private final String f50531a = "sslocal://lynx_bridge";

    /* renamed from: b */
    private final String f50532b = "LynxWebViewDelegate";

    /* renamed from: c */
    private final AbstractC26684l f50533c;

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: a */
    public void mo69702a(Object obj, String str) {
        Intrinsics.checkParameterIsNotNull(obj, "object");
        Intrinsics.checkParameterIsNotNull(str, "name");
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: a */
    public void mo69703a(String str, Object obj) {
        Intrinsics.checkParameterIsNotNull(str, "script");
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: b */
    public void mo69705b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: c */
    public String mo69706c() {
        return this.f50531a;
    }

    @Override // com.bytedance.sdk.bridge.js.webview.IWebView
    /* renamed from: b */
    public Activity mo69704b() {
        return LynxBridgeManager.f50529a.mo69749a();
    }

    public LynxWebViewDelegate(AbstractC26684l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "context");
        this.f50533c = lVar;
    }
}
