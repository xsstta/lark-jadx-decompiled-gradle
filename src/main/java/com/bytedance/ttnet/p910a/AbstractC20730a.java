package com.bytedance.ttnet.p910a;

import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.frameworks.baselib.network.http.BaseHttpRequestInfo;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend;
import com.bytedance.frameworks.baselib.network.http.p742b.C13984b;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.bytedance.ttnet.AbstractC20729a;
import com.bytedance.ttnet.AbstractC20744c;
import com.bytedance.ttnet.HttpClient;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.config.C20748a;
import com.bytedance.ttnet.config.C20754b;
import com.bytedance.ttnet.p912c.C20745a;
import com.ss.android.socialbase.downloader.downloader.AbstractC60044a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.a.a */
public abstract class AbstractC20730a implements ICronetAppProvider, ICronetDepend {
    /* renamed from: a */
    public void mo69977a(int i) {
    }

    /* renamed from: a */
    public void mo69978a(int i, double d, double d2, double d3, double d4) {
    }

    /* renamed from: a */
    public void mo69979a(int i, int i2) {
    }

    /* renamed from: a */
    public void mo69980a(int i, int i2, int i3) {
    }

    /* renamed from: a */
    public void mo69981a(String str) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void doLoadLibrary(String str) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbClient() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFeature() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbFlag() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppId() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAppName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getBypassBOEJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCarrierRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getChannel() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCityName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String[], Pair<byte[], byte[]>> getClientOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDevicePlatform() {
        return "android";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getGetDomainDefaultJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getHttpDnsRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getIId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getLanguage() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getManifestVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public ArrayList<byte[]> getOpaqueData() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOpenUdid() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, Pair<Integer, Integer>> getQuicHint() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkAppId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSdkVersion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public String getSsCookieKey() {
        return "X-SS-Cookie";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSsmix() {
        return AbstractC60044a.f149675a;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdc() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getStoreIdcRuleJSON() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getSysRegion() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getTNCRequestFlags() {
        return "0";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestHeader() {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUUID() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUpdateVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getUserId() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionCode() {
        return "-1";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getVersionName() {
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isBOEProxyEnabled() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableBrotli() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableHttp2() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean isEnableQuic() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public boolean needCustomLoadLibrary() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void sendAppMonitorEvent(String str, String str2) {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void setAdapter(ICronetDepend iCronetDepend) {
    }

    protected AbstractC20730a() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceBrand() {
        return Build.BRAND;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceModel() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDeviceType() {
        return Build.MODEL;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSApi() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final int getProcessFlag() {
        return C14089g.m57044a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public boolean loggerDebug() {
        return Logger.debug();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getAbi() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getNetAccessType() {
        return NetworkUtils.getNetworkAccessType(TTNetInit.getTTNetDepend().mo69984a());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getRticket() {
        return String.valueOf(System.currentTimeMillis());
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getCronetSoPath() {
        return C20748a.m75596a(TTNetInit.getTTNetDepend().mo69984a()).mo70032l();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getDPI() {
        int dpi = UIUtils.getDpi(TTNetInit.getTTNetDepend().mo69984a());
        if (dpi > 0) {
            return String.valueOf(dpi);
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getOSVersion() {
        try {
            String str = Build.VERSION.RELEASE;
            if (str == null || str.length() <= 10) {
                return str;
            }
            return str.substring(0, 10);
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public String getResolution() {
        String screenResolution = UIUtils.getScreenResolution(TTNetInit.getTTNetDepend().mo69984a());
        if (!StringUtils.isEmpty(screenResolution)) {
            return screenResolution;
        }
        return "";
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getTNCRequestQuery() {
        AbstractC20744c tTNetDepend = TTNetInit.getTTNetDepend();
        if (tTNetDepend == null || !(tTNetDepend instanceof AbstractC20729a)) {
            return null;
        }
        return ((AbstractC20729a) tTNetDepend).mo69974a();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onColdStartFinish() {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onColdStartFinish");
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207322 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                TTNetInit.notifyColdStartFinish();
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onCronetBootSucceed() {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onCronetBootSucceed... ");
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207366 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                C20748a.m75596a(TTNetInit.getTTNetDepend().mo69984a()).mo70031k();
                HttpClient.setCronetBootSucceed(true);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> getGetDomainDependHostMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] d = TTNetInit.getTTNetDepend().mo69993d();
        if (d != null) {
            if (d.length > 0) {
                linkedHashMap.put("first", d[0]);
            }
            if (d.length > 1) {
                linkedHashMap.put("second", d[1]);
            }
            if (d.length > 2) {
                linkedHashMap.put("third", d[2]);
            }
        }
        Map<String, String> k = TTNetInit.getTTNetDepend().mo70000k();
        if (TextUtils.isEmpty(k.get("httpdns")) || TextUtils.isEmpty(k.get("netlog")) || (TextUtils.isEmpty(k.get("boe")) && TextUtils.isEmpty("boe_https"))) {
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        linkedHashMap.putAll(k);
        return linkedHashMap;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigEtagChanged(final String str) {
        try {
            new ThreadPlus("NetWork-Event") {
                /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207311 */

                @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                public void run() {
                    try {
                        C20748a.m75596a(TTNetInit.getTTNetDepend().mo69984a()).mo70027d(str);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }.start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onClientIPChanged(final String str) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onClientIPChanged");
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207333 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                TTNetInit.onClientIPChanged(str);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onEffectiveConnectionTypeChanged(final int i) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onEffectiveConnectionTypeChanged state = " + i);
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.AnonymousClass10 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                AbstractC20730a.this.mo69977a(i);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onServerConfigUpdated(final String str) {
        try {
            if (Logger.debug()) {
                Logger.m15167d("CronetDependAdapter", "config = " + str);
            }
            new ThreadPlus("NetWork-Event") {
                /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207377 */

                @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                public void run() {
                    try {
                        C20748a.m75596a(TTNetInit.getTTNetDepend().mo69984a()).mo70026c(str);
                        ClientKeyManager.m75584a().mo70010a(str);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }.start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTNetDetectInfoChanged(final String str) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onTTNetDetectInfoChanged result = " + str);
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207399 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                try {
                    AbstractC20730a.this.mo69981a(str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetDepend
    public void loggerD(String str, String str2) {
        Logger.m15167d(str, str2);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTNCUpdateFailed(final ArrayList<String> arrayList, final String str) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onTNCUpdateFailed");
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207355 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                C20754b.m75626a().mo70035a(arrayList, str);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public Map<String, String> onCallToAddSecurityFactor(String str, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        return NetworkParams.tryAddSecurityFactor(str, hashMap);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onMultiNetworkStateChanged(final int i, final int i2) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onMultiNetworkStateChanged prev state = " + i + ", curr state = " + i2);
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.AnonymousClass13 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                AbstractC20730a.this.mo69979a(i, i2);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onStoreIdcChanged(final String str, final String str2, final String str3) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onStoreIdcChanged");
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207344 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                C20740b.m75544a().mo69982a(str, str2, str3);
                C13984b.m56548a().mo51414a(str, str2, str3);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onRTTOrThroughputEstimatesComputed(final int i, final int i2, final int i3) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onRTTOrThroughputEstimatesComputed httpRtt = " + i + ", transportRttMs = " + i2 + ",downstreamThroughputKbps = " + i3);
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.AnonymousClass11 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                AbstractC20730a.this.mo69980a(i, i2, i3);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void onPacketLossComputed(final int i, final double d, final double d2, final double d3, final double d4) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onPacketLossComputed protocol = " + i + ", upstreamLossRate = " + d + ", upstreamLossRateVariance = " + d2 + ", downstreamLossRate = " + d3 + ", downstreamLossRateVariance = " + d4);
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.AnonymousClass12 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                AbstractC20730a.this.mo69978a(i, d, d2, d3, d4);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public final void onTTDnsResolveResult(final String str, final String str2, final int i, final int i2, final int i3, final List<String> list, final String str3) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "onTTDnsResolveResult uuid = " + str + " host = " + str2);
        }
        new ThreadPlus("NetWork-Event") {
            /* class com.bytedance.ttnet.p910a.AbstractC20730a.C207388 */

            @Override // com.bytedance.common.utility.concurrent.ThreadPlus
            public void run() {
                C20745a.m75575a().mo70002a(str, str2, i, i2, i3, list, str3);
            }
        }.start();
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider
    public void handleApiResult(boolean z, String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, boolean z2, long j11, long j12, String str4, String str5, String str6, Exception exc) {
        if (Logger.debug()) {
            Logger.m15167d("CronetDependAdapter", "handleApiResult, succ: " + z + " url: " + str + "tracecode: " + str2 + " remoteIp: " + str3 + " appStart: " + j);
        }
        BaseHttpRequestInfo createHttpRequestInfo = BaseHttpRequestInfo.createHttpRequestInfo();
        createHttpRequestInfo.remoteIp = str3;
        createHttpRequestInfo.appLevelRequestStart = j;
        createHttpRequestInfo.beforeAllInterceptors = j;
        createHttpRequestInfo.requestStart = j2;
        createHttpRequestInfo.responseBack = j3;
        createHttpRequestInfo.completeReadResponse = j4;
        createHttpRequestInfo.requestEnd = j5;
        createHttpRequestInfo.dnsTime = j6;
        createHttpRequestInfo.connectTime = j7;
        createHttpRequestInfo.sslTime = j8;
        createHttpRequestInfo.sendTime = j9;
        createHttpRequestInfo.receiveTime = j10;
        createHttpRequestInfo.isSocketReused = z2;
        createHttpRequestInfo.ttfbMs = j11;
        long j13 = j5 - j2;
        createHttpRequestInfo.totalTime = j13;
        createHttpRequestInfo.receivedByteCount = j12;
        createHttpRequestInfo.requestLog = str4;
        createHttpRequestInfo.requestHeaders = str5;
        createHttpRequestInfo.responseHeaders = str6;
        createHttpRequestInfo.httpClientType = 0;
        if (z) {
            NetworkParams.handleApiOk(str, j13, createHttpRequestInfo);
            NetworkParams.monitorApiSample(j13, j2, str, str2, createHttpRequestInfo);
            return;
        }
        NetworkParams.handleApiError(str, exc, j13, createHttpRequestInfo);
        NetworkParams.monitorApiError(j13, j2, str, str2, createHttpRequestInfo, exc);
    }
}
