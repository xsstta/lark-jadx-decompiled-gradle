package com.ss.android.ugc.effectmanager.algorithm;

import android.os.Message;
import android.text.TextUtils;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.ss.android.ugc.effectmanager.AlgorithmModelInfoMemoryCache;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.C60628g;
import com.ss.android.ugc.effectmanager.C60629h;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.FetchModelType;
import com.ss.android.ugc.effectmanager.ModelEventListener;
import com.ss.android.ugc.effectmanager.common.C60512d;
import com.ss.android.ugc.effectmanager.common.EffectConstants;
import com.ss.android.ugc.effectmanager.common.HandlerC60543j;
import com.ss.android.ugc.effectmanager.common.cache.IModelCache;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.monitor.EPMonitor;
import com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60511c;
import com.ss.android.ugc.effectmanager.common.p3051f.C60515a;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60525c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60532k;
import com.ss.android.ugc.effectmanager.download.IModelDownloader;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.C60633c;
import com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.ugc.effectplatform.listener.IEffectPlatformBaseListener;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.tt.frontendapiinterface.ApiHandler;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 a2\u00020\u0001:\u0001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001b\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0002\u0010\"J3\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010+J;\u0010,\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010-\u001a\u00020.2\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010/J#\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\u00101J\b\u00102\u001a\u000203H\u0002J8\u00104\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001e052\b\u00106\u001a\u0004\u0018\u0001072\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J@\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010!2\u0006\u0010&\u001a\u00020'2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010=\u001a\u00020\u001e2\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?J\u001b\u0010A\u001a\u00020:2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 ¢\u0006\u0002\u0010BJ!\u0010A\u001a\u00020:2\u0006\u0010&\u001a\u00020'2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0002\u0010CJ-\u0010A\u001a\u00020:2\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\u0006\u0010F\u001a\u00020!H\u0002J\u001a\u0010G\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\u0006\u0010;\u001a\u00020!H\u0002J\u001a\u0010H\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\u0006\u0010;\u001a\u00020!H\u0002J\u0012\u0010I\u001a\u00020:2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J$\u0010L\u001a\u00020\u001e2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\u0010\u0010P\u001a\u00020!2\u0006\u0010Q\u001a\u00020!H\u0002J.\u0010R\u001a\u00020:2\u0006\u00106\u001a\u0002072\u0006\u0010S\u001a\u00020%2\n\u0010T\u001a\u00060Uj\u0002`V2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J0\u0010W\u001a\u00020:2\u0006\u00106\u001a\u0002072\u0006\u0010S\u001a\u00020%2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020[H\u0002J\u0018\u0010]\u001a\u00020:2\u0006\u0010S\u001a\u00020%2\u0006\u0010^\u001a\u00020_H\u0002J\u001a\u0010`\u001a\u0002072\b\u00106\u001a\u0004\u0018\u0001072\u0006\u0010S\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Lcom/ss/android/ugc/effectmanager/algorithm/ModelFetcher;", "Lcom/ss/android/ugc/effectmanager/common/WeakHandler$IHandler;", "config", "Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;", "modelConfigArbiter", "Lcom/ss/android/ugc/effectmanager/algorithm/ModelConfigArbiter;", "modelCache", "Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;", "netWorker", "Lcom/ss/android/ugc/effectmanager/common/network/EffectNetWorkerWrapper;", "(Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;Lcom/ss/android/ugc/effectmanager/algorithm/ModelConfigArbiter;Lcom/ss/android/ugc/effectmanager/common/cache/IModelCache;Lcom/ss/android/ugc/effectmanager/common/network/EffectNetWorkerWrapper;)V", "eventListener", "Lcom/ss/android/ugc/effectmanager/ModelEventListener;", "getEventListener", "()Lcom/ss/android/ugc/effectmanager/ModelEventListener;", "handler", "Lcom/ss/android/ugc/effectmanager/common/WeakHandler;", "getHandler", "()Lcom/ss/android/ugc/effectmanager/common/WeakHandler;", "modelDownloader", "Lcom/ss/android/ugc/effectmanager/download/IModelDownloader;", "getModelDownloader", "()Lcom/ss/android/ugc/effectmanager/download/IModelDownloader;", "setModelDownloader", "(Lcom/ss/android/ugc/effectmanager/download/IModelDownloader;)V", "monitorService", "Lcom/ss/android/ugc/effectmanager/common/listener/IMonitorService;", "getMonitorService", "()Lcom/ss/android/ugc/effectmanager/common/listener/IMonitorService;", "canFallbackToBuiltInResources", "", "resourceNames", "", "", "([Ljava/lang/String;)Z", "collectNeedDownloadModelsList", "", "Lcom/ss/android/ugc/effectmanager/model/ModelInfo;", "businessId", "", "resourceNamesArray", "monitorTrace", "Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;", "(I[Ljava/lang/String;Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;)Ljava/util/Collection;", "collectNeedDownloadModelsListInternal", "decidedConfig", "Lcom/ss/android/ugc/effectmanager/LoadedModelList;", "(I[Ljava/lang/String;Lcom/ss/android/ugc/effectmanager/LoadedModelList;Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;)Ljava/util/Collection;", "collectNeedDownloadModelsListNonBlocking", "([Ljava/lang/String;)Ljava/util/Collection;", "createEffectTaskManager", "Lcom/ss/android/ugc/effectmanager/common/TaskManager;", "downloadAndUpdateModelList", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "modelInfos", "fetchModelByNameDirectlyFromServer", "", "modelName", "bigVersion", "downloadModelAfterFetch", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "fetchModels", "([Ljava/lang/String;)V", "(I[Ljava/lang/String;)V", "(I[Ljava/lang/String;Lcom/ss/android/ugc/effectmanager/common/monitor/MonitorTrace;)V", "getLatestModelInfo", "normalizedName", "getSingleModelInfo", "getSingleModelInfoNonBlocking", "handleMsg", "msg", "Landroid/os/Message;", "isModelNeedUpdate", "localModelInfo", "Lcom/ss/android/ugc/effectmanager/model/LocalModelInfo;", "latestModelInfo", "normalizeResourceName", "resourceName", "onDownloadFailure", "info", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "onDownloadSuccess", "stopwatch", "Lcom/ss/android/ugc/effectmanager/algorithm/Stopwatch;", "startTime", "", "downloadFileSize", "onFailOver", "e", "Ljava/lang/RuntimeException;", "parseEffect", "Companion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.a.f */
public final class ModelFetcher implements HandlerC60543j.AbstractC60544a {

