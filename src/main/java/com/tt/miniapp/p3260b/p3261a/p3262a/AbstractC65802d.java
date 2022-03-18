package com.tt.miniapp.p3260b.p3261a.p3262a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.refer.p3400a.p3401a.p3402a.C67700a;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.b.a.a.d */
public abstract class AbstractC65802d extends AbstractC65792a {
    /* renamed from: a */
    public abstract ApiCallResult mo87217a(C67701b bVar);

    public AbstractC65802d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ApiCallResult mo230497a(ApiCode apiCode) {
        return mo230499a(apiCode.msg, apiCode.code, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ApiCallResult mo230500a(Throwable th) {
        ApiCallResult build = ApiCallResult.Builder.createFail(this.f165818h, ApiCallResultHelper.generateThrowableExtraInfo(th), ApiCode.GENERAL_UNKONW_ERROR.code).build();
        mo230471b(this.f165818h, build.toString());
        return build;
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a, com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65803f
    /* renamed from: b */
    public final C67700a mo230470b(C67701b bVar) {
        ApiCallResult apiCallResult;
        AppBrandLogger.m52830i("ApiHandler", "handleApiInvoke->" + bVar.mo234986b());
        try {
            apiCallResult = mo87217a(bVar);
        } catch (Exception e) {
            apiCallResult = mo230500a(e);
        }
        return new C67700a(true, apiCallResult);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ApiCallResult mo230501a(JSONObject jSONObject) {
        return ApiCallResult.Builder.createOk(this.f165818h, jSONObject).build();
    }

    public AbstractC65802d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ApiCallResult mo230498a(ApiCode apiCode, String str) {
        return mo230499a(str, apiCode.code, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ApiCallResult mo230499a(String str, int i, JSONObject jSONObject) {
        ApiCallResult build = ApiCallResult.Builder.createFail(this.f165818h, str, i).responseData(jSONObject).build();
        mo230471b(this.f165818h, build.toString());
        return build;
    }
}
