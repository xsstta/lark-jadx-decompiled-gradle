package com.bytedance.platform.godzilla.p872b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.b.d */
public final class C20312d {

    /* renamed from: a */
    private static Map<String, Method> f49586a = new HashMap();

    /* renamed from: b */
    private static final HashMap<Class<?>, Class<?>> f49587b;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f49587b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
    }

    /* renamed from: a */
    public static boolean m74080a(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = f49587b.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = f49587b.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    /* renamed from: a */
    public static Object m74077a(Class cls, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Object[] b = C20310b.m74074b(objArr);
        return m74078a(cls, str, b, C20310b.m74073a(b));
    }

    /* renamed from: b */
    private static String m74081b(Class<?> cls, String str, Class... clsArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(cls.toString());
        sb.append("#");
        sb.append(str);
        if (clsArr == null || clsArr.length <= 0) {
            sb.append(Void.class.toString());
        } else {
            for (Class cls2 : clsArr) {
                sb.append(cls2.toString());
                sb.append("#");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009f A[LOOP:0: B:10:0x002c->B:54:0x009f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Method m74079a(java.lang.Class<?> r13, java.lang.String r14, java.lang.Class... r15) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.platform.godzilla.p872b.C20312d.m74079a(java.lang.Class, java.lang.String, java.lang.Class[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static Object m74078a(Class cls, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<?>[] a = C20310b.m74072a(clsArr);
        Object[] b = C20310b.m74074b(objArr);
        Method a2 = m74079a((Class<?>) cls, str, (Class[]) a);
        if (a2 != null) {
            return a2.invoke(null, b);
        }
        return null;
    }
}
