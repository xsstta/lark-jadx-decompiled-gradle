package com.ss.android.ugc.effectmanager.algorithm;

import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3052g.C60521g;
import com.ss.android.ugc.effectmanager.common.p3053h.C60531j;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.p3056a.AbstractC60559a;
import com.ss.android.ugc.effectmanager.effect.p3056a.C60560b;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3062a.C60597e;
import com.ss.android.ugc.effectmanager.effect.p3061d.p3063b.C60611a;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001cB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/effectmanager/algorithm/ModelEffectFetcher;", "Lcom/ss/android/ugc/effectmanager/effect/bridge/EffectFetcher;", "config", "Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;", "modelConfigArbiter", "Lcom/ss/android/ugc/effectmanager/algorithm/ModelConfigArbiter;", "modelCache", "Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;", "netWorker", "Lcom/ss/android/ugc/effectmanager/common/network/EffectNetWorkerWrapper;", "(Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;Lcom/ss/android/ugc/effectmanager/algorithm/ModelConfigArbiter;Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;Lcom/ss/android/ugc/effectmanager/common/network/EffectNetWorkerWrapper;)V", "getModelCache", "()Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;", "getModelConfigArbiter", "()Lcom/ss/android/ugc/effectmanager/algorithm/ModelConfigArbiter;", "modelFetcher", "Lcom/ss/android/ugc/effectmanager/algorithm/ModelFetcher;", "getModelFetcher", "()Lcom/ss/android/ugc/effectmanager/algorithm/ModelFetcher;", "fetchEffect", "Lcom/ss/android/ugc/effectmanager/common/task/SyncTask;", "Lcom/ss/android/ugc/effectmanager/effect/task/result/EffectTaskResult;", "arguments", "Lcom/ss/android/ugc/effectmanager/effect/bridge/EffectFetcherArguments;", "peekResourceNameArray", "", "", "(Lcom/ss/android/ugc/effectmanager/effect/bridge/EffectFetcherArguments;)[Ljava/lang/String;", "FetchModelAndEffectTask", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.a.e */
public class ModelEffectFetcher implements AbstractC60559a {
    public final DownloadableModelConfig config;
    private final IModelCache modelCache;
    private final C60471c modelConfigArbiter;
    private final ModelFetcher modelFetcher;
    private final C60515a netWorker;

    /* access modifiers changed from: protected */
    public String[] peekResourceNameArray(C60560b bVar) {
        return new String[0];
    }

    public final IModelCache getModelCache() {
        return this.modelCache;
    }

    public final C60471c getModelConfigArbiter() {
        return this.modelConfigArbiter;
    }

    public final ModelFetcher getModelFetcher() {
        return this.modelFetcher;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002J\u001e\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/effectmanager/algorithm/ModelEffectFetcher$FetchModelAndEffectTask;", "Lcom/ss/android/ugc/effectmanager/common/task/SyncTask;", "Lcom/ss/android/ugc/effectmanager/effect/task/result/EffectTaskResult;", "wrappedTask", "modelFetcher", "Lcom/ss/android/ugc/effectmanager/algorithm/ModelFetcher;", "arguments", "Lcom/ss/android/ugc/effectmanager/effect/bridge/EffectFetcherArguments;", "(Lcom/ss/android/ugc/effectmanager/algorithm/ModelEffectFetcher;Lcom/ss/android/ugc/effectmanager/common/task/SyncTask;Lcom/ss/android/ugc/effectmanager/algorithm/ModelFetcher;Lcom/ss/android/ugc/effectmanager/effect/bridge/EffectFetcherArguments;)V", "execute", "", "getListener", "Lcom/ss/android/ugc/effectmanager/common/task/SyncTaskListener;", "mobEffectDownloadFail", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.a.e$a */
    public final class FetchModelAndEffectTask extends C60521g<C60597e> {

        /* renamed from: a */
        final /* synthetic */ ModelEffectFetcher f151146a;

        /* renamed from: b */
        private final C60521g<C60597e> f151147b;

        /* renamed from: c */
        private final ModelFetcher f151148c;

        /* renamed from: d */
        private final C60560b f151149d;

        /* renamed from: c */
        private final AbstractC60522h<C60597e> m234978c() {
            return new C60480a(this);
        }

        @Override // com.ss.android.ugc.effectmanager.common.p3052g.C60521g
        /* renamed from: a */
        public void mo207047a() {
            Effect effect;
            String str;
            String str2;
            List<String> requirements_sec;
            try {
                mo207226a(this);
                C60560b bVar = this.f151149d;
                List list = null;
                if (bVar != null) {
                    effect = bVar.mo207377a();
                } else {
                    effect = null;
                }
                if (C60531j.m235270b(effect)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Effect Requirements Decrypt Failed, ");
                    sb.append("effect: ");
                    if (effect != null) {
                        str = effect.getEffect_id();
                    } else {
                        str = null;
                    }
                    sb.append(str);
                    sb.append(", name: ");
                    if (effect != null) {
                        str2 = effect.getName();
                    } else {
                        str2 = null;
                    }
                    sb.append(str2);
                    sb.append(", toDownloadRequirements: ");
                    if (!(effect == null || (requirements_sec = effect.getRequirements_sec()) == null)) {
                        list = CollectionsKt.toList(requirements_sec);
                    }
                    sb.append(list);
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
                    mo207228a((C60521g) this, new C60519c(illegalArgumentException));
                    m234977a(effect, illegalArgumentException);
                    return;
                }
                try {
                    this.f151148c.mo207059a(this.f151146a.peekResourceNameArray(this.f151149d));
                    C60521g<C60597e> gVar = this.f151147b;
                    if (gVar != null) {
                        gVar.mo207047a();
                    }
                } catch (Exception e) {
                    m234977a(effect, e);
                    throw e;
                }
            } catch (Exception e2) {
                mo207228a((C60521g) this, new C60519c(e2));
                mo207231b(this);
            } catch (Throwable th) {
                mo207231b(this);
                throw th;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J&\u0010\n\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"com/ss/android/ugc/effectmanager/algorithm/ModelEffectFetcher$FetchModelAndEffectTask$getListener$1", "Lcom/ss/android/ugc/effectmanager/common/task/SyncTaskListener;", "Lcom/ss/android/ugc/effectmanager/effect/task/result/EffectTaskResult;", "onFailed", "", "syncTask", "Lcom/ss/android/ugc/effectmanager/common/task/SyncTask;", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onFinally", "onProgress", "progress", "", "totalSize", "", "onResponse", "response", "onStart", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.effectmanager.a.e$a$a */
        public static final class C60480a implements AbstractC60522h<C60597e> {

            /* renamed from: a */
            final /* synthetic */ FetchModelAndEffectTask f151150a;

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: a */
            public void mo207048a(C60521g<C60597e> gVar) {
                Intrinsics.checkParameterIsNotNull(gVar, "syncTask");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C60480a(FetchModelAndEffectTask aVar) {
                this.f151150a = aVar;
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: b */
            public void mo207053b(C60521g<C60597e> gVar) {
                Intrinsics.checkParameterIsNotNull(gVar, "syncTask");
                FetchModelAndEffectTask aVar = this.f151150a;
                aVar.mo207231b(aVar);
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: a */
            public void mo207050a(C60521g<C60597e> gVar, C60519c cVar) {
                Intrinsics.checkParameterIsNotNull(gVar, "syncTask");
                Intrinsics.checkParameterIsNotNull(cVar, "e");
                FetchModelAndEffectTask aVar = this.f151150a;
                aVar.mo207228a((C60521g) aVar, cVar);
            }

            /* renamed from: a */
            public void mo207052a(C60521g<C60597e> gVar, C60597e eVar) {
                Intrinsics.checkParameterIsNotNull(gVar, "syncTask");
                Intrinsics.checkParameterIsNotNull(eVar, "response");
                FetchModelAndEffectTask aVar = this.f151150a;
                aVar.mo207229a(aVar, eVar);
            }

            @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60522h
            /* renamed from: a */
            public void mo207049a(C60521g<C60597e> gVar, int i, long j) {
                Intrinsics.checkParameterIsNotNull(gVar, "syncTask");
                this.f151150a.mo207227a(gVar, i, j);
            }
        }

        /* renamed from: a */
        private final void m234977a(Effect effect, Exception exc) {
            String effectId;
            AbstractC60511c n = this.f151146a.config.mo206985n();
            if (n != null) {
                C60532k a = C60532k.m235271a();
                String l = this.f151146a.config.mo206983l();
                String str = "";
                if (l == null) {
                    l = str;
                }
                C60532k a2 = a.mo207241a("app_id", l);
                String m = this.f151146a.config.mo206984m();
                if (m == null) {
                    m = str;
                }
                C60532k a3 = a2.mo207241a("access_key", m);
                if (!(effect == null || (effectId = effect.getEffectId()) == null)) {
                    str = effectId;
                }
                C60532k a4 = a3.mo207241a("effect_id", str).mo207239a("error_code", (Integer) 10018);
                n.mo207190a("effect_download_success_rate", 1, a4.mo207241a("error_msg", "download effect failed because of model fetcher failed! detail: " + exc.getMessage()).mo207239a("effect_platform_type", (Integer) 0).mo207243b());
            }
        }

        public FetchModelAndEffectTask(ModelEffectFetcher eVar, C60521g<C60597e> gVar, ModelFetcher fVar, C60560b bVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "modelFetcher");
            this.f151146a = eVar;
            this.f151147b = gVar;
            this.f151148c = fVar;
            this.f151149d = bVar;
            if (gVar != null) {
                gVar.mo207230a(m234978c());
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.p3056a.AbstractC60559a
    public C60521g<C60597e> fetchEffect(C60560b bVar) {
        return new FetchModelAndEffectTask(this, new C60611a(this.netWorker, this.config.mo206985n(), this.config.mo206983l(), this.config.mo206984m()).fetchEffect(bVar), this.modelFetcher, bVar);
    }

    public ModelEffectFetcher(DownloadableModelConfig downloadableModelConfig, C60471c cVar, IModelCache dVar, C60515a aVar) {
        Intrinsics.checkParameterIsNotNull(downloadableModelConfig, "config");
        Intrinsics.checkParameterIsNotNull(cVar, "modelConfigArbiter");
        Intrinsics.checkParameterIsNotNull(aVar, "netWorker");
        this.config = downloadableModelConfig;
        this.modelConfigArbiter = cVar;
        this.modelCache = dVar;
        this.netWorker = aVar;
        this.modelFetcher = new ModelFetcher(downloadableModelConfig, cVar, dVar, aVar);
    }
}
