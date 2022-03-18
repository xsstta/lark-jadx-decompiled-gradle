package com.bytedance.ee.lark.infra.cookie.p618c;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.cookie.AppCookieJarMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.lark.infra.cookie.c.a */
public class C12760a implements Interceptor {

    /* renamed from: a */
    private String f34142a;

    public C12760a(String str) {
        this.f34142a = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        boolean z = true;
        if (!TextUtils.isEmpty(this.f34142a)) {
            AppCookieJarMgr.m52758b().set(this.f34142a);
            AppBrandLogger.m52830i("CookieInterceptor", "cookieValue is not empty,save it,url:", request.url());
        } else {
            AppBrandLogger.m52830i("CookieInterceptor", "cookieValue empty,url:", request.url());
            z = false;
        }
        Response proceed = chain.proceed(chain.request());
        if (z) {
            AppCookieJarMgr.m52758b().remove();
        }
        return proceed;
    }
}
