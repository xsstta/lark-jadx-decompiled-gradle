package com.ss.android.lark.app.initiator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.pb.basic.v1.KaInitConfig;
import com.bytedance.lark.sdk.Sdk;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.app.task.AccountRedesignMigrationTask;
import com.ss.android.lark.app.task.InitAppendSoLibPathTask;
import com.ss.android.lark.app.task.InitFileFgTask;
import com.ss.android.lark.app.task.InitMonitorTask;
import com.ss.android.lark.app.task.InitNightModeTask;
import com.ss.android.lark.app.taskv2.central.InitCentralModuleTask;
import com.ss.android.lark.app.taskv2.central.InitCrashMonitorTaskV2;
import com.ss.android.lark.app.taskv2.central.InitFeatureGatingTask;
import com.ss.android.lark.app.taskv2.central.InitKVDataStoreTask;
import com.ss.android.lark.app.taskv2.central.InitLanguageTask;
import com.ss.android.lark.app.taskv2.central.InitLogTask;
import com.ss.android.lark.app.taskv2.central.InitRustSdkTask;
import com.ss.android.lark.app.taskv2.central.InitRxJavaTask;
import com.ss.android.lark.app.taskv2.central.InitUIComponentTask;
import com.ss.android.lark.app.taskv2.scheduler.AppLauncherTaskScheduler;
import com.ss.android.lark.app.taskv2.scheduler.LaunchTaskExecutor;
import com.ss.android.lark.app.taskv2.subordinate.InitDeviceIdFetcherTask;
import com.ss.android.lark.app.taskv2.subordinate.InitHotfixModuleTaskV2;
import com.ss.android.lark.app.taskv2.subordinate.PrefetchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.LocaleChangeReceiver;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.http.netstate.NetworkBroadcastReceiver;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.network.ttnet.C51880f;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.lark.android.passport.biz.account.migration.SessionUpgradeChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.ele.lancet.base.annotations.Skip;

public class PassportUpgradeProcessInitiator implements AbstractC28915e {

    /* renamed from: a */
    private AppLauncherTaskScheduler f72529a;

    /* renamed from: b */
    private BroadcastReceiver f72530b;

    private static class InitUpgradeProcessRustTask extends AsyncLaunchTask {
        private InitUpgradeProcessRustTask() {
        }

        /* renamed from: g */
        private void m105954g() {
            m105955h();
        }

        /* renamed from: i */
        private Locale m105956i() {
            return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLanguageSetting();
        }

