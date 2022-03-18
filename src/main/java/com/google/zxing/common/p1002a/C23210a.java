package com.google.zxing.common.p1002a;

/* renamed from: com.google.zxing.common.a.a */
public final class C23210a {
    /* renamed from: a */
    public static int m84050a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public static float m84049a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }
}
