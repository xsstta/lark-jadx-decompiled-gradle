package com.ss.lark.android.passport.biz.base.p3209b;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.lark.android.passport.biz.base.b.a */
public class C64345a {

    /* renamed from: a */
    private static OkHttpClient f162598a;

    /* renamed from: a */
    public static synchronized OkHttpClient m252966a() {
        OkHttpClient okHttpClient;
        synchronized (C64345a.class) {
            if (f162598a == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.connectTimeout(15000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MICROSECONDS);
                f162598a = builder.build();
            }
            okHttpClient = f162598a;
        }
        return okHttpClient;
    }
}
