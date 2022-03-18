package com.facebook.react.modules.network;

import java.net.CookieHandler;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.JavaNetCookieJar;

/* renamed from: com.facebook.react.modules.network.c */
public class C21215c {
    @Nullable

    /* renamed from: a */
    private static CookieJar f51702a;
    @Nullable

    /* renamed from: b */
    private static AbstractC21214b f51703b;

    /* renamed from: b */
    private static CookieJar m76975b() {
        AbstractC21214b bVar = f51703b;
        if (bVar != null) {
            return bVar.createCookieJar();
        }
        return null;
    }

    /* renamed from: a */
    public static CookieJar m76972a() {
        if (f51702a == null) {
            f51702a = m76975b();
        }
        return f51702a;
    }

    /* renamed from: a */
    public static void m76974a(AbstractC21214b bVar) {
        f51703b = bVar;
    }

    /* renamed from: a */
    public static String m76971a(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            Cookie cookie = list.get(i);
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static CookieJar m76973a(CookieHandler cookieHandler) {
        if (m76972a() != null) {
            return m76972a();
        }
        return new JavaNetCookieJar(cookieHandler);
    }

    /* renamed from: a */
    public static String m76970a(CookieHandler cookieHandler, HttpUrl httpUrl) {
        return m76971a(m76973a(cookieHandler).loadForRequest(httpUrl));
    }
}
