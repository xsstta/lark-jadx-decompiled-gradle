package com.ss.android.lark.app.task;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.crash.Npth;
import com.bytedance.ee.bear.dynamicres.DynamicResourceManager;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26278h;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.app.task.initor.SearchCommonModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.SearchWidgetModuleDependencyInitor;
import com.ss.android.lark.app.util.C29088f;
import com.ss.android.lark.app.util.DeviceConfigUtil;
import com.ss.android.lark.app.util.TTPlayerInit;
import com.ss.android.lark.biz.core.api.AbstractC29586u;
import com.ss.android.lark.biz.core.api.C29538a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.p1999b.C39125b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.C48282c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.platform.lifecycle.AppLifecycle;
import com.ss.android.lark.platform.lifecycle.ComponentCallbacks2C51833b;
import com.ss.android.lark.platform.network.C51869i;
import com.ss.android.lark.platform.p2482c.C51790a;
import com.ss.android.lark.platform.p2494o.C51886a;
import com.ss.android.lark.platform.statistics.C51956a;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.helper.CustomHitPointHeaderHolder;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.navigation.Navigation;
import com.ss.android.lark.widget.C58328c;
import java.util.HashMap;

public class InitBaseFeatureTask extends AbstractLaunchTask {
    /* renamed from: g */
    private void m106121g() {
        DynamicResourceManager.f20600b.mo29847a().mo29845a(C37239a.m146648b().mo136951a("tt_gecko_hotfix"));
    }

    /* renamed from: a */
    private void m106112a(Application application) {
        C48282c.m190475a().mo169057a(application);
    }

    /* renamed from: d */
    private void m106118d(Context context) {
        C58328c.m226163a(DesktopUtil.m144301a(context));
    }

    /* renamed from: i */
    private void m106124i(Context context) {
        SearchWidgetModuleDependencyInitor.m106567a(context);
        SearchCommonModuleDependencyInitor.m106523a(context);
    }

