package com.ss.ugc.effectplatform.task;

import bytekn.foundation.collections.SharedMutableMap;
import bytekn.foundation.concurrent.executor.AsyncExecutor;
import bytekn.foundation.logger.Logger;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.algorithm.AlgorithmModelInfoMemoryCache;
import com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.cache.EffectCacheManager;
import com.ss.ugc.effectplatform.cache.ICache;
import com.ss.ugc.effectplatform.model.LoadedModelList;
import com.ss.ugc.effectplatform.model.ServerConfig;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.ss.ugc.effectplatform.task.FetchModelListTask;
import com.ss.ugc.effectplatform.task.algorithm.FetchModelInfoByNameTask;
import com.ss.ugc.effectplatform.util.TaskUtil;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.C69097g;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.ugc.effectplatform.task.k */
public final class ModelConfigArbiter {

    /* renamed from: d */
    public static final SharedMutableMap<String, LoadedModelList> f165061d = new SharedMutableMap<>(true);

    /* renamed from: e */
    public static final SharedMutableMap<String, ModelInfo> f165062e = new SharedMutableMap<>(true);

    /* renamed from: f */
    public static ModelConfigArbiter f165063f;

    /* renamed from: g */
    public static final Companion f165064g = new Companion(null);

    /* renamed from: a */
    public final SharedMutableMap<String, Exception> f165065a;

    /* renamed from: b */
    public final SharedMutableMap<String, FetchModelListTask> f165066b;

    /* renamed from: c */
    public final EffectConfig f165067c;

    /* renamed from: h */
    private final BuiltInResourceManager f165068h;

    /* renamed from: i */
    private final SharedMutableMap<String, Integer> f165069i;

    /* renamed from: j */
    private final SharedMutableMap<String, FetchModelInfoByNameTask> f165070j;

