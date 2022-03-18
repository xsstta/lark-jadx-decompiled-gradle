package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.f */
public class C44039f {
    /* renamed from: a */
    public static int m174419a(int i) {
        return (i >>> 0) & 3;
    }

    /* renamed from: b */
    public static int m174420b(int i) {
        return (i >>> 6) & 3;
    }

    /* renamed from: c */
    public static int m174421c(int i) {
        return (i >>> 12) & 3;
    }

    /* renamed from: d */
    public static int m174422d(int i) {
        return (i >>> 18) & 3;
    }

    /* renamed from: e */
    public static boolean m174423e(int i) {
        if (m174419a(i) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m174424f(int i) {
        if (m174420b(i) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m174425g(int i) {
        if (m174421c(i) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m174426h(int i) {
        if (m174422d(i) == 2) {
            return true;
        }
        return false;
    }
}
