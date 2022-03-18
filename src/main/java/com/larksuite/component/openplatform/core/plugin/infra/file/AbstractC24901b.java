package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import org.json.JSONException;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.b */
public abstract class AbstractC24901b extends AbstractC24899a<String, ApiCallResult> {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ApiCallResult mo87979c() {
        return ApiCallResult.Builder.createOk(this.f61047a).extraInfo(mo87980c(this.f61050d)).responseData(this.f61051e).build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ApiCallResult mo87981d() {
        return ApiCallResult.Builder.createFail(this.f61047a).extraInfo(mo87980c(this.f61050d)).build();
    }

    public AbstractC24901b(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ApiCallResult mo87966a(Throwable th) {
        ApiCallResult.Builder createFail = ApiCallResult.Builder.createFail(this.f61047a);
        if (th instanceof JSONException) {
            createFail.extraInfo(ApiCallResultHelper.generateIllegalArgExtraInfo((String) this.f61048b));
        } else {
            createFail.extraInfo(ApiCallResultHelper.generateThrowableExtraInfo(th));
        }
        return createFail.build();
    }
}
