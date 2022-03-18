package com.bytedance.android.alog;

import java.io.File;
import java.util.HashMap;

/* renamed from: com.bytedance.android.alog.c */
public class C2616c {

    /* renamed from: a */
    private static Alog f8353a;

    /* renamed from: b */
    public static void m11025b() {
        Alog alog = f8353a;
        if (alog != null) {
            alog.mo11288b();
        }
    }

    /* renamed from: c */
    public static void m11028c() {
        Alog alog = f8353a;
        if (alog != null) {
            alog.mo11291c();
        }
    }

    /* renamed from: a */
    public static void m11017a() {
        Alog.nativeSetDefaultInstance(0);
        f8353a.mo11281a();
        f8353a = null;
    }

    /* renamed from: d */
    public static HashMap<String, String> m11030d() {
        Alog alog = f8353a;
        if (alog != null) {
            return alog.mo11300h();
        }
        return null;
    }

    /* renamed from: e */
    public static String m11032e() {
        Alog alog = f8353a;
        if (alog != null) {
            return alog.mo11301i();
        }
        return "default log instance is null";
    }

    /* renamed from: f */
    public static long m11034f() {
        Alog alog = f8353a;
        if (alog != null) {
            return alog.mo11293d();
        }
        return 0;
    }

    /* renamed from: g */
    public static long m11035g() {
        Alog alog = f8353a;
        if (alog != null) {
            return alog.mo11295e();
        }
        return 0;
    }

    /* renamed from: h */
    public static long m11036h() {
        Alog alog = f8353a;
        if (alog != null) {
            return alog.mo11297f();
        }
        return 0;
    }

    /* renamed from: i */
    public static long m11037i() {
        Alog alog = f8353a;
        if (alog != null) {
            return alog.mo11299g();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m11018a(int i) {
        Alog alog = f8353a;
        if (alog != null) {
            alog.mo11282a(i);
        }
    }

    /* renamed from: b */
    public static void m11026b(int i) {
        Alog alog = f8353a;
        if (alog != null) {
            alog.mo11289b(i);
        }
    }

    /* renamed from: a */
    public static void m11021a(Alog alog) {
        long j;
        f8353a = alog;
        if (alog == null) {
            j = 0;
        } else {
            j = alog.mo11302j();
        }
        Alog.nativeSetDefaultInstance(j);
    }

    /* renamed from: a */
    public static void m11023a(boolean z) {
        Alog alog = f8353a;
        if (alog != null) {
            alog.mo11286a(z);
        }
    }

    /* renamed from: d */
    public static void m11031d(String str, String str2) {
        m11019a(3, str, str2);
    }

    /* renamed from: e */
    public static void m11033e(String str, String str2) {
        m11019a(4, str, str2);
    }

    /* renamed from: c */
    public static void m11029c(String str, String str2) {
        m11019a(2, str, str2);
    }

    /* renamed from: b */
    public static void m11027b(String str, String str2) {
        m11019a(1, str, str2);
    }

    /* renamed from: a */
    public static void m11022a(String str, String str2) {
        m11019a(0, str, str2);
    }

    /* renamed from: a */
    public static void m11019a(int i, String str, String str2) {
        Alog alog = f8353a;
        if (alog != null) {
            alog.mo11283a(i, str, str2);
        }
    }

    /* renamed from: a */
    public static File[] m11024a(String str, String str2, long j, long j2) {
        Alog alog = f8353a;
        if (alog != null) {
            return alog.mo11287a(str, str2, j, j2);
        }
        return new File[0];
    }

    /* renamed from: a */
    public static void m11020a(int i, String str, String str2, long j, long j2) {
        Alog alog = f8353a;
        if (alog != null) {
            alog.mo11284a(i, str, str2, j, j2);
        }
    }
}
