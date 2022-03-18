package com.bytedance.ee.util.p717s;

/* renamed from: com.bytedance.ee.util.s.b */
public final class C13724b {
    /* renamed from: a */
    public static String m55670a(int i) {
        int i2 = i / 1000;
        if (i2 >= 3600) {
            return String.format("%d:%02d:%02d", Integer.valueOf(i2 / 3600), Integer.valueOf((i2 % 3600) / 60), Integer.valueOf(i2 % 60));
        }
        return String.format("%02d:%02d", Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60));
    }
}
