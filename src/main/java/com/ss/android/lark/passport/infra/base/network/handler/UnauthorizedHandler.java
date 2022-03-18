package com.ss.android.lark.passport.infra.base.network.handler;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.network.inter.CodeHandlerAnno;
import com.ss.android.lark.passport.infra.service.ISessionInvalidService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J2\u0010\t\u001a\u00020\u0006\"\u0004\b\u0000\u0010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u000eH\u0016J\u001e\u0010\u000f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/UnauthorizedHandler;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "()V", "HTTP_RESP_CODE_UNAUTHORIZED", "", "handleError", "", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleRetry", "T", "request", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/IRequest;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "handleSuccess", "model", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
@CodeHandlerAnno(code = 401)
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.l */
public final class UnauthorizedHandler implements ICommonCodeHandler {

    /* renamed from: a */
    public static final UnauthorizedHandler f123255a = new UnauthorizedHandler();

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171319a(NetworkErrorResult networkErrorResult) {
        return false;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171320a(ResponseModel<T> responseModel) {
        return false;
    }

    private UnauthorizedHandler() {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171318a(Context context, NetworkErrorResult networkErrorResult) {
        return ICommonCodeHandler.C49357a.m194405a(this, context, networkErrorResult);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171321a(IRequest eVar, NetworkErrorResult networkErrorResult, ICallback<T> aVar) {
        if (!(eVar == null || networkErrorResult == null || networkErrorResult.getErrorCode() != 401)) {
            ServiceFinder rVar = ServiceFinder.f123386a;
            ((ISessionInvalidService) ServiceFinder.m193746a(ISessionInvalidService.class)).sessionMayInvalid("401");
        }
        return false;
    }
}
