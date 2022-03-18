package com.bytedance.ee.eenet.httpclient;

import com.bytedance.ee.eenet.util.C12641a;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* renamed from: com.bytedance.ee.eenet.httpclient.a */
public class C12614a {

    /* renamed from: a */
    private OkHttpClient.Builder f33788a;

    /* renamed from: b */
    private Boolean f33789b;

    /* renamed from: a */
    public AbstractC12625f mo47919a() {
        if (this.f33789b.booleanValue()) {
            return C12617b.m52366c(this.f33788a);
        }
        return C12617b.m52356a(this.f33788a);
    }

    public C12614a(OkHttpClient.Builder builder) {
        this(builder, false);
    }

    /* renamed from: a */
    public C12614a mo47916a(CookieJar cookieJar) {
        this.f33788a.cookieJar(cookieJar);
        return this;
    }

    /* renamed from: b */
    public C12614a mo47921b(Interceptor interceptor) {
        this.f33788a.addNetworkInterceptor(interceptor);
        return this;
    }

    /* renamed from: a */
    public C12614a mo47917a(Dispatcher dispatcher) {
        this.f33788a.dispatcher(dispatcher);
        return this;
    }

    /* renamed from: a */
    public C12614a mo47918a(Interceptor interceptor) {
        this.f33788a.addInterceptor(interceptor);
        return this;
    }

    /* renamed from: a */
    public C12614a mo47915a(long j, TimeUnit timeUnit) {
        this.f33788a.connectTimeout(j, timeUnit);
        return this;
    }

    /* renamed from: b */
    public C12614a mo47920b(long j, TimeUnit timeUnit) {
        this.f33788a.readTimeout(j, timeUnit);
        return this;
    }

    /* renamed from: c */
    public C12614a mo47922c(long j, TimeUnit timeUnit) {
        this.f33788a.writeTimeout(j, timeUnit);
        return this;
    }

    public C12614a(OkHttpClient.Builder builder, Boolean bool) {
        this.f33789b = false;
        C12641a.m52415a(builder);
        this.f33788a = builder;
        this.f33789b = bool;
    }
}
