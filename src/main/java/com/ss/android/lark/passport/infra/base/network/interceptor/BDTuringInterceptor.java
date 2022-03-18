package com.ss.android.lark.passport.infra.base.network.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.RequestResult;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IBDTuringService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016J\u001a\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/interceptor/BDTuringInterceptor;", "Lcom/ss/android/lark/passport/infra/base/network/interceptor/IResponseInterceptor;", "()V", "KEY_BIZ_CODE", "", "KEY_CODE", "KEY_DATA", "KEY_MESSAGE", "processResponse", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/RequestResult;", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "requestResult", "processResponseHeaders", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.d.a */
public final class BDTuringInterceptor implements IResponseInterceptor {

    /* renamed from: a */
    public static final BDTuringInterceptor f123258a = new BDTuringInterceptor();

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IResponseInterceptor
    /* renamed from: a */
    public RequestResult mo171334a(RequestResult fVar, UniContext uniContext) {
        Intrinsics.checkParameterIsNotNull(fVar, "requestResult");
        return fVar;
    }

    private BDTuringInterceptor() {
    }

    @Override // com.ss.android.lark.passport.infra.base.network.interceptor.IResponseInterceptor
    /* renamed from: a */
    public RequestResult mo171333a(IRequest eVar, RequestResult fVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "request");
        Intrinsics.checkParameterIsNotNull(fVar, "requestResult");
        JSONObject parseObject = JSON.parseObject(fVar.mo172215d());
        int intValue = parseObject.getIntValue("code");
        if (intValue != 4233) {
            return fVar;
        }
        String string = parseObject.getString("message");
        JSONObject jSONObject = parseObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int intValue2 = parseObject.getIntValue("biz_code");
        ServiceFinder rVar = ServiceFinder.f123386a;
        ((IBDTuringService) ServiceFinder.m193746a(IBDTuringService.class)).handleBDTuringResp(jSONObject);
        RequestResult fVar2 = new RequestResult(fVar.mo172214c(), fVar.mo172215d());
        fVar2.mo172211a(new NetworkErrorResult(intValue, string, intValue2));
        return fVar2;
    }
}
