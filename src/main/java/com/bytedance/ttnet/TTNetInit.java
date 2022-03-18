package com.bytedance.ttnet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.frameworks.baselib.network.http.cronet.TTNetInitMetrics;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13996d;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13997e;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.bytedance.frameworks.baselib.network.http.impl.C14013f;
import com.bytedance.frameworks.baselib.network.http.impl.C14015g;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.C14055o;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.C14073i;
import com.bytedance.frameworks.baselib.network.http.util.C14083a;
import com.bytedance.frameworks.baselib.network.http.util.C14089g;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.retrofit2.C20638j;
import com.bytedance.ttnet.clientkey.ClientKeyManager;
import com.bytedance.ttnet.config.C20748a;
import com.bytedance.ttnet.config.C20755c;
import com.bytedance.ttnet.config.C20759f;
import com.bytedance.ttnet.http.HttpRequestInfo;
import com.bytedance.ttnet.p911b.C20742a;
import com.bytedance.ttnet.p912c.C20745a;
import com.bytedance.ttnet.p912c.C20747c;
import com.bytedance.ttnet.tnc.TNCManager;
import com.bytedance.ttnet.utils.C20790c;
import com.bytedance.ttnet.utils.C20793d;
import com.tt.frontendapiinterface.ApiHandler;
import java.net.CookieHandler;
import java.net.InetAddress;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class TTNetInit {
    private static volatile ENV env = ENV.RELEASE;
    private static volatile boolean sApiHttpInterceptEnabled = false;
    private static volatile String sClientIPString = "";
    private static volatile boolean sCookieLogReportEnabled = false;
    private static long sCookieManagerInitStartTime = 0;
    public static ICronetAppProvider sCronetProvider = null;
    private static volatile int sDelayTime = 10;
    public static Map<String, String> sGetDomainRegionMap;
    private static AbstractC20744c sITTNetDepend;
    private static volatile CountDownLatch sLatchInitCompleted = new CountDownLatch(1);
    private static volatile boolean sListenAppStateIndependently = false;
    private static volatile boolean sMainThreadInitCookieEnabled = true;
    private static volatile boolean sNotifiedColdStartFinsish = false;

    public enum ENV {
        DEBUG,
        RELEASE
    }

    public static void doCommand(Context context, String str) {
    }

    public static void setALogFuncAddr(long j) throws Exception {
    }

    public static void setEnableURLDispatcher(boolean z) throws Exception {
    }

    public static void setFirstRequestWaitTime(long j) {
    }

    public static void setHttpDnsForTesting(boolean z, boolean z2, boolean z3) throws Exception {
    }

    public static boolean urlDispatchEnabled() {
        return true;
    }

    public static boolean apiHttpInterceptEnabled() {
        return sApiHttpInterceptEnabled;
    }

    public static boolean cookieLogReportEnabled() {
        return sCookieLogReportEnabled;
    }

    public static String getClientIpString() {
        return sClientIPString;
    }

    public static ICronetAppProvider getCronetProvider() {
        return sCronetProvider;
    }

    public static ENV getEnv() {
        return env;
    }

    public static boolean getListenAppStateIndependently() {
        return sListenAppStateIndependently;
    }

    public static void useCustomizedCookieStoreName() {
        C14013f.m56738a();
    }

    public static long getALogFuncAddr() {
        return TTALog.getALogFuncAddr();
    }

    public static void getInitCompletedLatch() {
        try {
            sLatchInitCompleted.await(5, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static AbstractC20744c getTTNetDepend() {
        AbstractC20744c cVar = sITTNetDepend;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    public static boolean isPrivateApiAccessEnabled() {
        return getTTNetDepend().mo69992c();
    }

    private static void countDownInitCompletedLatch() {
        try {
            if (sLatchInitCompleted.getCount() > 0) {
                sLatchInitCompleted.countDown();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getEffectiveConnectionType() {
        try {
            return C13998f.m56620a(getTTNetDepend().mo69984a()).mo51551b();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static Map<String, C13996d> getGroupRttEstimates() throws Exception {
        return C13998f.m56620a(getTTNetDepend().mo69984a()).mo51555d();
    }

    public static C13996d getNetworkQuality() throws Exception {
        return C13998f.m56620a(getTTNetDepend().mo69984a()).mo51553c();
    }

    public static void notifyColdStartFinish() {
        if (sITTNetDepend != null && !sNotifiedColdStartFinsish) {
            sNotifiedColdStartFinsish = true;
            sITTNetDepend.mo69997h();
        }
    }

    static {
        TTALog.init();
    }

    public static void forceInitCronetKernel() throws Exception {
        TTNetInitMetrics.m56573b().f36574b = TTNetInitMetrics.CronetInitMode.FORCE_INIT;
        C13998f.m56620a(getTTNetDepend().mo69984a()).mo51548a(false, false, false, C20748a.m75596a(getTTNetDepend().mo69984a()).mo51562b(), true);
    }

    private static C13998f getCronetHttpClient() throws Exception {
        if (!HttpClient.isCronetClientEnable()) {
            return null;
        }
        C13998f a = C13998f.m56620a(getTTNetDepend().mo69984a());
        a.mo51548a(false, true, false, C20748a.m75596a(getTTNetDepend().mo69984a()).mo51562b(), false);
        return a;
    }

    private static void injectOkhttp3HttpDnsDepend() {
        String[] strArr;
        AbstractC20744c cVar = sITTNetDepend;
        String[] strArr2 = null;
        if (cVar == null || !(cVar instanceof AbstractC20729a)) {
            strArr = null;
        } else {
            String[] c = ((AbstractC20729a) cVar).mo69976c();
            strArr2 = ((AbstractC20729a) sITTNetDepend).mo69975b();
            strArr = c;
        }
        C14055o.m56893a(sITTNetDepend.mo69999j(), sITTNetDepend.mo70000k().get("httpdns"), strArr2, strArr);
    }

    public static void preInitCronetKernel() throws Exception {
        TTNetInitMetrics.m56573b().f36574b = TTNetInitMetrics.CronetInitMode.PRE_INIT;
        int i = -1;
        try {
            if (getCronetHttpClient() == null) {
                feedBackCronetInitFailedLog(C14055o.m56883a(), "");
            }
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                i = 3;
            }
            String a = C20793d.m75743a(th);
            if (a.length() > 1024) {
                a = a.substring(0, 1024);
            }
            feedBackCronetInitFailedLog(i, a);
            throw th;
        }
    }

    public static void enableApiHttpIntercept(boolean z) {
        sApiHttpInterceptEnabled = z;
    }

    public static void enableCookieLogReport(boolean z) {
        sCookieLogReportEnabled = z;
    }

    public static void setBypassOfflineCheck(boolean z) {
        C13998f.m56645b(z);
    }

    public static void setDelayTime(int i) {
        sDelayTime = i;
    }

    public static void setEnv(ENV env2) {
        env = env2;
    }

    public static void setListenAppStateIndependently(boolean z) {
        sListenAppStateIndependently = z;
    }

    public static void setMainThreadInitCookieEnabled(boolean z) {
        sMainThreadInitCookieEnabled = z;
    }

    public static void setProcessFlag(int i) {
        C14089g.m57045a(i);
    }

    public static void trySetDefaultUserAgent(String str) {
        NetworkParams.setDefaultUserAgent(str);
    }

    public static void clearClientOpaqueData(Context context) {
        C13998f.m56620a(context).mo51541a();
    }

    public static void onClientIPChanged(String str) {
        if (str != null) {
            sClientIPString = str;
        }
    }

    public static void trigerGetDomain(Context context) {
        triggerGetDomain(context, false);
    }

    public static void onActivityResume(final Activity activity) {
        if (activity != null) {
            new ThreadPlus("Network-AsyncResume") {
                /* class com.bytedance.ttnet.TTNetInit.C207287 */

                @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                public void run() {
                    C20748a.m75596a(activity).mo70029h();
                }
            }.start();
        }
    }

    public static void setCronetDepend(ICronetAppProvider iCronetAppProvider) {
        if (iCronetAppProvider != null) {
            sCronetProvider = iCronetAppProvider;
            TNCManager.m75682a(iCronetAppProvider);
            return;
        }
        throw new IllegalArgumentException("cronetDepend is null");
    }

    public static void setGetDomainRegionMap(Map<String, String> map) {
        if (map != null) {
            sGetDomainRegionMap = map;
            return;
        }
        throw new IllegalArgumentException("getDomainRegionMap is null");
    }

    public static void setHostResolverRulesForTesting(String str) throws Exception {
        C13998f cronetHttpClient = getCronetHttpClient();
        if (cronetHttpClient != null) {
            cronetHttpClient.mo51559g(str);
        }
    }

    public static void setProxy(String str) throws Exception {
        C13998f.m56620a(getTTNetDepend().mo69984a()).mo51558f(str);
    }

    public static List<InetAddress> dnsLookup(String str) throws Exception {
        return C13998f.m56620a(getTTNetDepend().mo69984a()).mo51552b(str);
    }

    public static void getMappingRequestState(String str) {
        try {
            C13998f.m56620a(getTTNetDepend().mo69984a()).mo51557e(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static C13997e getPacketLossRateMetrics(int i) throws Exception {
        return C13998f.m56620a(getTTNetDepend().mo69984a()).mo51539a(i);
    }

    public static void preconnectUrl(String str) throws Exception {
        try {
            new URL(str).toURI();
            C13998f.m56620a(getTTNetDepend().mo69984a()).mo51556d(str);
        } catch (Exception e) {
            throw e;
        }
    }

    public static C14002h ttUrlDispatch(String str) throws Exception {
        try {
            new URL(str).toURI();
            return C13998f.m56620a(getTTNetDepend().mo69984a()).mo51554c(str);
        } catch (Exception e) {
            throw e;
        }
    }

    public static String getGetDomainConfigByRegion(String str) {
        Map<String, String> map = sGetDomainRegionMap;
        if (map == null || map.isEmpty() || sCronetProvider == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return sGetDomainRegionMap.get(str.toLowerCase());
    }

    public static void setCookieHandler(final Context context) {
        try {
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null && (cookieHandler instanceof C14015g)) {
                NetworkParams.setCookieMgrInited(true);
            } else if (sCookieManagerInitStartTime <= 0) {
                NetworkParams.setCookieMgrInited(true);
            } else {
                CookieManager cookieManager = null;
                try {
                    cookieManager = CookieManager.getInstance();
                } catch (Throwable th) {
                    sDelayTime = 0;
                    CookieInitFailedReport(context, th.getMessage());
                }
                CookieHandler.setDefault(new C14015g(context, sDelayTime, cookieManager, getTTNetDepend().mo69998i(), new C14015g.AbstractC14017a() {
                    /* class com.bytedance.ttnet.TTNetInit.C207265 */

                    @Override // com.bytedance.frameworks.baselib.network.http.impl.C14015g.AbstractC14017a
                    /* renamed from: a */
                    public void mo51621a(String str, String str2, JSONObject jSONObject) {
                        if (TTNetInit.cookieLogReportEnabled()) {
                            TTNetInit.getTTNetDepend().mo69986a(context, str, str2, jSONObject);
                        }
                    }
                }));
                NetworkParams.setCookieMgrInited(true);
            }
        } catch (Throwable th2) {
            CookieInitFailedReport(context, th2.getMessage());
            th2.printStackTrace();
        }
    }

    public static void setTTNetDepend(AbstractC20744c cVar) {
        sITTNetDepend = cVar;
        Map<String, String> k = getTTNetDepend().mo70000k();
        if (TextUtils.isEmpty(k.get("httpdns")) || TextUtils.isEmpty(k.get("netlog")) || (TextUtils.isEmpty(k.get("boe")) && TextUtils.isEmpty(k.get("boe_https")))) {
            sITTNetDepend = null;
            throw new IllegalArgumentException("You must set HttpDns, NetLog and BOE service domain, please refer to TTNet access documents.");
        }
        C14083a.m57017a(k.get("boe"));
        C14083a.m57020b(k.get("boe_https"));
        injectOkhttp3HttpDnsDepend();
    }

    public static void monitorLogSend(String str, JSONObject jSONObject) {
        AbstractC20744c cVar = sITTNetDepend;
        if (cVar != null) {
            cVar.mo69990a(str, jSONObject);
        }
    }

    public static void removeClientOpaqueData(Context context, String str) {
        C13998f.m56620a(context).mo51543a(str);
    }

    public static void triggerGetDomain(Context context, boolean z) {
        C13998f.m56620a(context).mo51546a(z);
    }

    public static C20747c TTDnsResolve(String str, int i) throws Exception {
        return C20745a.m75575a().mo70001a(str, i);
    }

    private static void CookieInitFailedReport(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", "failed");
            jSONObject.put(ApiHandler.API_CALLBACK_EXCEPTION, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getTTNetDepend().mo69986a(context, "TTNET-COOKIE", "init", jSONObject);
    }

    private static void feedBackCronetInitFailedLog(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", i);
            jSONObject.put(ApiHandler.API_CALLBACK_EXCEPTION, str);
            jSONObject.put("model", Build.MODEL);
            String str2 = "";
            if (Build.VERSION.SDK_INT < 21) {
                str2 = Build.CPU_ABI;
            } else {
                String[] strArr = Build.SUPPORTED_ABIS;
                if (strArr != null && strArr.length > 0) {
                    str2 = Arrays.asList(strArr).toString();
                }
            }
            jSONObject.put("abis", str2);
            getTTNetDepend().mo69990a("cronet_failed", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public static boolean tryStartTTNetDetect(String[] strArr, int i, int i2) {
        if (strArr != null && strArr.length > 0 && i > 0 && i <= 180 && i2 >= 0) {
            try {
                C13998f.m56620a(getTTNetDepend().mo69984a()).mo51549a(strArr, i, i2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    public static void tryInitCookieManager(final Context context, final boolean z, final boolean z2) {
        try {
            sCookieManagerInitStartTime = System.currentTimeMillis();
            if (z) {
                CookieSyncManager.createInstance(context);
                CookieManager instance = CookieManager.getInstance();
                instance.setAcceptCookie(true);
                setCookieHandler(context);
                if (Logger.debug()) {
                    Logger.m15167d("Process", " CookieManager = " + instance.toString() + " pid = " + Process.myPid());
                }
            } else {
                NetworkParams.setCookieMgrInited(true);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            if (C14089g.m57048b(context) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                if (sMainThreadInitCookieEnabled) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        /* class com.bytedance.ttnet.TTNetInit.RunnableC207276 */

                        public void run() {
                            TTNetInit.tryInitCookieManager(context, z, z2);
                        }
                    });
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error", th.getMessage());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                AbstractC20744c cVar = sITTNetDepend;
                if (cVar != null) {
                    cVar.mo69990a("async_init_cookie_manager_fail", jSONObject);
                }
                CookieInitFailedReport(context, th.getMessage());
            }
        }
        ClientKeyManager.m75584a().mo70012a(z2);
    }

    public static void addClientOpaqueData(Context context, String[] strArr, byte[] bArr, byte[] bArr2) {
        C13998f.m56620a(context).mo51550a(strArr, bArr, bArr2);
    }

    public static void enableTTBizHttpDns(boolean z, String str, String str2, String str3, boolean z2, String str4) {
        if (!z || (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3))) {
            try {
                C13998f cronetHttpClient = getCronetHttpClient();
                if (cronetHttpClient != null) {
                    cronetHttpClient.mo51547a(z, str, str2, str3, z2, str4);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void tryInitTTNet(final Context context, Application application, NetworkParams.AbstractC13968b<HttpRequestInfo> bVar, NetworkParams.AbstractC13974h<HttpRequestInfo> hVar, NetworkParams.AbstractC13971e eVar, final boolean z, boolean... zArr) {
        boolean z2;
        TTNetInitMetrics.m56573b().f36577e = System.currentTimeMillis();
        if (context != null) {
            C20755c.m75628a();
            C20742a.m75549a(context);
            C20638j.m75018a(Logger.getLogLevel());
            NetworkParams.setApiProcessHook(bVar);
            HttpRequestInfo.injectCreate();
            KevaBuilder.getInstance().setContext(context);
            if (zArr == null || zArr.length <= 0) {
                z2 = false;
            } else {
                z2 = zArr[0];
            }
            boolean b = C14089g.m57048b(context);
            C20759f.m75646a(context);
            if (b) {
                new ThreadPlus("NetWork-AsyncInit") {
                    /* class com.bytedance.ttnet.TTNetInit.C207221 */

                    @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                    public void run() {
                        C20748a.m75596a(context).mo70029h();
                        C20748a.m75596a(context).mo70022a(TNCManager.TNCUpdateSource.TTSERVER, true);
                        TTNetInit.tryInitCookieManager(context, z, true);
                    }
                }.start();
            }
            TNCManager.m75687b().mo70054a(context, b);
            C14073i.m56967a().mo51752a(context);
            C20748a.m75596a(context);
            TTNetInitMetrics.m56573b().mo51509a(context);
            if (C14089g.m57046a(context) || (!b && z2)) {
                new ThreadPlus("NetWork-AsyncInit-other") {
                    /* class com.bytedance.ttnet.TTNetInit.C207232 */

                    @Override // com.bytedance.common.utility.concurrent.ThreadPlus
                    public void run() {
                        C20748a.m75596a(context).mo70029h();
                        TTNetInit.tryInitCookieManager(context, z, false);
                        C20748a.m75596a(context).mo70022a(TNCManager.TNCUpdateSource.TTSERVER, true);
                    }
                }.start();
            }
            if (b || C14089g.m57050d(context)) {
                NetworkParams.setMonitorProcessHook(hVar);
            }
            countDownInitCompletedLatch();
            if (!b) {
                TTNetInitMetrics.m56573b().f36575c = false;
                TTNetInitMetrics.m56573b().f36578f = System.currentTimeMillis();
                return;
            }
            NetworkParams.setCommandListener(eVar);
            if (C20790c.m75733a() == null) {
                C20790c.m75735a(new C20790c.AbstractC20792b() {
                    /* class com.bytedance.ttnet.TTNetInit.C207243 */

                    @Override // com.bytedance.ttnet.utils.C20790c.AbstractC20792b
                    /* renamed from: a */
                    public void mo69964a(String str, String str2, String str3, HttpRequestInfo httpRequestInfo) {
                    }

                    @Override // com.bytedance.ttnet.utils.C20790c.AbstractC20792b
                    /* renamed from: a */
                    public void mo69963a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
                        int i2;
                        if (z) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("url", str2);
                            jSONObject2.put("value", i);
                            jSONObject2.put("ext_value", i2);
                            jSONObject2.put("extraObject", jSONObject);
                            TTNetInit.getTTNetDepend().mo69986a(context, "set_cookie", str, jSONObject2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            }
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.bytedance.ttnet.TTNetInit.C207254 */

                    public void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    public void onActivityDestroyed(Activity activity) {
                    }

                    public void onActivityPaused(Activity activity) {
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public void onActivityStarted(Activity activity) {
                    }

                    public void onActivityStopped(Activity activity) {
                    }

                    public void onActivityResumed(Activity activity) {
                        TTNetInit.onActivityResume(activity);
                    }
                });
            }
            if (!HttpClient.isCronetClientEnable()) {
                Log.d("TTNetInit", "cronet disable");
                notifyColdStartFinish();
            }
            TTNetInitMetrics.m56573b().f36578f = System.currentTimeMillis();
            return;
        }
        throw new IllegalArgumentException("tryInitTTNet context is null");
    }
}
