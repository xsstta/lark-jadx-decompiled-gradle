package com.ss.android.lark.passport.infra.base.network.fetch;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/fetch/OkHttpClientHelper;", "", "()V", "CONNECT_TIMEOUT", "", "READ_TIMEOUT", "WRITE_TIMEOUT", "mClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.b.a */
public final class OkHttpClientHelper {

    /* renamed from: a */
    public static final OkHttpClientHelper f123234a = new OkHttpClientHelper();

    /* renamed from: b */
    private static OkHttpClient f123235b;

    private OkHttpClientHelper() {
    }

    /* renamed from: a */
    public final synchronized OkHttpClient mo171315a() {
        if (f123235b == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(15000, TimeUnit.MILLISECONDS).readTimeout(30000, TimeUnit.MILLISECONDS).writeTimeout(30000, TimeUnit.MICROSECONDS);
            f123235b = builder.build();
        }
        return f123235b;
    }
}
