package com.ss.android.lark.monitor;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC69699e;
import okio.AbstractC69701g;
import okio.AbstractC69723u;
import okio.C69694c;
import okio.C69705k;

public class OkHttpMonitorInterceptor implements Interceptor {

    /* renamed from: com.ss.android.lark.monitor.OkHttpMonitorInterceptor$a */
    interface AbstractC48204a {
        /* renamed from: a */
        void mo168677a(long j);
    }

    /* renamed from: com.ss.android.lark.monitor.OkHttpMonitorInterceptor$b */
    private class C48205b extends ResponseBody {

        /* renamed from: a */
        public long f121310a;

        /* renamed from: b */
        public AbstractC48204a f121311b;

        /* renamed from: d */
        private final ResponseBody f121313d;

        /* renamed from: e */
        private AbstractC69699e f121314e;

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.f121313d.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f121313d.contentType();
        }

        @Override // okhttp3.ResponseBody
        public AbstractC69699e source() {
            if (this.f121314e == null) {
                this.f121314e = C69705k.m267590a(m190242a(this.f121313d.source()));
            }
            return this.f121314e;
        }

        /* renamed from: a */
        private AbstractC69723u m190242a(AbstractC69723u uVar) {
            return new AbstractC69701g(uVar) {
                /* class com.ss.android.lark.monitor.OkHttpMonitorInterceptor.C48205b.C482061 */

                @Override // okio.AbstractC69701g, okio.AbstractC69723u, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    super.close();
                    if (C48205b.this.f121311b != null) {
                        C48205b.this.f121311b.mo168677a(C48205b.this.f121310a);
                    }
                }

                @Override // okio.AbstractC69701g, okio.AbstractC69723u
                public long read(C69694c cVar, long j) throws IOException {
                    long read = super.read(cVar, j);
                    if (read > 0) {
                        C48205b.this.f121310a += read;
                    }
                    return read;
                }
            };
        }

        public C48205b(Response response, AbstractC48204a aVar) {
            this.f121313d = response.body();
            this.f121311b = aVar;
        }
    }

    private long responseBytes(Response response) {
        if (response == null || !response.isSuccessful() || response.body() == null) {
            return 0;
        }
        return response.body().contentLength();
    }

    private long requestBytes(Request request) {
        RequestBody body;
        long j;
        if (request == null || request.url() == null) {
            return 0;
        }
        long length = (long) request.url().toString().getBytes().length;
        if (length <= 0 || (body = request.body()) == null) {
            return length;
        }
        try {
            j = body.contentLength();
        } catch (IOException unused) {
            j = 0;
        }
        return j <= 0 ? length : j;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        final String str;
        Request request = chain.request();
        final long requestBytes = requestBytes(request);
        try {
            Response proceed = chain.proceed(request);
            long responseBytes = responseBytes(proceed);
            if (request.url() != null) {
                str = request.url().host();
            } else {
                str = "unknown";
            }
            if (responseBytes <= 0 && proceed.body() != null) {
                return proceed.newBuilder().body(new C48205b(proceed, new AbstractC48204a() {
                    /* class com.ss.android.lark.monitor.OkHttpMonitorInterceptor.C482031 */

                    @Override // com.ss.android.lark.monitor.OkHttpMonitorInterceptor.AbstractC48204a
                    /* renamed from: a */
                    public void mo168677a(long j) {
                        LarkMetrics.m190223a().mo168672a(str, j, requestBytes);
                    }
                })).build();
            }
            LarkMetrics.m190223a().mo168672a(str, responseBytes, requestBytes);
            return proceed;
        } catch (IOException e) {
            throw e;
        }
    }
}
