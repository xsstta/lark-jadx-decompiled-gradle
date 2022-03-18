package com.h6ah4i.android.widget.advrecyclerview.p1004a;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.a.d */
public class C23231d {
    /* renamed from: b */
    public static long m84172b(long j) {
        if (j == -1) {
            return -1;
        }
        return (j << 8) >> 8;
    }

    /* renamed from: a */
    public static long m84170a(long j) {
        if (j >= -134217728 && j <= 134217727) {
            return ((j << 28) & 72057593769492480L) | 268435455;
        }
        throw new IllegalArgumentException("Group ID value is out of range. (groupId = " + j + ")");
    }

    /* renamed from: a */
    public static long m84171a(long j, long j2) {
        if (j < -134217728 || j > 134217727) {
            throw new IllegalArgumentException("Group ID value is out of range. (groupId = " + j + ")");
        } else if (j2 >= -134217728 && j2 <= 134217727) {
            return ((j << 28) & 72057593769492480L) | ((j2 << 0) & 268435455);
        } else {
            throw new IllegalArgumentException("Child ID value is out of range. (childId = " + j2 + ")");
        }
    }
}
