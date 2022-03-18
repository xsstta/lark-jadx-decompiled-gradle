package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.InitAppStrategyTask;
import com.ss.android.lark.app.task.InitAsyncBatteryOptionalTask;
import com.ss.android.lark.app.task.InitAsyncMiscTask;
import com.ss.android.lark.app.task.InitGeckoTask;
import com.ss.android.lark.app.task.InitPerformanceMonitorTask;
import com.ss.android.lark.app.task.InitSafetyNetInhouseTask;
import com.ss.android.lark.app.task.InitSettingsTask;
import com.ss.android.lark.app.task.InitThreadPoolEventBusTask;
import com.ss.android.lark.app.task.InitVBoostTask;
import com.ss.android.lark.app.task.MultitaskPostLaunchTask;
import com.ss.android.lark.app.task.ScheduleUploadNetLogTask;
import com.ss.android.lark.app.task.initor.MonitorModuleDependencyInitor;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.openplatform_api.IOpenPlatformApi;
import com.ss.android.lark.platform.af.C51682a;
import com.ss.android.lark.platform.offlinepush.C51894a;
import com.ss.android.lark.platform.statistics.C51957b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.vc.api.IVCApi;
import java.util.ArrayList;
import java.util.List;

public class PreloadTasksFactory {
    /* renamed from: d */
    public static List<ILaunchTask> m106845d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InitCacheCleanTask());
        arrayList.add(new InitTroubleKillerTask());
        arrayList.add(new InitVBoostTask());
        arrayList.add(new ScheduleUploadNetLogTask());
        return arrayList;
    }

    /* renamed from: b */
    public static List<ILaunchTask> m106843b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InitThreadPoolEventBusTask());
        arrayList.add(new InitPerformanceMonitorTask() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadTasksFactory.C290603 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.app.task.InitPerformanceMonitorTask, com.larksuite.framework.launch.task.AbstractLaunchTask
            /* renamed from: a */
            public List<Class<? extends ILaunchTask>> mo43818a() {
                return null;
            }

            @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: e */
            public String mo92547e() {
                return "InitPerformanceMonitorTask";
            }

            @Override // com.ss.android.lark.app.task.InitPerformanceMonitorTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: a */
            public void mo43817a(Context context) {
                MonitorModuleDependencyInitor.m106409a(context);
                super.mo43817a(context);
            }
        });
        arrayList.add(new InitAsyncBatteryOptionalTask());
        arrayList.add(new InitSettingsTask());
        arrayList.add(new InitAsyncMiscTask());
        arrayList.add(new UpdateOsSoftFdLimitTask());
        arrayList.add(new ReportMemoryTask());
        arrayList.add(new StartRaphaelTask());
        arrayList.add(new ReportDiskTask());
        arrayList.add(new InitGeckoTask());
        arrayList.add(new UpdateKaResTask().mo92544a(InitGeckoTask.class));
        arrayList.add(new ReportLanguageSettingTask());
        arrayList.add(new InitOfflineLogoutTask());
        arrayList.add(new initVPNSDKTask());
        return arrayList;
    }

    /* renamed from: a */
    public static List<ILaunchTask> m106842a() {
        ArrayList arrayList = new ArrayList();
        ILaunchTask initVideoChatTask = ((IVCApi) ApiUtils.getApi(IVCApi.class)).getInitVideoChatTask();
        if (initVideoChatTask != null) {
            arrayList.add(initVideoChatTask);
        }
        arrayList.add(new InitAppStrategyTask() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadTasksFactory.C290581 */

            @Override // com.ss.android.lark.app.task.InitAppStrategyTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: b */
            public int mo43824b() {
                return 0;
            }

            @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: e */
            public String mo92547e() {
                return "InitAppStrategyTask";
            }
        });
        arrayList.add(new UpdateTimeZoneTask());
        arrayList.add(new AsyncLaunchTask() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadTasksFactory.C290592 */

            @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: e */
            public String mo92547e() {
                return "InitOfflinePushTask";
            }

            @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: a */
            public void mo43817a(Context context) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).loadFCMFromLocal();
                C51894a.m201282a().mo178073d(context);
            }
        });
        arrayList.add(new InitLKPScreenShotPushTask());
        arrayList.add(new MailPreloadTask());
        arrayList.add(new GadgetPreloadTask());
        arrayList.add(new DocDownloadTask());
        arrayList.add(new DocSetupServicesTask());
        arrayList.add(new InitAuditPreloadTask());
        arrayList.add(new ReportDisplayGearTask());
        arrayList.add(new IdlePreloadTask());
        arrayList.add(new MultitaskPostLaunchTask());
        arrayList.add(new UpdateEmojisTask());
        arrayList.add(new PushMonitorInitTask());
        arrayList.add(new InitSafetyNetInhouseTask());
        if (((ICCMApi) ApiUtils.getApi(ICCMApi.class)).isP0MergeToMainProc()) {
            arrayList.add(new DocSpPreloadTask());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<ILaunchTask> m106844c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AsyncLaunchTask() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadTasksFactory.C290614 */

            @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: e */
            public String mo92547e() {
                return "FirstScreenTaskV2";
            }

            @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: a */
            public void mo43817a(Context context) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).doAot(LarkContext.getApplication().getApplicationContext());
                ((IOpenPlatformApi) ApiUtils.getApi(IOpenPlatformApi.class)).initSdkRequestProcessor();
                C51957b.m201520a();
                if (DesktopUtil.m144301a(context)) {
                    ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).preloadDocSdk(LarkContext.getApplication(), ParticipantRepo.f117150c);
                }
            }
        });
        arrayList.add(new VeSDKConfigTask());
        arrayList.add(new InitLoginNotUrgentTask());
        ILaunchTask preloadXmlTask = ((IIMApi) ApiUtils.getApi(IIMApi.class)).getPreloadXmlTask();
        if (preloadXmlTask != null) {
            arrayList.add(preloadXmlTask);
        }
        arrayList.add(new CardPreloadTask());
        arrayList.add(new AsyncLaunchTask() {
            /* class com.ss.android.lark.app.taskv2.preload.PreloadTasksFactory.C290625 */

            @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
            /* renamed from: a */
            public void mo43817a(Context context) {
                super.mo43817a(context);
                C51682a.m200447a();
            }
        });
        arrayList.add(new PrefetchDynamicResourceTask());
        arrayList.add(new InitMagicTeaTask());
        arrayList.add(new InitFeedbackTask());
        arrayList.add(new InitUgSdkTask());
        arrayList.add(new InitEMMTask());
        if (((IIMApi) ApiUtils.getApi(IIMApi.class)).isEnableJatoBoostRenderThread()) {
            arrayList.add(new JatoRenderThreadTask());
        }
        arrayList.add(new FileMigrateTask());
        return arrayList;
    }
}
