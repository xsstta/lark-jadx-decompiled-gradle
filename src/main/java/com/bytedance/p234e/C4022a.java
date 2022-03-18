package com.bytedance.p234e;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.e.a */
public class C4022a {

    /* renamed from: a */
    public static String f12191a = "cn-north-1";

    /* renamed from: b */
    public static String f12192b = "us-east-1";

    /* renamed from: c */
    public static String f12193c = "ap-singapore-1";

    /* renamed from: d */
    private static String f12194d = "/vod/settings/v1";

    /* renamed from: e */
    private static String f12195e;

    /* renamed from: f */
    private static String f12196f;

    /* renamed from: g */
    private static String f12197g;

    /* renamed from: h */
    private static String f12198h;

    /* renamed from: i */
    private static Map<String, Object> f12199i;

    /* renamed from: j */
    private static Map<String, Object> f12200j;

    /* renamed from: c */
    public static String m16710c() {
        return f12198h;
    }

    /* renamed from: d */
    public static String m16713d() {
        return f12194d;
    }

    /* renamed from: a */
    public static Map<String, String> m16705a() {
        return m16711c(f12199i);
    }

    /* renamed from: b */
    public static Map<String, String> m16708b() {
        return m16711c(f12200j);
    }

    /* renamed from: a */
    public static Class<C4022a> m16703a(String str) {
        f12198h = str;
        return C4022a.class;
    }

    /* renamed from: b */
    public static Class<C4022a> m16706b(String str) {
        f12195e = str;
        return C4022a.class;
    }

    /* renamed from: c */
    public static Class<C4022a> m16709c(String str) {
        f12196f = str;
        return C4022a.class;
    }

    /* renamed from: d */
    public static Class<C4022a> m16712d(String str) {
        f12197g = str;
        return C4022a.class;
    }

    /* renamed from: a */
    public static Class<C4022a> m16704a(Map<String, Object> map) {
        f12199i = map;
        return C4022a.class;
    }

    /* renamed from: b */
    public static Class<C4022a> m16707b(Map<String, Object> map) {
        f12200j = map;
        return C4022a.class;
    }

    /* renamed from: c */
    private static Map<String, String> m16711c(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    /* renamed from: e */
    static String m16714e(String str) {
        if (TextUtils.isEmpty(str)) {
            C4027d.m16728b("ConfigEnv", "region is null");
            return null;
        }
        String str2 = f12197g;
        if (str.equals(f12192b)) {
            return f12195e;
        }
        if (str.equals(f12193c)) {
            return f12196f;
        }
        if (str.equals(f12191a)) {
            return f12197g;
        }
        return str2;
    }
}
