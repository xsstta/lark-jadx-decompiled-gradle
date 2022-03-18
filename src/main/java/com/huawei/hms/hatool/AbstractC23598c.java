package com.huawei.hms.hatool;

import java.util.Map;

/* renamed from: com.huawei.hms.hatool.c */
public abstract class AbstractC23598c {
    /* renamed from: a */
    public static void m85630a(String str, String str2, long j) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            h.mo83043a(j);
        }
    }

    /* renamed from: a */
    public static boolean m85631a(String str, String str2) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            return h.mo83047a();
        }
        return true;
    }

    /* renamed from: b */
    public static int m85632b(String str, String str2) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            return h.mo83055d();
        }
        return 7;
    }

    /* renamed from: c */
    public static boolean m85633c(String str, String str2) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            return h.mo83064g();
        }
        return true;
    }

    /* renamed from: d */
    public static String m85634d(String str, String str2) {
        C23608k h = m85638h(str, str2);
        return h != null ? h.mo83061f() : "";
    }

    /* renamed from: e */
    public static boolean m85635e(String str, String str2) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            return h.mo83066i();
        }
        return false;
    }

    /* renamed from: f */
    public static String m85636f(String str, String str2) {
        C23608k h = m85638h(str, str2);
        return h != null ? h.mo83065h() : "";
    }

    /* renamed from: g */
    public static String m85637g(String str, String str2) {
        C23608k h = m85638h(str, str2);
        return h != null ? h.mo83071n() : "";
    }

    /* renamed from: h */
    public static C23608k m85638h(String str, String str2) {
        C23610m a = C23606i.m85750c().mo83022a(str);
        if (a == null) {
            return null;
        }
        if (!"alltype".equals(str2)) {
            return a.mo83115a(str2);
        }
        C23608k a2 = a.mo83115a("oper");
        return a2 == null ? a.mo83115a("maint") : a2;
    }

    /* renamed from: i */
    public static Map<String, String> m85639i(String str, String str2) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            return h.mo83068k();
        }
        return null;
    }

    /* renamed from: j */
    public static long m85640j(String str, String str2) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            return h.mo83069l();
        }
        return 0;
    }

    /* renamed from: k */
    public static int m85641k(String str, String str2) {
        C23608k h = m85638h(str, str2);
        if (h != null) {
            return h.mo83048b();
        }
        return 10;
    }

    /* renamed from: l */
    public static String m85642l(String str, String str2) {
        C23608k h = m85638h(str, str2);
        return h != null ? h.mo83072o() : "";
    }

    /* renamed from: m */
    public static String m85643m(String str, String str2) {
        C23608k h = m85638h(str, str2);
        return h != null ? h.mo83074q() : "";
    }

    /* renamed from: n */
    public static String m85644n(String str, String str2) {
        C23608k h = m85638h(str, str2);
        return h != null ? h.mo83070m() : "";
    }

    /* renamed from: o */
    public static String m85645o(String str, String str2) {
        C23608k h = m85638h(str, str2);
        return h != null ? h.mo83073p() : "";
    }
}
