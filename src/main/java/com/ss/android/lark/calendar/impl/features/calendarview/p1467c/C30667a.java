package com.ss.android.lark.calendar.impl.features.calendarview.p1467c;

import com.ss.android.lark.calendar.p1430a.C30022a;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.c.a */
public class C30667a {

    /* renamed from: a */
    private static int f76832a = 10;

    /* renamed from: b */
    private static int f76833b = -1;

    /* renamed from: b */
    public static int m114020b() {
        return m114018a() % f76832a;
    }

    /* renamed from: c */
    public static boolean m114021c() {
        if (f76833b / f76832a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m114022d() {
        int i = f76833b;
        int i2 = f76832a;
        m114019a((i % i2) + i2);
    }

    /* renamed from: e */
    public static void m114023e() {
        m114019a(f76833b % f76832a);
    }

    /* renamed from: f */
    public static int m114024f() {
        int i = f76833b;
        if (i == -1) {
            return m114018a();
        }
        return i;
    }

    /* renamed from: a */
    public static int m114018a() {
        int i = f76833b;
        if (i != -1) {
            return i;
        }
        int b = C30022a.f74882a.spDependency().mo108180b("key_selected_calendar_view_index", -1);
        f76833b = b;
        if (b == -1) {
            int c = C30022a.f74882a.spDependency().mo108182c("key_selected_calendar_view_index", 0);
            f76833b = c;
            m114019a(c);
        }
        return f76833b;
    }

    /* renamed from: a */
    public static void m114019a(int i) {
        f76833b = i;
        C30022a.f74882a.spDependency().mo108178a("key_selected_calendar_view_index", i);
    }
}
