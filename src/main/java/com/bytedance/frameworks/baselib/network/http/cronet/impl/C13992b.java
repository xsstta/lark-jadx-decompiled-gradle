package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import com.bytedance.frameworks.baselib.network.http.C13982b;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.parser.StreamParser;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.IMetricsCollect;
import com.bytedance.retrofit2.IRequestInfo;
import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.b */
class C13992b implements IMetricsCollect, IRequestInfo, AbstractC20594b {

    /* renamed from: k */
    private static boolean f36639k = false;

    /* renamed from: l */
    private static final String f36640l = "b";

    /* renamed from: m */
    private static ICronetClient f36641m;

    /* renamed from: a */
    HttpURLConnection f36642a;

    /* renamed from: b */
    BaseHttpRequestInfo f36643b = BaseHttpRequestInfo.createHttpRequestInfo();

    /* renamed from: c */
    long f36644c;

    /* renamed from: d */
    String f36645d = null;

    /* renamed from: e */
    Request f36646e;

    /* renamed from: f */
    boolean f36647f = false;

    /* renamed from: g */
    boolean f36648g = false;

    /* renamed from: h */
    C20639k f36649h;

    /* renamed from: i */
    private volatile long f36650i = 0;

    /* renamed from: j */
    private String f36651j;

    @Override // com.bytedance.retrofit2.IRequestInfo
    public Object getRequestInfo() {
        return this.f36643b;
    }

    @Override // com.bytedance.retrofit2.IMetricsCollect
    public void doCollect() {
        C13998f.m56635a(this.f36642a, this.f36643b, this.f36649h);
    }

    @Override // com.bytedance.retrofit2.client.AbstractC20594b
    /* renamed from: b */
    public void mo51525b() {
        HttpURLConnection httpURLConnection = this.f36642a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            if (this.f36646e.isResponseStreaming() && !this.f36647f) {
                doCollect();
                this.f36643b.contentType = C13998f.m56654j(this.f36651j);
                this.f36643b.requestEnd = System.currentTimeMillis();
                if (this.f36643b.reqContext == null || this.f36643b.reqContext.is_need_monitor_in_cancel) {
                    long j = this.f36643b.requestEnd;
                    long j2 = this.f36644c;
                    NetworkParams.monitorApiSample(j - j2, j2, this.f36646e.getUrl(), this.f36645d, this.f36643b);
                }
                C14001g.m56679a().mo51563a(this.f36646e.getUrl(), this.f36643b.sentByteCount, this.f36643b.receivedByteCount, this.f36643b.contentType, this.f36643b.requestLog);
            }
            this.f36647f = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0175 A[Catch:{ all -> 0x01f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0186 A[Catch:{ all -> 0x01f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2 A[Catch:{ all -> 0x01f3 }] */
    @Override // com.bytedance.retrofit2.client.AbstractC20594b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.retrofit2.client.Response mo51523a() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 540
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.C13992b.mo51523a():com.bytedance.retrofit2.client.Response");
    }

    /* renamed from: a */
    private int m56598a(int i) throws IOException {
        if (C13998f.m56647b(this.f36642a, this.f36643b, i)) {
            return m56599a(true);
        }
        if (this.f36643b.executeTuringCallback) {
            f36639k = true;
        }
        return i;
    }

    /* renamed from: a */
    private int m56599a(boolean z) throws IOException {
        HttpURLConnection httpURLConnection = this.f36642a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        String url = this.f36646e.getUrl();
        try {
            this.f36642a = C13998f.m56625a(url, this.f36646e, this.f36643b, this.f36650i);
            if (z) {
                this.f36643b.bdTuringRetry = true;
                this.f36642a.addRequestProperty("x-tt-bdturing-retry", "1");
            }
            return C13998f.m56619a(this.f36646e, this.f36642a);
        } catch (Exception e) {
            C13998f.m56631a(url, this.f36644c, this.f36643b, this.f36645d, e, this.f36642a, this.f36649h);
            this.f36647f = true;
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e.getMessage(), e.getCause());
        }
    }

    @Override // com.bytedance.retrofit2.client.AbstractC20594b
    /* renamed from: a */
    public boolean mo51524a(long j) {
        this.f36650i = j;
        HttpURLConnection httpURLConnection = this.f36642a;
        if (httpURLConnection != null) {
            try {
                Reflect.on(httpURLConnection).call("setThrottleNetSpeed", new Class[]{Long.TYPE}, Long.valueOf(j));
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private TypedInput m56600a(final HttpURLConnection httpURLConnection, final boolean z) throws IOException {
        if (httpURLConnection == null) {
            return null;
        }
        if (httpURLConnection.getContentLength() != 0) {
            return new TypedInput() {
                /* class com.bytedance.frameworks.baselib.network.http.cronet.impl.C13992b.C139931 */

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public long length() throws IOException {
                    return (long) httpURLConnection.getContentLength();
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public String mimeType() {
                    return C13998f.m56624a(httpURLConnection, "Content-Type");
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public InputStream in() throws IOException {
                    InputStream inputStream;
                    try {
                        inputStream = StreamParser.processInputStream(httpURLConnection.getInputStream(), httpURLConnection.getHeaderFields(), z, C13992b.this.f36649h);
                    } catch (Exception e) {
                        if (C13998f.m56640a(C13992b.this.f36643b)) {
                            inputStream = httpURLConnection.getErrorStream();
                        } else {
                            String responseMessage = httpURLConnection.getResponseMessage();
                            StringBuilder sb = new StringBuilder();
                            sb.append("reason = ");
                            if (responseMessage == null) {
                                responseMessage = "";
                            }
                            sb.append(responseMessage);
                            sb.append("  exception = ");
                            sb.append(e.getMessage());
                            throw new HttpResponseException(httpURLConnection.getResponseCode(), sb.toString());
                        }
                    }
                    return new C13982b(inputStream, C13992b.this);
                }
            };
        }
        mo51525b();
        return null;
    }

    public C13992b(Request request, ICronetClient iCronetClient) throws IOException {
        this.f36646e = request;
        f36641m = iCronetClient;
        String url = request.getUrl();
        this.f36642a = null;
        C20639k metrics = request.getMetrics();
        this.f36649h = metrics;
        if (metrics != null) {
            this.f36643b.appLevelRequestStart = metrics.f50277g;
            this.f36643b.beforeAllInterceptors = this.f36649h.f50278h;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f36644c = currentTimeMillis;
        this.f36643b.requestStart = currentTimeMillis;
        this.f36643b.httpClientType = 0;
        if (this.f36646e.isResponseStreaming()) {
            this.f36643b.downloadFile = true;
        } else {
            this.f36643b.downloadFile = false;
        }
        if (request.getExtraInfo() instanceof BaseRequestContext) {
            this.f36643b.reqContext = (T) ((BaseRequestContext) request.getExtraInfo());
            this.f36648g = this.f36643b.reqContext.bypass_network_status_check;
        }
        try {
            this.f36642a = C13998f.m56625a(url, request, this.f36643b, this.f36650i);
        } catch (Exception e) {
            C13998f.m56631a(url, this.f36644c, this.f36643b, this.f36645d, e, this.f36642a, this.f36649h);
            this.f36647f = true;
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e.getMessage(), e.getCause());
        }
    }
}
