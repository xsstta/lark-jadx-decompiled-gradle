package com.ss.android.lark.calendar.impl.features.common.dragger;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public class Reflect {

    /* renamed from: a */
    public final Object f78634a;

    /* renamed from: b */
    private final boolean f78635b;

    /* renamed from: com.ss.android.lark.calendar.impl.features.common.dragger.Reflect$a */
    public static class C31131a {
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
    public <T> T mo112742a() {
        return (T) this.f78634a;
    }

    public int hashCode() {
        return this.f78634a.hashCode();
    }

    public String toString() {
        return this.f78634a.toString();
    }

    /* renamed from: b */
    public Class<?> mo112745b() {
        if (this.f78635b) {
            return (Class) this.f78634a;
        }
        return this.f78634a.getClass();
    }

    private Reflect(Object obj) {
        this.f78634a = obj;
    }

    /* renamed from: a */
    public static Reflect m116206a(Object obj) {
        return new Reflect(obj);
    }

    /* renamed from: a */
    public Reflect mo112740a(String str) throws ReflectException {
        return mo112741a(str, (Class<?>[]) null, new Object[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.f78634a.equals(((Reflect) obj).mo112742a());
        }
        return false;
    }

    /* renamed from: a */
    public static Class<?> m116208a(Class<?> cls) {
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
    public static <T extends AccessibleObject> T m116209a(T t) {
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
    public Reflect mo112744b(String str, Class<?>... clsArr) throws ReflectException {
        try {
            return m116206a(m116212c(str, clsArr).get(this.f78634a));
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* renamed from: c */
    private Field m116212c(String str, Class<?>... clsArr) throws ReflectException {
        Class<?> b = mo112745b();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return b.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) m116209a((AccessibleObject) b.getDeclaredField(str));
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
                            return (Field) m116209a((AccessibleObject) field);
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
    private Method m116213d(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> b = mo112745b();
        Method[] methods = b.getMethods();
        for (Method method : methods) {
            if (m116210a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            Method[] declaredMethods = b.getDeclaredMethods();
            for (Method method2 : declaredMethods) {
                if (m116210a(method2, str, clsArr)) {
                    return method2;
                }
            }
            b = b.getSuperclass();
        } while (b != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + mo112745b() + ".");
    }

    /* renamed from: a */
    private boolean m116211a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C31131a.class && !m116208a(clsArr[i]).isAssignableFrom(m116208a(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public <T> T mo112743a(String str, Class<?>... clsArr) throws ReflectException {
        return (T) mo112744b(str, clsArr).mo112742a();
    }

    /* renamed from: a */
    private boolean m116210a(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !m116211a(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static Reflect m116207a(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            m116209a((AccessibleObject) method);
            if (method.getReturnType() != Void.TYPE) {
                return m116206a(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m116206a(obj);
        } catch (Exception e) {
            throw new ReflectException(e);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0009 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0004 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.reflect.Method] */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|24|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r11 = mo112745b().getMethods();
        r0 = r11.length;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r2 < r0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r3 = r11[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r9.equals(r3.getName()) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r4 = r3.getParameterTypes();
        r5 = r4.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r6 < r5) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r7 = r4[r6];
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        return r11.getDeclaredMethod(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r11 = r11.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r11 != null) goto L_0x0009;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method mo112746b(java.lang.String r9, java.lang.Class<?>[] r10, java.lang.Object... r11) throws java.lang.NoSuchMethodException {
        /*
            r8 = this;
            java.lang.Class r11 = r8.mo112745b()
            java.lang.reflect.Method r9 = r11.getMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x0009 }
            return r9
        L_0x0009:
            java.lang.reflect.Method r9 = r11.getDeclaredMethod(r9, r10)     // Catch:{ NoSuchMethodException -> 0x000e }
            return r9
        L_0x000e:
            java.lang.Class r11 = r11.getSuperclass()
            if (r11 != 0) goto L_0x0009
            java.lang.Class r11 = r8.mo112745b()
            java.lang.reflect.Method[] r11 = r11.getMethods()
            int r0 = r11.length
            r1 = 0
            r2 = 0
        L_0x001f:
            if (r2 >= r0) goto L_0x0044
            r3 = r11[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0041
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r5 = r4.length
            r6 = 0
        L_0x0033:
            if (r6 >= r5) goto L_0x003a
            r7 = r4[r6]
            int r6 = r6 + 1
            goto L_0x0033
        L_0x003a:
            if (r4 == 0) goto L_0x0041
            int r4 = r4.length
            int r5 = r10.length
            if (r4 != r5) goto L_0x0041
            return r3
        L_0x0041:
            int r2 = r2 + 1
            goto L_0x001f
        L_0x0044:
            java.lang.NoSuchMethodException r9 = new java.lang.NoSuchMethodException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.common.dragger.Reflect.mo112746b(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.ss.android.lark.calendar.impl.features.common.dragger.Reflect] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return m116207a(m116213d(r3, r4), r2.f78634a, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.ss.android.lark.calendar.impl.features.common.dragger.Reflect.ReflectException(r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.lark.calendar.impl.features.common.dragger.Reflect mo112741a(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) throws com.ss.android.lark.calendar.impl.features.common.dragger.Reflect.ReflectException {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.mo112746b(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r2.f78634a     // Catch:{ NoSuchMethodException -> 0x000b }
            com.ss.android.lark.calendar.impl.features.common.dragger.Reflect r3 = m116207a(r0, r1, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r3
        L_0x000b:
            java.lang.reflect.Method r3 = r2.m116213d(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r4 = r2.f78634a     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.ss.android.lark.calendar.impl.features.common.dragger.Reflect r3 = m116207a(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r3
        L_0x0016:
            r3 = move-exception
            com.ss.android.lark.calendar.impl.features.common.dragger.Reflect$ReflectException r4 = new com.ss.android.lark.calendar.impl.features.common.dragger.Reflect$ReflectException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.common.dragger.Reflect.mo112741a(java.lang.String, java.lang.Class[], java.lang.Object[]):com.ss.android.lark.calendar.impl.features.common.dragger.Reflect");
    }
}
