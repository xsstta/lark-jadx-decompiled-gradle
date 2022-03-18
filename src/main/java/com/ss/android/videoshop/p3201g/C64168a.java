package com.ss.android.videoshop.p3201g;

import android.text.TextUtils;
import android.util.Pair;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.videoshop.g.a */
public class C64168a {

    /* renamed from: a */
    private static final LinkedHashMap<String, Pair<Long, Long>> f162106a = new LinkedHashMap<>(10, 0.75f, true);

    /* renamed from: b */
    private static final LinkedHashMap<String, Boolean> f162107b = new LinkedHashMap<>(10, 0.75f, true);

    /* renamed from: a */
    public static void m252174a(String str) {
        if (str != null) {
            LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = f162106a;
            synchronized (linkedHashMap) {
                linkedHashMap.remove(str);
            }
            LinkedHashMap<String, Boolean> linkedHashMap2 = f162107b;
            synchronized (linkedHashMap2) {
                linkedHashMap2.remove(str);
            }
        }
    }

    /* renamed from: c */
    private static boolean m252177c(String str) {
        if (!TextUtils.isEmpty(str) && System.currentTimeMillis() - m252176b(str).longValue() <= 300000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static Long m252176b(String str) {
        Long valueOf;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = f162106a;
        synchronized (linkedHashMap) {
            Pair<Long, Long> pair = linkedHashMap.get(str);
            if (!(pair == null || pair.second == null)) {
                j = ((Long) pair.second).longValue();
            }
            valueOf = Long.valueOf(j);
        }
        return valueOf;
    }

    /* renamed from: a */
    public static Long m252173a(String str, boolean z) {
        Long l = null;
        if (str == null) {
            return null;
        }
        if (z && !m252177c(str)) {
            return -1L;
        }
        LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = f162106a;
        synchronized (linkedHashMap) {
            Pair<Long, Long> pair = linkedHashMap.get(str);
            if (!(pair == null || pair.first == null)) {
                l = Long.valueOf(((Long) pair.first).longValue());
            }
        }
        return l;
    }

    /* renamed from: a */
    public static void m252175a(String str, long j, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            long j2 = 0;
            if (j > 0) {
                LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = f162106a;
                synchronized (linkedHashMap) {
                    Long valueOf = Long.valueOf(j);
                    if (z) {
                        j2 = System.currentTimeMillis();
                    }
                    linkedHashMap.put(str, new Pair<>(valueOf, Long.valueOf(j2)));
                    linkedHashMap.get(str);
                    if (linkedHashMap.size() > 10) {
                        Iterator<Map.Entry<String, Pair<Long, Long>>> it = linkedHashMap.entrySet().iterator();
                        it.next();
                        it.remove();
                    }
                }
            }
        }
    }
}
