package com.ss.lark.android.passport.biz.compat.v2.http.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a;
import com.ss.lark.android.passport.biz.compat.v2.http.base.V2ResponseModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "")
@CodeHandlerAnno(code = 4209)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/v2/http/common/AlertJumpCodeHandler;", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/BaseCommonCodeHandler;", "()V", "handleError", "", "result", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleSuccess", "model", "Lcom/ss/lark/android/passport/biz/compat/v2/http/base/V2ResponseModel;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.b */
public final class AlertJumpCodeHandler implements AbstractC64511a {
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
    public /* synthetic */ boolean mo223177a(IRequest iRequest, NetworkErrorResult networkErrorResult, AbstractC49342a aVar) {
        return AbstractC64511a.CC.$default$a(this, iRequest, networkErrorResult, aVar);
    }

    @Override // com.ss.lark.android.passport.biz.compat.v2.http.base.AbstractC64511a
    /* renamed from: a */
    public boolean mo223178a(V2ResponseModel<?> v2ResponseModel) {
        String str;
        C49032c a = C49032c.m193132a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SigninActivityLifeCycle.inst()");
        Activity b = a.mo171196b();
        if (b == null) {
            return false;
        }
        Object obj = null;
        if (v2ResponseModel != null) {
            str = v2ResponseModel.message;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Activity activity = b;
            UDDialogUtils.m193817a(activity, "", str, C49154ag.m193830a((Context) activity, (int) R.string.Lark_Login_ComfirmToRestPasword), new DialogInterface$OnClickListenerC64523a(v2ResponseModel, b), null, 32, null);
        }
        if (v2ResponseModel != null) {
            obj = v2ResponseModel.data;
        }
        if (obj != null) {
            return C49092f.m193533a(((BaseStepData) obj).nextStep, RouterScene.ALL.value, UniContext.CONTEXT_GLOBAL);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.passport.signinsdk_api.base.BaseStepData");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.common.b$a */
    static final class DialogInterface$OnClickListenerC64523a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ V2ResponseModel f162905a;

        /* renamed from: b */
        final /* synthetic */ Activity f162906b;

        DialogInterface$OnClickListenerC64523a(V2ResponseModel v2ResponseModel, Activity activity) {
            this.f162905a = v2ResponseModel;
            this.f162906b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Object obj;
            dialogInterface.dismiss();
            V2ResponseModel v2ResponseModel = this.f162905a;
            Object obj2 = null;
            if (v2ResponseModel != null) {
                obj = v2ResponseModel.data;
            } else {
                obj = null;
            }
            if (obj instanceof BaseStepData) {
                obj2 = obj;
            }
            BaseStepData baseStepData = (BaseStepData) obj2;
            if (baseStepData != null) {
                C49092f.m193529a(this.f162906b, baseStepData, RouterScene.ALL.value, UniContext.CONTEXT_GLOBAL, (PassportLog) null, (AbstractC49336a) null);
            }
        }
    }
}
