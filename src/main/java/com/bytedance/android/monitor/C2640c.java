package com.bytedance.android.monitor;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.monitor.c */
public class C2640c {

    /* renamed from: a */
    private static volatile C2640c f8375a;

    /* renamed from: b */
    private Map<String, Set<String>> f8376b = new ConcurrentHashMap();

    /* renamed from: b */
    public void mo11420b() {
        this.f8376b.clear();
    }

    private C2640c() {
    }

    /* renamed from: a */
    public static C2640c m11089a() {
        if (f8375a == null) {
            synchronized (C2640c.class) {
                if (f8375a == null) {
                    f8375a = new C2640c();
                }
            }
        }
        return f8375a;
    }

    /* renamed from: a */
    public void mo11417a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8376b.remove(str);
        }
    }

    /* renamed from: a */
    public void mo11418a(String str, List<String> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            Set<String> set = this.f8376b.get(str);
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                this.f8376b.put(str, set);
            }
            synchronized (this) {
                set.addAll(list);
            }
        }
    }

    /* renamed from: a */
    public boolean mo11419a(String str, String str2) {
        Set<String> set;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (set = this.f8376b.get(str)) == null) {
            return false;
        }
        if (set.contains("all")) {
            return true;
        }
        return set.contains(str2);
    }
}
