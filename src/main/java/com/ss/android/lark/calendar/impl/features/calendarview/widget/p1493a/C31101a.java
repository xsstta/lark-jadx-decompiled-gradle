package com.ss.android.lark.calendar.impl.features.calendarview.widget.p1493a;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.widget.a.a */
public class C31101a {
    /* renamed from: a */
    public static String m116088a(CalendarDate calendarDate) {
        try {
            return C31102b.m116090a().mo112670a(calendarDate.getJulianDay(), calendarDate.getYear(), calendarDate.getMonth(), calendarDate.getMonthDay());
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m116087a(int i) {
        long j = (long) (68569 + i);
        long j2 = (j * 4) / 146097;
        long j3 = j - (((146097 * j2) + 3) / 4);
        long j4 = ((j3 + 1) * 4000) / 1461001;
        long j5 = (j3 - ((1461 * j4) / 4)) + 31;
        long j6 = (j5 * 80) / 2447;
        int i2 = (int) (j5 - ((2447 * j6) / 80));
        long j7 = j6 / 11;
        int i3 = (int) (((j6 + 2) - (12 * j7)) - 1);
        try {
            return C31102b.m116090a().mo112670a(i, (int) (((j2 - 49) * 100) + j4 + j7), i3 + 1, i2);
        } catch (Exception unused) {
            return "";
        }
    }
}
