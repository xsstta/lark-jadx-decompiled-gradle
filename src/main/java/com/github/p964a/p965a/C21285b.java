package com.github.p964a.p965a;

import java.util.List;
import org.p3487a.p3489b.C69740c;

/* renamed from: com.github.a.a.b */
public final class C21285b {

    /* renamed from: a */
    static C69740c f51822a;

    /* renamed from: b */
    static AbstractC21291h f51823b;

    /* renamed from: c */
    static List<AbstractC21290g> f51824c;

    /* renamed from: a */
    public static String m77122a(char c) {
        if (!m77125b(c)) {
            return String.valueOf(c);
        }
        if (c == 12295) {
            return "LING";
        }
        return C21289f.f51832b[m77126c(c)];
    }

    /* renamed from: b */
    public static boolean m77125b(char c) {
        if ((19968 > c || c > 40869 || m77126c(c) <= 0) && 12295 != c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static int m77126c(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return m77124a(C21286c.f51825a, C21286c.f51826b, i);
        }
        if (7000 > i || i >= 14000) {
            return m77124a(C21288e.f51829a, C21288e.f51830b, i - 14000);
        }
        return m77124a(C21287d.f51827a, C21287d.f51828b, i - 7000);
    }

    /* renamed from: a */
    public static String m77123a(String str, String str2) {
        return C21283a.m77119a(str, f51822a, f51824c, str2, f51823b);
    }

    /* renamed from: a */
    private static short m77124a(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i % 8;
        short s = (short) (bArr2[i] & 255);
        if ((bArr[i / 8] & C21289f.f51831a[i2]) != 0) {
            return (short) (s | 256);
        }
        return s;
    }
}
