package com.prolificinteractive.materialcalendarview;

import java.util.Calendar;
import java.util.Date;

/* renamed from: com.prolificinteractive.materialcalendarview.e */
public class C26996e {
    /* renamed from: a */
    public static Calendar m98121a() {
        Calendar instance = Calendar.getInstance();
        m98123a(instance, instance);
        return instance;
    }

    /* renamed from: a */
    public static int m98120a(Calendar calendar) {
        return calendar.get(1);
    }

    /* renamed from: b */
    public static int m98124b(Calendar calendar) {
        return calendar.get(2);
    }

    /* renamed from: c */
    public static int m98125c(Calendar calendar) {
        return calendar.get(5);
    }

    /* renamed from: d */
    public static int m98126d(Calendar calendar) {
        return calendar.get(7);
    }

    /* renamed from: a */
    public static Calendar m98122a(Date date) {
        Calendar instance = Calendar.getInstance();
        if (date != null) {
            instance.setTime(date);
        }
        m98123a(instance, instance);
        return instance;
    }

    /* renamed from: a */
    public static void m98123a(Calendar calendar, Calendar calendar2) {
        int a = m98120a(calendar);
        int b = m98124b(calendar);
        int c = m98125c(calendar);
        calendar2.clear();
        calendar2.set(a, b, c);
    }
}
