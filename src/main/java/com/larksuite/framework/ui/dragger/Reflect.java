package com.larksuite.framework.ui.dragger;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class Reflect {

    /* renamed from: a */
    public final Object f64690a;

    /* renamed from: b */
    private final boolean f64691b;

    /* renamed from: com.larksuite.framework.ui.dragger.Reflect$a */
    public static class C26199a {
    }

    public static class ReflectException extends RuntimeException {
        private static final long serialVersionUID = -2243843843843438438L;

        public ReflectException() {
        }

        public ReflectException(String str) {
            super(str);
        }

        public ReflectException(Throwable th) {
            super(th);
        }

        public ReflectException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: a */
    public <T> T mo93185a() {
        return (T) this.f64690a;
    }

    public int hashCode() {
        return this.f64690a.hashCode();
    }

    public String toString() {
        return this.f64690a.toString();
    }

    /* renamed from: b */
    public Class<?> mo93188b() {
        if (this.f64691b) {
            return (Class) this.f64690a;
        }
        return this.f64690a.getClass();
    }

    private Reflect(Object obj) {
        this.f64690a = obj;
    }

    /* renamed from: a */
    public static Reflect m94754a(Object obj) {
        return new Reflect(obj);
    }

    /* renamed from: a */
    public Reflect mo93183a(String str) throws ReflectException {
        return mo93184a(str, (Class<?>[]) null, new Object[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.f64690a.equals(((Reflect) obj).mo93185a());
        }
        return false;
    }

    /* renamed from: a */
    public static Class<?> m94756a(Class<?> cls) {
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

    /* renamed from: a */
    public static <T extends AccessibleObject> T m94757a(T t) {
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

    /* renamed from: b */
    public Reflect mo93187b(String str, Class<?>... clsArr) throws ReflectException {
        try {
            return m94754a(m94760c(str, clsArr).get(this.f64690a));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* renamed from: c */
    private Field m94760c(String str, Class<?>... clsArr) throws ReflectException {
        Class<?> b = mo93188b();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return b.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) m94757a((AccessibleObject) b.getDeclaredField(str));
                    } catch (NoSuchFieldException unused) {
                        b = b.getSuperclass();
                        if (b != null) {
                            throw new ReflectException(e);
                        }
                    }
                } while (b != null);
                throw new ReflectException(e);
            }
        } else {
            do {
                try {
                    Field[] declaredFields = b.getDeclaredFields();
                    for (Field field : declaredFields) {
                        Class<?> type = field.getType();
                        if (type != null && type.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) m94757a((AccessibleObject) field);
                        }
                    }
                } catch (Exception unused2) {
                }
                b = b.getSuperclass();
            } while (b != null);
            throw new ReflectException("NoSuchFieldException");
        }
    }

    /* renamed from: d */
    private Method m94761d(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> b = mo93188b();
        Method[] methods = b.getMethods();
        for (Method method : methods) {
            if (m94758a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            Method[] declaredMethods = b.getDeclaredMethods();
            for (Method method2 : declaredMethods) {
                if (m94758a(method2, str, clsArr)) {
                    return method2;
                }
            }
            b = b.getSuperclass();
        } while (b != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + mo93188b() + ".");
    }

    /* renamed from: a */
    private boolean m94759a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C26199a.class && !m94756a(clsArr[i]).isAssignableFrom(m94756a(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public <T> T mo93186a(String str, Class<?>... clsArr) throws ReflectException {
        return (T) mo93187b(str, clsArr).mo93185a();
    }

    /* renamed from: a */
    private boolean m94758a(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !m94759a(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Reflect m94755a(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            m94757a((AccessibleObject) method);
            if (method.getReturnType() != Void.TYPE) {
                return m94754a(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m94754a(obj);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x000d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0008 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.reflect.Method] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r2 = mo93188b();
        r3 = r2.getMethods();
        r4 = r3.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r6 < r4) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r7 = r3[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r0.equals(r7.getName()) != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r8 = r7.getParameterTypes();
        r9 = r8.length;
        r11 = 0;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r11 < r9) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        r13 = r8[r11];
        android.util.Log.d("Plugin", "Reflect type = " + r2 + " method = " + r0 + " paramTypes " + r12 + " = " + r13.getName());
        r12 = r12 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        return r2.getDeclaredMethod(r0, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r2 = r2.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method mo93189b(java.lang.String r17, java.lang.Class<?>[] r18, java.lang.Object... r19) throws java.lang.NoSuchMethodException {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.ui.dragger.Reflect.mo93189b(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.larksuite.framework.ui.dragger.Reflect] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return m94755a(m94761d(r3, r4), r2.f64690a, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.larksuite.framework.ui.dragger.Reflect.ReflectException(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.larksuite.framework.ui.dragger.Reflect mo93184a(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) throws com.larksuite.framework.ui.dragger.Reflect.ReflectException {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.mo93189b(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r2.f64690a     // Catch:{ NoSuchMethodException -> 0x000b }
            com.larksuite.framework.ui.dragger.Reflect r3 = m94755a(r0, r1, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r3
        L_0x000b:
            java.lang.reflect.Method r3 = r2.m94761d(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r4 = r2.f64690a     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.larksuite.framework.ui.dragger.Reflect r3 = m94755a(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r3
        L_0x0016:
            r3 = move-exception
            com.larksuite.framework.ui.dragger.Reflect$ReflectException r4 = new com.larksuite.framework.ui.dragger.Reflect$ReflectException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.framework.ui.dragger.Reflect.mo93184a(java.lang.String, java.lang.Class[], java.lang.Object[]):com.larksuite.framework.ui.dragger.Reflect");
    }
}
