package com.ss.android.lark.todo.impl.utils;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/todo/impl/utils/DayCompareUtil;", "", "()V", "dayDiff", "", "firstGC", "Ljava/util/GregorianCalendar;", "secondGC", "getJulianDay", "gregorianCalendar", "getJulianDayByTimestamp", "timeStamp", "", "timezone", "Ljava/util/TimeZone;", "isSameDay", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.b.b */
public final class DayCompareUtil {

    /* renamed from: a */
    public static final DayCompareUtil f139259a = new DayCompareUtil();

    private DayCompareUtil() {
    }

    /* renamed from: a */
    public final int mo191763a(GregorianCalendar gregorianCalendar) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "gregorianCalendar");
        int i = gregorianCalendar.get(1);
        int i2 = gregorianCalendar.get(2) + 1;
        int i3 = (i2 - 14) / 12;
        return (((((((i + 4800) + i3) * 1461) / 4) + ((((i2 - 2) - (i3 * 12)) * 367) / 12)) - (((((i + 4900) + i3) / 100) * 3) / 4)) + gregorianCalendar.get(5)) - 32075;
    }

    /* renamed from: a */
    public final int mo191762a(long j, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(timeZone, "timezone");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(new Date(j));
        return mo191763a(gregorianCalendar);
    }

    /* renamed from: a */
    public final int mo191764a(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "firstGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "secondGC");
        return mo191763a(gregorianCalendar) - mo191763a(gregorianCalendar2);
    }
}
