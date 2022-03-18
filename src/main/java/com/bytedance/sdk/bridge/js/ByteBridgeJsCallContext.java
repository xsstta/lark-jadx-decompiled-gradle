package com.bytedance.sdk.bridge.js;

import android.webkit.WebView;
import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bytebridge.base.result.BridgeSyncResult;
import com.bytedance.sdk.bytebridge.web.context.JsCallContext;
import com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/sdk/bridge/js/ByteBridgeJsCallContext;", "Lcom/bytedance/sdk/bytebridge/web/context/JsCallContext;", "info", "Lcom/bytedance/sdk/bytebridge/web/widget/JsCallOriginInfo;", "bridgeContext", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "(Lcom/bytedance/sdk/bytebridge/web/widget/JsCallOriginInfo;Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;)V", "callback", "", "result", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "getWebView", "Landroid/webkit/WebView;", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.b */
public final class ByteBridgeJsCallContext extends JsCallContext {

    /* renamed from: d */
    private final JsBridgeContext f50480d;

    @Override // com.bytedance.sdk.bytebridge.web.context.JsContext
    /* renamed from: a */
    public WebView mo69620a() {
        return this.f50480d.mo69665a();
    }

    @Override // com.bytedance.sdk.bytebridge.web.context.JsContext, com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext
    /* renamed from: a */
    public void mo69621a(BridgeSyncResult fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "result");
        this.f50480d.mo69666a(C20673e.m75260a(BridgeResult.f50535a, fVar));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ByteBridgeJsCallContext(JsCallOriginInfo aVar, JsBridgeContext dVar) {
        super(aVar, new ByteBridgeIWebView(dVar.mo69667b()));
        Intrinsics.checkParameterIsNotNull(aVar, "info");
        Intrinsics.checkParameterIsNotNull(dVar, "bridgeContext");
        this.f50480d = dVar;
    }
}
