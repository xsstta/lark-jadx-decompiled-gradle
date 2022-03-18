package com.ss.android.lark.app.p1357c;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.component.safemode.SafeModeConstants;
import com.larksuite.component.safemode.SafeModeManager;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.initiator.AbstractC28915e;
import com.ss.android.lark.app.p1358d.C28880c;
import com.ss.android.lark.app.task.DoubleThreadQuickenInit;
import com.ss.android.lark.app.task.InitAppendSoLibPathTask;
import com.ss.android.lark.app.task.InitAppreciableTask;
import com.ss.android.lark.app.task.InitAttributionTask;
import com.ss.android.lark.app.task.InitBrowserModuleTask;
import com.ss.android.lark.app.task.InitDynamicFeatureTask;
import com.ss.android.lark.app.task.InitFileFgTask;
import com.ss.android.lark.app.task.InitMeegoTask;
import com.ss.android.lark.app.task.InitMonitorTask;
import com.ss.android.lark.app.task.InitNightModeTask;
import com.ss.android.lark.app.task.InitOPPluginConfigTask;
import com.ss.android.lark.app.task.InitPrivacyTask;
import com.ss.android.lark.app.task.UpdateUserAgentTask;
import com.ss.android.lark.app.taskv2.InitScreenshotsTask;
import com.ss.android.lark.app.taskv2.central.CentralStageFinishedTask;
import com.ss.android.lark.app.taskv2.central.InitCentralModuleTask;
import com.ss.android.lark.app.taskv2.central.InitCrashMonitorTaskV2;
import com.ss.android.lark.app.taskv2.central.InitFeatureGatingTask;
import com.ss.android.lark.app.taskv2.central.InitKVDataStoreTask;
import com.ss.android.lark.app.taskv2.central.InitLanguageTask;
import com.ss.android.lark.app.taskv2.central.InitLogTask;
import com.ss.android.lark.app.taskv2.central.InitMiraTask;
import com.ss.android.lark.app.taskv2.central.InitRustSdkTask;
import com.ss.android.lark.app.taskv2.central.InitRxJavaTask;
import com.ss.android.lark.app.taskv2.central.InitSafeModeTask;
import com.ss.android.lark.app.taskv2.central.InitTTWebViewBasicTaskV2;
import com.ss.android.lark.app.taskv2.central.InitUIComponentTask;
import com.ss.android.lark.app.taskv2.central.StartMiraTask;
import com.ss.android.lark.app.taskv2.preload.JatoTask;
import com.ss.android.lark.app.taskv2.preload.PreloadStrategyManager;
import com.ss.android.lark.app.taskv2.scheduler.AppLauncherTaskScheduler;
import com.ss.android.lark.app.taskv2.scheduler.LaunchTaskExecutor;
import com.ss.android.lark.app.taskv2.subordinate.InitDeviceIdFetcherTask;
import com.ss.android.lark.app.taskv2.subordinate.InitHotfixModuleTaskV2;
import com.ss.android.lark.app.taskv2.subordinate.InitImSdkTaskV2;
import com.ss.android.lark.app.taskv2.subordinate.InitLoginStatusTaskV2;
import com.ss.android.lark.app.taskv2.subordinate.InitOnlinePushTask;
import com.ss.android.lark.app.taskv2.subordinate.InitTTWebViewBusinessTaskV2;
import com.ss.android.lark.app.taskv2.subordinate.PrefetchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.core.language.LocaleChangeReceiver;
import com.ss.android.lark.http.netstate.NetworkBroadcastReceiver;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.app.c.a */
public class C28858a implements AbstractC28915e {

    /* renamed from: a */
    private AppLauncherTaskScheduler f72483a;

    /* renamed from: b */
    private PreloadStrategyManager f72484b;

    /* renamed from: c */
    private BroadcastReceiver f72485c;

