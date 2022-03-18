package com.airbnb.lottie.p071c;

/* renamed from: com.airbnb.lottie.c.b */
public class C1785b {
    /* renamed from: b */
    private static float m7965b(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: a */
    private static float m7963a(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: a */
    public static int m7964a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float b = m7965b(((float) ((i >> 16) & 255)) / 255.0f);
        float b2 = m7965b(((float) ((i >> 8) & 255)) / 255.0f);
        float b3 = m7965b(((float) (i & 255)) / 255.0f);
        float b4 = m7965b(((float) ((i2 >> 16) & 255)) / 255.0f);
        float b5 = m7965b(((float) ((i2 >> 8) & 255)) / 255.0f);
        float b6 = b3 + (f * (m7965b(((float) (i2 & 255)) / 255.0f) - b3));
        return (Math.round(m7963a(b + ((b4 - b) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((i2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(m7963a(b2 + ((b5 - b2) * f)) * 255.0f) << 8) | Math.round(m7963a(b6) * 255.0f);
    }
}
