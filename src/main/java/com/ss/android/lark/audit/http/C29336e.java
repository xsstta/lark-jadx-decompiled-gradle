package com.ss.android.lark.audit.http;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.lark.audit.http.e */
public class C29336e {

    /* renamed from: a */
    private static OkHttpClient f73378a;

    /* renamed from: a */
    public static synchronized OkHttpClient m107790a() {
        OkHttpClient okHttpClient;
        synchronized (C29336e.class) {
            if (f73378a == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.connectTimeout(10000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MICROSECONDS);
                f73378a = builder.build();
            }
            okHttpClient = f73378a;
        }
        return okHttpClient;
    }
}
