package com.bytedance.platform.godzilla.p872b;

/* renamed from: com.bytedance.platform.godzilla.b.b */
public final class C20310b {

    /* renamed from: a */
    public static final Object[] f49582a = new Object[0];

    /* renamed from: b */
    public static final Class<?>[] f49583b = new Class[0];

    /* renamed from: c */
    private static final String f49584c = "b";

    private C20310b() {
    }

    /* renamed from: a */
    public static Class<?>[] m74072a(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return f49583b;
        }
        return clsArr;
    }

    /* renamed from: b */
    public static Object[] m74074b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f49582a;
        }
        return objArr;
    }

    /* renamed from: a */
    public static Class<?>[] m74073a(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length == 0) {
            return f49583b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == null) {
                cls = null;
            } else {
                cls = objArr[i].getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }
}
