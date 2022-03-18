package com.ss.android.lark.app.initiator;

import android.content.Context;
import com.ss.android.lark.app.task.InitAsyncBatteryOptionalTask;
import com.ss.android.lark.app.task.InitBaseComponentTask;
import com.ss.android.lark.app.task.InitCrashMonitorTask;
import com.ss.android.lark.app.task.InitPerformanceMonitorTask;
import com.ss.android.lark.app.task.InitTTWebViewBasicTask;
import com.ss.android.lark.app.task.SandboxDependencyInitorTask;
import com.ss.android.lark.app.task.SpInitorTask;
import com.ss.android.lark.app.task.WaitNecessaryTask;
import com.ss.android.lark.app.task.base.AppLauncherTaskScheduler;
import com.ss.android.lark.app.taskv2.central.InitFeatureGatingTask;
import com.ss.android.lark.app.util.C29088f;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.C51721b;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.p2476b.C51714a;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.platform.statistics.perf.C51995b;

/* renamed from: com.ss.android.lark.app.initiator.l */
public class C28924l implements AbstractC28915e {

    /* renamed from: a */
    final AppLauncherTaskScheduler f72540a = new AppLauncherTaskScheduler();

    /* renamed from: a */
    private void m106016a() {
        AppLifecycle.m200904a().mo177967a($$Lambda$l$iu5H_DiFp3SfnerV_76IlSaMZX0.INSTANCE);
        Log.m165389i("AppLifecycle", "SandboxProcessInitor first call NpthANRControl.fixAnrMonitorState");
        C29088f.m106966a(AppLifecycle.m200904a().mo177975e());
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: d */
    public void mo102529d(Context context) {
        C51959a.m201528a();
        C51721b.m200560g().mo177818f();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
        WaitNecessaryTask waitNecessaryTask = new WaitNecessaryTask();
        waitNecessaryTask.mo102766b(SpInitorTask.class);
        waitNecessaryTask.mo102766b(SandboxDependencyInitorTask.class);
        this.f72540a.mo102769a(waitNecessaryTask).mo102770a(context);
        C51995b.m201716a("teaagent_init");
        C51714a.m200520a(context);
        C51995b.m201714a();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        this.f72540a.mo102769a(new InitCrashMonitorTask()).mo102769a(new InitPerformanceMonitorTask()).mo102769a(new InitAsyncBatteryOptionalTask()).mo102770a(context);
        m106016a();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        this.f72540a.mo102769a(new InitBaseComponentTask()).mo102769a(new InitFeatureGatingTask()).mo102769a(new SpInitorTask()).mo102769a(new InitTTWebViewBasicTask()).mo102769a(new SandboxDependencyInitorTask()).mo102770a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106017a(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        Log.m165389i("SandboxProcessInitor", "global app state is " + aVar2.mo105887c());
        C29088f.m106966a(aVar2.mo105887c());
    }
}
