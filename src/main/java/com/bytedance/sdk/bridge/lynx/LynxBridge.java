package com.bytedance.sdk.bridge.lynx;

import com.bytedance.sdk.bridge.js.delegate.JsBridgeRequest;
import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.behavior.AbstractC26684l;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0016"}, d2 = {"Lcom/bytedance/sdk/bridge/lynx/LynxBridge;", "", "()V", "getJsRequestContext", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "webview", "Lcom/bytedance/sdk/bridge/lynx/ILynxCellWebView;", "callbackId", "", "func", "lynxViewProvider", "Lcom/bytedance/sdk/bridge/lynx/ILynxViewProvider;", "callback", "Lcom/lynx/react/bridge/Callback;", "getWebviewDelegate", "context", "Lcom/lynx/tasm/behavior/LynxContext;", "jointJsProtocol", "Lcom/bytedance/sdk/bridge/js/delegate/JsBridgeRequest;", "bridgeName", "params", "Lorg/json/JSONObject;", "lynx-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.lynx.e */
public final class LynxBridge {

    /* renamed from: a */
    public static final LynxBridge f50520a = new LynxBridge();

    private LynxBridge() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ILynxCellWebView m75308a(AbstractC26684l lVar) {
        Intrinsics.checkParameterIsNotNull(lVar, "context");
        return new LynxWebViewDelegate(lVar);
    }

    @JvmStatic
    /* renamed from: a */
    public static final JsBridgeRequest m75306a(String str, JSONObject jSONObject, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Intrinsics.checkParameterIsNotNull(str2, "callbackId");
        JSONObject a = new C20676d().mo69746a("func", str).mo69746a("params", jSONObject).mo69746a("__callback_id", str2).mo69746a("__msg_type", "call").mo69747a();
        Intrinsics.checkExpressionValueIsNotNull(a, "msg");
        return new JsBridgeRequest(a, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final JsBridgeContext m75307a(ILynxCellWebView bVar, String str, String str2, ILynxViewProvider cVar, Callback callback) {
        Intrinsics.checkParameterIsNotNull(bVar, "webview");
        Intrinsics.checkParameterIsNotNull(str, "callbackId");
        Intrinsics.checkParameterIsNotNull(str2, "func");
        return new LynxBridgeContext(bVar, str, str2, cVar, callback);
    }
}
