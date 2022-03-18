package com.ss.android.lark.passport.infra.base.network.handler;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49032c;
import com.ss.android.lark.passport.infra.base.network.inter.CodeHandlerAnno;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.UDDialogUtils;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\b\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/AlertJumpCodeHandler;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "()V", "handleError", "", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleSuccess", "T", "model", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
@CodeHandlerAnno(code = 4209)
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.c */
public final class AlertJumpCodeHandler implements ICommonCodeHandler {
    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171319a(NetworkErrorResult networkErrorResult) {
        return false;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171320a(ResponseModel<T> responseModel) {
        String str;
        C49032c a = C49032c.m193132a();
        Intrinsics.checkExpressionValueIsNotNull(a, "SigninActivityLifeCycle.inst()");
        Activity b = a.mo171196b();
        if (b == null) {
            return false;
        }
        T t = null;
        if (responseModel != null) {
            str = responseModel.getMessage();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            Activity activity = b;
            UDDialogUtils.m193817a(activity, "", str, C49154ag.m193830a((Context) activity, (int) R.string.Lark_Login_ComfirmToRestPasword), new DialogInterface$OnClickListenerC49075a(responseModel, b), null, 32, null);
        }
        if (responseModel != null) {
            t = responseModel.getData();
        }
        if (t != null) {
            return C49092f.m193533a(t.nextStep, RouterScene.ALL.value, UniContext.CONTEXT_GLOBAL);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.passport.signinsdk_api.base.BaseStepData");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171318a(Context context, NetworkErrorResult networkErrorResult) {
        return ICommonCodeHandler.C49357a.m194405a(this, context, networkErrorResult);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "T", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.c.c$a */
    static final class DialogInterface$OnClickListenerC49075a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ResponseModel f123243a;

        /* renamed from: b */
        final /* synthetic */ Activity f123244b;

        DialogInterface$OnClickListenerC49075a(ResponseModel responseModel, Activity activity) {
            this.f123243a = responseModel;
            this.f123244b = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Object obj;
            dialogInterface.dismiss();
            ResponseModel responseModel = this.f123243a;
            Object obj2 = null;
            if (responseModel != null) {
                obj = responseModel.getData();
            } else {
                obj = null;
            }
            if (obj instanceof BaseStepData) {
                obj2 = obj;
            }
            BaseStepData baseStepData = (BaseStepData) obj2;
            if (baseStepData != null) {
                C49092f.m193529a(this.f123244b, baseStepData, RouterScene.ALL.value, UniContext.CONTEXT_GLOBAL, (PassportLog) null, (AbstractC49336a) null);
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171321a(IRequest eVar, NetworkErrorResult networkErrorResult, ICallback<T> aVar) {
        return ICommonCodeHandler.C49357a.m194406a(this, eVar, networkErrorResult, aVar);
    }
}
