package com.larksuite.framework.http.p1191f;

import okhttp3.HttpUrl;

/* renamed from: com.larksuite.framework.http.f.c */
public class C26005c {
    /* renamed from: a */
    public static String m94126a(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        if (parse == null) {
            return null;
        }
        return parse.topPrivateDomain();
    }

    /* renamed from: b */
    public static String m94127b(String str) {
        return HttpUrl.parse(str).host();
    }
}
