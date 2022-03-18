package com.ss.android.lark.calendar.impl.framework.hitpoint.performance;

import com.ss.android.lark.calendar.impl.features.calendarview.p1467c.C30667a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/framework/hitpoint/performance/PerfHelper;", "", "()V", "getTimeSpanMillis", "", "startTime", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "endTime", "startJulianDay", "", "endJulianDay", "getViewType", "modelIndex", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.hitpoint.performance.f */
public final class PerfHelper {

    /* renamed from: a */
    public static final PerfHelper f83396a = new PerfHelper();

    @JvmStatic
    /* renamed from: a */
    public static final String m124436a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "three" : "month" : "list" : "day";
    }

    private PerfHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m124435a() {
        return m124436a(C30667a.m114024f());
    }
}
