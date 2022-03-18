package com.bytedance.apm.trace.p156b;

import java.util.HashMap;

/* renamed from: com.bytedance.apm.trace.b.a */
public final class C3092a {

    /* renamed from: a */
    private static HashMap<String, Integer> f9937a = new HashMap<>();

    /* renamed from: a */
    private static void m12879a() {
        m12880a("xx", 12334);
    }

    static {
        m12879a();
    }

    /* renamed from: a */
    public static Integer m12878a(String str) {
        return f9937a.get(str);
    }

    /* renamed from: a */
    public static void m12880a(String str, int i) {
        f9937a.put(str, Integer.valueOf(i));
    }
}
