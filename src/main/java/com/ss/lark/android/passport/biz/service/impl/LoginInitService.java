package com.ss.lark.android.passport.biz.service.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ILoginInitService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49340b;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.lark.android.passport.biz.utils.C65250e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@ClaymoreImpl(ILoginInitService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J(\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\bH\u0002¨\u0006\u001f"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LoginInitService;", "Lcom/ss/android/lark/passport/infra/service/ILoginInitService;", "()V", "checkUserProtocolIfNeeded", "", "activity", "Landroid/app/Activity;", "userId", "", "getChatterById", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "gotoFeed", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "gotoOnBoarding", "initIMSdk", "session", "logoutToken", "isLoginFromExternal", "", "loge", "msg", "throwable", "", "logi", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LoginInitService implements ILoginInitService {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onActionFinished"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LoginInitService$b */
    static final class C65202b implements AbstractC49340b {

        /* renamed from: a */
        public static final C65202b f164164a = new C65202b();

        C65202b() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.AbstractC49340b
        /* renamed from: a */
        public final void mo172132a(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LoginInitService$Companion;", "", "()V", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LoginInitService$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.ILoginInitService
    public void gotoOnBoarding() {
        ServiceFinder.m193752g().startNewOnBoarding();
    }

    @Override // com.ss.android.lark.passport.infra.service.ILoginInitService
    public boolean isLoginFromExternal() {
        if (ServiceFinder.m193759n().getLoginSource().getLoginSource() == 1) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LoginInitService$getChatterById$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LoginInitService$c */
    public static final class C65203c implements IGetDataCallback<Unit> {

        /* renamed from: a */
        final /* synthetic */ LoginInitService f164165a;

        /* renamed from: b */
        final /* synthetic */ User f164166b;

        /* renamed from: a */
        public void onSuccess(Unit unit) {
            this.f164165a.logi("setLoginUser success");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String b = C49160a.m193857b(this.f164166b.getSession());
            LoginInitService loginInitService = this.f164165a;
            LoginInitService.loge$default(loginInitService, "SDK_3=" + errorResult + ", userId: " + this.f164166b.userId + "; session: " + b, null, 2, null);
        }

        C65203c(LoginInitService loginInitService, User user) {
            this.f164165a = loginInitService;
            this.f164166b = user;
        }
    }

    public final void logi(String str) {
        PassportLog.f123351c.mo171474a().mo171465b("LoginInitService", str);
    }

    private final void loge(String str, Throwable th) {
        PassportLog.f123351c.mo171474a().mo171462a("LoginInitService", str, th);
    }

    @Override // com.ss.android.lark.passport.infra.service.ILoginInitService
    public void checkUserProtocolIfNeeded(Activity activity, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        if (C65250e.m256140a()) {
            logi("SDK_2148 checkUserProtocol begin, userId: " + str);
            ServiceFinder.m193752g().checkUserProtocol(activity, C65202b.f164164a);
            return;
        }
        logi("don't need show protocol");
    }

    @Override // com.ss.android.lark.passport.infra.service.ILoginInitService
    public void gotoFeed(Context context, User user, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ServiceFinder.m193752g().launchMainWindow(context, user, bundle);
    }

    @Override // com.ss.android.lark.passport.infra.service.ILoginInitService
    public void getChatterById(User user, Activity activity, IGetDataCallback<Unit> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        ServiceFinder.m193752g().setLoginUser(user.userId, new C65203c(this, user));
    }

    public void initIMSdk(Activity activity, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(str, "session");
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        Intrinsics.checkParameterIsNotNull(str3, "logoutToken");
        ServiceFinder.m193752g().createStore(activity, str, str2, str3);
    }

    static /* synthetic */ void loge$default(LoginInitService loginInitService, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        loginInitService.loge(str, th);
    }
}
