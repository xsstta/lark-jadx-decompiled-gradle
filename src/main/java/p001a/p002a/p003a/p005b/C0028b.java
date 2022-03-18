package p001a.p002a.p003a.p005b;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: a.a.a.b.b */
public class C0028b {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f47a;

    /* renamed from: a.a.a.b.b$a */
    public static class C0029a<T> {

        /* renamed from: a */
        public final Class<? extends T> f48a;

        /* renamed from: b */
        public final T f49b;
    }

    static {
        HashMap hashMap = new HashMap();
        f47a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Float.class, Float.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        Class cls = Boolean.TYPE;
        hashMap.put(cls, cls);
        Class cls2 = Byte.TYPE;
        hashMap.put(cls2, cls2);
        Class cls3 = Character.TYPE;
        hashMap.put(cls3, cls3);
        Class cls4 = Short.TYPE;
        hashMap.put(cls4, cls4);
        Class cls5 = Integer.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Long.TYPE;
        hashMap.put(cls7, cls7);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    /* renamed from: a */
    private static Method m41a(Class<?> cls, String str, Class... clsArr) {
        Method a = m42a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m41a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private static Method m42a(Method[] methodArr, String str, Class<?>[] clsArr) {
        Objects.requireNonNull(str, "Method name must not be null.");
        for (Method method : methodArr) {
            if (method.getName().equals(str) && m45a(method.getParameterTypes(), clsArr)) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m43a(Class<?> cls, String str, Object... objArr) {
        m41a(cls, str, (Class[]) m46a(objArr)).invoke(null, m47b(objArr));
    }

    /* renamed from: a */
    public static void m44a(String str, String str2, Object... objArr) {
        try {
            m43a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static boolean m45a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i])) {
                Map<Class<?>, Class<?>> map = f47a;
                if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m46a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C0029a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C0029a) obj).f48a;
            }
        }
        return clsArr;
    }

    /* renamed from: b */
    private static Object[] m47b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C0029a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C0029a) obj).f49b;
            }
        }
        return objArr2;
    }
}
