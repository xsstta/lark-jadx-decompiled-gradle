package com.larksuite.component.safemode;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import com.bytedance.apm.ApmAgent;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.Npth;
import com.larksuite.component.safemode.SafeModeConstants;
import com.larksuite.component.safemode.entity.SafeModeConfig;
import com.larksuite.component.safemode.entity.SafeModeState;
import com.larksuite.component.safemode.preference.SafeModePreference;
import com.larksuite.component.safemode.ui.SafeModeActivity;
import com.larksuite.component.safemode.utils.VirtualBoxUtil;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.exception.crash.C37008a;
import com.ss.android.lark.exception.crash.p1828a.p1829a.C37015b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57849k;
import com.ss.android.lark.utils.LarkContext;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004H\u0002J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\u0012J\b\u0010%\u001a\u00020\u0012H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010\u000e2\b\u0010'\u001a\u0004\u0018\u00010\u000eH\u0002J\u0016\u0010(\u001a\u00020\u0004*\u00020)2\b\b\u0002\u0010*\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/larksuite/component/safemode/SafeModeManager;", "", "()V", "TAG", "", "hasException", "", "isInitialized", "lock", "safeModeConfig", "Lcom/larksuite/component/safemode/entity/SafeModeConfig;", "safeModeDependency", "Lcom/larksuite/component/safemode/ISafeModeDependency;", "safeModeState", "Lcom/larksuite/component/safemode/entity/SafeModeState;", "virtualBoxInfo", "", "checkVirtualBox", "", "clearPrefAndDB", "context", "Landroid/content/Context;", "ensureSafeModeStateInit", "getSafeModeLevel", "Lcom/larksuite/component/safemode/SafeModeConstants$SafeModeLevel;", "init", "initCrashCallback", "isIgnoredEmergency", "onCrash", ShareHitPoint.f121869d, "Lcom/bytedance/crash/CrashType;", "report", "event", "saveSafeModeConfig", "config", "Lorg/json/JSONObject;", "setIgnoredEmergency", "startSafeMode", "validateSafeModeState", "localSafeModeState", "joinToString", "Lorg/json/JSONArray;", "separator", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.safemode.b */
public final class SafeModeManager {

    /* renamed from: a */
    public static final SafeModeManager f62333a = new SafeModeManager();

    /* renamed from: b */
    private static volatile boolean f62334b;

    /* renamed from: c */
    private static final Object f62335c = new Object();

    /* renamed from: d */
    private static SafeModeState f62336d;

    /* renamed from: e */
    private static boolean f62337e;

    /* renamed from: f */
    private static SafeModeConfig f62338f;

    /* renamed from: g */
    private static ISafeModeDependency f62339g;

    /* renamed from: h */
    private static CharSequence f62340h;

    private SafeModeManager() {
    }

    /* renamed from: a */
    public final void mo88869a(JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(jSONObject, "config");
        SafeModeConfig.f62319a.mo88853a(jSONObject);
        f62338f = SafeModeConfig.f62319a.mo88852a();
    }

