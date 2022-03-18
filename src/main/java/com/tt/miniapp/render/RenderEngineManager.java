package com.tt.miniapp.render;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12788f;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.AppConfig;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.AppbrandServiceManager;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.preload.IRenderViewPreload;
import com.tt.miniapp.webbridge.C67302a;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.miniapphost.util.ProcessUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class RenderEngineManager extends AppbrandServiceManager.ServiceBase implements RenderViewManager.IRenderManager, IRenderViewPreload {
    private AtomicBoolean mLock = new AtomicBoolean(false);
    private HashMap<RenderEngineType, OPRenderEngine> mRenderEngineMap = new HashMap<>();
    private HashMap<Integer, RenderEngineType> mRenderIdTypeMap = new HashMap<>();

    public IRenderViewPreload getIRenderViewPreload() {
        return this;
    }

    public Set<RenderEngineType> getRegRenderEngine() {
        tryLockEngine();
        return this.mRenderEngineMap.keySet();
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public void clean() {
        tryLockEngine();
        for (Map.Entry<RenderEngineType, OPRenderEngine> entry : this.mRenderEngineMap.entrySet()) {
            entry.getValue().getRenderViewPreload().clean();
        }
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public void preloadOnIdle() {
        tryLockEngine();
        for (Map.Entry<RenderEngineType, OPRenderEngine> entry : this.mRenderEngineMap.entrySet()) {
            entry.getValue().getRenderViewPreload().preloadOnIdle();
        }
    }

    private synchronized void tryLockEngine() {
        if (this.mLock.compareAndSet(false, true)) {
            AppBrandLogger.m52828d("tma_RenderEngineManager", "Locked render engine");
            for (Map.Entry<RenderEngineType, OPRenderEngineProvider> entry : RenderEngineManageService.getInstance().getAllRenderEngineProvider().entrySet()) {
                this.mRenderEngineMap.put(entry.getKey(), entry.getValue().getRenderEngine(this.mApp));
            }
        }
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public void preloadOnProcessInit() {
        tryLockEngine();
        if (RenderEngineManageService.getInstance().isFgSandBoxRefactorEnabled()) {
            AppBrandLogger.m52830i("tma_RenderEngineManager", "preloadOnProcessInit new sandbox");
            String b = C12788f.m52856b(this.mApp.getiAppContext().getApplicationContext());
            if (b != null && C12788f.m52858c(b)) {
                OPRenderEngine oPRenderEngine = this.mRenderEngineMap.get(RenderEngineType.Oryx);
                if (oPRenderEngine != null) {
                    oPRenderEngine.getRenderViewPreload().preloadOnProcessInit();
                    return;
                }
                AppBrandLogger.m52829e("tma_RenderEngineManager", "PreloadOnProcessInit in oryx process, but not reg oryx");
            }
            this.mRenderEngineMap.get(RenderEngineType.WebView).getRenderViewPreload().preloadOnProcessInit();
            return;
        }
        for (Map.Entry<RenderEngineType, OPRenderEngine> entry : this.mRenderEngineMap.entrySet()) {
            entry.getValue().getRenderViewPreload().preloadOnProcessInit();
        }
    }

    public int nextRenderViewId(RenderEngineType renderEngineType) {
        int a = C67302a.m262173a();
        this.mRenderIdTypeMap.put(Integer.valueOf(a), renderEngineType);
        return a;
    }

    protected RenderEngineManager(AppbrandApplicationImpl appbrandApplicationImpl) {
        super(appbrandApplicationImpl);
    }

    public RenderEngineType getTypeFromRenderViewId(int i) {
        RenderEngineType renderEngineType = this.mRenderIdTypeMap.get(Integer.valueOf(i));
        if (renderEngineType != null) {
            return renderEngineType;
        }
        return RenderEngineType.WebView;
    }

    public RenderEngineType getTypeFromPageUrl(String str) {
        AppConfig.Window a;
        tryLockEngine();
        String b = AppConfig.m257578b(str);
        AppConfig appConfig = AppbrandApplicationImpl.getInst(this.mApp.getiAppContext()).getAppConfig();
        if (!MiniAppProcessUtils.isOryxProcess(ProcessUtil.getProcess())) {
            return RenderEngineType.WebView;
        }
        if (appConfig != null) {
            AppConfig.C65690e eVar = appConfig.f165495b;
            if (!(eVar == null || (a = eVar.mo230061a(b)) == null)) {
                AppBrandLogger.m52828d("tma_RenderEngineManager", "getTypeFromPageUrl " + b + " " + a.renderType);
                for (Map.Entry<RenderEngineType, OPRenderEngine> entry : this.mRenderEngineMap.entrySet()) {
                    if (entry.getValue().getRenderTypeStr().equalsIgnoreCase(a.renderType)) {
                        return entry.getKey();
                    }
                }
            }
        } else {
            AppBrandLogger.m52829e("tma_RenderEngineManager", "getTypeFromPageUrl appConfig == null");
        }
        return RenderEngineType.WebView;
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void addRenderComponent(int i, View view) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().addRenderComponent(i, view);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void flushPendingJs(int i, Queue<String> queue) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().flushPendingJs(i, queue);
    }

    @Override // com.tt.miniapp.preload.IRenderViewPreload
    public AppbrandFragment takePreloadFragment(Context context, String str) {
        tryLockEngine();
        OPRenderEngine oPRenderEngine = this.mRenderEngineMap.get(getTypeFromPageUrl(str));
        if (oPRenderEngine == null) {
            oPRenderEngine = this.mRenderEngineMap.get(RenderEngineType.WebView);
        }
        return oPRenderEngine.getRenderViewPreload().takePreloadFragment(context, str);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void invokeHandler(int i, int i2, String str) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().invokeHandler(i, i2, str);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void olderInvokeHandler(int i, int i2, String str) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().olderInvokeHandler(i, i2, str);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publish(int i, String str, String str2) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().publish(i, str, str2);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publishDirectly(int i, String str, String str2) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().publishDirectly(i, str, str2);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publishFrontOfQueue(int i, String str, String str2) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().publishFrontOfQueue(i, str, str2);
    }

    @Override // com.tt.miniapp.RenderViewManager.IRenderManager
    public void publishFirst(int i, String str, String str2, IAppContext iAppContext) {
        tryLockEngine();
        this.mRenderEngineMap.get(getTypeFromRenderViewId(i)).getRenderViewInnerManager().publishFirst(i, str, str2, iAppContext);
    }
}
