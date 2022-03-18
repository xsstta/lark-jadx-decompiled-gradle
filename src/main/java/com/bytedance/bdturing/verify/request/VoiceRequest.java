package com.bytedance.bdturing.verify.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/bdturing/verify/request/VoiceRequest;", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "()V", "buildUrl", "", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEventLimits", "", "getServiceType", "", "getType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.a.n */
public final class VoiceRequest extends AbstractRequest {
    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: a */
    public void mo14340a(StringBuilder sb) {
        Intrinsics.checkParameterIsNotNull(sb, "queryBuilder");
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: f */
    public int mo14348f() {
        return 12;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: g */
    public String mo14349g() {
        return "verify";
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: h */
    public int mo14350h() {
        return 6000;
    }
}
