package com.ss.lark.android.passport.biz.compat.v2.http.common;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "")
@CodeHandlerAnno(code = 4401)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/ToastCodeHandler;", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;", "()V", "handleError", "", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleMsg", "code", "", "msg", "", "handleSuccess", "model", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/V2ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.i */
public class ToastCodeHandler implements AbstractC64511a {
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public /* synthetic */ boolean mo223175a(Context context, NetworkErrorResult networkErrorResult) {
        return AbstractC64511a.CC.$default$a(this, context, networkErrorResult);
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public /* synthetic */ boolean mo223177a(IRequest iRequest, NetworkErrorResult networkErrorResult, AbstractC49342a aVar) {
        return AbstractC64511a.CC.$default$a(this, iRequest, networkErrorResult, aVar);
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223176a(NetworkErrorResult networkErrorResult) {
        if (networkErrorResult != null) {
            return m253513a(networkErrorResult.getErrorCode(), networkErrorResult.getErrorMessage());
        }
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223178a(V2ResponseModel<?> v2ResponseModel) {
        if (v2ResponseModel != null) {
            return m253513a(v2ResponseModel.code, v2ResponseModel.message);
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m253513a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C64340b a = C64340b.m252955a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SigninManager.getInstance()");
        LKUIToast.show(a.mo222860b(), str);
        return true;
    }
}
