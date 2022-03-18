package com.bytedance.sdk.bytebridge.web.widget;

import com.bytedance.sdk.bytebridge.base.monitor.OriginInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\rB'\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/widget/JsCallOriginInfo;", "Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;", "message", "", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "bridgeName", "bridgeCallType", "Lcom/bytedance/sdk/bytebridge/web/widget/JsCallType;", "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/bytedance/sdk/bytebridge/web/widget/JsCallType;)V", "request", "Lcom/bytedance/sdk/bytebridge/web/widget/JsRequest;", "callType", "(Lcom/bytedance/sdk/bytebridge/web/widget/JsRequest;Lcom/bytedance/sdk/bytebridge/web/widget/JsCallType;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/bytebridge/web/widget/JsCallType;Lcom/bytedance/sdk/bytebridge/web/widget/JsRequest;)V", "getRequest", "()Lcom/bytedance/sdk/bytebridge/web/widget/JsRequest;", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.widget.a */
public final class JsCallOriginInfo extends OriginInfo {

    /* renamed from: a */
    private final JsRequest f50650a;

    /* renamed from: d */
    public final JsRequest mo69885d() {
        return this.f50650a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsCallOriginInfo(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r11)
            java.lang.String r1 = "func"
            java.lang.String r2 = ""
            java.lang.String r4 = r0.optString(r1, r2)
            java.lang.String r0 = "JSONObject(message).optString(\"func\", \"\")"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            com.bytedance.sdk.bytebridge.web.widget.JsCallType r6 = com.bytedance.sdk.bytebridge.web.widget.JsCallType.JS_INVOKE
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo.<init>(java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public JsCallOriginInfo(JsRequest bVar, JsCallType jsCallType) {
        this(bVar.mo69889d(), "{}", jsCallType, bVar);
        Intrinsics.checkParameterIsNotNull(bVar, "request");
        Intrinsics.checkParameterIsNotNull(jsCallType, "callType");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsCallOriginInfo(org.json.JSONObject r3, java.lang.String r4, com.bytedance.sdk.bytebridge.web.widget.JsCallType r5) {
        /*
            r2 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            java.lang.String r0 = "bridgeName"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "bridgeCallType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "message.toString()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.bytedance.sdk.bytebridge.web.widget.b r1 = new com.bytedance.sdk.bytebridge.web.widget.b
            r1.<init>(r3, r4)
            r2.<init>(r4, r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bytebridge.web.widget.JsCallOriginInfo.<init>(org.json.JSONObject, java.lang.String, com.bytedance.sdk.bytebridge.web.widget.JsCallType):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsCallOriginInfo(String str, String str2, JsCallType jsCallType, JsRequest bVar) {
        super(bVar.mo69889d(), str2, jsCallType, bVar.mo69887b(), 0, 16, null);
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Intrinsics.checkParameterIsNotNull(str2, "message");
        Intrinsics.checkParameterIsNotNull(jsCallType, "callType");
        Intrinsics.checkParameterIsNotNull(bVar, "request");
        this.f50650a = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsCallOriginInfo(String str, String str2, JsCallType jsCallType, JsRequest bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, jsCallType, (i & 8) != 0 ? new JsRequest(new JSONObject(str2), str) : bVar);
    }
}
