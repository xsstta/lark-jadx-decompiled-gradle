package com.tt.miniapp.launchschedule;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.storage.sp.biz.AbstractC12910a;
import com.bytedance.ee.lark.infra.storage.sp.biz.Storage;
import com.bytedance.ee.larkbrand.business.update.PreHelper;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.miniapp.AbstractC66328m;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.LifeCycleManager;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.jsbridge.C66240d;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66440j;
import com.tt.miniapp.manager.SynHistoryManager;
import com.tt.miniapp.manager.UpdateAppManager;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.p3327s.AbstractC66745e;
import com.tt.miniapp.p3327s.C66739d;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.settings.v2.handler.C66802u;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.C67018a;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapp.util.C67054r;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.webcore.AbstractC67282j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.option.C67606d;
import com.tt.refer.common.blank.IBlankCheckService;
import com.tt.refer.common.pkg.IStreamLoader;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.p3400a.p3401a.AbstractC67699a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class LaunchScheduler extends AppbrandServiceManager.ServiceBase implements UpdateAppManager.AbstractC66373a, AbstractC66745e {
    private C67606d.AbstractC67609b blockLoadingCallback = HostDependManager.getInst().createBlockLoadingCallback();
    public IAppContext containerAppContext = this.mApp.getiAppContext();
    public CopyOnWriteArraySet<String> mAlreadyAppServiceLoadedList = new CopyOnWriteArraySet<>();
    private final Object mBindViewLock = new Object();
    public CountDownLatch mFirstContentLatch;
    private volatile boolean mFirstRenderReadied = false;
    private boolean mForceNotifyAppStartLaunching = true;
    public boolean mHasFcp;
    public boolean mIsRenderCrash = false;
    private ArrayList<Runnable> mPendingRunnableList;
    private C66739d mPresenter = new C66739d(this, this.containerAppContext);
    private int mProgress = -1;
    public AbstractC66745e mRealView;
    private final List<AbstractC66321a> mRenderReadyListeners = new ArrayList();
    private final Object mSchemaLock = new Object();
    private volatile int mState = 0;
    private AbstractC66322a mSubScheduler;
    private boolean needAsync = false;

    /* renamed from: com.tt.miniapp.launchschedule.LaunchScheduler$a */
    public interface AbstractC66321a {
        void onFirstRenderReady();
    }

    private void doOthersIoThread() {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.C663198 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                LaunchScheduler.this.mApp.getLifeCycleManager().notifyMiniAppInstallSuccess();
                if (LaunchScheduler.this.containerAppContext != null) {
                    C67053q.m261324a(LaunchScheduler.this.containerAppContext);
                }
            }
        }, Schedulers.shortIO());
    }

    private boolean handleFailWhenPreload() {
        if (this.mState != 1) {
            return false;
        }
        this.mState = 0;
        return true;
    }

    public void initPerformance() {
        HostDependManager.getInst().setPerformanceListener(new AbstractC67282j.AbstractC67283a() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass14 */

            @Override // com.tt.miniapp.view.webcore.AbstractC67282j.AbstractC67283a
            /* renamed from: a */
            public void mo231794a() {
                AppBrandLogger.m52829e("LaunchScheduler", "wsm_onFirstContentfulPaint ");
                if (LaunchScheduler.this.mFirstContentLatch != null) {
                    LaunchScheduler.this.mFirstContentLatch.countDown();
                }
                LaunchScheduler.this.mHasFcp = true;
            }
        });
    }

    public boolean isAtLeastLaunching() {
        if (this.mState >= 2) {
            return true;
        }
        return false;
    }

    public boolean isSSBOPENLaunching() {
        if (this.mState == 4) {
            return true;
        }
        return false;
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onLoadMainJsSuccess() {
        postAtViewReady(new Runnable() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.RunnableC663209 */

            public void run() {
                LaunchScheduler.this.mRealView.onLoadMainJsSuccess();
            }
        });
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onPreloadEnd() {
        postAtViewReady(new Runnable() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass13 */

            public void run() {
                LaunchScheduler.this.mRealView.onPreloadEnd();
            }
        });
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onRemoteDebugOpen() {
        waitForViewBound();
        this.mRealView.onRemoteDebugOpen();
    }

    private void onLeastVersionFail() {
        waitForViewBound();
        this.mRealView.requestAppInfoFail(ErrorCode.META.NULL.getCode(), "least version is invalid");
    }

    public void checkWebviewAsync() {
        Observable.create(new Action() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass17 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    boolean isTTWebView = HostDependManager.getInst().isTTWebView();
                    String localSoVersion = HostDependManager.getInst().getLocalSoVersion();
                    String loadSoVersion = HostDependManager.getInst().getLoadSoVersion();
                    boolean b = C67018a.m261213b();
                    boolean shouldCheckTTWebview = HostDependManager.getInst().shouldCheckTTWebview();
                    boolean shouldDownloadIn4G = HostDependManager.getInst().shouldDownloadIn4G();
                    AppBrandLogger.m52830i("LaunchScheduler", "checkWebviewAsync local = " + localSoVersion + " , load = " + loadSoVersion + " isTTWebview " + isTTWebView + " , isForeground  = " + b + " , shouldCheck = " + shouldCheckTTWebview + " , shouldDownloadIn4G = " + shouldDownloadIn4G);
                    if (!isTTWebView && shouldCheckTTWebview && b) {
                        HostDependManager.getInst().fetchWebviewCore(shouldDownloadIn4G);
                    }
                    LarkInnerEventHelper.mpCheckTTWebview(isTTWebView, localSoVersion, loadSoVersion, shouldCheckTTWebview, shouldDownloadIn4G, b, LaunchScheduler.this.containerAppContext);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("LaunchScheduler", "checkWebviewAsync " + e);
                }
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void metaExpired() {
        if (!handleFailWhenPreload()) {
            AppBrandLogger.m52830i("LaunchScheduler", "requestAppInfo error: metaExpired");
            waitForViewBound();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.RunnableC663122 */

                public void run() {
                    LaunchScheduler.this.mRealView.metaExpired();
                }
            });
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void mismatchHost() {
        if (!handleFailWhenPreload()) {
            AppBrandLogger.m52830i("LaunchScheduler", "requestAppInfo error: mismatchHost");
            waitForViewBound();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass26 */

                public void run() {
                    LaunchScheduler.this.mRealView.mismatchHost();
                }
            });
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void noPermission() {
        if (!handleFailWhenPreload()) {
            AppBrandLogger.m52830i("LaunchScheduler", "requestAppInfo error: noPermission");
            waitForViewBound();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass24 */

                public void run() {
                    LaunchScheduler.this.mRealView.noPermission();
                }
            });
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void offline() {
        if (!handleFailWhenPreload()) {
            AppBrandLogger.m52830i("LaunchScheduler", "requestAppInfo error: offline");
            waitForViewBound();
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass23 */

                public void run() {
                    LaunchScheduler.this.mRealView.offline();
                }
            });
        }
    }

    public void onFirstRenderDone() {
        AppBrandLogger.m52830i("LaunchScheduler", "wsm_onFirstRenderDone");
        CountDownLatch countDownLatch = this.mFirstContentLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        dispatchOnFirstRenderReady();
    }

    public void waitForViewBound() {
        if (this.mRealView == null) {
            synchronized (this.mBindViewLock) {
                while (this.mRealView == null) {
                    try {
                        this.mBindViewLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private void dispatchOnFirstRenderReady() {
        synchronized (this.mRenderReadyListeners) {
            this.mFirstRenderReadied = true;
            for (AbstractC66321a aVar : this.mRenderReadyListeners) {
                aVar.onFirstRenderReady();
            }
        }
    }

    private void initStartPage() {
        AppInfoEntity appInfo = this.mApp.getAppInfo();
        if (appInfo != null) {
            String str = appInfo.startPage;
            if (!TextUtils.isEmpty(str)) {
                AppBrandLogger.m52828d("LaunchScheduler", "initStartPage ", str);
                getNormalStartPage(str);
            }
        }
    }

    private boolean isMetaReadyDisabled() {
        boolean z;
        if (C12738a.m52722a(AppbrandContext.getInst().getApplicationContext(), 1, Settings.TT_TMA_SWITCH, Settings.TmaSwitch.DISABLE_META_READY) == 1) {
            z = true;
        } else {
            z = false;
        }
        AppBrandLogger.m52830i("LaunchScheduler", "isMetaReadyDisabled: " + z);
        return z;
    }

    public void onDestroy() {
        if (C25529d.m91169j(this.containerAppContext)) {
            AppBrandLogger.m52830i("LaunchScheduler", "can not destroy");
            return;
        }
        AppBrandLogger.m52830i("LaunchScheduler", "onDestroy");
        IStreamLoader loadTask = StreamLoader.getLoadTask(this.containerAppContext);
        if (loadTask != null) {
            loadTask.release();
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e, com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
    public void onUpdateFailed() {
        AppBrandLogger.m52830i("LaunchScheduler", "onUpdateFailed");
        try {
            this.mApp.getJsBridge().sendMsgToJsCore("onUpdateFailed", new JSONObject().toString());
        } catch (Exception e) {
            AppBrandLogger.m52829e("onCheckForUpdate", e);
        }
    }

    private boolean initAppConfig() {
        if (this.mApp.initAppConfig() == null) {
            AppBrandLogger.m52829e("LaunchScheduler", "parse appConfig error");
            C66036d.m258579a(0, "parse_app_config_fail", "parse appConfig fail", 0, C66037e.m258610a(this.containerAppContext).mo231114a(), this.containerAppContext);
            new C67500a("parse_app_config_fail", C67501b.ay, this.containerAppContext).setResultTypeFail().flush();
            TimeLogger.getInstance(this.containerAppContext).logTimeDuration("BaseActivityProxy_parseAppConfigFail");
            C67509b.m262586a("initAppConfig_appConfig_null", 6010, this.containerAppContext);
            C66194c.m259173a(ErrorCode.MAIN.PARSE_APPCONFIG_ERROR.getCode(), this.containerAppContext);
            return false;
        }
        AppInfoEntity appInfo = this.mApp.getAppInfo();
        if (appInfo != null) {
            appInfo.isLandScape = "landscape".equals(this.mApp.getAppConfig().f165498e);
        }
        initStartPage();
        return true;
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e, com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
    public void onUpdateReady() {
        AppBrandLogger.m52830i("LaunchScheduler", "onUpdateReady");
        IAppContext iAppContext = this.containerAppContext;
        if (!(iAppContext == null || iAppContext.getCurrentActivity() == null)) {
            IAppContext iAppContext2 = this.containerAppContext;
            if (!UpdateAppManager.isUpdateForbidden(iAppContext2, iAppContext2.getCurrentActivity(), this.containerAppContext.getAppId(), true)) {
                try {
                    this.mApp.getJsBridge().sendMsgToJsCore("onUpdateReady", new JSONObject().toString());
                    return;
                } catch (Exception e) {
                    AppBrandLogger.m52829e("onCheckForUpdate", e);
                    return;
                }
            }
        }
        AppBrandLogger.m52830i("LaunchScheduler", "LaunchScheduler onUpdateReady is UpdateReadyOverTime");
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void onPkgDownloadDone(boolean z) {
        AbstractC66745e eVar = this.mRealView;
        if (eVar != null) {
            eVar.onPkgDownloadDone(z);
        }
    }

    private void doOthersIoThreadSubPackageMode(final String str) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.C663187 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                LaunchScheduler.this.mApp.getLifeCycleManager().notifyMiniSubAppInstallSuccess(str);
                if (LaunchScheduler.this.containerAppContext != null) {
                    C67053q.m261324a(LaunchScheduler.this.containerAppContext);
                }
            }
        }, Schedulers.shortIO());
    }

    public void continueLoadSubPackageMainJs(String str) {
        this.mSubScheduler.mo231808a(new AbstractC66328m() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.C663176 */

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87263a() {
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: b */
            public void mo87265b() {
                if (LaunchScheduler.this.mApp.getAppConfig() == null) {
                    AppBrandLogger.m52829e("LaunchScheduler", "config is null when after load js");
                }
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87264a(Exception exc) {
                AppBrandLogger.m52829e("LaunchScheduler", "continueLoadSubPackageMainJs evalException e ：" + exc.getMessage());
            }
        }, str);
        doOthersIoThreadSubPackageMode(str);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void miniAppDownloadInstallProgress(int i) {
        this.mProgress = i;
        AbstractC66745e eVar = this.mRealView;
        if (eVar != null) {
            eVar.miniAppDownloadInstallProgress(i);
        }
    }

    public void removeFirstRenderReadyListener(AbstractC66321a aVar) {
        synchronized (this.mRenderReadyListeners) {
            this.mRenderReadyListeners.remove(aVar);
        }
    }

    public void postAtViewReady(Runnable runnable) {
        synchronized (this.mBindViewLock) {
            if (this.mRealView != null) {
                runnable.run();
            } else {
                if (this.mPendingRunnableList == null) {
                    this.mPendingRunnableList = new ArrayList<>();
                }
                this.mPendingRunnableList.add(runnable);
            }
        }
    }

    private void preRunTaskOfApp(final String str) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass12 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC12910a aVar = (AbstractC12910a) LaunchScheduler.this.containerAppContext.findServiceByInterface(AbstractC12910a.class);
                if (aVar != null) {
                    aVar.mo48705e();
                }
                AbstractC67699a aVar2 = (AbstractC67699a) LaunchScheduler.this.containerAppContext.findServiceByInterface(AbstractC67699a.class);
                if (aVar2 != null && aVar2.mo234980d()) {
                    aVar2.mo234979c();
                    if (aVar != null) {
                        aVar.mo48694b();
                    }
                }
                AppBrandLogger.m52830i("LaunchScheduler", "preload storage sp Timestamp:" + (System.currentTimeMillis() - currentTimeMillis));
            }
        }, Schedulers.shortIO());
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.prelocation")) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass20 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    String b = C66802u.m260678a().mo232710b();
                    if (!TextUtils.isEmpty(b)) {
                        try {
                            PreHelper.m53347a(LaunchScheduler.this.containerAppContext.getApplicationContext(), str, new JSONObject(b));
                        } catch (JSONException e) {
                            AppBrandLogger.m52829e("LaunchScheduler", "preLocation", e);
                        }
                    }
                }
            }, Schedulers.shortIO());
        }
        if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.prelogin")) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass21 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    String b = C66802u.m260678a().mo232710b();
                    if (!TextUtils.isEmpty(b)) {
                        try {
                            PreHelper.m53348a(LaunchScheduler.this.containerAppContext, new JSONObject(b));
                        } catch (JSONException e) {
                            AppBrandLogger.m52829e("LaunchScheduler", "preLogin", e);
                        }
                    }
                }
            }, Schedulers.shortIO());
        }
    }

    private void updateAppInfoOnAsyncUpdate(AppInfoEntity appInfoEntity) {
        AppInfoEntity appInfo = this.mApp.getAppInfo();
        appInfo.encryptextra = appInfoEntity.encryptextra;
        appInfo.ttBlackCode = appInfoEntity.ttBlackCode;
        appInfo.ttSafeCode = appInfoEntity.ttSafeCode;
        appInfo.shareLevel = appInfoEntity.shareLevel;
        appInfo.state = appInfoEntity.state;
        appInfo.versionState = appInfoEntity.versionState;
        appInfo.domains = appInfoEntity.domains;
        appInfo.mGadgetSafeDomains = appInfoEntity.mGadgetSafeDomains;
        this.mApp.setAppInfo(appInfo);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void miniAppDownloadInstallFail(String str) {
        AppInfoEntity appInfo;
        if (!handleFailWhenPreload()) {
            String str2 = null;
            if (!(this.mApp == null || (appInfo = this.mApp.getAppInfo()) == null)) {
                str2 = appInfo.versionType;
            }
            this.blockLoadingCallback.mo48977a(str2);
            waitForViewBound();
            this.mRealView.miniAppDownloadInstallFail(str);
        }
    }

    public void notifyBindView(AbstractC66745e eVar) {
        synchronized (this.mBindViewLock) {
            this.mRealView = eVar;
            ArrayList<Runnable> arrayList = this.mPendingRunnableList;
            if (arrayList != null) {
                Iterator<Runnable> it = arrayList.iterator();
                while (it.hasNext()) {
                    final Runnable next = it.next();
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass11 */

                        public void run() {
                            next.run();
                        }
                    });
                }
                this.mPendingRunnableList = null;
            }
            int i = this.mProgress;
            if (i >= 0) {
                this.mRealView.miniAppDownloadInstallProgress(i);
            }
            this.mBindViewLock.notifyAll();
        }
    }

    public void setForceNotifyStartLaunchingStatus(boolean z) {
        if (HostDependManager.getInst().getFeatureGating("gadget.embed.app.launching.start.enable", false)) {
            this.mForceNotifyAppStartLaunching = z;
        } else {
            this.mForceNotifyAppStartLaunching = true;
        }
        AppBrandLogger.m52830i("LaunchScheduler", "setForceNotifyStartLaunchingStatus : " + this.mForceNotifyAppStartLaunching);
    }

    public void setStartSuccess(final long j) {
        Observable.create(new Action() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass15 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                boolean z;
                try {
                    if (!HostDependManager.getInst().getFeatureGating("microapp.firstcontent.switch")) {
                        LaunchScheduler.this.mFirstContentLatch = new CountDownLatch(1);
                    } else if (HostDependManager.getInst().isTTWebView()) {
                        LaunchScheduler.this.mFirstContentLatch = new CountDownLatch(2);
                    } else {
                        LaunchScheduler.this.mFirstContentLatch = new CountDownLatch(1);
                    }
                    LaunchScheduler.this.mFirstContentLatch.await(5, TimeUnit.SECONDS);
                    if (LaunchScheduler.this.mFirstContentLatch.getCount() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    AppBrandLogger.m52830i("LaunchScheduler", "wsm_firstContent success = " + z);
                    LarkInnerEventHelper.mpFirstContentfulPaint(z, j, HostDependManager.getInst().isTTWebView(), LaunchScheduler.this.mIsRenderCrash, LaunchScheduler.this.containerAppContext);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).schudleOn(Schedulers.shortIO()).subscribeSimple();
        this.mApp.getMainHandler().postDelayed(new Runnable() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass16 */

            public void run() {
                LaunchScheduler.this.checkWebviewAsync();
            }
        }, 10000);
    }

    public LaunchScheduler(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    public void bindView(final AbstractC66745e eVar) {
        boolean z;
        TimeLogger.getInstance(this.containerAppContext).logTimeDuration("LaunchScheduler_bindView");
        if (this.mRealView != null) {
            z = true;
        } else {
            z = false;
        }
        AppBrandLogger.m52829e("LaunchScheduler", "duplicateActivityCreated:" + z);
        if (z) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass10 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    LaunchScheduler.this.notifyBindView(eVar);
                }
            }, Schedulers.shortIO());
        } else {
            notifyBindView(eVar);
        }
    }

    public String getNormalStartPage(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        AppInfoEntity appInfo = this.mApp.getAppInfo();
        String b = C67054r.m261343b(str);
        ArrayList<String> arrayList = null;
        AppConfig appConfig = this.mApp.getAppConfig();
        if (appConfig != null) {
            arrayList = appConfig.mo230042c();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return "";
        }
        if (arrayList.contains(b)) {
            appInfo.startPage = str;
        } else {
            appInfo.startPage = appConfig.f165497d;
        }
        AppBrandLogger.m52828d("LaunchScheduler", "getNormalStartPage ", appInfo.startPage);
        return appInfo.startPage;
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e, com.tt.miniapp.manager.UpdateAppManager.AbstractC66373a
    public void onCheckForUpdate(AppInfoEntity appInfoEntity) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        try {
            AppInfoEntity appInfo = this.mApp.getAppInfo();
            AppBrandLogger.m52830i("LaunchScheduler", "onCheckForUpdate, appInfoVersion: " + appInfo.version + " updateInfoVersion: " + appInfoEntity.version);
            if (TextUtils.equals(appInfo.md5, appInfoEntity.md5)) {
                if (TextUtils.equals(appInfo.version, appInfoEntity.version)) {
                    z = false;
                    jSONObject.put("hasUpdate", z);
                    this.mApp.getJsBridge().sendMsgToJsCore("onCheckForUpdate", jSONObject.toString());
                    updateAppInfoOnAsyncUpdate(appInfoEntity);
                }
            }
            z = true;
            jSONObject.put("hasUpdate", z);
            this.mApp.getJsBridge().sendMsgToJsCore("onCheckForUpdate", jSONObject.toString());
            updateAppInfoOnAsyncUpdate(appInfoEntity);
        } catch (Exception e) {
            AppBrandLogger.m52829e("onCheckForUpdate", e);
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void requestAppInfoSuccess(final AppInfoEntity appInfoEntity) {
        AppBrandLogger.m52830i("LaunchScheduler", "requestAppInfoSuccess, appId: ", appInfoEntity.appId, "name:" + appInfoEntity.appName);
        TimeLogger.getInstance(this.containerAppContext).logTimeDuration("LaunchScheduler_requestAppInfoSuccess");
        C66375a.m259518a(appInfoEntity, this.mApp.getAppInfo());
        this.mApp.setAppInfo(appInfoEntity);
        initSnapshotEngine(this.containerAppContext, appInfoEntity.version, appInfoEntity.isPreview());
        TimeLogger.getInstance(this.containerAppContext).logTimeDuration("LaunchScheduler_AppInfoUpdatedAfterRequest");
        C65983a.m258415a().mo230972a(new C65983a.AbstractC65988a() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass22 */

            @Override // com.tt.miniapp.debug.C65983a.AbstractC65988a
            /* renamed from: a */
            public void mo230979a() {
                if (C65983a.m258415a().f166555e) {
                    LaunchScheduler.this.onRemoteDebugOpen();
                }
                LaunchScheduler.this.postAtViewReady(new Runnable() {
                    /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass22.RunnableC663131 */

                    public void run() {
                        LaunchScheduler.this.mRealView.requestAppInfoSuccess(appInfoEntity);
                    }
                });
                C66037e.m258610a(LaunchScheduler.this.containerAppContext).mo231116a("pkg_downloading");
            }
        });
        SynHistoryManager.getInstance().addToRecentApps(appInfoEntity, this.containerAppContext);
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66745e
    public void miniAppInstallSuccess(int i) {
        boolean z;
        AppBrandLogger.m52828d("LaunchScheduler", "containerAppContext AppType:" + this.containerAppContext.getAppType().name());
        TimeLogger.getInstance(this.containerAppContext).logTimeDuration("LaunchScheduler_miniAppInstallSuccess");
        AppInfoEntity appInfo = this.mApp.getAppInfo();
        long a = this.blockLoadingCallback.mo48977a(appInfo.versionType);
        mpAppLoadStart(a, appInfo);
        AppBrandLogger.m52830i("LaunchScheduler", "miniAppInstallSuccess, blockTime: ", Long.valueOf(a));
        if (i == 3) {
            ((MpTimeLineReporter) AppbrandApplicationImpl.getInst(this.containerAppContext).getService(MpTimeLineReporter.class)).addPoint("preload_app_end");
        }
        if (this.mApp.getSchema() == null) {
            synchronized (this.mSchemaLock) {
                if (this.mApp.getSchema() == null) {
                    try {
                        initAppConfig();
                        this.mSchemaLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        if (i != 3 || !C66375a.m259522a(this.mApp.getSchema(), this.mApp.getAppInfo().version)) {
            if (appInfo.isPreview() && !TextUtils.isEmpty(appInfo.startPage)) {
                String queryParameter = Uri.parse(appInfo.startPage).getQueryParameter("snapshot");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (!z) {
                        initAppConfig();
                    }
                    ((JsRuntimeManager) this.mApp.getService(JsRuntimeManager.class)).createSnapshotJsRuntimeForPreview(appInfo.version, queryParameter);
                }
            }
            continueLoadMainJs(i, z);
            return;
        }
        AppBrandLogger.m52829e("LaunchScheduler", "version is not ok");
        onLeastVersionFail();
    }

    public void onRenderProcessGone(Boolean bool) {
        int i = 1;
        this.mIsRenderCrash = true;
        int i2 = 2;
        if (isAtLeastLaunching()) {
            LarkInnerEventHelper.mpPageCrash(bool, HostDependManager.getInst().isTTWebView(), true, this.containerAppContext);
            C67500a aVar = new C67500a(C67501b.f170242j, this.containerAppContext);
            if (bool != null) {
                if (bool.booleanValue()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
            aVar.addCategoryValue("is_crash", Integer.valueOf(i2)).addCategoryValue("is_ttwebview", Boolean.valueOf(HostDependManager.getInst().isTTWebView())).addCategoryValue("is_running", true).setErrorMessage("onRenderProcessGone: running").flush();
            return;
        }
        if (bool == null) {
            C66194c.m259174a(ErrorCode.WEBVIEW.ON_RENDER_PROCESS_GONE.getCode(), ErrorCode.WEBVIEW.ON_RENDER_PROCESS_GONE.getDesc(), this.containerAppContext);
        } else {
            String code = ErrorCode.WEBVIEW.ON_RENDER_PROCESS_GONE.getCode();
            C66194c.m259174a(code, ErrorCode.WEBVIEW.ON_RENDER_PROCESS_GONE.getDesc() + ", didCrash: " + bool, this.containerAppContext);
        }
        LarkInnerEventHelper.mpPageCrash(bool, HostDependManager.getInst().isTTWebView(), false, this.containerAppContext);
        C67500a aVar2 = new C67500a(C67501b.f170242j, this.containerAppContext);
        if (bool == null) {
            i = 2;
        } else if (!bool.booleanValue()) {
            i = 0;
        }
        aVar2.addCategoryValue("is_crash", Integer.valueOf(i)).addCategoryValue("is_ttwebview", Boolean.valueOf(HostDependManager.getInst().isTTWebView())).addCategoryValue("is_running", false).setErrorMessage("onRenderProcessGone: not running").flush();
        MiniAppProcessUtils.killCurrentProcess(AppbrandContext.getInst().getApplicationContext());
    }

    private void mpAppLoadStart(long j, AppInfoEntity appInfoEntity) {
        int i;
        IStreamLoader loadTask = StreamLoader.getLoadTask(this.containerAppContext);
        if (loadTask != null) {
            i = loadTask.getDownloadType();
        } else {
            i = 0;
        }
        LarkInnerEventHelper.mpAppLoadStart(j, i, appInfoEntity, this.containerAppContext);
    }

    public void addFirstRenderReadyListener(AbstractC66321a aVar, boolean z) {
        synchronized (this.mRenderReadyListeners) {
            if (!this.mRenderReadyListeners.contains(aVar)) {
                this.mRenderReadyListeners.add(aVar);
                if (z && this.mFirstRenderReadied) {
                    aVar.onFirstRenderReady();
                }
            }
        }
    }

    public void onClose(View view, int i) {
        IBlankCheckService aVar;
        if (HostDependManager.getInst().getFeatureGating("gadget.blank.screen.detect") && (aVar = (IBlankCheckService) this.containerAppContext.findServiceByInterface(IBlankCheckService.class)) != null) {
            aVar.mo231948a(view, i, this.mHasFcp);
            AppBrandLogger.m52830i("LaunchScheduler", "close app , check blank");
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void requestAppInfoFail(String str, String str2) {
        if (!handleFailWhenPreload()) {
            AppBrandLogger.m52830i("LaunchScheduler", "requestAppInfoFail, code: ", str, ", errorMsg: ", str2);
            waitForViewBound();
            this.mRealView.requestAppInfoFail(str, str2);
        }
    }

    @Override // com.tt.miniapp.p3327s.AbstractC66737b
    public void showNotSupportView(final AppInfoEntity appInfoEntity, final int i) {
        if (!handleFailWhenPreload()) {
            AppBrandLogger.m52830i("LaunchScheduler", "requestAppInfo error: showNotSupportView");
            waitForViewBound();
            this.mApp.setAppInfo(appInfoEntity);
            C67866g.m264027a(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass25 */

                public void run() {
                    LaunchScheduler.this.mRealView.showNotSupportView(appInfoEntity, i);
                }
            });
        }
    }

    private void continueLoadMainJs(final int i, boolean z) {
        this.mSubScheduler.mo231807a(new AbstractC66328m() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.C663143 */

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87263a() {
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87264a(Exception exc) {
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: b */
            public void mo87265b() {
                if (LaunchScheduler.this.mApp.getAppConfig() == null) {
                    AppBrandLogger.m52829e("LaunchScheduler", "config is null when after load js");
                    return;
                }
                LaunchScheduler.this.onLoadMainJsSuccess();
            }
        });
        if (!z) {
            initAppConfig();
        }
        if (this.mApp.getAppConfig() == null) {
            AppbrandContext.getMainHandler().postAtFrontOfQueue(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.RunnableC663154 */

                public void run() {
                    if (LaunchScheduler.this.containerAppContext != null) {
                        C66194c.m259173a(ErrorCode.DOWNLOAD.PARSE_CONFIG_FAIL.getCode(), LaunchScheduler.this.containerAppContext);
                    }
                }
            });
            return;
        }
        C66440j.m259728a(AppbrandContext.getInst().getApplicationContext(), this.mApp.getAppConfig(), this.mApp.getAppInfo().appId, this.mApp.getSchema(), this.containerAppContext);
        doOthersIoThread();
        postAtViewReady(new Runnable() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.RunnableC663165 */

            public void run() {
                LaunchScheduler.this.mRealView.miniAppInstallSuccess(i);
            }
        });
    }

    public static void preInitSnapshotEngine(final IAppContext iAppContext, final AppInfoEntity appInfoEntity) {
        if (!HostDependManager.getInst().getFeatureGating("openplatform.gadget.pre_snapshot")) {
            AppBrandLogger.m52830i("LaunchScheduler", "not preInitSnapshot for fg");
        } else if (appInfoEntity.isPreview()) {
            AppBrandLogger.m52830i("LaunchScheduler", "preInitSnapshotEngine return: is preview mode");
        } else if (appInfoEntity.appId == null || appInfoEntity.appId.length() <= 0 || appInfoEntity.appId.indexOf(File.separatorChar) < 0) {
            C67554l.m262725b().execute(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass19 */

                public void run() {
                    Context applicationContext = iAppContext.getApplicationContext();
                    SharedPreferences storageByName = Storage.getStorageByName(applicationContext, Storage.getStorageFilePrefix("new_update_app_info_v2" + appInfoEntity.appId));
                    long currentTimeMillis = System.currentTimeMillis();
                    String string = storageByName.getString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, null);
                    AppBrandLogger.m52830i("LaunchScheduler", "get meta time:" + (System.currentTimeMillis() - currentTimeMillis));
                    if (string != null) {
                        AppBrandLogger.m52830i("LaunchScheduler", "try init engine when meta:" + string);
                        if (C66240d.m259242a()) {
                            ((JsRuntimeManager) AppbrandApplicationImpl.getInst(iAppContext).getService(JsRuntimeManager.class)).createSnapshotJsRuntimeIfNeed(string);
                            return;
                        }
                        ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(iAppContext).getService(SnapshotServiceImpl.class);
                        if (iSnapshotService.enableSnapshot(string, false) && iSnapshotService.checkSnapshotExist(string)) {
                            iSnapshotService.initEngine(string);
                        }
                    }
                }
            });
        } else {
            AppBrandLogger.m52830i("LaunchScheduler", "preInitSnapshotEngine return: app_id Illegal");
        }
    }

    public synchronized void startLaunch(final AppInfoEntity appInfoEntity, final String str) {
        boolean z;
        AppBrandLogger.m52830i("LaunchScheduler", "state:" + this.mState);
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.mState <= 0) {
                ((MpTimeLineReporter) AppbrandApplicationImpl.getInst(this.containerAppContext).getService(MpTimeLineReporter.class)).addPoint("preload_app_begin");
                this.mState = 1;
            } else {
                return;
            }
        } else if (this.mState >= 2) {
            if (C25529d.m91166g(this.containerAppContext)) {
                this.mState = 4;
                if (!TextUtils.isEmpty(appInfoEntity.startPage)) {
                    this.mApp.getAppInfo().startPage = appInfoEntity.startPage;
                }
            }
            AppBrandLogger.m52830i("LaunchScheduler", "startLaunch, mState: " + this.mState);
            return;
        } else if (this.mState == 0) {
            this.mState = 3;
        } else {
            ((MpTimeLineReporter) AppbrandApplicationImpl.getInst(this.containerAppContext).getService(MpTimeLineReporter.class)).addPoint("launch_from_preload_app");
            this.mState = 2;
            this.mApp.setSchema(str);
            C66375a.m259518a(this.mApp.getAppInfo(), appInfoEntity);
            synchronized (this.mSchemaLock) {
                this.mSchemaLock.notifyAll();
            }
            return;
        }
        TimeLogger.getInstance(this.containerAppContext).logTimeDuration("LaunchScheduler_startLaunch");
        this.mApp.setAppInfo(appInfoEntity);
        this.mApp.setSchema(str);
        TimeLogger.getInstance(this.containerAppContext).scheduleFlush();
        C66440j.m259732a(AppbrandContext.getInst().getApplicationContext(), str, this.containerAppContext, true);
        C66323b bVar = new C66323b(this, this.mApp, this.containerAppContext);
        this.mSubScheduler = bVar;
        bVar.mo231809a(appInfoEntity);
        this.blockLoadingCallback.mo48978a(appInfoEntity.versionType, appInfoEntity.appId, new C67606d.AbstractC67609b.AbstractC67610a() {
            /* class com.tt.miniapp.launchschedule.LaunchScheduler.C663111 */

            @Override // com.tt.option.C67606d.AbstractC67609b.AbstractC67610a
            /* renamed from: b */
            public void mo231791b() {
                LaunchScheduler.this.waitForViewBound();
            }

            @Override // com.tt.option.C67606d.AbstractC67609b.AbstractC67610a
            /* renamed from: a */
            public void mo231790a() {
                AppBrandLogger.m52830i("LaunchScheduler", "block loading lead to close app", appInfoEntity.version, appInfoEntity.appId);
                new C67500a(C67501b.au, LaunchScheduler.this.containerAppContext).mo234324a(appInfoEntity).addCategoryValue("url", str).setResultTypeFail().setErrorMessage("block loading lead to close app").flush();
                LaunchScheduler.this.waitForViewBound();
                C67070z.m261391a(LaunchScheduler.this.containerAppContext.getCurrentActivity(), 11, LaunchScheduler.this.containerAppContext);
            }
        }, this.containerAppContext);
        TimeLogger.getInstance(this.containerAppContext).logTimeDuration("LaunchScheduler_startRequestAppInfo");
        C66037e.m258610a(this.containerAppContext).mo231116a("meta_requesting");
        this.mPresenter.mo232570a(appInfoEntity);
        preRunTaskOfApp(appInfoEntity.appId);
        if (this.mForceNotifyAppStartLaunching) {
            ((LifeCycleManager) this.mApp.getService(LifeCycleManager.class)).notifyAppStartLaunching();
        } else {
            AppBrandLogger.m52830i("LaunchScheduler", "disable force notify app start launching");
        }
        C66890j routeEventCtrl = AppbrandApplicationImpl.getInst(this.containerAppContext).getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232870a();
        }
        this.mApp.getLifeCycleManager().notifyAppInfoInited(appInfoEntity);
    }

    private void initSnapshotEngine(final IAppContext iAppContext, final String str, final boolean z) {
        if (!C66240d.m259242a()) {
            C67554l.m262725b().execute(new Runnable() {
                /* class com.tt.miniapp.launchschedule.LaunchScheduler.AnonymousClass18 */

                public void run() {
                    AppBrandLogger.m52830i("LaunchScheduler", "try init engine when meta:" + str);
                    ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(iAppContext).getService(SnapshotServiceImpl.class);
                    if (iSnapshotService == null) {
                        C48936b.m192783a("snapshotService is null");
                    }
                    if (iSnapshotService != null && iSnapshotService.enableSnapshot(str, z) && iSnapshotService.checkSnapshotExist(str)) {
                        iSnapshotService.initEngine(str);
                    }
                }
            });
        }
    }
}
