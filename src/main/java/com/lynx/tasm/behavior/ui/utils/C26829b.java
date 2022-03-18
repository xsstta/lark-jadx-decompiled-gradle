package com.lynx.tasm.behavior.ui.utils;

/* renamed from: com.lynx.tasm.behavior.ui.utils.b */
public class C26829b {
    /* renamed from: a */
    public static int m97509a(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: a */
    public static int m97510a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }
}
