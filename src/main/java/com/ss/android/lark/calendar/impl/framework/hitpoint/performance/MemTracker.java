package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/MemTracker;", "Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/PerfTracker;", "eventName", "", "(Ljava/lang/String;)V", "costMemory", "", "startUsedMemory", "getCurrentUsedMemory", "getPerfParams", "Lorg/json/JSONObject;", "isValid", "", "recordStartUsedMemory", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.e */
public final class MemTracker extends PerfTracker {

    /* renamed from: a */
    private long f83394a;

    /* renamed from: b */
    private long f83395b;

    /* renamed from: a */
    public final void mo118772a() {
        this.f83394a = m124431g();
    }

    /* renamed from: c */
    public final boolean mo118774c() {
        if (this.f83395b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private final long m124431g() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.hitpoint.performance.PerfTracker
    /* renamed from: b */
    public JSONObject mo118773b() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : mo118777d().entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        long g = m124431g() - this.f83394a;
        this.f83395b = g;
        jSONObject.put("memory_length", String.valueOf(g));
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemTracker(String str) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "eventName");
    }
}
