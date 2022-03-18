package com.bytedance.ee.lark.infra.cookie.p617b;

import android.content.Context;
import android.webkit.CookieManager;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.cookie.p616a.AbstractC12754a;
import com.bytedance.ee.lark.infra.cookie.p616a.C12756c;
import com.bytedance.ee.lark.infra.cookie.p620e.C12768c;
import com.bytedance.ee.lark.infra.cookie.persistence.AbstractC12770a;
import com.bytedance.ee.lark.infra.cookie.persistence.C12772c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12788f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ee.lark.infra.cookie.b.b */
public class C12759b implements CookieJar {

    /* renamed from: a */
    private AbstractC12754a f34134a = new C12756c();

    /* renamed from: b */
    private AbstractC12770a f34135b;

    /* renamed from: c */
    private boolean f34136c;

    /* renamed from: d */
    private Context f34137d;

    /* renamed from: a */
    private void m52771a() {
        if (!this.f34136c && this.f34135b != null) {
            AppBrandLogger.m52830i("WebViewCookieHandler", "load persist");
            List<Cookie> a = this.f34135b.mo48275a();
            if (a != null && a.size() > 0) {
                this.f34136c = true;
                this.f34134a.mo48266a(a);
            }
        }
    }

    /* renamed from: a */
    private static boolean m52772a(Cookie cookie) {
        if (cookie.expiresAt() < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public C12759b(Context context) {
        if (context != null) {
            this.f34135b = new C12772c(context);
            this.f34137d = context.getApplicationContext();
        }
        m52771a();
    }

    /* renamed from: a */
    private static List<Cookie> m52770a(List<Cookie> list) {
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
        if (this.f34137d == null) {
            AppBrandLogger.m52828d("WebViewCookieHandler", "loadForRequest context null ,url is:", httpUrl);
            return new ArrayList();
        }
        AppBrandLogger.m52828d("WebViewCookieHandler", "loadForRequest ", httpUrl);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m52771a();
        StringBuilder sb = new StringBuilder("loadForRequest:");
        String str = AppCookieJarMgr.m52758b().get();
        HashSet hashSet = new HashSet();
        if (str != null) {
            for (String str2 : str.split(";")) {
                Cookie parse = Cookie.parse(httpUrl, str2);
                if (parse != null) {
                    sb.append(parse.name());
                    sb.append("from request");
                    sb.append(";");
                    arrayList2.add(parse);
                    hashSet.add(parse.name().trim());
                }
            }
        }
        Iterator it = this.f34134a.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            if (m52772a(cookie)) {
                arrayList.add(cookie);
                it.remove();
            } else if (cookie.matches(httpUrl)) {
                AppBrandLogger.m52828d("WebViewCookieHandler", "loadForRequest currentCookie ", cookie);
                AppBrandLogger.m52828d("WebViewCookieHandler", "loadForRequest getCookie ", CookieManager.getInstance().getCookie(httpUrl.toString()));
                sb.append(cookie.name());
                sb.append("from cache");
                sb.append(";");
                if (hashSet.contains(cookie.name().trim())) {
                    sb.append(cookie.name());
                    sb.append(" already in userCookieKey,so not load it");
                    sb.append(";");
                } else {
                    arrayList2.add(cookie);
                }
            }
        }
        AbstractC12770a aVar = this.f34135b;
        if (aVar != null) {
            aVar.mo48280b(arrayList);
        }
        AppBrandLogger.m52828d("WebViewCookieHandler", "loadForRequest validCookies", arrayList2);
        AppBrandLogger.m52830i("WebViewCookieHandler", sb.toString());
        return arrayList2;
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        Context context = this.f34137d;
        if (context != null) {
            if (!C12788f.m52854a(context)) {
                AppBrandLogger.m52828d("WebViewCookieHandler", "saveFromResponse ", httpUrl);
                boolean a = C12768c.m52791a().mo48291a(httpUrl.toString());
                boolean b = C12768c.m52791a().mo48293b(httpUrl.toString());
                this.f34134a.mo48266a(list);
                AbstractC12770a aVar = this.f34135b;
                if (aVar != null) {
                    aVar.mo48278a(m52770a(list));
                }
                if (a || b) {
                    CookieManager instance = CookieManager.getInstance();
                    for (Cookie cookie : list) {
                        instance.setCookie(httpUrl.toString(), cookie.toString());
                    }
                    CookieManager.getInstance().flush();
                }
                StringBuilder sb = new StringBuilder("saveFromResponse ");
                for (Cookie cookie2 : list) {
                    sb.append("cookie key:");
                    sb.append(cookie2.name());
                    sb.append(" domain:");
                    sb.append(cookie2.domain());
                    sb.append(" path:");
                    sb.append(cookie2.path());
                    sb.append(";");
                }
                AppBrandLogger.m52830i("WebViewCookieHandler", sb.toString());
                return;
            }
        }
        AppBrandLogger.m52829e("WebViewCookieHandler", "saveFromResponse context null or main process, url is:", httpUrl);
    }
}
