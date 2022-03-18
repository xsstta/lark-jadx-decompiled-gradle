package com.ss.ugc.effectplatform.repository;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.algorithm.AlgorithmEffectFetcher;
import com.ss.ugc.effectplatform.algorithm.AlgorithmResourceFinder;
import com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.cache.EffectCacheManager;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.task.ModelConfigArbiter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0017JC\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00170\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0002\u0010\"J*\u0010#\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001c\u0018\u00010 J/\u0010$\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001c\u0018\u00010 ¢\u0006\u0002\u0010%J7\u0010$\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001c2\u0014\u0010\u001f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001c\u0018\u00010 ¢\u0006\u0002\u0010(J\u0018\u0010)\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u0015J\"\u0010)\u001a\u0004\u0018\u00010\u00152\u0006\u0010&\u001a\u00020'2\b\u0010+\u001a\u0004\u0018\u00010\u00152\u0006\u0010*\u001a\u00020\u0015J\u0006\u0010,\u001a\u00020\nJ\b\u0010-\u001a\u00020\nH\u0002J\b\u0010.\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;", "", "config", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "effectFetcher", "Lcom/ss/ugc/effectplatform/algorithm/AlgorithmEffectFetcher;", "modelConfigArbiter", "Lcom/ss/ugc/effectplatform/task/ModelConfigArbiter;", "resourceFinder", "Lcom/ss/ugc/effectplatform/algorithm/AlgorithmResourceFinder;", "areRequirementsReady", "", "effect", "Lcom/ss/ugc/effectplatform/model/Effect;", "checkModelReadyLocal", "resourceName", "", "fetchLocalModelInfo", "", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "requirements", "fetchResourcesByRequirementsAndModelNames", "", "", "modelNames", "", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "", "([Ljava/lang/String;Ljava/util/Map;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "fetchResourcesNeededByRequirements", "fetchResourcesWithModelNames", "([Ljava/lang/String;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "businessId", "", "(I[Ljava/lang/String;Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;)V", "findResourceUri", "modelName", "dir", "getEffectFetcher", "getEffectFetcherInternal", "getResourceFinder", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.f.a */
public final class AlgorithmRepository {

    /* renamed from: a */
    public static AlgorithmRepository f164913a;

    /* renamed from: b */
    public static final Companion f164914b = new Companion(null);

    /* renamed from: c */
    private ModelConfigArbiter f164915c;

    /* renamed from: d */
    private AlgorithmEffectFetcher f164916d;

    /* renamed from: e */
    private final AlgorithmModelCache f164917e;

    /* renamed from: f */
    private BuiltInResourceManager f164918f;

    /* renamed from: g */
    private AlgorithmResourceFinder f164919g;

    /* renamed from: h */
    private final EffectConfig f164920h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository$Companion;", "", "()V", "INSTANCE", "Lcom/ss/ugc/effectplatform/repository/AlgorithmRepository;", "TAG", "", "getInstance", "initialize", "", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "isInitialized", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: b */
        public final boolean mo227801b() {
            if (AlgorithmRepository.f164913a != null) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final AlgorithmRepository mo227799a() {
            if (AlgorithmRepository.f164913a != null) {
                AlgorithmRepository aVar = AlgorithmRepository.f164913a;
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                return aVar;
            }
            throw new RuntimeException("Please initialize AlgorithmRepository first!");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo227800a(EffectConfig effectConfig) {
            Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
            AlgorithmRepository.f164913a = new AlgorithmRepository(effectConfig, null);
        }
    }

    /* renamed from: b */
    private final AlgorithmEffectFetcher m256833b() {
        AlgorithmEffectFetcher aVar = this.f164916d;
        if (aVar != null) {
            return aVar;
        }
        AlgorithmEffectFetcher aVar2 = new AlgorithmEffectFetcher(this.f164920h, this.f164915c, this.f164918f, this.f164917e);
        this.f164916d = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public final AlgorithmResourceFinder mo227797a() {
        AlgorithmResourceFinder dVar = this.f164919g;
        if (dVar != null) {
            return dVar;
        }
        AlgorithmResourceFinder dVar2 = new AlgorithmResourceFinder(this.f164917e, this.f164918f, this.f164920h.mo227547G());
        this.f164919g = dVar2;
        return dVar2;
    }

    /* renamed from: a */
    private final boolean m256832a(String str) {
        boolean isResourceAvailable = mo227797a().isResourceAvailable(str);
        try {
            boolean z = true;
            Collection a = AlgorithmEffectFetcher.m256698a(m256833b(), new String[]{str}, 0, 2, null);
            if (a != null && !a.isEmpty()) {
                z = false;
            }
            if (!z) {
                return false;
            }
            return isResourceAvailable;
        } catch (Exception unused) {
        }
    }

    private AlgorithmRepository(EffectConfig effectConfig) {
        int i;
        this.f164920h = effectConfig;
        this.f164918f = new BuiltInResourceManager(effectConfig.mo227543C(), effectConfig.mo227545E());
        this.f164915c = ModelConfigArbiter.f165064g.mo228284b(effectConfig);
        ICache a = EffectCacheManager.f164822a.mo227691a(effectConfig.mo227548H());
        if (a == null || !(a instanceof AlgorithmModelCache)) {
            String H = effectConfig.mo227548H();
            String c = effectConfig.mo227556c();
            if (c != null) {
                i = c.hashCode();
            } else {
                i = 0;
            }
            AlgorithmModelCache aVar = new AlgorithmModelCache(H, i, this.f164918f);
            this.f164917e = aVar;
            EffectCacheManager.f164822a.mo227692a(effectConfig.mo227548H(), aVar);
            return;
        }
        this.f164917e = (AlgorithmModelCache) a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo227798a(com.ss.ugc.effectplatform.model.Effect r10) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.repository.AlgorithmRepository.mo227798a(com.ss.ugc.effectplatform.model.Effect):boolean");
    }

    public /* synthetic */ AlgorithmRepository(EffectConfig effectConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(effectConfig);
    }
}
