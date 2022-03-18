package com.larksuite.framework.utils;

import android.util.LruCache;

public class am<T> {

    /* renamed from: a */
    private final LruCache<String, T> f64853a;

    /* renamed from: a */
    public void mo93368a() {
        this.f64853a.evictAll();
    }

    public am(int i) {
        this.f64853a = new LruCache<>(i);
    }

    /* renamed from: b */
    private String m95032b(String str, String str2) {
        return str + "-" + str2;
    }

    /* renamed from: a */
    public T mo93367a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        return this.f64853a.get(m95032b(str, str2));
    }

    /* renamed from: a */
    public void mo93369a(String str, String str2, T t) {
        if (str != null && str2 != null && t != null) {
            this.f64853a.put(m95032b(str, str2), t);
        }
    }
}
