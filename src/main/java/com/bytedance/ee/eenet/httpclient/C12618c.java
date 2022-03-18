package com.bytedance.ee.eenet.httpclient;

import okhttp3.OkHttpClient;

/* renamed from: com.bytedance.ee.eenet.httpclient.c */
public final class C12618c extends AbstractC12625f {
    C12618c(AbstractC12625f fVar) {
        this.f33827a = fVar;
    }

    /* renamed from: a */
    public void mo47923a(OkHttpClient okHttpClient) {
        if (okHttpClient instanceof AbstractC12627g) {
            this.f33827a = okHttpClient;
            return;
        }
        throw new AssertionError("httpclient no instance of IOkHttpAttach");
    }

    @Override // com.bytedance.ee.eenet.httpclient.AbstractC12627g
    /* renamed from: b */
    public AbstractC12625f mo47924b(OkHttpClient okHttpClient) {
        return new C12618c(((AbstractC12627g) this.f33827a).mo47924b(okHttpClient));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    @Override // okhttp3.OkHttpClient, okhttp3.Call.Factory
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Call newCall(okhttp3.Request r7) {
        /*
            r6 = this;
            okhttp3.OkHttpClient r0 = r6.f33827a
            com.bytedance.ee.eenet.util.C12641a.m52415a(r0)
            com.bytedance.ee.eenet.a r1 = com.bytedance.ee.eenet.httpclient.C12617b.m52362b()
            com.bytedance.ee.eenet.util.HttpChannel r2 = com.bytedance.ee.eenet.httpclient.C12617b.m52367d()
            com.bytedance.ee.eenet.util.HttpChannel r3 = com.bytedance.ee.eenet.util.HttpChannel.OkHttpChannel
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0015
        L_0x0013:
            r4 = 1
            goto L_0x002f
        L_0x0015:
            com.bytedance.ee.eenet.util.HttpChannel r3 = com.bytedance.ee.eenet.util.HttpChannel.RustChannel
            if (r2 != r3) goto L_0x002f
            java.lang.String r2 = "eenet_EEOk3HttpClient"
            if (r1 != 0) goto L_0x0023
            java.lang.String r1 = "EEHttpDepend no set will force use ok3 httpclient"
            com.bytedance.ee.log.C13479a.m54775e(r2, r1)
            goto L_0x0013
        L_0x0023:
            boolean r1 = r1.mo23877a()
            if (r1 != 0) goto L_0x002f
            java.lang.String r1 = "rustSdk plugin no inited will force use ok3 httpclient"
            com.bytedance.ee.log.C13479a.m54775e(r2, r1)
            goto L_0x0013
        L_0x002f:
            if (r4 == 0) goto L_0x0046
            com.bytedance.ee.eenet.util.HttpChannel r1 = com.bytedance.ee.eenet.util.HttpChannel.OkHttpChannel
            boolean r1 = com.bytedance.ee.eenet.httpclient.C12617b.m52361a(r0, r1)
            if (r1 != 0) goto L_0x005a
            com.bytedance.ee.eenet.util.HttpChannel r1 = com.bytedance.ee.eenet.util.HttpChannel.OkHttpChannel
            com.bytedance.ee.eenet.httpclient.f r1 = com.bytedance.ee.eenet.httpclient.C12617b.m52363b(r1)
            com.bytedance.ee.eenet.httpclient.f r0 = r1.mo47924b(r0)
            r6.f33827a = r0
            goto L_0x005a
        L_0x0046:
            com.bytedance.ee.eenet.util.HttpChannel r1 = com.bytedance.ee.eenet.util.HttpChannel.RustChannel
            boolean r1 = com.bytedance.ee.eenet.httpclient.C12617b.m52361a(r0, r1)
            if (r1 != 0) goto L_0x005a
            com.bytedance.ee.eenet.util.HttpChannel r1 = com.bytedance.ee.eenet.util.HttpChannel.RustChannel
            com.bytedance.ee.eenet.httpclient.f r1 = com.bytedance.ee.eenet.httpclient.C12617b.m52363b(r1)
            com.bytedance.ee.eenet.httpclient.f r0 = r1.mo47924b(r0)
            r6.f33827a = r0
        L_0x005a:
            okhttp3.Call r7 = r0.newCall(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.eenet.httpclient.C12618c.newCall(okhttp3.Request):okhttp3.Call");
    }
}
