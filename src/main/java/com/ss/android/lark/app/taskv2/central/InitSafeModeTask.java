package com.ss.android.lark.app.taskv2.central;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.larksuite.component.safemode.SafeModeManager;
import com.larksuite.component.safemode.ui.SafeModeActivity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.app.taskv2.scheduler.LaunchTaskExecutor;
import com.ss.android.lark.biz.core.api.AbstractC29560g;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.larkconfig.userconfig.AbstractC41238h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.ae.C51677a;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.LarkContext;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class InitSafeModeTask extends AbstractLaunchTask {

    /* renamed from: com.ss.android.lark.app.taskv2.central.InitSafeModeTask$3 */
    static /* synthetic */ class C290353 {

        /* renamed from: a */
        static final /* synthetic */ int[] f72751a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.larksuite.component.safemode.SafeModeConstants$SafeModeLevel[] r0 = com.larksuite.component.safemode.SafeModeConstants.SafeModeLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.app.taskv2.central.InitSafeModeTask.C290353.f72751a = r0
                com.larksuite.component.safemode.SafeModeConstants$SafeModeLevel r1 = com.larksuite.component.safemode.SafeModeConstants.SafeModeLevel.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.app.taskv2.central.InitSafeModeTask.C290353.f72751a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.safemode.SafeModeConstants$SafeModeLevel r1 = com.larksuite.component.safemode.SafeModeConstants.SafeModeLevel.SERIOUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.app.taskv2.central.InitSafeModeTask.C290353.f72751a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.safemode.SafeModeConstants$SafeModeLevel r1 = com.larksuite.component.safemode.SafeModeConstants.SafeModeLevel.URGENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.app.taskv2.central.InitSafeModeTask.C290353.f72751a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.safemode.SafeModeConstants$SafeModeLevel r1 = com.larksuite.component.safemode.SafeModeConstants.SafeModeLevel.EMERGENCY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.app.taskv2.central.InitSafeModeTask.C290353.<clinit>():void");
        }
    }

    /* renamed from: c */
    private void m106739c(Context context) {
        Log.m165389i("SafeMode_Debug", "executeUrgent start");
        if (!C57765ac.m224188b(context)) {
            SafeModeManager.f62333a.mo88865a(context);
        }
        AbstractC37250a b = C37239a.m146648b();
        if (b != null) {
            b.mo136956c();
        }
    }

    /* renamed from: d */
    private void m106740d(final Context context) {
        Log.m165389i("SafeMode_Debug", "executeEmergency start");
        if (!SafeModeManager.f62333a.mo88873e()) {
            LarkContext.getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                /* class com.ss.android.lark.app.taskv2.central.InitSafeModeTask.C290342 */

                public void onActivityDestroyed(Activity activity) {
                }

                public void onActivityPaused(Activity activity) {
                }

                public void onActivityResumed(Activity activity) {
                }

                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public void onActivityStarted(Activity activity) {
                }

                public void onActivityStopped(Activity activity) {
                }

                public void onActivityCreated(Activity activity, Bundle bundle) {
                    LarkContext.getApplication().unregisterActivityLifecycleCallbacks(this);
                    Intent intent = new Intent();
                    intent.setClassName(context, SafeModeActivity.class.getName());
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    Process.killProcess(Process.myPid());
                }
            });
        }
    }

    /* renamed from: b */
    private void m106738b(Context context) {
        Log.m165389i("SafeMode_Debug", "executeSerious start");
        if (C57765ac.m224188b(context)) {
            final CountDownLatch countDownLatch = new CountDownLatch(2);
            AbstractC41238h c = C51677a.m200443a().mo148569c();
            c.mo148557a(new AbstractC29560g(countDownLatch) {
                /* class com.ss.android.lark.app.taskv2.central.$$Lambda$InitSafeModeTask$86WTihceRUnrtwZmCLIWGBijzvg */
                public final /* synthetic */ CountDownLatch f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.ss.android.lark.biz.core.api.AbstractC29560g
                public final void notifyCacheUpdated(C29550b bVar) {
                    InitSafeModeTask.m106737a(this.f$0, bVar);
                }
            });
            c.mo148559a(true, (IGetDataCallback<Void>) new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.app.taskv2.central.InitSafeModeTask.C290331 */

                /* renamed from: a */
                public void onSuccess(Void r2) {
                    Log.m165389i("SafeMode_Debug", "executeSerious finish settingV3");
                    countDownLatch.countDown();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("SafeMode_Debug", "executeSerious finish settingV3 failed");
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(5, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            Log.m165389i("SafeMode_Debug", "executeSerious finish");
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        int i = C290353.f72751a[SafeModeManager.f62333a.mo88864a().ordinal()];
        if (i == 2) {
            m106738b(context);
        } else if (i == 3) {
            m106739c(context);
        } else if (i == 4) {
            m106740d(context);
        }
        LaunchTaskExecutor.m106910a().mo103159c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106737a(CountDownLatch countDownLatch, C29550b bVar) {
        Log.m165389i("SafeMode_Debug", "executeSerious finish settingV1");
        countDownLatch.countDown();
    }
}
