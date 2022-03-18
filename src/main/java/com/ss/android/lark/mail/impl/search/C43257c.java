package com.ss.android.lark.mail.impl.search;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.mail.impl.search.c */
public class C43257c {

    /* renamed from: a */
    static ConcurrentHashMap<String, Long> f110060a = new ConcurrentHashMap<>();

    /* renamed from: b */
    static final Long f110061b = 20000L;

    /* renamed from: b */
    public static Integer m171870b(String str) {
        Long l;
        if (str == null || (l = f110060a.get(str)) == null) {
            return null;
        }
        return Integer.valueOf((int) (Long.valueOf(System.currentTimeMillis()).longValue() - l.longValue()));
    }

    /* renamed from: a */
    public static void m171869a(String str) {
        if (str != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator<Map.Entry<String, Long>> it = f110060a.entrySet().iterator();
            while (it.hasNext()) {
                if (currentTimeMillis - it.next().getValue().longValue() > f110061b.longValue()) {
                    it.remove();
                }
            }
            f110060a.put(str, Long.valueOf(currentTimeMillis));
        }
    }
}
