package com.ss.ugc.effectplatform.task.algorithm;

import bytekn.foundation.concurrent.clock.DefaultClock;
import bytekn.foundation.concurrent.lock.Lock;
import bytekn.foundation.logger.Logger;
import bytekn.foundation.utils.Multimap;
import bytekn.foundation.utils.Stopwatch;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.algorithm.AlgorithmModelInfoMemoryCache;
import com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.cache.AlgorithmModelCache;
import com.ss.ugc.effectplatform.common.EffectConstants;
import com.ss.ugc.effectplatform.download.AlgorithmDownloader;
import com.ss.ugc.effectplatform.exception.NetException;
import com.ss.ugc.effectplatform.listener.IModelDownloadEventListener;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.LoadedModelList;
import com.ss.ugc.effectplatform.model.LocalModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.C65518b;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.monitor.IMonitorReport;
import com.ss.ugc.effectplatform.p3244e.C65510b;
import com.ss.ugc.effectplatform.task.BaseTask;
import com.ss.ugc.effectplatform.task.ModelConfigArbiter;
import com.ss.ugc.effectplatform.util.C65556s;
import com.ss.ugc.effectplatform.util.ModelNameProcessor;
import com.ss.ugc.effectplatform.util.NetStatusChecker;
import com.ss.ugc.effectplatform.util.TextUtils;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\u001aJA\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010 J;\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)H\u0002J*\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eH\u0002J\b\u0010/\u001a\u00020+H\u0014J\u001d\u00100\u001a\u00020+2\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0002\u00102J\u001a\u00103\u001a\u0004\u0018\u00010\u001d2\u0006\u00104\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\fH\u0002J\u001a\u00107\u001a\u00020\u00132\b\u00108\u001a\u0004\u0018\u00010\u00182\u0006\u00109\u001a\u00020\u001dH\u0002J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\fH\u0002J\b\u0010<\u001a\u00020+H\u0014J$\u0010=\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010'\u001a\u00020\u001d2\n\u0010>\u001a\u00060?j\u0002`@H\u0002J0\u0010A\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020&H\u0002J\u001c\u0010G\u001a\u00020+2\u0006\u0010'\u001a\u00020\u001d2\n\u0010>\u001a\u00060?j\u0002`@H\u0002J\u001a\u0010H\u001a\u00020-2\b\u0010I\u001a\u0004\u0018\u00010-2\u0006\u0010B\u001a\u00020\u001dH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lcom/ss/ugc/effectplatform/task/algorithm/FetchModelTask;", "Lcom/ss/ugc/effectplatform/task/BaseTask;", "config", "Lcom/ss/ugc/effectplatform/EffectConfig;", "modelConfigArbiter", "Lcom/ss/ugc/effectplatform/task/ModelConfigArbiter;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "algorithmModelCache", "Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;", "modelNames", "", "", "businessId", "", "taskFlag", "(Lcom/ss/ugc/effectplatform/EffectConfig;Lcom/ss/ugc/effectplatform/task/ModelConfigArbiter;Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;Lcom/ss/ugc/effectplatform/cache/AlgorithmModelCache;[Ljava/lang/String;ILjava/lang/String;)V", "[Ljava/lang/String;", "canFallbackToBuiltInResources", "", "effectBuiltInResourceNames", "([Ljava/lang/String;)Z", "collectLocalModelInfo", "", "Lcom/ss/ugc/effectplatform/model/LocalModelInfo;", "resourceNamesArray", "([Ljava/lang/String;)Ljava/util/List;", "collectNeedDownloadModelsList", "Ljava/util/ArrayList;", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "Lkotlin/collections/ArrayList;", "forceRequestIfNotExists", "(I[Ljava/lang/String;Z)Ljava/util/ArrayList;", "collectNeedDownloadModelsListInternal", "decidedConfig", "Lcom/ss/ugc/effectplatform/model/LoadedModelList;", "(I[Ljava/lang/String;Lcom/ss/ugc/effectplatform/model/LoadedModelList;)Ljava/util/ArrayList;", "downloadAndUpdateModel", "", "modelInfo", "modelType", "Lcom/ss/ugc/effectplatform/model/algorithm/FetchModelType;", "downloadAndUpdateModelList", "", "arguments", "Lcom/ss/ugc/effectplatform/model/Effect;", "res", "execute", "fetchModels", "modelNameArray", "([Ljava/lang/String;)V", "getLatestModelInfo", "normalizedName", "isExactBuiltInResource", "nameStr", "isModelNeedUpdate", "localModelInfo", "latestModelInfo", "normalizeResourceName", "resourceName", "onCancel", "onDownloadFailure", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDownloadSuccess", "info", "stopwatch", "Lbytekn/foundation/utils/Stopwatch;", "startTime", "downloadFileSize", "onFailOver", "parseEffect", "effect", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.a.c */
public final class FetchModelTask extends BaseTask {

    /* renamed from: a */
    private final EffectConfig f164998a;

    /* renamed from: b */
    private final ModelConfigArbiter f164999b;

    /* renamed from: c */
    private final BuiltInResourceManager f165000c;

    /* renamed from: d */
    private final AlgorithmModelCache f165001d;

    /* renamed from: e */
    private final String[] f165002e;

    /* renamed from: f */
    private final int f165003f;

    /* renamed from: g */
    private final String f165004g;

    /* renamed from: a */
    private final void m256949a(String[] strArr) {
        if (strArr != null) {
            Lock gVar = C65524d.f165005a;
            gVar.mo8634a();
            try {
                ArrayList<ModelInfo> a = m256944a(this.f165003f, strArr, true);
                if (a != null) {
                    m256947a((Effect) null, a);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception e) {
                Logger bVar = Logger.f5760a;
                bVar.mo8663a("effect_platform", "fetchModels: " + C69043h.m265786k(strArr) + " exception happens!", e);
                if (m256952b(strArr)) {
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    throw e;
                }
            } catch (Throwable th) {
                gVar.mo8635b();
                throw th;
            }
            gVar.mo8635b();
        }
    }

    /* renamed from: a */
    private final void m256948a(ModelInfo modelInfo, Exception exc) {
        Logger bVar = Logger.f5760a;
        Exception exc2 = exc;
        bVar.mo8663a("effect_platform", "model::" + modelInfo.getName() + ",info.getVersion() = " + modelInfo.getVersion() + ", size = " + String.valueOf(modelInfo.getType()) + " download failure", exc2);
        LocalModelInfo a = this.f165001d.mo227637a(modelInfo.getName());
        if (a == null) {
            throw exc2;
        } else if (a != null) {
            ModelNameProcessor nVar = ModelNameProcessor.f165128a;
            String c = a.mo227929c();
            if (c == null) {
                Intrinsics.throwNpe();
            }
            if (!nVar.mo228347a(c, modelInfo.getVersion())) {
                throw exc2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0134 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.ss.ugc.effectplatform.model.algorithm.ModelInfo> mo228258a(int r29, java.lang.String[] r30, com.ss.ugc.effectplatform.model.LoadedModelList r31) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.algorithm.FetchModelTask.mo228258a(int, java.lang.String[], com.ss.ugc.effectplatform.model.d):java.util.ArrayList");
    }

    /* renamed from: a */
    private final boolean m256950a(LocalModelInfo eVar, ModelInfo modelInfo) {
        if (eVar == null) {
            return true;
        }
        if (!TextUtils.f165135a.mo228358a(eVar.mo227929c(), modelInfo.getVersion())) {
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("effect_platform", "model " + eVar.mo227927b() + " version not equals, local model version:" + eVar.mo227929c() + ", lastest model: " + modelInfo.getVersion());
            return true;
        } else if (eVar.mo227931d() != modelInfo.getType()) {
            Logger bVar2 = Logger.f5760a;
            bVar2.mo8662a("effect_platform", "model " + eVar.mo227927b() + " size not equals, local model size:" + eVar.mo227931d() + ", lastest model: " + modelInfo.getType());
            return true;
        } else if (TextUtils.f165135a.mo228358a(eVar.mo227932e(), C65518b.m256861a(modelInfo))) {
            return false;
        } else {
            Logger bVar3 = Logger.f5760a;
            bVar3.mo8662a("effect_platform", "model " + eVar.mo227927b() + " md5 not equals, local model size:" + eVar.mo227932e() + ", lastest model: " + C65518b.m256861a(modelInfo));
            return true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    public void mo228248f() {
        m256949a(this.f165002e);
    }

    /* renamed from: a */
    private final String m256943a(String str) {
        return ModelNameProcessor.f165128a.mo228346a(str);
    }

    /* renamed from: b */
    private final boolean m256952b(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!m256951b(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m256951b(String str) {
        BuiltInResourceManager fVar = this.f165000c;
        boolean a = fVar.mo227720a(C65556s.m257124a("model") + str);
        if (a) {
            Logger bVar = Logger.f5760a;
            bVar.mo8662a("effect_platform", "model: " + str + " is built in resource");
        }
        return a;
    }

    /* renamed from: a */
    private final long m256940a(ModelInfo modelInfo, FetchModelType fetchModelType) {
        INetworkClient a = this.f164998a.mo227571r().mo8625a();
        if (a != null) {
            return new AlgorithmDownloader(this.f165001d, a).mo227763a(modelInfo, fetchModelType);
        }
        return 0;
    }

    /* renamed from: a */
    private final Effect m256941a(Effect effect, ModelInfo modelInfo) {
        if (effect != null) {
            return effect;
        }
        Effect effect2 = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, -1, 16383, null);
        effect2.setName(modelInfo.getName());
        return effect2;
    }

    /* renamed from: a */
    private final ModelInfo m256942a(String str, int i) {
        Multimap<String, LoadedModelList.ModelInfoState> a;
        try {
            ModelConfigArbiter kVar = this.f164999b;
            LoadedModelList a2 = kVar != null ? ModelConfigArbiter.m257006a(kVar, i, false, 2, null) : null;
            Collection<LoadedModelList.ModelInfoState> b = (a2 == null || (a = a2.mo227914a()) == null) ? null : a.mo8673b();
            if (b != null) {
                for (LoadedModelList.ModelInfoState aVar : b) {
                    if (Intrinsics.areEqual(aVar.mo227919b(), str)) {
                        return aVar.mo227918a();
                    }
                }
            }
        } catch (Exception e) {
            Logger.f5760a.mo8663a("effect_platform", "exception happens in getLatestModelInfo", e);
        }
        return null;
    }

    /* renamed from: a */
    private final void m256947a(Effect effect, ArrayList<ModelInfo> arrayList) {
        if (NetStatusChecker.f165129a.mo228351a(this.f164998a.mo227543C()) || !(!arrayList.isEmpty())) {
            Iterator<ModelInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                ModelInfo next = it.next();
                Logger bVar = Logger.f5760a;
                bVar.mo8662a("effect_platform", "download model: " + next.getName() + ", version: " + next.getVersion());
                Stopwatch a = Stopwatch.f5766a.mo8676a();
                try {
                    IModelDownloadEventListener G = this.f164998a.mo227547G();
                    if (G != null) {
                        Intrinsics.checkExpressionValueIsNotNull(next, "modelInfo");
                        G.mo227758a(m256941a(effect, next), next);
                    }
                    long b = DefaultClock.f5722a.mo8624b();
                    Intrinsics.checkExpressionValueIsNotNull(next, "modelInfo");
                    long a2 = m256940a(next, this.f164998a.mo227544D()) / ((long) EffectConstants.f164862a.mo227731a());
                    if (a2 > 0) {
                        m256945a(m256941a(effect, next), next, a, b, a2);
                    } else {
                        RuntimeException runtimeException = new RuntimeException("download model fail, downloadFileSize = " + a2);
                        m256946a(m256941a(effect, next), next, runtimeException);
                        m256948a(next, runtimeException);
                    }
                } catch (Exception e) {
                    Intrinsics.checkExpressionValueIsNotNull(next, "modelInfo");
                    m256946a(m256941a(effect, next), next, e);
                    m256948a(next, e);
                }
            }
            return;
        }
        Logger bVar2 = Logger.f5760a;
        Logger.m7508a(bVar2, "effect_platform", "download " + CollectionsKt.toList(arrayList) + " failed!, network unavailable!", null, 4, null);
        throw new NetException(10011, "network unavailable");
    }

    /* renamed from: a */
    private final ArrayList<ModelInfo> m256944a(int i, String[] strArr, boolean z) {
        LoadedModelList a;
        ModelConfigArbiter kVar = this.f164999b;
        if (kVar != null && (a = kVar.mo228279a(i, z)) != null) {
            return mo228258a(i, strArr, a);
        }
        throw new RuntimeException("model list with " + i + " not found!");
    }

    /* renamed from: a */
    private final void m256946a(Effect effect, ModelInfo modelInfo, Exception exc) {
        String str;
        List<String> url_list;
        ExceptionResult cVar = new ExceptionResult(exc);
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        String str2 = null;
        boolean z = true;
        if (!(file_url == null || (url_list = file_url.getUrl_list()) == null)) {
            if (!(!url_list.isEmpty())) {
                url_list = null;
            }
            if (url_list != null) {
                str2 = url_list.get(0);
            }
        }
        IMonitorReport a = this.f164998a.mo227572s().mo8625a();
        if (a != null) {
            EffectConfig effectConfig = this.f164998a;
            String name = modelInfo.getName();
            String fetchModelType = this.f164998a.mo227544D().toString();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("error_code", Integer.valueOf(cVar.mo227908a()));
            if (str2 == null) {
                str2 = "";
            }
            pairArr[1] = TuplesKt.to("download_url", str2);
            Map mapOf = MapsKt.mapOf(pairArr);
            String message = exc.getMessage();
            if (message != null && !StringsKt.isBlank(message)) {
                z = false;
            }
            if (z) {
                str = Reflection.getOrCreateKotlinClass(exc.getClass()).getQualifiedName();
            } else {
                str = exc.getMessage();
            }
            C65510b.m256825b(a, false, effectConfig, name, fetchModelType, mapOf, str);
        }
        IModelDownloadEventListener G = this.f164998a.mo227547G();
        if (G != null) {
            G.mo227760a(effect, modelInfo, exc);
        }
    }

    /* renamed from: a */
    private final void m256945a(Effect effect, ModelInfo modelInfo, Stopwatch eVar, long j, long j2) {
        Logger bVar = Logger.f5760a;
        bVar.mo8662a("effect_platform", "model::" + modelInfo.getName() + ",version = " + modelInfo.getVersion() + ",size = " + String.valueOf(modelInfo.getType()) + " download success!");
        modelInfo.setTotalSize(j2 / ((long) EffectConstants.f164862a.mo227731a()));
        long b = DefaultClock.f5722a.mo8624b() - j;
        IMonitorReport a = this.f164998a.mo227572s().mo8625a();
        if (a != null) {
            C65510b.m256826b(a, true, this.f164998a, modelInfo.getName(), this.f164998a.mo227544D().toString(), MapsKt.mapOf(TuplesKt.to("size", Long.valueOf(j2)), TuplesKt.to("duration", Long.valueOf(b))), null, 32, null);
        }
        IModelDownloadEventListener G = this.f164998a.mo227547G();
        if (G != null) {
            G.mo227759a(effect, modelInfo, eVar.mo8675a());
        }
        AlgorithmModelInfoMemoryCache.m256702a(modelInfo);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchModelTask(EffectConfig effectConfig, ModelConfigArbiter kVar, BuiltInResourceManager fVar, AlgorithmModelCache aVar, String[] strArr, int i, String str) {
        super(str, effectConfig.mo227550J());
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(fVar, "buildInAssetsManager");
        Intrinsics.checkParameterIsNotNull(aVar, "algorithmModelCache");
        this.f164998a = effectConfig;
        this.f164999b = kVar;
        this.f165000c = fVar;
        this.f165001d = aVar;
        this.f165002e = strArr;
        this.f165003f = i;
        this.f165004g = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FetchModelTask(com.ss.ugc.effectplatform.EffectConfig r11, com.ss.ugc.effectplatform.task.ModelConfigArbiter r12, com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager r13, com.ss.ugc.effectplatform.cache.AlgorithmModelCache r14, java.lang.String[] r15, int r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 16
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r0 = r1
            java.lang.String[] r0 = (java.lang.String[]) r0
            r7 = r0
            goto L_0x000b
        L_0x000a:
            r7 = r15
        L_0x000b:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r8 = 0
            goto L_0x0014
        L_0x0012:
            r8 = r16
        L_0x0014:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x001d
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            goto L_0x001f
        L_0x001d:
            r9 = r17
        L_0x001f:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.algorithm.FetchModelTask.<init>(com.ss.ugc.effectplatform.EffectConfig, com.ss.ugc.effectplatform.task.k, com.ss.ugc.effectplatform.algorithm.f, com.ss.ugc.effectplatform.a.a, java.lang.String[], int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
