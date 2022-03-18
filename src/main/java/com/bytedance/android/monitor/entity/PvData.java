package com.bytedance.android.monitor.entity;

import com.bytedance.android.monitor.p104a.AbstractC2630b;
import com.bytedance.android.monitor.p112i.C2657e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bytedance/android/monitor/entity/PvData;", "Lcom/bytedance/android/monitor/base/BaseNativeInfo;", "()V", "invokeTime", "", "getInvokeTime", "()J", "setInvokeTime", "(J)V", "fillInJsonObject", "", "jsonObject", "Lorg/json/JSONObject;", "com.bytedance.android.livesdk.monitor.base"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.c.d */
public final class PvData extends AbstractC2630b {

    /* renamed from: b */
    private long f8415b = System.currentTimeMillis();

    public PvData() {
        super("navigationStart");
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
    /* renamed from: a */
    public void mo11404a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        C2657e.m11172a(jSONObject, "invoke_ts", this.f8415b);
    }
}
