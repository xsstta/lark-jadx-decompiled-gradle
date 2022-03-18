package com.tt.miniapp.render;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.oryxgadget.utils.OryxSpUtils;
import com.ss.android.lark.utils.LarkContext;
import com.tt.miniapphost.host.HostDependManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RenderEngineManageService {
    private static RenderEngineManageService sInstance;
    private volatile Boolean mFgSandBoxRefactorEnable;
    private final Object mFgSandBoxRefactorLock = new Object();
    private final AtomicBoolean mLock = new AtomicBoolean(false);
    private final HashMap<RenderEngineType, OPRenderEngineProvider> mRenderEngineProviderMap = new HashMap<>();
    private final List<RenderEngineType> mRenderEngineTypeList = new ArrayList();

    public Map<RenderEngineType, OPRenderEngineProvider> getAllRenderEngineProvider() {
        tryLockEngine();
        return this.mRenderEngineProviderMap;
    }

    public List<RenderEngineType> getAllRenderEngineType() {
        tryLockEngine();
        return this.mRenderEngineTypeList;
    }

    public static RenderEngineManageService getInstance() {
        if (sInstance == null) {
            synchronized (RenderEngineManageService.class) {
                if (sInstance == null) {
                    sInstance = new RenderEngineManageService();
                }
            }
        }
        return sInstance;
    }

    public synchronized void tryLockEngine() {
        if (this.mLock.compareAndSet(false, true)) {
            this.mRenderEngineTypeList.addAll(this.mRenderEngineProviderMap.keySet());
        }
    }

    private RenderEngineManageService() {
        regRenderEngine(new C66734d());
    }

    public boolean isFgSandBoxRefactorEnabled() {
        if (this.mFgSandBoxRefactorEnable == null) {
            synchronized (this.mFgSandBoxRefactorLock) {
                if (this.mFgSandBoxRefactorEnable == null) {
                    boolean z = false;
                    if (OryxSpUtils.isForceOpen(LarkContext.getApplication()) || HostDependManager.getInst().getFeatureGating("gadget.miniapp.sandbox.refactor_enable", false)) {
                        z = true;
                    }
                    this.mFgSandBoxRefactorEnable = Boolean.valueOf(z);
                }
            }
        }
        return this.mFgSandBoxRefactorEnable.booleanValue();
    }

    public OPRenderEngineProvider findEngine(RenderEngineType renderEngineType) {
        tryLockEngine();
        return this.mRenderEngineProviderMap.get(renderEngineType);
    }

    public void regRenderEngine(OPRenderEngineProvider oPRenderEngineProvider) {
        if (this.mLock.get()) {
            AppBrandLogger.m52829e("tma_RenderEngineManageService", "Reg engine too late，do not reg engine after locked！:" + oPRenderEngineProvider.getEngineType());
            return;
        }
        if (this.mRenderEngineProviderMap.containsKey(oPRenderEngineProvider.getEngineType())) {
            AppBrandLogger.m52829e("tma_RenderEngineManageService", "Do not reg same type engine repeatedly");
        }
        AppBrandLogger.m52830i("tma_RenderEngineManageService", "reg renderengine provider:" + oPRenderEngineProvider.getEngineType().name());
        this.mRenderEngineProviderMap.put(oPRenderEngineProvider.getEngineType(), oPRenderEngineProvider);
    }
}
