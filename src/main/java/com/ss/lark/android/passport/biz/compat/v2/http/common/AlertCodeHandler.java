package com.ss.lark.android.passport.biz.compat.v2.http.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "")
@CodeHandlerAnno(code = 4402)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/AlertCodeHandler;", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;", "()V", "handleError", "", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleSuccess", "model", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/V2ResponseModel;", "handlerErrorWithContext", "context", "Landroid/content/Context;", "errorResult", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.a */
public final class AlertCodeHandler implements AbstractC64511a {
    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223176a(NetworkErrorResult networkErrorResult) {
        return false;
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public /* synthetic */ boolean mo223177a(IRequest iRequest, NetworkErrorResult networkErrorResult, AbstractC49342a aVar) {
        return AbstractC64511a.CC.$default$a(this, iRequest, networkErrorResult, aVar);
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223178a(V2ResponseModel<?> v2ResponseModel) {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.a$a */
    static final class DialogInterface$OnClickListenerC64522a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC64522a f162904a = new DialogInterface$OnClickListenerC64522a();

        DialogInterface$OnClickListenerC64522a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223175a(Context context, NetworkErrorResult networkErrorResult) {
        String str;
        if (context != null && (context instanceof Activity)) {
            if (networkErrorResult == null || (str = networkErrorResult.getErrorMessage()) == null) {
                str = "";
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                String string = context.getString(R.string.Lark_Login_ComfirmToRestPasword);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(string…gin_ComfirmToRestPasword)");
                ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).message(str2)).addActionButton(R.id.ud_dialog_btn_secondary, string, DialogInterface$OnClickListenerC64522a.f162904a)).build().show();
                return true;
            }
        }
        return false;
    }
}
