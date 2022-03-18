package com.bytedance.ee.lark.infra.network.p622a.p623a.p624a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.lark.infra.network.a.a.a.a */
public abstract class AbstractC12795a implements AbstractC12796b {
    @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
    /* renamed from: a */
    public void mo48353a(Response response) {
        AppBrandLogger.m52828d("AbstractDownloadListener", response.toString());
    }

    @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
    /* renamed from: a */
    public void mo48352a(String str, Throwable th) {
        AppBrandLogger.m52828d("AbstractDownloadListener", str, th.toString());
    }

    @Override // com.bytedance.ee.lark.infra.network.p622a.p623a.p624a.AbstractC12796b
    /* renamed from: a */
    public void mo48351a(int i, long j, long j2) {
        AppBrandLogger.m52828d("AbstractDownloadListener", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2));
    }
}
