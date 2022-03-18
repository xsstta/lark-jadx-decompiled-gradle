package com.h6ah4i.android.widget.advrecyclerview.expandable;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.expandable.b */
class C23269b {
    /* renamed from: a */
    public static int m84397a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    public static long m84398a(int i) {
        return (((long) i) & 4294967295L) | -4294967296L;
    }

    /* renamed from: a */
    public static long m84399a(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* renamed from: b */
    public static int m84400b(long j) {
        return (int) (j & 4294967295L);
    }
}
