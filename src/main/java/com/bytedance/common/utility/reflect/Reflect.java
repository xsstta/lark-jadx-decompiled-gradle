package com.bytedance.common.utility.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class Reflect {
    private final boolean isClass;
    public final Object object;

    public static class NULL {
    }

    public <T> T get() {
        return (T) this.object;
    }

    public Reflect create() throws ReflectException {
        return create(new Object[0]);
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        if (this.isClass) {
            return (Class) this.object;
        }
        return this.object.getClass();
    }

    public Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> type = type();
        do {
            Field[] declaredFields = type.getDeclaredFields();
            for (Field field : declaredFields) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name, new Class[0]));
                    }
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        return linkedHashMap;
    }

    private Reflect(Object obj) {
        this.object = obj;
    }

    public static Reflect on(Class<?> cls) {
        return new Reflect(cls);
    }

    private Reflect(Class<?> cls) {
        this.object = cls;
        this.isClass = true;
    }

    private static Class<?> forName(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public static Reflect on(Object obj) {
        return new Reflect(obj);
    }

    private static Object unwrap(Object obj) {
        if (obj instanceof Reflect) {
            return ((Reflect) obj).get();
        }
        return obj;
    }

    public Reflect call(String str) throws ReflectException {
        return call(str, null, new Object[0]);
    }

    public static Reflect on(String str) throws ReflectException {
        return on(forName(str));
    }

    public static Class<?>[] types(Object... objArr) {
        Class<?> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                cls = NULL.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    public <P> P as(Class<P> cls) {
        final boolean z = this.object instanceof Map;
        C36351 r1 = new InvocationHandler() {
            /* class com.bytedance.common.utility.reflect.Reflect.C36351 */

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                int i;
                String name = method.getName();
                try {
                    return Reflect.on(Reflect.this.object).call(name, Reflect.types(objArr), objArr).get();
                } catch (ReflectException e) {
                    if (z) {
                        Map map = (Map) Reflect.this.object;
                        if (objArr == null) {
                            i = 0;
                        } else {
                            i = objArr.length;
                        }
                        if (i == 0 && name.startsWith("get")) {
                            return map.get(Reflect.property(name.substring(3)));
                        }
                        if (i == 0 && name.startsWith("is")) {
                            return map.get(Reflect.property(name.substring(2)));
                        }
                        if (i == 1 && name.startsWith("set")) {
                            map.put(Reflect.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e;
                }
            }
        };
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, r1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public static <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase(Locale.getDefault());
        }
        return str.substring(0, 1).toLowerCase(Locale.getDefault()) + str.substring(1);
    }

    public Reflect create(Object... objArr) throws ReflectException {
        Class<?>[] types = types(objArr);
        try {
            return on(type().getDeclaredConstructor(types), objArr);
        } catch (NoSuchMethodException e) {
            Constructor<?>[] declaredConstructors = type().getDeclaredConstructors();
            for (Constructor<?> constructor : declaredConstructors) {
                if (match(constructor.getParameterTypes(), types)) {
                    return on(constructor, objArr);
                }
            }
            throw new ReflectException(e);
        }
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (!cls.isPrimitive()) {
            return cls;
        }
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Void.TYPE == cls) {
            return Void.class;
        }
        return cls;
    }

    public Field exactField(String str, Class<?>... clsArr) throws ReflectException {
        return field0(str, clsArr);
    }

    public <T> T get(String str, Class<?>... clsArr) throws ReflectException {
        return (T) field(str, clsArr).get();
    }

    public Reflect field(String str, Class<?>... clsArr) throws ReflectException {
        try {
            return on(field0(str, clsArr).get(this.object));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    public Reflect set(String str, Object obj) throws ReflectException {
        try {
            field0(str, new Class[0]).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != NULL.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    private static Reflect on(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    private Field field0(String str, Class<?>... clsArr) throws ReflectException {
        Class<?> type = type();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return type.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) accessible(type.getDeclaredField(str));
                    } catch (NoSuchFieldException e2) {
                        e2.printStackTrace();
                        type = type.getSuperclass();
                        if (type != null) {
                            throw new ReflectException(e);
                        }
                    }
                } while (type != null);
                throw new ReflectException(e);
            }
        } else {
            do {
                try {
                    Field[] declaredFields = type.getDeclaredFields();
                    for (Field field : declaredFields) {
                        Class<?> type2 = field.getType();
                        if (type2 != null && type2.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) accessible(field);
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                type = type.getSuperclass();
            } while (type != null);
            throw new ReflectException("NoSuchFieldException");
        }
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> type = type();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            Method[] declaredMethods = type.getDeclaredMethods();
            for (Method method2 : declaredMethods) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + type() + ".");
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !match(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.bytedance.common.utility.reflect.Reflect] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return on(similarMethod(r3, r4), r2.object, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.bytedance.common.utility.reflect.ReflectException(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.common.utility.reflect.Reflect call(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) throws com.bytedance.common.utility.reflect.ReflectException {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.exactMethod(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r2.object     // Catch:{ NoSuchMethodException -> 0x000b }
            com.bytedance.common.utility.reflect.Reflect r3 = on(r0, r1, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r3
        L_0x000b:
            java.lang.reflect.Method r3 = r2.similarMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r4 = r2.object     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.bytedance.common.utility.reflect.Reflect r3 = on(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r3
        L_0x0016:
            r3 = move-exception
            com.bytedance.common.utility.reflect.ReflectException r4 = new com.bytedance.common.utility.reflect.ReflectException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.Reflect.call(java.lang.String, java.lang.Class[], java.lang.Object[]):com.bytedance.common.utility.reflect.Reflect");
    }

    private static Reflect on(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            accessible(method);
            if (method.getReturnType() != Void.TYPE) {
                return on(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return on(obj);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method exactMethod(java.lang.String r17, java.lang.Class<?>[] r18, java.lang.Object... r19) throws java.lang.NoSuchMethodException {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.Reflect.exactMethod(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }
}
