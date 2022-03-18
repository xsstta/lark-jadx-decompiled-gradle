package com.bytedance.news.common.service.manager;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.news.common.service.manager.d */
public class C20216d {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f49367a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Class, AbstractC20213a<?>> f49368b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Class, AbstractC20215c> f49369c = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static <T> T m73786b(Class<T> cls) {
        try {
            Object newInstance = Class.forName(String.format("%s__ServiceProxy", cls.getName())).newInstance();
            if (newInstance instanceof IServiceProxy) {
                return (T) ((IServiceProxy) newInstance).newInstance();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m73783a(Class<T> cls) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = f49367a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (cls) {
                T t2 = (T) concurrentHashMap.get(cls);
                if (t2 != null) {
                    return t2;
                }
                ConcurrentHashMap<Class, AbstractC20213a<?>> concurrentHashMap2 = f49368b;
                AbstractC20213a<?> aVar = concurrentHashMap2.get(cls);
                if (aVar != null) {
                    T t3 = (T) aVar.mo12813b();
                    concurrentHashMap2.remove(cls);
                    if (t3 != null) {
                        m73787b(cls, t3);
                        return t3;
                    }
                }
                T t4 = (T) C20214b.m73781a(cls);
                if (t4 != null) {
                    m73787b(cls, t4);
                    return t4;
                }
                t = (T) m73786b(cls);
                if (t != null) {
                    m73787b(cls, t);
                    return t;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <T> void m73784a(Class<T> cls, AbstractC20213a<T> aVar) {
        f49368b.put(cls, aVar);
    }

    /* renamed from: a */
    public static <T> void m73785a(Class<T> cls, T t) {
        f49367a.put(cls, t);
    }

    /* renamed from: b */
    private static <T> void m73787b(Class<T> cls, T t) {
        f49367a.put(cls, t);
        ConcurrentHashMap<Class, AbstractC20215c> concurrentHashMap = f49369c;
        AbstractC20215c cVar = concurrentHashMap.get(cls);
        if (cVar != null) {
            cVar.mo68404a(t);
            concurrentHashMap.remove(cls);
        }
    }
}