    /* renamed from: a */
    public static final Companion f151151a = new Companion(null);

    /* renamed from: b */
    private final ModelEventListener f151152b;

    /* renamed from: c */
    private final AbstractC60511c f151153c;

    /* renamed from: d */
    private IModelDownloader f151154d;

    /* renamed from: e */
    private final HandlerC60543j f151155e = new HandlerC60543j(this);

    /* renamed from: f */
    private final DownloadableModelConfig f151156f;

    /* renamed from: g */
    private final C60471c f151157g;

    /* renamed from: h */
    private final IModelCache f151158h;

    /* renamed from: i */
    private final C60515a f151159i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/effectmanager/algorithm/ModelFetcher$Companion;", "", "()V", "TAG", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.a.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo207057a(int i, String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "resourceNames");
        m234994b(i, strArr, new MonitorTrace(strArr.toString()));
    }

    /* renamed from: a */
    public final Map<String, Boolean> mo207056a(Effect effect, Collection<ModelInfo> collection, MonitorTrace bVar) {
        long j;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (collection != null) {
            for (ModelInfo modelInfo : collection) {
                C60482i a = C60482i.m235012a();
                try {
                    ModelEventListener iVar = this.f151152b;
                    if (iVar != null) {
                        iVar.mo208063a(m234986a(effect, modelInfo), modelInfo);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    EPMonitor.m235192a(bVar, "download start:" + modelInfo);
                    EPLog.m235179b("ModelFetcher", "fetchModels, model: " + modelInfo.getName() + ", version: " + modelInfo.getVersion() + " download start!");
                    IModelDownloader aVar = this.f151154d;
                    if (aVar != null) {
                        FetchModelType o = this.f151156f.mo206986o();
                        Intrinsics.checkExpressionValueIsNotNull(o, "config.modelType");
                        j = aVar.mo207042a(modelInfo, o, bVar);
                    } else {
                        j = 0;
                    }
                    if (j > 0) {
                        EPMonitor.m235192a(bVar, "download success:" + modelInfo);
                        EPMonitor.m235193b(bVar);
                        Effect a2 = m234986a(effect, modelInfo);
                        Intrinsics.checkExpressionValueIsNotNull(a, "stopwatch");
                        m234989a(a2, modelInfo, a, currentTimeMillis, j);
                        EPLog.m235179b("ModelFetcher", "model::" + modelInfo.getName() + ",version = " + modelInfo.getVersion() + ",size = " + modelInfo.getType() + " download success!");
                        linkedHashMap.put(modelInfo.getName(), true);
                    } else {
                        EPMonitor.m235192a(bVar, "download failed:" + modelInfo);
                        EPMonitor.m235193b(bVar);
                        RuntimeException runtimeException = new RuntimeException("download model fail, downloadFileSize = " + j);
                        m234990a(m234986a(effect, modelInfo), modelInfo, runtimeException, bVar);
                        EPLog.m235179b("ModelFetcher", "model::" + modelInfo.getName() + ",info.getVersion() = " + modelInfo.getVersion() + ", size = " + modelInfo.getType() + " download failure");
                        m234991a(modelInfo, runtimeException);
                        linkedHashMap.put(modelInfo.getName(), false);
                    }
                } catch (RuntimeException e) {
                    EPMonitor.m235192a(bVar, "downloadAndUpdateModelList exception occurred: cause = " + e.getMessage());
                    EPMonitor.m235193b(bVar);
                    m234990a(m234986a(effect, modelInfo), modelInfo, e, bVar);
                    m234991a(modelInfo, e);
                    linkedHashMap.put(modelInfo.getName(), false);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.effectmanager.common.HandlerC60543j.AbstractC60544a
    /* renamed from: a */
    public void mo207058a(Message message) {
        IEffectPlatformBaseListener E;
        if (message != null && message.what == 70 && (message.obj instanceof FetchSingleAlgorithmModelTaskResult)) {
            Object obj = message.obj;
            if (obj != null) {
                FetchSingleAlgorithmModelTaskResult bVar = (FetchSingleAlgorithmModelTaskResult) obj;
                C60549e p = this.f151156f.mo206987p();
                Intrinsics.checkExpressionValueIsNotNull(p, "config.effectConfiguration");
                C60628g w = p.mo207338w();
                if (w != null && (E = w.mo208024E(bVar.mo207215a())) != null) {
                    C60519c c = bVar.mo208105c();
                    SingleAlgorithmModelResponse b = bVar.mo208104b();
                    if (c != null) {
                        E.mo207371a(null, new ExceptionResult(c.mo207221c(), c.mo207220b()));
                    } else if (b == null) {
                        E.mo207371a(null, new ExceptionResult((int) UpdateDialogStatusCode.SHOW));
                    } else {
                        E.mo207370a(b.getData());
                    }
                    C60549e p2 = this.f151156f.mo206987p();
                    Intrinsics.checkExpressionValueIsNotNull(p2, "config.effectConfiguration");
                    C60628g w2 = p2.mo207338w();
                    if (w2 != null) {
                        w2.mo208025F(bVar.mo207215a());
                        return;
                    }
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult");
        }
    }

    /* renamed from: a */
    public final void mo207059a(String[] strArr) {
        if (strArr != null) {
            mo207057a(0, strArr);
        }
    }

    /* renamed from: a */
    private final String m234988a(String str) {
        String a = C60512d.m235165a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "ModelNameProcessor.getNameOfModel(resourceName)");
        return a;
    }

    /* renamed from: b */
    private final boolean m234995b(String[] strArr) {
        for (String str : strArr) {
            IModelCache dVar = this.f151158h;
            if (dVar == null || !dVar.mo207019a(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private final ModelInfo m234993b(int i, String str) {
        return this.f151157g.mo207026a(i, str);
    }

    /* renamed from: c */
    private final ModelInfo m234996c(int i, String str) {
        return this.f151157g.mo207029b(i, str);
    }

    /* renamed from: a */
    private final Effect m234986a(Effect effect, ModelInfo modelInfo) {
        if (effect != null) {
            return effect;
        }
        Effect effect2 = new Effect(null, 1, null);
        effect2.setName(modelInfo.getName());
        return effect2;
    }

    /* renamed from: a */
    private final ModelInfo m234987a(int i, String str) {
        C60629h b = this.f151157g.mo207028b(i);
        Intrinsics.checkExpressionValueIsNotNull(b, "modelConfigArbiter.requi…DecidedConfig(businessId)");
        for (C60629h.C60630a aVar : b.f151627a.mo207200b()) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "state");
            if (Intrinsics.areEqual(aVar.mo208058a(), str)) {
                return aVar.mo208059b();
            }
        }
        return null;
    }

    /* renamed from: a */
    private final void m234991a(ModelInfo modelInfo, RuntimeException runtimeException) {
        C60633c a;
        IModelCache dVar = this.f151158h;
        if (dVar == null || (a = dVar.mo207017a(modelInfo.getName(), null)) == null) {
            throw runtimeException;
        } else if (a != null && !C60512d.m235166a(a.mo208109b(), modelInfo.getVersion())) {
            throw runtimeException;
        }
    }

    /* renamed from: b */
    private final synchronized void m234994b(int i, String[] strArr, MonitorTrace bVar) {
        try {
            mo207056a((Effect) null, mo207054a(i, strArr, bVar), bVar);
        } catch (RuntimeException e) {
            if (!m234995b(strArr)) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    private final boolean m234992a(C60633c cVar, ModelInfo modelInfo, MonitorTrace bVar) {
        boolean z;
        if (cVar == null) {
            return true;
        }
        if (!TextUtils.equals(cVar.mo208109b(), modelInfo.getVersion())) {
            EPLog.m235179b("ModelFetcher", "model " + cVar.mo208106a() + " version not equals, local model version:" + cVar.mo208109b() + ", lastest model: " + modelInfo.getVersion());
            StringBuilder sb = new StringBuilder();
            sb.append("version changed [");
            sb.append(cVar.mo208109b());
            sb.append(" → ");
            sb.append(modelInfo.getVersion());
            sb.append("], Need update!");
            EPMonitor.m235192a(bVar, sb.toString());
            return true;
        }
        if (cVar.mo208113d() == modelInfo.getType()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            EPLog.m235179b("ModelFetcher", "model " + cVar.mo208106a() + " size not equals, local model type:" + cVar.mo208113d() + ", lastest model: " + modelInfo.getType());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("size changed [");
            sb2.append(cVar.mo208113d());
            sb2.append(" → ");
            sb2.append(modelInfo.getType());
            sb2.append("], Need update!");
            EPMonitor.m235192a(bVar, sb2.toString());
            return true;
        } else if (TextUtils.equals(cVar.mo208115e(), modelInfo.getMD5())) {
            return false;
        } else {
            EPLog.m235179b("ModelFetcher", "model " + cVar.mo208106a() + " md5 not equals, local model type:" + cVar.mo208115e() + ", lastest model: " + modelInfo.getMD5());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("md5 changed [");
            sb3.append(cVar.mo208115e());
            sb3.append(" → ");
            sb3.append(modelInfo.getMD5());
            sb3.append("], Need update!");
            EPMonitor.m235192a(bVar, sb3.toString());
            return true;
        }
    }

    /* renamed from: a */
    public final Collection<ModelInfo> mo207054a(int i, String[] strArr, MonitorTrace bVar) {
        Intrinsics.checkParameterIsNotNull(strArr, "resourceNamesArray");
        C60629h b = this.f151157g.mo207028b(i);
        Intrinsics.checkExpressionValueIsNotNull(b, "modelConfigArbiter.requi…DecidedConfig(businessId)");
        return mo207055a(i, strArr, b, bVar);
    }

    public ModelFetcher(DownloadableModelConfig downloadableModelConfig, C60471c cVar, IModelCache dVar, C60515a aVar) {
        Intrinsics.checkParameterIsNotNull(downloadableModelConfig, "config");
        Intrinsics.checkParameterIsNotNull(cVar, "modelConfigArbiter");
        Intrinsics.checkParameterIsNotNull(aVar, "netWorker");
        this.f151156f = downloadableModelConfig;
        this.f151157g = cVar;
        this.f151158h = dVar;
        this.f151159i = aVar;
        this.f151152b = downloadableModelConfig.mo206982k();
        this.f151153c = downloadableModelConfig.mo206985n();
        this.f151154d = new C60479d((C60468b) dVar, aVar);
    }

    /* renamed from: a */
    private final void m234990a(Effect effect, ModelInfo modelInfo, Exception exc, MonitorTrace bVar) {
        String str;
        List<String> list;
        List<String> list2;
        List<String> url_list;
        C60519c cVar = new C60519c(exc);
        String str2 = null;
        String str3 = null;
        if (modelInfo.getFile_url() != null) {
            ExtendedUrlModel file_url = modelInfo.getFile_url();
            if (file_url != null) {
                list2 = file_url.getUrl_list();
            } else {
                list2 = null;
            }
            if (!C60525c.m235234a((List) list2)) {
                ExtendedUrlModel file_url2 = modelInfo.getFile_url();
                if (!(file_url2 == null || (url_list = file_url2.getUrl_list()) == null)) {
                    str2 = url_list.get(0);
                }
                str3 = str2;
            }
        }
        try {
            InetAddress byName = InetAddress.getByName(new URL(str3).getHost());
            Intrinsics.checkExpressionValueIsNotNull(byName, "InetAddress.getByName(urlHost.host)");
            str = byName.getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
            str = "";
        }
        AbstractC60511c cVar2 = this.f151153c;
        if (cVar2 != null) {
            C60532k a = C60532k.m235271a().mo207241a("app_id", this.f151156f.mo206983l()).mo207241a("access_key", this.f151156f.mo206984m()).mo207241a("resource_name", modelInfo.getName()).mo207241a("resource_type", this.f151156f.mo206986o().toString()).mo207241a("error_msg", exc.getMessage()).mo207239a("error_code", Integer.valueOf(cVar.mo207221c())).mo207241a("download_url", str3).mo207241a("host_ip", str);
            if (bVar == null || (list = bVar.mo207201a()) == null) {
                list = CollectionsKt.emptyList();
            }
            cVar2.mo207190a("resource_download_success_rate", 1, a.mo207242a("monitor_trace", list).mo207243b());
        }
        ModelEventListener iVar = this.f151152b;
        if (iVar != null) {
            iVar.mo208065a(effect, modelInfo, exc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<com.ss.android.ugc.effectmanager.model.ModelInfo> mo207055a(int r17, java.lang.String[] r18, com.ss.android.ugc.effectmanager.C60629h r19, com.ss.android.ugc.effectmanager.common.monitor.MonitorTrace r20) {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.ModelFetcher.mo207055a(int, java.lang.String[], com.ss.android.ugc.effectmanager.h, com.ss.android.ugc.effectmanager.common.e.b):java.util.Collection");
    }

    /* renamed from: a */
    private final void m234989a(Effect effect, ModelInfo modelInfo, C60482i iVar, long j, long j2) {
        String str;
        long j3 = j2 / ((long) EffectConstants.f151228a);
        modelInfo.setTotalSize(j3);
        AlgorithmModelInfoMemoryCache.m234942a(modelInfo);
        long currentTimeMillis = System.currentTimeMillis() - j;
        AbstractC60511c cVar = this.f151153c;
        if (cVar != null) {
            C60532k a = C60532k.m235271a().mo207241a("app_id", this.f151156f.mo206983l()).mo207241a("access_key", this.f151156f.mo206984m()).mo207240a("duration", Long.valueOf(currentTimeMillis));
            if (modelInfo == null) {
                str = "";
            } else {
                str = modelInfo.getName();
            }
            cVar.mo207190a("resource_download_success_rate", 0, a.mo207241a("resource_name", str).mo207241a("resource_type", this.f151156f.mo206986o().toString()).mo207240a("size", Long.valueOf(j3)).mo207243b());
        }
        ModelEventListener iVar2 = this.f151152b;
        if (iVar2 != null) {
            iVar2.mo208064a(effect, modelInfo, iVar.mo207065b());
        }
    }
}