    /* renamed from: com.ss.ugc.effectplatform.task.k$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final SharedMutableMap<String, LoadedModelList> mo228281a() {
            return ModelConfigArbiter.f165061d;
        }

        /* renamed from: c */
        public final boolean mo228285c() {
            if (ModelConfigArbiter.f165063f != null) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final ModelConfigArbiter mo228283b() {
            if (ModelConfigArbiter.f165063f != null) {
                ModelConfigArbiter kVar = ModelConfigArbiter.f165063f;
                if (kVar == null) {
                    Intrinsics.throwNpe();
                }
                return kVar;
            }
            throw new RuntimeException("Please initialize AlgorithmRepository first!");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo228282a(EffectConfig effectConfig) {
            Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
            ModelConfigArbiter.f165063f = new ModelConfigArbiter(effectConfig, null);
        }

        /* renamed from: b */
        public final ModelConfigArbiter mo228284b(EffectConfig effectConfig) {
            Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
            Companion aVar = this;
            if (!aVar.mo228285c()) {
                aVar.mo228282a(effectConfig);
            }
            return aVar.mo228283b();
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.k$e */
    public static final class C65544e extends BaseTask {

        /* renamed from: a */
        final /* synthetic */ ModelConfigArbiter f165078a;

        /* renamed from: b */
        final /* synthetic */ int f165079b;

        /* renamed from: c */
        final /* synthetic */ String f165080c;

        @Override // com.ss.ugc.effectplatform.task.BaseTask
        /* renamed from: f */
        public void mo228248f() {
            this.f165078a.mo228277a(this.f165079b, this.f165080c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65544e(ModelConfigArbiter kVar, int i, String str, String str2) {
            super(str2, null, 2, null);
            this.f165078a = kVar;
            this.f165079b = i;
            this.f165080c = str;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.k$d */
    public static final class C65543d extends BaseTask {

        /* renamed from: a */
        final /* synthetic */ ModelConfigArbiter f165076a;

        /* renamed from: b */
        final /* synthetic */ int f165077b;

        @Override // com.ss.ugc.effectplatform.task.BaseTask
        /* renamed from: f */
        public void mo228248f() {
            try {
                Result.Companion aVar = Result.Companion;
                Result.m271569constructorimpl(ModelConfigArbiter.m257006a(this.f165076a, this.f165077b, false, 2, null));
            } catch (Throwable th) {
                Result.Companion aVar2 = Result.Companion;
                Result.m271569constructorimpl(C69097g.m265890a(th));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65543d(ModelConfigArbiter kVar, int i, String str) {
            super(str, null, 2, null);
            this.f165076a = kVar;
            this.f165077b = i;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.task.k$c */
    public static final class RunnableC65542c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoadedModelList f165074a;

        /* renamed from: b */
        final /* synthetic */ ModelConfigArbiter f165075b;

        public void run() {
            AlgorithmModelInfoMemoryCache cVar = AlgorithmModelInfoMemoryCache.f164841a;
            LoadedModelList dVar = this.f165074a;
            ICache a = EffectCacheManager.f164822a.mo227691a(this.f165075b.f165067c.mo227548H());
            if (a != null) {
                cVar.mo227705a(dVar, (AlgorithmModelCache) a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.ugc.effectplatform.cache.AlgorithmModelCache");
        }

        RunnableC65542c(LoadedModelList dVar, ModelConfigArbiter kVar) {
            this.f165074a = dVar;
            this.f165075b = kVar;
        }
    }

    private ModelConfigArbiter(EffectConfig effectConfig) {
        this.f165067c = effectConfig;
        this.f165068h = new BuiltInResourceManager(effectConfig.mo227543C(), effectConfig.mo227545E());
        this.f165065a = new SharedMutableMap<>(true);
        this.f165066b = new SharedMutableMap<>(true);
        this.f165069i = new SharedMutableMap<>(true);
        this.f165070j = new SharedMutableMap<>(true);
    }

    public /* synthetic */ ModelConfigArbiter(EffectConfig effectConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(effectConfig);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.k$b */
    public static final class C65541b implements FetchModelListTask.Callback {

        /* renamed from: a */
        final /* synthetic */ ModelConfigArbiter f165071a;

        /* renamed from: b */
        final /* synthetic */ int f165072b;

        /* renamed from: c */
        final /* synthetic */ String f165073c;

        @Override // com.ss.ugc.effectplatform.task.FetchModelListTask.Callback
        /* renamed from: a */
        public void mo228275a(ServerConfig gVar, int i) {
            Intrinsics.checkParameterIsNotNull(gVar, "result");
            ModelConfigArbiter.f165064g.mo228281a().put(this.f165073c, gVar.mo227941a());
            this.f165071a.f165066b.remove(this.f165073c);
        }

        @Override // com.ss.ugc.effectplatform.task.FetchModelListTask.Callback
        /* renamed from: a */
        public void mo228276a(Exception exc, int i) {
            Intrinsics.checkParameterIsNotNull(exc, ApiHandler.API_CALLBACK_EXCEPTION);
            this.f165071a.f165065a.put(this.f165073c, exc);
            Logger.f5760a.mo8663a("FetchModelListTask", "fetch model list error happens!", exc);
            this.f165071a.f165066b.remove(this.f165073c);
        }

        C65541b(ModelConfigArbiter kVar, int i, String str) {
            this.f165071a = kVar;
            this.f165072b = i;
            this.f165073c = str;
        }
    }

    /* renamed from: b */
    public final LoadedModelList mo228280b(int i, boolean z) {
        TaskManager z2;
        LoadedModelList dVar = f165061d.get(C65545l.m257021a(i));
        if (dVar == null && z && (z2 = this.f165067c.mo227579z()) != null) {
            z2.mo228292a(new C65543d(this, i, TaskUtil.f165133a.mo228356a()));
        }
        return dVar;
    }

    /* renamed from: a */
    public final synchronized ModelInfo mo228277a(int i, String str) {
        ModelInfo modelInfo = null;
        if (str == null) {
            return null;
        }
        SharedMutableMap<String, ModelInfo> bVar = f165062e;
        ModelInfo modelInfo2 = bVar.get(str);
        if (modelInfo2 == null) {
            String str2 = str + '_' + i;
            SharedMutableMap<String, FetchModelInfoByNameTask> bVar2 = this.f165070j;
            FetchModelInfoByNameTask bVar3 = bVar2.get(str2);
            if (bVar3 == null) {
                bVar3 = new FetchModelInfoByNameTask(this.f165067c, str, i, null, null);
                bVar2.put(str2, bVar3);
            }
            SingleAlgorithmModelResponse c = bVar3.mo228257c();
            if (c != null) {
                modelInfo = c.getData();
            }
            if (modelInfo != null) {
                bVar.put(str, modelInfo);
            }
            this.f165070j.remove(str2);
            modelInfo2 = modelInfo;
        }
        return modelInfo2;
    }

    /* renamed from: a */
    public final synchronized LoadedModelList mo228279a(int i, boolean z) {
        String a;
        SharedMutableMap<String, LoadedModelList> bVar;
        a = C65545l.m257021a(i);
        bVar = f165061d;
        if (bVar.get(a) == null) {
            SharedMutableMap<String, Integer> bVar2 = this.f165069i;
            int i2 = bVar2.get(a);
            if (i2 == null) {
                i2 = 0;
                bVar2.put(a, 0);
            }
            int intValue = i2.intValue();
            if (z || intValue < this.f165067c.mo227568o()) {
                SharedMutableMap<String, FetchModelListTask> bVar3 = this.f165066b;
                FetchModelListTask iVar = bVar3.get(a);
                if (iVar == null) {
                    iVar = new FetchModelListTask(this.f165067c, this.f165068h, i, new C65541b(this, i, a));
                    bVar3.put(a, iVar);
                }
                this.f165069i.put(a, Integer.valueOf(intValue + 1));
                iVar.mo228274c();
                LoadedModelList dVar = bVar.get(a);
                if (dVar != null) {
                    new AsyncExecutor().execute(new RunnableC65542c(dVar, this));
                }
            }
            if (bVar.get(a) == null) {
                Exception exc = this.f165065a.get(a);
                if (exc != null) {
                    throw exc;
                }
                throw new RuntimeException("error happens when requireDecidedConfig");
            }
        }
        return bVar.get(a);
    }

    /* renamed from: a */
    public final ModelInfo mo228278a(int i, String str, boolean z) {
        TaskManager z2;
        if (str == null) {
            return null;
        }
        ModelInfo modelInfo = f165062e.get(str);
        if (modelInfo == null && z && (z2 = this.f165067c.mo227579z()) != null) {
            z2.mo228292a(new C65544e(this, i, str, TaskUtil.f165133a.mo228356a()));
        }
        return modelInfo;
    }

    /* renamed from: b */
    public static /* synthetic */ LoadedModelList m257007b(ModelConfigArbiter kVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return kVar.mo228280b(i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ LoadedModelList m257006a(ModelConfigArbiter kVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return kVar.mo228279a(i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ ModelInfo m257005a(ModelConfigArbiter kVar, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return kVar.mo228278a(i, str, z);
    }
}
