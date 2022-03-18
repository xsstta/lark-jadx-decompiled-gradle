package com.ss.android.lark.integrator.minutes;

import com.ss.android.lark.mm.C45833a;
import com.ss.android.lark.mm.p2284a.AbstractC45836a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.integrator.minutes.a */
public final class C39876a {

    /* renamed from: a */
    private static AbstractC45836a f101575a;

    /* renamed from: c */
    public static String m158360c() {
        return "videomm";
    }

    private C39876a() {
    }

    /* renamed from: a */
    public static void m158358a() {
        m158359b();
    }

    /* renamed from: b */
    public static AbstractC45836a m158359b() {
        if (f101575a == null) {
            synchronized (C39876a.class) {
                if (f101575a == null) {
                    MinutesDependencyInjector.m158240a();
                    f101575a = new C45833a(LarkContext.getApplication());
                }
            }
        }
        return f101575a;
    }
}