    /* renamed from: b */
    private void m106116b(Context context) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(new AbstractC49379a(context) {
            /* class com.ss.android.lark.app.task.$$Lambda$InitBaseFeatureTask$IcTczbdhMhxiHgtEnfG0J3XLQk0 */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

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
            public final void onUserSwitchSuccess(C49382d dVar) {
                InitBaseFeatureTask.m106115a(this.f$0, dVar);
            }
        });
        C28513a.m104512a(new C28513a.AbstractC28514a(context) {
            /* class com.ss.android.lark.app.task.$$Lambda$InitBaseFeatureTask$tSgLimahc1FaXurQRNCGHYbLbfk */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
            public final void onLoginStatusChanged(int i) {
                InitBaseFeatureTask.m106113a(this.f$0, i);
            }
        });
    }

    /* renamed from: f */
    private void m106120f(Context context) {
        CustomHitPointHeaderHolder.f135720a.mo187488b(Boolean.valueOf(C26278h.m95144a()));
        CustomHitPointHeaderHolder.f135720a.mo187491c(Boolean.valueOf(C26278h.m95145a(context)));
        Statistics.updateTeaAgentCustomHeaderAsync();
    }

    /* renamed from: c */
    private void m106117c(Context context) {
        boolean z;
        boolean a = C37239a.m146648b().mo136951a("navigation.open.page");
        Log.m165388i("isNavigationEnable=" + a);
        if (!a || DeviceConfigUtil.m106949a(context)) {
            z = false;
        } else {
            z = true;
        }
        Navigation.setIsNavigationEnable(z);
        if (z) {
            Navigation.setNavigationListener(new Navigation.AbstractC57855a() {
                /* class com.ss.android.lark.app.task.InitBaseFeatureTask.C289401 */

                @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57855a
                /* renamed from: a */
                public void mo102690a(String str, int i) {
                    C51956a.m201510a(str, i);
                }

                @Override // com.ss.android.lark.utils.navigation.Navigation.AbstractC57855a
                /* renamed from: a */
                public void mo102691a(String str, String str2, long j) {
                    C51956a.m201511a(str, str2, j);
                }
            });
        }
    }

    /* renamed from: e */
    private void m106119e(Context context) {
        String str;
        DesktopUtil.m144297a(C37239a.m146648b().mo136951a("lark.desktop.mode.enable"));
        CustomHitPointHeaderHolder aVar = CustomHitPointHeaderHolder.f135720a;
        if (DesktopUtil.m144301a(context)) {
            str = "1";
        } else {
            str = "0";
        }
        aVar.mo187496g(str);
        Statistics.updateTeaAgentCustomHeaderAsync();
        HashMap hashMap = new HashMap(1);
        hashMap.put("LKP", String.valueOf(DesktopUtil.m144307b()));
        Npth.addTags(hashMap);
    }

    /* renamed from: g */
    private void m106122g(Context context) {
        DialogC25637f.m91762a(DesktopUtil.m144301a(context));
        if (DesktopUtil.m144301a(context)) {
            LKUIToast.setBottomMargin(UIHelper.dp2px(112.0f));
        }
    }

    /* renamed from: h */
    private void m106123h(Context context) {
        AppLifecycle.m200904a().mo177967a(new AbstractC29586u(context) {
            /* class com.ss.android.lark.app.task.$$Lambda$InitBaseFeatureTask$i1c2SEsPW_8DJo6LPawXXJQlLJM */
            public final /* synthetic */ Context f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.ss.android.lark.biz.core.api.AbstractC29586u
            public final void onAppLifecycleChanged(AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
                InitBaseFeatureTask.m106114a(this.f$0, aVar, aVar2);
            }
        });
        AppLifecycle.m200904a().mo177965a(new C29538a() {
            /* class com.ss.android.lark.app.task.InitBaseFeatureTask.C289412 */

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityDestroyed(Activity activity) {
                C51869i.m201156b(null);
            }

            @Override // com.ss.android.lark.biz.core.api.C29538a
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C51869i.m201156b(activity.getClass().getSimpleName());
            }
        });
        Log.m165389i("AppLifecycle", "InitBaseFeatureTask first call NpthANRControl.fixAnrMonitorState");
        C29088f.m106966a(AppLifecycle.m200904a().mo177975e());
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        C39125b.m154428a(context);
        boolean z = context instanceof Application;
        if (z) {
            C51995b.m201718a("life_setup", null, 1);
            Application application = (Application) context;
            ComponentCallbacks2C51833b.m200967a(application);
            m106112a(application);
            C51995b.m201714a();
        }
        AppLifecycle.m200904a().mo177963a(new AppLifecycle.C51827a.C51828a(context).mo178000a($$Lambda$L43QGf0R05A90UtGJTKZpOLcXSM.INSTANCE).mo178002a());
        m106123h(context);
        if (z) {
            C51995b.m201718a("init_push_channel", null, 1);
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initNotificationModule(context);
            C51995b.m201714a();
        }
        m106119e(context);
        m106120f(context);
        m106122g(context);
        m106118d(context);
        m106121g();
        m106117c(context);
        m106124i(context);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initDynamicResources(context);
        m106116b(context);
        if (((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin()) {
            C57744a.m224104a().putBoolean("feature_key_traditional_chinese_enable_gsp", C37239a.m146648b().mo136951a("lark.i18n.traditional.chinese"));
        }
        TTPlayerInit.m106988a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106115a(Context context, C49382d dVar) {
        Log.m165389i("InitBaseFeatureTask", "onAccountChange, init dynamic resources again.");
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initDynamicResources(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106113a(Context context, int i) {
        Log.m165379d("InitBaseFeatureTask", "onLoginStatusChanged loginType:" + i + ",init dynamic resources again.");
        if (i == 1) {
            ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initDynamicResources(context);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106114a(Context context, AbstractC29586u.C29587a aVar, AbstractC29586u.C29587a aVar2) {
        C51790a.m200788a(aVar, aVar2);
        Log.m165389i("AppLifecycle", "state changed, " + aVar2.toString());
        if (aVar2.mo105887c() != aVar.mo105887c()) {
            if (C57765ac.m224188b(context)) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).noticeClientEvent(aVar2.mo105887c());
                Log.m165389i("AppLifecycle", "set main rustsdk app state, is  " + aVar2.mo105887c());
                ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).setIsAppInFront(aVar2.mo105887c());
                if (aVar2.mo105887c()) {
                    ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).startWschannelServiceDelay(context, 5);
                }
            } else if (C57765ac.m224187a(context)) {
                ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).setIsAppInFront(aVar2.mo105887c());
            } else if (C57765ac.m224189c(context)) {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).noticeClientEvent(aVar2.mo105888d());
            }
            CoreThreadPool.setAppFrontStats(aVar2.mo105887c());
            C51886a.m201246a().mo168811a(aVar2.mo105887c(), aVar.mo105886b(), aVar2.mo105886b());
            C29088f.m106966a(aVar2.mo105887c());
        }
    }
}
