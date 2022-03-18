package com.ss.android.lark.passport.infra.base.network.handler;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.passport.infra.base.network.inter.CodeHandlerAnno;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.utils.LarkContext;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u000b\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/NeedCaptChaIdCodeHandler;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "()V", "handle", "", "msg", "", "handleError", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleSuccess", "T", "model", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
@CodeHandlerAnno(code = 4210)
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.h */
public class NeedCaptChaIdCodeHandler implements ICommonCodeHandler {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171319a(NetworkErrorResult networkErrorResult) {
        String str;
        if (networkErrorResult != null) {
            str = networkErrorResult.getErrorMessage();
        } else {
            str = null;
        }
        return m193410a(str);
    }

    /* renamed from: a */
    private final boolean m193410a(String str) {
        PassportConfigCenter.f123034a.mo171113d().enableCaptchaId = true;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        LKUIToast.show(LarkContext.getApplication(), str);
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171320a(ResponseModel<T> responseModel) {
        String str;
        if (responseModel != null) {
            str = responseModel.getMessage();
        } else {
            str = null;
        }
        return m193410a(str);
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
