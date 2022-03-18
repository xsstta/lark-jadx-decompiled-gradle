package com.ss.ugc.effectplatform.task.algorithm;

import bytekn.foundation.logger.Logger;
import com.huawei.updatesdk.service.otaupdate.UpdateDialogStatusCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IJsonConverter;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.bridge.network.INetworkClient;
import com.ss.ugc.effectplatform.bridge.network.NetRequest;
import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.ss.ugc.effectplatform.p3242c.C65506c;
import com.ss.ugc.effectplatform.task.BaseTask;
import com.ss.ugc.effectplatform.util.EffectRequestUtil;
import com.ss.ugc.effectplatform.util.NetworkUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/ugc/effectplatform/task/algorithm/FetchModelInfoByNameTask;", "Lcom/ss/ugc/effectplatform/task/BaseTask;", "config", "Lcom/ss/ugc/effectplatform/EffectConfig;", "modelName", "", "businessId", "", "bigVersion", "taskFlag", "(Lcom/ss/ugc/effectplatform/EffectConfig;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "buildEffectRequest", "Lcom/ss/ugc/effectplatform/bridge/network/NetRequest;", "execute", "", "onCancel", "onFail", "exceptionResult", "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "onSuccess", "response", "Lcom/ss/ugc/effectplatform/model/algorithm/SingleAlgorithmModelResponse;", "runDirectly", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.task.a.b */
public final class FetchModelInfoByNameTask extends BaseTask {

    /* renamed from: a */
    private final EffectConfig f164993a;

    /* renamed from: b */
    private final String f164994b;

    /* renamed from: c */
    private final int f164995c;

    /* renamed from: d */
    private final String f164996d;

    /* renamed from: e */
    private final String f164997e;

    /* renamed from: a */
    private final void m256935a(SingleAlgorithmModelResponse singleAlgorithmModelResponse) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ugc.effectplatform.task.BaseTask
    /* renamed from: f */
    public void mo228248f() {
        mo228257c();
    }

    /* renamed from: c */
    public final SingleAlgorithmModelResponse mo228257c() {
        boolean z;
        SingleAlgorithmModelResponse singleAlgorithmModelResponse;
        NetRequest d = m256937d();
        INetworkClient a = this.f164993a.mo227571r().mo8625a();
        if (a == null) {
            m256936a(new ExceptionResult(10011));
            return null;
        }
        try {
            String a2 = C65506c.m256760a(a.mo207366a(d).mo227747b());
            if (a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m256936a(new ExceptionResult((int) UpdateDialogStatusCode.SHOW));
                return null;
            }
            IJsonConverter q = this.f164993a.mo227570q();
            if (q != null) {
                singleAlgorithmModelResponse = (SingleAlgorithmModelResponse) q.mo227739a().mo207364a(a2, SingleAlgorithmModelResponse.class);
            } else {
                singleAlgorithmModelResponse = null;
            }
            if (singleAlgorithmModelResponse == null) {
                m256936a(new ExceptionResult(10008));
                return null;
            }
            m256935a(singleAlgorithmModelResponse);
            return singleAlgorithmModelResponse;
        } catch (Exception e) {
            Logger.f5760a.mo8663a("FetchModelInfoByNameTask", "fetch single model info failed!", e);
            m256936a(new ExceptionResult(e));
            return null;
        }
    }

    /* renamed from: d */
    private final NetRequest m256937d() {
        Integer num;
        Pair[] pairArr = new Pair[5];
        String c = this.f164993a.mo227556c();
        String str = "";
        if (c == null) {
            c = str;
        }
        pairArr[0] = TuplesKt.to("sdk_version", c);
        String h = this.f164993a.mo227561h();
        if (h != null) {
            str = h;
        }
        pairArr[1] = TuplesKt.to("device_type", str);
        pairArr[2] = TuplesKt.to("device_platform", "android");
        EffectConfig.ModelFileEnv F = this.f164993a.mo227546F();
        String str2 = null;
        if (F != null) {
            num = Integer.valueOf(F.ordinal());
        } else {
            num = null;
        }
        pairArr[3] = TuplesKt.to(UpdateKey.STATUS, String.valueOf(num));
        pairArr[4] = TuplesKt.to("name", this.f164994b);
        Map<String, String> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        int i = this.f164995c;
        if (i > 0) {
            mutableMapOf.put("busi_id", String.valueOf(i));
        }
        mutableMapOf.putAll(EffectRequestUtil.f165111a.mo228311a(this.f164993a));
        String str3 = this.f164996d;
        if (str3 != null) {
            if (true ^ StringsKt.isBlank(str3)) {
                str2 = str3;
            }
            if (str2 != null) {
                mutableMapOf.put("big_version", str2);
            }
        }
        String A = this.f164993a.mo227541A();
        return new NetRequest(NetworkUtils.f165130a.mo228352a(mutableMapOf, A + "/model/api/model"), HTTPMethod.GET, null, null, null, false, 60, null);
    }

    /* renamed from: a */
    private final void m256936a(ExceptionResult cVar) {
        Logger bVar = Logger.f5760a;
        Logger.m7508a(bVar, "FetchModelInfoByNameTask", "fetch single model info failed!, " + cVar.mo227911b(), null, 4, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchModelInfoByNameTask(EffectConfig effectConfig, String str, int i, String str2, String str3) {
        super(str3, effectConfig.mo227550J());
        Intrinsics.checkParameterIsNotNull(effectConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        this.f164993a = effectConfig;
        this.f164994b = str;
        this.f164995c = i;
        this.f164996d = str2;
        this.f164997e = str3;
    }
}
