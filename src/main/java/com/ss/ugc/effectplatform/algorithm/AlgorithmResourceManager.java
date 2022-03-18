package com.ss.ugc.effectplatform.algorithm;

import bytekn.foundation.concurrent.clock.DefaultClock;
import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.EffectPlatform;
import com.ss.ugc.effectplatform.algorithm.ILibraryLoader;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.cache.EffectCacheManager;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.repository.AlgorithmRepository;
import com.ss.ugc.effectplatform.task.ModelConfigArbiter;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0016JC\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00160\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0002\u0010\"J*\u0010#\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001c\u0018\u00010 J\u0006\u0010$\u001a\u00020\u000eJ\b\u0010%\u001a\u00020\u000eH\u0002J\u0006\u0010&\u001a\u00020\u0010J\u0016\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmResourceManager;", "", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "algorithmRepository", "Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "getEffectConfig", "()Lcom/ss/ugc/effectplatform/EffectConfig;", "effectFetcher", "Lcom/ss/ugc/effectplatform/algorithm/AlgorithmEffectFetcher;", "resourceFinder", "Lcom/ss/ugc/effectplatform/algorithm/AlgorithmModelResourceFinder;", "areRequirementsReady", "", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "fetchLocalModelInfo", "", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "requirements", "", "fetchResourcesByRequirementsAndModelNames", "", "", "modelNames", "", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "", "([Ljava/lang/String;Ljava/util/Map;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "fetchResourcesNeededByRequirements", "getEffectFetcher", "getEffectFetcherInternal", "getResourceFinder", "isEffectReady", "effectPlatform", "Lcom/ss/ugc/effectplatform/EffectPlatform;", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.e */
public final class AlgorithmResourceManager {

    /* renamed from: a */
    public static AlgorithmResourceManager f164845a;

    /* renamed from: b */
    public static ILibraryLoader f164846b = ILibraryLoader.SoLibraryLoader.f164856a;

    /* renamed from: c */
    public static final Companion f164847c = new Companion(null);

    /* renamed from: d */
    private final AlgorithmModelCache f164848d;

    /* renamed from: e */
    private BuiltInResourceManager f164849e;

    /* renamed from: f */
    private AlgorithmModelResourceFinder f164850f;

    /* renamed from: g */
    private AlgorithmEffectFetcher f164851g;

    /* renamed from: h */
    private final AlgorithmRepository f164852h;

    /* renamed from: i */
    private final EffectConfig f164853i;

    @JvmStatic
    /* renamed from: a */
    public static final synchronized void m256706a(EffectConfig effectConfig) {
        synchronized (AlgorithmResourceManager.class) {
            f164847c.mo227717a(effectConfig);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final AlgorithmResourceManager m256707c() {
        return f164847c.mo227716a();
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m256708d() {
        return f164847c.mo227718b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmResourceManager$Companion;", "", "()V", "INSTANCE", "Lcom/ss/ugc/effectplatform/algorithm/AlgorithmResourceManager;", "value", "Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;", "libraryLoader", "getLibraryLoader", "()Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;", "setLibraryLoader", "(Lcom/ss/ugc/effectplatform/algorithm/ILibraryLoader;)V", "fetchModelList", "", "bussinessId", "", "getInstance", "initialize", "config", "Lcom/ss/ugc/effectplatform/EffectConfig;", "isInitialized", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.algorithm.e$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo227718b() {
            if (AlgorithmResourceManager.f164845a != null) {
                return true;
            }
            return false;
        }

        @JvmStatic
        /* renamed from: a */
        public final AlgorithmResourceManager mo227716a() {
            AlgorithmResourceManager eVar = AlgorithmResourceManager.f164845a;
            if (eVar != null) {
                return eVar;
            }
            throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final synchronized void mo227717a(EffectConfig effectConfig) {
            Intrinsics.checkParameterIsNotNull(effectConfig, "config");
            if (AlgorithmResourceManager.f164845a == null) {
                AlgorithmResourceManager.f164845a = new AlgorithmResourceManager(effectConfig, null);
            } else {
                throw new IllegalStateException("Duplicate initialization");
            }
        }
    }

    /* renamed from: b */
    public final AlgorithmEffectFetcher mo227715b() {
        return m256709e();
    }

    /* renamed from: e */
    private final AlgorithmEffectFetcher m256709e() {
        AlgorithmEffectFetcher aVar = this.f164851g;
        if (aVar != null) {
            return aVar;
        }
        AlgorithmEffectFetcher aVar2 = new AlgorithmEffectFetcher(this.f164853i, ModelConfigArbiter.f165064g.mo228284b(this.f164853i), this.f164849e, this.f164848d);
        this.f164851g = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public final AlgorithmModelResourceFinder mo227712a() {
        AlgorithmModelResourceFinder algorithmModelResourceFinder = this.f164850f;
        if (algorithmModelResourceFinder != null) {
            return algorithmModelResourceFinder;
        }
        AlgorithmModelResourceFinder algorithmModelResourceFinder2 = new AlgorithmModelResourceFinder(this.f164848d, this.f164849e, this.f164853i.mo227547G(), this.f164853i);
        this.f164850f = algorithmModelResourceFinder2;
        return algorithmModelResourceFinder2;
    }

    /* renamed from: a */
    public final boolean mo227714a(Effect effect) {
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        return this.f164852h.mo227798a(effect);
    }

    private AlgorithmResourceManager(EffectConfig effectConfig) {
        int i;
        this.f164853i = effectConfig;
        this.f164849e = new BuiltInResourceManager(effectConfig.mo227543C(), effectConfig.mo227545E());
        ICache a = EffectCacheManager.f164822a.mo227691a(effectConfig.mo227548H());
        if (a == null || !(a instanceof AlgorithmModelCache)) {
            String H = effectConfig.mo227548H();
            String c = effectConfig.mo227556c();
            if (c != null) {
                i = c.hashCode();
            } else {
                i = 0;
            }
            AlgorithmModelCache aVar = new AlgorithmModelCache(H, i, this.f164849e);
            this.f164848d = aVar;
            EffectCacheManager.f164822a.mo227692a(effectConfig.mo227548H(), aVar);
        } else {
            this.f164848d = (AlgorithmModelCache) a;
        }
        if (!AlgorithmRepository.f164914b.mo227801b()) {
            AlgorithmRepository.f164914b.mo227800a(effectConfig);
        }
        this.f164852h = AlgorithmRepository.f164914b.mo227799a();
    }

    public /* synthetic */ AlgorithmResourceManager(EffectConfig effectConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(effectConfig);
    }

    /* renamed from: a */
    public final boolean mo227713a(EffectPlatform aVar, Effect effect) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "effectPlatform");
        Intrinsics.checkParameterIsNotNull(effect, "effect");
        long a = DefaultClock.f5722a.mo8623a();
        if (aVar.mo227635a(effect)) {
            z = mo227714a(effect);
        } else {
            z = false;
        }
        Logger bVar = Logger.f5760a;
        bVar.mo8662a("isEffectReady", "effect: " + effect.getEffect_id() + ", name:" + effect.getName() + ", result: " + z + ", time cost: " + (DefaultClock.f5722a.mo8623a() - a) + " ms");
        return z;
    }
}
