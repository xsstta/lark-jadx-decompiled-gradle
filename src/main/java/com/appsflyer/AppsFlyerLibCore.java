package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.WindowManager;
import androidx.core.app.ActivityCompat;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFFacebookDeferredDeeplink;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.Foreground;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.internal.AbstractC2021h;
import com.appsflyer.internal.C2002aa;
import com.appsflyer.internal.C2004ab;
import com.appsflyer.internal.C2005ac;
import com.appsflyer.internal.C2007ad;
import com.appsflyer.internal.C2009af;
import com.appsflyer.internal.C2015ai;
import com.appsflyer.internal.C2020f;
import com.appsflyer.internal.C2027q;
import com.appsflyer.internal.C2032t;
import com.appsflyer.internal.C2035u;
import com.appsflyer.internal.C2036v;
import com.appsflyer.internal.C2040x;
import com.appsflyer.internal.RunnableC2038w;
import com.appsflyer.internal.RunnableC2046z;
import com.appsflyer.internal.model.event.AdRevenue;
import com.appsflyer.internal.model.event.BackgroundEvent;
import com.appsflyer.internal.model.event.BackgroundReferrerLaunch;
import com.appsflyer.internal.model.event.CachedEvent;
import com.appsflyer.internal.model.event.InAppEvent;
import com.appsflyer.internal.model.event.Launch;
import com.appsflyer.internal.model.event.NewGPReferrer;
import com.appsflyer.internal.model.event.Stats;
import com.appsflyer.internal.model.event.UninstallTokenEvent;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.gms.common.C21608a;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.ttvecamera.p3038g.C60375c;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.NetworkInterface;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.ele.lancet.base.annotations.Skip;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLibCore extends AppsFlyerLib {
    public static AppsFlyerLibCore instance = new AppsFlyerLibCore();

    /* renamed from: ı */
    public static String f6751 = null;

    /* renamed from: Ɩ */
    private static final String f6752;

    /* renamed from: ȷ */
    private static String f6753 = null;

    /* renamed from: ɨ */
    private static String f6754 = null;

    /* renamed from: ɩ */
    public static final String f6755 = "311";

    /* renamed from: ɪ */
    private static String f6756 = null;

    /* renamed from: ɹ */
    private static String f6757 = null;

    /* renamed from: ɾ */
    private static String f6758 = null;

    /* renamed from: Ι */
    public static AppsFlyerInAppPurchaseValidatorListener f6759 = null;

    /* renamed from: ι */
    public static final String f6760 = "5.2";

    /* renamed from: І */
    private static final String f6761;

    /* renamed from: г */
    private static AppsFlyerConversionListener f6762 = null;

    /* renamed from: ӏ */
    private static final List<String> f6763 = Arrays.asList("is_cache");
    protected Uri latestDeepLink;

    /* renamed from: ŀ */
    private long f6764 = -1;

    /* renamed from: ł */
    private String f6765;

    /* renamed from: ſ */
    private Map<String, Object> f6766;

    /* renamed from: Ɨ */
    private C2020f f6767 = null;

    /* renamed from: ƚ */
    private boolean f6768 = false;

    /* renamed from: ǀ */
    private String f6769;

    /* renamed from: ǃ */
    public String f6770;

    /* renamed from: ɍ */
    private long f6771;

    /* renamed from: ɔ */
    private long f6772;

    /* renamed from: ɟ */
    private boolean f6773 = false;

    /* renamed from: ɭ */
    private boolean f6774 = false;

    /* renamed from: ɺ */
    private long f6775;

    /* renamed from: ɼ */
    private boolean f6776 = false;

    /* renamed from: ɿ */
    private long f6777 = -1;

    /* renamed from: ʅ */
    private ScheduledExecutorService f6778 = null;

    /* renamed from: ʏ */
    private String f6779;

    /* renamed from: ʔ */
    private boolean f6780 = false;

    /* renamed from: ʟ */
    private long f6781 = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: ͻ */
    private boolean f6782 = false;

    /* renamed from: ϲ */
    private C2009af f6783 = new C2009af();

    /* renamed from: ϳ */
    private boolean f6784;

    /* renamed from: Ј */
    private Map<Long, String> f6785;

    /* renamed from: с */
    private boolean f6786;

    /* renamed from: т */
    private Map<String, Object> f6787;

    /* renamed from: х */
    private boolean f6788 = false;

    /* renamed from: і */
    long f6789;

    /* renamed from: ј */
    private Application f6790;

    /* renamed from: ґ */
    private Map<String, Object> f6791;

    /* renamed from: Ӏ */
    public String f6792;

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }

    public static AppsFlyerLibCore getInstance() {
        return instance;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public boolean isTrackingStopped() {
        return this.f6788;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ɩ */
    public final void mo9985(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            getInstance();
            String stringExtra = intent.getStringExtra("appsflyer_preinstall");
            try {
                if (new JSONObject(stringExtra).has("pid")) {
                    AppsFlyerProperties.getInstance().set("preInstallName", stringExtra);
                } else {
                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            }
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String stringExtra2 = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra2)));
        if (stringExtra2 != null) {
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                SharedPreferences.Editor edit = getSharedPreferences(context).edit();
                edit.clear();
                edit.apply();
                AppsFlyerProperties.getInstance().setFirstLaunchCalled(false);
                AFLogger.afInfoLog("Test mode started..");
                this.f6772 = System.currentTimeMillis();
            }
            SharedPreferences.Editor edit2 = getSharedPreferences(context).edit();
            edit2.putString("referrer", stringExtra2);
            edit2.apply();
            AppsFlyerProperties.getInstance().setReferrer(stringExtra2);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                if (stringExtra2 != null && stringExtra2.length() > 5) {
                    ScheduledThreadPoolExecutor r0 = AFExecutor.getInstance().mo9890();
                    AFEvent weakContext = new BackgroundReferrerLaunch().context(context).mo9886().weakContext();
                    weakContext.f6706 = stringExtra2;
                    weakContext.f6705 = intent;
                    m8807(r0, new RunnableC1994d(this, weakContext, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: ι */
    private static void m8808(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i2++;
                            str = next;
                        }
                    }
                    continue;
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    /* renamed from: ǃ */
    private static boolean m8772(String str) {
        return AppsFlyerProperties.getInstance().getBoolean(str, false);
    }

    /* renamed from: ι */
    public final void mo9988(Context context, String str) {
        if (m8794()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        if (string == null) {
            AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("installDate", simpleDateFormat.format(new Date(j)));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        m8792(context, hashMap);
        String string2 = AppsFlyerProperties.getInstance().getString("AppUserId");
        if (string2 != null) {
            hashMap.put("appUserId", string2);
        }
        try {
            hashMap.put("model", Build.MODEL);
            hashMap.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            hashMap.put("deviceTrackingDisabled", "true");
        }
        C2040x r2 = C2036v.m8933(context.getContentResolver());
        if (r2 != null) {
            hashMap.put("amazon_aid", r2.f7000);
            hashMap.put("amazon_aid_limit", String.valueOf(r2.mo10099()));
        }
        String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string3 != null) {
            hashMap.put("advertiserId", string3);
        }
        hashMap.put("devkey", string);
        hashMap.put("uid", C2004ab.m8856(new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(getLaunchCounter(getSharedPreferences(context), false)));
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String r11 = m8798(new WeakReference(context));
        if (r11 != null) {
            hashMap.put("channel", r11);
        }
        try {
            AFEvent context2 = new UninstallTokenEvent().trackingStopped(isTrackingStopped()).params(hashMap).context(context);
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(f6751));
            sb.append(packageName);
            new_insert_after_java_lang_Thread_by_knot(new Thread(new RunnableC2046z((BackgroundEvent) context2.urlString(sb.toString())))).start();
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: ι */
    private boolean m8809() {
        Map<String, Object> map = this.f6766;
        return map != null && map.size() > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c6, code lost:
        if (r6 != null) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0643, code lost:
        if (r6 != null) goto L_0x0647;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02fb A[Catch:{ Exception -> 0x0301 }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x040c  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x05cd  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05e3  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05f8  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0649  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x0673  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x069b  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06bb A[SYNTHETIC, Splitter:B:324:0x06bb] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0775  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x082a  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0833  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0862 A[SYNTHETIC, Splitter:B:396:0x0862] */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x08a1  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08bd  */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x090e  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0945  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x0965  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0977  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x09b2  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0b1d  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0b37  */
    /* renamed from: Ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> mo9986(com.appsflyer.AFEvent r29) {
        /*
        // Method dump skipped, instructions count: 2994
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.mo9986(com.appsflyer.AFEvent):java.util.Map");
    }

    /* renamed from: ǃ */
    public static boolean m8770(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", null));
    }

    /* access modifiers changed from: private */
    /* renamed from: ǃ */
    public static void m8769(Map<String, String> map) {
        if (f6762 != null) {
            try {
                StringBuilder sb = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                f6762.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* renamed from: ǃ */
    private static boolean m8771(File file) {
        return file == null || !file.exists();
    }

    /* access modifiers changed from: private */
    /* renamed from: ι */
    public static void m8807(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    /* renamed from: ı */
    private boolean m8753() {
        Map<String, Object> map = this.f6791;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: І */
    private boolean m8812() {
        Map<String, Object> map = this.f6787;
        if (map == null || map.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        if (string != null) {
            return string;
        }
        return "appsflyer.com";
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        if (string != null) {
            return string;
        }
        return "";
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$8 */
    static /* synthetic */ class C19908 {

        /* renamed from: Ι */
        static final /* synthetic */ int[] f6803;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.appsflyer.AppsFlyerLibCore.C19908.f6803 = r0
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.appsflyer.AppsFlyerLibCore.C19908.f6803     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C19908.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$d */
    public class RunnableC1994d implements Runnable {

        /* renamed from: Ι */
        private AFEvent f6811;

        public final void run() {
            AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
            AFEvent aFEvent = this.f6811;
            aFEvent.f6700 = aFEvent.f6696.get();
            appsFlyerLibCore.m8805((AppsFlyerLibCore) aFEvent);
        }

        private RunnableC1994d(AFEvent aFEvent) {
            this.f6811 = aFEvent;
        }

        /* synthetic */ RunnableC1994d(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void unregisterConversionListener() {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "unregisterConversionListener", new String[0]);
        f6762 = null;
    }

    public AppsFlyerLibCore() {
        AFVersionDeclaration.init();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getSdkVersion() {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "getSdkVersion", new String[0]);
        StringBuilder sb = new StringBuilder("version: 5.2.0 (build ");
        sb.append(f6755);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$c */
    public class RunnableC1993c implements Runnable {

        /* renamed from: ı */
        private WeakReference<Context> f6808;

        public final void run() {
            if (!AppsFlyerLibCore.this.f6768) {
                AppsFlyerLibCore.this.f6789 = System.currentTimeMillis();
                if (this.f6808 != null) {
                    AppsFlyerLibCore.this.f6768 = true;
                    try {
                        String r1 = AppsFlyerLibCore.m8796("AppsFlyerKey");
                        synchronized (this.f6808) {
                            C2007ad.m8861();
                            for (AFFacebookDeferredDeeplink aFFacebookDeferredDeeplink : C2007ad.m8859(this.f6808.get())) {
                                StringBuilder sb = new StringBuilder("resending request: ");
                                sb.append(aFFacebookDeferredDeeplink.f6717);
                                AFLogger.afInfoLog(sb.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(aFFacebookDeferredDeeplink.f6719, 10);
                                    AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                                    CachedEvent cachedEvent = new CachedEvent();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(aFFacebookDeferredDeeplink.f6717);
                                    sb2.append("&isCachedRequest=true&timeincache=");
                                    sb2.append((currentTimeMillis - parseLong) / 1000);
                                    AFEvent post = cachedEvent.urlString(sb2.toString()).post(aFFacebookDeferredDeeplink.mo9893());
                                    post.f6702 = r1;
                                    post.f6696 = this.f6808;
                                    AFEvent cacheKey = post.cacheKey(aFFacebookDeferredDeeplink.f6719);
                                    cacheKey.f6701 = false;
                                    AppsFlyerLibCore.m8767(appsFlyerLibCore, cacheKey);
                                } catch (Exception e) {
                                    AFLogger.afErrorLog("Failed to resend cached request", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        AFLogger.afErrorLog("failed to check cache. ", e2);
                    } catch (Throwable th) {
                        AppsFlyerLibCore.this.f6768 = false;
                        throw th;
                    }
                    AppsFlyerLibCore.this.f6768 = false;
                    AppsFlyerLibCore.this.f6778.shutdown();
                    AppsFlyerLibCore.this.f6778 = null;
                }
            }
        }

        public RunnableC1993c(Context context) {
            this.f6808 = new WeakReference<>(context);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f6760);
        sb.append("/androidevent?buildnumber=5.2.0&app_id=");
        String obj = sb.toString();
        f6761 = obj;
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(obj);
        f6751 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb3.append(f6760);
        sb3.append("/android?buildnumber=5.2.0&app_id=");
        f6757 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f6760);
        sb4.append("/androidevent?app_id=");
        String obj2 = sb4.toString();
        f6752 = obj2;
        StringBuilder sb5 = new StringBuilder("https://%sconversions.%s/api/v");
        sb5.append(obj2);
        f6753 = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%slaunches.%s/api/v");
        sb6.append(obj2);
        f6754 = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sinapps.%s/api/v");
        sb7.append(obj2);
        f6758 = sb7.toString();
        StringBuilder sb8 = new StringBuilder("https://%sattr.%s/api/v");
        sb8.append(obj2);
        f6756 = sb8.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$b */
    public class RunnableC1992b implements Runnable {

        /* renamed from: ı */
        private final AFEvent f6806;

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0108, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0109, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0110, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
            com.appsflyer.internal.C2007ad.m8861();
            r3 = new com.appsflyer.AFFacebookDeferredDeeplink(r2, r6, com.appsflyer.BuildConfig.VERSION_NAME);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r2 = com.appsflyer.internal.C2007ad.m8860(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0135, code lost:
            if (r2.exists() == false) goto L_0x0137;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0137, code lost:
            r2.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x013c, code lost:
            r2 = r2.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0140, code lost:
            if (r2 == null) goto L_0x0150;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
            android.util.Log.i("AppsFlyer_5.2.0", "reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
            android.util.Log.i("AppsFlyer_5.2.0", "caching request...");
            r2 = new java.io.File(com.appsflyer.internal.C2007ad.m8860(r4), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r2.createNewFile();
            r4 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r2.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r4.write("version=");
            r4.write(r3.f6718);
            r4.write(10);
            r4.write("url=");
            r4.write(r3.f6717);
            r4.write(10);
            r4.write("data=");
            r4.write(android.util.Base64.encodeToString(r3.mo9893(), 2));
            r4.write(10);
            r4.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01af, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b0, code lost:
            r1 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b2, code lost:
            r1 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b4, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            android.util.Log.i("AppsFlyer_5.2.0", "Could not cache request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bd, code lost:
            if (r1 != null) goto L_0x01bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bf, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c2, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ca, code lost:
            if (r1 != null) goto L_0x01cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cf, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0108 A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:22:0x00aa] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01cc A[SYNTHETIC, Splitter:B:89:0x01cc] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 465
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.RunnableC1992b.run():void");
        }

        private RunnableC1992b(AFEvent aFEvent) {
            this.f6806 = aFEvent.weakContext();
        }

        /* synthetic */ RunnableC1992b(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent, byte b) {
            this(aFEvent);
        }
    }

    /* renamed from: Ι */
    private static boolean m8794() {
        if (!m8772("waitForCustomerId") || AppsFlyerProperties.getInstance().getString("AppUserId") != null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.AppsFlyerLibCore$e */
    public static class RunnableC1995e implements Runnable {

        /* renamed from: ı */
        private static final List<String> f6812 = Arrays.asList("googleplay", "playstore", "googleplaystore");

        /* renamed from: ǃ */
        private static String f6813 = "https://%sgcdsdk.%s/install_data/v4.0/";

        /* renamed from: Ɩ */
        private AppsFlyerLibCore f6814;

        /* renamed from: ɩ */
        private final String f6815;

        /* renamed from: ɹ */
        private final AtomicInteger f6816;

        /* renamed from: Ι */
        private final Application f6817;

        /* renamed from: ι */
        final ScheduledExecutorService f6818;

        /* renamed from: І */
        private final int f6819;

        /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00f2 A[Catch:{ all -> 0x0271 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0111 A[Catch:{ all -> 0x0271 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0161 A[Catch:{ all -> 0x0271 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x026d  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x027b A[Catch:{ all -> 0x0299 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0290 A[DONT_GENERATE] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 678
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.RunnableC1995e.run():void");
        }

        private RunnableC1995e(RunnableC1995e eVar) {
            this.f6818 = AFExecutor.getInstance().mo9890();
            this.f6816 = new AtomicInteger(0);
            this.f6814 = eVar.f6814;
            this.f6817 = eVar.f6817;
            this.f6815 = eVar.f6815;
            this.f6819 = eVar.f6819 + 1;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:459)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        /* renamed from: ǃ */
        private void m8832(java.lang.String r3, int r4) {
            /*
                r2 = this;
                java.lang.String r0 = "Calling onConversionFailure with:\n"
                r1 = 500(0x1f4, float:7.0E-43)
                if (r1 > r4) goto L_0x002f
                r1 = 600(0x258, float:8.41E-43)
                if (r4 >= r1) goto L_0x002f
                int r4 = r2.f6819
                r1 = 2
                if (r4 != r1) goto L_0x0022
                java.lang.String r4 = java.lang.String.valueOf(r3)
                java.lang.String r4 = r0.concat(r4)
                com.appsflyer.AFLogger.afDebugLog(r4)
                com.appsflyer.AppsFlyerConversionListener r4 = com.appsflyer.AppsFlyerLibCore.m8760()
                r4.onConversionDataFail(r3)
                return
            L_0x0022:
                com.appsflyer.AppsFlyerLibCore$e r3 = new com.appsflyer.AppsFlyerLibCore$e
                r3.<init>(r2)
                java.util.concurrent.ScheduledExecutorService r4 = r3.f6818
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
                com.appsflyer.AppsFlyerLibCore.m8780(r4, r3, r0)
                return
            L_0x002f:
                java.lang.String r4 = java.lang.String.valueOf(r3)
                java.lang.String r4 = r0.concat(r4)
                com.appsflyer.AFLogger.afDebugLog(r4)
                com.appsflyer.AppsFlyerConversionListener r4 = com.appsflyer.AppsFlyerLibCore.m8760()
                r4.onConversionDataFail(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.RunnableC1995e.m8832(java.lang.String, int):void");
        }

        private RunnableC1995e(AppsFlyerLibCore appsFlyerLibCore, Application application, String str) {
            this.f6818 = AFExecutor.getInstance().mo9890();
            this.f6816 = new AtomicInteger(0);
            this.f6814 = appsFlyerLibCore;
            this.f6817 = application;
            this.f6815 = str;
            this.f6819 = 0;
        }

        /* synthetic */ RunnableC1995e(AppsFlyerLibCore appsFlyerLibCore, Application application, String str, byte b) {
            this(appsFlyerLibCore, application, str);
        }
    }

    /* renamed from: ɩ */
    private boolean m8781() {
        if (this.f6777 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f6777;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.f6777;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.f6764;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.f6781 && !isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f6781)));
                return true;
            } else if (!isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", format, format2, Long.valueOf(currentTimeMillis)));
            }
        } else if (!isTrackingStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void enableFacebookDeferredApplinks(boolean z) {
        this.f6774 = z;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.f6773 = z;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setPluginDeepLinkData(Intent intent) {
        setDeepLinkData(intent);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setPhoneNumber(String str) {
        this.f6779 = AFExecutor.ThreadFactoryC19774.RunnableC19782.m8719(str);
    }

    public static SharedPreferences getSharedPreferences(Context context) {
        return context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
    }

    /* renamed from: ι */
    static /* synthetic */ String m8796(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    /* renamed from: і */
    private static boolean m8815(Context context) {
        if (!getSharedPreferences(context).contains("appsFlyerCount")) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void onPause(Context context) {
        if (Foreground.listener != null) {
            Foreground.listener.mo9991(context);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setHostName(String str) {
        AppsFlyerProperties.getInstance().set("custom_host", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setLogLevel(AFLogger.LogLevel logLevel) {
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setMinTimeBetweenSessions(int i) {
        this.f6781 = TimeUnit.SECONDS.toMillis((long) i);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void startTracking(Context context) {
        if (!this.f6786) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        } else {
            startTracking(context, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ι */
    public static String m8798(WeakReference<Context> weakReference) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = m8799(weakReference, "CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    /* renamed from: І */
    private static String m8811(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String r2 = m8799(new WeakReference(context), "AF_STORE");
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    /* renamed from: Ӏ */
    private static File m8816(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (str.trim().length() > 0) {
                return new File(str.trim());
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getAttributionId(Context context) {
        try {
            return new C2005ac(context).mo10056();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public boolean isPreInstalledApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAndroidIdData(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setAndroidIdData", str);
        this.f6792 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setImeiData(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setImeiData", str);
        this.f6770 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOaidData(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setOaidData", str);
        this.f6765 = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOneLinkCustomDomain(String... strArr) {
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        AFDeepLinkManager.f6690 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFDeepLinkManager.f6691 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setUserEmails(String... strArr) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set("waitForCustomerId", z);
    }

    /* renamed from: Ɩ */
    private static boolean m8757(Context context) {
        try {
            if (C21608a.m78228a().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* renamed from: ɨ */
    private static float m8773(Context context) {
        try {
            Intent INVOKEVIRTUAL_com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context.getApplicationContext(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = INVOKEVIRTUAL_com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
            int intExtra2 = INVOKEVIRTUAL_com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (((float) intExtra) / ((float) intExtra2)) * 100.0f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return 1.0f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ɩ */
    public static Map<String, Object> m8775(String str) {
        Object obj;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!f6763.contains(next)) {
                    if (jSONObject.isNull(next)) {
                        obj = null;
                    } else {
                        obj = jSONObject.get(next);
                    }
                    hashMap.put(next, obj);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: ɹ */
    private static boolean m8785(Context context) {
        boolean z;
        if (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) || AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
            z = true;
        } else {
            z = false;
        }
        if (z || !m8757(context)) {
            return true;
        }
        return false;
    }

    /* renamed from: Ι */
    private static String m8789(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ӏ */
    public static Map<String, Object> m8817(Context context) throws C2035u {
        String string = getSharedPreferences(context).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return m8775(string);
        }
        throw new C2035u();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getAppsFlyerUID(Context context) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "getAppsFlyerUID", new String[0]);
        return C2004ab.m8856(new WeakReference(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String r3 = m8799(new WeakReference(context), "AF_STORE");
        if (r3 != null) {
            return r3;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void reportTrackSession(Context context) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "reportTrackSession", new String[0]);
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.f6881 = false;
        AFEvent context2 = new InAppEvent().context(context);
        context2.f6707 = null;
        context2.f6704 = null;
        mo9984(context2);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai.f6878.mo10067("public_api_call", "setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAppId(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectAndroidID(boolean z) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectAndroidId", Boolean.toString(z));
        AppsFlyerProperties.getInstance().set("collectAndroidIdForceByUser", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectIMEI(boolean z) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectIMEI", Boolean.toString(z));
        AppsFlyerProperties.getInstance().set("collectIMEIForceByUser", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCollectOaid(boolean z) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("collectOAID", Boolean.toString(z));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setConsumeAFDeepLinks(boolean z) {
        AppsFlyerProperties.getInstance().set("consumeAfDeepLink", z);
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setConsumeAFDeepLinks: ".concat(String.valueOf(z)), new String[0]);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCurrencyCode(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set("currencyCode", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCustomerUserId(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set("AppUserId", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setDebugLog", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties instance2 = AppsFlyerProperties.getInstance();
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        instance2.set("logLevel", logLevel.getLevel());
    }

    /* access modifiers changed from: protected */
    public void setDeepLinkData(Intent intent) {
        if (intent != null) {
            try {
                if ("android.intent.action.VIEW".equals(intent.getAction())) {
                    this.latestDeepLink = intent.getData();
                    StringBuilder sb = new StringBuilder("Unity setDeepLinkData = ");
                    sb.append(this.latestDeepLink);
                    AFLogger.afDebugLog(sb.toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while setting deeplink data (unity). ", th);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setDeviceTrackingDisabled(boolean z) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setDeviceTrackingDisabled", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setExtension(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set("sdkExtension", str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setIsUpdate(boolean z) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("IS_UPDATE", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.m8734("Cannot set setOutOfStore with null");
    }

    /* renamed from: ɾ */
    private static boolean m8786(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network network : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                }
            } else if (Build.VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setAppInviteOneLink(String str) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"))) {
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
        }
        AppsFlyerProperties.getInstance().set("oneLinkSlug", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* renamed from: ı */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m8749(java.net.HttpURLConnection r7) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m8749(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: ǃ */
    private static void m8764(Context context) {
        int i;
        if (AFExecutor.ThreadFactoryC19774.m8712()) {
            i = 23;
            AFLogger.afRDLog("OPPO device found");
        } else {
            i = 18;
        }
        if (Build.VERSION.SDK_INT < i || m8772("keyPropDisableAFKeystore")) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("; no KeyStore usage");
            AFLogger.afRDLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("OS SDK is=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("; use KeyStore");
        AFLogger.afRDLog(sb2.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (!aFKeystoreWrapper.mo9898()) {
            aFKeystoreWrapper.f6727 = C2004ab.m8856(new WeakReference(context));
            aFKeystoreWrapper.f6724 = 0;
            aFKeystoreWrapper.mo9901(aFKeystoreWrapper.mo9900());
        } else {
            String r4 = aFKeystoreWrapper.mo9900();
            synchronized (aFKeystoreWrapper.f6726) {
                aFKeystoreWrapper.f6724++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(r4)));
                try {
                    synchronized (aFKeystoreWrapper.f6726) {
                        aFKeystoreWrapper.f6725.deleteEntry(r4);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e);
                }
            }
            aFKeystoreWrapper.mo9901(aFKeystoreWrapper.mo9900());
        }
        AppsFlyerProperties.getInstance().set("KSAppsFlyerId", aFKeystoreWrapper.mo9899());
        AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.mo9897()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void sendDeepLinkData(Activity activity) {
        if (activity != null && activity.getIntent() != null) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai aiVar = C2015ai.f6878;
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            aiVar.mo10067("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), sb.toString());
        } else if (activity != null) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai.f6878.mo10067("public_api_call", "sendDeepLinkData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai.f6878.mo10067("public_api_call", "sendDeepLinkData", "activity_null");
        }
        try {
            startTracking(activity);
            StringBuilder sb2 = new StringBuilder("getDeepLinkData with activity ");
            sb2.append(activity.getIntent().getDataString());
            AFLogger.afInfoLog(sb2.toString());
        } catch (Exception e) {
            AFLogger.afInfoLog("getDeepLinkData Exception: ".concat(String.valueOf(e)));
        }
    }

    /* renamed from: ı */
    private boolean m8754(Context context) {
        if (getLaunchCounter(getSharedPreferences(context), false) > 2) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFExecutor.ThreadFactoryC19774.m8715(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    /* renamed from: ɩ */
    private void m8779(AFEvent aFEvent) {
        boolean z;
        aFEvent.mo9886();
        if (aFEvent.f6707 == null) {
            z = true;
        } else {
            z = false;
        }
        if (m8794()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m8781()) {
                return;
            }
            this.f6777 = System.currentTimeMillis();
        }
        m8807(AFExecutor.getInstance().mo9890(), new RunnableC1994d(this, aFEvent.weakContext(), (byte) 0), 150, TimeUnit.MILLISECONDS);
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0192  */
    @Override // com.appsflyer.AppsFlyerLib
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(android.app.Activity r17) {
        /*
        // Method dump skipped, instructions count: 446
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.sendPushNotificationData(android.app.Activity):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0230  */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8766(com.appsflyer.AFEvent r21) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m8766(com.appsflyer.AFEvent):void");
    }

    /* renamed from: Ι */
    private boolean m8795(Context context) {
        long currentTimeMillis = System.currentTimeMillis() - this.f6772;
        String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
        if (currentTimeMillis > 30000 || referrer == null || !referrer.contains("AppsFlyer_Test")) {
            return false;
        }
        return true;
    }

    /* renamed from: ɩ */
    private boolean m8782(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.f6787 = new ConcurrentHashMap();
            C19885 r4 = new C2027q.AbstractC2029b() {
                /* class com.appsflyer.AppsFlyerLibCore.C19885 */

                @Override // com.appsflyer.internal.C2027q.AbstractC2029b
                /* renamed from: Ι */
                public final void mo9992(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    AppsFlyerLibCore.this.f6787.put("error", message);
                    AFLogger.afErrorLog(str, exc, true);
                }

                @Override // com.appsflyer.internal.C2027q.AbstractC2029b
                /* renamed from: Ι */
                public final void mo9993(String str, String str2) {
                    AppsFlyerLibCore.this.f6787.put("signedData", str);
                    AppsFlyerLibCore.this.f6787.put("signature", str2);
                    AppsFlyerLibCore.this.f6787.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2);
                C2027q.C20284 r7 = new C2027q.C20284(r4);
                method.invoke(null, Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r7));
            } catch (ClassNotFoundException e) {
                r4.mo9992(e.getClass().getSimpleName(), e);
            } catch (NoSuchMethodException e2) {
                r4.mo9992(e2.getClass().getSimpleName(), e2);
            } catch (IllegalAccessException e3) {
                r4.mo9992(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                r4.mo9992(e4.getClass().getSimpleName(), e4);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: ι */
    private void m8805(AFEvent aFEvent) {
        boolean z;
        String str;
        ScheduledExecutorService scheduledExecutorService;
        Context context = aFEvent.context();
        String str2 = aFEvent.f6707;
        if (context == null) {
            AFLogger.afDebugLog("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
        if (!isTrackingStopped()) {
            StringBuilder sb = new StringBuilder("sendTrackingWithEvent from activity: ");
            sb.append(context.getClass().getName());
            AFLogger.afInfoLog(sb.toString());
        }
        boolean z2 = true;
        int i = 0;
        if (str2 == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = aFEvent instanceof BackgroundReferrerLaunch;
        boolean z4 = aFEvent instanceof NewGPReferrer;
        if ((!z4 && !z3) || m8755(aFEvent, sharedPreferences)) {
            aFEvent.f6701 = z;
            Map<String, ?> r7 = mo9986(aFEvent);
            String str3 = (String) r7.get("appsflyerKey");
            if (str3 == null || str3.length() == 0) {
                AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
                return;
            }
            if (!isTrackingStopped()) {
                AFLogger.afInfoLog("AppsFlyerLib.sendTrackingWithEvent");
            }
            int launchCounter = getLaunchCounter(sharedPreferences, false);
            if (z4 || z3) {
                str = ServerConfigHandler.getUrl(f6756);
            } else if (!z) {
                str = ServerConfigHandler.getUrl(f6758);
            } else if (launchCounter < 2) {
                str = ServerConfigHandler.getUrl(f6753);
            } else {
                str = ServerConfigHandler.getUrl(f6754);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(context.getPackageName());
            String obj = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("&buildnumber=5.2.0");
            String obj2 = sb3.toString();
            String r6 = m8798(new WeakReference(context));
            if (r6 != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj2);
                sb4.append("&channel=");
                sb4.append(r6);
                obj2 = sb4.toString();
            }
            if (!AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false) && !AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) {
                z2 = false;
            }
            if (!z2 && r7.get("advertiserId") != null) {
                try {
                    if (TextUtils.isEmpty(this.f6792) && r7.remove("android_id") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                    }
                    if (TextUtils.isEmpty(this.f6770) && r7.remove("imei") != null) {
                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                }
            }
            AFEvent r10 = aFEvent.urlString(obj2).params(r7).mo9886();
            r10.f6703 = launchCounter;
            RunnableC1992b bVar = new RunnableC1992b(this, r10, (byte) 0);
            int i2 = ParticipantRepo.f117150c;
            if (z && m8754(context) && !m8809()) {
                AFLogger.afDebugLog("Failed to get new referrer, wait ...");
                i = ParticipantRepo.f117150c;
            }
            if (z && this.f6774 && !m8753()) {
                AFLogger.afDebugLog("fetching Facebook deferred AppLink data, wait ...");
                i = ParticipantRepo.f117150c;
            }
            if (!z || !this.f6780 || m8812()) {
                i2 = i;
            }
            if (AFDeepLinkManager.f6689) {
                AFLogger.afRDLog("ESP deeplink: execute launch on SerialExecutor");
                AFExecutor instance2 = AFExecutor.getInstance();
                if (instance2.f6713 == null) {
                    instance2.f6713 = Executors.newSingleThreadScheduledExecutor(instance2.f6712);
                }
                scheduledExecutorService = instance2.f6713;
            } else {
                scheduledExecutorService = AFExecutor.getInstance().mo9890();
            }
            m8807(scheduledExecutorService, bVar, (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final void mo9984(AFEvent aFEvent) {
        String str;
        Context context = aFEvent.context();
        String str2 = "";
        Intent intent = null;
        Uri uri = null;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            Intent intent2 = activity.getIntent();
            try {
                uri = ActivityCompat.getReferrer(activity);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
            if (uri != null) {
                str = uri.toString();
            } else {
                str = str2;
            }
            intent = intent2;
        } else {
            str = str2;
        }
        if (AppsFlyerProperties.getInstance().getString("AppsFlyerKey") == null) {
            AFLogger.afWarnLog("[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
        if (referrer != null) {
            str2 = referrer;
        }
        aFEvent.f6706 = str2;
        aFEvent.f6705 = intent;
        aFEvent.f6708 = str;
        m8779(aFEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Ι */
    public final void mo9987(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences sharedPreferences = getSharedPreferences(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
            long j = this.f6775 - this.f6771;
            HashMap hashMap = new HashMap();
            String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
            if (string == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                hashMap.put("deviceTrackingDisabled", "true");
            }
            C2040x r6 = C2036v.m8933(weakReference.get().getContentResolver());
            if (r6 != null) {
                hashMap.put("amazon_aid", r6.f7000);
                hashMap.put("amazon_aid_limit", String.valueOf(r6.mo10099()));
            }
            String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
            if (string3 != null) {
                hashMap.put("advertiserId", string3);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", string);
            hashMap.put("uid", C2004ab.m8856(weakReference));
            hashMap.put("time_in_app", String.valueOf(j / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(getLaunchCounter(sharedPreferences, false)));
            hashMap.put("channel", m8798(weakReference));
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put("originalAppsflyerId", string2);
            if (this.f6782) {
                try {
                    AFLogger.afDebugLog("Running callStats task");
                    new_insert_after_java_lang_Thread_by_knot(new Thread(new RunnableC2046z((BackgroundEvent) new Stats().trackingStopped(isTrackingStopped()).params(hashMap).urlString(ServerConfigHandler.getUrl("https://%sstats.%s/stats"))))).start();
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                }
            } else {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void updateServerUninstallToken(Context context, String str) {
        C2027q.C20284.m8924(context, str);
    }

    /* access modifiers changed from: protected */
    public void getConversionData(Context context, final ConversionDataListener conversionDataListener) {
        f6762 = new AppsFlyerConversionListener() {
            /* class com.appsflyer.AppsFlyerLibCore.C19897 */

            @Override // com.appsflyer.AppsFlyerConversionListener
            public final void onAppOpenAttribution(Map<String, String> map) {
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public final void onAttributionFailure(String str) {
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public final void onConversionDataFail(String str) {
                AFLogger.afDebugLog("Calling onConversionFailure with:\n".concat(String.valueOf(str)));
                ConversionDataListener.this.onConversionFailure(str);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public final void onConversionDataSuccess(Map<String, Object> map) {
                StringBuilder sb = new StringBuilder("Calling onConversionDataLoaded with:\n");
                sb.append(map.toString());
                AFLogger.afDebugLog(sb.toString());
                ConversionDataListener.this.onConversionDataLoaded(map);
            }
        };
    }

    public final int getLaunchCounter(SharedPreferences sharedPreferences, boolean z) {
        return m8759(sharedPreferences, "appsFlyerCount", z);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void startTracking(Context context, String str) {
        startTracking(context, str, null);
    }

    /* renamed from: ǃ */
    static /* synthetic */ void m8768(AppsFlyerLibCore appsFlyerLibCore, Map map) {
        if (appsFlyerLibCore.m8809()) {
            appsFlyerLibCore.m8805(new NewGPReferrer(map).context(appsFlyerLibCore.f6790));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            f6762 = appsFlyerConversionListener;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ı */
    public static String m8748(Context context, String str) {
        SharedPreferences sharedPreferences = getSharedPreferences(context);
        if (sharedPreferences.contains("CACHED_CHANNEL")) {
            return sharedPreferences.getString("CACHED_CHANNEL", null);
        }
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putString("CACHED_CHANNEL", str);
        edit.apply();
        return str;
    }

    /* renamed from: ι */
    private static String m8799(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return m8797(str, weakReference.get().getPackageManager(), weakReference.get().getPackageName());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            f6759 = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.afWarnLog("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void trackAppLaunch(Context context, String str) {
        if (m8754(context)) {
            if (this.f6767 == null) {
                C2020f fVar = new C2020f();
                this.f6767 = fVar;
                fVar.mo10079(context, new AbstractC2021h() {
                    /* class com.appsflyer.AppsFlyerLibCore.C19874 */

                    @Override // com.appsflyer.internal.AbstractC2021h
                    /* renamed from: ι */
                    public final void mo9989(Map<String, Object> map) {
                        AppsFlyerLibCore.this.f6766 = map;
                        AppsFlyerLibCore.m8768(AppsFlyerLibCore.this, map);
                    }
                });
            } else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }
        m8804(context, str, "", (Intent) null);
    }

    /* renamed from: ı */
    private static String m8750(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        String string = getSharedPreferences(context).getString("appsFlyerFirstInstall", null);
        if (string == null) {
            if (m8815(context)) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString("appsFlyerFirstInstall", string);
            edit.apply();
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8761(java.io.File r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m8761(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: ɩ */
    private static void m8776(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        if (Build.VERSION.SDK_INT < 26) {
            context.sendBroadcast(intent);
        } else if (context.getPackageManager().queryBroadcastReceivers(intent, 0).toString().contains("com.appsflyer.referrerSender")) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(new ComponentName("com.appsflyer.referrerSender", "com.appsflyer.referrerSender.Receiver"));
            context.sendBroadcast(intent2);
        }
    }

    /* renamed from: Ι */
    private static void m8792(Context context, Map<String, ? super String> map) {
        C2032t tVar = C2032t.C2034b.f6985;
        C2032t.C2033a r2 = C2032t.m8931(context);
        map.put("network", r2.f6984);
        if (r2.f6983 != null) {
            map.put("operator", r2.f6983);
        }
        if (r2.f6982 != null) {
            map.put("carrier", r2.f6982);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
        String str2;
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai aiVar = C2015ai.f6878;
        String[] strArr = new String[2];
        strArr[0] = str;
        if (appsFlyerConversionListener == null) {
            str2 = "null";
        } else {
            str2 = "conversionDataListener";
        }
        strArr[1] = str2;
        aiVar.mo10067("public_api_call", "init", strArr);
        AFLogger.m8731(String.format("Initializing AppsFlyer SDK: (v%s.%s)", BuildConfig.VERSION_NAME, f6755));
        this.f6786 = true;
        AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
        AFFacebookDeferredDeeplink.C19792.m8722(str);
        f6762 = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setCustomerIdAndTrack(String str, Context context) {
        Intent intent;
        if (context == null) {
            return;
        }
        if (m8794()) {
            setCustomerUserId(str);
            AppsFlyerProperties.getInstance().set("waitForCustomerId", false);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
            String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
            if (referrer == null) {
                referrer = "";
            }
            if (context instanceof Activity) {
                intent = ((Activity) context).getIntent();
            } else {
                intent = null;
            }
            m8804(context, string, referrer, intent);
            if (AppsFlyerProperties.getInstance().getString("afUninstallToken") != null) {
                mo9988(context, AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                return;
            }
            return;
        }
        setCustomerUserId(str);
        AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void stopTracking(boolean z, Context context) {
        this.f6788 = z;
        C2007ad.m8861();
        try {
            File r7 = C2007ad.m8860(context);
            if (!r7.exists()) {
                r7.mkdir();
            } else {
                File[] listFiles = r7.listFiles();
                for (File file : listFiles) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file.getName());
                    Log.i("AppsFlyer_5.2.0", sb.toString());
                    C2007ad.m8862(C2007ad.m8858(file).f6719, context);
                }
            }
        } catch (Exception unused) {
            Log.i("AppsFlyer_5.2.0", "Could not cache request");
        }
        if (this.f6788) {
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putBoolean("is_stop_tracking_used", true);
            edit.apply();
        }
    }

    /* renamed from: ɩ */
    private static void m8778(Context context, Map<String, Object> map) {
        String str;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            if (rotation == 0) {
                str = "p";
            } else if (rotation == 1) {
                str = "l";
            } else if (rotation == 2) {
                str = "pr";
            } else if (rotation != 3) {
                str = "";
            } else {
                str = "lr";
            }
            map.put("sc_o", str);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set("userEmailsCryptType", emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        String str = null;
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : strArr) {
            if (C19908.f6803[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFExecutor.ThreadFactoryC19774.RunnableC19782.m8719(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    /* renamed from: ǃ */
    static void m8765(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = getSharedPreferences(context).getString("extraReferrers", null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray2 = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray2 = new JSONArray();
                }
                jSONArray = jSONArray2;
                jSONObject = jSONObject2;
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                m8808(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject3 = jSONObject.toString();
            SharedPreferences.Editor edit = getSharedPreferences(context).edit();
            edit.putString("extraReferrers", jSONObject3);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void sendAdRevenue(Context context, Map<String, Object> map) {
        AFEvent context2 = new AdRevenue().context(context);
        context2.f6704 = map;
        Context context3 = context2.context();
        String url = ServerConfigHandler.getUrl(f6757);
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append(context3.getPackageName());
        String obj = sb.toString();
        SharedPreferences sharedPreferences = getSharedPreferences(context3);
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        int r4 = m8759(sharedPreferences, "appsFlyerAdRevenueCount", true);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", context2.f6704);
        hashMap.put("adrevenue_counter", Integer.valueOf(r4));
        String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        hashMap.put("af_key", string);
        hashMap.put("launch_counter", Integer.valueOf(launchCounter));
        hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
        hashMap.put("uid", C2004ab.m8856(new WeakReference(context3)));
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        hashMap.put("advertiserIdEnabled", AppsFlyerProperties.getInstance().getString("advertiserIdEnabled"));
        if (string2 != null) {
            hashMap.put("advertiserId", string2);
        }
        hashMap.put("device", Build.DEVICE);
        m8778(context3, hashMap);
        try {
            PackageInfo packageInfo = context3.getPackageManager().getPackageInfo(context3.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            long j = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("install_date", simpleDateFormat.format(new Date(j)));
            String string3 = sharedPreferences.getString("appsFlyerFirstInstall", null);
            if (string3 == null) {
                string3 = m8750(simpleDateFormat, context3);
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th) {
            AFLogger.afErrorLog("AdRevenue - Exception while collecting app version data ", th);
        }
        AFEvent r12 = context2.urlString(obj).params(hashMap).mo9886();
        r12.f6703 = launchCounter;
        r12.f6702 = string;
        m8807(AFExecutor.getInstance().mo9890(), new RunnableC1992b(this, r12, (byte) 0), 1, TimeUnit.MILLISECONDS);
    }

    /* renamed from: ı */
    private boolean m8755(AFEvent aFEvent, SharedPreferences sharedPreferences) {
        boolean z;
        boolean z2;
        int launchCounter = getLaunchCounter(sharedPreferences, false);
        if (launchCounter != 1 || (aFEvent instanceof NewGPReferrer)) {
            z = false;
        } else {
            z = true;
        }
        if (sharedPreferences.getBoolean("newGPReferrerSent", false) || launchCounter != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || z) {
            return true;
        }
        return false;
    }

    /* renamed from: ǃ */
    static /* synthetic */ void m8767(AppsFlyerLibCore appsFlyerLibCore, AFEvent aFEvent) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(aFEvent.urlString());
        AFLogger.afInfoLog(sb.toString());
        if (aFEvent.f6697 != null) {
            str = Base64.encodeToString(aFEvent.mo9887(), 2);
            AFLogger.afInfoLog("cached data: ".concat(String.valueOf(str)));
        } else {
            str = new JSONObject(aFEvent.params).toString();
            AFFacebookDeferredDeeplink.C19792.m8721("data: ".concat(String.valueOf(str)));
        }
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("server_request", aFEvent.urlString(), str);
        try {
            appsFlyerLibCore.m8766(aFEvent);
        } catch (IOException e) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false)) {
                appsFlyerLibCore.m8766(aFEvent.urlString(aFEvent.urlString().replace("https:", "http:")));
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send requeset to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.afInfoLog(sb2.toString());
            throw e;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void trackEvent(Context context, String str, Map<String, Object> map) {
        trackEvent(context, str, map, null);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_appsflyer_AppsFlyerLibCore_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* renamed from: ǃ */
    private static int m8759(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
        }
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        if (C2015ai.f6878.mo10069()) {
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai.f6878.mo10066(String.valueOf(i));
        }
        return i;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (context != null) {
            this.f6790 = (Application) context.getApplicationContext();
            if (m8754(context)) {
                if (this.f6767 == null) {
                    C2020f fVar = new C2020f();
                    this.f6767 = fVar;
                    fVar.mo10079(context, new AbstractC2021h() {
                        /* class com.appsflyer.AppsFlyerLibCore.C19841 */

                        @Override // com.appsflyer.internal.AbstractC2021h
                        /* renamed from: ι */
                        public final void mo9989(Map<String, Object> map) {
                            AppsFlyerLibCore.this.f6766 = map;
                            AppsFlyerLibCore.m8768(AppsFlyerLibCore.this, map);
                        }
                    });
                } else {
                    AFLogger.afWarnLog("AFInstallReferrer instance already created");
                }
            }
            this.f6780 = m8782(context);
        } else {
            AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
        }
        return init(str, appsFlyerConversionListener);
    }

    /* renamed from: ι */
    private static String m8797(String str, PackageManager packageManager, String str2) {
        Object obj;
        String str3 = null;
        try {
            Bundle bundle = ((PackageItemInfo) packageManager.getApplicationInfo(str2, SmActions.ACTION_ONTHECALL_EXIT)).metaData;
            if (!(bundle == null || (obj = bundle.get(str)) == null)) {
                str3 = obj.toString();
                if (!str3.replaceAll("\\p{C}", "").equals(str3)) {
                    StringBuilder sb = new StringBuilder("Manifest meta-data ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(str3);
                    sb.append(" contains non-printing characters");
                    AFLogger.afWarnLog(sb.toString());
                }
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Could not find ");
            sb2.append(str);
            sb2.append(" value in the manifest");
            AFLogger.afErrorLog(sb2.toString(), th);
        }
        return str3;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            jSONObject.put(C60375c.f150914a, str2);
        }
        if (str3 != null) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void trackLocation(Context context, double d, double d2) {
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "trackLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put("af_long", Double.toString(d2));
        hashMap.put("af_lat", Double.toString(d));
        AFEvent context2 = new InAppEvent().context(context);
        context2.f6707 = "af_location_coordinates";
        context2.f6704 = hashMap;
        mo9984(context2);
    }

    /* access modifiers changed from: private */
    /* renamed from: ι */
    public static void m8802(Context context, String str, long j) {
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
        boolean z;
        String str;
        String obj = uri.toString();
        if (obj == null) {
            obj = null;
        } else if (obj.matches("fb\\d*?://authorize.*") && obj.contains("access_token")) {
            int indexOf = obj.indexOf(63);
            if (indexOf == -1) {
                str = "";
            } else {
                str = obj.substring(indexOf);
            }
            if (str.length() != 0) {
                ArrayList arrayList = new ArrayList();
                if (str.contains(ContainerUtils.FIELD_DELIMITER)) {
                    arrayList = new ArrayList(Arrays.asList(str.split(ContainerUtils.FIELD_DELIMITER)));
                } else {
                    arrayList.add(str);
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (str2.contains("access_token")) {
                        it.remove();
                    } else {
                        if (sb.length() != 0) {
                            sb.append(ContainerUtils.FIELD_DELIMITER);
                        } else if (!str2.startsWith("?")) {
                            sb.append("?");
                        }
                        sb.append(str2);
                    }
                }
                obj = obj.replace(str, sb.toString());
            }
        }
        if (!map.containsKey("af_deeplink")) {
            map.put("af_deeplink", obj);
        } else {
            String queryParameter = uri.getQueryParameter("media_source");
            String queryParameter2 = uri.getQueryParameter("is_retargeting");
            if (!"AppsFlyer_Test".equals(queryParameter) || !Boolean.parseBoolean(queryParameter2)) {
                z = false;
            } else {
                z = true;
            }
            this.f6776 = z;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        final WeakReference weakReference = new WeakReference(context);
        C2002aa aaVar = new C2002aa(uri);
        aaVar.setConnProvider(new OneLinkHttpTask.HttpsUrlConnectionProvider());
        if (aaVar.mo10055()) {
            aaVar.f6849 = new C2002aa.AbstractC2003a() {
                /* class com.appsflyer.AppsFlyerLibCore.C19919 */

                /* renamed from: ǃ */
                private void m8829(Map<String, String> map) {
                    if (weakReference.get() != null) {
                        AppsFlyerLibCore.m8803((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                    }
                }

                @Override // com.appsflyer.internal.C2002aa.AbstractC2003a
                /* renamed from: ı */
                public final void mo9994(String str) {
                    if (AppsFlyerLibCore.f6762 != null) {
                        m8829(hashMap);
                        AFLogger.afDebugLog("Calling onAttributionFailure with:\n".concat(String.valueOf(str)));
                        AppsFlyerLibCore.f6762.onAttributionFailure(str);
                    }
                }

                @Override // com.appsflyer.internal.C2002aa.AbstractC2003a
                /* renamed from: ɩ */
                public final void mo9995(Map<String, String> map) {
                    for (String str : map.keySet()) {
                        hashMap.put(str, map.get(str));
                    }
                    m8829(hashMap);
                    AppsFlyerLibCore.m8769(hashMap);
                }
            };
            AFExecutor.getInstance().getThreadPoolExecutor().execute(aaVar);
            return;
        }
        m8769(AFExecutor.ThreadFactoryC19774.m8714(context, hashMap, uri));
    }

    /* renamed from: ι */
    static /* synthetic */ void m8803(Context context, String str, String str2) {
        SharedPreferences.Editor edit = getSharedPreferences(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void startTracking(Context context, final String str, final AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
        if (Foreground.listener == null) {
            this.f6790 = (Application) context.getApplicationContext();
            if (C2015ai.f6878 == null) {
                C2015ai.f6878 = new C2015ai();
            }
            C2015ai.f6878.mo10067("public_api_call", "startTracking", str);
            String str2 = f6755;
            AFLogger.afInfoLog(String.format("Starting AppsFlyer Tracking: (v%s.%s)", BuildConfig.VERSION_NAME, str2));
            StringBuilder sb = new StringBuilder("Build Number: ");
            sb.append(str2);
            AFLogger.afInfoLog(sb.toString());
            AppsFlyerProperties.getInstance().loadProperties(this.f6790.getApplicationContext());
            if (!TextUtils.isEmpty(str)) {
                AppsFlyerProperties.getInstance().set("AppsFlyerKey", str);
                AFFacebookDeferredDeeplink.C19792.m8722(str);
            } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"))) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate).");
                return;
            }
            Context baseContext = this.f6790.getBaseContext();
            try {
                if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                    if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                        AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                    } else {
                        AFLogger.m8734("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                    }
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("checkBackupRules Exception: ");
                sb2.append(e.toString());
                AFLogger.afRDLog(sb2.toString());
            }
            if (this.f6774) {
                Context applicationContext = this.f6790.getApplicationContext();
                this.f6791 = new HashMap();
                final long currentTimeMillis = System.currentTimeMillis();
                C19863 r8 = new AFFacebookDeferredDeeplink.AppLinkFetchEvents() {
                    /* class com.appsflyer.AppsFlyerLibCore.C19863 */

                    @Override // com.appsflyer.AFFacebookDeferredDeeplink.AppLinkFetchEvents
                    public final void onAppLinkFetchFailed(String str) {
                        AppsFlyerLibCore.this.f6791.put("error", str);
                    }

                    @Override // com.appsflyer.AFFacebookDeferredDeeplink.AppLinkFetchEvents
                    public final void onAppLinkFetchFinished(String str, String str2, String str3) {
                        if (str != null) {
                            AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                            AppsFlyerLibCore.this.f6791.put("link", str);
                            if (str2 != null) {
                                AppsFlyerLibCore.this.f6791.put("target_url", str2);
                            }
                            if (str3 != null) {
                                HashMap hashMap = new HashMap();
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("promo_code", str3);
                                hashMap.put("deeplink_context", hashMap2);
                                AppsFlyerLibCore.this.f6791.put("extras", hashMap);
                            }
                        } else {
                            AppsFlyerLibCore.this.f6791.put("link", "");
                        }
                        AppsFlyerLibCore.this.f6791.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    }
                };
                try {
                    Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, applicationContext);
                    Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                    Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                    Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                    AFFacebookDeferredDeeplink.C19792 r12 = new AFFacebookDeferredDeeplink.C19792(cls, r8);
                    Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r12);
                    String string = applicationContext.getString(applicationContext.getResources().getIdentifier("facebook_app_id", "string", applicationContext.getPackageName()));
                    if (TextUtils.isEmpty(string)) {
                        r8.onAppLinkFetchFailed("Facebook app id not defined in resources");
                    } else {
                        method.invoke(null, applicationContext, string, newProxyInstance);
                    }
                } catch (NoSuchMethodException e2) {
                    r8.onAppLinkFetchFailed(e2.toString());
                } catch (InvocationTargetException e3) {
                    r8.onAppLinkFetchFailed(e3.toString());
                } catch (ClassNotFoundException e4) {
                    r8.onAppLinkFetchFailed(e4.toString());
                } catch (IllegalAccessException e5) {
                    r8.onAppLinkFetchFailed(e5.toString());
                }
            }
            Foreground.m8838(context, new Foreground.AbstractC1998e() {
                /* class com.appsflyer.AppsFlyerLibCore.C19852 */

                @Override // com.appsflyer.Foreground.AbstractC1998e
                /* renamed from: ı */
                public final void mo9990(Activity activity) {
                    if (AppsFlyerLibCore.this.getLaunchCounter(AppsFlyerLibCore.getSharedPreferences(activity), false) < 2) {
                        AFSensorManager r0 = AFSensorManager.m8742(activity);
                        r0.f6738.post(r0.f6744);
                        r0.f6738.post(r0.f6746);
                    }
                    AFLogger.afInfoLog("onBecameForeground");
                    AppsFlyerLibCore.this.f6771 = System.currentTimeMillis();
                    AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                    AFEvent context = new Launch().context(activity);
                    context.f6702 = str;
                    context.f6698 = appsFlyerTrackingRequestListener;
                    appsFlyerLibCore.mo9984(context);
                    AFLogger.resetDeltaTime();
                }

                @Override // com.appsflyer.Foreground.AbstractC1998e
                /* renamed from: ı */
                public final void mo9991(Context context) {
                    AFLogger.afInfoLog("onBecameBackground");
                    AppsFlyerLibCore.this.f6775 = System.currentTimeMillis();
                    AFLogger.afInfoLog("callStatsBackground background call");
                    AppsFlyerLibCore.this.mo9987(new WeakReference<>(context));
                    if (C2015ai.f6878 == null) {
                        C2015ai.f6878 = new C2015ai();
                    }
                    C2015ai aiVar = C2015ai.f6878;
                    if (aiVar.mo10069()) {
                        aiVar.mo10068();
                        if (context != null) {
                            C2015ai.m8875(context.getPackageName(), context.getPackageManager());
                        }
                        aiVar.mo10070();
                    } else {
                        AFLogger.afDebugLog("RD status is OFF");
                    }
                    AFExecutor instance = AFExecutor.getInstance();
                    try {
                        AFExecutor.m8710(instance.f6714);
                        if (instance.f6711 instanceof ThreadPoolExecutor) {
                            AFExecutor.m8710((ThreadPoolExecutor) instance.f6711);
                        }
                    } catch (Throwable th) {
                        AFLogger.afErrorLog("failed to stop Executors", th);
                    }
                    AFSensorManager r4 = AFSensorManager.m8742(context);
                    r4.f6738.post(r4.f6744);
                }
            });
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void trackEvent(Context context, String str, Map<String, Object> map, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
        Map<String, Object> map2;
        if (map == null) {
            map2 = new HashMap<>();
        } else {
            map2 = map;
        }
        JSONObject jSONObject = new JSONObject(map2);
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai.f6878.mo10067("public_api_call", "trackEvent", str, jSONObject.toString());
        if (str != null) {
            AFSensorManager r0 = AFSensorManager.m8742(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (r0.f6737 != 0) {
                r0.f6740++;
                if (r0.f6737 - currentTimeMillis < 500) {
                    r0.f6738.removeCallbacks(r0.f6745);
                    r0.f6738.post(r0.f6746);
                }
            } else {
                r0.f6738.post(r0.f6744);
                r0.f6738.post(r0.f6746);
            }
            r0.f6737 = currentTimeMillis;
        }
        AFEvent context2 = new InAppEvent().context(context);
        context2.f6707 = str;
        context2.f6704 = map;
        context2.f6698 = appsFlyerTrackingRequestListener;
        mo9984(context2);
    }

    /* renamed from: ι */
    private void m8804(Context context, String str, String str2, Intent intent) {
        AFEvent context2 = new Launch().context(context);
        context2.f6707 = null;
        context2.f6702 = str;
        context2.f6704 = null;
        context2.f6706 = str2;
        context2.f6705 = intent;
        context2.f6708 = null;
        m8779(context2);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public void validateAndTrackInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String str6;
        Intent intent;
        if (C2015ai.f6878 == null) {
            C2015ai.f6878 = new C2015ai();
        }
        C2015ai aiVar = C2015ai.f6878;
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        if (map == null) {
            str6 = "";
        } else {
            str6 = map.toString();
        }
        strArr[5] = str6;
        aiVar.mo10067("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isTrackingStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str3);
            sb.append(" ");
            sb.append(str4);
            sb.append(" ");
            sb.append(str5);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str == null || str4 == null || str2 == null || str5 == null || str3 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = f6759;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String string = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        } else {
            intent = null;
        }
        new_insert_after_java_lang_Thread_by_knot(new Thread(new RunnableC2038w(applicationContext, string, str, str2, str3, str4, str5, map, intent))).start();
    }
}
