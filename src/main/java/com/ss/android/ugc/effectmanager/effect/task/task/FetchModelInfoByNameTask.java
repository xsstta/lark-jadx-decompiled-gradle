package com.ss.android.ugc.effectmanager.effect.task.task;

import android.os.Message;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.ugc.effectmanager.C60549e;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.common.C60499b;
import com.ss.android.ugc.effectmanager.common.HandlerC60543j;
import com.ss.android.ugc.effectmanager.common.p3052g.C60519c;
import com.ss.android.ugc.effectmanager.common.p3053h.C60537p;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import com.ss.android.ugc.effectmanager.model.FetchSingleAlgorithmModelTaskResult;
import com.ss.android.ugc.effectmanager.p3065f.p3066a.p3067a.C60627a;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/task/task/FetchModelInfoByNameTask;", "Lcom/ss/android/ugc/effectmanager/common/task/NormalTask;", "Lcom/ss/android/ugc/effectmanager/common/WeakHandler$IHandler;", "config", "Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;", "modelName", "", "businessId", "", "bigVersion", "taskFlag", "weakHandler", "Lcom/ss/android/ugc/effectmanager/common/WeakHandler;", "(Lcom/ss/android/ugc/effectmanager/DownloadableModelConfig;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/ss/android/ugc/effectmanager/common/WeakHandler;)V", "buildEffectRequest", "Lcom/ss/android/ugc/effectmanager/common/EffectRequest;", "execute", "", "handleMsg", "msg", "Landroid/os/Message;", "onFail", "exceptionResult", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onSuccess", "response", "Lcom/ss/ugc/effectplatform/model/algorithm/SingleAlgorithmModelResponse;", "runDirectly", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.b */
public final class FetchModelInfoByNameTask extends NormalTask implements HandlerC60543j.AbstractC60544a {

    /* renamed from: a */
    private final DownloadableModelConfig f151590a;

    /* renamed from: b */
    private final String f151591b;

    /* renamed from: c */
    private final int f151592c;

    /* renamed from: d */
    private final String f151593d;

    /* renamed from: e */
    private final String f151594e;

    /* renamed from: f */
    private final HandlerC60543j f151595f;

    @Override // com.ss.android.ugc.effectmanager.common.HandlerC60543j.AbstractC60544a
    /* renamed from: a */
    public void mo207058a(Message message) {
    }

    @Override // com.ss.android.ugc.effectmanager.common.p3052g.AbstractC60520e
    /* renamed from: a */
    public void mo207037a() {
        mo207469c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        kotlin.io.C69101b.m265907a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        throw r3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse mo207469c() {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.task.task.FetchModelInfoByNameTask.mo207469c():com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse");
    }

    /* renamed from: d */
    private final C60499b m235542d() {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("sdk_version", this.f151590a.mo206980i()), TuplesKt.to("device_type", this.f151590a.mo206979h()), TuplesKt.to("device_platform", "android"), TuplesKt.to(UpdateKey.STATUS, String.valueOf(this.f151590a.mo206972a().ordinal())), TuplesKt.to("name", this.f151591b));
        int i = this.f151592c;
        if (i > 0) {
            mutableMapOf.put("busi_id", String.valueOf(i));
        }
        C60549e p = this.f151590a.mo206987p();
        if (p != null) {
            mutableMapOf.putAll(EffectRequestUtil.f151340a.mo207238a(p));
        }
        String str = this.f151593d;
        if (str != null) {
            if (!(true ^ StringsKt.isBlank(str))) {
                str = null;
            }
            if (str != null) {
                mutableMapOf.put("big_version", str);
            }
        }
        C60627a aVar = this.f151590a.mo206976e().get(0);
        Intrinsics.checkExpressionValueIsNotNull(aVar, "config.hosts[0]");
        String c = aVar.mo208018c();
        return new C60499b("GET", C60537p.m235320a(mutableMapOf, c + "/model/api/model"));
    }

    /* renamed from: a */
    private final void m235540a(C60519c cVar) {
        mo207224a(70, new FetchSingleAlgorithmModelTaskResult(null, cVar));
    }

    /* renamed from: a */
    private final void m235541a(SingleAlgorithmModelResponse singleAlgorithmModelResponse) {
        mo207224a(70, new FetchSingleAlgorithmModelTaskResult(singleAlgorithmModelResponse, null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchModelInfoByNameTask(DownloadableModelConfig downloadableModelConfig, String str, int i, String str2, String str3, HandlerC60543j jVar) {
        super(jVar, str3);
        Intrinsics.checkParameterIsNotNull(downloadableModelConfig, "config");
        Intrinsics.checkParameterIsNotNull(str, "modelName");
        this.f151590a = downloadableModelConfig;
        this.f151591b = str;
        this.f151592c = i;
        this.f151593d = str2;
        this.f151594e = str3;
        this.f151595f = jVar;
    }
}