    /* renamed from: a */
    public final void mo88868a(String str) {
        SafeModeState bVar = f62336d;
        if (bVar != null) {
            ISafeModeDependency aVar = f62339g;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("safeModeDependency");
            }
            JSONArray patchInfos = aVar.getPatchInfos();
            ApmAgent.monitorEvent(str, new JSONObject().put(ShareHitPoint.f121869d, bVar.mo88854a()).put("hotfix", patchInfos != null ? m91404a(f62333a, patchInfos, null, 1, null) : null), new JSONObject().put("num", bVar.mo88858e()), null);
        }
    }

    /* renamed from: d */
    public final void mo88872d() {
        SafeModePreference.f62347a.mo88890b("ignore", 3);
    }

    /* renamed from: e */
    public final boolean mo88873e() {
        int a = SafeModePreference.f62347a.mo88885a("ignore", 0);
        if (a <= 0) {
            return false;
        }
        SafeModePreference.f62347a.mo88890b("ignore", a - 1);
        return true;
    }

    /* renamed from: g */
    private final void m91410g() {
        Intent intent = new Intent();
        intent.setClassName(LarkContext.getApplication(), SafeModeActivity.class.getName());
        intent.setFlags(268435456);
        LarkContext.getApplication().startActivity(intent);
    }

    /* renamed from: c */
    public final void mo88871c() {
        String c = C26252ad.m94994c(LarkContext.getApplication());
        if (!Intrinsics.areEqual(c, "safemode")) {
            C25618c cVar = C25618c.f62346a;
            Npth.registerCrashCallback(cVar, CrashType.ALL);
            LarkContext.getApplication().registerActivityLifecycleCallbacks(new C25616b(c, cVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.safemode.b$a */
    static final class RunnableC25614a implements Runnable {

        /* renamed from: a */
        public static final RunnableC25614a f62341a = new RunnableC25614a();

        RunnableC25614a() {
        }

        public final void run() {
            Log.m165389i("SafeModeManager", "start init safe mode");
            SafeModeManager.f62333a.mo88870b();
            Log.m165389i("SafeModeManager", "safe mode enable " + SafeModeManager.m91402a(SafeModeManager.f62333a).mo88842a());
            if (SafeModeManager.m91402a(SafeModeManager.f62333a).mo88842a()) {
                SafeModeManager.f62333a.mo88871c();
                SafeModeManager.f62333a.mo88874f();
            } else if (!C26284k.m95185a(LarkContext.getApplication()) && C26252ad.m94993b(LarkContext.getApplication())) {
                C37008a.m146044a().mo136535a(new C37015b(LarkContext.getApplication(), C256151.f62342a));
            }
        }
    }

    /* renamed from: a */
    public final SafeModeConstants.SafeModeLevel mo88864a() {
        int i;
        mo88870b();
        synchronized (f62335c) {
            SafeModeState bVar = f62336d;
            if (bVar != null) {
                i = bVar.mo88858e();
            } else {
                i = 0;
            }
            Unit unit = Unit.INSTANCE;
        }
        SafeModeConfig aVar = f62338f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
        }
        if (i >= aVar.mo88848f()) {
            return SafeModeConstants.SafeModeLevel.EMERGENCY;
        }
        SafeModeConfig aVar2 = f62338f;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
        }
        if (i >= aVar2.mo88846e()) {
            return SafeModeConstants.SafeModeLevel.URGENT;
        }
        SafeModeConfig aVar3 = f62338f;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
        }
        if (i >= aVar3.mo88845d()) {
            return SafeModeConstants.SafeModeLevel.SERIOUS;
        }
        return SafeModeConstants.SafeModeLevel.NONE;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"com/larksuite/component/safemode/SafeModeManager$initCrashCallback$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.safemode.b$b */
    public static final class C25616b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ String f62343a;

        /* renamed from: b */
        final /* synthetic */ ICrashCallback f62344b;

        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.safemode.b$b$a */
        static final class RunnableC25617a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C25616b f62345a;

            RunnableC25617a(C25616b bVar) {
                this.f62345a = bVar;
            }

            public final void run() {
                String str;
                SafeModeManager bVar = SafeModeManager.f62333a;
                if (!SafeModeManager.f62337e) {
                    Log.m165389i("SafeMode_Debug", "startup success, clear safemode state");
                    SafeModeManager bVar2 = SafeModeManager.f62333a;
                    SafeModeState bVar3 = SafeModeManager.f62336d;
                    if (bVar3 != null && bVar3.mo88858e() >= SafeModeManager.m91402a(SafeModeManager.f62333a).mo88845d()) {
                        SafeModeManager.f62333a.mo88868a("lark_continuous_crash_recover");
                    }
                    SafeModeManager bVar4 = SafeModeManager.f62333a;
                    SafeModeManager.f62336d = null;
                    SafeModePreference aVar = SafeModePreference.f62347a;
                    aVar.mo88888a("sm_key" + this.f62345a.f62343a, (String) null);
                }
                Npth.unregisterCrashCallback(this.f62345a.f62344b, CrashType.ALL);
                SafeModeManager bVar5 = SafeModeManager.f62333a;
                if (SafeModeManager.f62340h != null) {
                    JSONObject jSONObject = new JSONObject();
                    SafeModeManager bVar6 = SafeModeManager.f62333a;
                    ApmAgent.monitorEvent("virtual_box", jSONObject.put("info", SafeModeManager.f62340h), null, null);
                }
                SafeModeManager bVar7 = SafeModeManager.f62333a;
                if (SafeModeManager.f62340h == null) {
                    str = "";
                } else {
                    SafeModeManager bVar8 = SafeModeManager.f62333a;
                    str = String.valueOf(SafeModeManager.f62340h);
                }
                Npth.addTag("info", str);
            }
        }

        C25616b(String str, ICrashCallback iCrashCallback) {
            this.f62343a = str;
            this.f62344b = iCrashCallback;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            if (SafeModeManager.m91402a(SafeModeManager.f62333a).mo88842a()) {
                LarkContext.getApplication().unregisterActivityLifecycleCallbacks(this);
                SafeModeManager.f62333a.mo88870b();
                CoreThreadPool.getBackgroundHandler().postDelayed(new RunnableC25617a(this), ((long) SafeModeManager.m91402a(SafeModeManager.f62333a).mo88843b()) * 1000);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004b, code lost:
        r3 = com.larksuite.framework.utils.C26252ad.m94994c(com.ss.android.lark.utils.LarkContext.getApplication());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4 = com.larksuite.component.safemode.SafeModeManager.f62333a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, "safemode") == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        r5 = com.larksuite.component.safemode.preference.SafeModePreference.f62347a;
        r3 = r5.mo88886a("sm_key" + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0078, code lost:
        if (r3 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007a, code lost:
        r2 = com.larksuite.component.safemode.entity.SafeModeState.f62327a.mo88862a(new org.json.JSONObject(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0085, code lost:
        com.larksuite.component.safemode.SafeModeManager.f62336d = r4.m91403a(r2);
        com.ss.android.lark.log.Log.m165389i("SafeMode_Debug", "init SafeModeSate: " + com.larksuite.component.safemode.SafeModeManager.f62336d);
        r2 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        com.larksuite.component.safemode.SafeModeManager.f62334b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo88870b() {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.safemode.SafeModeManager.mo88870b():void");
    }

    /* renamed from: f */
    public final void mo88874f() {
        try {
            if (!Intrinsics.areEqual(C26252ad.m94994c(LarkContext.getApplication()), "safemode")) {
                if (VirtualBoxUtil.f62349a.mo88894b()) {
                    m91410g();
                    Process.killProcess(Process.myPid());
                    return;
                }
                CharSequence a = VirtualBoxUtil.f62349a.mo88893a();
                f62340h = a;
                if (a != null) {
                    String valueOf = String.valueOf(a);
                    Charset charset = Charsets.f173341a;
                    if (valueOf != null) {
                        byte[] bytes = valueOf.getBytes(charset);
                        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                        byte[] encode = Base64.encode(bytes, 2);
                        Intrinsics.checkExpressionValueIsNotNull(encode, "Base64.encode(virtualBox…eArray(), Base64.NO_WRAP)");
                        String str = new String(encode, Charsets.f173341a);
                        ArrayList<String> arrayList = new ArrayList();
                        arrayList.addAll(SafeModeConstants.f62318b.mo88840a());
                        SafeModeConfig aVar = f62338f;
                        if (aVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
                        }
                        Set<String> g = aVar.mo88849g();
                        if (g != null) {
                            arrayList.addAll(g);
                        }
                        for (String str2 : arrayList) {
                            if (!(!Intrinsics.areEqual(str, str2))) {
                                if (f62340h != null) {
                                    f62333a.m91410g();
                                    Process.killProcess(Process.myPid());
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        } catch (Throwable th) {
            Log.m165380d("SafeMode_Debug", "check failed", th);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ SafeModeConfig m91402a(SafeModeManager bVar) {
        SafeModeConfig aVar = f62338f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
        }
        return aVar;
    }

    /* renamed from: a */
    private final SafeModeState m91403a(SafeModeState bVar) {
        if (bVar == null) {
            return null;
        }
        String a = C26246a.m94977a(LarkContext.getApplication());
        String c = C26252ad.m94994c(LarkContext.getApplication());
        if (!Intrinsics.areEqual(bVar.mo88857d(), a)) {
            Log.m165389i("SafeMode_Debug", "version update");
            SafeModePreference aVar = SafeModePreference.f62347a;
            aVar.mo88888a("sm_key" + c, (String) null);
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b = bVar.mo88855b();
        SafeModeConfig aVar2 = f62338f;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
        }
        if (currentTimeMillis <= b + (((long) aVar2.mo88844c()) * 60 * ((long) 60) * ((long) 1000))) {
            return bVar;
        }
        Log.m165389i("SafeMode_Debug", "timestamp update");
        SafeModePreference aVar3 = SafeModePreference.f62347a;
        aVar3.mo88888a("sm_key" + c, (String) null);
        return null;
    }

    /* renamed from: a */
    public final void mo88865a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        boolean h = C57849k.m224535h(context);
        boolean i = C57849k.m224536i(context);
        Log.m165389i("SafeMode_Debug", "cleanDatabases = " + h + ", " + "cleanSharedPreference = " + i);
    }

    /* renamed from: a */
    public final void mo88866a(CrashType crashType) {
        CrashType crashType2;
        String str;
        int i;
        int i2;
        mo88870b();
        SafeModeConfig aVar = f62338f;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
        }
        if (aVar.mo88842a()) {
            if (crashType == CrashType.JAVA || crashType == CrashType.NATIVE || crashType == CrashType.LAUNCH || crashType == CrashType.ANR) {
                f62337e = true;
                if (crashType == CrashType.LAUNCH) {
                    crashType2 = CrashType.JAVA;
                } else {
                    crashType2 = crashType;
                }
                String c = C26252ad.m94994c(LarkContext.getApplication());
                String a = C26246a.m94977a(LarkContext.getApplication());
                Object obj = f62335c;
                synchronized (obj) {
                    SafeModeState bVar = f62336d;
                    String str2 = null;
                    if (bVar != null) {
                        str = bVar.mo88857d();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, a)) {
                        SafeModeState bVar2 = f62336d;
                        if (bVar2 != null) {
                            str2 = bVar2.mo88854a();
                        }
                        if (Intrinsics.areEqual(str2, crashType2.getName())) {
                            SafeModeState bVar3 = f62336d;
                            if (bVar3 != null) {
                                i2 = bVar3.mo88858e();
                            } else {
                                i2 = 0;
                            }
                            i = 1 + i2;
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                    i = 1;
                    Unit unit2 = Unit.INSTANCE;
                }
                String name = crashType2.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "localCrashType.getName()");
                long currentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkExpressionValueIsNotNull(c, "process");
                Intrinsics.checkExpressionValueIsNotNull(a, "appVersion");
                SafeModeState bVar4 = new SafeModeState(name, currentTimeMillis, c, a, i);
                SafeModePreference.f62347a.mo88888a("sm_key" + c, SafeModeState.f62327a.mo88863a(bVar4).toString());
                synchronized (obj) {
                    Log.m165389i("SafeMode_Debug", "onCrash {type:" + crashType + ", " + "appVersion:" + a + ", " + "oldState:" + f62336d + ", " + "newState:" + bVar4 + '}');
                    f62336d = bVar4;
                    Unit unit3 = Unit.INSTANCE;
                }
                SafeModeState bVar5 = f62336d;
                if (bVar5 != null) {
                    int e = bVar5.mo88858e();
                    SafeModeConfig aVar2 = f62338f;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("safeModeConfig");
                    }
                    if (e >= aVar2.mo88845d()) {
                        f62333a.mo88868a("lark_continuous_crash");
                        return;
                    }
                    return;
                }
                return;
            }
            Log.m165379d("SafeMode_Debug", "onCrash type mismatch");
        }
    }

    /* renamed from: a */
    public final void mo88867a(ISafeModeDependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "safeModeDependency");
        f62339g = aVar;
        CoreThreadPool.getSerialTaskHandler().post(RunnableC25614a.f62341a);
    }

    /* renamed from: a */
    private final String m91405a(JSONArray jSONArray, String str) {
        StringBuilder sb = new StringBuilder();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(jSONArray.getString(i));
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "result.toString()");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", ShareHitPoint.f121869d, "Lcom/bytedance/crash/CrashType;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Ljava/lang/Thread;", "onCrash"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.safemode.b$c */
    public static final class C25618c implements ICrashCallback {

        /* renamed from: a */
        public static final C25618c f62346a = new C25618c();

        C25618c() {
        }

        @Override // com.bytedance.crash.ICrashCallback
        public final void onCrash(CrashType crashType, String str, Thread thread) {
            Intrinsics.checkParameterIsNotNull(crashType, ShareHitPoint.f121869d);
            SafeModeManager.f62333a.mo88866a(crashType);
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m91404a(SafeModeManager bVar, JSONArray jSONArray, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        return bVar.m91405a(jSONArray, str);
    }
}
