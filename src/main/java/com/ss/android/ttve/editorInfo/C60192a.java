package com.ss.android.ttve.editorInfo;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ttve.editorInfo.a */
public class C60192a {

    /* renamed from: a */
    private static final String f150236a = "a";

    /* renamed from: b */
    private static ConcurrentHashMap<String, Object> f150237b;

    /* renamed from: a */
    public static void m233967a() {
        TEEditorInfoInvoker.nativeInit();
        f150237b = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public static void m233970a(String str, String str2) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f150237b;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m233968a(String str, float f) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f150237b;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public static void m233969a(String str, long j) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f150237b;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public static void m233971a(String str, HashMap hashMap) {
        ConcurrentHashMap<String, Object> concurrentHashMap = f150237b;
        if (concurrentHashMap != null) {
            concurrentHashMap.put(str, hashMap);
        }
    }
}
