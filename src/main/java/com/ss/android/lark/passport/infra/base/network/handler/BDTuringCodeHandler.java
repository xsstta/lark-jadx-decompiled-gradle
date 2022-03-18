package com.ss.android.lark.passport.infra.base.network.handler;

import android.content.Context;
import com.ss.android.lark.passport.infra.base.network.inter.CodeHandlerAnno;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\b\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/BDTuringCodeHandler;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "()V", "handleError", "", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleSuccess", "T", "model", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
@CodeHandlerAnno(code = 4233)
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.d */
public final class BDTuringCodeHandler implements ICommonCodeHandler {

    /* renamed from: a */
    public static final BDTuringCodeHandler f123245a = new BDTuringCodeHandler();

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171319a(NetworkErrorResult networkErrorResult) {
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171320a(ResponseModel<T> responseModel) {
        return true;
    }

    private BDTuringCodeHandler() {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171318a(Context context, NetworkErrorResult networkErrorResult) {
        return ICommonCodeHandler.C49357a.m194405a(this, context, networkErrorResult);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171321a(IRequest eVar, NetworkErrorResult networkErrorResult, ICallback<T> aVar) {
        return ICommonCodeHandler.C49357a.m194406a(this, eVar, networkErrorResult, aVar);
    }
}
