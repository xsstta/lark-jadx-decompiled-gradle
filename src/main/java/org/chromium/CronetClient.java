package org.chromium;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.C1711a;
import com.bytedance.common.utility.io.FileUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.cronet.TTAppStateManager;
import com.bytedance.frameworks.baselib.network.http.cronet.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13997e;
import com.bytedance.frameworks.baselib.network.http.util.C14083a;
import com.ttnet.org.chromium.base.Logger;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTEventListener;
import com.ttnet.org.chromium.net.TTMonitorProvider;
import com.ttnet.org.chromium.net.UrlRequest;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.impl.CronetUrlRequestMapping;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public class CronetClient implements ICronetClient {
    private static ICronetClient.ICronetBootFailureChecker sCronetBootFailureChecker = null;
    private static volatile CronetEngine sCronetEngine = null;
    private static volatile int sNetworkThreadPriority = 20;
    private static volatile RequestFinishedInfo.Listener sRequestFinishedInfoListener;

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) throws Exception {
    }

    public long getCostTime(long j, long j2) {
        if (j2 == -1 || j == -1 || j2 > j) {
            return -1;
        }
        return j - j2;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public String getCronetVersion() {
        return "TTNetVersion:95b5f412 2021-12-20 QuicVersion:77c47651 2021-11-24";
    }

    public static CronetEngine getCronetEngine() {
        Objects.requireNonNull(sCronetEngine, "Cronet engine is null.");
        return sCronetEngine;
    }

    private static long getALogFuncAddr() throws Exception {
        return ((Long) Reflect.on(Class.forName("com.bytedance.ttnet.TTALog").newInstance()).call("getALogFuncAddr").get()).longValue();
    }

    public static int getEffectiveConnectionType() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            return ((ExperimentalCronetEngine) sCronetEngine).getEffectiveConnectionType();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static Map<String, int[]> getGroupRTTEstimates() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            return ((ExperimentalCronetEngine) sCronetEngine).getGroupRttEstimates();
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void triggerSwitchingToCellular() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).tiggerWiFiToCellularByThirdParty();
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private static boolean getListenAppStateIndependently() {
        try {
            return ((Boolean) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getListenAppStateIndependently").get()).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static int[] getNetworkQuality() throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) sCronetEngine;
            return new int[]{experimentalCronetEngine.getTransportRttMs(), experimentalCronetEngine.getHttpRttMs(), experimentalCronetEngine.getDownstreamThroughputKbps()};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private static String getDomainConfigByRegion() {
        String z = C70010c.m268520a().mo246428z();
        String y = C70010c.m268520a().mo246427y();
        String x = C70010c.m268520a().mo246426x();
        if (TextUtils.isEmpty(z)) {
            if (!TextUtils.isEmpty(y)) {
                z = y;
            } else {
                z = x;
            }
        }
        if (TextUtils.isEmpty(z)) {
            return null;
        }
        try {
            return (String) Reflect.on(Class.forName("com.bytedance.ttnet.TTNetInit").newInstance()).call("getGetDomainConfigByRegion", new Class[]{String.class}, z).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void setNetworkThreadPriority(int i) {
        sNetworkThreadPriority = i;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public boolean isCronetHttpURLConnection(HttpURLConnection httpURLConnection) {
        return httpURLConnection instanceof CronetHttpURLConnection;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetBootFailureChecker(ICronetClient.ICronetBootFailureChecker iCronetBootFailureChecker) {
        sCronetBootFailureChecker = iCronetBootFailureChecker;
    }

    private long getTime(Date date) {
        if (date == null) {
            return -1;
        }
        return date.getTime();
    }

    private long getValue(Long l) {
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public int getCronetInternalErrorCode(HttpURLConnection httpURLConnection) {
        try {
            if (!(httpURLConnection instanceof CronetHttpURLConnection)) {
                return 0;
            }
            return ((CronetHttpURLConnection) httpURLConnection).getCronetInternalErrorCode();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static List<InetAddress> dnsLookup(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            return ((ExperimentalCronetEngine) sCronetEngine).dnsLookup(str);
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void getMappingRequestState(final String str) {
        try {
            CronetUrlRequest GetRequest = CronetUrlRequestMapping.GetRequest(str);
            if (GetRequest != null) {
                GetRequest.getStatus(new UrlRequest.StatusListener() {
                    /* class org.chromium.CronetClient.C700062 */

                    @Override // com.ttnet.org.chromium.net.UrlRequest.StatusListener
                    public void onStatus(int i) {
                        C70013e.m268582a().mo246429a(str, i);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean notifySwitchToMultiNetwork(boolean z) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).notifySwitchToMultiNetwork(z);
            return true;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void preconnectUrl(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).preconnectUrl(str, 1);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void reportNetDiagnosisUserLog(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).reportNetDiagnosisUserLog(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAlogFuncAddr(long j) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setAlogFuncAddr(j);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setAppStartUpState(int i) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setAppStartUpState(i);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setHostResolverRules(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setHostResolverRules(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void setProxy(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).setProxy(str);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private void tryCreateRequestFinishedInfoListener(Executor executor) {
        if (sRequestFinishedInfoListener == null) {
            synchronized (CronetClient.class) {
                if (sRequestFinishedInfoListener == null) {
                    sRequestFinishedInfoListener = new RequestFinishedInfo.Listener(executor) {
                        /* class org.chromium.CronetClient.C700073 */

                        private long getTime(Date date) {
                            if (date == null) {
                                return -1;
                            }
                            return date.getTime();
                        }

                        @Override // com.ttnet.org.chromium.net.RequestFinishedInfo.Listener
                        public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
                            RequestFinishedInfo.Metrics metrics;
                            if (requestFinishedInfo != null && (metrics = requestFinishedInfo.getMetrics()) != null) {
                                String str = "";
                                try {
                                    if (C70011d.m268581a().loggerDebug()) {
                                        try {
                                            if (requestFinishedInfo.getResponseInfo() != null) {
                                                str = str + " http status = " + requestFinishedInfo.getResponseInfo().getHttpStatusText();
                                            }
                                            str = str + " finishedReason = " + requestFinishedInfo.getFinishedReason();
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        C70011d.m268581a().loggerD("CronetClient", str + " url = " + requestFinishedInfo.getUrl());
                                        C70011d.m268581a().loggerD("CronetClient", (((((((" dns_cost = " + CronetClient.this.getCostTime(getTime(metrics.getDnsEnd()), getTime(metrics.getDnsStart())) + " ms ") + " connect_cost = " + CronetClient.this.getCostTime(getTime(metrics.getConnectEnd()), getTime(metrics.getConnectStart())) + " ms ") + " ssl_cost = " + CronetClient.this.getCostTime(getTime(metrics.getSslEnd()), getTime(metrics.getSslStart())) + " ms ") + " sending_cost = " + CronetClient.this.getCostTime(getTime(metrics.getSendingEnd()), getTime(metrics.getSendingStart())) + " ms ") + " push_cost = " + CronetClient.this.getCostTime(getTime(metrics.getPushEnd()), getTime(metrics.getPushStart())) + " ms ") + " response_cost = " + CronetClient.this.getCostTime(getTime(metrics.getRequestEnd()), getTime(metrics.getResponseStart())) + " ms ") + " total_cost = " + metrics.getTotalTimeMs() + " ms ") + " remote_ip = " + metrics.getPeerAddr() + " : " + metrics.getPeerPort());
                                        try {
                                            if (requestFinishedInfo.getException() != null) {
                                                C70011d.m268581a().loggerD("CronetClient", " exception = " + requestFinishedInfo.getException().getMessage());
                                            }
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    };
                }
            }
        }
    }

    public static void clearClientOpaqueData(Context context) {
        try {
            if (C70014f.m268590a(context)) {
                if (C70011d.m268581a().loggerDebug()) {
                    C70011d.m268581a().loggerD("CronetClient", "clearClientOpaqueData start");
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).clearClientOpaqueData();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static C13997e getPacketLossRateMetrics(int i) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            C13997e eVar = new C13997e();
            ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) sCronetEngine;
            eVar.f36677a = i;
            eVar.f36678b = experimentalCronetEngine.getUpstreamPacketLossRate(i);
            eVar.f36679c = experimentalCronetEngine.getUpstreamPacketLossRateVariance(i);
            eVar.f36680d = experimentalCronetEngine.getDownstreamPacketLossRate(i);
            eVar.f36681e = experimentalCronetEngine.getDownstreamPacketLossRateVariance(i);
            return eVar;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static String[] ttUrlDispatch(String str) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            Map<String, String> ttUrlDispatch = ((ExperimentalCronetEngine) sCronetEngine).ttUrlDispatch(str);
            return new String[]{ttUrlDispatch.get("final_url"), ttUrlDispatch.get("epoch"), ttUrlDispatch.get("etag")};
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getProxyConfig(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.CronetClient.getProxyConfig(java.lang.String):java.lang.String");
    }

    public static void removeClientOpaqueData(Context context, String str) {
        try {
            if (C70014f.m268590a(context)) {
                if (C70011d.m268581a().loggerDebug()) {
                    C70011d.m268581a().loggerD("CronetClient", "removeClientOpaqueData start");
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).removeClientOpaqueData(str);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void triggerGetDomain(Context context, boolean z) {
        try {
            if (C70014f.m268590a(context)) {
                if (C70011d.m268581a().loggerDebug()) {
                    C70011d.m268581a().loggerD("CronetClient", "triggerGetDomain start");
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).triggerGetDomain(z);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void getRequestMetrics(HttpURLConnection httpURLConnection, Map<String, Object> map) {
        if (httpURLConnection != null && map != null && (httpURLConnection instanceof CronetHttpURLConnection)) {
            try {
                CronetHttpURLConnection cronetHttpURLConnection = (CronetHttpURLConnection) httpURLConnection;
                RequestFinishedInfo requestFinishedInfo = cronetHttpURLConnection.getRequestFinishedInfo();
                if (!(requestFinishedInfo == null || requestFinishedInfo.getMetrics() == null)) {
                    RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                    map.put("remote_ip", metrics.getPeerAddr() + ":" + metrics.getPeerPort());
                    map.put("dns_time", Long.valueOf(getCostTime(getTime(metrics.getDnsEnd()), getTime(metrics.getDnsStart()))));
                    map.put("connect_time", Long.valueOf(getCostTime(getTime(metrics.getConnectEnd()), getTime(metrics.getConnectStart()))));
                    map.put("ssl_time", Long.valueOf(getCostTime(getTime(metrics.getSslEnd()), getTime(metrics.getSslStart()))));
                    map.put("send_time", Long.valueOf(getCostTime(getTime(metrics.getSendingEnd()), getTime(metrics.getSendingStart()))));
                    map.put("push_time", Long.valueOf(getCostTime(getTime(metrics.getPushEnd()), getTime(metrics.getPushStart()))));
                    map.put("receive_time", Long.valueOf(getCostTime(getTime(metrics.getRequestEnd()), getTime(metrics.getResponseStart()))));
                    map.put("socket_reused", Boolean.valueOf(metrics.getSocketReused()));
                    map.put("ttfb", Long.valueOf(getValue(metrics.getTtfbMs())));
                    map.put("total_time", Long.valueOf(getValue(metrics.getTotalTimeMs())));
                    map.put("send_byte_count", Long.valueOf(getValue(metrics.getSentByteCount())));
                    map.put("received_byte_count", Long.valueOf(getValue(metrics.getReceivedByteCount())));
                    map.put("retry_attempts", Long.valueOf(getValue(metrics.getRetryAttempts())));
                    map.put("request_headers", metrics.getRequestHeaders());
                    map.put("response_headers", metrics.getResponseHeaders());
                    map.put("request_start", Long.valueOf(getTime(metrics.getRequestStart())));
                    map.put("post_task_start", Long.valueOf(getTime(metrics.getPostTaskStartMs())));
                    map.put("wait_ctx", Long.valueOf(getCostTime(getTime(metrics.getRequestStart()), getTime(metrics.getPostTaskStartMs()))));
                }
                map.put("request_log", cronetHttpURLConnection.getRequestLog());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void tryStartNetDetect(String[] strArr, int i, int i2) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).tryStartNetDetect(strArr, i, i2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void ttDnsResolve(String str, int i, String str2) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).ttDnsResolve(str, i, str2);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        try {
            if (C70014f.m268590a(context)) {
                if (C70011d.m268581a().loggerDebug()) {
                    C70011d.m268581a().loggerD("CronetClient", "addClientOpaqueData start");
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    ((ExperimentalCronetEngine) sCronetEngine).addClientOpaqueData(strArr, bArr, bArr2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public HttpURLConnection openConnection(Context context, String str, boolean z, String str2, Executor executor) throws IOException {
        try {
            tryCreateCronetEngine(context, false, false, false, z, str2, executor, false);
            return (HttpURLConnection) sCronetEngine.openConnection(new URL(str));
        } catch (Throwable th) {
            if (th instanceof MalformedURLException) {
                throw th;
            } else if (!(th instanceof UnsupportedOperationException) || th.getMessage() == null || !th.getMessage().contains("Unexpected protocol")) {
                throw new IOException(th);
            } else {
                throw new IOException("MalformedURLException", th);
            }
        }
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).enableTTBizHttpDns(z, str, str2, str3, z2, str4);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    public static void notifyTNCConfigUpdated(String str, String str2, String str3, String str4, String str5, String str6) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).notifyTNCConfigUpdated(str, str2, str3, str4, str5, str6);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient
    public void setCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor, boolean z5) {
        tryCreateCronetEngine(context, z, z2, z3, z4, str, executor, z5);
    }

    public static void notifyStoreRegionUpdated(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws Exception {
        if (sCronetEngine instanceof ExperimentalCronetEngine) {
            ((ExperimentalCronetEngine) sCronetEngine).updateStoreRegionFromServer(str, str2, str3, str4, str5, str6, str7, str8);
            return;
        }
        throw new UnsupportedOperationException("CronetEngine has not been initialized.");
    }

    private void tryCreateCronetEngine(Context context, boolean z, boolean z2, boolean z3, boolean z4, String str, Executor executor, boolean z5) {
        String str2;
        ICronetClient.ICronetBootFailureChecker iCronetBootFailureChecker;
        if (sCronetEngine == null) {
            synchronized (CronetClient.class) {
                if (sCronetEngine == null) {
                    if (!z5 && (iCronetBootFailureChecker = sCronetBootFailureChecker) != null) {
                        if (!iCronetBootFailureChecker.isCronetBootFailureExpected()) {
                            Log.w("CronetClient", "isCronetBootFailureExpected return false.");
                            throw new IllegalArgumentException("isCronetBootFailureExpected return false.");
                        }
                    }
                    Log.w("CronetClient", "CronetClient tryCreateCronetEngine");
                    TTNetInitMetrics.m56573b().f36582j = System.currentTimeMillis();
                    ExperimentalCronetEngine.Builder enableNetworkQualityEstimator = new ExperimentalCronetEngine.Builder(context).enableQuic(z).enableHttp2(z2).enableSdch(z3).enableHttpDns(z4).listenAppStateIndependently(getListenAppStateIndependently()).enableHttpCache(0, 0L).enableNetworkQualityEstimator(true);
                    if (C70011d.m268581a().loggerDebug()) {
                        enableNetworkQualityEstimator.enableVerboseLog();
                    }
                    if (sNetworkThreadPriority >= -20 && sNetworkThreadPriority <= 19) {
                        enableNetworkQualityEstimator.setThreadPriority(sNetworkThreadPriority);
                    }
                    if (C70010c.m268520a().mo246380K()) {
                        enableNetworkQualityEstimator.enableBrotli(true);
                    }
                    if (C70010c.m268520a().mo246378I()) {
                        enableNetworkQualityEstimator.enableQuic(true);
                    }
                    if (C70010c.m268520a().mo246379J()) {
                        enableNetworkQualityEstimator.enableHttp2(true);
                    }
                    enableNetworkQualityEstimator.setAppInfoProvider((TTAppInfoProvider) C70008a.m268518a(context));
                    enableNetworkQualityEstimator.setEventListener((TTEventListener) C70013e.m268582a());
                    if (C70014f.m268590a(context)) {
                        enableNetworkQualityEstimator.setAppMonitorProvider((TTMonitorProvider) C70009b.m268519a());
                        C70013e.m268582a().mo246430a(true);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        enableNetworkQualityEstimator.setUserAgent(str + " cronet/" + "TTNetVersion:95b5f412 2021-12-20 QuicVersion:77c47651 2021-11-24");
                    }
                    String domainConfigByRegion = getDomainConfigByRegion();
                    if (TextUtils.isEmpty(domainConfigByRegion)) {
                        domainConfigByRegion = C70010c.m268520a().mo246373D();
                    }
                    if (!TextUtils.isEmpty(domainConfigByRegion)) {
                        enableNetworkQualityEstimator.setGetDomainDefaultJSON(domainConfigByRegion);
                    }
                    ArrayList<byte[]> E = C70010c.m268520a().mo246374E();
                    if (E != null && !E.isEmpty()) {
                        enableNetworkQualityEstimator.setOpaqueData(E);
                    }
                    Map<String[], Pair<byte[], byte[]>> F = C70010c.m268520a().mo246375F();
                    if (F != null && !F.isEmpty()) {
                        enableNetworkQualityEstimator.setClientOpaqueData(F);
                    }
                    Map<String, Pair<Integer, Integer>> L = C70010c.m268520a().mo246381L();
                    if (L != null && !L.isEmpty()) {
                        for (Map.Entry<String, Pair<Integer, Integer>> entry : L.entrySet()) {
                            enableNetworkQualityEstimator.addQuicHint(entry.getKey(), ((Integer) entry.getValue().first).intValue(), ((Integer) entry.getValue().second).intValue());
                        }
                    }
                    try {
                        str2 = context.getCacheDir().getPath() + "/";
                        enableNetworkQualityEstimator.setStoragePath(str2 + "ttnet_storage/");
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    if (C70010c.m268520a().mo246385P()) {
                        enableNetworkQualityEstimator.setLibraryLoader((CronetEngine.Builder.LibraryLoader) new CronetEngine.Builder.LibraryLoader() {
                            /* class org.chromium.CronetClient.C700051 */

                            @Override // com.ttnet.org.chromium.net.CronetEngine.Builder.LibraryLoader
                            public void loadLibrary(String str) {
                                C70010c.m268520a().mo246405c(str);
                            }
                        });
                    }
                    String Q = C70010c.m268520a().mo246386Q();
                    if (!TextUtils.isEmpty(Q)) {
                        String substring = Q.substring(Q.lastIndexOf(File.separator) + 1);
                        String absolutePath = context.getCacheDir().getAbsolutePath();
                        if (FileUtils.copyFile(Q, absolutePath, substring)) {
                            enableNetworkQualityEstimator.setCronetSoPath(absolutePath + File.separator + substring);
                        }
                    }
                    boolean M = C70010c.m268520a().mo246382M();
                    if (M) {
                        enableNetworkQualityEstimator.enableBoeProxy(true);
                    }
                    if (!M) {
                        String a = C14083a.m57013a(context, "ttnet_config.json");
                        if (!TextUtils.isEmpty(a)) {
                            try {
                                JSONObject jSONObject = new JSONObject(a);
                                String optString = jSONObject.optString("ttnet_proxy", "");
                                if (!TextUtils.isEmpty(optString)) {
                                    enableNetworkQualityEstimator.setProxyConfig(optString);
                                }
                                M = jSONObject.optBoolean("boe_proxy_enabled", false);
                                if (M) {
                                    enableNetworkQualityEstimator.enableBoeProxy(true);
                                }
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                        }
                    }
                    if (!M && (M = C14083a.m57021b(context))) {
                        enableNetworkQualityEstimator.enableBoeProxy(true);
                    }
                    if (M) {
                        String N = C70010c.m268520a().mo246383N();
                        if (!TextUtils.isEmpty(N)) {
                            enableNetworkQualityEstimator.setBypassBOEJSON(N);
                        }
                        String proxyConfig = getProxyConfig(str2);
                        if (!TextUtils.isEmpty(proxyConfig)) {
                            Log.e("CronetClient", "set proxy config: " + proxyConfig);
                            enableNetworkQualityEstimator.setProxyConfig(proxyConfig);
                        }
                    }
                    String O = C70010c.m268520a().mo246384O();
                    if (!TextUtils.isEmpty(O)) {
                        enableNetworkQualityEstimator.setStoreIdcRuleJSON(O);
                    }
                    try {
                        long aLogFuncAddr = getALogFuncAddr();
                        if (aLogFuncAddr != 0) {
                            Log.e("CronetClient", "set alog address: " + aLogFuncAddr);
                            enableNetworkQualityEstimator.setALogFuncAddr(aLogFuncAddr);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (Build.VERSION.SDK_INT < 18) {
                        try {
                            C1711a.m7628a("ttcrypto");
                            C1711a.m7628a("ttboringssl");
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    sCronetEngine = enableNetworkQualityEstimator.build();
                    TTNetInitMetrics.m56573b().f36592t = SystemClock.uptimeMillis() - uptimeMillis;
                    if (C70011d.m268581a().loggerDebug()) {
                        Logger.setLogLevel(2);
                    } else {
                        Logger.setLogLevel(4);
                    }
                    if (sCronetEngine instanceof ExperimentalCronetEngine) {
                        ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) sCronetEngine;
                        try {
                            long aLogFuncAddr2 = getALogFuncAddr();
                            if (aLogFuncAddr2 != 0) {
                                Log.e("CronetClient", "ensure setting alog address: " + aLogFuncAddr2);
                                experimentalCronetEngine.setAlogFuncAddr(aLogFuncAddr2);
                            }
                            int a2 = TTAppStateManager.m56569a();
                            if (a2 >= 0 && a2 <= 2) {
                                experimentalCronetEngine.setAppStartUpState(a2);
                            }
                            TTNetInitMetrics.m56573b().mo51510a(context, experimentalCronetEngine.getOpaqueFuncAddress());
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                }
                if (sCronetEngine instanceof ExperimentalCronetEngine) {
                    tryCreateRequestFinishedInfoListener(executor);
                    ((ExperimentalCronetEngine) sCronetEngine).addRequestFinishedListener(sRequestFinishedInfoListener);
                }
                TTNetInitMetrics.m56573b().f36583k = System.currentTimeMillis();
            }
        }
    }
}
