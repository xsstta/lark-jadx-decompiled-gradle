package com.bytedance.ee.bear.wiki.common.p579a;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.wiki.common.a.a */
public final class C11929a {

    /* renamed from: a */
    private static final Map<String, List<C11930a>> f32254a = new ConcurrentHashMap();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wiki.common.a.a$a */
    public static class C11930a {

        /* renamed from: a */
        public final String f32255a;

        /* renamed from: b */
        public final long f32256b;

        /* renamed from: a */
        static C11930a m49465a() {
            return new C11930a("start", SystemClock.uptimeMillis());
        }

        /* renamed from: b */
        static C11930a m49466b() {
            return new C11930a("stop", SystemClock.uptimeMillis());
        }

        private C11930a(String str, long j) {
            this.f32255a = str;
            this.f32256b = j;
        }
    }

    /* renamed from: c */
    public static long m49463c(String str) {
        m49462b(str);
        long d = m49464d(str);
        f32254a.remove(str);
        return d;
    }

    /* renamed from: a */
    public static void m49461a(String str) {
        Map<String, List<C11930a>> map = f32254a;
        List<C11930a> list = map.get(str);
        if (list == null) {
            list = Collections.synchronizedList(new ArrayList(2));
            map.put(str, list);
        }
        list.add(C11930a.m49465a());
    }

    /* renamed from: b */
    public static void m49462b(String str) {
        List<C11930a> list = f32254a.get(str);
        if (list != null) {
            list.add(C11930a.m49466b());
        }
    }

    /* renamed from: d */
    private static long m49464d(String str) {
        C11930a aVar;
        List<C11930a> list = f32254a.get(str);
        long j = 0;
        if (list == null) {
            return 0;
        }
        loop0:
        while (true) {
            aVar = null;
            for (C11930a aVar2 : list) {
                if (TextUtils.equals(aVar2.f32255a, "start")) {
                    aVar = aVar2;
                } else if (TextUtils.equals(aVar2.f32255a, "stop") && aVar != null) {
                    j += aVar2.f32256b - aVar.f32256b;
                }
            }
            break loop0;
        }
        if (aVar != null) {
            return j + (SystemClock.uptimeMillis() - aVar.f32256b);
        }
        return j;
    }
}
