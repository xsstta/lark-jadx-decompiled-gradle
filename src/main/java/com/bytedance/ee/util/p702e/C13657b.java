package com.bytedance.ee.util.p702e;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.util.e.b */
public class C13657b {
    /* renamed from: a */
    public static <T> T m55418a(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: b */
    public static boolean m55423b(Collection collection) {
        return !m55421a(collection);
    }

    /* renamed from: c */
    public static int m55424c(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    /* renamed from: a */
    public static boolean m55421a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m55422a(Map map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> T m55419a(List<T> list, int i) {
        if (m55420a(i, list)) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m55420a(int i, Collection collection) {
        if (!m55421a(collection) && i >= 0 && i < collection.size()) {
            return true;
        }
        return false;
    }
}
