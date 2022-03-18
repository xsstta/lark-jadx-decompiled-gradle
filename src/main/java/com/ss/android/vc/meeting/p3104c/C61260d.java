package com.ss.android.vc.meeting.p3104c;

/* renamed from: com.ss.android.vc.meeting.c.d */
public class C61260d {
    /* renamed from: b */
    public static boolean m238319b(float f, float f2) {
        return f - f2 > 1.0E-5f;
    }

    /* renamed from: c */
    public static boolean m238320c(float f, float f2) {
        return f - f2 < 1.0E-5f;
    }

    /* renamed from: a */
    public static boolean m238318a(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static float m238317a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }
}
