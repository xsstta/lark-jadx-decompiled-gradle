package com.bytedance.ee.bear.middleground.comment.export;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.middleground.comment.export.l */
public class C9225l {

    /* renamed from: a */
    private static Map<String, String> f24835a = new ConcurrentHashMap();

    /* renamed from: b */
    private static Map<String, String> f24836b = new ConcurrentHashMap();

    /* renamed from: a */
    public static String m38236a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f24836b.get(str);
    }

    /* renamed from: b */
    public static String m38238b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return f24835a.get(str);
    }

    /* renamed from: a */
    public static void m38237a(String str, String str2) {
        f24836b.put(str, str2);
    }

    /* renamed from: b */
    public static void m38239b(String str, String str2) {
        f24835a.put(str, str2);
    }
}
