package com.bytedance.sdk.bytebridge.base.monitor;

import com.bytedance.sdk.bytebridge.base.monitor.BridgeMonitorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bytedance/sdk/bytebridge/base/monitor/OriginInfo;", "", "bridgeName", "", "message", "eventType", "Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$EventType;", "params", "Lorg/json/JSONObject;", "beginTime", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$EventType;Lorg/json/JSONObject;J)V", "getBeginTime", "()J", "getBridgeName", "()Ljava/lang/String;", "getEventType", "()Lcom/bytedance/sdk/bytebridge/base/monitor/BridgeMonitorInfo$EventType;", "getMessage", "getParams", "()Lorg/json/JSONObject;", "base_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.base.d.d */
public class OriginInfo {

    /* renamed from: a */
    private final String f50593a;

    /* renamed from: b */
    private final String f50594b;

    /* renamed from: c */
    private final BridgeMonitorInfo.EventType f50595c;

    /* renamed from: d */
    private final JSONObject f50596d;

    /* renamed from: e */
    private final long f50597e;

    /* renamed from: a */
    public final String mo69814a() {
        return this.f50593a;
    }

    /* renamed from: b */
    public final BridgeMonitorInfo.EventType mo69815b() {
        return this.f50595c;
    }

    /* renamed from: c */
    public final JSONObject mo69816c() {
        return this.f50596d;
    }

    public OriginInfo(String str, String str2, BridgeMonitorInfo.EventType bVar, JSONObject jSONObject, long j) {
        Intrinsics.checkParameterIsNotNull(str, "bridgeName");
        Intrinsics.checkParameterIsNotNull(bVar, "eventType");
        this.f50593a = str;
        this.f50594b = str2;
        this.f50595c = bVar;
        this.f50596d = jSONObject;
        this.f50597e = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OriginInfo(String str, String str2, BridgeMonitorInfo.EventType bVar, JSONObject jSONObject, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bVar, jSONObject, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }
}
