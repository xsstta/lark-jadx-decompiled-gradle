package com.bytedance.sdk.bridge.js.delegate;

import android.util.Log;
import android.webkit.JavascriptInterface;
import androidx.lifecycle.Lifecycle;
import com.bytedance.sdk.bridge.Logger;
import com.bytedance.sdk.bridge.js.webview.IWebView;
import com.bytedance.sdk.bridge.monitor.BridgeMonitor;
import com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo;
import com.bytedance.sdk.bytebridge.web.widget.JsCallType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/sdk/bridge/js/delegate/JavaScriptInterfaceModule;", "", "webView", "Lcom/bytedance/sdk/bridge/js/webview/IWebView;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "(Lcom/bytedance/sdk/bridge/js/webview/IWebView;Landroid/arch/lifecycle/Lifecycle;)V", "TAG", "", "getLifecycle", "()Landroid/arch/lifecycle/Lifecycle;", "_invokeMethod", "message", "call", "bridgeName", "callSync", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.a.a */
public final class JavaScriptInterfaceModule {

    /* renamed from: a */
    private final String f50447a;

    /* renamed from: b */
    private final IWebView f50448b;

    /* renamed from: c */
    private final Lifecycle f50449c;

    @JavascriptInterface
    public final String _invokeMethod(String str) {
        Logger lVar = Logger.f50514b;
        String str2 = this.f50447a;
        lVar.mo69733a(str2, "_invokeMethod - " + str);
        JSONObject jSONObject = new JSONObject(str);
        try {
            if (str == null) {
                Intrinsics.throwNpe();
            }
            JsBridgeDelegate.f50450a.mo69597a(this.f50448b, new JsCallOriginInfo(str), this.f50449c);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_msg", "call error " + Log.getStackTraceString(e));
            BridgeMonitor aVar = BridgeMonitor.f50418a;
            String optString = jSONObject.optString("func", "");
            Intrinsics.checkExpressionValueIsNotNull(optString, "msg.optString(\"func\",\"\")");
            jSONObject2.put("extra_params", aVar.mo69557a(optString, jSONObject.optJSONObject("params")));
            BridgeMonitor.m75144a(BridgeMonitor.f50418a, 1, "jsCall", new JSONObject(), jSONObject2, null, 16, null);
            return null;
        }
    }

    public JavaScriptInterfaceModule(IWebView bVar, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(bVar, "webView");
        this.f50448b = bVar;
        this.f50449c = lifecycle;
        this.f50447a = "JavaScriptModule";
    }

    @JavascriptInterface
    public final String call(String str, String str2) {
        Logger lVar = Logger.f50514b;
        String str3 = this.f50447a;
        lVar.mo69733a(str3, "call - " + str + ' ' + str2);
        JSONObject jSONObject = new JSONObject(str2);
        try {
            if (str == null) {
                Intrinsics.throwNpe();
            }
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            JsBridgeDelegate.f50450a.mo69597a(this.f50448b, new JsCallOriginInfo(str, str2, JsCallType.JS_CALL, null, 8, null), this.f50449c);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_msg", "call error " + Log.getStackTraceString(e));
            jSONObject2.put("bridge_name", str);
            jSONObject2.put("is_sync", 0);
            jSONObject2.put("error_code", 1);
            jSONObject2.put("event_type", "jsCall");
            BridgeMonitor aVar = BridgeMonitor.f50418a;
            String optString = jSONObject.optString("func", "");
            Intrinsics.checkExpressionValueIsNotNull(optString, "msg.optString(\"func\",\"\")");
            jSONObject2.put("extra_params", aVar.mo69557a(optString, jSONObject.optJSONObject("params")));
            BridgeMonitor.m75144a(BridgeMonitor.f50418a, 1, "jsCall", new JSONObject(), jSONObject2, null, 16, null);
            return null;
        }
    }

    @JavascriptInterface
    public final String callSync(String str, String str2) {
        Logger lVar = Logger.f50514b;
        String str3 = this.f50447a;
        lVar.mo69733a(str3, "callSync - " + str + ' ' + str2);
        JSONObject jSONObject = new JSONObject(str2);
        try {
            if (str == null) {
                Intrinsics.throwNpe();
            }
            if (str2 == null) {
                Intrinsics.throwNpe();
            }
            return JsBridgeDelegate.f50450a.mo69604b(this.f50448b, new JsCallOriginInfo(str, str2, JsCallType.JS_CALL_SYNC, null, 8, null), this.f50449c).mo69759d().toString();
        } catch (Exception e) {
            e.printStackTrace();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_msg", "callSync error " + Log.getStackTraceString(e));
            jSONObject2.put("bridge_name", str);
            jSONObject2.put("is_sync", 1);
            jSONObject2.put("error_code", 1);
            jSONObject2.put("event_type", "jsCallSync");
            BridgeMonitor aVar = BridgeMonitor.f50418a;
            String optString = jSONObject.optString("func", "");
            Intrinsics.checkExpressionValueIsNotNull(optString, "msg.optString(\"func\",\"\")");
            jSONObject2.put("extra_params", aVar.mo69557a(optString, jSONObject.optJSONObject("params")));
            BridgeMonitor.m75144a(BridgeMonitor.f50418a, 1, "jsCallSync", new JSONObject(), jSONObject2, null, 16, null);
            return null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JavaScriptInterfaceModule(IWebView bVar, Lifecycle lifecycle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i & 2) != 0 ? null : lifecycle);
    }
}
