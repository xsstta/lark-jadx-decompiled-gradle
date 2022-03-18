package com.tt.miniapp.render;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.utils.CharacterUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.loader.jsbundle.C24512a;
import com.ss.android.lark.optrace.api.TracingCoreSpan;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.p3323q.C66692i;
import com.tt.miniapp.p3331t.AbstractC66882c;
import com.tt.miniapp.p3331t.C66890j;
import com.tt.miniapp.progress.TMALaunchProgress;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapp.util.C67063u;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.p3256b.AbstractC65679a;
import com.tt.refer.common.util.C67866g;

public class RenderLoadManager implements AppbrandApplicationImpl.AbstractC65698d {
    private final AppbrandApplicationImpl mApp;
    public final IAppContext mAppContext;
    private volatile boolean mArgumentReady;
    private boolean mForceLoadPageFrameJs;
    public final IRenderLoadManagerHost mHost;
    private AbstractC66720a mIRenderViewLoadState;
    private volatile boolean mJsCoreReady;
    private long mLifecyclePageStartTime;
    private final Object mLoadLock = new Object();
    private volatile int mLoadState;
    private String mOpenType;
    private String mPageContent;
    private TimeMeter mPageLoadStartTime;
    private String mPageQuery;
    private String mPageUrl;
    private volatile boolean mPathFrameLoaded;
    public volatile boolean mSubPackageInstalled;
    private String mTraceId;
    private TracingCoreSpan mTracingCoreSpan;

    public interface IRenderLoadManagerHost {
        void checkAppDarkModeStatus();

        void checkGlobalDarkModeStatus();

        Context getContext();

        int getRenderViewId();

        String getTemplateFilePathIfNotExist();

        boolean isFirstPage();

        void loadPageFrame();

        void loadPathFrame();

        void loadPreloadTemplate();

        void onEnvironmentReady();

        void onUpdateArgument(String str, String str2, String str3, String str4);

        void preRenderData(String str);
    }

    /* renamed from: com.tt.miniapp.render.RenderLoadManager$a */
    public interface AbstractC66720a {
        /* renamed from: a */
        void mo232557a();
    }

    public TracingCoreSpan getTracingCoreSpan() {
        return this.mTracingCoreSpan;
    }

    public void reLaunchForSSB() {
        this.mOpenType = "reLaunch";
        sendOnAppRoute();
    }

