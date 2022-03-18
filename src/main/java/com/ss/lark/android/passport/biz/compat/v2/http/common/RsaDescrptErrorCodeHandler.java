package com.ss.lark.android.passport.biz.compat.v2.http.common;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.network.C49085f;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "")
@CodeHandlerAnno(code = 4220)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J4\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\rH\u0016J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/RsaDescrptErrorCodeHandler;", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;", "()V", "handleError", "", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleRetry", "T", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/http/IRequest;", "error", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseLoginRequestCallback;", "handleSuccess", "model", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/V2ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.h */
public class RsaDescrptErrorCodeHandler implements AbstractC64511a {
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public /* synthetic */ boolean mo223175a(Context context, NetworkErrorResult networkErrorResult) {
        return AbstractC64511a.CC.$default$a(this, context, networkErrorResult);
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223176a(NetworkErrorResult networkErrorResult) {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223178a(V2ResponseModel<?> v2ResponseModel) {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public <T> boolean mo223177a(IRequest<T> iRequest, NetworkErrorResult networkErrorResult, AbstractC49342a<T> aVar) {
        Intrinsics.checkParameterIsNotNull(iRequest, "request");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (!C49085f.m193500a()) {
            return false;
        }
        iRequest.retryRequest(aVar);
        return true;
    }
}
