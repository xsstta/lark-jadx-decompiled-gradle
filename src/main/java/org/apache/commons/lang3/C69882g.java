package org.apache.commons.lang3;

/* renamed from: org.apache.commons.lang3.g */
public class C69882g {
    /* renamed from: a */
    public static <T> T m268176a(T t) {
        return (T) m268177a(t, "The validated object is null", new Object[0]);
    }

    /* renamed from: b */
    public static <T> T[] m268182b(T[] tArr) {
        return (T[]) m268183b(tArr, "The validated array contains null element at index: %d", new Object[0]);
    }

    /* renamed from: a */
    public static void m268178a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException("The validated expression is false");
        }
    }

    /* renamed from: a */
    public static <T> T[] m268180a(T[] tArr) {
        return (T[]) m268181a((Object[]) tArr, "The validated array is empty", new Object[0]);
    }

    /* renamed from: a */
    public static <T> T m268177a(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.format(str, objArr));
    }

    /* renamed from: b */
    public static <T> T[] m268183b(T[] tArr, String str, Object... objArr) {
        m268176a((Object) tArr);
        for (int i = 0; i < tArr.length; i++) {
            if (tArr[i] == null) {
                throw new IllegalArgumentException(String.format(str, C69853a.m268069c(objArr, Integer.valueOf(i))));
            }
        }
        return tArr;
    }

    /* renamed from: a */
    public static void m268179a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static <T> T[] m268181a(T[] tArr, String str, Object... objArr) {
        if (tArr == null) {
            throw new NullPointerException(String.format(str, objArr));
        } else if (tArr.length != 0) {
            return tArr;
        } else {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }
}
