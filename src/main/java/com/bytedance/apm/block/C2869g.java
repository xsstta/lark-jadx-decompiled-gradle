package com.bytedance.apm.block;

import com.bytedance.apm.util.C3122i;
import java.util.ConcurrentModificationException;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.block.g */
public class C2869g {

    /* renamed from: a */
    private static HashSet<String> f9170a = new HashSet<>();

    /* renamed from: b */
    private static String f9171b = "";

    /* renamed from: c */
    private static boolean f9172c = true;

    /* renamed from: a */
    public static String m12075a() {
        if (f9172c) {
            try {
                f9171b = C3122i.m13006a(f9170a, ",");
                f9172c = false;
            } catch (ConcurrentModificationException unused) {
            }
        }
        return f9171b;
    }

    /* renamed from: a */
    public static void m12076a(String str) {
        f9172c = true;
        f9170a.add(str);
    }

    /* renamed from: b */
    public static void m12077b(String str) {
        f9172c = true;
        f9170a.remove(str);
    }
}
