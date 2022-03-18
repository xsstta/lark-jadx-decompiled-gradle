package com.bytedance.monitor.util;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.monitor.util.d */
public class C20173d {

    /* renamed from: a */
    private static final Class<?>[] f49287a = {Byte.TYPE, Short.TYPE, Character.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f49288b;

    /* renamed from: c */
    private static final Map<Class<?>, Class<?>> f49289c = new HashMap();

    /* renamed from: a */
    private static boolean m73621a(int i) {
        return (i & 7) == 0;
    }

    static {
        HashMap hashMap = new HashMap();
        f49288b = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.TYPE);
        for (Class<?> cls : hashMap.keySet()) {
            Class<?> cls2 = f49288b.get(cls);
            if (!cls.equals(cls2)) {
                f49289c.put(cls2, cls);
            }
        }
    }

    /* renamed from: b */
    static Class<?> m73628b(Class<?> cls) {
        return f49289c.get(cls);
    }

    /* renamed from: a */
    static Class<?> m73620a(Class<?> cls) {
        if (cls == null || !cls.isPrimitive()) {
            return cls;
        }
        return f49288b.get(cls);
    }

    /* renamed from: a */
    static boolean m73624a(AccessibleObject accessibleObject) {
        if (accessibleObject != null && !accessibleObject.isAccessible()) {
            Member member = (Member) accessibleObject;
            if (!accessibleObject.isAccessible() && Modifier.isPublic(member.getModifiers()) && m73621a(member.getDeclaringClass().getModifiers())) {
                try {
                    accessibleObject.setAccessible(true);
                    return true;
                } catch (SecurityException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m73625a(Member member) {
        if (member == null || !Modifier.isPublic(member.getModifiers()) || member.isSynthetic()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m73622a(Class<?> cls, Class<?> cls2) {
        return m73623a(cls, cls2, true);
    }

    /* renamed from: a */
    private static float m73618a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < clsArr.length; i++) {
            f += m73627b(clsArr[i], clsArr2[i]);
        }
        return f;
    }

    /* renamed from: b */
    private static float m73627b(Class<?> cls, Class<?> cls2) {
        if (cls2.isPrimitive()) {
            return m73629c(cls, cls2);
        }
        float f = BitmapDescriptorFactory.HUE_RED;
        while (true) {
            if (cls != null && !cls2.equals(cls)) {
                if (cls2.isInterface() && m73622a(cls, cls2)) {
                    f += 0.25f;
                    break;
                }
                f += 1.0f;
                cls = cls.getSuperclass();
            } else {
                break;
            }
        }
        if (cls == null) {
            return f + 1.5f;
        }
        return f;
    }

    /* renamed from: c */
    private static float m73629c(Class<?> cls, Class<?> cls2) {
        float f;
        if (!cls.isPrimitive()) {
            cls = m73628b(cls);
            f = 0.1f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        int i = 0;
        while (cls != cls2) {
            Class<?>[] clsArr = f49287a;
            if (i >= clsArr.length) {
                break;
            }
            if (cls == clsArr[i]) {
                f += 0.1f;
                if (i < clsArr.length - 1) {
                    cls = clsArr[i + 1];
                }
            }
            i++;
        }
        return f;
    }

    /* renamed from: a */
    static int m73619a(Class<?>[] clsArr, Class<?>[] clsArr2, Class<?>[] clsArr3) {
        float a = m73618a(clsArr3, clsArr);
        float a2 = m73618a(clsArr3, clsArr2);
        if (a < a2) {
            return -1;
        }
        if (a2 < a) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    static boolean m73623a(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (z) {
            if (cls.isPrimitive() && !cls2.isPrimitive() && (cls = m73620a(cls)) == null) {
                return false;
            }
            if (cls2.isPrimitive() && !cls.isPrimitive() && (cls = m73628b(cls)) == null) {
                return false;
            }
        }
        if (cls.equals(cls2)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return cls2.isAssignableFrom(cls);
        }
        if (!cls2.isPrimitive()) {
            return false;
        }
        if (Integer.TYPE.equals(cls)) {
            if (Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                return true;
            }
            return false;
        } else if (Long.TYPE.equals(cls)) {
            if (Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                return true;
            }
            return false;
        } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
            return false;
        } else {
            if (Float.TYPE.equals(cls)) {
                return Double.TYPE.equals(cls2);
            }
            if (Character.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (Short.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            } else if (!Byte.TYPE.equals(cls)) {
                return false;
            } else {
                if (Short.TYPE.equals(cls2) || Integer.TYPE.equals(cls2) || Long.TYPE.equals(cls2) || Float.TYPE.equals(cls2) || Double.TYPE.equals(cls2)) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: a */
    static boolean m73626a(Class<?>[] clsArr, Class<?>[] clsArr2, boolean z) {
        if (!C20175f.m73637a(clsArr, clsArr2)) {
            return false;
        }
        if (clsArr == null) {
            clsArr = C20175f.f49292b;
        }
        if (clsArr2 == null) {
            clsArr2 = C20175f.f49292b;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!m73623a(clsArr[i], clsArr2[i], z)) {
                return false;
            }
        }
        return true;
    }
}