        /* renamed from: h */
        private void m105955h() {
            String deviceId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
            if (!TextUtils.isEmpty(deviceId)) {
                C36083a.m141486a().getPassportDependency().mo133097p().setDeviceId(deviceId);
            }
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            super.mo43817a(context);
            Log.m165389i("PassportUpgradeProcessInitiator", "initRustSDK: start");
            String a = C26246a.m94977a(context);
            String a2 = C57824f.m224460a(context, null, m105956i());
            String valueOf = String.valueOf(C29410a.m108287a().mo104277a());
            InitSDKRequest.C15029a aVar = new InitSDKRequest.C15029a();
            aVar.f39738a = C57881t.m224642n(context);
            aVar.mo54906a(new InitSDKRequest.EnvV2(InitSDKRequest.EnvV2.Type.fromValue(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).envType()), ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserUnit(), ""));
            aVar.mo54925i(DynamicConfigModule.m145555d());
            aVar.mo54917b(a);
            aVar.mo54919c(a2);
            boolean z = true;
            aVar.mo54912a((Boolean) true);
            aVar.mo54920d(valueOf);
            aVar.mo54909a(InitSDKRequest.ProcessType.NETWORK);
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).interceptRustInitRequest(aVar);
            if (PackageChannelManager.isKABuildPackage(context)) {
                KaInitConfig.C15033a aVar2 = new KaInitConfig.C15033a();
                aVar2.mo54934a(PackageChannelManager.getBuildPackageChannel(context));
                if (!PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1) {
                    z = false;
                }
                aVar2.mo54933a(Boolean.valueOf(z));
                if (z) {
                    aVar2.mo54936b(DynamicConfigModule.m145555d());
                }
                aVar.mo54910a(aVar2.build());
            }
            try {
                Sdk.getInstance().initSDK(context, aVar);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                Sdk.notifyEndInitSdk();
                throw th;
            }
            Sdk.notifyEndInitSdk();
            m105954g();
        }
    }

    private static class UpgradeProcessStageFinishedTask extends AsyncLaunchTask {
        private UpgradeProcessStageFinishedTask() {
        }

        /* access modifiers changed from: protected */
        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
        /* renamed from: a */
        public List<Class<? extends ILaunchTask>> mo43818a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(InitCentralModuleTask.class);
            arrayList.add(InitCrashMonitorTaskV2.class);
            arrayList.add(InitKVDataStoreTask.class);
            arrayList.add(InitLogTask.class);
            arrayList.add(InitRustSdkTask.class);
            arrayList.add(InitUIComponentTask.class);
            arrayList.add(InitMonitorTask.class);
            arrayList.add(InitDeviceIdFetcherTask.class);
            arrayList.add(AccountRedesignMigrationTask.class);
            arrayList.add(InitUpgradeProcessRustTask.class);
            return arrayList;
        }

        @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
        /* renamed from: a */
        public void mo43817a(Context context) {
            super.mo43817a(context);
            LaunchTaskExecutor.m106910a().mo103159c();
        }
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
        C51880f.m201207a(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: d */
    public void mo102529d(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).onAppTerminate();
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        this.f72529a.mo103151a(new InitFileFgTask());
        this.f72529a.mo103151a(AccountRedesignMigrationTask.f72549a);
        LaunchTaskExecutor.m106910a().mo103158b();
        C51959a.m201542k();
        LocaleChangeReceiver localeChangeReceiver = new LocaleChangeReceiver();
        this.f72530b = localeChangeReceiver;
        m105949a(context, localeChangeReceiver, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        NetworkBroadcastReceiver.m153065a(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        SessionUpgradeChecker.m252936d();
        C57824f.m224464a(true);
        C57824f.m224466b(true);
        AppLauncherTaskScheduler appLauncherTaskScheduler = new AppLauncherTaskScheduler(null);
        this.f72529a = appLauncherTaskScheduler;
        appLauncherTaskScheduler.mo103151a(new InitLogTask()).mo103151a(new InitFeatureGatingTask()).mo103151a(new InitKVDataStoreTask()).mo103151a(new InitLanguageTask().mo92544a(InitKVDataStoreTask.class)).mo103151a(new InitCrashMonitorTaskV2().mo92544a(InitKVDataStoreTask.class)).mo103151a(new InitRustSdkTask()).mo103151a(new InitUpgradeProcessRustTask().mo92544a(InitRustSdkTask.class)).mo103151a(new InitCentralModuleTask());
        this.f72529a.mo103154b(context);
        Log.m165389i("PassportUpgradeProcessInitiator", "use new launch logic!!!");
        this.f72529a.mo103151a(new InitNightModeTask().mo92544a(InitLanguageTask.class));
        this.f72529a.mo103154b(context);
        this.f72529a.mo103151a(new InitUIComponentTask().mo92544a(InitNightModeTask.class)).mo103151a(new InitDeviceIdFetcherTask()).mo103151a(new InitMonitorTask());
        this.f72529a.mo103151a(new PrefetchTask()).mo103151a(new InitHotfixModuleTaskV2().mo92544a(PrefetchTask.class));
        this.f72529a.mo103151a(new InitAppendSoLibPathTask().mo92544a(InitHotfixModuleTaskV2.class)).mo103151a(new InitRxJavaTask().mo92544a(InitAppendSoLibPathTask.class)).mo103151a(new UpgradeProcessStageFinishedTask());
        ILaunchTask initOPMonitorTask = ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).getInitOPMonitorTask();
        if (initOPMonitorTask != null) {
            this.f72529a.mo103151a(initOPMonitorTask.mo92544a(InitRxJavaTask.class));
        }
        this.f72529a.mo103152a(context);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m105949a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