    /* renamed from: d */
    private C28880c f72486d;

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: d */
    public void mo102529d(Context context) {
        PreloadStrategyManager preloadStrategyManager = this.f72484b;
        if (preloadStrategyManager != null) {
            preloadStrategyManager.mo103095a();
        }
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).onAppTerminate();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        this.f72483a.mo103151a(new InitFileFgTask()).mo103151a(new StartMiraTask()).mo103151a(new InitMeegoTask());
        LaunchTaskExecutor.m106910a().mo103158b();
        C51959a.m201542k();
        PreloadStrategyManager preloadStrategyManager = new PreloadStrategyManager();
        this.f72484b = preloadStrategyManager;
        Application application = (Application) context;
        preloadStrategyManager.mo103096a(application);
        LocaleChangeReceiver localeChangeReceiver = new LocaleChangeReceiver();
        this.f72485c = localeChangeReceiver;
        m105689a(context, localeChangeReceiver, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        NetworkBroadcastReceiver.m153065a(context);
        C28880c cVar = new C28880c();
        this.f72486d = cVar;
        cVar.mo102538a(application);
        C51995b.m201724b("wait_main_activity_start", "wait_main_activity_start");
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        C57824f.m224464a(true);
        C57824f.m224466b(true);
        AppLauncherTaskScheduler appLauncherTaskScheduler = new AppLauncherTaskScheduler(null);
        this.f72483a = appLauncherTaskScheduler;
        appLauncherTaskScheduler.mo103151a(new InitLogTask()).mo103151a(new InitFeatureGatingTask()).mo103151a(new InitKVDataStoreTask()).mo103151a(new InitLanguageTask().mo92544a(InitKVDataStoreTask.class)).mo103151a(new InitCrashMonitorTaskV2().mo92544a(InitKVDataStoreTask.class)).mo103151a(new InitTTWebViewBasicTaskV2().mo92544a(InitLanguageTask.class)).mo103151a(new InitRustSdkTask()).mo103151a(new InitCentralModuleTask()).mo103151a(new InitMiraTask().mo92544a(InitLanguageTask.class));
        this.f72483a.mo103154b(context);
        Log.m165389i("MainProcessInitiator", "use new launch logic!!!");
        this.f72483a.mo103151a(new InitNightModeTask().mo92544a(InitLanguageTask.class).mo92544a(InitMiraTask.class));
        this.f72483a.mo103154b(context);
        this.f72483a.mo103151a(new InitUIComponentTask().mo92544a(InitNightModeTask.class)).mo103151a(new InitDeviceIdFetcherTask()).mo103151a(new InitMonitorTask()).mo103151a(new JatoTask()).mo103151a(new CentralStageFinishedTask()).mo103151a(new InitAppreciableTask()).mo103151a(new DoubleThreadQuickenInit());
        this.f72483a.mo103151a(new PrefetchTask()).mo103151a(new InitImSdkTaskV2()).mo103151a(new InitHotfixModuleTaskV2().mo92544a(PrefetchTask.class)).mo103151a(new InitLoginStatusTaskV2().mo92544a(InitImSdkTaskV2.class).mo92544a(InitNightModeTask.class));
        if (SafeModeManager.f62333a.mo88864a() != SafeModeConstants.SafeModeLevel.NONE) {
            this.f72483a.mo103151a(new InitSafeModeTask().mo92544a(InitHotfixModuleTaskV2.class).mo92544a(InitLoginStatusTaskV2.class));
            this.f72483a.mo103154b(context);
        }
        this.f72483a.mo103151a(new InitOnlinePushTask().mo92544a(InitImSdkTaskV2.class)).mo103151a(new InitTTWebViewBusinessTaskV2().mo92544a(InitHotfixModuleTaskV2.class).mo92544a(InitLoginStatusTaskV2.class)).mo103151a(new InitAppendSoLibPathTask().mo92544a(InitHotfixModuleTaskV2.class)).mo103151a(new InitRxJavaTask().mo92544a(InitAppendSoLibPathTask.class)).mo103151a(new InitAttributionTask().mo92544a(InitDeviceIdFetcherTask.class)).mo103151a(new InitDynamicFeatureTask()).mo103151a(new UpdateUserAgentTask()).mo103151a(new InitOPPluginConfigTask()).mo103151a(new InitBrowserModuleTask()).mo103151a(new InitPrivacyTask());
        ILaunchTask initOPMonitorTask = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getInitOPMonitorTask();
        if (initOPMonitorTask != null) {
            this.f72483a.mo103151a(initOPMonitorTask.mo92544a(InitRxJavaTask.class));
        }
        this.f72483a.mo103151a(new InitScreenshotsTask());
        this.f72483a.mo103152a(context);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m105689a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
