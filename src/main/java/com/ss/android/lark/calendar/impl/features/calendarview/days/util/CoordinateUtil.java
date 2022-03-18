package com.ss.android.lark.calendar.impl.features.calendarview.days.util;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/util/CoordinateUtil;", "", "()V", "DAYS_OF_WEEK", "", "getDateByXOffset", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "dayWidth", "curXOffset", "getNextWeekXoffset", "getPrevWeekXoffset", "getSign", "number", "getSnapOffsetX", "offsetX", "snapWidth", "getWeekXoffset", "isPreWeek", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.d.c */
public final class CoordinateUtil {

    /* renamed from: a */
    public static final CoordinateUtil f77183a = new CoordinateUtil();

    @JvmStatic
    /* renamed from: a */
    public static final int m114507a(int i) {
        return i >= 0 ? 1 : -1;
    }

    private CoordinateUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m114508a(int i, int i2) {
        int i3;
        if (i2 == 0 || (i3 = i % i2) == 0) {
            return i;
        }
        if (Math.abs(i3) < i2 / 2) {
            return i - i3;
        }
        if (i < 0) {
            return i - (i2 + i3);
        }
        return i + (i2 - i3);
    }
}
