package com.bytedance.bdturing.verify.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/bytedance/bdturing/verify/request/SmarterVerifyRequest;", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "service", "", "smarterData", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "getService", "()Ljava/lang/String;", "setService", "(Ljava/lang/String;)V", "getSmarterData", "()Lorg/json/JSONObject;", "setSmarterData", "(Lorg/json/JSONObject;)V", "buildUrl", "", "queryBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEventLimits", "", "getServiceType", "getType", "BdTuringSdk_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.f.a.k */
public final class SmarterVerifyRequest extends AbstractRequest {

    /* renamed from: a */
    private String f11208a;

    /* renamed from: b */
    private JSONObject f11209b;

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: a */
    public void mo14340a(StringBuilder sb) {
        Intrinsics.checkParameterIsNotNull(sb, "queryBuilder");
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: f */
    public int mo14348f() {
        return 5;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: h */
    public int mo14350h() {
        return 6000;
    }

    @Override // com.bytedance.bdturing.verify.request.AbstractRequest
    /* renamed from: g */
    public String mo14349g() {
        return this.f11208a;
    }

    /* renamed from: j */
    public final JSONObject mo14352j() {
        return this.f11209b;
    }

    public SmarterVerifyRequest(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "service");
        this.f11208a = str;
        this.f11209b = jSONObject;
    }
}
