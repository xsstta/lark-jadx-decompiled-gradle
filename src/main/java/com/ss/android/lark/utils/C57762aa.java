package com.ss.android.lark.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.utils.aa */
public class C57762aa {

    /* renamed from: a */
    private Map<Class<?>, Object> f142274a = new ConcurrentHashMap();

    /* renamed from: com.ss.android.lark.utils.aa$a */
    public interface AbstractC57763a<T> {
        /* renamed from: b */
        T mo133374b(Class<T> cls);
    }

    /* renamed from: a */
    public <T> T mo196049a(Class<T> cls, AbstractC57763a<T> aVar) {
        T t = (T) this.f142274a.get(cls);
        if (t == null) {
            synchronized (this) {
                if (t == null) {
                    if (aVar == null) {
                        return null;
                    }
                    T b = aVar.mo133374b(cls);
                    if (b != null) {
                        this.f142274a.put(cls, b);
                    }
                    t = b;
                }
            }
        }
        return t;
    }
}
