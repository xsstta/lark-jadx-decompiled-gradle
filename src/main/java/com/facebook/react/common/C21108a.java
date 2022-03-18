package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.common.a */
public class C21108a {
    /* renamed from: a */
    public static <K, V> HashMap<K, V> m76727a() {
        return new HashMap<>();
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m76731b() {
        return m76727a();
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m76728a(K k, V v, K k2, V v2) {
        Map<K, V> b = m76731b();
        b.put(k, v);
        b.put(k2, v2);
        return b;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m76729a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> b = m76731b();
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        b.put(k4, v4);
        return b;
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m76730a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> b = m76731b();
        b.put(k, v);
        b.put(k2, v2);
        b.put(k3, v3);
        b.put(k4, v4);
        b.put(k5, v5);
        return b;
    }
}
