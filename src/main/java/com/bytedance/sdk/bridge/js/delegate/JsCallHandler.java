package com.bytedance.sdk.bridge.js.delegate;

import com.bytedance.sdk.bridge.js.spec.JsBridgeContext;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/bytedance/sdk/bridge/js/delegate/JsCallHandler;", "", "invoke", "", "params", "Lorg/json/JSONObject;", "context", "Lcom/bytedance/sdk/bridge/js/spec/JsBridgeContext;", "onTerminate", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.a.d */
public interface JsCallHandler {
    /* renamed from: a */
    void mo33970a();

    /* renamed from: a */
    void mo33971a(JSONObject jSONObject, JsBridgeContext dVar);
}
