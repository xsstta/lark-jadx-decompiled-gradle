package com.larksuite.framework.http.p1190e;

import android.content.Context;
import com.franmontiel.persistentcookiejar.ClearableCookieJar;
import com.franmontiel.persistentcookiejar.cache.CookieCache;
import com.franmontiel.persistentcookiejar.persistence.CookiePersistor;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

/* renamed from: com.larksuite.framework.http.e.a */
public class C26001a implements ClearableCookieJar {

    /* renamed from: a */
    boolean f64359a;

    /* renamed from: b */
    private Context f64360b;

    /* renamed from: c */
    private CookieCache f64361c;

    /* renamed from: d */
    private CookiePersistor f64362d;

    @Override // com.franmontiel.persistentcookiejar.ClearableCookieJar
    /* renamed from: a */
    public synchronized void mo72355a() {
        this.f64361c.mo72356a();
        this.f64362d.mo72368b();
        Log.m165389i("PersistentCookieJar", "clear process:" + C26252ad.m94992a(this.f64360b));
    }

    /* renamed from: a */
    private static List<Cookie> m94109a(List<Cookie> list) {
        ArrayList arrayList = new ArrayList();
        for (Cookie cookie : list) {
            if (cookie.persistent()) {
                arrayList.add(cookie);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m94111a(boolean z) {
        if (!this.f64359a) {
            List<Cookie> a = this.f64362d.mo72366a();
            if (a == null || a.size() <= 0) {
                Log.m165389i("PersistentCookieJar", "ensureLoaded failed");
                return;
            }
            this.f64359a = true;
            this.f64361c.mo72357a(a);
            Log.m165388i("PersistentCookieJar ensureLoaded process:" + C26252ad.m94992a(this.f64360b));
        }
    }

    /* renamed from: a */
    private static boolean m94112a(Cookie cookie) {
        if (cookie.expiresAt() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        m94111a(false);
        Iterator it = this.f64361c.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            if (m94112a(cookie)) {
                arrayList2.add(cookie);
                it.remove();
                m94110a(httpUrl, cookie, "PersistentCookieJar expiredcookie loadForRequest");
            } else if (cookie.matches(httpUrl)) {
                arrayList.add(cookie);
            }
        }
        this.f64362d.mo72369b(arrayList2);
        httpUrl.host();
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        this.f64361c.mo72357a(list);
        this.f64362d.mo72367a(m94109a(list));
        httpUrl.host();
    }

    public C26001a(Context context, CookieCache cookieCache, CookiePersistor cookiePersistor) {
        this.f64360b = context;
        this.f64361c = cookieCache;
        this.f64362d = cookiePersistor;
    }

    /* renamed from: a */
    private void m94110a(HttpUrl httpUrl, Cookie cookie, String str) {
        try {
            Log.m165389i(str, httpUrl.toString());
        } catch (Throwable th) {
            Log.m165386e("logCookie", th);
        }
    }
}
