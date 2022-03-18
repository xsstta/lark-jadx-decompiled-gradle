package com.ss.android.lark.time.format.common;

import java.util.GregorianCalendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/time/format/common/TimeUtil;", "", "()V", "dayDiff", "", "firstGC", "Ljava/util/GregorianCalendar;", "secondGC", "getJulianDay", "gregorianCalendar", "isSameAMPM", "", "isSameDay", "isSameYear", "setTargetMinute", "targetMinute", "time-format_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.time.format.a.e */
public final class TimeUtil {

    /* renamed from: a */
    public static final TimeUtil f139150a = new TimeUtil();

    private TimeUtil() {
    }

    /* renamed from: a */
    private final int m219270a(GregorianCalendar gregorianCalendar) {
        int i = gregorianCalendar.get(1);
        int i2 = gregorianCalendar.get(2) + 1;
        int i3 = (i2 - 14) / 12;
        return (((((((i + 4800) + i3) * 1461) / 4) + ((((i2 - 2) - (i3 * 12)) * 367) / 12)) - (((((i + 4900) + i3) / 100) * 3) / 4)) + gregorianCalendar.get(5)) - 32075;
    }

    /* renamed from: a */
    public final GregorianCalendar mo191621a(GregorianCalendar gregorianCalendar, int i) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "gregorianCalendar");
        gregorianCalendar.set(12, i);
        return gregorianCalendar;
    }

    /* renamed from: a */
    public final int mo191620a(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "firstGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "secondGC");
        return m219270a(gregorianCalendar) - m219270a(gregorianCalendar2);
    }

    /* renamed from: b */
    public final boolean mo191622b(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "firstGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "secondGC");
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo191623c(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "firstGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "secondGC");
        if (mo191620a(gregorianCalendar, gregorianCalendar2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo191624d(GregorianCalendar gregorianCalendar, GregorianCalendar gregorianCalendar2) {
        Intrinsics.checkParameterIsNotNull(gregorianCalendar, "firstGC");
        Intrinsics.checkParameterIsNotNull(gregorianCalendar2, "secondGC");
        if (gregorianCalendar.get(9) == gregorianCalendar2.get(9)) {
            return true;
        }
        return false;
    }
}
