package com.ss.android.lark.calendar.impl.features.calendarview.p1467c;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.c.b */
public class C30668b {
    /* renamed from: a */
    public static int m114025a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 1;
            }
            if (i != 2) {
                return i != 3 ? 3 : 4;
            }
            return 31;
        }
    }

    /* renamed from: b */
    public static int m114026b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 4) {
            return i != 31 ? 0 : 2;
        }
        return 3;
    }
}
