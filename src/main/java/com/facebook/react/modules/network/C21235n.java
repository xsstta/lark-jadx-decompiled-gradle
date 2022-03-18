package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.modules.network.n */
public class C21235n implements AbstractC21213a {

    /* renamed from: a */
    private CookieJar f51736a;

    @Override // com.facebook.react.modules.network.AbstractC21213a
    /* renamed from: a */
    public void mo72047a() {
        this.f51736a = null;
    }

    @Override // com.facebook.react.modules.network.AbstractC21213a
    /* renamed from: a */
    public void mo72048a(CookieJar cookieJar) {
        this.f51736a = cookieJar;
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        CookieJar cookieJar = this.f51736a;
        if (cookieJar == null) {
            return Collections.emptyList();
        }
        List<Cookie> loadForRequest = cookieJar.loadForRequest(httpUrl);
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : loadForRequest) {
            try {
                new Headers.Builder().add(cookie.name(), cookie.value());
                arrayList.add(cookie);
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        CookieJar cookieJar = this.f51736a;
        if (cookieJar != null) {
            cookieJar.saveFromResponse(httpUrl, list);
        }
    }
}
