package com.ss.ugc.effectplatform.task;

import bytekn.foundation.concurrent.lock.AtomicBoolean;
import bytekn.foundation.concurrent.lock.Lock;
import bytekn.foundation.utils.Multimap;
import bytekn.foundation.utils.Stopwatch;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.algorithm.BuiltInResourceManager;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.ByteReadStream;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.bridge.network.NetRequest;
import com.ss.ugc.effectplatform.bridge.network.NetResponse;
import com.ss.ugc.effectplatform.listener.IModelDownloadEventListener;
import com.ss.ugc.effectplatform.model.ServerConfig;
import com.ss.ugc.effectplatform.model.TagInfo;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.net.DownloadableModelResponse;
import com.ss.ugc.effectplatform.p3242c.C65506c;
import com.ss.ugc.effectplatform.util.EffectRequestUtil;
import com.ss.ugc.effectplatform.util.NetworkUtils;
import com.ss.ugc.effectplatform.util.TextUtils;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchModelListTask;", "Lcom/ss/ugc/effectplatform/task/BaseTask;", "config", "Lcom/ss/ugc/effectplatform/EffectConfig;", "buildInAssetsManager", "Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;", "bid", "", "resultCallback", "Lcom/ss/ugc/effectplatform/task/FetchModelListTask$Callback;", "(Lcom/ss/ugc/effectplatform/EffectConfig;Lcom/ss/ugc/effectplatform/algorithm/BuiltInResourceManager;ILcom/ss/ugc/effectplatform/task/FetchModelListTask$Callback;)V", "hasStarted", "Lbytekn/foundation/concurrent/lock/AtomicBoolean;", "buildRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "execute", "", "onCancel", "parseResponse", "Lcom/ss/ugc/effectplatform/model/ServerConfig;", "responseString", "", "waitForCompletion", "Callback", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.i */
public final class FetchModelListTask extends BaseTask {

    /* renamed from: a */
    private final AtomicBoolean f165055a = new AtomicBoolean(false);

    /* renamed from: b */
    private final EffectConfig f165056b;

    /* renamed from: c */
    private final BuiltInResourceManager f165057c;

    /* renamed from: d */
    private final int f165058d;

    /* renamed from: e */
    private final Callback f165059e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/task/FetchModelListTask$Callback;", "", "onFail", "", ApiHandler.API_CALLBACK_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "bid", "", "onResult", "result", "Lcom/ss/ugc/effectplatform/model/ServerConfig;", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.ugc.effectplatform.task.i$a */
    public interface Callback {
        /* renamed from: a */
        void mo228275a(ServerConfig gVar, int i);

        /* renamed from: a */
        void mo228276a(Exception exc, int i);
    }

