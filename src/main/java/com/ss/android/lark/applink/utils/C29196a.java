package com.ss.android.lark.applink.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.applink.utils.a */
public final class C29196a {

    /* renamed from: a */
    public static final List<String> f73070a = Arrays.asList("applink.feishu.cn", "applink.larksuite.com");

    /* renamed from: b */
    private static final List<String> f73071b = Arrays.asList("https", "lark");

    /* renamed from: c */
    private static final Map<String, Boolean> f73072c;

    /* renamed from: a */
    public static Map<String, Boolean> m107348a() {
        return f73072c;
    }

    static {
        HashMap hashMap = new HashMap();
        f73072c = hashMap;
        hashMap.put("applink.compatibility.version", true);
        hashMap.put("lark.applink.shortlink", false);
    }

    /* renamed from: a */
    public static boolean m107349a(String str) {
        if ("feishu".equals(str) || f73071b.contains(str)) {
            return true;
        }
        return false;
    }
}
