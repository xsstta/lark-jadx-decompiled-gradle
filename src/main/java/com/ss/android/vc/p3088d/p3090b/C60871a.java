package com.ss.android.vc.p3088d.p3090b;

import com.ss.android.vc.p3088d.C60868a;
import com.ss.android.vc.p3088d.p3089a.AbstractC60870b;

/* renamed from: com.ss.android.vc.d.b.a */
public class C60871a {

    /* renamed from: a */
    private static volatile AbstractC60870b f152391a;

    /* renamed from: a */
    public static AbstractC60870b m236608a() {
        if (f152391a == null) {
            synchronized (C60871a.class) {
                if (f152391a == null && C60868a.m236601a() != null) {
                    f152391a = C60868a.m236601a().mo208718a();
                }
            }
        }
        return f152391a;
    }

    /* renamed from: a */
    public static void m236609a(String str, String str2) {
        if (m236608a() != null) {
            m236608a().mo208719a(str, str2);
        }
    }

    /* renamed from: b */
    public static void m236611b(String str, String str2) {
        if (m236608a() != null) {
            m236608a().mo208721b(str, str2);
        }
    }

    /* renamed from: c */
    public static void m236612c(String str, String str2) {
        if (m236608a() != null) {
            m236608a().mo208722c(str, str2);
        }
    }

    /* renamed from: a */
    public static void m236610a(String str, String str2, Throwable th) {
        if (m236608a() != null) {
            m236608a().mo208720a(str, str2, th);
        }
    }
}
