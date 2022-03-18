package com.bytedance.dr;

import com.bytedance.dr.AbstractC4003e;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.d */
public final class C4002d {

    /* renamed from: a */
    private static int f12153a;

    /* renamed from: b */
    private static AbstractC4003e f12154b;

    static {
        m16657a(2);
        m16658a(new AbstractC4003e.C4004a());
    }

    /* renamed from: a */
    public static void m16657a(int i) {
        f12153a = i;
    }

    /* renamed from: a */
    public static void m16658a(AbstractC4003e eVar) {
        f12154b = eVar;
    }

    /* renamed from: b */
    public static void m16661b(String str, String str2) {
        m16662b(str, str2, null);
    }

    /* renamed from: a */
    public static void m16659a(String str, String str2) {
        m16660a(str, str2, null);
    }

    /* renamed from: b */
    public static void m16662b(String str, String str2, Throwable th) {
        AbstractC4003e eVar = f12154b;
        if (eVar != null && f12153a <= 3) {
            eVar.mo15736b(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m16660a(String str, String str2, Throwable th) {
        AbstractC4003e eVar = f12154b;
        if (eVar != null && f12153a <= 2) {
            eVar.mo15735a(str, str2, th);
        }
    }
}
