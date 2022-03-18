package com.bytedance.crash.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.bytedance.crash.util.e */
public class C3937e {

    /* renamed from: a */
    private static DateFormat f12040a;

    /* renamed from: b */
    private static DateFormat f12041b;

    /* renamed from: c */
    private static DateFormat f12042c;

    /* renamed from: a */
    public static DateFormat m16353a() {
        if (f12040a == null) {
            f12040a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        }
        return f12040a;
    }

    /* renamed from: b */
    public static DateFormat m16354b() {
        if (f12041b == null) {
            f12041b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
        return f12041b;
    }

    /* renamed from: c */
    public static DateFormat m16355c() {
        if (f12042c == null) {
            f12042c = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss", Locale.getDefault());
        }
        return f12042c;
    }
}
