package com.samskivert.mustache;

import com.samskivert.mustache.C27035d;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.samskivert.mustache.b */
public class C27028b extends AbstractC27017a {
    @Override // com.samskivert.mustache.C27035d.AbstractC27042c
    /* renamed from: a */
    public <K, V> Map<K, V> mo96166a() {
        return new ConcurrentHashMap();
    }

    /* renamed from: a */
    private Method m98256a(Method method) {
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return method;
    }

    @Override // com.samskivert.mustache.C27035d.AbstractC27042c, com.samskivert.mustache.AbstractC27017a
    /* renamed from: a */
    public C27035d.AbstractC27057r mo96153a(Object obj, String str) {
        C27035d.AbstractC27057r a = super.mo96153a(obj, str);
        if (a != null) {
            return a;
        }
        Class<?> cls = obj.getClass();
        final Method a2 = mo96165a(cls, str);
        if (a2 != null) {
            return new C27035d.AbstractC27057r() {
                /* class com.samskivert.mustache.C27028b.C270291 */

                @Override // com.samskivert.mustache.C27035d.AbstractC27057r
                /* renamed from: a */
                public Object mo96158a(Object obj, String str) throws Exception {
                    return a2.invoke(obj, new Object[0]);
                }
            };
        }
        final Field d = mo96169d(cls, str);
        if (d != null) {
            return new C27035d.AbstractC27057r() {
                /* class com.samskivert.mustache.C27028b.C270302 */

                @Override // com.samskivert.mustache.C27035d.AbstractC27057r
                /* renamed from: a */
                public Object mo96158a(Object obj, String str) throws Exception {
                    return d.get(obj);
                }
            };
        }
        final Method b = mo96167b(cls, str);
        if (b != null) {
            return new C27035d.AbstractC27057r() {
                /* class com.samskivert.mustache.C27028b.C270313 */

                @Override // com.samskivert.mustache.C27035d.AbstractC27057r
                /* renamed from: a */
                public Object mo96158a(Object obj, String str) throws Exception {
                    return b.invoke(obj, new Object[0]);
                }
            };
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Method mo96167b(Class<?> cls, String str) {
        LinkedHashSet<Class<?>> linkedHashSet = new LinkedHashSet();
        while (cls != null && cls != Object.class) {
            m98257a(linkedHashSet, cls, false);
            cls = cls.getSuperclass();
        }
        for (Class<?> cls2 : linkedHashSet) {
            Method c = mo96168c(cls2, str);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Field mo96169d(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            return declaredField;
        } catch (Exception unused) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == Object.class || superclass == null) {
                return null;
            }
            return mo96169d(cls.getSuperclass(), str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Method mo96165a(Class<?> cls, String str) {
        while (cls != null && cls != Object.class) {
            Method c = mo96168c(cls, str);
            if (c != null) {
                return c;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:4|5)|6|8|9|(2:11|12)|13|14|(2:18|19)(1:22)) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005c */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method mo96168c(java.lang.Class<?> r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samskivert.mustache.C27028b.mo96168c(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private void m98257a(Set<Class<?>> set, Class<?> cls, boolean z) {
        if (z) {
            set.add(cls);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            m98257a(set, cls2, true);
        }
    }
}
