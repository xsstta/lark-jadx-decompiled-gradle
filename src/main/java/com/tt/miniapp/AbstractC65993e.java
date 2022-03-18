package com.tt.miniapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.component.openplatform.plugins.config.LKOpenApiAccessConfig;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48904a;
import com.ss.android.lark.opmonitor.api.C48905c;
import com.ss.android.lark.opmonitor.model.C48918a;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.optrace.api.AbstractC48929b;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.ss.android.lark.p2069j.p2070a.C40642i;
import com.tt.frontendapiinterface.ApiResult;
import com.tt.frontendapiinterface.IBackPressedListener;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.event.p3280a.C66019a;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66417c;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.manager.SynHistoryManager;
import com.tt.miniapp.p3289g.p3292c.C66186c;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.p3298k.C66266d;
import com.tt.miniapp.p3298k.C66273g;
import com.tt.miniapp.p3327s.AbstractC66737b;
import com.tt.miniapp.p3327s.AbstractC66745e;
import com.tt.miniapp.p3360y.C67414a;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.progress.AbstractC66659a;
import com.tt.miniapp.progress.TMALaunchProgress;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.BaseLaunchLoadingView;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapp.view.swipeback.SwipeBackLayout;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.C67549i;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67527g;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3370d.C67478b;
import com.tt.miniapphost.p3371e.AbstractC67514d;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.option.ui.HostOptionUiDepend;
import com.tt.p3256b.AbstractC65679a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.pkg.AbstractC67825c;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.api.diagnose.entity.C67892a;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import com.tt.refer.p3400a.p3411h.AbstractC67730a;
import com.tt.remotedebug.C67949a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.e */
public abstract class AbstractC65993e implements AbstractC66745e, AbstractC67497e {

    /* renamed from: a */
    protected long f166579a;

    /* renamed from: b */
    protected FragmentActivity f166580b;

    /* renamed from: c */
    protected AppbrandApplicationImpl f166581c;

    /* renamed from: d */
    protected C67414a f166582d = new C67414a();

    /* renamed from: e */
    protected long f166583e = 0;

    /* renamed from: f */
    protected boolean f166584f = false;

    /* renamed from: g */
    protected TimeMeter f166585g;

    /* renamed from: h */
    protected boolean f166586h = true;

    /* renamed from: i */
    protected boolean f166587i = false;

    /* renamed from: j */
    protected SwipeBackLayout f166588j;

    /* renamed from: k */
    protected BaseLaunchLoadingView f166589k;

    /* renamed from: l */
    protected String f166590l;

    /* renamed from: m */
    protected boolean f166591m;

    /* renamed from: n */
    protected boolean f166592n = false;

    /* renamed from: o */
    protected TimeMeter f166593o;

    /* renamed from: p */
    protected AbstractC67433a f166594p;

    /* renamed from: q */
    protected boolean f166595q;

    /* renamed from: r */
    protected boolean f166596r;

    /* renamed from: s */
    public boolean f166597s = false;

    /* renamed from: t */
    public String f166598t;

    /* renamed from: u */
    private List<WeakReference<IBackPressedListener>> f166599u = new ArrayList();

    /* renamed from: v */
    private AbstractC66737b f166600v;

    /* renamed from: w */
    private String f166601w;

    /* renamed from: x */
    private String f166602x;

    /* renamed from: y */
    private C66273g f166603y;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo230996a(int i);

