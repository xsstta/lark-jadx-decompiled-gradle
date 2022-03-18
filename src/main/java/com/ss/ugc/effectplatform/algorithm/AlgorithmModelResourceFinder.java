package com.ss.ugc.effectplatform.algorithm;

import android.content.Context;
import bytekn.foundation.concurrent.clock.DefaultClock;
import bytekn.foundation.logger.Logger;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.listener.IModelDownloadEventListener;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0011\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmModelResourceFinder;", "Lcom/ss/ugc/effectplatform/algorithm/AlgorithmResourceFinder;", "Lcom/bef/effectsdk/ResourceFinder;", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "eventListener", "Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;Lcom/ss/ugc/effectplatform/listener/IModelDownloadEventListener;Lcom/ss/ugc/effectplatform/EffectConfig;)V", "assetResourceFinder", "Lcom/bef/effectsdk/AssetResourceFinder;", "effectHandle", "", "createNativeResourceFinder", "getEffectHandle", "mobModelFound", "", "modelName", "", "mobModelNotFound", "errorMsg", "nativeCreateResourceFinder", "onModelFound", "onModelNotFound", "errorMessage", "release", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AlgorithmModelResourceFinder extends AlgorithmResourceFinder implements ResourceFinder {
    public static final Companion Companion = new Companion(null);
    private final AlgorithmModelCache algorithmModelCache;
    private final AssetResourceFinder assetResourceFinder;
    private final BuiltInResourceManager buildInAssetsManager;
    private final EffectConfig effectConfig;
    private long effectHandle;
    private final IModelDownloadEventListener eventListener;

    @JvmStatic
    public static final String findResourceUri(String str, String str2) {
        return Companion.mo227700a(str, str2);
    }

    @JvmStatic
    public static final void modelNotFound(String str) {
        Companion.mo227701a(str);
    }

    private final native long nativeCreateResourceFinder(long j);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmModelResourceFinder$Companion;", "", "()V", "TAG", "", "findResourceUri", "dir", "nameStr", "modelNotFound", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo227701a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "nameStr");
            Logger bVar = Logger.f5760a;
            Logger.m7508a(bVar, "ResourceFinder", "modelNotFound:nameStr=" + str, null, 4, null);
            AlgorithmResourceManager.f164847c.mo227716a().mo227712a().onModelNotFound(str, "asset://not_found");
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo227700a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str2, "nameStr");
            if (!AlgorithmResourceManager.f164847c.mo227718b()) {
                return "asset://not_initialized";
            }
            long a = DefaultClock.f5722a.mo8623a();
            String realFindResourceUri = AlgorithmResourceManager.f164847c.mo227716a().mo227712a().realFindResourceUri(0, str, str2);
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("checkEffect", "findResourceUri name: " + str2 + ", result: " + realFindResourceUri + ", time cost: " + (DefaultClock.f5722a.mo8623a() - a) + " ms");
            return realFindResourceUri;
        }
    }

    @Override // com.ss.ugc.effectplatform.algorithm.AlgorithmResourceFinder
    public long getEffectHandle() {
        return this.effectHandle;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.algorithm.AlgorithmResourceFinder
    public void onModelFound(String str) {
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        mobModelFound(str);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
        this.effectHandle = 0;
        this.assetResourceFinder.release(j);
    }

    private final void mobModelFound(String str) {
        IMonitorReport a = this.effectConfig.mo227572s().mo8625a();
        if (a != null) {
            C65510b.m256820a(a, true, this.effectConfig, str, (String) null, 8, (Object) null);
        }
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        AlgorithmLibraryLoader.f164838a.mo227704a();
        this.effectHandle = j;
        this.assetResourceFinder.createNativeResourceFinder(j);
        return nativeCreateResourceFinder(j);
    }

    private final void mobModelNotFound(String str, String str2) {
        IMonitorReport a = this.effectConfig.mo227572s().mo8625a();
        if (a != null) {
            C65510b.m256819a(a, false, this.effectConfig, str, str2);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.algorithm.AlgorithmResourceFinder
    public void onModelNotFound(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        Intrinsics.checkParameterIsNotNull(str2, "errorMessage");
        super.onModelNotFound(str, str2);
        mobModelNotFound(str, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlgorithmModelResourceFinder(AlgorithmModelCache aVar, BuiltInResourceManager fVar, IModelDownloadEventListener eVar, EffectConfig effectConfig2) {
        super(aVar, fVar, eVar);
        Intrinsics.checkParameterIsNotNull(aVar, "algorithmModelCache");
        Intrinsics.checkParameterIsNotNull(fVar, "buildInAssetsManager");
        Intrinsics.checkParameterIsNotNull(effectConfig2, "effectConfig");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = fVar;
        this.eventListener = eVar;
        this.effectConfig = effectConfig2;
        Object a = fVar.mo227719a();
        if (a != null) {
            Context applicationContext = ((Context) a).getApplicationContext();
            Intrinsics.checkExpressionValueIsNotNull(applicationContext, "(buildInAssetsManager.ap…ntext).applicationContext");
            this.assetResourceFinder = new AssetResourceFinder(applicationContext.getAssets(), aVar.mo227688c());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }
}
