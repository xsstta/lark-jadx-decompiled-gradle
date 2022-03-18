package com.ss.android.lark.passport.infra.base.network.handler;

import android.content.Context;
import com.larksuite.component.universe_design.toast.UDToast;
import com.ss.android.lark.passport.infra.base.network.inter.CodeHandlerAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/ToastCodeHandler;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "()V", "TAG", "", "handleError", "", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleMsg", "msg", "handleSuccess", "T", "model", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
@CodeHandlerAnno(code = 4401)
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.k */
public class ToastCodeHandler implements ICommonCodeHandler {

    /* renamed from: a */
    private final String f123254a = "ToastCodeHandler";

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171319a(NetworkErrorResult networkErrorResult) {
        if (networkErrorResult != null) {
            return m193425a(networkErrorResult.getErrorMessage());
        }
        return false;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171320a(ResponseModel<T> responseModel) {
        if (responseModel != null) {
            return m193425a(responseModel.getMessage());
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m193425a(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            UDToast.show(ServiceFinder.m193748c().getApplicationContext(), str);
            return true;
        }
        PassportLog.f123351c.mo171474a().mo171465b(this.f123254a, "msg is NullOrEmpty");
        return false;
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
