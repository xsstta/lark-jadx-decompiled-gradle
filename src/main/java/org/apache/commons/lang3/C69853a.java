package org.apache.commons.lang3;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: org.apache.commons.lang3.a */
public class C69853a {

    /* renamed from: a */
    public static final Object[] f174613a = new Object[0];

    /* renamed from: b */
    public static final Class<?>[] f174614b = new Class[0];

    /* renamed from: c */
    public static final String[] f174615c = new String[0];

    /* renamed from: d */
    public static final long[] f174616d = new long[0];

    /* renamed from: e */
    public static final Long[] f174617e = new Long[0];

    /* renamed from: f */
    public static final int[] f174618f = new int[0];

    /* renamed from: g */
    public static final Integer[] f174619g = new Integer[0];

    /* renamed from: h */
    public static final short[] f174620h = new short[0];

    /* renamed from: i */
    public static final Short[] f174621i = new Short[0];

    /* renamed from: j */
    public static final byte[] f174622j = new byte[0];

    /* renamed from: k */
    public static final Byte[] f174623k = new Byte[0];

    /* renamed from: l */
    public static final double[] f174624l = new double[0];

    /* renamed from: m */
    public static final Double[] f174625m = new Double[0];

    /* renamed from: n */
    public static final float[] f174626n = new float[0];

    /* renamed from: o */
    public static final Float[] f174627o = new Float[0];

    /* renamed from: p */
    public static final boolean[] f174628p = new boolean[0];

    /* renamed from: q */
    public static final Boolean[] f174629q = new Boolean[0];

    /* renamed from: r */
    public static final char[] f174630r = new char[0];

    /* renamed from: s */
    public static final Character[] f174631s = new Character[0];

    /* renamed from: c */
    public static boolean m268068c(int[] iArr) {
        return !m268066b(iArr);
    }

    /* renamed from: a */
    public static int m268057a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    /* renamed from: b */
    public static boolean m268066b(int[] iArr) {
        if (m268057a((Object) iArr) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m268062a(char[] cArr) {
        if (m268057a((Object) cArr) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int[] m268063a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    /* renamed from: a */
    public static int m268058a(Object[] objArr, Object obj) {
        return m268059a(objArr, obj, 0);
    }

    /* renamed from: a */
    private static Object m268060a(Object obj, Class<?> cls) {
        if (obj == null) {
            return Array.newInstance(cls, 1);
        }
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        return newInstance;
    }

    /* renamed from: b */
    public static boolean m268067b(Object[] objArr, Object obj) {
        if (m268058a(objArr, obj) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static <T> T[] m268069c(T[] tArr, T t) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass().getComponentType();
        } else if (t != null) {
            cls = t.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        T[] tArr2 = (T[]) ((Object[]) m268060a((Object) tArr, cls));
        tArr2[tArr2.length - 1] = t;
        return tArr2;
    }

    /* renamed from: a */
    static Object m268061a(Object obj, int... iArr) {
        int i;
        int i2;
        int a = m268057a(obj);
        int[] a2 = m268063a(iArr);
        Arrays.sort(a2);
        if (m268068c(a2)) {
            int length = a2.length;
            int i3 = a;
            i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 = a2[length];
                if (i2 < 0 || i2 >= a) {
                } else if (i2 < i3) {
                    i++;
                    i3 = i2;
                }
            }
            throw new IndexOutOfBoundsException("Index: " + i2 + ", Length: " + a);
        }
        i = 0;
        int i4 = a - i;
        Object newInstance = Array.newInstance(obj.getClass().getComponentType(), i4);
        if (i < a) {
            int length2 = a2.length - 1;
            while (length2 >= 0) {
                int i5 = a2[length2];
                int i6 = a - i5;
                if (i6 > 1) {
                    int i7 = i6 - 1;
                    i4 -= i7;
                    System.arraycopy(obj, i5 + 1, newInstance, i4, i7);
                }
                length2--;
                a = i5;
            }
            if (a > 0) {
                System.arraycopy(obj, 0, newInstance, 0, a);
            }
        }
        return newInstance;
    }

    /* renamed from: a */
    public static int[] m268064a(int[] iArr, int i) {
        int[] iArr2 = (int[]) m268060a(iArr, Integer.TYPE);
        iArr2[iArr2.length - 1] = i;
        return iArr2;
    }

    /* renamed from: a */
    public static <T> T[] m268065a(T[] tArr, int... iArr) {
        return (T[]) ((Object[]) m268061a((Object) tArr, iArr));
    }

    /* renamed from: a */
    public static int m268059a(Object[] objArr, Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
