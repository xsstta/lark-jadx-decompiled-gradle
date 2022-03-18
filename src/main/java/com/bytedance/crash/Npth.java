package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.C3775n;
import com.bytedance.crash.entity.C3746e;
import com.bytedance.crash.gwpasan.GwpAsan;
import com.bytedance.crash.heaptracker.NativeHeapTracker;
import com.bytedance.crash.nativecrash.NativeCrashCollector;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p217a.AbstractC3689c;
import com.bytedance.crash.p217a.AbstractC3690d;
import com.bytedance.crash.p218b.C3708j;
import com.bytedance.crash.p220d.C3726a;
import com.bytedance.crash.p226j.AbstractC3770a;
import com.bytedance.crash.runtime.AbstractC3858i;
import com.bytedance.crash.runtime.C3823a;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3866n;
import com.bytedance.crash.runtime.ConfigManager;
import com.bytedance.crash.runtime.p227a.C3824a;
import com.bytedance.crash.upload.AbstractC3916j;
import com.bytedance.crash.util.C3933b;
import com.bytedance.crash.util.C3962t;
import com.bytedance.crash.util.C3968x;
import com.bytedance.crash.util.C3969y;
import com.bytedance.crash.util.NativeTools;
import java.util.Map;
import org.json.JSONArray;

public final class Npth {
    private static boolean sInit;

    public static void setAlogWriteAddr(long j) {
    }

    public static boolean isInit() {
        return sInit;
    }

    public static void openANRMonitor() {
        C3775n.m15656g();
    }

    public static void openJavaCrashMonitor() {
        C3775n.m15655f();
    }

    public static void stopAnr() {
        C3775n.m15659j();
    }

    public static void stopEnsure() {
        C3775n.m15665p();
    }

    public static void stopUpload() {
        C3775n.m15664o();
    }

    public static ConfigManager getConfigManager() {
        return C3774m.m15611l();
    }

    public static boolean hasCrash() {
        return C3775n.m15660k();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return C3775n.m15661l();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return C3775n.m15662m();
    }

    public static boolean isANREnable() {
        return C3775n.m15651c();
    }

    public static boolean isJavaCrashEnable() {
        return C3775n.m15646b();
    }

    public static boolean isNativeCrashEnable() {
        return C3775n.m15653d();
    }

    public static boolean isRunning() {
        return C3775n.m15658i();
    }

    public static boolean isStopUpload() {
        return C3775n.m15663n();
    }

    public static boolean openNativeCrashMonitor() {
        return C3775n.m15657h();
    }

    public static int isSandBox() {
        if (NativeTools.m16236b().mo15626n() == 1) {
            return 1;
        }
        return 0;
    }

    public static void dumpHprof(String str) {
        C3775n.m15649c(str);
    }

    public static void enableANRMonitor(boolean z) {
        C3708j.m15307a(z);
    }

    public static void registerHprofCallback(IOOMCallback iOOMCallback) {
        C3775n.m15643b(iOOMCallback);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        C3775n.m15626a(iOOMCallback);
    }

    public static void reportDartError(String str) {
        C3775n.m15634a(str);
    }

    public static void reportError(String str) {
        C3775n.m15644b(str);
    }

    public static void setAlogFlushAddr(long j) {
        C3775n.m15622a(j);
    }

    public static void setAlogFlushV2Addr(long j) {
        C3775n.m15641b(j);
    }

    public static void setAlogLogDirAddr(long j) {
        C3775n.m15647c(j);
    }

    public static void setApplication(Application application) {
        C3774m.m15594a(application);
    }

    public static void setCurProcessName(String str) {
        C3933b.m16329a(str);
    }

    public static void setEncryptImpl(AbstractC3725d dVar) {
        C3775n.m15629a(dVar);
    }

    public static void setLogcatImpl(AbstractC3858i iVar) {
        C3775n.m15632a(iVar);
    }

    public static void setRequestIntercept(AbstractC3916j jVar) {
        C3775n.m15633a(jVar);
    }

    public static void setScriptStackCallback(AbstractC3753g gVar) {
        NativeCrashCollector.m15676a(gVar);
    }

    public static void customActivityName(AbstractC3770a aVar) {
        C3824a.m15819d().mo15398a(aVar);
    }

    public static void reportError(Throwable th) {
        C3775n.m15638a(th);
    }

    public static void setBusiness(String str) {
        if (str != null) {
            C3774m.m15597a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        C3774m.m15602c().setCrashFilter(iCrashFilter);
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            C3774m.m15602c().addTags(map);
        }
    }

    public static long getFileSize(String str) {
        return NativeTools.m16236b().mo15614f(str);
    }

    public static long getFolderSize(String str) {
        return NativeTools.m16236b().mo15604c(str);
    }

    public static void removeTag(String str) {
        C3774m.m15602c().addTag(str, null);
    }

    public static void startGwpAsan(boolean z) {
        Context j = C3774m.m15609j();
        new GwpAsan(z, j, C3962t.m16491c(j), C3840b.m15902t()).mo15275b();
    }

    public static void startNativeHeapTracker(JSONArray jSONArray) {
        Context j = C3774m.m15609j();
        new NativeHeapTracker(jSONArray, C3933b.m16337c(j), C3962t.m16487b(j), j).mo15285b();
    }

