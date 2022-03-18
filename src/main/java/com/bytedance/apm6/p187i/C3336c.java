package com.bytedance.apm6.p187i;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.apm6.i.c */
public class C3336c {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f10626a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Class, AbstractC3332a<?>> f10627b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Class, AbstractC3334b> f10628c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static <T> T m13901a(Class<T> cls) {
        T t = (T) f10626a.get(cls);
        if (t == null) {
            synchronized (C3336c.class) {
                ConcurrentHashMap<Class, AbstractC3332a<?>> concurrentHashMap = f10627b;
                AbstractC3332a<?> aVar = concurrentHashMap.get(cls);
                if (aVar != null) {
                    t = (T) aVar.mo13480b();
                    concurrentHashMap.remove(cls);
                    if (t != null) {
                        m13903a((Class) cls, (Object) t);
                        return t;
                    }
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <T> void m13902a(Class<T> cls, AbstractC3332a<T> aVar) {
        f10627b.put(cls, aVar);
    }

    /* renamed from: a */
    private static <T> void m13903a(Class<T> cls, T t) {
        f10626a.put(cls, t);
        ConcurrentHashMap<Class, AbstractC3334b> concurrentHashMap = f10628c;
        AbstractC3334b bVar = concurrentHashMap.get(cls);
        if (bVar != null) {
            bVar.mo13571a(t);
            concurrentHashMap.remove(cls);
        }
    }
}
