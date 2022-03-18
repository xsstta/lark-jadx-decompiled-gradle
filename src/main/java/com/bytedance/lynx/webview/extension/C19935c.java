package com.bytedance.lynx.webview.extension;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.lynx.webview.extension.c */
public class C19935c {

    /* renamed from: a */
    static final /* synthetic */ boolean f48702a = true;

    /* renamed from: b */
    private static final WeakHashMap<Object, String> f48703b = new WeakHashMap<>();

    private C19935c() {
    }

    /* renamed from: a */
    public static Set<String> m72697a() {
        HashSet hashSet;
        synchronized (C19935c.class) {
            hashSet = new HashSet();
            for (Map.Entry<Object, String> entry : f48703b.entrySet()) {
                hashSet.add(entry.getValue());
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public static void m72698a(Object obj, String str) {
        if (obj != null) {
            synchronized (C19935c.class) {
                f48703b.put(obj, str);
            }
        }
    }
}
