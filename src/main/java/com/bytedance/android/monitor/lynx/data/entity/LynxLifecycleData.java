package com.bytedance.android.monitor.lynx.data.entity;

import com.bytedance.android.monitor.p104a.AbstractC2629a;
import com.bytedance.android.monitor.p112i.C2657e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/bytedance/android/monitor/lynx/data/entity/LynxLifecycleData;", "Lcom/bytedance/android/monitor/base/BaseMonitorData;", "()V", "firstScreen", "", "getFirstScreen", "()J", "setFirstScreen", "(J)V", "loadFailed", "getLoadFailed", "setLoadFailed", "loadFinish", "getLoadFinish", "setLoadFinish", "loadStart", "getLoadStart", "setLoadStart", "receiveError", "getReceiveError", "setReceiveError", "runtimeReady", "getRuntimeReady", "setRuntimeReady", "appendLifeCycleInfo", "", "dataJSON", "Lorg/json/JSONObject;", "fillInJsonObject", "jsonObject", "lynx_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.lynx.b.a.b */
public final class LynxLifecycleData extends AbstractC2629a {

    /* renamed from: a */
    private long f8470a;

    /* renamed from: b */
    private long f8471b;

    /* renamed from: c */
    private long f8472c;

    /* renamed from: d */
    private long f8473d;

    /* renamed from: e */
    private long f8474e;

    /* renamed from: f */
    private long f8475f;

    /* renamed from: a */
    public final void mo11511a(long j) {
        this.f8470a = j;
    }

    /* renamed from: b */
    public final void mo11512b(long j) {
        this.f8471b = j;
    }

    /* renamed from: c */
    public final void mo11513c(long j) {
        this.f8474e = j;
    }

    /* renamed from: d */
    public final void mo11514d(long j) {
        this.f8475f = j;
    }

    @Override // com.bytedance.android.monitor.p104a.AbstractC2629a
    /* renamed from: a */
    public void mo11404a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
        m11236b(jSONObject);
    }

    /* renamed from: b */
    private final void m11236b(JSONObject jSONObject) {
        C2657e.m11172a(jSONObject, "load_start", this.f8470a);
        C2657e.m11172a(jSONObject, "load_finish", this.f8471b);
        C2657e.m11172a(jSONObject, "load_failed", this.f8472c);
        C2657e.m11172a(jSONObject, "receive_error", this.f8473d);
        C2657e.m11172a(jSONObject, "first_screen", this.f8474e);
        C2657e.m11172a(jSONObject, "runtime_ready", this.f8475f);
    }
}
