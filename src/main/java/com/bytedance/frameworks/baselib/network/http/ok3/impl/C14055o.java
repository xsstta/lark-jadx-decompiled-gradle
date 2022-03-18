package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.AbstractC13978a;
import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import com.bytedance.frameworks.baselib.network.http.C13982b;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.AbstractC14045e;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.C14041b;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14068d;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14075j;
import com.bytedance.frameworks.baselib.network.http.p742b.C13984b;
import com.bytedance.frameworks.baselib.network.http.parser.MimeType;
import com.bytedance.frameworks.baselib.network.http.parser.StreamParser;
import com.bytedance.frameworks.baselib.network.http.util.C14083a;
import com.bytedance.frameworks.baselib.network.http.util.C14091i;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.frameworks.baselib.network.p740a.C13939c;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.IRequestInfo;
import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpMethod;
import okio.AbstractC69698d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.o */
public class C14055o implements AbstractC13978a {

    /* renamed from: a */
    public static volatile boolean f36891a = false;

    /* renamed from: b */
    public static volatile int f36892b = 0;

    /* renamed from: c */
    public static volatile String f36893c = null;

    /* renamed from: d */
    public static volatile String[] f36894d = null;

    /* renamed from: e */
    public static volatile String[] f36895e = null;

    /* renamed from: f */
    public static Context f36896f = null;

    /* renamed from: g */
    public static C14028g f36897g = null;

    /* renamed from: h */
    public static AbstractC14025e f36898h = null;

    /* renamed from: i */
    private static volatile C14055o f36899i = null;

    /* renamed from: j */
    private static volatile int f36900j = -1;

    /* renamed from: k */
    private static volatile String f36901k = "";

    /* renamed from: l */
    private static final Object f36902l = new Object();

    /* renamed from: m */
    private static int f36903m = 0;

    /* renamed from: n */
    private static volatile String f36904n = "";

    /* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.o$a */
    public static class C14057a implements IRequestInfo, AbstractC20594b {

        /* renamed from: n */
        static boolean f36906n;

        /* renamed from: a */
        OkHttpClient f36907a = C14055o.f36897g.mo51629a(false);

        /* renamed from: b */
        BaseHttpRequestInfo f36908b = BaseHttpRequestInfo.createHttpRequestInfo();

        /* renamed from: c */
        long f36909c = 0;

        /* renamed from: d */
        ResponseBody f36910d = null;

        /* renamed from: e */
        String f36911e = null;

        /* renamed from: f */
        Request f36912f;

        /* renamed from: g */
        okhttp3.Request f36913g;

        /* renamed from: h */
        Response f36914h;

        /* renamed from: i */
        Call f36915i;

        /* renamed from: j */
        boolean f36916j = false;

        /* renamed from: k */
        C20639k f36917k = null;

        /* renamed from: l */
        volatile C14050k f36918l = null;

        /* renamed from: m */
        boolean f36919m = false;

        @Override // com.bytedance.retrofit2.client.AbstractC20594b
        /* renamed from: a */
        public boolean mo51524a(long j) {
            return false;
        }

        @Override // com.bytedance.retrofit2.IRequestInfo
        public Object getRequestInfo() {
            return this.f36908b;
        }

