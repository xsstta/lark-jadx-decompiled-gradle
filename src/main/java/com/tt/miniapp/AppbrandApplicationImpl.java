package com.tt.miniapp;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.frontendapiinterface.IActivityLife;
import com.tt.frontendapiinterface.IJsBridge;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.audio.background.C65764a;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.debug.PerformanceService;
import com.tt.miniapp.debug.VConsoleManager;
import com.tt.miniapp.falcon.runtime.IJsRuntime;
import com.tt.miniapp.jsbridge.C66236a;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.manager.AppConfigManager;
import com.tt.miniapp.manager.AppbrandBroadcastService;
import com.tt.miniapp.manager.C66420d;
import com.tt.miniapp.manager.C66460m;
import com.tt.miniapp.net.C66512c;
import com.tt.miniapp.net.C66516d;
import com.tt.miniapp.net.C66519f;
import com.tt.miniapp.net.C66520g;
import com.tt.miniapp.net.C66521h;
import com.tt.miniapp.net.C66535k;
import com.tt.miniapp.p3266c.C65810b;
import com.tt.miniapp.p3293h.C66188a;
import com.tt.miniapp.p3293h.C66191b;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.progress.TMALaunchProgress;
import com.tt.miniapp.render.RenderEngineManager;
import com.tt.miniapp.shortcut.ShortcutService;
import com.tt.miniapp.streamloader.FileAccessLogger;
import com.tt.miniapp.titlemenu.C66902b;
import com.tt.miniapp.titlemenu.item.C66919c;
import com.tt.miniapp.toast.C66971a;
import com.tt.miniapp.toast.C66972b;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.webcore.LoadPathInterceptor;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67549i;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.p3374g.AbstractC67547a;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.p3256b.AbstractC65679a;
import com.tt.p3257c.C65680a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AppbrandApplicationImpl implements AbstractC67538f {
    private static volatile boolean isReportError;
    public IAppContext iAppContext;
    private boolean isOpenedSchema = false;
    private final List<WeakReference<AbstractC65698d>> jsCoreReadyList = new ArrayList();
    private boolean jumpToApp = false;
    private Activity mActivity;
    private IActivityLife mActivityLife;
    public AppInfoEntity mAppInfo;
    private List<AbstractC65696b> mConfigurationChangeListeners = new CopyOnWriteArrayList();
    private ArrayMap<String, Boolean> mCurrentPageHideShareMenuArrayMap = new ArrayMap<>();
    private String mCurrentPagePath;
    private String mCurrentPageType;
    private int mCurrentRenderViewId;
    private final C66420d mForeBackgroundManager;
    private boolean mInitDone;
    private boolean mJsCoreReady;
    private boolean mMainJsLoadCompleted;
    private boolean mNeedNotifyPreloadEmptyProcess = false;
    protected List<AbstractC65697c> mObservers = new CopyOnWriteArrayList();
    private String mRequestVersion;
    private C66890j mRouteEventCtrl;
    private String mSchema;
    private AppbrandServiceManager mServiceManager;
    private String mStopReason = "";
    private Handler mainHandler = new Handler(Looper.getMainLooper());
    private C65807c router;
    private AppInfoEntity updateAppInfo;

    /* renamed from: com.tt.miniapp.AppbrandApplicationImpl$b */
    public interface AbstractC65696b {
        void onConfigurationChange(Configuration configuration);
    }

    /* renamed from: com.tt.miniapp.AppbrandApplicationImpl$c */
    public interface AbstractC65697c {
        /* renamed from: a */
        void mo88401a();

        /* renamed from: b */
        void mo88402b();
    }

    /* renamed from: com.tt.miniapp.AppbrandApplicationImpl$d */
    public interface AbstractC65698d {
        void onJsCoreReady();
    }

    public void markNeedPreload() {
        this.mNeedNotifyPreloadEmptyProcess = true;
    }

    public void onError(String str) {
    }

    public void onMainJsLoadCompleted() {
        this.mMainJsLoadCompleted = true;
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public IActivityLife getActivityLife() {
        return this.mActivityLife;
    }

    public Activity getAppActivity() {
        return this.mActivity;
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public AppInfoEntity getAppInfo() {
        return this.mAppInfo;
    }

    public C65807c getAppRouter() {
        return this.router;
    }

    public ArrayMap<String, Boolean> getCurrentPageHideShareMenuArrayMap() {
        return this.mCurrentPageHideShareMenuArrayMap;
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public String getCurrentPagePath() {
        return this.mCurrentPagePath;
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public String getCurrentPageType() {
        return this.mCurrentPageType;
    }

    public int getCurrentRenderViewId() {
        return this.mCurrentRenderViewId;
    }

    public C66420d getForeBackgroundManager() {
        return this.mForeBackgroundManager;
    }

    public boolean getJumToApp() {
        return this.jumpToApp;
    }

    public Handler getMainHandler() {
        return this.mainHandler;
    }

    public String getRequestVersion() {
        return this.mRequestVersion;
    }

    public C66890j getRouteEventCtrl() {
        return this.mRouteEventCtrl;
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public String getSchema() {
        return this.mSchema;
    }

    public String getStopReason() {
        return this.mStopReason;
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public AppInfoEntity getUpdateAppInfo() {
        return this.updateAppInfo;
    }

    public IAppContext getiAppContext() {
        return this.iAppContext;
    }

    public boolean isMainJsLoadCompleted() {
        return this.mMainJsLoadCompleted;
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public IJsBridge getJsBridge() {
        return ((JsRuntimeManager) getService(JsRuntimeManager.class)).getJsBridge();
    }

    public LifeCycleManager getLifeCycleManager() {
        return (LifeCycleManager) this.mServiceManager.mo230237b(LifeCycleManager.class);
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public AbstractC67547a getPreloadManager() {
        return (AbstractC67547a) getService(PreloadManager.class);
    }

    public RenderViewManager getRenderViewManager() {
        return (RenderViewManager) getService(RenderViewManager.class);
    }

    public TimeLineReporter getTimeLineReporter() {
        return (TimeLineReporter) getService(TimeLineReporter.class);
    }

    public TimeLogger getTimeLogger() {
        return (TimeLogger) getService(TimeLogger.class);
    }

    public void finish() {
        if (C25529d.m91169j(this.iAppContext)) {
            AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "can not destroy");
            return;
        }
        this.mForeBackgroundManager.mo231960b();
    }

    public AppConfig getAppConfig() {
        if (C65680a.m257568b(this.iAppContext)) {
            return null;
        }
        return ((AppConfigManager) getService(AppConfigManager.class)).getAppConfig();
    }

    public String getCurrentPage() {
        AbstractC67434b a;
        IAppContext iAppContext2 = this.iAppContext;
        if (!(iAppContext2 instanceof AbstractC67433a) || (a = ((AbstractC67433a) iAppContext2).mo234156a()) == null) {
            return null;
        }
        return a.mo231014g();
    }

    public String getCurrentWebViewUrl() {
        RenderViewManager.IRender currentIRender;
        NativeViewManager nativeViewManager;
        RenderViewManager renderViewManager = getRenderViewManager();
        if (renderViewManager == null || (currentIRender = renderViewManager.getCurrentIRender()) == null || (nativeViewManager = currentIRender.getNativeViewManager()) == null) {
            return null;
        }
        return nativeViewManager.getCurrentUrl();
    }

    public AppConfig initAppConfig() {
        if (C65680a.m257568b(this.iAppContext)) {
            return null;
        }
        return ((AppConfigManager) getService(AppConfigManager.class)).initAppConfig();
    }

    public void notifyPreloadEmptyProcess() {
        if (this.mNeedNotifyPreloadEmptyProcess) {
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.AppbrandApplicationImpl.C656942 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType;
                    if (AppbrandApplicationImpl.this.mAppInfo != null) {
                        sandBoxEnvType = AppbrandApplicationImpl.this.mAppInfo.sandBoxEnvType;
                    } else if (ProcessUtil.isMiniappProcess()) {
                        sandBoxEnvType = IAppSandboxEnvManagerService.SandBoxEnvType.MINI_PROCESS;
                    } else {
                        sandBoxEnvType = IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS;
                    }
                    C66612a.m260220a(sandBoxEnvType);
                }
            }, C67554l.m262725b());
            this.mNeedNotifyPreloadEmptyProcess = false;
        }
    }

    public String getRequestRefer() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("https://tmaservice.developer.toutiao.com");
        AppInfoEntity appInfoEntity = this.mAppInfo;
        if (!(appInfoEntity == null || appInfoEntity.appId == null || this.mAppInfo.version == null)) {
            stringBuffer.append("?appid=");
            stringBuffer.append(this.mAppInfo.appId);
            stringBuffer.append("&version=");
            stringBuffer.append(this.mAppInfo.version);
        }
        return stringBuffer.toString();
    }

    public void onJsCoreReady() {
        AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "onJsCoreReady");
        synchronized (this.jsCoreReadyList) {
            this.mJsCoreReady = true;
        }
        this.mRouteEventCtrl.mo232873b();
        for (WeakReference<AbstractC65698d> weakReference : this.jsCoreReadyList) {
            AbstractC65698d dVar = weakReference.get();
            if (dVar != null) {
                dVar.onJsCoreReady();
            }
        }
        this.jsCoreReadyList.clear();
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public void onCreate() {
        if (this.mInitDone) {
            AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "--------Already Created---- ");
            return;
        }
        getLifeCycleManager().notifyAppCreate();
        AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "--------onCreate---- ");
        this.mRouteEventCtrl = new C66890j(this.iAppContext);
        AppbrandContext inst = AppbrandContext.getInst();
        inst.getApplicationContext().registerActivityLifecycleCallbacks(new C65695a(this));
        ArrayList<AbstractC67550j> arrayList = new ArrayList();
        arrayList.add(new C66519f(inst));
        arrayList.add(new C66535k(inst));
        arrayList.add(new C66520g(inst));
        arrayList.add(new C66521h(inst));
        arrayList.add(new C66516d(inst));
        arrayList.add(new C66512c(inst));
        arrayList.add(new C66188a(inst));
        arrayList.add(new C66191b(inst));
        arrayList.add(new C66972b(inst));
        arrayList.add(new C66971a(inst));
        arrayList.add(new C65810b(inst));
        arrayList.add(new C66902b(inst));
        arrayList.add(new C66919c.C66931a(inst));
        C67549i a = C67549i.m262706a(this.iAppContext);
        for (AbstractC67550j jVar : arrayList) {
            jVar.mo234576b(this.iAppContext);
            a.mo234575a(jVar.mo49103a(), jVar);
        }
        List<AbstractC67550j> createNativeModules = HostDependManager.getInst().createNativeModules(inst);
        if (createNativeModules != null) {
            for (AbstractC67550j jVar2 : createNativeModules) {
                jVar2.mo234576b(this.iAppContext);
                a.mo234575a(jVar2.mo49103a(), jVar2);
            }
        }
        this.mInitDone = true;
    }

    public void onHide() {
        AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "onHide");
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(this.iAppContext);
        if (miniAppLifeCycleInstance != null) {
            miniAppLifeCycleInstance.mo49085e();
        }
        this.mForeBackgroundManager.mo231965g();
        ToastManager.clearToast();
        if (C25529d.m91146a(this.iAppContext.getAppType(), "onBackGround")) {
            AbstractC65746a.m257747a(this.iAppContext).mo230384d();
        }
        getLifeCycleManager().notifyAppHide();
        IJsBridge jsBridge = getJsBridge();
        if (jsBridge != null) {
            jsBridge.onHide();
        } else {
            C66890j routeEventCtrl = getInst(this.iAppContext).getRouteEventCtrl();
            if (routeEventCtrl != null) {
                routeEventCtrl.mo232875d();
            }
        }
        for (AbstractC65697c cVar : this.mObservers) {
            cVar.mo88401a();
        }
        if (C25529d.m91146a(this.iAppContext.getAppType(), "killGadgetOnBackground")) {
            if (this.isOpenedSchema || C66612a.m260235b(getAppInfo().appId) || C65764a.m257802a().mo230431c() || !(this.iAppContext.getCurrentActivity() instanceof MiniappHostBase)) {
                AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "The GadgetApp is kept alive when it enters the background and will not be automatically killed by the SDK logic");
            } else {
                AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "The GadgetApp enters the background and is killed by SDK logic after waiting for 5 minutes");
                IAppSandboxEnvProcessor a = C66645a.m260337a().mo232355a(this.mAppInfo.sandBoxEnvType);
                IAppContext iAppContext2 = this.iAppContext;
                if (iAppContext2 instanceof AbstractC67433a) {
                    a.getKillSandBoxHandler((AbstractC67433a) iAppContext2).sendMessageDelayed(Message.obtain(), 300000);
                }
            }
        }
        C66460m.m259778a(this.iAppContext);
    }

    public void onShow() {
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(this.iAppContext);
        if (miniAppLifeCycleInstance != null) {
            miniAppLifeCycleInstance.mo49084d();
        }
        this.mForeBackgroundManager.mo231964f();
        if (C25529d.m91146a(this.iAppContext.getAppType(), "onForeGround")) {
            AbstractC65746a.m257747a(this.iAppContext).mo230382c();
        }
        getLifeCycleManager().notifyAppShow();
        AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "onShow");
        this.isOpenedSchema = false;
        IJsBridge jsBridge = getJsBridge();
        if (jsBridge != null) {
            jsBridge.onShow();
        } else {
            C66890j routeEventCtrl = getInst(this.iAppContext).getRouteEventCtrl();
            if (routeEventCtrl != null) {
                routeEventCtrl.mo232874c();
            }
        }
        IAppContext iAppContext2 = this.iAppContext;
        if (iAppContext2 instanceof AbstractC67433a) {
            C66612a.m260221a((AbstractC67433a) iAppContext2);
        }
        if (C25529d.m91146a(this.iAppContext.getAppType(), "removeKillGadgetEventOnForeground")) {
            IAppSandboxEnvProcessor a = C66645a.m260337a().mo232355a(this.mAppInfo.sandBoxEnvType);
            IAppContext iAppContext3 = this.iAppContext;
            if (iAppContext3 instanceof AbstractC67433a) {
                a.getKillSandBoxHandler((AbstractC67433a) iAppContext3).removeCallbacksAndMessages(null);
            }
        }
        for (AbstractC65697c cVar : this.mObservers) {
            cVar.mo88402b();
        }
    }

    public void release() {
        IJsRuntime currentRuntime;
        PerformanceService performanceService = (PerformanceService) getService(PerformanceService.class);
        if (performanceService != null) {
            performanceService.cancelReportPerformance();
        }
        AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", " remove appContext process handler msg");
        if (this.mAppInfo != null) {
            IAppSandboxEnvProcessor a = C66645a.m260337a().mo232355a(this.mAppInfo.sandBoxEnvType);
            if (a != null) {
                a.release(this.iAppContext);
            } else if (DebugUtil.debug()) {
                throw new IllegalArgumentException("processor is null");
            }
        } else if (DebugUtil.debug() && this.iAppContext.getAppType() == AppType.GadgetAPP) {
            throw new IllegalArgumentException("appInfo is null");
        }
        JsRuntimeManager jsRuntimeManager = (JsRuntimeManager) getService(JsRuntimeManager.class);
        if (!(jsRuntimeManager == null || (currentRuntime = jsRuntimeManager.getCurrentRuntime()) == null)) {
            IJsBridge jsBridge = currentRuntime.getJsBridge();
            AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", " jsBridge.removeHandler");
            jsBridge.removeHandler();
        }
        this.mConfigurationChangeListeners.clear();
        this.mActivity = null;
        this.mActivityLife = null;
    }

    /* renamed from: com.tt.miniapp.AppbrandApplicationImpl$a */
    static class C65695a implements Application.ActivityLifecycleCallbacks {
        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityStarted(Activity activity) {
        }

        C65695a(AppbrandApplicationImpl appbrandApplicationImpl) {
        }

        public void onActivityStopped(Activity activity) {
            AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "onActivityStopped");
        }

        public void onActivityPaused(Activity activity) {
            AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "onActivityPaused");
            C67556a.m262929a(activity, "onPause");
        }

        public void onActivityResumed(Activity activity) {
            C67556a.m262929a(activity, "onResume");
            AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "onActivityResumed");
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C67556a.m262929a(activity, "onCreate");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "onActivitySaveInstanceState");
        }
    }

    public void setActivityLife(IActivityLife iActivityLife) {
        this.mActivityLife = iActivityLife;
    }

    public void setAppActivity(Activity activity) {
        this.mActivity = activity;
    }

    public void setCurrentPageHideShareMenuArrayMap(ArrayMap<String, Boolean> arrayMap) {
        this.mCurrentPageHideShareMenuArrayMap = arrayMap;
    }

    public void setCurrentPagePath(String str) {
        this.mCurrentPagePath = str;
    }

    public void setCurrentPageType(String str) {
        this.mCurrentPageType = str;
    }

    public void setCurrentRenderViewId(int i) {
        this.mCurrentRenderViewId = i;
    }

    public void setJumpToApp(boolean z) {
        this.jumpToApp = z;
    }

    public void setOpenedSchema(boolean z) {
        this.isOpenedSchema = z;
    }

    public void setRequestVersion(String str) {
        this.mRequestVersion = str;
    }

    public void setSchema(String str) {
        this.mSchema = str;
    }

    public void setStopReason(String str) {
        this.mStopReason = str;
    }

    public void setUpdateAppInfo(AppInfoEntity appInfoEntity) {
        this.updateAppInfo = appInfoEntity;
    }

    public <T extends AppbrandServiceManager.ServiceBase> T getService(Class<T> cls) {
        return (T) this.mServiceManager.mo230237b(cls);
    }

    public void registerLifecycleObserver(AbstractC65697c cVar) {
        this.mObservers.add(cVar);
    }

    public void ungisterLifecycleObserver(AbstractC65697c cVar) {
        this.mObservers.remove(cVar);
    }

    public void setAppRouter(C65807c cVar) {
        AppBrandLogger.m52830i("tma_AppbrandApplicationImpl", "setAppRouter ");
        this.router = cVar;
    }

    public void notifyConfigurationChange(Configuration configuration) {
        for (AbstractC65696b bVar : this.mConfigurationChangeListeners) {
            bVar.onConfigurationChange(configuration);
        }
    }

    public void registerConfigurationChangeListener(AbstractC65696b bVar) {
        if (bVar != null && !this.mConfigurationChangeListeners.contains(bVar)) {
            this.mConfigurationChangeListeners.add(bVar);
        }
    }

    public void setAppInfo(final AppInfoEntity appInfoEntity) {
        AppInfoEntity appInfoEntity2 = this.mAppInfo;
        if (appInfoEntity2 != null) {
            appInfoEntity.sandBoxEnvType = appInfoEntity2.sandBoxEnvType;
        }
        this.mAppInfo = appInfoEntity;
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.AppbrandApplicationImpl.C656931 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                AppInfoEntity appInfoEntity = appInfoEntity;
                if (appInfoEntity != null) {
                    C66236a.m259230d(appInfoEntity.ttSafeCode, AppbrandApplicationImpl.this.iAppContext);
                    C66236a.m259227c(appInfoEntity.ttBlackCode, AppbrandApplicationImpl.this.iAppContext);
                    C66236a.m259225b(appInfoEntity.encryptextra, AppbrandApplicationImpl.this.iAppContext);
                    appInfoEntity.parseDomain();
                }
            }
        }, C67554l.m262725b());
    }

    public void unRegisterConfigurationChangeListener(AbstractC65696b bVar) {
        if (bVar != null && this.mConfigurationChangeListeners.contains(bVar)) {
            this.mConfigurationChangeListeners.remove(bVar);
        }
    }

    public void addJsCoreReadyListener(AbstractC65698d dVar) {
        if (dVar != null) {
            boolean z = this.mJsCoreReady;
            if (!z) {
                synchronized (this.jsCoreReadyList) {
                    if (!this.mJsCoreReady) {
                        this.jsCoreReadyList.add(new WeakReference<>(dVar));
                    } else {
                        z = true;
                    }
                }
            }
            if (z) {
                dVar.onJsCoreReady();
            }
        }
    }

    public static synchronized AppbrandApplicationImpl getInst(IAppContext iAppContext2) {
        synchronized (AppbrandApplicationImpl.class) {
            C67485a a = C67485a.m262488a(iAppContext2);
            if (a == null) {
                AppBrandLogger.m52829e("tma_AppbrandApplicationImpl", "appSingletonInstance is null, stack:" + Log.getStackTraceString(new Throwable()));
                if (!isReportError) {
                    isReportError = true;
                    new C67500a(C67501b.az, iAppContext2).addCategoryValue("appContextErrorPosition", "AppbrandApplicationImpl.getInstance").addCategoryValue("appContextErrorStack", Log.getStackTraceString(new Throwable())).flush();
                }
                return null;
            }
            return a.mo234292m();
        }
    }

    public AppbrandApplicationImpl(IAppContext iAppContext2) {
        this.iAppContext = iAppContext2;
        this.mServiceManager = new AppbrandServiceManager(this);
        if (!C65680a.m257569c(this.iAppContext) || C67448a.m262353a().mo234183b()) {
            this.mServiceManager.mo230236a(RenderViewManager.class);
            this.mServiceManager.mo230236a(TimeLineReporter.class);
            this.mServiceManager.mo230236a(JsRuntimeManager.class);
            this.mServiceManager.mo230236a(PerformanceService.class);
            this.mServiceManager.mo230236a(PreloadManager.class);
            this.mServiceManager.mo230236a(VConsoleManager.class);
            this.mServiceManager.mo230236a(TMALaunchProgress.class);
            this.mServiceManager.mo230236a(MpTimeLineReporter.class);
            this.mServiceManager.mo230236a(FileAccessLogger.class);
            this.mServiceManager.mo230236a(AppConfigManager.class);
            this.mServiceManager.mo230236a(ShortcutService.class);
            this.mServiceManager.mo230236a(LaunchScheduler.class);
            this.mServiceManager.mo230236a(LoadPathInterceptor.class);
            this.mServiceManager.mo230236a(TimeLogger.class);
            this.mServiceManager.mo230236a(AppbrandBroadcastService.class);
            this.mServiceManager.mo230236a(SnapshotServiceImpl.class);
            this.mServiceManager.mo230236a(RenderEngineManager.class);
            this.mServiceManager.mo230236a(SubPackageDownloadManager.class);
        }
        this.mForeBackgroundManager = new C66420d(this.iAppContext);
    }

    @Override // com.tt.miniapphost.AbstractC67538f
    public void invokeHandler(int i, int i2, String str) {
        RenderViewManager renderViewManager = getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.invokeHandler(i, i2, str);
        }
    }

    public void publish(int i, String str, String str2) {
        RenderViewManager renderViewManager = getRenderViewManager();
        if (renderViewManager != null) {
            renderViewManager.publish(i, str, str2);
        }
    }
}
