package com.bytedance.ee.util.common;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.util.common.c */
public class C13605c {

    /* renamed from: a */
    private static Map<String, DecimalFormat> f35767a = new HashMap(5);

    /* renamed from: a */
    public static boolean m55243a(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-8f) {
            return true;
        }
        return false;
    }
}
