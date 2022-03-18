package com.bytedance.monitor.util;

/* renamed from: com.bytedance.monitor.util.f */
public class C20175f {

    /* renamed from: a */
    static final Object[] f49291a = new Object[0];

    /* renamed from: b */
    static final Class<?>[] f49292b = new Class[0];

    /* renamed from: a */
    static Class<?>[] m73638a(Class<?>[] clsArr) {
        if (clsArr == null || clsArr.length == 0) {
            return f49292b;
        }
        return clsArr;
    }

    /* renamed from: b */
    static Object[] m73640b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f49291a;
        }
        return objArr;
    }

    /* renamed from: a */
    static Class<?>[] m73639a(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return f49292b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i] == null ? null : objArr[i].getClass();
        }
        return clsArr;
    }

    /* renamed from: a */
    static boolean m73637a(Object[] objArr, Object[] objArr2) {
        if (objArr == null && objArr2 != null && objArr2.length > 0) {
            return false;
        }
        if (objArr2 == null && objArr != null && objArr.length > 0) {
            return false;
        }
        if (objArr == null || objArr2 == null || objArr.length == objArr2.length) {
            return true;
        }
        return false;
    }
}
