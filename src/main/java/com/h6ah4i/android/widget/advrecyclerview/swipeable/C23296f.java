package com.h6ah4i.android.widget.advrecyclerview.swipeable;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.f */
class C23296f {
    /* renamed from: a */
    public static int m84566a(int i) {
        return (i >>> 0) & 3;
    }

    /* renamed from: b */
    public static int m84567b(int i) {
        return (i >>> 6) & 3;
    }

    /* renamed from: c */
    public static int m84568c(int i) {
        return (i >>> 12) & 3;
    }

    /* renamed from: d */
    public static int m84569d(int i) {
        return (i >>> 18) & 3;
    }

    /* renamed from: e */
    public static boolean m84570e(int i) {
        if (m84566a(i) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m84571f(int i) {
        if (m84567b(i) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m84572g(int i) {
        if (m84568c(i) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m84573h(int i) {
        if (m84569d(i) == 2) {
            return true;
        }
        return false;
    }
}
