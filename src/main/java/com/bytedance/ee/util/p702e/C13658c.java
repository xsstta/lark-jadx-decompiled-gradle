package com.bytedance.ee.util.p702e;

import java.lang.reflect.Array;

/* renamed from: com.bytedance.ee.util.e.c */
public class C13658c {
    /* renamed from: a */
    private static boolean m55425a(int[] iArr) {
        if (iArr == null || iArr.length != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int[] m55427b(int[] iArr, int[] iArr2) {
        if (!m55425a(iArr) || !m55425a(iArr2)) {
            return new int[2];
        }
        return new int[]{Math.min(iArr[0], iArr2[0]), Math.max(iArr[1], iArr2[1])};
    }

    /* renamed from: a */
    public static int[][] m55426a(int[] iArr, int[] iArr2) {
        if (!m55425a(iArr) || !m55425a(iArr2)) {
            return (int[][]) Array.newInstance(int.class, 0, 2);
        }
        if (iArr[1] < iArr2[0] || iArr[0] > iArr2[1]) {
            return new int[][]{iArr};
        } else if (iArr[0] >= iArr2[0] && iArr[1] <= iArr2[1]) {
            return (int[][]) Array.newInstance(int.class, 0, 2);
        } else {
            if (iArr[0] > iArr2[0] || iArr[1] < iArr2[1]) {
                if (iArr[0] < iArr2[0]) {
                    return new int[][]{new int[]{iArr[0], iArr2[0]}};
                } else if (iArr[1] <= iArr2[1]) {
                    return (int[][]) Array.newInstance(int.class, 0, 2);
                } else {
                    return new int[][]{new int[]{iArr2[1], iArr[1]}};
                }
            } else if (iArr[0] == iArr2[0]) {
                return new int[][]{new int[]{iArr2[1], iArr[1]}};
            } else if (iArr[1] == iArr2[1]) {
                return new int[][]{new int[]{iArr[0], iArr2[0]}};
            } else {
                return new int[][]{new int[]{iArr[0], iArr2[0]}, new int[]{iArr2[1], iArr[1]}};
            }
        }
    }
}
