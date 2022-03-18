package com.bytedance.sdk.bytebridge.web.widget;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B7\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/widget/JsRequest;", "", "msg", "Lorg/json/JSONObject;", "bridgeName", "", "(Lorg/json/JSONObject;Ljava/lang/String;)V", ShareHitPoint.f121869d, "callbackId", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "params", "currentUrl", "function", "(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "getCallbackId", "()Ljava/lang/String;", "getCurrentUrl", "getFunction", "getParams", "()Lorg/json/JSONObject;", "getType", "getVersion", "()I", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.widget.b */
public final class JsRequest {

    /* renamed from: a */
    private final String f50651a;

    /* renamed from: b */
    private final String f50652b;

    /* renamed from: c */
    private final int f50653c;

    /* renamed from: d */
    private final JSONObject f50654d;

    /* renamed from: e */
    private final String f50655e;

    /* renamed from: f */
    private final String f50656f;

    /* renamed from: a */
    public final String mo69886a() {
        return this.f50652b;
    }

    /* renamed from: b */
    public final JSONObject mo69887b() {
        return this.f50654d;
    }

    /* renamed from: c */
    public final String mo69888c() {
        return this.f50655e;
    }

    /* renamed from: d */
    public final String mo69889d() {
        return this.f50656f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsRequest(org.json.JSONObject r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bytebridge.web.widget.JsRequest.<init>(org.json.JSONObject, java.lang.String):void");
    }

    public JsRequest(String str, String str2, int i, JSONObject jSONObject, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "callbackId");
        Intrinsics.checkParameterIsNotNull(str3, "currentUrl");
        Intrinsics.checkParameterIsNotNull(str4, "function");
        this.f50651a = str;
        this.f50652b = str2;
        this.f50653c = i;
        this.f50654d = jSONObject;
        this.f50655e = str3;
        this.f50656f = str4;
    }
}
