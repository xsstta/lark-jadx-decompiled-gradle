package com.ss.android.lark.banner.p1391b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.banner.b.d */
public class C29466d<K, V> {

    /* renamed from: a */
    private Map<K, V> f73589a = new ConcurrentHashMap();

    /* renamed from: a */
    public V mo104342a(K k) {
        if (this.f73589a.containsKey(k)) {
            return this.f73589a.get(k);
        }
        return null;
    }

    /* renamed from: a */
    public void mo104343a(K k, V v) {
        this.f73589a.put(k, v);
    }
}
