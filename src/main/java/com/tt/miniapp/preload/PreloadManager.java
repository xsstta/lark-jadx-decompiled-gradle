package com.tt.miniapp.preload;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.p653g.C13067c;
import com.bytedance.ee.larkbrand.utils.C13370p;
import com.bytedance.ee.larkbrand.utils.DebugHelper;
import com.bytedance.ee.log.C13479a;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.audio.AbstractC65746a;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapp.launchschedule.LaunchScheduler;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.p3335u.p3336a.C66996c;
import com.tt.miniapp.render.RenderEngineManager;
import com.tt.miniapp.util.C67033g;
import com.tt.miniapp.util.C67066w;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.C67152a;
import com.tt.miniapp.view.swipeback.SwipeBackLayout;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3367e.C67460f;
import com.tt.miniapphost.p3374g.AbstractC67547a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class PreloadManager extends AppbrandServiceManager.ServiceBase implements AbstractC67547a {
    public static long sPreloadInitTime;
    public static long testActivityOnCreateTime;
    public static long testPreloadServiceInitTime;
    public static long testProcessInitTime;
    public IAppContext appContext = this.mApp.getiAppContext();
    private Set<Integer> inflatedViewSet = new HashSet();
    private AtomicBoolean jsRuntimePreLoad = new AtomicBoolean();
    private AtomicBoolean loadingViewPreLoad = new AtomicBoolean();
    private boolean mIsNightMode;
    private AtomicBoolean mIsPreloaded = new AtomicBoolean(false);
    private Map<Integer, View> mPreloadViewMap = new HashMap();
    private Handler workerHandler;
    private HandlerThread workerHandlerThread;

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    private boolean onlyInflateOnce(int i) {
        return i == 0 || i == 1 || i == 2 || i == 5;
    }

    public void preloadOnActivityInit() {
        preloadHighPriorityTask();
    }

    public static long getActivityServiceDiffDuration() {
        return testActivityOnCreateTime - testPreloadServiceInitTime;
    }

    private void preloadHighPriorityTask() {
        getWorkerHandler().post(new Runnable() {
            /* class com.tt.miniapp.preload.PreloadManager.RunnableC665983 */

            public void run() {
                KtPreload.f168162a.mo232224a();
            }
        });
    }

    private void preloadInflateViewTask() {
        getWorkerHandler().post(new Runnable() {
            /* class com.tt.miniapp.preload.PreloadManager.RunnableC666005 */

            public void run() {
                PreloadManager.this.preLoadLoadingView();
            }
        });
    }

    public void afterPreloadView() {
        LarkInnerEventHelper.mpAppPreloadResult("success", "preload", 0, "", null, this.appContext);
    }

    public void clean() {
        ((RenderEngineManager) this.mApp.getService(RenderEngineManager.class)).getIRenderViewPreload().clean();
    }

    /* access modifiers changed from: package-private */
    public Handler getWorkerHandler() {
        if (this.workerHandler == null) {
            this.workerHandler = new Handler(this.workerHandlerThread.getLooper());
        }
        return this.workerHandler;
    }

    public void preloadOnIdle() {
        ((RenderEngineManager) this.mApp.getService(RenderEngineManager.class)).getIRenderViewPreload().preloadOnIdle();
    }

    private void forceUpdateJSSDKForDebug() {
        final Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (DebugHelper.m54235d(applicationContext)) {
            final String g = DebugHelper.m54238g(applicationContext);
            if (!TextUtils.isEmpty(g)) {
                C67866g.m264025a(new Action() {
                    /* class com.tt.miniapp.preload.PreloadManager.C665961 */

                    @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                    public void act() {
                        C13370p.m54374a(applicationContext, g);
                    }
                }, C67554l.m262725b());
            }
        }
    }

    public void preloadJsRuntime() {
        if (this.jsRuntimePreLoad.compareAndSet(false, true)) {
            try {
                ((JsRuntimeManager) this.mApp.getService(JsRuntimeManager.class)).preloadTMARuntime(AppbrandContext.getInst().getApplicationContext());
            } catch (Throwable th) {
                AppBrandLogger.m52829e("tma_PreloadManager", th);
            }
        }
    }

    private boolean supportPreload() {
        int i;
        if (!C67066w.m261374a() && Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        if (C67066w.m261374a()) {
            i = 10003;
        } else {
            i = 10004;
        }
        LarkInnerEventHelper.mpAppPreloadResult("fail", "preload", i, "", null, this.appContext);
        TimeLogger.getInstance(this.appContext).logTimeDuration("tma_PreloadManager_preloadWebViewOnProcessInit_return", String.valueOf(true));
        return false;
    }

    public void preLoadLoadingView() {
        if (this.loadingViewPreLoad.compareAndSet(false, true)) {
            try {
                preloadView(0);
                if (ProcessUtil.isMainProcess(this.appContext.getApplicationContext())) {
                    preloadView(6);
                } else {
                    preloadView(1);
                }
                preloadView(2);
                preloadView(3);
                preloadView(4);
                preloadView(5);
            } catch (Exception e) {
                AppBrandLogger.m52829e("tma_PreloadManager", "preload loadingView error", e);
            }
        }
    }

    private void preloadLowPriorityTask(long j) {
        getWorkerHandler().postDelayed(new Runnable() {
            /* class com.tt.miniapp.preload.PreloadManager.RunnableC665994 */

            public void run() {
                PreloadManager.this.preloadForStartUp(AppbrandContext.getInst().getApplicationContext());
            }
        }, j);
    }

    protected PreloadManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("preload-worker");
        this.workerHandlerThread = new_android_os_HandlerThread_by_knot;
        new_android_os_HandlerThread_by_knot.start();
    }

    private void preloadApp(String str) {
        if (str != null && ProcessUtil.isMiniappProcess() && (this.appContext instanceof C67460f)) {
            AbstractC12887b a = C67440a.m262344a(AppType.GadgetAPP, str);
            AbstractC67433a b = C67448a.m262353a().mo234181b(a);
            if (b == null) {
                ((C67460f) this.appContext).mo234157a(a);
            } else {
                this.appContext = b;
            }
            C67448a.m262353a().mo234182b((AbstractC67433a) this.appContext);
            final AppInfoEntity appInfoEntity = new AppInfoEntity();
            appInfoEntity.appId = str;
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.preload.PreloadManager.C665972 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    ((LaunchScheduler) AppbrandApplicationImpl.getInst(PreloadManager.this.appContext).getService(LaunchScheduler.class)).startLaunch(appInfoEntity, null);
                }
            }, C67554l.m262725b());
        }
    }

    private void preloadView(int i) {
        if (this.inflatedViewSet.contains(Integer.valueOf(i)) && onlyInflateOnce(i)) {
            AppBrandLogger.m52828d("tma_PreloadManager", "no need inflate again:" + i);
        } else if (this.mPreloadViewMap.get(Integer.valueOf(i)) == null) {
            this.mIsNightMode = UDUiModeUtils.m93320a(this.appContext.getApplicationContext().getResources().getConfiguration());
            this.mPreloadViewMap.put(Integer.valueOf(i), createView(i));
        }
    }

    public View getPreloadedView(int i) {
        if (this.mIsNightMode != UDUiModeUtils.m93320a(this.appContext.getApplicationContext().getResources().getConfiguration()) && i == 1) {
            this.mPreloadViewMap.remove(Integer.valueOf(i));
        }
        View view = this.mPreloadViewMap.get(Integer.valueOf(i));
        if (view == null) {
            View createView = createView(i);
            this.inflatedViewSet.add(Integer.valueOf(i));
            return createView;
        }
        this.mPreloadViewMap.remove(Integer.valueOf(i));
        return view;
    }

    public void preloadForStartUp(Context context) {
        if (context == null) {
            AppBrandLogger.m52830i("tma_PreloadManager", "preloadForStartUp context null ");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ComponentCallbacks2C2115c.m9151c(context);
        AppBrandLogger.m52830i("tma_PreloadManager", "preload glide.with cost:" + (System.currentTimeMillis() - currentTimeMillis));
        C66375a.m259517a(context, this.appContext);
        AbstractC65746a.m257748a(context, this.appContext);
        C66996c.m261116b(this.appContext);
        C67033g.m261250a(context);
        long currentTimeMillis2 = System.currentTimeMillis();
        Observable.just("test");
        AppBrandLogger.m52830i("tma_PreloadManager", "preload Observable.just cost:" + (System.currentTimeMillis() - currentTimeMillis2));
    }

    @Override // com.tt.miniapphost.p3374g.AbstractC67547a
    public void preloadOnProcessInit(String str) {
        if (this.mIsPreloaded.get()) {
            C13479a.m54764b("tma_PreloadManager", "already preload");
            return;
        }
        this.mIsPreloaded.set(true);
        sPreloadInitTime = System.currentTimeMillis();
        if (supportPreload()) {
            TimeLogger.getInstance(this.appContext).logTimeDuration("PreloadManager_preload_start");
            preloadHighPriorityTask();
            ((RenderEngineManager) this.mApp.getService(RenderEngineManager.class)).getIRenderViewPreload().preloadOnProcessInit();
            preloadLowPriorityTask(100);
            preloadApp(str);
            forceUpdateJSSDKForDebug();
        }
    }

    private View createView(int i) {
        if (i == 0) {
            return LayoutInflater.from(AppbrandContext.getInst().getApplicationContext()).inflate(R.layout.microapp_m_activity_ttappbrand, (ViewGroup) null);
        }
        if (i == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            C67152a aVar = new C67152a(AppbrandContext.getInst().getApplicationContext(), this.appContext);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C66020b.m258530a("mp_inflate_loading_view_result", this.appContext).mo231090a("inflate_java", true).mo231090a("inflate_duration", Long.valueOf(currentTimeMillis2)).mo231092a();
            AppBrandLogger.m52830i("tma_PreloadManager", "nativeInflate:true", "inflate time:" + currentTimeMillis2);
            return aVar;
        } else if (i == 2) {
            return LayoutInflater.from(AppbrandContext.getInst().getApplicationContext()).inflate(R.layout.microapp_m_tab, (ViewGroup) null);
        } else {
            if (i == 3) {
                return LayoutInflater.from(AppbrandContext.getInst().getApplicationContext()).inflate(R.layout.microapp_m_fragment, (ViewGroup) null);
            }
            if (i == 4) {
                return LayoutInflater.from(AppbrandContext.getInst().getApplicationContext()).inflate(R.layout.microapp_m_tab_item, (ViewGroup) null);
            }
            if (i == 5) {
                return new SwipeBackLayout(AppbrandContext.getInst().getApplicationContext(), this.appContext);
            }
            if (i == 6) {
                return new C13067c(AppbrandContext.getInst().getApplicationContext());
            }
            return null;
        }
    }

    public AppbrandFragment takePreloadFragment(Context context, String str) {
        AppBrandLogger.m52828d("tma_PreloadManager", "takePreloadFragment " + str);
        return ((RenderEngineManager) this.mApp.getService(RenderEngineManager.class)).getIRenderViewPreload().takePreloadFragment(context, str);
    }
}
