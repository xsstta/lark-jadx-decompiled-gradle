package com.bytedance.p203b;

import android.content.Context;

/* renamed from: com.bytedance.b.a */
public class C3481a {

    /* renamed from: a */
    static Context f11012a;

    /* renamed from: b */
    static volatile String f11013b;

    /* renamed from: c */
    static C3499c f11014c;

    /* renamed from: d */
    private static final Object f11015d = new Object();

    /* renamed from: a */
    public static void m14718a(String str, Context context) {
        m14719a(str, false, true, context);
    }

    /* renamed from: a */
    private static void m14719a(String str, boolean z, boolean z2, Context context) {
        if (z2 && f11012a == null) {
            f11012a = context;
        }
        C3496b bVar = C3496b.f11036a;
        if (bVar != null) {
            bVar.mo13941a(str, z);
            return;
        }
        C3499c cVar = f11014c;
        if (cVar != null) {
            cVar.mo13947b(str);
        } else {
            System.loadLibrary(str);
        }
    }
}
