package com.tt.miniapp.p3289g;

import com.tt.miniapp.process.p3316a.C66612a;

/* renamed from: com.tt.miniapp.g.a */
public class C66180a {
    /* renamed from: a */
    public static void m259140a(String str, String str2, String str3) {
        C66612a.m260226a(str, str2, str3);
    }

    /* renamed from: a */
    public static void m259138a(String str, String str2, int i) {
        m259140a(str, str2, String.valueOf(i));
    }

    /* renamed from: b */
    public static String m259143b(String str, String str2, String str3) {
        return C66612a.m260232b(str, str2, str3);
    }

    /* renamed from: a */
    public static void m259139a(String str, String str2, long j) {
        m259140a(str, str2, String.valueOf(j));
    }

    /* renamed from: b */
    public static int m259141b(String str, String str2, int i) {
        try {
            return Integer.parseInt(m259143b(str, str2, String.valueOf(i)));
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: b */
    public static long m259142b(String str, String str2, long j) {
        try {
            return Long.parseLong(m259143b(str, str2, String.valueOf(j)));
        } catch (Exception unused) {
            return j;
        }
    }
}
