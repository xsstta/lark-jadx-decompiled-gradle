package com.ss.ugc.effectplatform.algorithm;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.EffectFetcher;
import com.ss.ugc.effectplatform.bridge.EffectFetcherArguments;
import com.ss.ugc.effectplatform.bridge.EffectFetcherImpl;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.model.LoadedModelList;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.task.ModelConfigArbiter;
import com.ss.ugc.effectplatform.task.SyncTask;
import com.ss.ugc.effectplatform.task.algorithm.FetchModelAndEffectTask;
import com.ss.ugc.effectplatform.task.result.EffectTaskResult;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J2\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e2\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e\u0018\u00010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/ugc/effectplatform/algorithm/AlgorithmEffectFetcher;", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcher;", "algorithmConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "modelConfigArbiter", "Lcom/ss/ugc/effectplatform/task/ModelConfigArbiter;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "(Lcom/ss/ugc/effectplatform/EffectConfig;Lcom/ss/ugc/effectplatform/task/ModelConfigArbiter;Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;)V", "fetchModelTask", "Lcom/ss/ugc/effectplatform/task/algorithm/FetchModelAndEffectTask;", "collectLocalModelInfo", "", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "resourceNamesArray", "", "", "([Ljava/lang/String;)Ljava/util/List;", "collectNeedDownloadModelsListNonBlocking", "", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "effectBuiltInResourceNames", "bid", "", "([Ljava/lang/String;I)Ljava/util/Collection;", "fetchEffect", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "arguments", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "fetchModels", "", "requirements", "modelNames", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.algorithm.a */
public final class AlgorithmEffectFetcher implements EffectFetcher {

    /* renamed from: a */
    private final FetchModelAndEffectTask f164833a;

    /* renamed from: b */
    private final EffectConfig f164834b;

    /* renamed from: c */
    private final ModelConfigArbiter f164835c;

    /* renamed from: d */
    private final BuiltInResourceManager f164836d;

    /* renamed from: e */
    private final AlgorithmModelCache f164837e;

    @Override // com.ss.ugc.effectplatform.bridge.EffectFetcher
    /* renamed from: a */
    public SyncTask<EffectTaskResult> mo227702a(EffectFetcherArguments bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "arguments");
        return new FetchModelAndEffectTask(new EffectFetcherImpl(this.f164834b).mo227702a(bVar), bVar, this.f164835c, this.f164836d, this.f164837e, this.f164834b);
    }

    /* renamed from: a */
    public final Collection<ModelInfo> mo227703a(String[] strArr, int i) {
        ArrayList arrayList;
        LoadedModelList b = ModelConfigArbiter.m257007b(ModelConfigArbiter.f165064g.mo228283b(), i, false, 2, null);
        if (b == null) {
            return new ArrayList();
        }
        try {
            Result.Companion aVar = Result.Companion;
            arrayList = Result.m271569constructorimpl(this.f164833a.mo228249a(i, strArr, b));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            arrayList = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        ArrayList arrayList2 = new ArrayList();
        if (Result.m271575isFailureimpl(arrayList)) {
            arrayList = arrayList2;
        }
        return (Collection) arrayList;
    }

    public AlgorithmEffectFetcher(EffectConfig effectConfig, ModelConfigArbiter kVar, BuiltInResourceManager fVar, AlgorithmModelCache aVar) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "algorithmConfig");
        Intrinsics.checkParameterIsNotNull(fVar, "buildInAssetsManager");
        Intrinsics.checkParameterIsNotNull(aVar, "algorithmModelCache");
        this.f164834b = effectConfig;
        this.f164835c = kVar;
        this.f164836d = fVar;
        this.f164837e = aVar;
        this.f164833a = new FetchModelAndEffectTask(null, null, kVar, fVar, aVar, effectConfig);
    }

    /* renamed from: a */
    public static /* synthetic */ Collection m256698a(AlgorithmEffectFetcher aVar, String[] strArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return aVar.mo227703a(strArr, i);
    }
}
