package com.bytedance.platform.horae.common;

/* renamed from: com.bytedance.platform.horae.common.e */
public final class C20374e {

    /* renamed from: a */
    public static final Object[] f49727a = new Object[0];

    /* renamed from: b */
    public static final Class<?>[] f49728b = new Class[0];

    /* renamed from: c */
    private static final String f49729c = "e";

    private C20374e() {
    }

    /* renamed from: a */
    public static Class<?>[] m74221a(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return f49728b;
        }
        return clsArr;
    }

    /* renamed from: b */
    public static Object[] m74223b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f49727a;
        }
        return objArr;
    }

    /* renamed from: a */
    public static Class<?>[] m74222a(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length == 0) {
            return f49728b;
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
