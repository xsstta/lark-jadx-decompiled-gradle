package com.bytedance.frameworks.baselib.network.http;

import android.os.Looper;
import android.webkit.CookieManager;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.impl.C14003a;
import com.bytedance.retrofit2.C20639k;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class NetworkParams {
    private static volatile AbstractC13977k sAddResponseHeadersCallback;
    private static AbstractC13967a sAddSecurityFactorProcessCallback;
    private static AbstractC13969c sApiInterceptor;
    private static AbstractC13968b sApiProcessHook;
    private static AbstractC13970d sAppCookieStore;
    private static CdnConnectionQualitySamplerHook sCdnConnectionQualitySamplerHook;
    private static AbstractC13971e sCommandListener;
    private static AbstractC13972f sConnectionQualitySamplerHook;
    private static CountDownLatch sCookieInitedCountDown = new CountDownLatch(1);
    private static final Object sCookieLock = new Object();
    private static volatile AtomicBoolean sCookieMgrInited = new AtomicBoolean(false);
    private static AbstractC13973g sCookieShareInterceptor;
    private static boolean sEnableMainThreadCheck = false;
    private static AbstractC13974h sMonitorProcessHook;
    private static volatile boolean sNewCookieBlockPositionEnabled = false;
    private static AbstractC13975i sOldMonitorProcessHook;
    private static AbstractC13976j sStreamProcessor;
    private static volatile int sUseDnsMapping = -1;
    private static String sUserAgent;

    public interface CdnConnectionQualitySamplerHook {
        boolean cdnShouldSampling(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$a */
    public interface AbstractC13967a {
        /* renamed from: a */
        Map<String, String> mo51362a(String str, Map<String, List<String>> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$b */
    public interface AbstractC13968b<T extends BaseHttpRequestInfo> {
        /* renamed from: a */
        String mo51363a(String str, boolean z);

        /* renamed from: a */
        String mo51364a(String str, boolean z, Object... objArr);

        /* renamed from: a */
        Map<String, String> mo51365a(int i);

        /* renamed from: a */
        void mo51366a();

        /* renamed from: a */
        void mo51367a(String str, long j, T t);

        /* renamed from: a */
        void mo51368a(String str, Throwable th, long j, T t);

        /* renamed from: a */
        void mo51369a(Map<String, String> map, boolean z);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$c */
    public interface AbstractC13969c<T extends BaseRequestContext> {
        /* renamed from: a */
        String mo51370a(String str, T t);

        /* renamed from: a */
        void mo51371a(String str, String str2, boolean z) throws IOException;
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$d */
    public interface AbstractC13970d {
        /* renamed from: a */
        Map<String, List<String>> mo51372a(URI uri, Map<String, List<String>> map);

        /* renamed from: b */
        void mo51373b(URI uri, Map<String, List<String>> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$e */
    public interface AbstractC13971e {
        /* renamed from: a */
        String mo51374a();

        /* renamed from: a */
        void mo51375a(List<String> list);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$f */
    public interface AbstractC13972f {
        /* renamed from: a */
        boolean mo51376a(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$g */
    public interface AbstractC13973g {
        /* renamed from: a */
        List<String> mo51377a(CookieManager cookieManager, C14003a aVar, URI uri);

        /* renamed from: b */
        List<String> mo51378b(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$h */
    public interface AbstractC13974h<T extends BaseHttpRequestInfo> {
        /* renamed from: a */
        void mo51379a(long j, long j2, String str, String str2, T t);

        /* renamed from: a */
        void mo51380a(long j, long j2, String str, String str2, T t, Throwable th);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$i */
    public interface AbstractC13975i {
        /* renamed from: a */
        boolean mo51381a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$j */
    public interface AbstractC13976j {
        /* renamed from: a */
        InputStream mo51382a(InputStream inputStream, Map<String, List<String>> map, C20639k kVar);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.NetworkParams$k */
    public interface AbstractC13977k {
        /* renamed from: a */
        boolean mo51383a(Map<String, List<String>> map);
    }

    public static int getConnectTimeout() {
        return 15000;
    }

    public static int getIoTimeout() {
        return 15000;
    }

    public static void setDynamicTimeOutEnable(boolean z) {
    }

    public static AbstractC13969c getApiRequestInterceptor() {
        return sApiInterceptor;
    }

    public static AbstractC13970d getAppCookieStore() {
        return sAppCookieStore;
    }

    public static CdnConnectionQualitySamplerHook getCdnConnectionQualitySamplerHook() {
        return sCdnConnectionQualitySamplerHook;
    }

    public static AbstractC13971e getCommandListener() {
        return sCommandListener;
    }

    public static AbstractC13972f getConnectionQualitySamplerHook() {
        return sConnectionQualitySamplerHook;
    }

    public static AbstractC13973g getCookieShareInterceptor() {
        return sCookieShareInterceptor;
    }

    public static boolean getEnableMainThreadCheck() {
        return sEnableMainThreadCheck;
    }

    public static AbstractC13976j getStreamProcessor() {
        return sStreamProcessor;
    }

    public static String getUserAgent() {
        return sUserAgent;
    }

    public static boolean newCookieBlockPositionEnabled() {
        return sNewCookieBlockPositionEnabled;
    }

    public static boolean getUseDnsMapping() {
        if (sUseDnsMapping != 0) {
            return true;
        }
        return false;
    }

    public static void tryApiProcessHookInit() {
        AbstractC13968b bVar = sApiProcessHook;
        if (bVar != null) {
            bVar.mo51366a();
        }
    }

    public static CookieManager tryNecessaryInit() {
        return tryNecessaryInit("");
    }

    private static void cookieInitedCountDown() {
        CountDownLatch countDownLatch = sCookieInitedCountDown;
        if (countDownLatch != null && countDownLatch.getCount() > 0) {
            sCookieInitedCountDown.countDown();
        }
    }

    public static CookieManager tryCookieManagerInit() {
        synchronized (sCookieLock) {
            if (!sCookieMgrInited.get()) {
                try {
                    CountDownLatch countDownLatch = sCookieInitedCountDown;
                    if (countDownLatch != null) {
                        countDownLatch.await(5000, TimeUnit.MILLISECONDS);
                        if (sCookieInitedCountDown.getCount() == 1) {
                            sCookieInitedCountDown.countDown();
                        }
                    }
                } catch (Exception unused) {
                }
                sCookieMgrInited.getAndSet(true);
            }
        }
        CookieManager cookieManager = null;
        try {
            cookieManager = CookieManager.getInstance();
            if (!cookieManager.acceptCookie()) {
                cookieManager.setAcceptCookie(true);
            }
        } catch (Throwable unused2) {
        }
        return cookieManager;
    }

    public static void setAddSecurityFactorProcessCallback(AbstractC13967a aVar) {
        sAddSecurityFactorProcessCallback = aVar;
    }

    public static void setApiProcessHook(AbstractC13968b bVar) {
        sApiProcessHook = bVar;
    }

    public static void setApiRequestInterceptor(AbstractC13969c cVar) {
        sApiInterceptor = cVar;
    }

    public static void setAppCookieStore(AbstractC13970d dVar) {
        sAppCookieStore = dVar;
    }

    public static void setCdnConnectionQualitySamplerHook(CdnConnectionQualitySamplerHook cdnConnectionQualitySamplerHook) {
        sCdnConnectionQualitySamplerHook = cdnConnectionQualitySamplerHook;
    }

    public static void setCommandListener(AbstractC13971e eVar) {
        sCommandListener = eVar;
    }

    public static void setConnectionQualitySamplerHook(AbstractC13972f fVar) {
        sConnectionQualitySamplerHook = fVar;
    }

    public static void setCookieShareInterceptor(AbstractC13973g gVar) {
        sCookieShareInterceptor = gVar;
    }

    public static void setEnableMainThreadCheck(boolean z) {
        sEnableMainThreadCheck = z;
    }

    public static void setMonitorProcessHook(AbstractC13974h hVar) {
        sMonitorProcessHook = hVar;
    }

    public static void setNewCookieBlockPositionEnabled(boolean z) {
        sNewCookieBlockPositionEnabled = z;
    }

    public static void setOldMonitorProcessHook(AbstractC13975i iVar) {
        sOldMonitorProcessHook = iVar;
    }

    public static void setStreamProcessor(AbstractC13976j jVar) {
        sStreamProcessor = jVar;
    }

    public static void setUseDnsMapping(int i) {
        sUseDnsMapping = i;
    }

    public static String filterUrl(String str) {
        return filterUrl(str, null);
    }

    public static Map<String, String> getCommonParamsByLevel(int i) {
        AbstractC13968b bVar = sApiProcessHook;
        if (bVar != null) {
            return bVar.mo51365a(i);
        }
        return null;
    }

    public static boolean interceptCookie(Object obj) {
        if (obj == null || !(obj instanceof BaseRequestContext) || !((BaseRequestContext) obj).bypassCookie) {
            return false;
        }
        return true;
    }

    public static synchronized void setAddResponseHeadersCallback(AbstractC13977k kVar) {
        synchronized (NetworkParams.class) {
            sAddResponseHeadersCallback = kVar;
        }
    }

    public static CookieManager tryNecessaryInit(String str) {
        tryApiProcessHookInit();
        return tryCookieManagerInit();
    }

    public static boolean onCallToResponseCallback(Map<String, List<String>> map) {
        if (sAddResponseHeadersCallback == null) {
            return false;
        }
        boolean a = sAddResponseHeadersCallback.mo51383a(map);
        map.remove("bdturing-verify");
        return a;
    }

    public static void setCookieMgrInited(boolean z) {
        if (sCookieMgrInited.get() != z) {
            sCookieMgrInited.getAndSet(z);
            cookieInitedCountDown();
            if (!z) {
                sCookieInitedCountDown = new CountDownLatch(1);
            }
        }
    }

    public static void setDefaultUserAgent(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    char[] charArray = str.toCharArray();
                    int length = charArray.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        if (charArray[i] < ' ' || charArray[i] > '~') {
                            charArray[i] = '?';
                            z = true;
                        }
                    }
                    if (z) {
                        str = new String(charArray);
                    }
                }
            } catch (Exception unused) {
            }
        }
        sUserAgent = str;
    }

    public static void putCommonParams(Map<String, String> map, boolean z) {
        AbstractC13968b bVar = sApiProcessHook;
        if (bVar != null) {
            bVar.mo51369a(map, z);
        }
    }

    public static String addCommonParams(String str, boolean z) {
        AbstractC13968b bVar = sApiProcessHook;
        if (bVar != null) {
            return bVar.mo51363a(str, z);
        }
        return str;
    }

    public static String filterUrl(String str, BaseRequestContext baseRequestContext) {
        AbstractC13969c cVar;
        if (!StringUtils.isEmpty(str) && (cVar = sApiInterceptor) != null) {
            return cVar.mo51370a(str, baseRequestContext);
        }
        return str;
    }

    public static Map<String, String> tryAddSecurityFactor(String str, Map<String, List<String>> map) {
        AbstractC13967a aVar = sAddSecurityFactorProcessCallback;
        if (aVar != null) {
            return aVar.mo51362a(str, map);
        }
        return null;
    }

    public static boolean shouldRetryRequestFromTuringHeaders(int i, Map<String, List<String>> map) {
        if (i != 200 || Looper.getMainLooper() == Looper.myLooper()) {
            return false;
        }
        return onCallToResponseCallback(map);
    }

    public static String tryAddRequestVertifyParams(String str, boolean z, Object... objArr) {
        AbstractC13968b bVar = sApiProcessHook;
        if (bVar != null) {
            return bVar.mo51364a(str, z, objArr);
        }
        return str;
    }

    public static void handleApiOk(String str, long j, BaseHttpRequestInfo baseHttpRequestInfo) {
        AbstractC13968b bVar = sApiProcessHook;
        AbstractC13975i iVar = sOldMonitorProcessHook;
        if (!StringUtils.isEmpty(str) && j > 0 && bVar != null && iVar != null && iVar.mo51381a()) {
            bVar.mo51367a(str, j, baseHttpRequestInfo);
        }
    }

    public static void monitorApiHttp(String str, String str2, boolean z) throws IOException {
        AbstractC13969c cVar;
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && (cVar = sApiInterceptor) != null) {
            cVar.mo51371a(str, str2, z);
        }
    }

    public static void handleApiError(String str, Throwable th, long j, BaseHttpRequestInfo baseHttpRequestInfo) {
        if (!StringUtils.isEmpty(str) && th != null) {
            AbstractC13968b bVar = sApiProcessHook;
            AbstractC13975i iVar = sOldMonitorProcessHook;
            if (bVar != null && iVar != null && iVar.mo51381a()) {
                bVar.mo51368a(str, th, j, baseHttpRequestInfo);
            }
        }
    }

    public static void monitorApiSample(long j, long j2, String str, String str2, BaseHttpRequestInfo baseHttpRequestInfo) {
        AbstractC13974h hVar = sMonitorProcessHook;
        if (!StringUtils.isEmpty(str) && j > 0 && hVar != null) {
            if (!baseHttpRequestInfo.downloadFile || !baseHttpRequestInfo.hasReportStreamingApiAll.get()) {
                if (baseHttpRequestInfo.downloadFile) {
                    baseHttpRequestInfo.hasReportStreamingApiAll.set(true);
                }
                hVar.mo51379a(j, j2, str, str2, baseHttpRequestInfo);
            }
        }
    }

    public static void monitorApiError(long j, long j2, String str, String str2, BaseHttpRequestInfo baseHttpRequestInfo, Throwable th) {
        AbstractC13974h hVar;
        if (!StringUtils.isEmpty(str) && th != null && (hVar = sMonitorProcessHook) != null) {
            if (baseHttpRequestInfo.downloadFile) {
                baseHttpRequestInfo.hasReportStreamingApiAll.set(true);
            }
            hVar.mo51380a(j, j2, str, str2, baseHttpRequestInfo, th);
        }
    }
}
