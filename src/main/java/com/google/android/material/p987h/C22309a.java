package com.google.android.material.p987h;

/* renamed from: com.google.android.material.h.a */
public final class C22309a {
    /* renamed from: a */
    public static float m80779a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: b */
    private static float m80782b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: b */
    public static boolean m80783b(float f, float f2, float f3) {
        return f + f3 >= f2;
    }

    /* renamed from: a */
    public static float m80780a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: a */
    public static float m80781a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m80782b(m80780a(f, f2, f3, f4), m80780a(f, f2, f5, f4), m80780a(f, f2, f5, f6), m80780a(f, f2, f3, f6));
    }
}
