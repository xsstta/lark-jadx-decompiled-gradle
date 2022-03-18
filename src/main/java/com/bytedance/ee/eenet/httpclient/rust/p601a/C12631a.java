package com.bytedance.ee.eenet.httpclient.rust.p601a;

import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.io.IOException;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okio.C69703i;
import okio.C69705k;

/* renamed from: com.bytedance.ee.eenet.httpclient.rust.a.a */
public final class C12631a implements Interceptor {

    /* renamed from: a */
    private final CookieJar f33839a;

    public C12631a(CookieJar cookieJar) {
        this.f33839a = cookieJar;
    }

    /* renamed from: a */
    private String m52395a(List<Cookie> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            Cookie cookie = list.get(i);
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
        }
        return sb.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body = request.body();
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", Long.toString(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        boolean z = false;
        if (request.header("x-command") == null) {
            try {
                String path = request.url().url().getPath();
                for (String str : request.url().pathSegments()) {
                    if (!TextUtils.isEmpty(str) && str.length() >= 22) {
                        path = path.replace(str, "");
                    }
                }
                int indexOf = path.indexOf("?");
                if (indexOf >= 0) {
                    path = path.substring(0, indexOf);
                }
                newBuilder.header("x-command", path.replace("/", "."));
            } catch (Throwable th) {
                C13479a.m54759a("BridgeInterceptor", "add x-command error", th);
            }
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            z = true;
            newBuilder.header("Accept-Encoding", "gzip");
        }
        List<Cookie> loadForRequest = this.f33839a.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            newBuilder.header("Cookie", m52395a(loadForRequest));
        }
        Response proceed = chain.proceed(newBuilder.build());
        HttpHeaders.receiveHeaders(this.f33839a, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z && "gzip".equalsIgnoreCase(proceed.header("Content-Encoding")) && HttpHeaders.hasBody(proceed)) {
            C69703i iVar = new C69703i(proceed.body().source());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(proceed.header("Content-Type"), -1, C69705k.m267590a(iVar)));
        }
        return request2.build();
    }
}
