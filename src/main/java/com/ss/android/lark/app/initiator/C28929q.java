package com.ss.android.lark.app.initiator;

import android.content.Context;
import com.ss.android.lark.app.task.InitAsyncBatteryOptionalTask;
import com.ss.android.lark.app.task.InitBaseComponentTask;
import com.ss.android.lark.app.task.InitCrashMonitorTask;
import com.ss.android.lark.app.task.InitImSdkWschannelTask;
import com.ss.android.lark.app.task.InitTTWebViewBasicTask;
import com.ss.android.lark.app.task.InitWsOfflinePushTask;
import com.ss.android.lark.app.task.InitWschannelPerformanceMonitorTask;
import com.ss.android.lark.app.task.SpInitorTask;
import com.ss.android.lark.app.task.WaitNecessaryTask;
import com.ss.android.lark.app.task.base.AppLauncherTaskScheduler;
import com.ss.android.lark.app.taskv2.central.InitFeatureGatingTask;
import com.ss.android.lark.app.taskv2.central.InitMiraTask;
import com.ss.android.lark.app.taskv2.central.StartMiraTask;
import com.ss.android.lark.app.util.C29088f;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.http.netstate.NetworkBroadcastReceiver;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.batterymonitor.C51721b;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.sdk.C53254m;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.app.initiator.q */
public class C28929q implements AbstractC28915e {

    /* renamed from: a */
    final AppLauncherTaskScheduler f72545a = new AppLauncherTaskScheduler();

    /* renamed from: a */
    private void m106047a() {
        AppLifecycle.m200904a().mo177967a(new AbstractC29586u() {
            /* class com.ss.android.lark.app.initiator.C28929q.C289301 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
            public void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                Log.m165389i("WschannelProcessInitor", "global app state is " + aVar2.mo105887c());
                C29088f.m106966a(aVar2.mo105887c());
            }
        });
        Log.m165389i("AppLifecycle", "WschannelProcessInitor first call NpthANRControl.fixAnrMonitorState");
        C29088f.m106966a(AppLifecycle.m200904a().mo177975e());
    }

    /* renamed from: e */
    private boolean m106048e(Context context) {
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).isSimpleModeOn(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: d */
    public void mo102529d(Context context) {
        if (!m106048e(context)) {
            C51721b.m200560g().mo177818f();
        }
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: a */
    public void mo102526a(Context context) {
        this.f72545a.mo102769a(new InitBaseComponentTask()).mo102769a(new InitFeatureGatingTask()).mo102769a(new SpInitorTask()).mo102769a(new InitTTWebViewBasicTask()).mo102769a(new InitMiraTask()).mo102770a(context);
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: b */
    public void mo102527b(Context context) {
        C53254m.m205920a(context);
        WaitNecessaryTask waitNecessaryTask = new WaitNecessaryTask();
        waitNecessaryTask.mo102766b(SpInitorTask.class);
        this.f72545a.mo102769a(waitNecessaryTask).mo102770a(context);
        AppLifecycle.m200904a().mo177963a(new AppLifecycle.C51827a.C51828a(context).mo178000a($$Lambda$L43QGf0R05A90UtGJTKZpOLcXSM.INSTANCE).mo178001a("wschannel").mo178002a());
    }

    @Override // com.ss.android.lark.app.initiator.AbstractC28915e
    /* renamed from: c */
    public void mo102528c(Context context) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initWschannelProcess();
        this.f72545a.mo102769a(new InitCrashMonitorTask()).mo102769a(new StartMiraTask()).mo102769a(new InitWsOfflinePushTask()).mo102769a(new InitImSdkWschannelTask()).mo102769a(new InitAsyncBatteryOptionalTask()).mo102769a(new InitWschannelPerformanceMonitorTask()).mo102770a(context);
        m106047a();
        NetworkBroadcastReceiver.m153065a(context);
    }
}
