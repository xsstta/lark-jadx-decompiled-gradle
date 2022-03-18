package com.lynx.tasm.behavior.shadow;

/* renamed from: com.lynx.tasm.behavior.shadow.e */
public class C26704e {
    /* renamed from: a */
    public static long m96793a(int i, int i2) {
        return m96792a((float) i, (float) i2);
    }

    /* renamed from: a */
    public static long m96792a(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }
}
