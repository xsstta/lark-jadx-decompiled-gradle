package com.tt.miniapp.net.p3310c;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.dec.BrotliInputStream;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.AbstractC69723u;
import okio.C69705k;

/* renamed from: com.tt.miniapp.net.c.a */
public class C66513a implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        Response proceed = chain.proceed(newBuilder.build());
        Response.Builder request2 = proceed.newBuilder().request(request);
        String header = proceed.header("Content-Type");
        if ("br".equalsIgnoreCase(proceed.header("Content-Encoding")) && HttpHeaders.hasBody(proceed)) {
            newBuilder.removeHeader("Accept-Encoding");
            newBuilder.addHeader("Accept-Encoding", "identity");
            AppBrandLogger.m52830i("tma_BrPkgResponseInterceptor", "use brotli to unCompress pkg");
            BrotliInputStream brotliInputStream = new BrotliInputStream(proceed.body().source().inputStream());
            brotliInputStream.setEager(true);
            AbstractC69723u a = C69705k.m267596a(brotliInputStream);
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(header, -1, C69705k.m267590a(a)));
        }
        return request2.build();
    }
}
