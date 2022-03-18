package com.bytedance.sdk.bridge.js.spec;

import android.webkit.WebView;
import com.bytedance.sdk.bridge.Logger;
import com.bytedance.sdk.bridge.js.JsBridgeRegistry;
import com.bytedance.sdk.bridge.js.delegate.JsBridgeDelegate;
import com.bytedance.sdk.bridge.model.BridgeResult;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ*\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0010J*\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/sdk/bridge/js/spec/JsbridgeEventHelper;", "", "()V", "TAG", "", "sendEvent", "", "event", "Lcom/bytedance/sdk/bridge/js/spec/JsbridgeEventHelper$Event;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "webView", "Landroid/webkit/WebView;", "", "iJsLoadUrlResult", "Lcom/bytedance/sdk/bridge/js/spec/IJsLoadUrlResult;", "Lcom/bytedance/sdk/bridge/js/webview/IWebView;", "Event", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class JsbridgeEventHelper {

    /* renamed from: a */
    public static final JsbridgeEventHelper f50506a = new JsbridgeEventHelper();

    /* renamed from: b */
    private static final String f50507b = f50507b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/sdk/bridge/js/spec/JsbridgeEventHelper$Event;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PAGE_STATE_CHANGE", "VISIBLE", "INVISIBLE", "SHARE_RESULT", "BATTERY_LEVEL_CHANGE", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum Event {
        PAGE_STATE_CHANGE("page_status_change"),
        VISIBLE("visible"),
        INVISIBLE("invisible"),
        SHARE_RESULT("share_result"),
        BATTERY_LEVEL_CHANGE("batteryLevelChanged");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        private Event(String str) {
            this.value = str;
        }
    }

    private JsbridgeEventHelper() {
    }

    /* renamed from: a */
    public final boolean mo69658a(String str, JSONObject jSONObject, WebView webView) {
        Intrinsics.checkParameterIsNotNull(str, "event");
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        Logger lVar = Logger.f50514b;
        String str2 = f50507b;
        lVar.mo69733a(str2, "sendEvent " + str + ' ' + String.valueOf(jSONObject));
        if (!JsBridgeRegistry.f50491a.mo69646a(webView.getUrl(), str, webView)) {
            return false;
        }
        JsBridgeDelegate.m75186a(JsBridgeDelegate.f50450a, str, BridgeResult.f50535a.mo69763a(jSONObject, (String) null).mo69759d(), JsBridgeDelegate.f50450a.mo69594a(webView), true, null, 16, null);
        return true;
    }
}
