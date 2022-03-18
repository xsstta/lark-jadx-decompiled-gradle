package com.ss.android.lark.inv.export.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.inv.export.util.i */
public class C40110i {

    /* renamed from: a */
    private static final Map<String, Long> f101946a = new ConcurrentHashMap(64);

    /* renamed from: a */
    private static void m159019a(long j) {
        Map<String, Long> map = f101946a;
        if (map.size() >= 64) {
            Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (j >= it.next().getValue().longValue()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m159020a(View view, long j) {
        return m159021a(String.valueOf(view.hashCode()), j);
    }

    /* renamed from: a */
    public static boolean m159021a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The key is null.");
        } else if (j >= 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            m159019a(elapsedRealtime);
            Map<String, Long> map = f101946a;
            Long l = map.get(str);
            if (l != null && elapsedRealtime < l.longValue()) {
                return false;
            }
            map.put(str, Long.valueOf(elapsedRealtime + j));
            return true;
        } else {
            throw new IllegalArgumentException("The duration is less than 0.");
        }
    }
}
