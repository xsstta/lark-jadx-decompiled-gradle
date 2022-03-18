package com.ss.sys.ces.p3234e;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;
import p001a.p002a.p003a.p005b.C0030c;

/* renamed from: com.ss.sys.ces.e.c */
public class C65396c {
    /* renamed from: a */
    public static String m256463a() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: a */
    public static String m256464a(Context context) {
        double d;
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            d = ((Double) declaredMethod.invoke(newInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
            d = 0.0d;
        }
        C0030c.m50b("capacity : " + d);
        return Integer.toString((int) d);
    }

    /* renamed from: b */
    public static String m256465b(Context context) {
        String str;
        try {
            Locale locale = context.getResources().getConfiguration().locale;
            str = locale.getLanguage() + "_" + locale.getCountry();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: c */
    public static String m256466c(Context context) {
        String str;
        try {
            str = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }
}
