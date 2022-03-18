package com.ss.android.lark.integrator.plugin;

import android.text.TextUtils;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.optrace.api.ILogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/integrator/plugin/GetUserInfoExPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "getUserInfoEx", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "getUserInfoExRequest", "Lcom/ss/android/lark/integrator/plugin/GetUserInfoExPlugin$GetUserInfoExRequest;", "invokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "", "Companion", "GetUserInfoExRequest", "GetUserInfoExResponse", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class GetUserInfoExPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/integrator/plugin/GetUserInfoExPlugin$GetUserInfoExRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class GetUserInfoExRequest extends C25920a {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/integrator/plugin/GetUserInfoExPlugin$GetUserInfoExResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class GetUserInfoExResponse extends C25921b {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/plugin/GetUserInfoExPlugin$Companion;", "", "()V", "ERROR_NO_LOGIN", "", "ERROR_NO_LOGIN_MSG", "", "TAG", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.plugin.GetUserInfoExPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/plugin/GetUserInfoExPlugin$getUserInfoEx$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "idpIdentity", "open-platform_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.plugin.GetUserInfoExPlugin$b */
    public static final class C40017b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ LKEvent f101776a;

        /* renamed from: b */
        final /* synthetic */ AbstractC25897h f101777b;

        /* renamed from: c */
        final /* synthetic */ GetUserInfoExResponse f101778c;

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "idpIdentity");
            if (!TextUtils.isEmpty(str)) {
                AbstractC25895f c = this.f101776a.mo92134c();
                Intrinsics.checkExpressionValueIsNotNull(c, "lkEvent.eventContext");
                ILogger b = c.mo92190b();
                b.mo92222d("GetUserInfoEx", "get identity=" + str);
                this.f101777b.callback(str);
                return;
            }
            AbstractC25895f c2 = this.f101776a.mo92134c();
            Intrinsics.checkExpressionValueIsNotNull(c2, "lkEvent.eventContext");
            c2.mo92190b().mo92224i("GetUserInfoEx", "getIdpIdentity error: idpIdentity is empty");
            this.f101778c.mErrorCode = 393002;
            this.f101778c.mErrorMessage = "Need login in KA-H5 web";
            this.f101777b.callback(this.f101778c);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AbstractC25895f c = this.f101776a.mo92134c();
            Intrinsics.checkExpressionValueIsNotNull(c, "lkEvent.eventContext");
            ILogger b = c.mo92190b();
            b.mo92223e("GetUserInfoEx", "getIdpIdentity error:" + errorResult);
            this.f101778c.mErrorCode = 393002;
            this.f101778c.mErrorMessage = "Need login in KA-H5 web";
            this.f101777b.callback(this.f101778c);
        }

        C40017b(LKEvent lKEvent, AbstractC25897h hVar, GetUserInfoExResponse getUserInfoExResponse) {
            this.f101776a = lKEvent;
            this.f101777b = hVar;
            this.f101778c = getUserInfoExResponse;
        }
    }

    @LKPluginFunction(async = true, eventName = {"getUserInfoEx"})
    public final void getUserInfoEx(LKEvent lKEvent, GetUserInfoExRequest getUserInfoExRequest, AbstractC25897h<Object> hVar) {
        Intrinsics.checkParameterIsNotNull(lKEvent, "lkEvent");
        Intrinsics.checkParameterIsNotNull(getUserInfoExRequest, "getUserInfoExRequest");
        Intrinsics.checkParameterIsNotNull(hVar, "invokeCallback");
        GetUserInfoExResponse getUserInfoExResponse = new GetUserInfoExResponse();
        IBrowserModuleDependency a = C29638a.m109622a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BrowserModule.getDependency()");
        a.getLoginDependency().mo107679a(new C40017b(lKEvent, hVar, getUserInfoExResponse));
    }
}
