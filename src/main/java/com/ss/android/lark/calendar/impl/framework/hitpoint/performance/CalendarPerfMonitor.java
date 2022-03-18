package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import android.text.TextUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J)\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\bH\u0007¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J1\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\bH\u0007¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0010H\u0007J)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\bH\u0007¢\u0006\u0002\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0007J1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\bH\u0007¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/CalendarPerfMonitor;", "", "()V", "MAX_DIFF_TIME_LIMIT", "", "cancel", "", "trackerKey", "", "end", "keyValues", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "end4Async", "eventName", "startTime", "", "(Ljava/lang/String;J[Ljava/lang/String;)V", "obtainStartTime", "param", "key", "start", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.b */
public final class CalendarPerfMonitor {

    /* renamed from: a */
    public static final CalendarPerfMonitor f83383a = new CalendarPerfMonitor();

    private CalendarPerfMonitor() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final long m124412a() {
        return System.currentTimeMillis();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124413a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "trackerKey");
        m124416a(str, "");
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m124417b(String str) {
        if (!TextUtils.isEmpty(str)) {
            BasePerfMonitor.f83381a.mo118770b(str);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124416a(String str, String... strArr) {
        Intrinsics.checkParameterIsNotNull(str, "trackerKey");
        Intrinsics.checkParameterIsNotNull(strArr, "keyValues");
        if (!TextUtils.isEmpty(str)) {
            PerfTracker a = BasePerfMonitor.f83381a.mo118767a(str);
            if (a instanceof PerfTracker) {
                BasePerfMonitor.f83381a.mo118770b(str);
                if (a.mo118778e() > 0 && a.mo118778e() <= ((long) 120000)) {
                    a.mo118776a((String[]) Arrays.copyOf(strArr, strArr.length));
                    BasePerfMonitor.f83381a.mo118769a(a.mo118779f(), a.mo118773b());
                }
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124415a(String str, String str2, String... strArr) {
        Intrinsics.checkParameterIsNotNull(str, "trackerKey");
        Intrinsics.checkParameterIsNotNull(str2, "eventName");
        Intrinsics.checkParameterIsNotNull(strArr, "keyValues");
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            PerfTracker gVar = new PerfTracker(str2);
            gVar.mo118776a((String[]) Arrays.copyOf(strArr, strArr.length));
            BasePerfMonitor.f83381a.mo118768a(str, gVar);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124414a(String str, long j, String... strArr) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        Intrinsics.checkParameterIsNotNull(strArr, "keyValues");
        if (!TextUtils.isEmpty(str)) {
            PerfTracker gVar = new PerfTracker(str);
            gVar.mo118775a(j);
            if (gVar.mo118778e() > 0 && gVar.mo118778e() <= ((long) 120000)) {
                gVar.mo118776a((String[]) Arrays.copyOf(strArr, strArr.length));
                BasePerfMonitor.f83381a.mo118769a(str, gVar.mo118773b());
            }
        }
    }
}