    public boolean isTemplateReady() {
        boolean z;
        synchronized (this.mLoadLock) {
            if (this.mLoadState >= 2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void checkGlobalDarkModeStatus() {
        IRenderLoadManagerHost iRenderLoadManagerHost = this.mHost;
        if (iRenderLoadManagerHost != null) {
            iRenderLoadManagerHost.checkGlobalDarkModeStatus();
            return;
        }
        AppBrandLogger.m52830i("RenderLoadManager", "checkGlobalDarkModeStatus : host is null");
    }

    public void markForceLoadPathFrameJs() {
        synchronized (this.mLoadLock) {
            this.mForceLoadPageFrameJs = true;
        }
        AppBrandLogger.m52830i("RenderLoadManager", "markForceLoadPathFrameJs");
        continuePreloadIfNeed();
    }

    private void mpLifecyclePageStart() {
        boolean equals = "appLaunch".equals(this.mOpenType);
        this.mLifecyclePageStartTime = System.currentTimeMillis();
        LarkInnerEventHelper.mpLifecyclePageStart(equals ? 1 : 0, C66037e.m258610a(this.mAppContext).mo231120c(), this.mPageContent, this.mTraceId, this.mAppContext);
    }

    private void onEnvironmentReady() {
        TimeLogger.getInstance(this.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_onEnvironmentReady");
        this.mHost.onEnvironmentReady();
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(this.mAppContext);
        if (miniAppLifeCycleInstance != null) {
            miniAppLifeCycleInstance.mo229927f();
        }
        ((LaunchScheduler) this.mApp.getService(LaunchScheduler.class)).onPreloadEnd();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        com.tt.miniapp.util.TimeLogger.getInstance(r4.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_onJsCoreReady");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        onEnvironmentReady();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    @Override // com.tt.miniapp.AppbrandApplicationImpl.AbstractC65698d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onJsCoreReady() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mLoadLock
            monitor-enter(r0)
            boolean r1 = r4.mJsCoreReady     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0009:
            r1 = 1
            r4.mJsCoreReady = r1     // Catch:{ all -> 0x003c }
            com.bytedance.ee.lark.infra.sandbox.context.IAppContext r2 = r4.mAppContext     // Catch:{ all -> 0x003c }
            java.lang.String r2 = r2.getAppId()     // Catch:{ all -> 0x003c }
            boolean r2 = com.larksuite.component.openplatform.core.loader.jsbundle.C24512a.m89385a(r2)     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x001f
            boolean r2 = r4.mArgumentReady     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x001f
            r4.sendOnAppRoute()     // Catch:{ all -> 0x003c }
        L_0x001f:
            int r2 = r4.mLoadState     // Catch:{ all -> 0x003c }
            r3 = 4
            if (r2 < r3) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            com.bytedance.ee.lark.infra.sandbox.context.IAppContext r0 = r4.mAppContext
            com.tt.miniapp.util.TimeLogger r0 = com.tt.miniapp.util.TimeLogger.getInstance(r0)
            java.lang.String r2 = "NativeNestWebViewLoadBase_onJsCoreReady"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            r0.logTimeDuration(r2)
            if (r1 == 0) goto L_0x003b
            r4.onEnvironmentReady()
        L_0x003b:
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.render.RenderLoadManager.onJsCoreReady():void");
    }

    public void onLoadPathFrameFinished() {
        LarkInnerEventHelper.mpWebViewPageLoadResult("success", TimeMeter.nowAfterStart(this.mPageLoadStartTime), null, 0, null, null, this.mAppContext);
        TimeLogger.getInstance(this.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_stopStreamLoadPathFrame");
    }

    public void preRenderFirstPage() {
        if (this.mHost.isFirstPage()) {
            final String str = C67432a.m262319a(this.mAppContext).getAppInfo().appId;
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.render.RenderLoadManager.C667191 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    if (HostDependManager.getInst().isPreRenderApp() && C67063u.m261365a(str)) {
                        String b = C67063u.m261366b(C67063u.m261363a(RenderLoadManager.this.mAppContext));
                        if (!TextUtils.isEmpty(b)) {
                            RenderLoadManager.this.mHost.preRenderData(b);
                        }
                    }
                }
            }, C67554l.m262725b());
        }
    }

    private void loadPathFrameIfNeed() {
        synchronized (this.mLoadLock) {
            if (!this.mPathFrameLoaded) {
                if (this.mLoadState >= 3) {
                    if (this.mArgumentReady || this.mForceLoadPageFrameJs) {
                        this.mPathFrameLoaded = true;
                        this.mPageLoadStartTime = TimeMeter.newAndStart();
                        C66036d.m258607d(this.mPageContent, this.mAppContext);
                        TimeLogger.getInstance(this.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_startStreamLoadPathFrame");
                        LarkInnerEventHelper.mpWebViewPageLoadStart(this.mPageContent, this.mAppContext);
                        this.mHost.loadPathFrame();
                    }
                }
            }
        }
    }

    public void onDOMReady() {
        C66036d.m258587a(this.mPageContent, "success", TimeMeter.stop(this.mPageLoadStartTime), CharacterUtils.empty(), this.mAppContext, ((RenderEngineManager) AppbrandApplicationImpl.getInst(this.mAppContext).getService(RenderEngineManager.class)).getTypeFromPageUrl(this.mPageUrl).name());
        LarkInnerEventHelper.mpLifecyclePageOnReady(System.currentTimeMillis() - this.mLifecyclePageStartTime, this.mTraceId, this.mAppContext);
        AbstractC67434b a = ((AbstractC67433a) this.mAppContext).mo234156a();
        if (a instanceof C66546p) {
            ((C66546p) a).mo232128q();
        }
        C66692i.m260476b(this.mPageUrl, this.mAppContext);
    }

    public void onLoadPageFrameFinished() {
        boolean z;
        TimeLogger.getInstance(this.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_onWebviewReady");
        preRenderFirstPage();
        synchronized (this.mLoadLock) {
            this.mLoadState = 4;
            z = this.mJsCoreReady;
        }
        LarkInnerEventHelper.mpWebViewAppLoadResult("success", C66037e.m258610a(this.mAppContext).mo231120c(), null, 0, null, null, this.mAppContext);
        LarkInnerEventHelper.mpWebViewLoadDomReady(this.mAppContext);
        ((TMALaunchProgress) this.mApp.getService(TMALaunchProgress.class)).updateStatus(6);
        if (z) {
            onEnvironmentReady();
        }
    }

    public void sendOnAppRoute() {
        AppBrandLogger.m52830i("StartApp", "sendOnAppRoute, mPageContent: " + this.mPageContent + ", mPageQuery: " + this.mPageQuery + ", openType: " + this.mOpenType);
        mpLifecyclePageStart();
        C66890j routeEventCtrl = this.mApp.getRouteEventCtrl();
        if (routeEventCtrl != null) {
            routeEventCtrl.mo232871a(new AbstractC66882c.C66883a(this.mHost.getRenderViewId(), this.mPageContent, this.mPageQuery, this.mOpenType, getTracingCoreSpan()));
        }
    }

    public void onLoadTemplateFinished() {
        boolean z;
        AppBrandLogger.m52830i("RenderLoadManager", "onLoadTemplateFinished", Integer.valueOf(this.mLoadState));
        if (this.mLoadState >= 2) {
            TimeLogger.getInstance(this.mAppContext).logTimeDuration("RenderLoadManager_onPageFinished_MoreThanOnce");
            return;
        }
        AppBrandLogger.m52830i("RenderLoadManager", "preload, webView lib done");
        LarkInnerEventHelper.mpWebViewLibLoadResult("success", null, 0, null, null, this.mAppContext);
        TimeLogger.getInstance(this.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_onPageFinished");
        ((MpTimeLineReporter) this.mApp.getService(MpTimeLineReporter.class)).addPoint("load_pageFrameHtml_end");
        AbstractC66720a aVar = this.mIRenderViewLoadState;
        if (aVar != null) {
            aVar.mo232557a();
        }
        synchronized (this.mLoadLock) {
            this.mLoadState = 2;
            z = this.mArgumentReady;
        }
        C67049n.m261310a(this.mAppContext, this.mHost.getRenderViewId());
        AppbrandApplicationImpl.getInst(this.mAppContext).getRenderViewManager().flushPendingJs(this.mHost.getRenderViewId());
        if (!C24512a.m89385a(this.mAppContext.getAppId()) && z) {
            sendOnAppRoute();
        }
        ((TMALaunchProgress) AppbrandApplicationImpl.getInst(this.mAppContext).getService(TMALaunchProgress.class)).updateStatus(4);
        continuePreloadIfNeed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        com.tt.miniapp.util.TimeLogger.getInstance(r7.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_loadPreloadTemplate");
        ((com.tt.miniapp.util.MpTimeLineReporter) r7.mApp.getService(com.tt.miniapp.util.MpTimeLineReporter.class)).addPoint("load_pageFrameHtml_begin");
        com.tt.miniapp.event.lark.LarkInnerEventHelper.mpWebViewLibLoadStart(r7.mAppContext);
        r7.mHost.loadPreloadTemplate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0149, code lost:
        com.tt.miniapp.util.TimeLogger.getInstance(r7.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_startStreamLoadPageFrame");
        com.tt.miniapp.event.lark.LarkInnerEventHelper.mpWebViewAppLoadStart(r7.mAppContext);
        r7.mHost.loadPageFrame();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void continuePreloadIfNeed() {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.render.RenderLoadManager.continuePreloadIfNeed():void");
    }

    public void setOpenType(String str) {
        this.mOpenType = str;
    }

    public void setRenderViewInterface(AbstractC66720a aVar) {
        this.mIRenderViewLoadState = aVar;
    }

    private void showLoadError(String str) {
        if (!AppbrandContext.getInst().isGame()) {
            C66194c.m259173a(str, this.mAppContext);
        }
    }

    public void onPreloadPageFrameCallback(String str) {
        TimeLogger.getInstance(this.mAppContext).logTimeDuration("NativeNestWebViewLoadBase_stopStreamLoadPageFrame");
    }

    public RenderLoadManager(AppbrandApplicationImpl appbrandApplicationImpl, IAppContext iAppContext, IRenderLoadManagerHost iRenderLoadManagerHost) {
        this.mApp = appbrandApplicationImpl;
        this.mAppContext = iAppContext;
        this.mHost = iRenderLoadManagerHost;
        appbrandApplicationImpl.addJsCoreReadyListener(this);
        TracingCoreSpan generateSpan = AppbrandContext.getInst().getTracing().generateSpan();
        this.mTracingCoreSpan = generateSpan;
        if (generateSpan != null) {
            this.mTraceId = generateSpan.getTracingID();
        }
    }

    public void updateArgument(String str, String str2, String str3, String str4) {
        boolean z = true;
        boolean z2 = false;
        AppBrandLogger.m52830i("RenderLoadManager", "onUpdateArgument " + str + " " + str2 + " " + str3 + " " + str4);
        this.mOpenType = str;
        this.mPageUrl = str2;
        this.mPageContent = str3;
        this.mPageQuery = str4;
        synchronized (this.mLoadLock) {
            if (!this.mArgumentReady) {
                this.mArgumentReady = true;
                if (C24512a.m89385a(this.mAppContext.getAppId())) {
                    z2 = this.mJsCoreReady;
                } else {
                    if (this.mLoadState < 2) {
                        z = false;
                    }
                    z2 = z;
                }
            }
        }
        if (z2) {
            sendOnAppRoute();
        }
        this.mHost.onUpdateArgument(str, str2, str3, str4);
        continuePreloadIfNeed();
    }
}
