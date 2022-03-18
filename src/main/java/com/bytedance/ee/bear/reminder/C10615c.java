package com.bytedance.ee.bear.reminder;

import com.haibin.calendarview.Calendar;

/* renamed from: com.bytedance.ee.bear.reminder.c */
public class C10615c {
    /* renamed from: a */
    public static Calendar m44024a() {
        return m44025a(System.currentTimeMillis());
    }

    /* renamed from: b */
    public static java.util.Calendar m44027b(long j) {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance;
    }

    /* renamed from: a */
    public static Calendar m44025a(long j) {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar calendar = new Calendar();
        calendar.setYear(instance.get(1));
        calendar.setMonth(instance.get(2) + 1);
        calendar.setDay(instance.get(5));
        return calendar;
    }

    /* renamed from: a */
    public static java.util.Calendar m44026a(int i, int i2, int i3) {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2 - 1);
        instance.set(5, i3);
        return instance;
    }

    /* renamed from: a */
    public static long m44023a(Calendar calendar, int i, int i2, int i3) {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTimeInMillis(calendar.getTimeInMillis());
        instance.set(11, i);
        instance.set(12, i2);
        instance.set(13, i3);
        return instance.getTimeInMillis();
    }
}
