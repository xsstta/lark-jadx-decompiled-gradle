package com.ss.android.lark.http.okhttp;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.http.okhttp.b */
public class C38776b {

    /* renamed from: a */
    private static OkHttpClient f99710a;

    /* renamed from: a */
    public static synchronized OkHttpClient m153085a() {
        OkHttpClient okHttpClient;
        synchronized (C38776b.class) {
            if (f99710a == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.connectTimeout(15000, TimeUnit.MILLISECONDS).readTimeout(10000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MICROSECONDS);
                f99710a = builder.build();
            }
            okHttpClient = f99710a;
        }
        return okHttpClient;
    }
}