        /* renamed from: c */
        private void m56920c() throws IOException {
            Map<String, List<String>> multimap = this.f36914h.headers().toMultimap();
            if (multimap != null && multimap.containsKey("bdturing-verify")) {
                String str = null;
                okhttp3.Request request = this.f36913g;
                if (request != null) {
                    str = request.header("x-tt-bypass-bdturing");
                }
                if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase("1")) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    boolean shouldRetryRequestFromTuringHeaders = NetworkParams.shouldRetryRequestFromTuringHeaders(this.f36914h.code(), multimap);
                    this.f36908b.turingCallbackDuration = SystemClock.uptimeMillis() - uptimeMillis;
                    if (shouldRetryRequestFromTuringHeaders) {
                        this.f36908b.executeTuringCallback = true;
                        m56919a(true);
                    } else if (!multimap.containsKey("bdturing-verify")) {
                        this.f36908b.executeTuringCallback = true;
                        f36906n = true;
                    }
                    BaseHttpRequestInfo baseHttpRequestInfo = this.f36908b;
                    baseHttpRequestInfo.extraInfo = C14055o.m56891a(this.f36913g, baseHttpRequestInfo);
                }
            }
        }

        @Override // com.bytedance.retrofit2.client.AbstractC20594b
        /* renamed from: b */
        public void mo51525b() {
            Call call = this.f36915i;
            if (call != null) {
                call.cancel();
                if (this.f36912f.isResponseStreaming() && !this.f36919m) {
                    this.f36908b.requestEnd = System.currentTimeMillis();
                    if (this.f36908b.reqContext == null || this.f36908b.reqContext.is_need_monitor_in_cancel) {
                        long j = this.f36908b.requestEnd;
                        long j2 = this.f36909c;
                        NetworkParams.monitorApiSample(j - j2, j2, this.f36912f.getUrl(), this.f36911e, this.f36908b);
                    }
                }
                this.f36919m = true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:74:0x019f A[Catch:{ all -> 0x01f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01aa A[Catch:{ all -> 0x01f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01bb A[Catch:{ all -> 0x01f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01e2 A[Catch:{ all -> 0x01f3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x01e5 A[Catch:{ all -> 0x01f3 }] */
        @Override // com.bytedance.retrofit2.client.AbstractC20594b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bytedance.retrofit2.client.Response mo51523a() throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 542
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o.C14057a.mo51523a():com.bytedance.retrofit2.client.Response");
        }

        /* renamed from: a */
        private static List<Header> m56916a(Headers headers) {
            int size = headers.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                if (name == null || !name.equalsIgnoreCase("bdturing-verify") || !f36906n) {
                    arrayList.add(new Header(headers.name(i), headers.value(i)));
                }
            }
            return arrayList;
        }

        public C14057a(Request request) throws IOException {
            EventListener eventListener;
            Request.Builder builder;
            String md5Stub;
            C14055o.m56895a(request.getExtraInfo());
            this.f36912f = request;
            String url = request.getUrl();
            C20639k metrics = request.getMetrics();
            this.f36917k = metrics;
            if (metrics != null) {
                this.f36908b.appLevelRequestStart = metrics.f50277g;
                this.f36908b.beforeAllInterceptors = this.f36917k.f50278h;
            }
            this.f36918l = new C14050k();
            this.f36918l.f36845O = url;
            long currentTimeMillis = System.currentTimeMillis();
            this.f36909c = currentTimeMillis;
            this.f36908b.requestStart = currentTimeMillis;
            this.f36908b.httpClientType = 1;
            if (this.f36912f.isResponseStreaming()) {
                this.f36908b.downloadFile = true;
            } else {
                this.f36908b.downloadFile = false;
            }
            try {
                OkHttpClient.Builder newBuilder = this.f36907a.newBuilder();
                newBuilder.connectTimeout((long) NetworkParams.getConnectTimeout(), TimeUnit.MILLISECONDS);
                newBuilder.readTimeout((long) NetworkParams.getIoTimeout(), TimeUnit.MILLISECONDS);
                newBuilder.writeTimeout((long) NetworkParams.getIoTimeout(), TimeUnit.MILLISECONDS);
                if (request.getExtraInfo() instanceof BaseRequestContext) {
                    this.f36908b.reqContext = (T) ((BaseRequestContext) request.getExtraInfo());
                    T t = this.f36908b.reqContext;
                    if (t.timeout_connect > 0 || t.timeout_read > 0 || t.timeout_write > 0) {
                        if (t.timeout_connect > 0) {
                            newBuilder.connectTimeout(t.timeout_connect, TimeUnit.MILLISECONDS);
                        }
                        if (t.timeout_write > 0) {
                            newBuilder.writeTimeout(t.timeout_write, TimeUnit.MILLISECONDS);
                        }
                        if (t.timeout_read > 0) {
                            newBuilder.readTimeout(t.timeout_read, TimeUnit.MILLISECONDS);
                        }
                    }
                    this.f36916j = t.bypass_network_status_check;
                    if (!t.followRedirectInternal) {
                        newBuilder.followRedirects(false);
                    }
                }
                if (this.f36907a.eventListenerFactory() != null) {
                    eventListener = this.f36907a.eventListenerFactory().create(this.f36915i);
                } else {
                    eventListener = null;
                }
                newBuilder.eventListener(new C14049j(eventListener, this.f36918l));
                this.f36907a = newBuilder.build();
                String a = C14083a.m57014a(C14055o.f36896f, m56915a(url, request.getMethod()), this.f36912f.getHeaders());
                URI a2 = C14091i.m57053a(a);
                if (a2 != null && !TextUtils.isEmpty(a2.getHost())) {
                    this.f36918l.f36852V = a2.getHost();
                    C14048i.m56873a().mo51720a(a2.getHost(), this.f36918l);
                }
                Request.Builder url2 = new Request.Builder().url(a);
                if (!HttpMethod.permitsRequestBody(this.f36912f.getMethod())) {
                    builder = url2.method(this.f36912f.getMethod(), null);
                } else {
                    builder = url2.method(this.f36912f.getMethod(), m56917a(this.f36912f.getBody(), this.f36912f.getRequestBody()));
                }
                List<Header> headers = this.f36912f.getHeaders();
                if (!(this.f36912f.getBody() == null || (md5Stub = this.f36912f.getBody().md5Stub()) == null)) {
                    builder.addHeader("X-SS-STUB", md5Stub);
                }
                okhttp3.Request a3 = C14055o.m56889a(builder, headers);
                this.f36913g = a3;
                this.f36915i = this.f36907a.newCall(a3);
                BaseHttpRequestInfo baseHttpRequestInfo = this.f36908b;
                baseHttpRequestInfo.extraInfo = C14055o.m56891a(this.f36913g, baseHttpRequestInfo);
            } catch (Exception e) {
                C14055o.m56898a(this.f36913g, url, this.f36909c, this.f36908b, this.f36911e, e, this.f36915i, this.f36914h, this.f36917k, this.f36918l);
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new IOException(e.getMessage(), e.getCause());
            }
        }

        /* renamed from: a */
        private void m56919a(boolean z) throws IOException {
            Call call = this.f36915i;
            if (call != null) {
                call.cancel();
            }
            C14055o.m56899a(this.f36914h.body());
            if (z) {
                this.f36908b.bdTuringRetry = true;
                this.f36913g = this.f36913g.newBuilder().addHeader("x-tt-bdturing-retry", "1").build();
            }
            Call newCall = this.f36907a.newCall(this.f36913g);
            this.f36915i = newCall;
            this.f36908b.requestHeaders = C14055o.m56886a(newCall.request().headers());
            this.f36914h = C14055o.m56890a(this.f36907a, this.f36915i);
        }

        /* renamed from: a */
        private static RequestBody m56917a(final TypedOutput typedOutput, RequestBody requestBody) {
            if (requestBody != null) {
                return requestBody;
            }
            if (typedOutput == null) {
                return RequestBody.create((MediaType) null, "body=null");
            }
            final MediaType parse = MediaType.parse(typedOutput.mimeType());
            return new RequestBody() {
                /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o.C14057a.C140581 */

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return parse;
                }

                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return typedOutput.length();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(AbstractC69698d dVar) throws IOException {
                    typedOutput.writeTo(dVar.mo244527b());
                }
            };
        }

        /* renamed from: a */
        private String m56915a(String str, String str2) throws Exception {
            if (!C14073i.m56967a().mo51757d()) {
                long currentTimeMillis = System.currentTimeMillis();
                C14068d a = C14073i.m56967a().mo51750a(new C14075j(str, str2));
                long currentTimeMillis2 = System.currentTimeMillis();
                if (a == null) {
                    return str;
                }
                m56918a(this.f36918l, this.f36912f.getMethod(), a.f36960a, currentTimeMillis2 - currentTimeMillis);
                this.f36918l.f36848R = a.f36962c;
                this.f36918l.f36847Q = false;
                if (str.equals(a.f36960a)) {
                    return str;
                }
                if (a.f36960a.isEmpty() && !a.f36961b.isEmpty()) {
                    throw new Exception("ERR_TTNET_TRAFFIC_CONTROL_DROP, -555");
                } else if (UrlUtils.isValidUrl(a.f36960a)) {
                    return a.f36960a;
                } else {
                    return str;
                }
            } else {
                Logger.m15167d("SsOkHttp3Client", "fallback to host replace map");
                long currentTimeMillis3 = System.currentTimeMillis();
                String a2 = C14073i.m56967a().mo51751a(str);
                long currentTimeMillis4 = System.currentTimeMillis();
                if (str.equals(a2) || !UrlUtils.isValidUrl(a2)) {
                    return str;
                }
                m56918a(this.f36918l, this.f36912f.getMethod(), a2, currentTimeMillis4 - currentTimeMillis3);
                this.f36918l.f36847Q = true;
                this.f36918l.f36849S = C14073i.m56967a().mo51763j().size();
                return a2;
            }
        }

        /* renamed from: a */
        private TypedInput m56914a(final ResponseBody responseBody, final Map<String, List<String>> map, final boolean z) throws IOException {
            if (responseBody.contentLength() == 0) {
                return null;
            }
            return new TypedInput() {
                /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o.C14057a.C140592 */

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public long length() throws IOException {
                    return responseBody.contentLength();
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public String mimeType() {
                    MediaType contentType = responseBody.contentType();
                    if (contentType == null) {
                        return null;
                    }
                    return contentType.toString();
                }

                @Override // com.bytedance.retrofit2.mime.TypedInput
                public InputStream in() throws IOException {
                    try {
                        return new C13982b(StreamParser.processInputStream(responseBody.byteStream(), map, z, C14057a.this.f36917k), C14057a.this);
                    } catch (Throwable th) {
                        if (C14057a.this.f36914h != null) {
                            String message = C14057a.this.f36914h.message();
                            StringBuilder sb = new StringBuilder();
                            sb.append("reason = ");
                            if (message == null) {
                                message = "";
                            }
                            sb.append(message);
                            sb.append("  exception = ");
                            sb.append(th.getMessage());
                            throw new HttpResponseException(C14057a.this.f36914h.code(), sb.toString());
                        }
                        throw new IOException(th);
                    }
                }
            };
        }

        /* renamed from: a */
        private void m56918a(C14050k kVar, String str, String str2, long j) {
            C14053m mVar = new C14053m();
            mVar.f36881a = 307;
            mVar.f36884d = true;
            mVar.f36882b = str;
            mVar.f36883c = str2;
            kVar.f36840J.add(mVar);
            kVar.f36839I++;
            kVar.f36870r = j;
            kVar.f36846P = true;
        }
    }

    /* renamed from: a */
    public static int m56883a() {
        return f36900j;
    }

    /* renamed from: a */
    public OkHttpClient mo51723a(boolean z) throws IllegalArgumentException {
        C14028g gVar = f36897g;
        if (gVar != null) {
            return gVar.mo51629a(z);
        }
        throw new IllegalArgumentException("SsOkHttp3Client is not init !!!");
    }

    /* renamed from: a */
    private static void m56897a(String str, BaseHttpRequestInfo baseHttpRequestInfo) {
        if (!StringUtils.isEmpty(str) && baseHttpRequestInfo != null) {
            try {
                if (Logger.debug()) {
                    Logger.m15167d("SsOkHttp3Client", "getRequestInfo remoteIp = " + str);
                }
                baseHttpRequestInfo.remoteIp = str;
                if (baseHttpRequestInfo.reqContext != null) {
                    baseHttpRequestInfo.reqContext.remoteIp = str;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m56901a(BaseHttpRequestInfo baseHttpRequestInfo) {
        return (baseHttpRequestInfo == null || baseHttpRequestInfo.reqContext == null || !baseHttpRequestInfo.reqContext.force_handle_response) ? false : true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static byte[] m56902a(String str, int i, Response response, long j, BaseHttpRequestInfo baseHttpRequestInfo, String str2, C20639k kVar, C14050k kVar2) throws IOException {
        if (response == null) {
            return new byte[0];
        }
        int code = response.code();
        ResponseBody body = response.body();
        Map<String, List<String>> multimap = response.headers().toMultimap();
        boolean equals = "gzip".equals(response.header("Content-Encoding"));
        String header = response.header("Content-Type");
        baseHttpRequestInfo.fallbackReason = f36900j;
        baseHttpRequestInfo.fallbackMessage = f36901k;
        if (code != 200 && !m56901a(baseHttpRequestInfo)) {
            if (code == 304) {
                baseHttpRequestInfo.completeReadResponse = System.currentTimeMillis();
                long currentTimeMillis = System.currentTimeMillis() - j;
                baseHttpRequestInfo.requestEnd = System.currentTimeMillis();
                m56894a(baseHttpRequestInfo, kVar, kVar2);
                NetworkParams.handleApiOk(str, currentTimeMillis, baseHttpRequestInfo);
                NetworkParams.monitorApiSample(currentTimeMillis, j, str, str2, baseHttpRequestInfo);
            }
            String message = response.message();
            if (body != null) {
                m56900a(equals, multimap, i, body.byteStream(), header, str, kVar);
                StreamParser.safeClose(body);
            }
            throw new HttpResponseException(code, message);
        } else if (body == null) {
            return new byte[0];
        } else {
            baseHttpRequestInfo.completeReadResponse = System.currentTimeMillis();
            InputStream byteStream = body.byteStream();
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] readResponse = StreamParser.readResponse(equals, multimap, i, byteStream, iArr, kVar);
                StreamParser.safeClose(byteStream);
                int i2 = iArr[0];
                byte[] bArr = new byte[i2];
                if (readResponse != null && iArr[0] > 0) {
                    System.arraycopy(readResponse, 0, bArr, 0, iArr[0]);
                }
                if (StreamParser.testIsSSBinary(header)) {
                    StreamParser.decodeSSBinary(bArr, i2);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                baseHttpRequestInfo.requestEnd = System.currentTimeMillis();
                m56894a(baseHttpRequestInfo, kVar, kVar2);
                try {
                    C13984b.m56548a().mo51417a(response, str, bArr);
                } catch (Throwable unused) {
                }
                NetworkParams.handleApiOk(str, currentTimeMillis2, baseHttpRequestInfo);
                NetworkParams.monitorApiSample(currentTimeMillis2, j, str, str2, baseHttpRequestInfo);
                return bArr;
            } catch (Throwable th) {
                StreamParser.safeClose(byteStream);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static void m56894a(BaseHttpRequestInfo baseHttpRequestInfo, C20639k kVar, C14050k kVar2) {
        if (baseHttpRequestInfo != null && kVar != null) {
            kVar.f50271a = baseHttpRequestInfo.fallbackReason;
            kVar.f50272b = baseHttpRequestInfo.fallbackMessage;
            kVar.f50291u = SystemClock.uptimeMillis();
            kVar.f50281k = System.currentTimeMillis();
            kVar.f50268N = "4.0.78.3-tudp";
            try {
                baseHttpRequestInfo.extraInfo.put("retrofit", kVar.mo69449a());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (kVar2 != null) {
                kVar2.mo51722a(baseHttpRequestInfo, f36896f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m56900a(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, String str, String str2, C20639k kVar) throws IOException {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] readResponse = StreamParser.readResponse(z, map, i, inputStream, iArr, kVar);
                StreamParser.safeClose(inputStream);
                int i2 = iArr[0];
                byte[] bArr = new byte[i2];
                if (readResponse != null && iArr[0] > 0) {
                    System.arraycopy(readResponse, 0, bArr, 0, iArr[0]);
                }
                if (i2 > 0 && !StringUtils.isEmpty(str) && Logger.debug()) {
                    try {
                        MimeType mimeType = new MimeType(str);
                        if ("text".equalsIgnoreCase(mimeType.getPrimaryType()) || "application/json".equalsIgnoreCase(mimeType.getBaseType())) {
                            String parameter = mimeType.getParameter("charset");
                            if (StringUtils.isEmpty(parameter)) {
                                parameter = "utf-8";
                            }
                            Logger.m15167d("SsOkHttp3Client", " response body = " + new String(bArr, parameter) + " for url = " + str2);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            } catch (Throwable th2) {
                StreamParser.safeClose(inputStream);
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static void m56898a(okhttp3.Request request, String str, long j, BaseHttpRequestInfo baseHttpRequestInfo, String str2, Exception exc, Call call, Response response, C20639k kVar, C14050k kVar2) {
        if (str != null && exc != null) {
            if (baseHttpRequestInfo != null) {
                try {
                    if (baseHttpRequestInfo.extraInfo == null) {
                        baseHttpRequestInfo.extraInfo = m56891a(request, baseHttpRequestInfo);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            baseHttpRequestInfo.extraInfo.put("ex", exc.getMessage());
            String a = m56887a(response);
            if (!StringUtils.isEmpty(a)) {
                baseHttpRequestInfo.extraInfo.put("response-headers", a);
            }
            if (baseHttpRequestInfo != null && StringUtils.isEmpty(baseHttpRequestInfo.remoteIp)) {
                m56897a(m56885a(exc), baseHttpRequestInfo);
            }
            long currentTimeMillis = System.currentTimeMillis() - j;
            baseHttpRequestInfo.requestEnd = System.currentTimeMillis();
            baseHttpRequestInfo.fallbackReason = f36900j;
            baseHttpRequestInfo.fallbackMessage = f36901k;
            m56894a(baseHttpRequestInfo, kVar, kVar2);
            NetworkParams.handleApiError(str, exc, currentTimeMillis, baseHttpRequestInfo);
            NetworkParams.monitorApiError(currentTimeMillis, j, str, str2, baseHttpRequestInfo, exc);
            if (call != null) {
                call.cancel();
            }
        }
    }

    /* renamed from: a */
    public static void m56899a(ResponseBody responseBody) {
        if (responseBody != null) {
            StreamParser.safeClose(responseBody);
        }
    }

    @Override // com.bytedance.retrofit2.client.AbstractC20592a
    /* renamed from: a */
    public AbstractC20594b mo51540a(com.bytedance.retrofit2.client.Request request) throws IOException {
        try {
            com.bytedance.retrofit2.client.Request a = C13984b.m56548a().mo51412a(request);
            if (a != null) {
                request = a;
            }
        } catch (Throwable unused) {
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        com.bytedance.retrofit2.client.Request a2 = C13939c.m56420a().mo51298a(request);
        if (request.getMetrics() != null) {
            request.getMetrics().f50266L = SystemClock.uptimeMillis() - uptimeMillis;
        }
        if (a2 != null) {
            request = a2;
        }
        return new C14057a(request);
    }

    /* renamed from: a */
    public void mo51724a(AbstractC14025e eVar) {
        f36898h = eVar;
    }

    /* renamed from: a */
    public static void m56896a(String str) {
        f36901k = str;
    }

    /* renamed from: a */
    public static void m56893a(int i, String str, String[] strArr, String[] strArr2) {
        f36892b = i;
        f36893c = str;
        f36895e = strArr;
        f36894d = strArr2;
    }

    /* renamed from: a */
    public static void m56895a(Object obj) {
        NetworkParams.tryApiProcessHookInit();
        m56904b(obj);
    }

    /* renamed from: a */
    public static void m56892a(int i) {
        f36900j = i;
    }

    /* renamed from: b */
    private static void m56904b(Object obj) {
        if (!NetworkParams.interceptCookie(obj)) {
            NetworkParams.tryCookieManagerInit();
        }
    }

    /* renamed from: a */
    public static C14055o m56884a(Context context) {
        if (f36899i == null) {
            synchronized (C14055o.class) {
                if (f36899i == null) {
                    f36899i = new C14055o(context);
                }
            }
        }
        return f36899i;
    }

    /* renamed from: c */
    private static int m56905c(Context context) {
        int i;
        synchronized (f36902l) {
            if (f36903m == 0) {
                try {
                    f36903m = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            i = f36903m;
        }
        return i;
    }

    private C14055o(Context context) {
        f36896f = context.getApplicationContext();
        f36897g = new C14028g();
        C14073i.m56967a().mo51755b(f36896f);
        C14041b.m56829a().mo51688a(new AbstractC14045e() {
            /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o.C140561 */

            @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.AbstractC14045e
            /* renamed from: a */
            public Context mo51711a() {
                return C14055o.f36896f;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.AbstractC14045e
            /* renamed from: b */
            public String[] mo51712b() {
                return C14055o.f36894d;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.AbstractC14045e
            /* renamed from: d */
            public String mo51714d() {
                return C14055o.f36893c;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.AbstractC14045e
            /* renamed from: e */
            public String[] mo51715e() {
                return C14055o.f36895e;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.AbstractC14045e
            /* renamed from: c */
            public String mo51713c() {
                return String.valueOf(C14055o.f36892b);
            }
        });
    }

    /* renamed from: a */
    private static String m56885a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                if (Logger.debug()) {
                    Logger.m15167d("SsOkHttp3Client", "getHostAddress remoteIp = " + split[0]);
                }
                return split[0];
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "";
    }

    /* renamed from: a */
    public static String m56886a(Headers headers) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, List<String>> entry : headers.toMultimap().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    if (value.size() > 0) {
                        for (String str : value) {
                            jSONObject.put(key, str);
                        }
                    }
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private static String m56903b(Context context) {
        if (TextUtils.isEmpty(f36904n)) {
            StringBuilder sb = new StringBuilder();
            sb.append(f36896f.getPackageName());
            sb.append('/');
            sb.append(m56905c(f36896f));
            sb.append(" (Linux; U; Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("; ");
            sb.append(Locale.getDefault().toString());
            String str = Build.MODEL;
            if (str.length() > 0) {
                sb.append("; ");
                sb.append(str);
            }
            String str2 = Build.ID;
            if (str2.length() > 0) {
                sb.append("; Build/");
                sb.append(str2);
            }
            sb.append(";");
            sb.append("tt-ok/3.10.0.2");
            sb.append(')');
            f36904n = sb.toString();
        }
        return f36904n;
    }

    /* renamed from: a */
    private static String m56887a(Response response) {
        if (response == null) {
            return "";
        }
        try {
            Headers headers = response.headers();
            if (headers == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (String str : headers.names()) {
                if (!StringUtils.isEmpty(str)) {
                    List<String> values = headers.values(str);
                    if (values != null) {
                        if (!values.isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            for (String str2 : values) {
                                if (!StringUtils.isEmpty(str2)) {
                                    if (i == 0) {
                                        sb.append(str2);
                                    } else {
                                        sb.append("; ");
                                        sb.append(str2);
                                    }
                                    i++;
                                }
                            }
                            jSONObject.put(str, sb.toString());
                        }
                    }
                }
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static Response m56890a(OkHttpClient okHttpClient, Call call) throws IOException {
        if (okHttpClient == null || call == null) {
            return null;
        }
        return call.execute();
    }

    /* renamed from: a */
    public static String m56888a(Response response, BaseHttpRequestInfo baseHttpRequestInfo) {
        if (response == null) {
            return null;
        }
        m56897a(response.header("x-net-info.remoteaddr"), baseHttpRequestInfo);
        if (!(baseHttpRequestInfo == null || baseHttpRequestInfo.reqContext == null)) {
            baseHttpRequestInfo.reqContext.status = response.code();
        }
        return response.header("X-TT-LOGID");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.Request m56889a(okhttp3.Request.Builder r5, java.util.List<com.bytedance.retrofit2.client.Header> r6) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o.m56889a(okhttp3.Request$Builder, java.util.List):okhttp3.Request");
    }

    /* renamed from: a */
    public static JSONObject m56891a(okhttp3.Request request, BaseHttpRequestInfo baseHttpRequestInfo) {
        JSONObject jSONObject = new JSONObject();
        if (request == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsOkHttp3Client");
            jSONObject.put("hcv", "tt-ok/3.10.0.2");
            jSONObject.put("ua", request.header("User-Agent"));
            if (baseHttpRequestInfo.executeTuringCallback) {
                jSONObject.put("turing_callback", baseHttpRequestInfo.turingCallbackDuration);
            }
            if (baseHttpRequestInfo.bdTuringRetry) {
                jSONObject.put("turing_retry", "1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
