package com.bytedance.ee.bear.document.offline.base;

import android.webkit.CookieManager;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ee.bear.document.offline.base.h */
public class C5913h implements CookieJar {

    /* renamed from: a */
    private CookieManager f16559a = CookieManager.getInstance();

    /* renamed from: b */
    private CookieJar f16560b;

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        return this.f16560b.loadForRequest(httpUrl);
    }

    public C5913h(CookieJar cookieJar) {
        this.f16560b = cookieJar;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.f16560b.saveFromResponse(httpUrl, list);
        String httpUrl2 = httpUrl.toString();
        for (Cookie cookie : list) {
            this.f16559a.setCookie(httpUrl2, cookie.toString());
        }
    }
}