    /* renamed from: c */
    public final void mo228274c() {
        Lock gVar = C65540j.f165060a;
        gVar.mo8634a();
        try {
            if (!this.f165055a.mo8629a()) {
                mo8667b();
                this.f165055a.mo8628a(true);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            gVar.mo8635b();
        }
    }

    /* renamed from: d */
    private final NetRequest m257000d() {
        Integer num;
        Object obj;
        Object obj2;
        TagInfo tagInfo;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        String c = this.f165056b.mo227556c();
        String str = "";
        if (c == null) {
            c = str;
        }
        hashMap2.put("sdk_version", c);
        String h = this.f165056b.mo227561h();
        if (h != null) {
            str = h;
        }
        hashMap2.put("device_type", str);
        EffectConfig.ModelFileEnv F = this.f165056b.mo227546F();
        TagInfo tagInfo2 = null;
        if (F != null) {
            num = Integer.valueOf(F.ordinal());
        } else {
            num = null;
        }
        hashMap2.put(UpdateKey.STATUS, String.valueOf(num));
        int i = this.f165058d;
        if (i > 0) {
            hashMap2.put("busi_id", String.valueOf(i));
        }
        try {
            Result.Companion aVar = Result.Companion;
            obj = Result.m271569constructorimpl(this.f165057c.mo227721b("model/effect_local_config.json"));
        } catch (Throwable th) {
            Result.Companion aVar2 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        if (Result.m271575isFailureimpl(obj)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            try {
                Result.Companion aVar3 = Result.Companion;
                IJsonConverter q = this.f165056b.mo227570q();
                if (q != null) {
                    tagInfo = (TagInfo) q.mo227739a().mo207364a(str2, TagInfo.class);
                } else {
                    tagInfo = null;
                }
                obj2 = Result.m271569constructorimpl(tagInfo);
            } catch (Throwable th2) {
                Result.Companion aVar4 = Result.Companion;
                obj2 = Result.m271569constructorimpl(C69097g.m265890a(th2));
            }
            if (!Result.m271575isFailureimpl(obj2)) {
                tagInfo2 = obj2;
            }
            TagInfo tagInfo3 = tagInfo2;
            if (tagInfo3 != null) {
                hashMap2.put("tag", tagInfo3.getTag());
            }
        }
        hashMap.putAll(EffectRequestUtil.f165111a.mo228311a(this.f165056b));
        return new NetRequest(NetworkUtils.f165130a.mo228352a(hashMap2, Intrinsics.stringPlus(this.f165056b.mo227541A(), "/model/api/arithmetics")), HTTPMethod.GET, null, null, null, false, 60, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    public void mo228248f() {
        NetResponse eVar;
        ByteReadStream b;
        Stopwatch a = Stopwatch.f5766a.mo8676a();
        try {
            if (!mo228260g()) {
                NetRequest d = m257000d();
                INetworkClient a2 = this.f165056b.mo227571r().mo8625a();
                String str = null;
                if (a2 != null) {
                    eVar = a2.mo207366a(d);
                } else {
                    eVar = null;
                }
                if (!(eVar == null || (b = eVar.mo227747b()) == null)) {
                    str = C65506c.m256760a(b);
                }
                if (str != null) {
                    if (!TextUtils.f165135a.mo228357a(str)) {
                        ServerConfig a3 = m256999a(str);
                        if (a3 != null) {
                            Callback aVar = this.f165059e;
                            if (aVar != null) {
                                aVar.mo228275a(a3, this.f165058d);
                            }
                            IModelDownloadEventListener G = this.f165056b.mo227547G();
                            if (G != null) {
                                G.mo227762a(true, null, a.mo8675a(), this.f165056b.mo227556c());
                            }
                        } else {
                            Callback aVar2 = this.f165059e;
                            if (aVar2 != null) {
                                aVar2.mo228276a(new RuntimeException("result return null when parseResponse"), this.f165058d);
                            }
                        }
                    } else {
                        Callback aVar3 = this.f165059e;
                        if (aVar3 != null) {
                            aVar3.mo228276a(new RuntimeException("responseString is empty when convertToString"), this.f165058d);
                        }
                    }
                    if (str != null) {
                        return;
                    }
                }
                FetchModelListTask iVar = this;
                Callback aVar4 = iVar.f165059e;
                if (aVar4 != null) {
                    aVar4.mo228276a(new RuntimeException("responseString return null when convertToString"), iVar.f165058d);
                }
            }
        } catch (Exception e) {
            IModelDownloadEventListener G2 = this.f165056b.mo227547G();
            if (G2 != null) {
                G2.mo227762a(false, e.getMessage(), a.mo8675a(), this.f165056b.mo227556c());
            }
            Callback aVar5 = this.f165059e;
            if (aVar5 != null) {
                aVar5.mo228276a(e, this.f165058d);
            }
        }
    }

    /* renamed from: a */
    private final ServerConfig m256999a(String str) {
        Map<String, List<ModelInfo>> arithmetics;
        IJsonConverter q = this.f165056b.mo227570q();
        DownloadableModelResponse downloadableModelResponse = q != null ? (DownloadableModelResponse) q.mo227739a().mo207364a(str, DownloadableModelResponse.class) : null;
        if (downloadableModelResponse == null) {
            return null;
        }
        Multimap cVar = new Multimap();
        int status_code = downloadableModelResponse.getStatus_code();
        if (status_code == 0) {
            DownloadableModelResponse.Data data = downloadableModelResponse.getData();
            if (!(data == null || (arithmetics = data.getArithmetics()) == null)) {
                for (Map.Entry<String, List<ModelInfo>> entry : arithmetics.entrySet()) {
                    String key = entry.getKey();
                    entry.getValue();
                    List<ModelInfo> list = arithmetics.get(key);
                    if (list != null) {
                        for (ModelInfo modelInfo : list) {
                            cVar.mo8672a(key, modelInfo);
                        }
                    } else {
                        throw new IllegalStateException("modelInfo list is null".toString());
                    }
                }
                if (arithmetics != null) {
                    return new ServerConfig(cVar);
                }
            }
            throw new IllegalStateException("status_code == 0 but data == null, indicates there may be an internal server error");
        }
        throw new IllegalStateException("status code == " + status_code + " , indicates there is no model config from server, sdk version is " + this.f165056b.mo227556c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchModelListTask(EffectConfig effectConfig, BuiltInResourceManager fVar, int i, Callback aVar) {
        super(null, null, 2, null);
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(fVar, "buildInAssetsManager");
        this.f165056b = effectConfig;
        this.f165057c = fVar;
        this.f165058d = i;
        this.f165059e = aVar;
    }
}
