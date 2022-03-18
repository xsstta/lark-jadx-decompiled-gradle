package com.ss.android.lark.mail.impl.message.framework;

import com.ss.android.lark.mail.impl.p2171h.C42187a;

/* renamed from: com.ss.android.lark.mail.impl.message.framework.c */
public class C42926c {

    /* renamed from: a */
    private static String f109332a;

    /* renamed from: b */
    private static long f109333b;

    /* renamed from: a */
    public static void m170942a() {
        if (f109332a != null && f109333b != 0) {
            C42187a.m168481a(f109332a, System.currentTimeMillis() - f109333b);
            f109332a = null;
            f109333b = 0;
        }
    }

    /* renamed from: a */
    public static void m170943a(String str) {
        f109333b = System.currentTimeMillis();
        f109332a = str;
    }
}
