package com.bytedance.lynx.webview;

import android.content.Context;
import android.os.Trace;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.webview.internal.AbstractC19937a;
import com.bytedance.lynx.webview.internal.AbstractC19980n;
import com.bytedance.lynx.webview.internal.AbstractC19982p;
import com.bytedance.lynx.webview.internal.C19979m;
import com.bytedance.lynx.webview.internal.C19986s;
import com.bytedance.lynx.webview.internal.C20011y;
import com.bytedance.lynx.webview.util.C20040b;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.p844a.C20038e;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class TTWebSdk {
    private static AtomicBoolean isWebsdkInit = new AtomicBoolean(false);
    static long mCallback = 0;
    static boolean mEnableV8Callback = false;

    public enum LoadPolicy {
        online_only,
        builtin_only,
        builtin_and_online
    }

    public enum ScheduleTaskType {
        Download,
        DexCompile,
        PreInit
    }

    public enum TaskType {
        Normal,
        IO,
        Background,
        Single,
        HandlerThread
    }

    /* renamed from: com.bytedance.lynx.webview.TTWebSdk$a */
    public interface AbstractC19909a {
        /* renamed from: a */
        void mo67443a(Runnable runnable, long j);

        /* renamed from: a */
        void mo67444a(Runnable runnable, ScheduleTaskType scheduleTaskType);

        /* renamed from: a */
        void mo67445a(Runnable runnable, TaskType taskType);
    }

    /* renamed from: com.bytedance.lynx.webview.TTWebSdk$b */
    public interface AbstractC19910b {
        /* renamed from: a */
        AbstractC19912d mo67446a();
    }

    /* renamed from: com.bytedance.lynx.webview.TTWebSdk$c */
    public interface AbstractC19911c {
        /* renamed from: a */
        boolean mo67447a(String str, String str2);
    }

    /* renamed from: com.bytedance.lynx.webview.TTWebSdk$d */
    public interface AbstractC19912d {

        /* renamed from: com.bytedance.lynx.webview.TTWebSdk$d$a */
        public interface AbstractC19913a extends C20038e.AbstractC20039a {
        }

        /* renamed from: a */
        void mo67448a(String str, AbstractC19913a aVar);
    }

    /* renamed from: com.bytedance.lynx.webview.TTWebSdk$e */
    public interface AbstractC19914e {
        /* renamed from: a */
        void mo67449a();

        /* renamed from: b */
        void mo67450b();

        /* renamed from: c */
        void mo67451c();

        /* renamed from: d */
        void mo67452d();
    }

    public static boolean isSupportReader() {
        return false;
    }

    public static void disableInitCrash() {
        C20011y.m73009h();
    }

    public static boolean isDarkModeSupported() {
        return C19915a.m72650a();
    }

    public static boolean isDarkStrategySupported() {
        return C19915a.m72652b();
    }

    public static boolean isTTWebView() {
        return C20011y.m73013k();
    }

    public static boolean isWebSdkInit() {
        return isWebsdkInit.get();
    }

    public static void cancelAllPreload() {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67940w();
        }
    }

    public static void clearAllPreloadCache() {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67943z();
        }
    }

    public static void clearPrerenderQueue() {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67937t();
        }
    }

    public static void pausePreload() {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67941x();
        }
    }

    public static void resumePreload() {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67942y();
        }
    }

    public static void clearCustomedHeaders() {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67922a((Map<String, String>) null);
        }
    }

    public static String getLoadSoVersionCode() {
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67900D();
        }
        return "0620010001";
    }

    public static String getLocalSoVersionCode() {
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67901E();
        }
        return "0620010001";
    }

    public static boolean getUpdatable() {
        boolean e = C20011y.m73007e();
        C20048g.m73161a("call TTWebSdk getUpdatable = " + e);
        return e;
    }

    public static String getUserAgentString() {
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67897A();
        }
        return "";
    }

    public static long[] getV8PipeInterfaces() {
        int i;
        if (!isWebSdkInit()) {
            C20048g.m73161a("TTWebSdk::getV8PipeInterfaces, web sdk has not init");
            return null;
        }
        long[] R = C20011y.m72976a().mo67913R();
        String[] strArr = new String[1];
        StringBuilder sb = new StringBuilder();
        sb.append("TTWebSdk::getV8PipeInterfaces, interfaces.size= ");
        if (R == null) {
            i = 0;
        } else {
            i = R.length;
        }
        sb.append(i);
        strArr[0] = sb.toString();
        C20048g.m73161a(strArr);
        return R;
    }

    public static boolean isAdblockEnable() {
        boolean z;
        if (isWebsdkInit.get()) {
            z = C20011y.m72976a().mo67903G().mo67878a();
        } else {
            z = false;
        }
        C20048g.m73161a("call TTWebSdk isAdblockEnable  enable = " + z);
        return z;
    }

    public static void enableSetSettingLocal(boolean z) {
        C20011y.m73000c(z);
    }

    public static void enableTextLongClickMenu(boolean z) {
        C20011y.m73003d(z);
    }

    public static void resetWebViewContext(Context context) {
        C20011y.m72991b(context);
    }

    public static void setAppHandler(AbstractC19909a aVar) {
        C20011y.m72980a(aVar);
    }

    public static void setConnectionGetter(AbstractC19910b bVar) {
        C20011y.m72981a(bVar);
    }

    public static void setDownloadHandler(AbstractC19911c cVar) {
        C20011y.m72982a(cVar);
    }

    public static void setHostAbi(String str) {
        C20011y.m73010h(str);
    }

    public static void setNQEListener(AbstractC19980n nVar) {
        C19979m.m72871a(nVar);
    }

    public static void setPackageLoadedChecker(AbstractC19982p pVar) {
        C20011y.m72984a(pVar);
    }

    public static void setRunningProcessName(String str) {
        C20011y.m72994b(str);
    }

    public static void setUseTTWebView(boolean z) {
        C20011y.m72987a(z);
    }

    public static void onCallMS(String str) {
        C20011y.m72976a().mo67927e(str);
    }

    public static void setSettingByValue(String str) {
        C20011y.m72976a().mo67916a(str);
    }

    public static void cancelPreload(String str) {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67929f(str);
        }
    }

    public static void clearPreloadCache(String str) {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67933g(str);
        }
    }

    public static void initTTWebView(Context context) {
        C20048g.m73161a("call TTWebSdk initTTWebView");
        initTTWebView(context, null);
    }

    public static boolean isTTWebView(WebView webView) {
        return C20011y.m72988a(webView);
    }

    public static void preresolveHosts(String[] strArr) {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67919a(strArr);
        }
    }

    public static void removePrerender(String str) {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67925c(str);
        }
    }

    public static void setAppInfoGetter(AbstractC19937a aVar) {
        C20048g.m73161a("call TTWebSdk setAppInfoGetter");
        C20011y.m72983a(aVar);
    }

    public static WebSettings getPrerenderSettings(Context context) {
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67924c(context);
        }
        return null;
    }

    public static boolean isPrerenderExist(String str) {
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67926d(str);
        }
        return false;
    }

    public static boolean setCustomedHeaders(Map<String, String> map) {
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67922a(map);
        }
        return false;
    }

    public static void setDebug(boolean z) {
        C20048g.m73161a("call TTWebSdk setDebug = " + z);
        C20040b.m73120a(z);
    }

    public static void setEnableHotReload(boolean z) {
        C20048g.m73161a("call TTWebSdk setEnableHotReload = " + z);
        C20011y.m72995b(z);
    }

    public static void setLoadPolicy(LoadPolicy loadPolicy) {
        C20048g.m73161a("call TTWebSdk setLoadPolicy = " + loadPolicy);
        C20011y.m72979a(loadPolicy);
    }

    public static void setV8InitCallback(long j) {
        if (mEnableV8Callback) {
            if (!isWebSdkInit()) {
                mCallback = j;
                C20048g.m73161a("TTWebSdk::setV8InitCallback, web sdk has not init");
                return;
            }
            C20011y.m72976a().mo67914a(j);
        }
    }

    public static void enableSanboxProcess(boolean z) {
        C20048g.m73161a("call TTWebSdk enableSanboxProcess = " + z);
        C20011y.m72976a().mo67928e(z);
    }

    public static boolean setAdblockEnable(boolean z) {
        C20048g.m73161a("call TTWebSdk setAdblockEnable  enable = " + z);
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67903G().mo67880a(z);
        }
        return false;
    }

    public static void tryLoadTTwebviewOnce(boolean z) {
        C20048g.m73161a("call TTWebSdk tryLoadTTwebviewOnce = " + z);
        C20011y.m72976a().mo67930f(z);
    }

    public static void setForceDark(WebSettings webSettings, int i) {
        C19915a.m72649a(webSettings, i);
    }

    public static void setForceDarkStrategy(WebSettings webSettings, int i) {
        C19915a.m72651b(webSettings, i);
    }

    public static void preconnectUrl(String str, int i) {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67917a(str, i);
        }
    }

    public static void setIsolateDirectorySuffix(Context context, String str) {
        if (!str.isEmpty()) {
            C20011y.m72978a(context, str);
        }
    }

    public static void setPreconnectUrl(String str, int i) {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67923b(str, i);
        }
    }

    public static void initTTWebView(Context context, AbstractC19914e eVar) {
        C20048g.m73161a("call TTWebSdk initTTWebView");
        initTTWebView(context, eVar, false);
    }

    public static boolean switchToSystemWebView(WebView webView, boolean z) {
        if (isTTWebView(webView)) {
            return C20011y.m72976a().mo67920a(webView, z);
        }
        C20048g.m73161a("switchToSystemWebView Failed");
        return false;
    }

    public static boolean setAdblockDesializeFile(String str, String str2) {
        C20048g.m73161a("call TTWebSdk setAdblockDesializeFile  path = " + str + " md5 = " + str2);
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67903G().mo67879a(str, str2);
        }
        return false;
    }

    public static boolean setAdblockRulesPath(String[] strArr, String[] strArr2) {
        C20048g.m73161a("call TTWebSdk setAdblockRulesPath  path = " + strArr.toString() + " md5 = " + strArr2.toString());
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67903G().mo67881a(strArr, strArr2);
        }
        return false;
    }

    public static boolean setRustRulesPath(String[] strArr, String[] strArr2) {
        C20048g.m73161a("call TTWebSdk setRustRulesPath  path = " + strArr.toString() + " md5 = " + strArr2.toString());
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67903G().mo67882b(strArr, strArr2);
        }
        return false;
    }

    public static void initTTWebView(Context context, AbstractC19914e eVar, boolean z) {
        if (isWebsdkInit.compareAndSet(false, true)) {
            try {
                Trace.beginSection("TTWebSdk.initTTWebView");
                C20011y.m72977a(context).mo67915a(eVar);
                mEnableV8Callback = C19986s.m72924a().mo67858a("v8_init_callback_enable", false);
                long j = mCallback;
                if (j != 0) {
                    setV8InitCallback(j);
                    mCallback = 0;
                }
            } finally {
                Trace.endSection();
            }
        } else {
            throw new IllegalStateException("initTTWebView can't be called more than once!");
        }
    }

    public static boolean prerenderUrl(String str, int i, int i2, WebSettings webSettings) {
        if (isWebsdkInit.get()) {
            return C20011y.m72976a().mo67921a(str, i, i2, webSettings);
        }
        return false;
    }

    public static void preloadUrl(String str, long j, String str2, String str3, boolean z) {
        if (isWebsdkInit.get()) {
            C20011y.m72976a().mo67918a(str, j, str2, str3, z);
        }
    }
}
