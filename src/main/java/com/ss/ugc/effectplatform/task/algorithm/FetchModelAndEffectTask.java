package com.ss.ugc.effectplatform.task.algorithm;

import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager;
import com.ss.ugc.effectplatform.bridge.EffectFetcherArguments;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.LoadedModelList;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import com.ss.ugc.effectplatform.task.ModelConfigArbiter;
import com.ss.ugc.effectplatform.task.SyncTask;
import com.ss.ugc.effectplatform.task.SyncTaskListener;
import com.ss.ugc.effectplatform.task.result.EffectTaskResult;
import com.ss.ugc.effectplatform.util.AlgorithmUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'BA\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J;\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J2\u0010!\u001a\u00020 2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00102\u001a\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0010\u0018\u00010$J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/ugc/effectplatform/task/algorithm/FetchModelAndEffectTask;", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "wrappedTask", "arguments", "Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;", "modelConfigArbiter", "Lcom/ss/ugc/effectplatform/task/ModelConfigArbiter;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "config", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/task/SyncTask;Lcom/ss/ugc/effectplatform/bridge/EffectFetcherArguments;Lcom/ss/ugc/effectplatform/task/ModelConfigArbiter;Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;Lcom/ss/ugc/effectplatform/EffectConfig;)V", "collectLocalModelInfo", "", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "resourceNamesArray", "", "", "([Ljava/lang/String;)Ljava/util/List;", "collectNeedDownloadModelsListInternal", "Ljava/util/ArrayList;", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "Lkotlin/collections/ArrayList;", "businessId", "", "decidedConfig", "Lcom/ss/ugc/effectplatform/model/LoadedModelList;", "(I[Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/LoadedModelList;)Ljava/util/ArrayList;", "execute", "", "fetchModels", "requirements", "modelNames", "", "getListener", "Lcom/ss/ugc/effectplatform/task/SyncTaskListener;", "Companion", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.a.a */
public final class FetchModelAndEffectTask extends SyncTask<EffectTaskResult> {

    /* renamed from: a */
    public static final Companion f164985a = new Companion(null);

    /* renamed from: b */
    private final SyncTask<EffectTaskResult> f164986b;

    /* renamed from: c */
    private final EffectFetcherArguments f164987c;

    /* renamed from: d */
    private final ModelConfigArbiter f164988d;

    /* renamed from: e */
    private final BuiltInResourceManager f164989e;

    /* renamed from: f */
    private final AlgorithmModelCache f164990f;

