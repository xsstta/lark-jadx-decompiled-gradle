package com.larksuite.framework.utils;

import java.util.Random;

/* renamed from: com.larksuite.framework.utils.ae */
public class C26253ae {

    /* renamed from: a */
    private static final Random f64841a = new Random();

    /* renamed from: a */
    public static int m94997a() {
        return m94998a(0, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static int m94998a(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        m94999a(z, "Start value must be smaller or equal to end value.", new Object[0]);
        if (i < 0) {
            z2 = false;
        }
        m94999a(z2, "Both range values must be non-negative.", new Object[0]);
        if (i == i2) {
            return i;
        }
        return i + f64841a.nextInt(i2 - i);
    }

    /* renamed from: a */
    public static void m94999a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
