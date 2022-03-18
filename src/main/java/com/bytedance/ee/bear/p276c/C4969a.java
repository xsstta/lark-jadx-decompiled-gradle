package com.bytedance.ee.bear.p276c;

import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ee.bear.c.a */
public class C4969a {

    /* renamed from: a */
    private static AbstractC4971a f14574a;

    /* renamed from: com.bytedance.ee.bear.c.a$a */
    public interface AbstractC4971a {
        CookieJar createCookieJar();
    }

    /* renamed from: a */
    public static CookieJar m20606a() {
        return m20607a(new CookieJar() {
            /* class com.bytedance.ee.bear.p276c.C4969a.C49701 */

            @Override // okhttp3.CookieJar
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                C13479a.m54758a("DocsCookieJarProvider", "not setup CookieJarFactory");
                return new ArrayList();
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                C13479a.m54758a("DocsCookieJarProvider", "not setup CookieJarFactory");
            }
        });
    }

    /* renamed from: a */
    public static void m20608a(AbstractC4971a aVar) {
        f14574a = aVar;
    }

    /* renamed from: a */
    private static CookieJar m20607a(CookieJar cookieJar) {
        AbstractC4971a aVar = f14574a;
        if (aVar != null) {
            return aVar.createCookieJar();
        }
        return cookieJar;
    }
}
