package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.AbstractC13978a;
import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.BaseRequestContext;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13994c;
import com.bytedance.frameworks.baselib.network.http.exception.NetworkNotAvailabeException;
import com.bytedance.frameworks.baselib.network.http.parser.MimeType;
import com.bytedance.frameworks.baselib.network.http.parser.MimeTypeParseException;
import com.bytedance.frameworks.baselib.network.http.parser.StreamParser;
import com.bytedance.frameworks.baselib.network.http.retrofit.SsHttpExecutor;
import com.bytedance.frameworks.baselib.network.p740a.C13939c;
import com.bytedance.retrofit2.C20639k;
import com.bytedance.retrofit2.client.AbstractC20594b;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UnknownFormatConversionException;
import org.json.JSONObject;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f */
public class C13998f implements AbstractC13978a, ICronetClient.ICronetBootFailureChecker {

    /* renamed from: a */
    public static final String f36682a = "f";

    /* renamed from: b */
    private static String f36683b = "";

    /* renamed from: c */
    private static Context f36684c;

    /* renamed from: d */
    private static ICronetClient f36685d;

    /* renamed from: e */
    private static volatile C13998f f36686e;

    /* renamed from: f */
    private static volatile boolean f36687f;

    /* renamed from: g */
    private static volatile int f36688g;

    /* renamed from: h */
    private static AbstractC13999a f36689h;

    /* renamed from: i */
    private static AbstractC14000b f36690i;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$a */
    public interface AbstractC13999a {
        /* renamed from: a */
        boolean mo51561a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.impl.f$b */
    public interface AbstractC14000b {
        /* renamed from: b */
        boolean mo51562b();
    }

    /* renamed from: b */
    protected static boolean m56646b(int i) {
        return i >= 8192 && i <= 20971520;
    }

    /* renamed from: e */
    protected static int m56650e() {
        return f36688g;
    }

    /* renamed from: a */
    public static void m56630a(AbstractC14000b bVar) {
        f36690i = bVar;
    }

    /* renamed from: a */
    public static void m56628a(SharedPreferences sharedPreferences) {
        f36688g = sharedPreferences.getInt("cronet_inputstream_buff_size", 0);
    }

    /* renamed from: a */
    public static void m56637a(JSONObject jSONObject) {
        f36688g = jSONObject.optInt("cronet_inputstream_buff_size", 0);
    }

    /* renamed from: a */
    protected static boolean m56640a(BaseHttpRequestInfo baseHttpRequestInfo) {
        return (baseHttpRequestInfo == null || baseHttpRequestInfo.reqContext == null || !baseHttpRequestInfo.reqContext.force_handle_response) ? false : true;
    }

