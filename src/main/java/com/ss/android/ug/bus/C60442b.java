package com.ss.android.ug.bus;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ug.bus.b */
public class C60442b {

    /* renamed from: a */
    private static Map<Class, AbstractC60436a> f151025a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T extends AbstractC60436a> T m234863a(Class<T> cls) {
        return (T) f151025a.get(cls);
    }

    /* renamed from: a */
    public static <T extends AbstractC60436a> void m234864a(Class<T> cls, AbstractC60436a aVar) {
        if (aVar != null) {
            f151025a.put(cls, aVar);
        }
    }
}
