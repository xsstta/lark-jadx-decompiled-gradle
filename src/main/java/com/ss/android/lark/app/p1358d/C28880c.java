package com.ss.android.lark.app.p1358d;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.app.p1358d.C28877a;
import com.ss.android.lark.app.p1358d.C28880c;
import com.ss.android.lark.biz.core.api.CheckDownloadDialogCallback;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ay;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.featuregating.p1846c.AbstractC37250a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.statistics.p2502b.C51973e;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.app.d.c */
public class C28880c extends FragmentManager.AbstractC1010b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Context f72488a;

    /* renamed from: b */
    public WeakReference<Activity> f72489b;

    /* renamed from: c */
    public C28879b f72490c = new C28879b();

    /* renamed from: d */
    private CallbackManager f72491d;

    /* renamed from: e */
    private WeakReference<FragmentManager> f72492e;

    /* renamed from: f */
    private AbstractC37250a f72493f = C37239a.m146648b();

    /* renamed from: g */
    private AbstractC44544a f72494g;

    /* renamed from: h */
    private AbstractC49379a f72495h;

    /* renamed from: i */
    private FragmentManager.AbstractC1010b f72496i = new FragmentManager.AbstractC1010b() {
        /* class com.ss.android.lark.app.p1358d.C28880c.C288811 */

        @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
        /* renamed from: b */
        public void mo5404b(FragmentManager fragmentManager, Fragment fragment) {
            super.mo5404b(fragmentManager, fragment);
            if (((IIMApi) ApiUtils.getApi(IIMApi.class)).isFeedPage(fragment)) {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).showAppRatingDialogIfNeed(fragment.getActivity());
            }
        }
    };

    /* renamed from: a */
    public void mo102536a() {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    /* renamed from: b */
    private void m105699b() {
        this.f72494g = new AbstractC44544a() {
            /* class com.ss.android.lark.app.p1358d.C28880c.C288822 */

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102547a(String str) {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: b */
            public void mo102548b() {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102546a() {
                C28880c.this.mo102536a();
            }
        };
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerBootMileStoneListener(this.f72494g);
    }

    /* renamed from: c */
    private void m105701c() {
        this.f72495h = new AbstractC49379a() {
            /* class com.ss.android.lark.app.p1358d.C28880c.C288833 */

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102549a(C49380b bVar) {
                AbstractC49379a.CC.$default$a(this, bVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            /* renamed from: a */
            public /* synthetic */ void mo102550a(C49381c cVar) {
                AbstractC49379a.CC.$default$a(this, cVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
            public void onUserSwitchSuccess(C49382d dVar) {
                CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.app.p1358d.C28880c.C288833.RunnableC288841 */

                    public void run() {
                        C28880c.this.f72490c.mo102535a(1);
                        if (C28880c.this.f72489b != null) {
                            Activity activity = C28880c.this.f72489b.get();
                            if (UIUtils.isActivityRunning(activity)) {
                                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkFCMDownloadWithDialog(activity, new CheckDownloadDialogCallback(activity) {
                                    /* class com.ss.android.lark.app.p1358d.$$Lambda$c$3$1$MyQCPpxIWzBoCMZ4x6aR34B0OUQ */
                                    public final /* synthetic */ Activity f$0;

                                    {
                                        this.f$0 = r1;
                                    }

                                    @Override // com.ss.android.lark.biz.core.api.CheckDownloadDialogCallback
                                    public final void onDialogComplete() {
                                        C28880c.C288833.RunnableC288841.m105716a(this.f$0);
                                    }
                                });
                            }
                        }
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m105716a(Activity activity) {
                        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkNewVersionWithDialog(activity, null);
                    }
                });
            }
        };
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(this.f72495h);
    }

    /* renamed from: d */
    private void m105702d() {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(this.f72488a, new IGetDataCallback<DeviceId>() {
            /* class com.ss.android.lark.app.p1358d.C28880c.C288865 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(DeviceId deviceId) {
                Log.m165389i("MilestoneHandler", "DEVICE_ID : " + deviceId.getDeviceId());
            }
        });
        Log.m165389i("MilestoneHandler", "DEVICE_NAME : " + RomUtils.m94957l() + "DEVICE_OS : " + RomUtils.m94958m() + "SUPPORTED_ABIS : " + Arrays.toString(Build.SUPPORTED_ABIS) + "PACKAGE_NAME : " + this.f72488a.getPackageName() + "CHANNEL_NAME : " + PackageChannelManager.getBuildPackageChannel(LarkContext.getApplication()));
    }

    /* renamed from: a */
    public void mo102538a(Application application) {
        this.f72488a = application.getApplicationContext();
        this.f72491d = new CallbackManager();
        application.registerActivityLifecycleCallbacks(this);
        m105699b();
        m105701c();
    }

    public void onActivityResumed(Activity activity) {
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105701a(activity)) {
            ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).showSwitchAnimStageTwoIfNeed(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105701a(activity)) {
            C51973e.m201590h();
        }
    }

    /* renamed from: b */
    private void m105700b(final Activity activity) {
        this.f72489b = new WeakReference<>(activity);
        CoreThreadPool.getBackgroundHandler().post(new Runnable() {
            /* class com.ss.android.lark.app.p1358d.C28880c.RunnableC288876 */

            public void run() {
                ((IIMApi) ApiUtils.getApi(IIMApi.class)).showDingAddressBookGuideTipsIfNeed(activity);
                C28880c.this.mo102537a(activity);
                final C28877a aVar = new C28877a();
                aVar.mo102533a(new C28877a.AbstractC28878a() {
                    /* class com.ss.android.lark.app.p1358d.C28880c.RunnableC288876.C288881 */

                    @Override // com.ss.android.lark.app.p1358d.C28877a.AbstractC28878a
                    public void doWork() {
                        ((IIMApi) ApiUtils.getApi(IIMApi.class)).showLKPLeanModeAlertDialog(activity, new IGetDataCallback<Boolean>() {
                            /* class com.ss.android.lark.app.p1358d.C28880c.RunnableC288876.C288881.C288891 */

                            /* renamed from: a */
                            public void onSuccess(Boolean bool) {
                                if (!bool.booleanValue()) {
                                    aVar.mo102534b();
                                }
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165383e("MilestoneHandler", errorResult.getMessage());
                                aVar.mo102534b();
                            }
                        });
                    }
                });
                aVar.mo102533a(new C28877a.AbstractC28878a(activity, aVar) {
                    /* class com.ss.android.lark.app.p1358d.$$Lambda$c$6$alQnzZj13zHSn6r6jzLXoAq_vEQ */
                    public final /* synthetic */ Activity f$0;
                    public final /* synthetic */ C28877a f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.app.p1358d.C28877a.AbstractC28878a
                    public final void doWork() {
                        C28880c.RunnableC288876.m105718a(this.f$0, this.f$1);
                    }
                });
                aVar.mo102533a(new C28877a.AbstractC28878a() {
                    /* class com.ss.android.lark.app.p1358d.C28880c.RunnableC288876.C288902 */

                    @Override // com.ss.android.lark.app.p1358d.C28877a.AbstractC28878a
                    public void doWork() {
                        CoreThreadPool.getBackgroundHandler().postDelayed(new Runnable() {
                            /* class com.ss.android.lark.app.p1358d.C28880c.RunnableC288876.C288902.RunnableC288911 */

                            public void run() {
                                if (activity == null || !UIUtils.isActivityRunning(activity)) {
                                    aVar.mo102534b();
                                } else {
                                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkNewVersionWithDialog(activity, new ay() {
                                        /* class com.ss.android.lark.app.p1358d.C28880c.RunnableC288876.C288902.RunnableC288911.C288921 */

                                        @Override // com.ss.android.lark.biz.core.api.ay
                                        /* renamed from: a */
                                        public void mo102558a() {
                                            aVar.mo102534b();
                                        }
                                    });
                                }
                            }
                        }, 3000);
                    }
                });
                aVar.mo102532a();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m105718a(Activity activity, C28877a aVar) {
                aVar.getClass();
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).checkFCMDownloadWithDialog(activity, new CheckDownloadDialogCallback() {
                    /* class com.ss.android.lark.app.p1358d.$$Lambda$AZALQbeEwGDQBCbFsPKMs4QnjJk */

                    @Override // com.ss.android.lark.biz.core.api.CheckDownloadDialogCallback
                    public final void onDialogComplete() {
                        C28877a.this.mo102534b();
                    }
                });
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r2 = r0.getStringExtra("params_share_sourcename");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102537a(final android.app.Activity r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Intent r0 = r4.getIntent()
            r1 = 0
            java.lang.String r2 = "android.intent.extra.LOCAL_ONLY"
            boolean r1 = r0.getBooleanExtra(r2, r1)
            if (r1 == 0) goto L_0x0011
            return
        L_0x0011:
            java.lang.String r1 = "params_share_sourcename"
            java.lang.String r2 = r0.getStringExtra(r1)
            if (r2 == 0) goto L_0x0024
            r0.removeExtra(r1)
            com.ss.android.lark.app.d.c$7 r0 = new com.ss.android.lark.app.d.c$7
            r0.<init>(r4, r2)
            com.larksuite.framework.callback.UICallbackExecutor.execute(r0)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.app.p1358d.C28880c.mo102537a(android.app.Activity):void");
    }

    public void onActivityDestroyed(Activity activity) {
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105701a(activity) && (activity instanceof FragmentActivity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
    /* renamed from: f */
    public void mo5412f(FragmentManager fragmentManager, Fragment fragment) {
        super.mo5412f(fragmentManager, fragment);
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105703a(fragment)) {
            fragment.getChildFragmentManager().unregisterFragmentLifecycleCallbacks(this.f72496i);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
    /* renamed from: b */
    public void mo5404b(FragmentManager fragmentManager, Fragment fragment) {
        super.mo5404b(fragmentManager, fragment);
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105703a(fragment)) {
            m105700b(fragment.getActivity());
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105701a(activity)) {
            C51973e.m201590h();
        } else if (activity instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            this.f72492e = new WeakReference<>(supportFragmentManager);
            supportFragmentManager.registerFragmentLifecycleCallbacks(this, false);
            C51995b.m201718a("MileStoneCreate", null, 1);
            m105702d();
            if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
                this.f72493f.mo136950a();
                CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                    /* class com.ss.android.lark.app.p1358d.C28880c.RunnableC288854 */

                    public void run() {
                        C28880c.this.f72490c.mo102535a(1);
                    }
                });
            }
            C51995b.m201714a();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
    /* renamed from: b */
    public void mo5406b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        super.mo5406b(fragmentManager, fragment, bundle);
        if (((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getMainLauncher().mo105703a(fragment)) {
            fragment.getChildFragmentManager().registerFragmentLifecycleCallbacks(this.f72496i, false);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
    /* renamed from: a */
    public void mo5403a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        super.mo5403a(fragmentManager, fragment, view, bundle);
    }
}
