package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.b */
public final class C14082b implements Interceptor {
    /* renamed from: a */
    private Request m57010a(Request request) {
        if (request != null && !request.isResponseStreaming()) {
            return m57011b(request);
        }
        return request;
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor
    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        C20639k metrics = chain.metrics();
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        Request a = m57010a(chain.request());
        if (metrics != null) {
            metrics.f50294x.put("RequestVerifyInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
        }
        return chain.proceed(a);
    }

    /* renamed from: b */
    private Request m57011b(Request request) {
        try {
            String url = request.getUrl();
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            String tryAddRequestVertifyParams = NetworkParams.tryAddRequestVertifyParams(url, request.isAddCommonParam(), request.getBody());
            if (request.getMetrics() != null) {
                request.getMetrics().f50256B = SystemClock.uptimeMillis() - valueOf.longValue();
            }
            Request.C20591a newBuilder = request.newBuilder();
            newBuilder.mo69377a(tryAddRequestVertifyParams);
            return newBuilder.mo69380b();
        } catch (Throwable th) {
            th.printStackTrace();
            return request;
        }
    }
}
