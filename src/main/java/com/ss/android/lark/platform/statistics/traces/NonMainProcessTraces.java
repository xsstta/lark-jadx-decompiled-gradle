package com.ss.android.lark.platform.statistics.traces;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.framework.utils.ProcessIntentConfig;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/platform/statistics/traces/NonMainProcessTraces;", "", "()V", "init", "", "app", "Landroid/app/Application;", "reportDelay", "setFirstActivityListener", "Companion", "SingletonHolder", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.statistics.b.g */
public final class NonMainProcessTraces {

    /* renamed from: a */
    public static long f129059a = C51973e.m201592j();

    /* renamed from: b */
    public static final Companion f129060b = new Companion(null);

    /* renamed from: c */
    private static AtomicBoolean f129061c = new AtomicBoolean(false);

    @JvmStatic
    /* renamed from: a */
    public static final NonMainProcessTraces m201601a() {
        return f129060b.mo178155a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/platform/statistics/traces/NonMainProcessTraces$Companion;", "", "()V", "COLD_DURATION", "", "KEY_BEFORE_FIRST_ACTIVITY_CREATE_TIME", "", "KEY_BEFORE_FIRST_ACTIVITY_RESUME_TIME", "KEY_BEFORE_WEB_VIEW_PAGE_FINISH_TIME", "KEY_FIRST_ACTIVITY_NAME", "KEY_INTENT_START_ID", "KEY_INTENT_START_SOURCE", "KEY_INTENT_START_TIME", "KEY_IS_COLD_LAUNCH", "KEY_PROCESS_NAME", "KEY_WEB_VIEW_PAGE_FINISH_TIME", "REPORT_DELAY_TIME", "TAG", "sAppStartTime", "sHasInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInstance", "Lcom/ss/android/lark/platform/statistics/traces/NonMainProcessTraces;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.statistics.b.g$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final NonMainProcessTraces mo178155a() {
            return SingletonHolder.f129062a.mo178156a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/platform/statistics/traces/NonMainProcessTraces$SingletonHolder;", "", "()V", "instance", "Lcom/ss/android/lark/platform/statistics/traces/NonMainProcessTraces;", "getInstance", "()Lcom/ss/android/lark/platform/statistics/traces/NonMainProcessTraces;", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.statistics.b.g$b */
    public static final class SingletonHolder {

        /* renamed from: a */
        public static final SingletonHolder f129062a = new SingletonHolder();

        /* renamed from: b */
        private static final NonMainProcessTraces f129063b = new NonMainProcessTraces();

        private SingletonHolder() {
        }

        /* renamed from: a */
        public final NonMainProcessTraces mo178156a() {
            return f129063b;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.statistics.b.g$c */
    public static final class RunnableC51977c implements Runnable {

        /* renamed from: a */
        public static final RunnableC51977c f129064a = new RunnableC51977c();

        RunnableC51977c() {
        }

        public final void run() {
            Object b = C51963b.m201565b("webview_page_finish_time");
            if (b != null) {
                C51963b.m201559a("before_webview_page_finish_time", Long.valueOf(((Long) b).longValue() - NonMainProcessTraces.f129059a));
            }
            C51963b.m201566b();
        }
    }

    /* renamed from: b */
    private final void m201602b() {
        new Handler(Looper.getMainLooper()).postDelayed(RunnableC51977c.f129064a, 10000);
    }

    /* renamed from: b */
    private final void m201603b(Application application) {
        application.registerActivityLifecycleCallbacks(new C51978d(System.currentTimeMillis(), application));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/platform/statistics/traces/NonMainProcessTraces$setFirstActivityListener$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityPreCreated", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.statistics.b.g$d */
    public static final class C51978d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        final /* synthetic */ long f129065a;

        /* renamed from: b */
        final /* synthetic */ Application f129066b;

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
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

        public void onActivityResumed(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            C51963b.m201559a("before_first_activity_resume_time", Long.valueOf(System.currentTimeMillis() - NonMainProcessTraces.f129059a));
            this.f129066b.unregisterActivityLifecycleCallbacks(this);
        }

        C51978d(long j, Application application) {
            this.f129065a = j;
            this.f129066b = application;
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent != null) {
                C51963b.m201559a("intent_start_id", (Object) ProcessIntentConfig.f64838a.mo93359a(intent));
                C51963b.m201559a("intent_start_time", Long.valueOf(ProcessIntentConfig.f64838a.mo93360b(intent)));
                C51963b.m201559a("intent_start_source", (Object) ProcessIntentConfig.f64838a.mo93361c(intent));
            }
            String canonicalName = activity.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f129065a < 5000) {
                z = true;
            } else {
                z = false;
            }
            C51963b.m201559a("first_activity_name", (Object) canonicalName);
            C51963b.m201559a("before_first_activity_create_time", Long.valueOf(currentTimeMillis - NonMainProcessTraces.f129059a));
            C51963b.m201559a("is_cold_launch", Boolean.valueOf(z));
        }
    }

    /* renamed from: a */
    public final synchronized void mo178154a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "app");
        if (!f129061c.get()) {
            f129061c.set(true);
            String a = C26252ad.m94992a(application);
            Log.m165389i("NonMainProcessTraces", "init, processName: " + a + ", applicationStartTime: " + f129059a);
            C51963b.m201559a("process_name", (Object) a);
            m201603b(application);
            m201602b();
        }
    }
}
