package com.bytedance.android.monitor.lynx.data.entity;

import com.bytedance.android.monitor.p104a.AbstractC2630b;
import com.bytedance.android.monitor.p104a.AbstractC2631c;
import com.bytedance.android.monitor.p106c.C2645c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/entity/LynxMonitorReportData;", "Lcom/bytedance/android/monitor/base/BaseReportData;", "nativeCommon", "Lcom/bytedance/android/monitor/entity/NativeCommon;", "mNativeInfo", "Lcom/bytedance/android/monitor/base/BaseNativeInfo;", "(Lcom/bytedance/android/monitor/entity/NativeCommon;Lcom/bytedance/android/monitor/base/BaseNativeInfo;)V", "bizTag", "", "getBizTag", "()Ljava/lang/String;", "setBizTag", "(Ljava/lang/String;)V", "getMNativeInfo", "()Lcom/bytedance/android/monitor/base/BaseNativeInfo;", "getNativeCommon", "()Lcom/bytedance/android/monitor/entity/NativeCommon;", "getBiz", "getContainerType", "getEventType", "getJsBase", "Lorg/json/JSONObject;", "getJsInfo", "getNativeBase", "getNativeInfo", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.a.c */
public final class LynxMonitorReportData extends AbstractC2631c {

    /* renamed from: a */
    private String f8476a;

    /* renamed from: b */
    private final C2645c f8477b;

    /* renamed from: c */
    private final AbstractC2630b f8478c;

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: e */
    public JSONObject mo11411e() {
        return null;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: f */
    public JSONObject mo11412f() {
        return null;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2631c
    /* renamed from: a */
    public AbstractC2630b mo11408d() {
        return this.f8478c;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2631c
    /* renamed from: b */
    public C2645c mo11407c() {
        return this.f8477b;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: i */
    public String mo11415i() {
        return this.f8476a;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: g */
    public String mo11413g() {
        return this.f8478c.f8369a;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2635g
    /* renamed from: h */
    public String mo11414h() {
        return this.f8477b.f8408c;
    }

    /* renamed from: a */
    public final void mo11515a(String str) {
        this.f8476a = str;
    }

    public LynxMonitorReportData(C2645c cVar, AbstractC2630b bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "nativeCommon");
        Intrinsics.checkParameterIsNotNull(bVar, "mNativeInfo");
        this.f8477b = cVar;
        this.f8478c = bVar;
    }
}