    /* renamed from: a */
    public void mo51548a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        m56651f();
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(this);
            f36685d.setCronetEngine(f36684c, z, z2, z3, z4, NetworkParams.getUserAgent(), new SsHttpExecutor(), z5);
        }
    }

    /* renamed from: a */
    public void mo51546a(boolean z) {
        try {
            ICronetClient iCronetClient = f36685d;
            if (iCronetClient == null) {
                return;
            }
            if (f36684c != null) {
                Reflect.on(iCronetClient).call("triggerGetDomain", new Class[]{Context.class, Boolean.TYPE}, f36684c, Boolean.valueOf(z));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo51550a(String[] strArr, byte[] bArr, byte[] bArr2) {
        try {
            ICronetClient iCronetClient = f36685d;
            if (iCronetClient == null) {
                return;
            }
            if (f36684c != null) {
                Reflect.on(iCronetClient).call("addClientOpaqueData", new Class[]{Context.class, String[].class, byte[].class, byte[].class}, f36684c, strArr, bArr, bArr2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo51541a() {
        try {
            ICronetClient iCronetClient = f36685d;
            if (iCronetClient == null) {
                return;
            }
            if (f36684c != null) {
                Reflect.on(iCronetClient).call("clearClientOpaqueData", new Class[]{Context.class}, f36684c);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo51543a(String str) {
        try {
            ICronetClient iCronetClient = f36685d;
            if (iCronetClient == null) {
                return;
            }
            if (f36684c != null) {
                Reflect.on(iCronetClient).call("removeClientOpaqueData", new Class[]{Context.class, String.class}, f36684c, str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo51549a(String[] strArr, int i, int i2) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("tryStartNetDetect", new Class[]{String[].class, Integer.TYPE, Integer.TYPE}, strArr, Integer.valueOf(i), Integer.valueOf(i2)).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: a */
    public void mo51544a(String str, int i, String str2) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("ttDnsResolve", new Class[]{String[].class, Integer.TYPE, String.class}, str, Integer.valueOf(i), str2).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: a */
    public void mo51545a(String str, String str2, String str3, String str4, String str5, String str6) throws Exception {
        m56652g();
        Reflect.on(f36685d).call("notifyTNCConfigUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6).get();
    }

    /* renamed from: a */
    public static void m56633a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("notifyStoreRegionUpdated", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, str, str2, str3, str4, str5, str6, str7, str8).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: a */
    public C13997e mo51539a(int i) throws Exception {
        m56652g();
        return (C13997e) Reflect.on(f36685d).call("getPacketLossRateMetrics", new Class[]{Integer.TYPE}, Integer.valueOf(i)).get();
    }

    @Override // com.bytedance.retrofit2.client.AbstractC20592a
    /* renamed from: a */
    public AbstractC20594b mo51540a(Request request) throws IOException {
        C13994c.C13995a a;
        long uptimeMillis = SystemClock.uptimeMillis();
        Request a2 = C13939c.m56420a().mo51298a(request);
        if (request.getMetrics() != null) {
            request.getMetrics().f50266L = SystemClock.uptimeMillis() - uptimeMillis;
        }
        if (a2 != null) {
            request = a2;
        }
        if (!C13994c.m56604a().mo51536b() || request.getUrl().contains("no_retry=1") || (a = C13994c.m56604a().mo51532a(request)) == null || a.mo51537a() == null || a.mo51537a().size() < 2) {
            return new C13992b(request, f36685d);
        }
        return new C13989a(request, a);
    }

    /* renamed from: a */
    private static void m56632a(String str, BaseHttpRequestInfo baseHttpRequestInfo) {
        if (!StringUtils.isEmpty(str) && baseHttpRequestInfo != null) {
            try {
                if (Logger.debug()) {
                    String str2 = f36682a;
                    Logger.m15167d(str2, "getRequestInfo remoteIp = " + str);
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
    protected static void m56635a(HttpURLConnection httpURLConnection, BaseHttpRequestInfo baseHttpRequestInfo, C20639k kVar) {
        if (baseHttpRequestInfo != null) {
            try {
                if (f36685d != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    f36685d.getRequestMetrics(httpURLConnection, linkedHashMap);
                    if (!linkedHashMap.isEmpty()) {
                        baseHttpRequestInfo.remoteIp = (String) m56621a(linkedHashMap.get("remote_ip"), String.class, "");
                        baseHttpRequestInfo.dnsTime = ((Long) m56621a(linkedHashMap.get("dns_time"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.connectTime = ((Long) m56621a(linkedHashMap.get("connect_time"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.sslTime = ((Long) m56621a(linkedHashMap.get("ssl_time"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.sendTime = ((Long) m56621a(linkedHashMap.get("send_time"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.pushTime = ((Long) m56621a(linkedHashMap.get("push_time"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.receiveTime = ((Long) m56621a(linkedHashMap.get("receive_time"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.isSocketReused = ((Boolean) m56621a(linkedHashMap.get("socket_reused"), Boolean.class, (Object) false)).booleanValue();
                        baseHttpRequestInfo.ttfbMs = ((Long) m56621a(linkedHashMap.get("ttfb"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.totalTime = ((Long) m56621a(linkedHashMap.get("total_time"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.sentByteCount = ((Long) m56621a(linkedHashMap.get("send_byte_count"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.receivedByteCount = ((Long) m56621a(linkedHashMap.get("received_byte_count"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.requestLog = (String) m56621a(linkedHashMap.get("request_log"), String.class, "");
                        baseHttpRequestInfo.retryAttempts = ((Long) m56621a(linkedHashMap.get("retry_attempts"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.requestHeaders = (String) m56621a(linkedHashMap.get("request_headers"), String.class, "");
                        baseHttpRequestInfo.responseHeaders = (String) m56621a(linkedHashMap.get("response_headers"), String.class, "");
                        baseHttpRequestInfo.nativePostTaskStartTime = ((Long) m56621a(linkedHashMap.get("post_task_start"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.nativeRequestStartTime = ((Long) m56621a(linkedHashMap.get("request_start"), Long.class, (Object) -1L)).longValue();
                        baseHttpRequestInfo.nativeWaitContext = ((Long) m56621a(linkedHashMap.get("wait_ctx"), Long.class, (Object) -1L)).longValue();
                    }
                }
                if (kVar != null) {
                    kVar.f50271a = baseHttpRequestInfo.fallbackReason;
                    kVar.f50291u = SystemClock.uptimeMillis();
                    kVar.f50281k = System.currentTimeMillis();
                    kVar.f50268N = "4.0.78.3-tudp";
                    kVar.f50267M.put("sentByteCount", Long.valueOf(baseHttpRequestInfo.sentByteCount));
                    kVar.f50267M.put("receivedByteCount", Long.valueOf(baseHttpRequestInfo.receivedByteCount));
                    JSONObject jSONObject = baseHttpRequestInfo.extraInfo;
                    if (baseHttpRequestInfo.executeTuringCallback) {
                        jSONObject.put("turing_callback", baseHttpRequestInfo.turingCallbackDuration);
                    }
                    if (baseHttpRequestInfo.bdTuringRetry) {
                        jSONObject.put("turing_retry", "1");
                    }
                    jSONObject.put("retrofit", kVar.mo69449a());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    protected static void m56636a(HttpURLConnection httpURLConnection, Request request) throws IOException {
        httpURLConnection.setRequestMethod(request.getMethod());
        httpURLConnection.setDoInput(true);
        boolean z = false;
        for (Header header : request.getHeaders()) {
            if (!StringUtils.isEmpty(header.getName()) && !StringUtils.isEmpty(header.getValue())) {
                if ("User-Agent".equalsIgnoreCase(header.getName())) {
                    z = true;
                }
                httpURLConnection.setRequestProperty(header.getName(), header.getValue());
            }
        }
        if (!z) {
            String userAgent = NetworkParams.getUserAgent();
            if (!StringUtils.isEmpty(userAgent)) {
                if (f36685d != null) {
                    userAgent = userAgent + " cronet/" + f36685d.getCronetVersion();
                }
                httpURLConnection.setRequestProperty("User-Agent", userAgent);
            }
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", body.mimeType());
            String md5Stub = body.md5Stub();
            if (md5Stub != null) {
                httpURLConnection.setRequestProperty("X-SS-STUB", md5Stub);
            }
            long length = body.length();
            if (length != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) length);
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
                return;
            }
            httpURLConnection.setChunkedStreamingMode(4096);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r17.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        r0.printStackTrace();
        r1 = new java.lang.StringBuilder();
        r1.append("reason = ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r12 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        r12 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        r1.append(r12);
        r1.append("  exception = ");
        r1.append(r0.getMessage());
        r12 = r1.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static byte[] m56641a(java.lang.String r15, int r16, java.net.HttpURLConnection r17, long r18, com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo r20, java.lang.String r21, int r22, com.bytedance.retrofit2.C20639k r23) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f.m56641a(java.lang.String, int, java.net.HttpURLConnection, long, com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo, java.lang.String, int, com.bytedance.retrofit2.k):byte[]");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    protected static void m56639a(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, String str, String str2, C20639k kVar) throws IOException {
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
                            String str3 = f36682a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(" response body = ");
                            sb.append(new String(bArr, parameter));
                            sb.append(" for url = ");
                            if (str2 == null) {
                                str2 = "";
                            }
                            sb.append(str2);
                            Logger.m15167d(str3, sb.toString());
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
    protected static void m56631a(String str, long j, BaseHttpRequestInfo baseHttpRequestInfo, String str2, Exception exc, HttpURLConnection httpURLConnection, C20639k kVar) {
        if (str != null && exc != null) {
            if (baseHttpRequestInfo != null) {
                try {
                    if (baseHttpRequestInfo.extraInfo == null) {
                        baseHttpRequestInfo.extraInfo = m56642b(httpURLConnection);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            baseHttpRequestInfo.extraInfo.put("ex", exc.getMessage());
            String d = m56649d(httpURLConnection);
            if (!StringUtils.isEmpty(d)) {
                baseHttpRequestInfo.extraInfo.put("response-headers", d);
            }
            if (baseHttpRequestInfo != null && StringUtils.isEmpty(baseHttpRequestInfo.remoteIp)) {
                m56632a(m56622a(exc), baseHttpRequestInfo);
            }
            long currentTimeMillis = System.currentTimeMillis() - j;
            baseHttpRequestInfo.requestEnd = System.currentTimeMillis();
            m56635a(httpURLConnection, baseHttpRequestInfo, kVar);
            NetworkParams.handleApiError(str, exc, currentTimeMillis, baseHttpRequestInfo);
            NetworkParams.monitorApiError(currentTimeMillis, j, str, str2, baseHttpRequestInfo, exc);
            if (baseHttpRequestInfo.downloadFile) {
                baseHttpRequestInfo.hasReportStreamingApiAll.set(true);
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }

    /* renamed from: a */
    protected static void m56634a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null && httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    protected static void m56638a(boolean z, String str) throws NetworkNotAvailabeException {
        Context context;
        if (!f36687f && !z && (context = f36684c) != null && !NetworkUtils.isNetworkAvailable(context)) {
            throw new NetworkNotAvailabeException("network not available");
        } else if (f36687f && !TextUtils.isEmpty(str) && str.contains("net::ERR_INTERNET_DISCONNECTED")) {
            throw new NetworkNotAvailabeException("network not available");
        }
    }

    /* renamed from: a */
    public void mo51542a(long j) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("setAlogFuncAddr", new Class[]{Long.TYPE}, Long.valueOf(j));
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: a */
    public void mo51547a(boolean z, String str, String str2, String str3, boolean z2, String str4) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("enableTTBizHttpDns", new Class[]{Boolean.TYPE, String.class, String.class, String.class, Boolean.TYPE, String.class}, Boolean.valueOf(z), str, str2, str3, Boolean.valueOf(z2), str4).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: g */
    private void m56652g() {
        if (f36685d == null) {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient.ICronetBootFailureChecker
    public boolean isCronetBootFailureExpected() {
        AbstractC13999a aVar = f36689h;
        if (aVar == null) {
            return false;
        }
        return aVar.mo51561a();
    }

    /* renamed from: c */
    public C13996d mo51553c() throws Exception {
        m56652g();
        int[] iArr = (int[]) Reflect.on(f36685d).call("getNetworkQuality").get();
        if (iArr.length == 3) {
            C13996d dVar = new C13996d();
            dVar.f36674a = iArr[0];
            dVar.f36675b = iArr[1];
            dVar.f36676c = iArr[2];
            return dVar;
        }
        throw new UnknownFormatConversionException("getNetworkQuality returns wrong format");
    }

    /* renamed from: f */
    private static void m56651f() {
        String str;
        if (f36685d == null) {
            if (!StringUtils.isEmpty(f36683b)) {
                str = f36683b;
            } else {
                str = "org.chromium.CronetClient";
            }
            String str2 = f36682a;
            Logger.m15181w(str2, "tryResolveImpl:" + str);
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    f36685d = (ICronetClient) newInstance;
                }
            } catch (Throwable th) {
                String str3 = f36682a;
                Logger.m15181w(str3, "load CronetClient exception: " + th);
            }
        }
    }

    /* renamed from: d */
    public Map<String, C13996d> mo51555d() throws Exception {
        m56652g();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((Map) Reflect.on(f36685d).call("getGroupRTTEstimates").get()).entrySet()) {
            if (((int[]) entry.getValue()).length == 2) {
                C13996d dVar = new C13996d();
                dVar.f36674a = ((int[]) entry.getValue())[0];
                dVar.f36675b = ((int[]) entry.getValue())[1];
                dVar.f36676c = -1;
                hashMap.put(entry.getKey(), dVar);
            } else {
                throw new UnknownFormatConversionException("getGroupRttEstimates returns wrong format");
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public int mo51551b() throws Exception {
        m56652g();
        return ((Integer) Reflect.on(f36685d).call("getEffectiveConnectionType").get()).intValue();
    }

    /* renamed from: a */
    public static void m56629a(AbstractC13999a aVar) {
        f36689h = aVar;
    }

    /* renamed from: b */
    public static void m56645b(boolean z) {
        f36687f = z;
    }

    /* renamed from: a */
    public static void m56627a(SharedPreferences.Editor editor) {
        editor.putInt("cronet_inputstream_buff_size", f36688g);
    }

    /* renamed from: c */
    public static int m56648c(HttpURLConnection httpURLConnection) {
        return f36685d.getCronetInternalErrorCode(httpURLConnection);
    }

    private C13998f(Context context) {
        f36684c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C13998f m56620a(Context context) {
        if (f36686e == null) {
            synchronized (C13998f.class) {
                if (f36686e == null) {
                    f36686e = new C13998f(context);
                    m56651f();
                }
            }
        }
        return f36686e;
    }

    /* renamed from: j */
    public static String m56654j(String str) {
        try {
            if (!StringUtils.isEmpty(str)) {
                return new MimeType(str).getBaseType();
            }
            return "";
        } catch (MimeTypeParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public void mo51557e(String str) {
        m56652g();
        Reflect.on(f36685d).call("getMappingRequestState", new Class[]{String.class}, str).get();
    }

    /* renamed from: f */
    public void mo51558f(String str) throws Exception {
        m56652g();
        Reflect.on(f36685d).call("setProxy", new Class[]{String.class}, str).get();
    }

    /* renamed from: g */
    public void mo51559g(String str) throws Exception {
        m56652g();
        Reflect.on(f36685d).call("setHostResolverRules", new Class[]{String.class}, str);
    }

    /* renamed from: a */
    private static String m56622a(Exception exc) {
        String[] split;
        if (exc == null) {
            return "";
        }
        try {
            String message = exc.getMessage();
            if (!(message == null || (split = message.split("\\|")) == null || split.length < 2)) {
                if (Logger.debug()) {
                    String str = f36682a;
                    Logger.m15167d(str, "getHostAddress remoteIp = " + split[0]);
                }
                return split[0];
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "";
    }

    /* renamed from: b */
    protected static JSONObject m56642b(HttpURLConnection httpURLConnection) {
        JSONObject jSONObject = new JSONObject();
        if (httpURLConnection == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsCronetHttpClient");
            ICronetClient iCronetClient = f36685d;
            if (iCronetClient != null) {
                jSONObject.put("hcv", iCronetClient.getCronetVersion());
            }
            jSONObject.put("ua", httpURLConnection.getRequestProperty("User-Agent"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: d */
    public void mo51556d(String str) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("preconnectUrl", new Class[]{String.class}, str).get();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: i */
    public void mo51560i(String str) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            Reflect.on(iCronetClient).call("reportNetDiagnosisUserLog", new Class[]{String.class}, str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: b */
    private static void m56643b(Request request) {
        NetworkParams.tryApiProcessHookInit();
        if (!NetworkParams.newCookieBlockPositionEnabled() && !NetworkParams.interceptCookie(request.getExtraInfo())) {
            NetworkParams.tryCookieManagerInit();
            String str = f36682a;
            Logger.m15167d(str, "newCookieBlockPositionEnabled false:" + request.getUrl());
        }
    }

    /* renamed from: h */
    protected static HttpURLConnection m56653h(String str) throws IOException {
        boolean z;
        m56651f();
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            iCronetClient.setCronetBootFailureChecker(f36686e);
            ICronetClient iCronetClient2 = f36685d;
            Context context = f36684c;
            AbstractC14000b bVar = f36690i;
            if (bVar == null) {
                z = false;
            } else {
                z = bVar.mo51562b();
            }
            HttpURLConnection openConnection = iCronetClient2.openConnection(context, str, z, NetworkParams.getUserAgent(), new SsHttpExecutor());
            openConnection.setConnectTimeout(NetworkParams.getConnectTimeout());
            openConnection.setReadTimeout(NetworkParams.getIoTimeout());
            return openConnection;
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    /* renamed from: c */
    public C14002h mo51554c(String str) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            String[] strArr = (String[]) Reflect.on(iCronetClient).call("ttUrlDispatch", new Class[]{String.class}, str).get();
            if (strArr.length != 3 || TextUtils.isEmpty(strArr[0])) {
                throw new UnknownFormatConversionException("ttUrlDispatch returns wrong format");
            }
            try {
                new URL(strArr[0]).toURI();
                return new C14002h(str, strArr[0], strArr[1], strArr[2]);
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        }
    }

    /* renamed from: d */
    private static String m56649d(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                if (!headerFields.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                        if (entry != null) {
                            String key = entry.getKey();
                            if (!StringUtils.isEmpty(key)) {
                                List<String> value = entry.getValue();
                                if (value != null) {
                                    if (!value.isEmpty()) {
                                        StringBuilder sb = new StringBuilder();
                                        int i = 0;
                                        for (String str : value) {
                                            if (!StringUtils.isEmpty(str)) {
                                                if (i == 0) {
                                                    sb.append(str);
                                                } else {
                                                    sb.append("; ");
                                                    sb.append(str);
                                                }
                                                i++;
                                            }
                                        }
                                        jSONObject.put(key, sb.toString());
                                    }
                                }
                            }
                        }
                    }
                    return jSONObject.toString();
                }
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public List<InetAddress> mo51552b(String str) throws Exception {
        ICronetClient iCronetClient = f36685d;
        if (iCronetClient != null) {
            return (List) Reflect.on(iCronetClient).call("dnsLookup", new Class[]{String.class}, str).get();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* renamed from: a */
    protected static int m56619a(Request request, HttpURLConnection httpURLConnection) throws IOException {
        if (request == null || httpURLConnection == null) {
            return -1;
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            body.writeTo(httpURLConnection.getOutputStream());
        }
        if (NetworkParams.newCookieBlockPositionEnabled() && !NetworkParams.interceptCookie(request.getExtraInfo())) {
            NetworkParams.tryCookieManagerInit();
            String str = f36682a;
            Logger.m15167d(str, "newCookieBlockPositionEnabled true:" + request.getUrl());
        }
        return httpURLConnection.getResponseCode();
    }

    /* renamed from: a */
    protected static String m56624a(HttpURLConnection httpURLConnection, String str) {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    /* renamed from: a */
    static List<Header> m56626a(HttpURLConnection httpURLConnection, boolean z) {
        if (httpURLConnection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
            String key = entry.getKey();
            if (key == null || !key.equalsIgnoreCase("bdturing-verify") || !z) {
                for (String str : entry.getValue()) {
                    arrayList.add(new Header(key, str));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private static <T> T m56621a(Object obj, Class<T> cls, T t) {
        if (obj == 0 || !obj.getClass().equals(cls)) {
            return t;
        }
        return obj;
    }

    /* renamed from: a */
    protected static String m56623a(HttpURLConnection httpURLConnection, BaseHttpRequestInfo baseHttpRequestInfo, int i) {
        if (httpURLConnection == null) {
            return null;
        }
        m56632a(m56624a(httpURLConnection, "x-net-info.remoteaddr"), baseHttpRequestInfo);
        if (!(baseHttpRequestInfo == null || baseHttpRequestInfo.reqContext == null)) {
            baseHttpRequestInfo.reqContext.status = i;
        }
        return m56624a(httpURLConnection, "X-TT-LOGID");
    }

    /* renamed from: b */
    static boolean m56647b(HttpURLConnection httpURLConnection, BaseHttpRequestInfo baseHttpRequestInfo, int i) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || !headerFields.containsKey("bdturing-verify")) {
            return false;
        }
        String requestProperty = httpURLConnection.getRequestProperty("x-tt-bypass-bdturing");
        if (!TextUtils.isEmpty(requestProperty) && requestProperty.equalsIgnoreCase("1")) {
            return false;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(headerFields);
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean shouldRetryRequestFromTuringHeaders = NetworkParams.shouldRetryRequestFromTuringHeaders(i, treeMap);
        baseHttpRequestInfo.turingCallbackDuration = SystemClock.uptimeMillis() - uptimeMillis;
        if (!treeMap.containsKey("bdturing-verify")) {
            baseHttpRequestInfo.executeTuringCallback = true;
        }
        return shouldRetryRequestFromTuringHeaders;
    }

    /* renamed from: a */
    protected static HttpURLConnection m56625a(String str, Request request, BaseHttpRequestInfo baseHttpRequestInfo, long j) throws IOException {
        long j2;
        m56643b(request);
        HttpURLConnection h = m56653h(str);
        if (m56646b(f36688g)) {
            try {
                Reflect.on(h).call("setInputStreamBufferSize", new Class[]{Integer.TYPE}, Integer.valueOf(m56650e()));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        h.setInstanceFollowRedirects(true);
        if (baseHttpRequestInfo.reqContext instanceof BaseRequestContext) {
            T t = baseHttpRequestInfo.reqContext;
            if (t.timeout_connect > 0) {
                h.setConnectTimeout((int) t.timeout_connect);
            }
            if (t.timeout_read > 0) {
                h.setReadTimeout((int) t.timeout_read);
            }
            if (t.protect_timeout > 0) {
                try {
                    Reflect.on(h).call("setRequestTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.protect_timeout));
                    h.setConnectTimeout(0);
                    h.setReadTimeout(0);
                    if (t.socket_connect_timeout > 0 || t.socket_read_timeout > 0 || t.socket_write_timeout > 0) {
                        Reflect.on(h).call("setSocketConnectTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.socket_connect_timeout));
                        Reflect.on(h).call("setSocketReadTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.socket_read_timeout));
                        Reflect.on(h).call("setSocketWriteTimeout", new Class[]{Integer.TYPE}, Integer.valueOf((int) t.socket_write_timeout));
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            if (!m56646b(f36688g) && m56646b(t.input_stream_buffer_size)) {
                try {
                    Reflect.on(h).call("setInputStreamBufferSize", new Class[]{Integer.TYPE}, Integer.valueOf(t.input_stream_buffer_size));
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            }
            if (t.request_flag > 0) {
                try {
                    Reflect.on(h).call("setRequestFlag", new Class[]{Integer.TYPE}, Integer.valueOf(t.request_flag));
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
            }
            if (t.throttle_net_speed <= 0 || j != 0) {
                j2 = j;
            } else {
                j2 = t.throttle_net_speed;
            }
            if (!t.followRedirectInternal) {
                h.setInstanceFollowRedirects(false);
            }
        } else {
            j2 = j;
        }
        try {
            Reflect.on(h).call("setRequestPriority", new Class[]{Integer.TYPE}, Integer.valueOf(request.getRequestPriorityLevel()));
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        if (j2 > 0) {
            try {
                Reflect.on(h).call("setThrottleNetSpeed", new Class[]{Integer.TYPE}, Long.valueOf(j2));
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
        m56636a(h, request);
        baseHttpRequestInfo.extraInfo = m56642b(h);
        return h;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m56644b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        try {
            m56633a(str, str2, str3, str4, str5, str6, str7, str8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
