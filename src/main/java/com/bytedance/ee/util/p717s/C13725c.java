package com.bytedance.ee.util.p717s;

import java.util.Date;

/* renamed from: com.bytedance.ee.util.s.c */
public class C13725c {
    /* renamed from: a */
    public static Date m55672a(String str) {
        return new Date((Long.parseLong(str) >> 32) * 1000);
    }

    /* renamed from: a */
    public static int m55671a(String str, Date date) {
        return m55672a(str).compareTo(date);
    }
}
