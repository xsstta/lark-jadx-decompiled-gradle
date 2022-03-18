package com.bytedance.ee.util.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.bytedance.ee.util.common.e */
public class C13607e {

    /* renamed from: a */
    private static double f35768a = 86400.0d;

    /* renamed from: a */
    public static String m55247a(long j) {
        return String.valueOf((int) (((double) ((System.currentTimeMillis() / 1000) - j)) / f35768a));
    }

    /* renamed from: b */
    public static String m55248b(long j) {
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date(j * 1000));
    }
}
