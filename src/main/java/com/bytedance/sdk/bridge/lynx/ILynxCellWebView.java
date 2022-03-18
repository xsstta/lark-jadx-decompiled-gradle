package com.bytedance.sdk.bridge.lynx;

import com.bytedance.sdk.bridge.js.webview.IWebView;
import com.lynx.react.bridge.Callback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/ILynxCellWebView;", "Lcom/bytedance/sdk/bridge/js/webview/IWebView;", "()V", "callback", "Lcom/lynx/react/bridge/Callback;", "getCallback", "()Lcom/lynx/react/bridge/Callback;", "setCallback", "(Lcom/lynx/react/bridge/Callback;)V", "callbackId", "", "getCallbackId", "()I", "setCallbackId", "(I)V", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.lynx.b */
public abstract class ILynxCellWebView implements IWebView {

    /* renamed from: a */
    private Callback f50517a;

    /* renamed from: b */
    private int f50518b = 1000;

    /* renamed from: a */
    public final Callback mo69742a() {
        return this.f50517a;
    }

    /* renamed from: d */
    public final int mo69745d() {
        return this.f50518b;
    }

    /* renamed from: a */
    public final void mo69743a(int i) {
        this.f50518b = i;
    }

    /* renamed from: a */
    public final void mo69744a(Callback callback) {
        this.f50517a = callback;
    }
}
