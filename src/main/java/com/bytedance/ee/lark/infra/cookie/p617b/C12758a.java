package com.bytedance.ee.lark.infra.cookie.p617b;

import android.webkit.CookieManager;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.cookie.AppCookiePersistentWrapper;
import com.bytedance.ee.lark.infra.cookie.p620e.C12768c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ee.lark.infra.cookie.b.a */
public class C12758a implements CookieJar {

    /* renamed from: a */
    private AppCookiePersistentWrapper f34133a;

    @Override // okhttp3.CookieJar
    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        if (this.f34133a.mo48281c() == null) {
            AppBrandLogger.m52829e("CookiePersistent", "loadForRequest->context is null!");
            return new ArrayList();
        }
        AppBrandLogger.m52828d("CookiePersistent", "loadForRequest:url->", httpUrl);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("loadForRequest:");
        String str = AppCookieJarMgr.m52758b().get();
        HashSet hashSet = new HashSet();
        if (str != null) {
            for (String str2 : str.split(";")) {
                Cookie parse = Cookie.parse(httpUrl, str2);
                if (parse != null) {
                    sb.append(parse.name());
                    sb.append(" from request");
                    sb.append(";");
                    arrayList.add(parse);
                    hashSet.add(parse.name().trim());
                }
            }
        }
        arrayList.addAll(this.f34133a.mo48276a(httpUrl, hashSet, sb));
        AppBrandLogger.m52828d("CookiePersistent", "loadForRequest validCookies", arrayList);
        AppBrandLogger.m52830i("CookiePersistent", sb.toString());
        return arrayList;
    }

    public C12758a(IAppContext iAppContext, IMonitorCreator iMonitorCreator) {
        AppCookiePersistentWrapper bVar = new AppCookiePersistentWrapper(iAppContext);
        this.f34133a = bVar;
        bVar.mo48277a(iMonitorCreator);
        this.f34133a.mo48275a();
    }

    @Override // okhttp3.CookieJar
    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (this.f34133a.mo48281c() == null) {
            AppBrandLogger.m52829e("CookiePersistent", "saveFromResponse->context is null!");
            return;
        }
        AppBrandLogger.m52828d("CookiePersistent", "saveFromResponse:url->", httpUrl);
        this.f34133a.mo48278a(list);
        boolean a = C12768c.m52791a().mo48291a(httpUrl.toString());
        boolean b = C12768c.m52791a().mo48293b(httpUrl.toString());
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
        AppBrandLogger.m52830i("CookiePersistent", sb.toString());
    }
}
