package com.ss.android.ugc.effectmanager;

import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.ss.android.ugc.effectmanager.algorithm.ModelFinder;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.p3042a.C60467a;
import com.ss.android.ugc.effectmanager.p3042a.C60471c;

public class DownloadableModelSupportResourceFinder implements ResourceFinder {
    private static volatile boolean sLibraryLoaded;
    private AssetResourceFinder mAssetResourceFinder;
    private long mEffectHandle;
    private ModelFinder mModelFinder;

    private native long nativeCreateResourceFinder(long j);

    public DownloadableModelSupportResourceFinder() {
    }

    public long getEffectHandle() {
        return this.mEffectHandle;
    }

    private void onModelNotFound(String str) {
        ModelFinder gVar = this.mModelFinder;
        if (gVar != null) {
            gVar.mo207063a(str);
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
        this.mEffectHandle = 0;
        AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
        if (assetResourceFinder != null) {
            assetResourceFinder.release(j);
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        this.mEffectHandle = j;
        if (!sLibraryLoaded) {
            C60484c.f151170a.mo207309a("downloadable_model_support");
            sLibraryLoaded = true;
        }
        AssetResourceFinder assetResourceFinder = this.mAssetResourceFinder;
        if (assetResourceFinder != null) {
            assetResourceFinder.createNativeResourceFinder(j);
        }
        return nativeCreateResourceFinder(j);
    }

    public static void modelNotFound(String str) {
        EPLog.m235179b("ResourceFinder", "modelNotFound:nameStr=" + str);
        if (C60484c.m235023a()) {
            C60484c.m235025b().mo207074f().onModelNotFound(str);
            C60484c.m235025b().mo207074f().monitorStatusRateFail(null, str);
        }
    }

    public boolean isResourceAvailable(String str) {
        String a = this.mModelFinder.mo207061a(str, (MonitorTrace) null);
        if (a == null || "asset://not_found".equals(a) || "asset://not_initialized".equals(a) || "asset://md5_error".equals(a)) {
            return false;
        }
        return true;
    }

    private void monitorStatusRateFail(MonitorTrace bVar, String str) {
        ModelFinder gVar = this.mModelFinder;
        if (gVar != null) {
            gVar.mo207062a(bVar, str);
        }
    }

    public static String findResourceUri(String str, String str2) {
        if (!C60484c.m235023a()) {
            EPLog.m235180c("ResourceFinder", "findResourceUri return with DownloadableModelSupport not initialized!");
            return "asset://not_initialized";
        }
        ModelFinder gVar = C60484c.m235025b().mo207074f().mModelFinder;
        if (gVar == null) {
            return "asset://not_initialized";
        }
        return gVar.mo207060a(0, str, str2);
    }

    public DownloadableModelSupportResourceFinder(C60471c cVar, IModelCache dVar, DownloadableModelConfig downloadableModelConfig, C60467a aVar) {
        this.mAssetResourceFinder = new AssetResourceFinder(aVar.mo207013a(), dVar.mo207020b());
        this.mModelFinder = new ModelFinder(downloadableModelConfig, cVar, dVar, aVar);
    }
}
