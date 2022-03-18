package com.franmontiel.persistentcookiejar;

import com.franmontiel.persistentcookiejar.cache.CookieCache;
import com.franmontiel.persistentcookiejar.persistence.CookiePersistor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

public class PersistentCookieJar implements ClearableCookieJar {

    /* renamed from: a */
    private CookieCache f51814a;

    /* renamed from: b */
    private CookiePersistor f51815b;

    @Override // com.franmontiel.persistentcookiejar.ClearableCookieJar
    /* renamed from: a */
    public synchronized void mo72355a() {
        this.f51814a.mo72356a();
        this.f51815b.mo72368b();
    }

    /* renamed from: a */
    private static boolean m77101a(Cookie cookie) {
        if (cookie.expiresAt() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static List<Cookie> m77100a(List<Cookie> list) {
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : list) {
            if (cookie.persistent()) {
                arrayList.add(cookie);
            }
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        Iterator it = this.f51814a.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            if (m77101a(cookie)) {
                arrayList2.add(cookie);
                it.remove();
            } else if (cookie.matches(httpUrl)) {
                arrayList.add(cookie);
            }
        }
        this.f51815b.mo72369b(arrayList2);
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.f51814a.mo72357a(list);
        this.f51815b.mo72367a(m77100a(list));
    }
}
