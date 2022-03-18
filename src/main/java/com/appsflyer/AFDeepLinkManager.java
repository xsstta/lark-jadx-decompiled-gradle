package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AFDeepLinkManager {
    public static AFDeepLinkManager instance;
    public static Uri trampolineUri;

    /* renamed from: ǃ */
    static volatile boolean f6689;

    /* renamed from: ɩ */
    public static String[] f6690;

    /* renamed from: Ι */
    static String[] f6691;

    /* renamed from: ι */
    static final int f6692 = ((int) TimeUnit.SECONDS.toMillis(2));

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AFDeepLinkManager$1 */
    public class RunnableC19761 implements Runnable {

        /* renamed from: ǃ */
        private /* synthetic */ Map f6693;

        /* renamed from: ɩ */
        private /* synthetic */ Uri f6694;

        /* renamed from: ι */
        private /* synthetic */ Context f6695;

        RunnableC19761() {
        }

        public final void run() {
            long j;
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            Uri uri = null;
            try {
                StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                sb.append(this.f6694.toString());
                AFLogger.afDebugLog(sb.toString());
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6694.toString()).openConnection();
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setReadTimeout(AFDeepLinkManager.f6692);
                httpURLConnection.setConnectTimeout(AFDeepLinkManager.f6692);
                httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                httpURLConnection.connect();
                AFLogger.afDebugLog("ESP deeplink resolving is finished");
                hashMap.put(UpdateKey.STATUS, String.valueOf(httpURLConnection.getResponseCode()));
                if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() <= 305) {
                    uri = Uri.parse(httpURLConnection.getHeaderField("Location"));
                }
                j = System.currentTimeMillis() - currentTimeMillis;
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                hashMap.put("error", th.getLocalizedMessage());
                hashMap.put(UpdateKey.STATUS, "-1");
                j = System.currentTimeMillis() - currentTimeMillis;
                AFLogger.afErrorLog(th.getMessage(), th);
            }
            hashMap.put("latency", Long.toString(j));
            if (uri != null) {
                hashMap.put("res", uri.toString());
            } else {
                hashMap.put("res", "");
            }
            synchronized (this.f6693) {
                this.f6693.put("af_deeplink_r", hashMap);
                this.f6693.put("af_deeplink", this.f6694.toString());
            }
            AFDeepLinkManager.f6689 = false;
            if (uri == null) {
                uri = this.f6694;
            }
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(this.f6695, this.f6693, uri);
        }

        /* renamed from: ι */
        static Map<String, String> m8706(Context context) {
            HashMap hashMap = new HashMap();
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
                hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
                hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
                hashMap.put("size", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
                hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
                hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th);
            }
            return hashMap;
        }

        RunnableC19761(Uri uri, Map map, Context context) {
            this.f6694 = uri;
            this.f6693 = map;
            this.f6695 = context;
        }
    }

    private AFDeepLinkManager() {
    }

    /* renamed from: ɩ */
    static AFDeepLinkManager m8703() {
        if (instance == null) {
            instance = new AFDeepLinkManager();
        }
        return instance;
    }

    /* access modifiers changed from: protected */
    public void collectIntentsFromActivities(Intent intent) {
        Uri uri;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null && intent.getData() != trampolineUri) {
            trampolineUri = intent.getData();
        }
    }

    /* renamed from: Ι */
    private static boolean m8704(String str) {
        if (f6691 == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate ESP URLs :");
        sb.append(Arrays.asList(f6691));
        AFLogger.afRDLog(sb.toString());
        String[] strArr = f6691;
        for (String str2 : strArr) {
            if (str.contains("://".concat(String.valueOf(str2)))) {
                AFLogger.afRDLog("Deeplink matches ESP domain: ".concat(String.valueOf(str2)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: ǃ */
    private static void m8702(Context context, Map<String, Object> map, Uri uri) {
        if (m8704(uri.toString())) {
            f6689 = true;
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.f6713 == null) {
                instance2.f6713 = Executors.newSingleThreadScheduledExecutor(instance2.f6712);
            }
            instance2.f6713.execute(new RunnableC19761(uri, map, context));
        } else {
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
        }
        trampolineUri = null;
    }

    /* renamed from: ι */
    static void m8705(Intent intent, Context context, Map<String, Object> map) {
        Uri uri;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null) {
            if (!intent.hasExtra("af_consumed")) {
                intent.putExtra("af_consumed", System.currentTimeMillis());
                m8702(context, map, uri);
                return;
            }
            StringBuilder sb = new StringBuilder("skipping re-use of previously consumed deep link: ");
            sb.append(uri.toString());
            sb.append(" w/af_consumed");
            AFLogger.afInfoLog(sb.toString());
        } else if (trampolineUri != null) {
            StringBuilder sb2 = new StringBuilder("using trampoline Intent fallback with URI: ");
            sb2.append(trampolineUri);
            AFLogger.afInfoLog(sb2.toString());
            m8702(context, map, trampolineUri);
        } else if (AppsFlyerLibCore.getInstance().latestDeepLink != null) {
            StringBuilder sb3 = new StringBuilder("using Unity/plugin Intent fallback with URI: ");
            sb3.append(AppsFlyerLibCore.getInstance().latestDeepLink.toString());
            AFLogger.afInfoLog(sb3.toString());
            m8702(context, map, AppsFlyerLibCore.getInstance().latestDeepLink);
        } else {
            AFLogger.afDebugLog("No deep link detected");
        }
    }
}
