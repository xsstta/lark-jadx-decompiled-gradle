package com.bytedance.ee.eenet.httpclient;

import com.bytedance.ee.eenet.util.C12641a;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.eenet.httpclient.h */
public final class C12628h extends AbstractC12625f {
    @Override // com.bytedance.ee.eenet.httpclient.AbstractC12625f
    /* renamed from: a */
    public C12614a mo47928a() {
        OkHttpClient okHttpClient = this.f33827a;
        C12641a.m52415a(okHttpClient);
        return new C12614a(okHttpClient.newBuilder(), true);
    }

    @Override // com.bytedance.ee.eenet.httpclient.AbstractC12627g
    /* renamed from: b */
    public AbstractC12625f mo47924b(OkHttpClient okHttpClient) {
        return new C12628h(okHttpClient);
    }

    @Override // okhttp3.OkHttpClient, okhttp3.Call.Factory
    public Call newCall(Request request) {
        return super.newCall(request);
    }

    C12628h(OkHttpClient okHttpClient) {
        this.f33827a = okHttpClient.newBuilder().build();
    }
}
