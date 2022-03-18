package com.ss.android.vc.irtc.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflect {

    /* renamed from: a */
    public final Object f152952a;

    /* renamed from: b */
    private final boolean f152953b;

    /* renamed from: com.ss.android.vc.irtc.utils.Reflect$a */
    public static class C61072a {
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
    public <T> T mo211286a() {
        return (T) this.f152952a;
    }

    public int hashCode() {
        return this.f152952a.hashCode();
    }

    public String toString() {
        return this.f152952a.toString();
    }

    /* renamed from: b */
    public Class<?> mo211287b() {
        if (this.f152953b) {
            return (Class) this.f152952a;
        }
        return this.f152952a.getClass();
    }

    private Reflect(Object obj) {
        this.f152952a = obj;
    }

    /* renamed from: a */
    public static Reflect m237492a(Object obj) {
        return new Reflect(obj);
    }

    /* renamed from: a */
    public Reflect mo211284a(String str) throws ReflectException {
        return mo211285a(str, (Class<?>[]) null, new Object[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.f152952a.equals(((Reflect) obj).mo211286a());
        }
        return false;
    }

    /* renamed from: a */
    public static Class<?> m237494a(Class<?> cls) {
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
    public static <T extends AccessibleObject> T m237495a(T t) {
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

    /* renamed from: a */
    private Method m237496a(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> b = mo211287b();
        Method[] methods = b.getMethods();
        for (Method method : methods) {
            if (m237497a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            Method[] declaredMethods = b.getDeclaredMethods();
            for (Method method2 : declaredMethods) {
                if (m237497a(method2, str, clsArr)) {
                    return method2;
                }
            }
            b = b.getSuperclass();
        } while (b != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + mo211287b() + ".");
    }

    /* renamed from: a */
    private boolean m237498a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C61072a.class && !m237494a(clsArr[i]).isAssignableFrom(m237494a(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m237497a(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !m237498a(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Reflect m237493a(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            m237495a((AccessibleObject) method);
            if (method.getReturnType() != Void.TYPE) {
                return m237492a(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m237492a(obj);
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
        r2 = mo211287b();
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
    public java.lang.reflect.Method mo211288b(java.lang.String r17, java.lang.Class<?>[] r18, java.lang.Object... r19) throws java.lang.NoSuchMethodException {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.utils.Reflect.mo211288b(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.ss.android.vc.irtc.utils.Reflect] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return m237493a(m237496a(r3, r4), r2.f152952a, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.ss.android.vc.irtc.utils.Reflect.ReflectException(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.vc.irtc.utils.Reflect mo211285a(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) throws com.ss.android.vc.irtc.utils.Reflect.ReflectException {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.mo211288b(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r2.f152952a     // Catch:{ NoSuchMethodException -> 0x000b }
            com.ss.android.vc.irtc.utils.Reflect r3 = m237493a(r0, r1, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r3
        L_0x000b:
            java.lang.reflect.Method r3 = r2.m237496a(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r4 = r2.f152952a     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.ss.android.vc.irtc.utils.Reflect r3 = m237493a(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r3
        L_0x0016:
            r3 = move-exception
            com.ss.android.vc.irtc.utils.Reflect$ReflectException r4 = new com.ss.android.vc.irtc.utils.Reflect$ReflectException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.irtc.utils.Reflect.mo211285a(java.lang.String, java.lang.Class[], java.lang.Object[]):com.ss.android.vc.irtc.utils.Reflect");
    }
}