    /* renamed from: g */
    private final EffectConfig f164991g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/ugc/effectplatform/task/algorithm/FetchModelAndEffectTask$Companion;", "", "()V", "STUB_EFFECT_NAME", "", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    private final SyncTaskListener<EffectTaskResult> m256926c() {
        return new C65523b(this);
    }

    @Override // com.ss.ugc.effectplatform.task.SyncTask
    /* renamed from: a */
    public void mo228250a() {
        try {
            mo228287a(this);
            EffectFetcherArguments bVar = this.f164987c;
            if (bVar != null) {
                m256925a(this, bVar, 0, 2, null);
            }
            SyncTask<EffectTaskResult> mVar = this.f164986b;
            if (mVar != null) {
                mVar.mo228250a();
            }
        } catch (Exception e) {
            mo228271a((SyncTask) this, new ExceptionResult(e));
            mo228290b(this);
        } catch (Throwable th) {
            mo228290b(this);
            throw th;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J&\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"com/ss/ugc/effectplatform/task/algorithm/FetchModelAndEffectTask$getListener$1", "Lcom/ss/ugc/effectplatform/task/SyncTaskListener;", "Lcom/ss/ugc/effectplatform/task/result/EffectTaskResult;", "onFailed", "", "syncTask", "Lcom/ss/ugc/effectplatform/task/SyncTask;", "e", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onFinally", "onProgress", "progress", "", "totalSize", "", "onResponse", "response", "onStart", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.a.a$b */
    public static final class C65523b implements SyncTaskListener<EffectTaskResult> {

        /* renamed from: a */
        final /* synthetic */ FetchModelAndEffectTask f164992a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65523b(FetchModelAndEffectTask aVar) {
            this.f164992a = aVar;
        }

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: a */
        public void mo228251a(SyncTask<EffectTaskResult> mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            this.f164992a.mo228287a(mVar);
        }

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: b */
        public void mo228256b(SyncTask<EffectTaskResult> mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            this.f164992a.mo228290b(mVar);
        }

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: a */
        public void mo228253a(SyncTask<EffectTaskResult> mVar, ExceptionResult cVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            Intrinsics.checkParameterIsNotNull(cVar, "e");
            this.f164992a.mo228271a((SyncTask) mVar, cVar);
        }

        /* renamed from: a */
        public void mo228255a(SyncTask<EffectTaskResult> mVar, EffectTaskResult aVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            Intrinsics.checkParameterIsNotNull(aVar, "response");
            this.f164992a.mo228273a(mVar, aVar);
        }

        @Override // com.ss.ugc.effectplatform.task.SyncTaskListener
        /* renamed from: a */
        public void mo228252a(SyncTask<EffectTaskResult> mVar, int i, long j) {
            Intrinsics.checkParameterIsNotNull(mVar, "syncTask");
            this.f164992a.mo228288a(mVar, i, j);
        }
    }

    /* renamed from: a */
    private final void m256924a(EffectFetcherArguments bVar, int i) {
        List list;
        Effect a = bVar.mo227733a();
        try {
            if (AlgorithmUtils.m257040a(a)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Effect Requirements Decrypt Failed, ");
                sb.append("effect: ");
                sb.append(a.getEffect_id());
                sb.append(", name: ");
                sb.append(a.getName());
                sb.append(", toDownloadRequirements: ");
                List<String> requirements_sec = a.getRequirements_sec();
                if (requirements_sec != null) {
                    list = CollectionsKt.toList(requirements_sec);
                } else {
                    list = null;
                }
                sb.append(list);
                throw new IllegalArgumentException(sb.toString());
            }
            new FetchModelTask(this.f164991g, this.f164988d, this.f164989e, this.f164990f, AlgorithmUtils.m257043b(bVar.mo227733a(), this.f164991g.mo227570q()), i, null, 64, null).mo8667b();
        } catch (Exception e) {
            IMonitorReport a2 = this.f164991g.mo227572s().mo8625a();
            if (a2 != null) {
                EffectConfig effectConfig = this.f164991g;
                String effect_id = a.getEffect_id();
                Map mapOf = MapsKt.mapOf(TuplesKt.to("error_code", 10018));
                C65510b.m256829c(a2, false, effectConfig, effect_id, mapOf, "download effect failed because of model fetcher failed! detail: " + e.getMessage());
            }
            throw e;
        }
    }

    /* renamed from: a */
    public final ArrayList<ModelInfo> mo228249a(int i, String[] strArr, LoadedModelList dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "decidedConfig");
        return new FetchModelTask(this.f164991g, this.f164988d, this.f164989e, this.f164990f, null, 0, null, SmEvents.EVENT_NE_RR, null).mo228258a(i, strArr, dVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m256925a(FetchModelAndEffectTask aVar, EffectFetcherArguments bVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        aVar.m256924a(bVar, i);
    }

    public FetchModelAndEffectTask(SyncTask<EffectTaskResult> mVar, EffectFetcherArguments bVar, ModelConfigArbiter kVar, BuiltInResourceManager fVar, AlgorithmModelCache aVar, EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(fVar, "buildInAssetsManager");
        Intrinsics.checkParameterIsNotNull(aVar, "algorithmModelCache");
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        this.f164986b = mVar;
        this.f164987c = bVar;
        this.f164988d = kVar;
        this.f164989e = fVar;
        this.f164990f = aVar;
        this.f164991g = effectConfig;
        if (mVar != null) {
            mVar.mo228289a(m256926c());
        }
    }
}
