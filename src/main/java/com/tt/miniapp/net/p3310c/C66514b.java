package com.tt.miniapp.net.p3310c;

import com.tt.miniapp.dec.BrotliInputStream;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.AbstractC69723u;
import okio.C69703i;
import okio.C69705k;

/* renamed from: com.tt.miniapp.net.c.b */
public class C66514b implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        newBuilder.addHeader("Accept-Encoding", "br, gzip");
        Response proceed = chain.proceed(newBuilder.build());
        Response.Builder request2 = proceed.newBuilder().request(request);
        String header = proceed.header("Content-Encoding");
        String header2 = proceed.header("Content-Type");
        if ("br".equalsIgnoreCase(header) && HttpHeaders.hasBody(proceed)) {
            AbstractC69723u a = C69705k.m267596a(new BrotliInputStream(proceed.body().source().inputStream()));
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(header2, -1, C69705k.m267590a(a)));
        } else if ("gzip".equalsIgnoreCase(header) && HttpHeaders.hasBody(proceed)) {
            C69703i iVar = new C69703i(proceed.body().source());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(header2, -1, C69705k.m267590a(iVar)));
        }
        return request2.build();
    }
}