    public static void enableGwpAsan(boolean z) {
        if (!NativeTools.m16236b().mo15613e()) {
            C3968x.m16535b("[XAsan]is 32 app.");
        } else if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 29) {
            if ((z || C3774m.m15604e() || C3746e.m15488b()) && !C3840b.m15905w()) {
                startGwpAsan(true);
            }
        }
    }

    public static void setCustomDomain(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("https://") && !str.endsWith("/")) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            C3823a.m15813a(str, jSONArray);
        }
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C3775n.m15625a(iCrashCallback, crashType);
    }

    public static void registerCrashInfoCallback(C3686a aVar, CrashType crashType) {
        C3775n.m15628a(aVar, crashType);
    }

    public static void registerSdk(int i, String str) {
        C3774m.m15593a(i, str);
    }

    public static void setAnrInfoFileObserver(String str, AbstractC3749f fVar) {
        C3775n.m15636a(str, fVar);
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        C3775n.m15642b(iCrashCallback, crashType);
    }

    public static void unregisterHprofCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        C3775n.m15648c(iOOMCallback);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        C3775n.m15627a(iOOMCallback, crashType);
    }

    public static void addTag(String str, String str2) {
        C3774m.m15602c().addTag(str, str2);
    }

    public static void registerSdk(String str, String str2) {
        C3774m.m15598a(str, str2);
    }

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C3774m.m15602c().addAttachUserData(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C3774m.m15602c().addAttachUserData(attachUserData, crashType);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            init(context, iCommonParams, true, false, false);
        }
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C3774m.m15602c().removeAttachCrashContext(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C3774m.m15602c().removeAttachCrashContext(crashType, attachUserData);
        }
    }

    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            C3774m.m15602c().addAttachUserData(attachUserData, crashType);
        }
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams) {
        synchronized (Npth.class) {
            C3774m.m15599a(true);
            init(context, iCommonParams, true, false, true, true);
        }
    }

    public static void enableALogCollector(String str, AbstractC3689c cVar, AbstractC3690d dVar) {
        C3775n.m15635a(str, cVar, dVar);
    }

    public static void reportGameException(String str, String str2, String str3) {
        C3726a.m15358a(str, str2, str3);
    }

    public static void reportDartError(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, IUploadCallback iUploadCallback) {
        C3775n.m15637a(str, map, map2, iUploadCallback);
    }

    public static synchronized void initMiniApp(Context context, ICommonParams iCommonParams, int i, String str) {
        synchronized (Npth.class) {
            C3774m.m15599a(true);
            C3774m.m15601b(i, str);
            init(context, iCommonParams, true, true, true, true);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z, z2, z3);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (Npth.class) {
            init(context, iCommonParams, z, z2, z3, z4, 0);
        }
    }

    public static synchronized void init(Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        Context context2 = context;
        synchronized (Npth.class) {
            if (C3774m.m15610k() != null) {
                application = C3774m.m15610k();
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("Param 'application' have not called 'super.attachBaseContext()', please using 'baseContext' param and invoking 'Npth.setApplication(Application)' before init");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context2 = application.getBaseContext();
                    }
                } finally {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Couldn't obtain Application instance before 'super.attachBaseContext()', please invoking 'Npth.setApplication(Application)' before init.");
                }
            }
            init(application, context2, iCommonParams, z, z2, z3, z4, j);
        }
    }

    public static synchronized void init(Application application, final Context context, ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (Npth.class) {
            SystemClock.uptimeMillis();
            if (!sInit) {
                sInit = true;
                C3774m.m15596a(application, context, iCommonParams);
                new C3771k() {
                    /* class com.bytedance.crash.Npth.C36821 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.crash.C3771k
                    /* renamed from: a */
                    public String mo15085a() {
                        return C3774m.m15608i();
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.crash.C3771k
                    /* renamed from: a */
                    public void mo15086a(String str, String str2) {
                        Npth.registerSdk(str, str2);
                    }

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.crash.C3771k
                    /* renamed from: b */
                    public void mo15087b(String str, String str2) {
                        NativeImpl.m15685a(str, str2);
                    }
                };
                C3775n.m15623a(application, context, z, z2, z3, z4, j);
                C3866n.m16016b().mo15508a(new Runnable() {
                    /* class com.bytedance.crash.Npth.RunnableC36832 */

                    public void run() {
                        Map<String, Object> a = C3774m.m15591a().mo15456a();
                        int a2 = C3969y.m16538a(a.get("update_version_code"), 0);
                        int a3 = C3969y.m16538a(a.get("aid"), 4444);
                        MonitorCrash init = MonitorCrash.init(context, String.valueOf(a3), (long) a2, String.valueOf(a.get("app_version")));
                        if (init != null) {
                            init.config().setDeviceId(C3774m.m15591a().mo15459d()).setChannel(String.valueOf(a.get("channel")));
                        }
                    }
                });
                C3775n.m15631a(new C3775n.C3784b() {
                    /* class com.bytedance.crash.Npth.C36843 */

                    /* access modifiers changed from: package-private */
                    @Override // com.bytedance.crash.C3775n.C3784b
                    /* renamed from: a */
                    public void mo15089a() {
                        NativeHeapTracker.m15554h();
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.bytedance.crash.C3775n.C3784b
                    /* renamed from: a */
                    public void mo15090a(JSONArray jSONArray) {
                        Npth.startNativeHeapTracker(jSONArray);
                    }
                });
                C3775n.m15630a(new C3775n.C3783a() {
                    /* class com.bytedance.crash.Npth.C36854 */

                    /* access modifiers changed from: package-private */
                    @Override // com.bytedance.crash.C3775n.C3783a
                    /* renamed from: a */
                    public void mo15091a(String str) {
                        GwpAsan.m15526a(str);
                    }

                    /* access modifiers changed from: package-private */
                    @Override // com.bytedance.crash.C3775n.C3783a
                    /* renamed from: a */
                    public void mo15092a(boolean z) {
                        Npth.startGwpAsan(z);
                    }
                });
            }
        }
    }
}