    @Override // com.tt.miniapphost.p3362a.p3363a.AbstractC67434b
    /* renamed from: g */
    public String mo231014g() {
        return null;
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: m */
    public void mo231020m() {
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: n */
    public void mo231024n() {
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: k */
    public long mo231018k() {
        return this.f166579a;
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: l */
    public SwipeBackLayout mo231019l() {
        return this.f166588j;
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public void mo231002a(Bundle bundle, Bundle bundle2) {
        AppBrandLogger.m52830i("BaseActivityProxy", "onCreate, savedInstanceState: " + bundle);
        this.f166585g = TimeMeter.newAndStart();
        C66037e.m258610a(this.f166594p).mo231118b(this.f166585g);
        this.f166592n = bundle != null;
        m258438c(bundle2);
        m258440d(bundle2);
        MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) this.f166581c.getService(MpTimeLineReporter.class);
        mpTimeLineReporter.addPoint("parse_schema_begin");
        AppInfoEntity appInfoEntity = (AppInfoEntity) bundle2.get("microapp_appinfo");
        String string = bundle2.getString("microapp_url");
        if (appInfoEntity == null) {
            appInfoEntity = C66375a.m259513a(string);
        }
        appInfoEntity.schema = string;
        this.f166601w = appInfoEntity.scene;
        this.f166602x = string;
        String queryParameter = Uri.parse(string).getQueryParameter("ws_for_debug");
        if (!TextUtils.isEmpty(queryParameter)) {
            C67949a.m264516b().mo235813a(queryParameter);
        }
        this.f166594p.setAppId(appInfoEntity.appId);
        C67866g.m264032c(new Runnable() {
            /* class com.tt.miniapp.AbstractC65993e.RunnableC659985 */

            public void run() {
                if (HostDependManager.getInst().isPreloadSp()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ((AbstractC12910a) AbstractC65993e.this.f166594p.findServiceByInterface(AbstractC12910a.class)).mo48705e();
                    AppBrandLogger.m52830i("BaseActivityProxy", "preload storage sp Timestamp:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            }
        });
        mpTimeLineReporter.addPoint("parse_schema_end");
        m258436a(appInfoEntity);
        AbstractC67796c cVar = (AbstractC67796c) this.f166594p.findServiceByInterface(AbstractC67796c.class);
        if (cVar != null) {
            cVar.mo88673a(GadgetBeanConverter.convertAppInfoEntityToSchemaEntity(appInfoEntity));
        }
        AbstractC67433a aVar = this.f166594p;
        if (aVar != null && aVar.isEmbedContainer()) {
            AppBrandLogger.m52830i("BaseActivityProxy", "disable app launching notify for embed container");
            ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).setForceNotifyStartLaunchingStatus(false);
        }
        ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).startLaunch(appInfoEntity, string);
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(this.f166594p);
        if (miniAppLifeCycleInstance != null) {
            miniAppLifeCycleInstance.mo49081b();
        }
        ((SubPackageDownloadManager) this.f166581c.getService(SubPackageDownloadManager.class)).setOnSubPackageChangedListener(new AbstractC67825c() {
            /* class com.tt.miniapp.AbstractC65993e.C659996 */

            @Override // com.tt.refer.common.pkg.AbstractC67825c
            /* renamed from: a */
            public void mo231041a(int i, String str, String str2) {
                RenderViewManager.IRender currentIRender;
                if (!TextUtils.isEmpty(str2)) {
                    LaunchScheduler launchScheduler = (LaunchScheduler) AbstractC65993e.this.f166581c.getService(LaunchScheduler.class);
                    RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(AbstractC65993e.this.f166594p).getRenderViewManager();
                    if (!launchScheduler.mAlreadyAppServiceLoadedList.contains(str2)) {
                        AppBrandLogger.m52830i("BaseActivityProxy", "sub package start to load main Js!");
                        launchScheduler.continueLoadSubPackageMainJs(str2);
                    }
                    if (renderViewManager != null && (currentIRender = renderViewManager.getCurrentIRender()) != null) {
                        AppBrandLogger.m52830i("BaseActivityProxy", "sub package start to load some render Js!");
                        currentIRender.onSubAppInstallSuccess();
                    }
                }
            }

            @Override // com.tt.refer.common.pkg.AbstractC67825c
            /* renamed from: b */
            public void mo231042b(int i, String str, String str2) {
                AppBrandLogger.m52830i("BaseActivityProxy", "onSubPkgFailed: code->", str, " reason:", str2, " requestType:", Integer.valueOf(i));
                long stop = TimeMeter.stop(AbstractC65993e.this.f166585g);
                C66036d.m258579a(stop, "download_fail", "miniAppDownloadInstallFail " + str2, TimeMeter.stop(AbstractC65993e.this.f166593o), C66037e.m258610a(AbstractC65993e.this.f166594p).mo231114a(), AbstractC65993e.this.f166594p);
                String schema = AbstractC65993e.this.f166581c.getSchema();
                if (AbstractC65993e.this.f166580b == null || TextUtils.isEmpty(schema) || !HostDependManager.getInst().handleAppbrandDisablePage(AbstractC65993e.this.f166580b, schema)) {
                    AbstractC65993e.this.mo231004a(new Runnable() {
                        /* class com.tt.miniapp.AbstractC65993e.C659996.RunnableC660001 */

                        public void run() {
                            C66194c.m259173a(ErrorCode.DOWNLOAD.UNKNOWN.getCode(), AbstractC65993e.this.f166594p);
                        }
                    });
                } else {
                    new C67500a("app_download_fail", C67501b.aj, AbstractC65993e.this.f166594p).setErrorMessage(str2).setResultTypeFail().flush();
                }
            }
        });
        C67475d.m262459a(appInfoEntity.appId, appInfoEntity.launchFrom, appInfoEntity.scene, appInfoEntity.subScene, appInfoEntity.isGame(), C66037e.m258610a(this.f166594p).mo231120c(), "success", "success", this.f166594p);
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public void mo230999a(Intent intent) {
        Bundle extras = intent.getExtras();
        TimeLogger.getInstance(this.f166594p).logTimeDuration("BaseActivityProxy_onNewIntent");
        AppbrandApplicationImpl.getInst(this.f166594p).getForeBackgroundManager().mo231968j();
        if (extras == null) {
            AppBrandLogger.m52829e("BaseActivityProxy", "onNewIntent fail, intent is null.");
            new C67500a(C67501b.f170233a, this.f166594p).setErrorMessage("onNewIntent, intent is null").flush();
            return;
        }
        AppBrandLogger.m52830i("BaseActivityProxy", "onNewIntent, intent == ", extras.toString());
        OPTrace tracing = AppbrandContext.getInst().getTracing();
        if (tracing != null) {
            tracing.clientDurationEndAll();
        }
        m258435a(extras.getBundle("mp_launch_extra"), "onNewIntent");
        if (extras.containsKey("microapp_url")) {
            mo231001a(extras);
            SynHistoryManager.getInstance().addToRecentApps(this.f166581c.getAppInfo(), this.f166594p);
        } else if (!extras.getBoolean("resume_back", false)) {
            new C67500a(C67501b.f170233a, this.f166594p).setErrorMessage("onNewIntent, intent has no url").flush();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo231001a(Bundle bundle) {
        AppInfoEntity appInfo = this.f166581c.getAppInfo();
        if (appInfo != null && bundle != null) {
            String string = bundle.getString("microapp_url");
            if (this.f166581c != null && !TextUtils.isEmpty(string)) {
                this.f166581c.setSchema(string);
            }
            C66375a.m259521a(string, appInfo);
            this.f166581c.setAppInfo(appInfo);
            C66036d.m258600b(string, this.f166594p);
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public void mo231003a(TimeMeter timeMeter) {
        if (!C25529d.m91166g(this.f166594p) || this.f166580b == this.f166594p.getCurrentActivity()) {
            AppBrandLogger.m52830i("BaseActivityProxy", "onStop");
            if (this.f166581c.getForeBackgroundManager().mo231961c()) {
                AppBrandLogger.m52830i("BaseActivityProxy", "stopWhenBackground");
                return;
            }
            if (!C25529d.m91166g(this.f166594p)) {
                this.f166581c.onHide();
            }
            Map<String, AbstractC67550j> a = C67549i.m262706a(this.f166594p).mo234574a();
            if (a != null) {
                for (AbstractC67550j jVar : a.values()) {
                    jVar.mo234579g();
                }
            }
            if (C67224a.f169675b && !TextUtils.equals(C67224a.f169674a, "others")) {
                C67224a.f169674a = "others";
            }
            C66020b.m258530a("mp_exit", this.f166594p).mo231090a("page_path", mo231014g()).mo231090a("exit_type", C67224a.f169674a).mo231090a("launch_type", this.f166581c.getAppInfo().launchType).mo231090a("duration", Long.valueOf(TimeMeter.stop(timeMeter))).mo231090a("loadstate", C66037e.m258610a(this.f166594p).mo231114a()).mo231090a("progress", Integer.valueOf(mo231016i().getCurrentStatus())).mo231091a(C66019a.m258527a(this.f166594p)).mo231092a();
            new C67500a(C67501b.aF, this.f166594p).reportPlatform(6).tracing(AppbrandContext.getInst().getTraceId()).flush();
            AppInfoEntity appInfo = this.f166581c.getAppInfo();
            this.f166597s = false;
            if (TextUtils.isEmpty(this.f166598t)) {
                this.f166598t = appInfo.appId + C67475d.m262448a(this.f166594p.getAppType()) + this.f166594p.getAppIdentify() + appInfo.versionType;
            }
            C48905c.m192682a(this.f166594p.getApplicationContext(), this.f166598t);
            C67224a.f169675b = true;
            int i = null;
            if (mo230995a() != null) {
                if ("portrait".equals(mo230995a().f165498e)) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            C67556a.m262931a(appInfo, appInfo.isGame(), i, this.f166581c.getStopReason());
            m258437a(appInfo, this.f166583e);
            this.f166581c.setStopReason("");
            this.f166582d.mo234094b();
            C67509b.m262585a();
            AppBrandLogger.flush();
            return;
        }
        Log.m165389i("BaseActivityProxy", "do not onStop，because container > 1");
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public void mo231000a(Intent intent, int i) {
        AppBrandLogger.m52830i("BaseActivityProxy", "onStartActivityForResult");
        this.f166581c.getForeBackgroundManager().mo231968j();
    }

    /* renamed from: a */
    public void mo231004a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            AppbrandContext.getMainHandler().postAtFrontOfQueue(runnable);
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public boolean mo231005a(String str, boolean z) {
        C67527g.AbstractC67530b bVar;
        BaseLaunchLoadingView baseLaunchLoadingView = this.f166589k;
        if (baseLaunchLoadingView == null || !this.f166586h) {
            return false;
        }
        baseLaunchLoadingView.mo49127a(str, z, "false");
        this.f166590l = str;
        this.f166591m = z;
        if (this.f166581c.getAppInfo().isGame()) {
            bVar = C67527g.m262641a().mo234498l();
        } else {
            bVar = C67527g.m262641a().mo234494h();
        }
        if (bVar == null) {
            return true;
        }
        bVar.mo234499a(str);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AppConfig mo230995a() {
        return this.f166581c.getAppConfig();
    }

    /* renamed from: j */
    public void mo231017j() {
        mo231010c(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC66659a mo231016i() {
        return (AbstractC66659a) this.f166581c.getService(TMALaunchProgress.class);
    }

    /* renamed from: o */
    private void mo232126o() {
        boolean z;
        if (HostDependManager.getInst().isDesktop() || !mo231019l().mo233721c()) {
            z = false;
        } else {
            z = true;
        }
        mo232118a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo231012e() {
        Map<String, AbstractC67550j> a = C67549i.m262706a(this.f166594p).mo234574a();
        if (a != null) {
            for (AbstractC67550j jVar : a.values()) {
                jVar.mo234578f();
            }
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: f */
    public void mo231013f() {
        if (this.f166581c.getService(LaunchScheduler.class) != null) {
            ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).onDestroy();
        }
        this.f166580b = null;
        SwipeBackLayout swipeBackLayout = this.f166588j;
        if (swipeBackLayout != null) {
            swipeBackLayout.mo233712a();
            this.f166588j = null;
        }
        BaseLaunchLoadingView baseLaunchLoadingView = this.f166589k;
        if (baseLaunchLoadingView != null) {
            baseLaunchLoadingView.mo49129c();
            this.f166590l = null;
            this.f166591m = false;
        }
        this.f166600v = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo231015h() {
        IBackPressedListener iBackPressedListener;
        for (WeakReference<IBackPressedListener> weakReference : this.f166599u) {
            if (!(weakReference == null || (iBackPressedListener = weakReference.get()) == null || !iBackPressedListener.onBackPressed())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: b */
    public final void mo231006b() {
        AppBrandLogger.m52830i("BaseActivityProxy", "afterOnCreate");
        ((LaunchScheduler) this.f166581c.getService(LaunchScheduler.class)).bindView(this);
        this.f166588j = (SwipeBackLayout) ((PreloadManager) AppbrandApplicationImpl.getInst(this.f166594p).getService(PreloadManager.class)).getPreloadedView(5);
        this.f166588j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mo232126o();
        ((MpTimeLineReporter) this.f166581c.getService(MpTimeLineReporter.class)).addPoint("activity_on_create_end");
        AbstractC67433a aVar = this.f166594p;
        LarkInnerEventHelper.mpAppContainerSetuped(aVar, C66037e.m258610a(aVar).mo231120c());
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void metaExpired() {
        AppBrandLogger.m52830i("BaseActivityProxy", "metaExpired");
        C66036d.m258579a(TimeMeter.stop(this.f166585g), "qr_code_expired", "qr_code_expired", TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
        new C67500a("version_qrcode_expired", C67501b.aq, this.f166594p).setResultTypeFail().flush();
        TimeLogger.getInstance(this.f166594p).logTimeDuration("BaseActivityProxy_MetaExpired");
        mo231016i().stop();
        C66194c.m259174a(ErrorCode.META.EXPIRED.getCode(), ErrorCode.META.EXPIRED.getDesc(), this.f166594p);
        mo231004a(new Runnable() {
            /* class com.tt.miniapp.AbstractC65993e.AnonymousClass12 */

            public void run() {
                C66194c.m259173a(ErrorCode.META.EXPIRED.getCode(), AbstractC65993e.this.f166594p);
            }
        });
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void noPermission() {
        AppBrandLogger.m52830i("BaseActivityProxy", "noPermission ");
        C66036d.m258579a(TimeMeter.stop(this.f166585g), "no_permission", "no_permission", TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
        new C67500a("no_access_permission", C67501b.an, this.f166594p).setResultTypeFail().flush();
        TimeLogger.getInstance(this.f166594p).logError("BaseActivityProxy_NoPermission");
        mo231016i().stop();
        C66194c.m259174a(ErrorCode.META.PERMISSION_DENY.getCode(), ErrorCode.META.PERMISSION_DENY.getDesc(), this.f166594p);
        mo231004a(new Runnable() {
            /* class com.tt.miniapp.AbstractC65993e.AnonymousClass10 */

            public void run() {
                C66194c.m259173a(ErrorCode.META.PERMISSION_DENY.getCode(), AbstractC65993e.this.f166594p);
            }
        });
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: d */
    public void mo231011d() {
        AbstractC67730a aVar;
        AppBrandLogger.m52830i("BaseActivityProxy", "onPause");
        if (C25529d.m91166g(this.f166594p) && !this.f166581c.getForeBackgroundManager().mo231961c()) {
            AppBrandLogger.m52830i("BaseActivityProxy", "send hide");
            this.f166581c.onHide();
        }
        mo231017j();
        if (C25529d.m91146a(AppType.GadgetAPP, "onBackGround") && (aVar = (AbstractC67730a) this.f166594p.findServiceByInterface(AbstractC67730a.class)) != null) {
            aVar.mo87911b();
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void mismatchHost() {
        AppBrandLogger.m52830i("BaseActivityProxy", "mismatchHost");
        C66036d.m258579a(TimeMeter.stop(this.f166585g), "old_js_sdk", "old_js_sdk", TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
        new C67500a("verson_incompatible", C67501b.ao, this.f166594p).setResultTypeFail().flush();
        TimeLogger.getInstance(this.f166594p).logError("BaseActivityProxy_NotSupport");
        mo231016i().stop();
        C66194c.m259174a(ErrorCode.META.HOST_MISMATCH.getCode(), ErrorCode.META.HOST_MISMATCH.getDesc(), this.f166594p);
        HostDependManager.getInst().showUnSupportView(this.f166580b, this.f166581c.getSchema(), new HostOptionUiDepend.AbstractC67695g() {
            /* class com.tt.miniapp.AbstractC65993e.AnonymousClass11 */

            @Override // com.tt.option.ui.HostOptionUiDepend.AbstractC67695g
            /* renamed from: a */
            public void mo231034a() {
                if (AbstractC65993e.this.f166580b != null) {
                    C67224a.f169674a = "others";
                    C67224a.f169675b = true;
                    C67070z.m261391a(AbstractC65993e.this.f166580b, 6, AbstractC65993e.this.f166594p);
                }
            }
        }, this.f166594p);
        AbstractC66737b bVar = this.f166600v;
        if (bVar != null) {
            bVar.mismatchHost();
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void offline() {
        AppBrandLogger.m52830i("BaseActivityProxy", "offline");
        C66036d.m258579a(TimeMeter.stop(this.f166585g), "mp_offline", "mp_offline", TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
        new C67500a("mp_offline", C67501b.ak, this.f166594p).setResultTypeFail().flush();
        TimeLogger.getInstance(this.f166594p).logError("BaseActivityProxy_offline");
        mo231016i().stop();
        C66194c.m259174a(ErrorCode.META.OFFLINE.getCode(), ErrorCode.META.OFFLINE.getDesc(), this.f166594p);
        if (this.f166580b != null) {
            C67224a.f169674a = "others";
            C67224a.f169675b = true;
            String schema = this.f166581c.getSchema();
            if (this.f166580b == null || TextUtils.isEmpty(schema) || !HostDependManager.getInst().handleAppbrandDisablePage(this.f166580b, schema)) {
                HostDependManager inst = HostDependManager.getInst();
                FragmentActivity fragmentActivity = this.f166580b;
                inst.jumpToWebView(fragmentActivity, AppbrandConstant.C65701b.m257612c().mo230141f() + "?" + C67478b.m262466b(), this.f166580b.getResources().getString(R.string.microapp_m_offline), true);
            }
        }
        AbstractC66737b bVar = this.f166600v;
        if (bVar != null) {
            bVar.offline();
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: c */
    public void mo231009c() {
        AbstractC67730a aVar;
        AppBrandLogger.m52830i("BaseActivityProxy", "onResume");
        if (!TextUtils.isEmpty(this.f166601w)) {
            this.f166581c.getAppInfo().scene = this.f166601w;
        }
        if (!TextUtils.isEmpty(this.f166602x)) {
            this.f166581c.setSchema(this.f166602x);
        }
        this.f166597s = true;
        this.f166594p.setCurrentActivity(this.f166580b);
        this.f166581c.setAppActivity(this.f166580b);
        if (C25529d.m91146a(AppType.GadgetAPP, "onForeGround") && (aVar = (AbstractC67730a) this.f166594p.findServiceByInterface(AbstractC67730a.class)) != null) {
            aVar.mo87907a();
        }
        C66420d foreBackgroundManager = this.f166581c.getForeBackgroundManager();
        if (!foreBackgroundManager.mo231961c()) {
            foreBackgroundManager.mo231969k();
            AppBrandLogger.m52830i("BaseActivityProxy", "resumeWhenForeground");
            if (!this.f166595q) {
                return;
            }
        }
        final AppInfoEntity appInfo = this.f166581c.getAppInfo();
        if (!this.f166595q) {
            this.f166581c.onShow();
            if (C25529d.m91146a(AppType.GadgetAPP, "onForeGround")) {
                LarkExtensionManager.getInstance().getExtension().mo49578a(appInfo.appId);
            }
        }
        this.f166595q = false;
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.AbstractC65993e.C660017 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                C66612a.m260229a(appInfo.appId, appInfo.isGame(), appInfo.isSpecial());
            }
        }, Schedulers.shortIO());
        this.f166582d.mo234093a();
        C66020b.m258530a("openplatform_mp_enter_view", this.f166594p).mo231090a("launch_type", appInfo.launchType).mo231092a();
        new C67500a(C67501b.aE, this.f166594p).tracing(AppbrandContext.getInst().getTraceId()).reportPlatform(6).flush();
        AbstractC67514d a = new C67500a(C40642i.f103100g, this.f166594p).mo234325a(appInfo.appId);
        AbstractC67796c cVar = (AbstractC67796c) this.f166594p.findServiceByInterface(AbstractC67796c.class);
        if (cVar != null) {
            a.addMap(cVar.mo88674b());
            a.addCategoryValue("version_type", appInfo.versionType);
        }
        C48918a aVar2 = new C48918a();
        aVar2.mo170798a(a);
        String str = appInfo.appId + C67475d.m262448a(this.f166594p.getAppType()) + this.f166594p.getAppIdentify() + appInfo.versionType;
        this.f166598t = str;
        aVar2.mo170799a(str);
        C48905c.m192681a(this.f166594p.getApplicationContext(), aVar2, new AbstractC48904a() {
            /* class com.tt.miniapp.AbstractC65993e.C660028 */

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48904a
            public int getCurrentHeartBeatStatus(String str) {
                if (!AbstractC65993e.this.f166598t.equals(str) || !AbstractC65993e.this.f166597s) {
                    return 0;
                }
                return 1;
            }
        });
        if (!this.f166586h) {
            mo231012e();
            int i = null;
            if (mo230995a() != null) {
                if ("portrait".equals(mo230995a().f165498e)) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            C67556a.m262930a(appInfo, appInfo.isGame(), i);
            this.f166583e = System.currentTimeMillis();
        }
        mo231012e();
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: b */
    public void mo231008b(Bundle bundle) {
        this.f166588j.mo233717a(this.f166580b, this);
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: b */
    public void mo231007b(int i) {
        if (i == 5 || i == 10 || i == 15) {
            mo232124f(i);
        }
    }

    public void unRegisterBackPressedLinstener(IBackPressedListener iBackPressedListener) {
        WeakReference<IBackPressedListener> a;
        if (iBackPressedListener != null && (a = m258434a(iBackPressedListener)) != null) {
            this.f166599u.remove(a);
        }
    }

    /* renamed from: a */
    private WeakReference<IBackPressedListener> m258434a(IBackPressedListener iBackPressedListener) {
        for (WeakReference<IBackPressedListener> weakReference : this.f166599u) {
            if (weakReference.get() == iBackPressedListener) {
                return weakReference;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m258438c(Bundle bundle) {
        m258435a(bundle.getBundle("mp_launch_extra"), "initExtraData");
        this.f166596r = bundle.getBoolean("extra_ab_preload_result");
    }

    public void registerBackPressedListener(IBackPressedListener iBackPressedListener) {
        if (iBackPressedListener != null && m258434a(iBackPressedListener) == null) {
            this.f166599u.add(new WeakReference<>(iBackPressedListener));
        }
    }

    /* renamed from: a */
    private void m258436a(AppInfoEntity appInfoEntity) {
        if (this.f166592n) {
            appInfoEntity.launchType = "resume";
        } else if (TextUtils.isEmpty(appInfoEntity.launchType)) {
            appInfoEntity.launchType = "normal";
        }
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: c */
    public void mo231010c(int i) {
        C66273g gVar = this.f166603y;
        if (gVar == null) {
            return;
        }
        if (i == 0) {
            gVar.mo231670a();
        } else if (i == 1) {
            gVar.mo231671b();
        } else if (i == 2) {
            gVar.mo231672c();
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void requestAppInfoSuccess(AppInfoEntity appInfoEntity) {
        TimeLogger.getInstance(this.f166594p).logTimeDuration("BaseActivityProxy_requestAppInfoSuccess");
        BaseLaunchLoadingView baseLaunchLoadingView = this.f166589k;
        if (baseLaunchLoadingView != null) {
            baseLaunchLoadingView.mo49126a(appInfoEntity);
        } else {
            AppBrandLogger.m52830i("BaseActivityProxy", "requestAppInfoSuccess mLaunchLoadingView is null");
        }
        AbstractC66737b bVar = this.f166600v;
        if (bVar != null) {
            bVar.requestAppInfoSuccess(appInfoEntity);
        }
        mo231016i().updateStatus(1);
    }

    /* renamed from: d */
    private void mo232122d(int i) {
        if (this.f166594p.isDestroyed() || this.f166594p.isDestroying()) {
            AppBrandLogger.m52829e("BaseActivityProxy", "gadgetAppContext is destroy!");
            return;
        }
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(this.f166594p);
        AppInfoEntity appInfo = this.f166581c.getAppInfo();
        if (miniAppLifeCycleInstance != null && appInfo != null) {
            miniAppLifeCycleInstance.mo229925a(appInfo.appId, (((float) i) * 1.0f) / 100.0f);
        }
    }

    /* renamed from: f */
    private void mo232124f(int i) {
        int i2;
        AppBrandLogger.m52830i("BaseActivityProxy", "onMemoryWarning:" + i);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("level", String.valueOf(i));
            this.f166581c.getJsBridge().sendMsgToJsCore("onMemoryWarning", jSONObject.toString());
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) this.f166580b.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo == null || processMemoryInfo.length <= 0) {
                i2 = 0;
            } else {
                i2 = processMemoryInfo[0].getTotalPss();
            }
            C66020b.m258530a("mp_memorywarning_report", this.f166594p).mo231090a("usedMemory", Integer.valueOf(i2)).mo231090a(ShareHitPoint.f121869d, 1).mo231090a("level", Integer.valueOf(i)).mo231092a();
        } catch (Exception unused) {
            AppBrandLogger.m52829e("BaseActivityProxy", "onMemoryWarning error:" + i);
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void miniAppDownloadInstallFail(String str) {
        TimeLogger.getInstance(this.f166594p).logError("BaseActivityProxy_miniAppDownloadInstallFail");
        mo231016i().stop();
        mo230997a(8, 0);
        long stop = TimeMeter.stop(this.f166585g);
        C66036d.m258579a(stop, "download_fail", "miniAppDownloadInstallFail " + str, TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
        String schema = this.f166581c.getSchema();
        if (this.f166580b == null || TextUtils.isEmpty(schema) || !HostDependManager.getInst().handleAppbrandDisablePage(this.f166580b, schema)) {
            mo231004a(new Runnable() {
                /* class com.tt.miniapp.AbstractC65993e.RunnableC659963 */

                public void run() {
                    C66194c.m259173a(ErrorCode.DOWNLOAD.UNKNOWN.getCode(), AbstractC65993e.this.f166594p);
                }
            });
        } else {
            new C67500a("app_download_fail", C67501b.aj, this.f166594p).setErrorMessage(str).setResultTypeFail().flush();
        }
    }

    /* renamed from: d */
    private void m258440d(Bundle bundle) {
        long j;
        Bundle bundle2 = bundle.getBundle("mp_launch_extra");
        long currentMillis = TimeMeter.currentMillis();
        MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) this.f166581c.getService(MpTimeLineReporter.class);
        if (bundle2 != null) {
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("dump_list");
            if (parcelableArrayList != null) {
                C67892a.m264173a().mo235546a(parcelableArrayList);
            }
            long j2 = bundle2.getLong("mp_open_app_schema_cputime", -1);
            long j3 = bundle2.getLong("mp_start_activity_cputime", -1);
            long j4 = bundle2.getLong("mp_start_activity_timestamp", -1);
            long j5 = bundle2.getLong("mp_open_app_schema_timestamp", -1);
            if (!this.f166592n) {
                SharedPreferences a = C12899a.m53203a(AppbrandContext.getInst().getApplicationContext(), "openSchemaTime");
                String str = "cpu_time_" + ProcessUtil.getProcessIdentify();
                j = j5;
                long j6 = j2 + j3;
                if (a.getLong(str, Long.MIN_VALUE) != j6) {
                    a.edit().putLong(str, j6).apply();
                    currentMillis = bundle2.getLong("entrance_click_timestamp", currentMillis);
                } else {
                    this.f166592n = true;
                }
            } else {
                j = j5;
            }
            Serializable serializable = bundle2.getSerializable("api_access_config");
            if (serializable instanceof LKOpenApiAccessConfig) {
                this.f166594p.setApiAccessConfig((LKOpenApiAccessConfig) serializable);
            }
            mpTimeLineReporter.addPoint("activity_on_create_begin", new MpTimeLineReporter.C67015a().mo233114a("start_type", Integer.valueOf(this.f166592n ? 1 : 0)).mo233115a());
            long j7 = -1;
            if (j != -1) {
                if (j2 != -1) {
                    mpTimeLineReporter.addPoint("open_app_schema", j, j2, null);
                }
                j7 = -1;
            }
            if (!(j4 == j7 || j3 == j7)) {
                mpTimeLineReporter.addPoint("start_activity", j4, j3, null);
            }
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("scheme", bundle.getString("microapp_url"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C67509b.m262587a("mp_start_error", 1005, jSONObject, this.f166594p);
        }
        this.f166581c.markNeedPreload();
        this.f166593o = TimeMeter.newAndStart(currentMillis);
        C66037e.m258610a(this.f166594p).mo231115a(this.f166593o);
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public ApiResult mo230994a(C66266d dVar) {
        if (this.f166603y == null) {
            this.f166603y = new C66273g(new C66273g.AbstractC66281a() {
                /* class com.tt.miniapp.AbstractC65993e.C659974 */

                @Override // com.tt.miniapp.p3298k.C66273g.AbstractC66281a
                /* renamed from: a */
                public Activity mo231038a() {
                    return AbstractC65993e.this.f166580b;
                }

                @Override // com.tt.miniapp.p3298k.C66273g.AbstractC66281a
                /* renamed from: b */
                public boolean mo231039b() {
                    return AbstractC65993e.this.f166581c.getAppInfo().isGame();
                }
            }, this.f166594p);
        }
        return this.f166603y.mo231669a(dVar);
    }

    /* renamed from: a */
    private void m258435a(Bundle bundle, String str) {
        String str2;
        if (bundle == null) {
            try {
                AppBrandLogger.m52829e("BaseActivityProxy", str + ", mpAppEventLink, launchExtraBundle is null.");
            } catch (Throwable th) {
                AppBrandLogger.m52829e("BaseActivityProxy", "throwable", th);
            }
        } else {
            TracingCoreSpan tracingCoreSpan = (TracingCoreSpan) bundle.getParcelable("tracing");
            OPTrace tracing = AppbrandContext.getInst().getTracing();
            tracing.linkTracing(tracingCoreSpan, this.f166594p, new AbstractC48929b.AbstractC48930a<IAppContext>() {
                /* class com.tt.miniapp.AbstractC65993e.C659941 */

                /* renamed from: a */
                public void mo170894a(String str, IAppContext iAppContext) {
                    LarkInnerEventHelper.mpAppEventLink(str, iAppContext);
                }
            });
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("linkTracingCoreSpan.toString():");
            if (tracingCoreSpan != null) {
                str2 = tracingCoreSpan.toString();
            } else {
                str2 = " null";
            }
            sb.append(str2);
            sb.append("currentProcessTracing.toString():");
            sb.append(tracing.toString());
            objArr[0] = sb.toString();
            AppBrandLogger.m52830i("BaseActivityProxy", objArr);
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void showNotSupportView(AppInfoEntity appInfoEntity, int i) {
        AppBrandLogger.m52830i("BaseActivityProxy", "showNotSupportView");
        C66036d.m258579a(TimeMeter.stop(this.f166585g), "old_js_sdk", "old_js_sdk", TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
        new C67500a("old_js_sdk", C67501b.al, this.f166594p).setResultTypeFail().flush();
        TimeLogger.getInstance(this.f166594p).logError("BaseActivityProxy_NotSupport");
        mo231016i().stop();
        C66194c.m259174a(ErrorCode.META.JSON_ERROR.getCode(), ErrorCode.META.JSON_ERROR.getDesc(), this.f166594p);
        mo230996a(i);
        AbstractC66737b bVar = this.f166600v;
        if (bVar != null) {
            bVar.showNotSupportView(appInfoEntity, i);
        }
    }

    /* renamed from: a */
    public static void m258437a(final AppInfoEntity appInfoEntity, final long j) {
        AppBrandLogger.m52830i("BaseActivityProxy", "appid = ", appInfoEntity.appId, "starttime = ", Long.valueOf(j));
        Observable.create(new Action() {
            /* class com.tt.miniapp.AbstractC65993e.C660039 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                if (AppbrandContext.getInst().getApplicationContext() == null) {
                    AppBrandLogger.m52829e("BaseActivityProxy", "recordMiniappUsage context == null");
                } else if (!TextUtils.isEmpty(appInfoEntity.appId)) {
                    C66186c cVar = new C66186c();
                    cVar.f167066a = appInfoEntity.appId;
                    cVar.f167069d = appInfoEntity.scene;
                    cVar.f167070e = appInfoEntity.subScene;
                    long j = 0;
                    if (j != 0) {
                        j = System.currentTimeMillis() - j;
                    }
                    cVar.f167068c = Long.valueOf(j);
                    cVar.f167067b = Long.valueOf(j);
                    C66417c.m259663a().mo231955b().mo231519a(cVar);
                }
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void requestAppInfoFail(final String str, String str2) {
        AppBrandLogger.m52829e("BaseActivityProxy", "requestAppInfoFail ", str2, new Throwable());
        long stop = TimeMeter.stop(this.f166585g);
        C66036d.m258579a(stop, "meta_request_fail", "requestAppInfoFail " + str2, TimeMeter.stop(this.f166593o), C66037e.m258610a(this.f166594p).mo231114a(), this.f166594p);
        new C67500a("meta_info_fail", C67501b.f175470ai, this.f166594p).setResultTypeFail().setErrorCode(str).setErrorMessage(str2).flush();
        TimeLogger.getInstance(this.f166594p).logError("BaseActivityProxy_requestAppInfoFail", str2);
        mo231016i().stop();
        String schema = this.f166581c.getSchema();
        if (this.f166580b == null || TextUtils.isEmpty(schema) || !HostDependManager.getInst().handleAppbrandDisablePage(this.f166580b, schema)) {
            mo231004a(new Runnable() {
                /* class com.tt.miniapp.AbstractC65993e.RunnableC659952 */

                public void run() {
                    C66194c.m259173a(str, AbstractC65993e.this.f166594p);
                }
            });
            return;
        }
        AbstractC66737b bVar = this.f166600v;
        if (bVar != null) {
            bVar.requestAppInfoFail(str, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo230997a(int i, int i2) {
        if (this.f166586h) {
            if (i == 0) {
                mo232122d(i2);
            }
            BaseLaunchLoadingView baseLaunchLoadingView = this.f166589k;
            if (baseLaunchLoadingView != null) {
                baseLaunchLoadingView.mo49124a(i, i2);
                return;
            }
            AppBrandLogger.m52830i("BaseActivityProxy", "updateProgressTv mLaunchLoadingView is null");
        }
    }

    public AbstractC65993e(FragmentActivity fragmentActivity, AbstractC67433a aVar, AbstractC66737b bVar) {
        this.f166600v = bVar;
        this.f166594p = aVar;
        this.f166580b = fragmentActivity;
        this.f166581c = AppbrandApplicationImpl.getInst(aVar);
    }

    @Override // com.tt.miniapphost.AbstractC67497e
    /* renamed from: a */
    public void mo230998a(int i, String[] strArr, int[] iArr) {
        AppBrandLogger.m52830i("BaseActivityProxy", "requestCode ", Integer.valueOf(i));
    }
}
