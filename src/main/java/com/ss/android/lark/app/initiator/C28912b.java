package com.ss.android.lark.app.initiator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.app.task.CompressSoLoaderTask;
import com.ss.android.lark.app.task.InitAppendSoLibPathTask;
import com.ss.android.lark.app.task.InitAsyncBatteryOptionalTask;
import com.ss.android.lark.app.task.InitAvatarLoaderTask;
import com.ss.android.lark.app.task.InitBaseComponentTask;
import com.ss.android.lark.app.task.InitBaseFeatureTask;
import com.ss.android.lark.app.task.InitCrashMonitorTask;
import com.ss.android.lark.app.task.InitGeckoTask;
import com.ss.android.lark.app.task.InitNightModeTask;
import com.ss.android.lark.app.task.InitPerformanceMonitorTask;
import com.ss.android.lark.app.task.InitPrivacyTask;
import com.ss.android.lark.app.task.InitTTWebViewBasicTask;
import com.ss.android.lark.app.task.InitTTWebViewBusinessTask;
import com.ss.android.lark.app.task.ModuleDependencyInitorTask;
import com.ss.android.lark.app.task.SpInitorTask;
import com.ss.android.lark.app.task.WaitNecessaryTask;
import com.ss.android.lark.app.task.base.AppLauncherTaskScheduler;
import com.ss.android.lark.app.taskv2.central.InitFeatureGatingTask;
import com.ss.android.lark.app.taskv2.central.InitLanguageTask;
import com.ss.android.lark.app.taskv2.central.InitMiraTask;
import com.ss.android.lark.app.taskv2.central.InitRxJavaTask;
import com.ss.android.lark.app.taskv2.central.StartMiraTask;
import com.ss.android.lark.core.language.LocaleChangeReceiver;
import com.ss.android.lark.http.netstate.NetworkBroadcastReceiver;
import com.ss.android.lark.platform.batterymonitor.C51721b;
import com.ss.android.lark.platform.p2476b.C51714a;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.vc.api.IVCApi;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.app.initiator.b */
public class C28912b implements AbstractC28915e {

    /* renamed from: a */
    final AppLauncherTaskScheduler f72532a = new AppLauncherTaskScheduler();

    /* renamed from: b */
    private BroadcastReceiver f72533b;

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: d */
    public void mo102529d(Context context) {
        IVCApi iVCApi = (IVCApi) ApiUtils.getApi(IVCApi.class);
        if (iVCApi != null) {
            iVCApi.unInit();
        }
        context.unregisterReceiver(this.f72533b);
        C51959a.m201528a();
        C51721b.m200560g().mo177818f();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
        WaitNecessaryTask waitNecessaryTask = new WaitNecessaryTask();
        waitNecessaryTask.mo102766b(SpInitorTask.class).mo102766b(ModuleDependencyInitorTask.class);
        this.f72532a.mo102769a(waitNecessaryTask).mo102770a(context);
        C51995b.m201716a("teaagent_init");
        C51714a.m200520a(context);
        C51995b.m201714a();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        C57824f.m224464a(true);
        C57824f.m224466b(true);
        this.f72532a.mo102769a(new InitBaseComponentTask()).mo102769a(new InitFeatureGatingTask()).mo102769a(new SpInitorTask()).mo102769a(new InitLanguageTask().mo92544a(SpInitorTask.class)).mo102769a(new InitTTWebViewBasicTask()).mo102769a(new ModuleDependencyInitorTask()).mo102769a(new InitMiraTask()).mo102769a(new InitPrivacyTask()).mo102769a(new InitNightModeTask()).mo102770a(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        this.f72532a.mo102769a(new InitCrashMonitorTask()).mo102769a(new InitTTWebViewBusinessTask()).mo102769a(new CompressSoLoaderTask()).mo102769a(new InitAppendSoLibPathTask()).mo102769a(new StartMiraTask()).mo102769a(new InitGeckoTask()).mo102769a(new InitBaseFeatureTask().mo92544a(InitNightModeTask.class).mo92544a(InitGeckoTask.class)).mo102769a(new InitPerformanceMonitorTask()).mo102769a(new InitAsyncBatteryOptionalTask()).mo102769a(new InitAvatarLoaderTask()).mo102769a(new InitRxJavaTask()).mo102770a(context);
        LocaleChangeReceiver localeChangeReceiver = new LocaleChangeReceiver();
        this.f72533b = localeChangeReceiver;
        m105966a(context, localeChangeReceiver, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        NetworkBroadcastReceiver.m153065a(context);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m105966a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
