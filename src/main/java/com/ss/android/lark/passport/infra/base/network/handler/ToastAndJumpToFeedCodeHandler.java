package com.ss.android.lark.passport.infra.base.network.handler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.ss.android.lark.passport.infra.base.network.inter.CodeHandlerAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler;
import com.ss.android.lark.passport.signinsdk_api.base.network.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u001e\u0010\u000b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/passport/infra/base/network/handler/ToastAndJumpToFeedCodeHandler;", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICommonCodeHandler;", "()V", "TAG", "", "handleError", "", "error", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "handleMsg", "msg", "handleSuccess", "T", "model", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
@CodeHandlerAnno(code = 4403)
/* renamed from: com.ss.android.lark.passport.infra.base.network.c.j */
public final class ToastAndJumpToFeedCodeHandler implements ICommonCodeHandler {

    /* renamed from: a */
    public final String f123251a = "ToastAndJumpToFeedCodeHandler";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/passport/infra/base/network/handler/ToastAndJumpToFeedCodeHandler$handleMsg$1", "Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;", "onToastDismiss", "", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.base.network.c.j$a */
    public static final class C49076a implements UDToast.OnToastDismissListener {

        /* renamed from: a */
        final /* synthetic */ ToastAndJumpToFeedCodeHandler f123252a;

        /* renamed from: b */
        final /* synthetic */ ICommonService f123253b;

        @Override // com.larksuite.component.universe_design.toast.UDToast.OnToastDismissListener
        /* renamed from: a */
        public void mo36915a() {
            if (ServiceFinder.m193748c().isLogin()) {
                ServiceFinder.m193752g().launchMainWindow(this.f123253b.getApplicationContext(), null, new Bundle());
            } else {
                PassportLog.f123351c.mo171474a().mo171468c(this.f123252a.f123251a, "toast-- no user is login");
            }
        }

        C49076a(ToastAndJumpToFeedCodeHandler jVar, ICommonService aVar) {
            this.f123252a = jVar;
            this.f123253b = aVar;
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public boolean mo171319a(NetworkErrorResult networkErrorResult) {
        String errorMessage;
        if (networkErrorResult != null && (errorMessage = networkErrorResult.getErrorMessage()) != null) {
            return m193419a(errorMessage);
        }
        PassportLog.f123351c.mo171474a().mo171468c(this.f123251a, "model message is null");
        return false;
    }

    /* renamed from: a */
    private final boolean m193419a(String str) {
        Activity activity;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        ICommonService c = ServiceFinder.m193748c();
        Activity topActivity = c.getTopActivity();
        if (topActivity != null) {
            activity = topActivity;
        } else {
            activity = c.getApplicationContext();
        }
        new UDToast.Builder(activity).mo91643a(str2).mo91642a(new C49076a(this, c)).mo91656k();
        return true;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICommonCodeHandler
    /* renamed from: a */
    public <T> boolean mo171320a(ResponseModel<T> responseModel) {
        String message;
        if (responseModel != null && (message = responseModel.getMessage()) != null) {
            return m193419a(message);
        }
        PassportLog.f123351c.mo171474a().mo171468c(this.f123251a, "model message is null");
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
