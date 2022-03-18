package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.internal.i */
public final class C23021i {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f56882a;

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f56883b;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m83501a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m83501a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m83501a(hashMap, hashMap2, Character.TYPE, Character.class);
        m83501a(hashMap, hashMap2, Double.TYPE, Double.class);
        m83501a(hashMap, hashMap2, Float.TYPE, Float.class);
        m83501a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m83501a(hashMap, hashMap2, Long.TYPE, Long.class);
        m83501a(hashMap, hashMap2, Short.TYPE, Short.class);
        m83501a(hashMap, hashMap2, Void.TYPE, Void.class);
        f56882a = Collections.unmodifiableMap(hashMap);
        f56883b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    public static boolean m83502a(Type type) {
        return f56882a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m83500a(Class<T> cls) {
        Class<T> cls2 = (Class<T>) f56882a.get(C22954a.m83316a(cls));
        return cls2 == null ? cls : cls2;
    }

    /* renamed from: a */
    private static void m83501a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
