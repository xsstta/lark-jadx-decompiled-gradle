package com.bytedance.sdk.bridge.js.delegate;

import com.bytedance.sdk.bytebridge.web.widget.JsRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001f\u001a\u00020 R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/bytedance/sdk/bridge/js/delegate/JsBridgeRequest;", "", "msg", "Lorg/json/JSONObject;", "bridgeName", "", "(Lorg/json/JSONObject;Ljava/lang/String;)V", "callbackId", "getCallbackId", "()Ljava/lang/String;", "setCallbackId", "(Ljava/lang/String;)V", "currentUrl", "getCurrentUrl", "function", "getFunction", "setFunction", "params", "getParams", "()Lorg/json/JSONObject;", "setParams", "(Lorg/json/JSONObject;)V", ShareHitPoint.f121869d, "getType", "setType", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "getVersion", "()I", "setVersion", "(I)V", "toByteBridgeJsRequest", "Lcom/bytedance/sdk/bytebridge/web/widget/JsRequest;", "js-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.a.c */
public final class JsBridgeRequest {

    /* renamed from: a */
    private String f50467a;

    /* renamed from: b */
    private String f50468b;

    /* renamed from: c */
    private String f50469c;

    /* renamed from: d */
    private int f50470d;

    /* renamed from: e */
    private JSONObject f50471e;

    /* renamed from: f */
    private final String f50472f;

    /* renamed from: a */
    public final String mo69610a() {
        return this.f50468b;
    }

    /* renamed from: b */
    public final String mo69611b() {
        return this.f50469c;
    }

    /* renamed from: c */
    public final JSONObject mo69612c() {
        return this.f50471e;
    }

    /* renamed from: d */
    public final JsRequest mo69613d() {
        return new JsRequest(this.f50467a, this.f50468b, this.f50470d, this.f50471e, this.f50472f, this.f50469c);
    }

    public JsBridgeRequest(JSONObject jSONObject, String str) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "msg");
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        this.f50470d = jSONObject.optInt("JSSDK", 0);
        String optString = jSONObject.optString("__msg_type");
        Intrinsics.checkExpressionValueIsNotNull(optString, "msg.optString(\"__msg_type\")");
        this.f50467a = optString;
        String optString2 = jSONObject.optString("__callback_id", "");
        Intrinsics.checkExpressionValueIsNotNull(optString2, "msg.optString(\"__callback_id\",\"\")");
        this.f50468b = optString2;
        this.f50469c = str;
        this.f50471e = jSONObject.optJSONObject("params");
        String optString3 = jSONObject.optString("currentUrl", "");
        Intrinsics.checkExpressionValueIsNotNull(optString3, "msg.optString(\"currentUrl\",\"\")");
        this.f50472f = optString3;
    }
}
