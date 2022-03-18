package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0011H\u0016J\u001f\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0015\"\u00020\u0003¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/PerfTracker;", "", "eventName", "", "(Ljava/lang/String;)V", "duration", "", "endTime", "perfParams", "Ljava/util/concurrent/ConcurrentHashMap;", "getPerfParams", "()Ljava/util/concurrent/ConcurrentHashMap;", "setPerfParams", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "startTime", "getDuration", "getEventName", "Lorg/json/JSONObject;", "putParams", "", "keyValues", "", "([Ljava/lang/String;)V", "key", "value", "setStartTime", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.g */
public class PerfTracker {

    /* renamed from: a */
    private long f83397a = System.currentTimeMillis();

    /* renamed from: b */
    private long f83398b;

    /* renamed from: c */
    private long f83399c;

    /* renamed from: d */
    private ConcurrentHashMap<String, String> f83400d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private String f83401e;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final ConcurrentHashMap<String, String> mo118777d() {
        return this.f83400d;
    }

    /* renamed from: f */
    public final String mo118779f() {
        return this.f83401e;
    }

    /* renamed from: e */
    public final long mo118778e() {
        long currentTimeMillis = System.currentTimeMillis() - this.f83397a;
        this.f83399c = currentTimeMillis;
        return currentTimeMillis;
    }

    public String toString() {
        String jSONObject = mo118773b().toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONObject, "getPerfParams().toString()");
        return jSONObject;
    }

    /* renamed from: b */
    public JSONObject mo118773b() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f83400d.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f83398b = currentTimeMillis;
        long j = currentTimeMillis - this.f83397a;
        this.f83399c = j;
        jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(j));
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo118775a(long j) {
        this.f83397a = j;
    }

    public PerfTracker(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        this.f83401e = str;
    }

    /* renamed from: a */
    public final void mo118776a(String... strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "keyValues");
        IntProgression step = RangesKt.step(new IntRange(0, strArr.length - 2), 2);
        int a = step.mo239399a();
        int b = step.mo239400b();
        int c = step.mo239401c();
        if (c >= 0) {
            if (a > b) {
                return;
            }
        } else if (a < b) {
            return;
        }
        while (true) {
            this.f83400d.put(strArr[a], strArr[a + 1]);
            if (a != b) {
                a += c;
            } else {
                return;
            }
        }
    }
}
