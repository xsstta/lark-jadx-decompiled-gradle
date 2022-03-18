package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import java.io.IOException;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.l */
public class C14052l implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Map<String, String> tryAddSecurityFactor = NetworkParams.tryAddSecurityFactor(request.url().toString(), request.headers().toMultimap());
        if (tryAddSecurityFactor == null) {
            return chain.proceed(request);
        }
        Request.Builder builder = new Request.Builder();
        builder.url(request.url());
        builder.method(request.method(), request.body());
        builder.tag(request.tag());
        Headers.Builder newBuilder = request.headers().newBuilder();
        for (Map.Entry<String, String> entry : tryAddSecurityFactor.entrySet()) {
            newBuilder.add(entry.getKey(), entry.getValue());
        }
        builder.headers(newBuilder.build());
        return chain.proceed(builder.build());
    }
}
