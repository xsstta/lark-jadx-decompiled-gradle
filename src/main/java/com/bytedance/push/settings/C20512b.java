package com.bytedance.push.settings;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.b */
public class C20512b {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f50059a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static <T> T m74707a(Class<T> cls, AbstractC20513c cVar) {
        ConcurrentHashMap<Class, Object> concurrentHashMap = f50059a;
        T t = (T) concurrentHashMap.get(cls);
        if (t == null) {
            synchronized (C20512b.class) {
                t = concurrentHashMap.get(cls);
                if (t == null) {
                    Object a = cVar.mo69011a(cls);
                    if (a != null) {
                        concurrentHashMap.put(cls, a);
                    }
                    t = (T) a;
                }
            }
        }
        return t;
    }
}
