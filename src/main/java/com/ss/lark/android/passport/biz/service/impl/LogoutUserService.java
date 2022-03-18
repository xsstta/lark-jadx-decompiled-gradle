package com.ss.lark.android.passport.biz.service.impl;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.p2069j.p2070a.C40655v;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.listenermanage.LogoutListenerManager;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.LogoutReason;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.compat.p3211a.C64360a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@ClaymoreImpl(ILogoutUserService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016J\"\u0010\"\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016J2\u0010#\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016J,\u0010&\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010%2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016JB\u0010(\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 2\b\b\u0002\u0010)\u001a\u00020*H\u0002J\u001e\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020*2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010-\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J*\u0010.\u001a\u00020*2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0002J \u0010/\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u00062"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LogoutUserService;", "Lcom/ss/android/lark/passport/infra/service/ILogoutUserService;", "()V", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "mCommonService", "Lcom/ss/android/lark/passport/infra/service/ICommonService;", "getMCommonService", "()Lcom/ss/android/lark/passport/infra/service/ICommonService;", "mCommonService$delegate", "Lkotlin/Lazy;", "appendAllUserToOfflineLogoutTask", "", "users", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "cleanAndResetEnv", "context", "Landroid/content/Context;", "clearForLogoutAll", "userList", "clearForLogoutPart", "clearOkHttpSession", "clearWebviewCookie", "closeOfflinePush", "gotoLogin", "params", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SigninParams;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "logoutAll", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "logoutAllWithoutLogin", "logoutMulti", "userIdList", "", "logoutSingle", "userId", "logoutUser", "toLogin", "", "onLogoutEnd", "success", "setKaLogout", "skipLogout", "startOfflineLogout", "tokenList", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LogoutUserService implements ILogoutUserService {
    public static final Companion Companion = new Companion(null);
    public final PassportLog log = PassportLog.f123351c.mo171474a();
    private final Lazy mCommonService$delegate = LazyKt.lazy(C65211i.INSTANCE);

    private final ICommonService getMCommonService() {
        return (ICommonService) this.mCommonService$delegate.getValue();
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void clearForLogoutPart(List<? extends User> list) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LogoutUserService$Companion;", "", "()V", "FEATURE_KEY_CLOSE_OFFLINE_PUSH", "", "TAG", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/infra/service/ICommonService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$i */
    static final class C65211i extends Lambda implements Function0<ICommonService> {
        public static final C65211i INSTANCE = new C65211i();

        C65211i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ICommonService invoke() {
            return ServiceFinder.m193748c();
        }
    }

    private final void closeOfflinePush() {
        boolean isFgEnable = ServiceFinder.m193748c().isFgEnable("android.close.offline.push");
        PassportLog passportLog = this.log;
        passportLog.mo171465b("n_action_logout_all_clear_data", "closeOfflinePush, closeOfflinePushFG is " + isFgEnable);
        if (isFgEnable) {
            ServiceFinder.m193752g().closeOfflinePush();
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void appendAllUserToOfflineLogoutTask() {
        List<User> allUserList = ServiceFinder.m193744a().getAllUserList();
        Intrinsics.checkExpressionValueIsNotNull(allUserList, "userListService.allUserList");
        ArrayList arrayList = new ArrayList();
        for (T t : allUserList) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            String logoutToken = t.getLogoutToken();
            if (logoutToken != null) {
                arrayList.add(logoutToken);
            }
        }
        OffLineLogoutService.f164281a.mo224473a(arrayList);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$g */
    public static final class C65209g extends Lambda implements Function1<String, String> {
        public static final C65209g INSTANCE = new C65209g();

        C65209g() {
            super(1);
        }

        public final String invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            return MonitorUtil.m193717b(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LogoutUserService$cleanAndResetEnv$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", "deviceId", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$b */
    public static final class C65204b implements AbstractC49352d<String> {

        /* renamed from: a */
        final /* synthetic */ LogoutUserService f164167a;

        /* renamed from: b */
        final /* synthetic */ Context f164168b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            this.f164167a.log.mo171471d("n_action_logout_all_clear_data", "reset_env onError");
            UnknownCodeHandler.f123256a.mo171331c(this.f164168b, networkErrorResult);
        }

        /* renamed from: a */
        public void mo145179a(String str) {
            PassportLog passportLog = this.f164167a.log;
            passportLog.mo171465b("n_action_logout_all_clear_data", "reset_env succ, deviceId is " + str);
        }

        C65204b(LogoutUserService logoutUserService, Context context) {
            this.f164167a = logoutUserService;
            this.f164168b = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LogoutUserService$logoutAll$callbackMonitorWrapper$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$c */
    public static final class C65205c implements IGetDataCallback<C49376b> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f164169a;

        /* renamed from: b */
        final /* synthetic */ UniContext f164170b;

        /* renamed from: a */
        public void onSuccess(C49376b bVar) {
            IGetDataCallback iGetDataCallback = this.f164169a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(bVar);
            }
            UniContext uniContext = this.f164170b;
            C40655v vVar = C40655v.f103205b;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_SUCC");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeSuccess().flush();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f164169a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            UniContext uniContext = this.f164170b;
            C40655v vVar = C40655v.f103206c;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_FAIL");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeFail().flush();
        }

        C65205c(IGetDataCallback iGetDataCallback, UniContext uniContext) {
            this.f164169a = iGetDataCallback;
            this.f164170b = uniContext;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LogoutUserService$logoutAllWithoutLogin$callbackMonitorWrapper$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$d */
    public static final class C65206d implements IGetDataCallback<C49376b> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f164171a;

        /* renamed from: b */
        final /* synthetic */ UniContext f164172b;

        /* renamed from: a */
        public void onSuccess(C49376b bVar) {
            IGetDataCallback iGetDataCallback = this.f164171a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(bVar);
            }
            UniContext uniContext = this.f164172b;
            C40655v vVar = C40655v.f103205b;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_SUCC");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeSuccess().flush();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f164171a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            UniContext uniContext = this.f164172b;
            C40655v vVar = C40655v.f103206c;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_FAIL");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeFail().flush();
        }

        C65206d(IGetDataCallback iGetDataCallback, UniContext uniContext) {
            this.f164171a = iGetDataCallback;
            this.f164172b = uniContext;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LogoutUserService$logoutMulti$callbackMonitorWrapper$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$e */
    public static final class C65207e implements IGetDataCallback<C49376b> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f164173a;

        /* renamed from: b */
        final /* synthetic */ UniContext f164174b;

        /* renamed from: a */
        public void onSuccess(C49376b bVar) {
            IGetDataCallback iGetDataCallback = this.f164173a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(bVar);
            }
            UniContext uniContext = this.f164174b;
            C40655v vVar = C40655v.f103205b;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_SUCC");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeSuccess().flush();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f164173a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            UniContext uniContext = this.f164174b;
            C40655v vVar = C40655v.f103206c;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_FAIL");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeFail().flush();
        }

        C65207e(IGetDataCallback iGetDataCallback, UniContext uniContext) {
            this.f164173a = iGetDataCallback;
            this.f164174b = uniContext;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LogoutUserService$logoutSingle$callbackMonitorWrapper$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$f */
    public static final class C65208f implements IGetDataCallback<C49376b> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f164175a;

        /* renamed from: b */
        final /* synthetic */ UniContext f164176b;

        /* renamed from: a */
        public void onSuccess(C49376b bVar) {
            IGetDataCallback iGetDataCallback = this.f164175a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(bVar);
            }
            UniContext uniContext = this.f164176b;
            C40655v vVar = C40655v.f103205b;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_SUCC");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeSuccess().flush();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f164175a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            UniContext uniContext = this.f164176b;
            C40655v vVar = C40655v.f103206c;
            Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor….PASSPORT_LOGOUT_END_FAIL");
            WatcherHelper.m193669b(uniContext, vVar, null, 4, null).setResultTypeFail().flush();
        }

        C65208f(IGetDataCallback iGetDataCallback, UniContext uniContext) {
            this.f164175a = iGetDataCallback;
            this.f164176b = uniContext;
        }
    }

    private final void cleanAndResetEnv(Context context) {
        this.log.mo171465b("n_action_logout_all_clear_data", "reset_env start");
        ServiceFinder.m193760o().cleanEnvAndDid(UniContext.CONTEXT_GLOBAL, new C65204b(this, context));
    }

    private final void clearOkHttpSession(Context context) {
        this.log.mo171465b("n_action_logout_all_clear_data", "clearOkHttpSession");
        try {
            ServiceFinder.m193752g().getLarkHttpClient().mo92415a(context);
        } catch (Exception unused) {
            this.log.mo171471d("n_action_logout_all_clear_data", "clearOkHttpSession error");
        }
    }

    private final void clearWebviewCookie(Context context) {
        this.log.mo171465b("n_action_logout_all_clear_data", "clearWebviewCookie");
        CookieSyncManager.createInstance(context);
        CookieManager instance = CookieManager.getInstance();
        instance.removeSessionCookie();
        instance.removeAllCookie();
        CookieSyncManager.getInstance().sync();
    }

    private final void setKaLogout(Context context) {
        this.log.mo171465b("n_action_logout_all_clear_data", "ka_logout");
        ServiceFinder.m193763r().getKaIdp().mo171889a(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LogoutUserService$logoutUser$finishCb$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserService$h */
    public static final class C65210h implements IGetDataCallback<C49376b> {

        /* renamed from: a */
        final /* synthetic */ LogoutUserService f164177a;

        /* renamed from: b */
        final /* synthetic */ List f164178b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f164179c;

        /* renamed from: d */
        final /* synthetic */ boolean f164180d;

        /* renamed from: e */
        final /* synthetic */ List f164181e;

        /* renamed from: f */
        final /* synthetic */ boolean f164182f;

        /* renamed from: g */
        final /* synthetic */ Context f164183g;

        /* renamed from: h */
        final /* synthetic */ UniContext f164184h;

        /* renamed from: a */
        public void onSuccess(C49376b bVar) {
            this.f164177a.onLogoutEnd(true, this.f164178b);
            IGetDataCallback iGetDataCallback = this.f164179c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(bVar);
            }
            PassportLog passportLog = this.f164177a.log;
            passportLog.mo171465b("n_action_logout_succ", "onLogoutEnd, isQuitAll= " + this.f164180d + ",logoutUserIdList=" + CollectionsKt.joinToString$default(this.f164181e, ",", "[", "]", 0, null, null, 56, null));
            if (this.f164180d && this.f164182f) {
                this.f164177a.log.mo171465b("n_action_logout_succ", "goto login");
                LogoutUserService logoutUserService = this.f164177a;
                Context context = this.f164183g;
                SigninParams a = SigninParams.newBuilder().mo172351b(true).mo172350a();
                Intrinsics.checkExpressionValueIsNotNull(a, "SigninParams.newBuilder(…etClearTask(true).build()");
                logoutUserService.gotoLogin(context, a, this.f164184h);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f164177a.onLogoutEnd(false, this.f164178b);
            IGetDataCallback iGetDataCallback = this.f164179c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            PassportLog passportLog = this.f164177a.log;
            passportLog.mo171465b("n_action_logout_fail", "errMsg=" + errorResult.getDisplayMsg(String.valueOf(errorResult.getErrorCode())) + ", " + "logoutUserIdList=" + CollectionsKt.joinToString$default(this.f164181e, ",", "[", "]", 0, null, null, 56, null));
        }

        C65210h(LogoutUserService logoutUserService, List list, IGetDataCallback iGetDataCallback, boolean z, List list2, boolean z2, Context context, UniContext uniContext) {
            this.f164177a = logoutUserService;
            this.f164178b = list;
            this.f164179c = iGetDataCallback;
            this.f164180d = z;
            this.f164181e = list2;
            this.f164182f = z2;
            this.f164183g = context;
            this.f164184h = uniContext;
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void appendAllUserToOfflineLogoutTask(List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(list, "users");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String logoutToken = it.next().getLogoutToken();
            if (logoutToken != null) {
                arrayList.add(logoutToken);
            }
        }
        OffLineLogoutService.f164281a.mo224473a(arrayList);
    }

    public final void onLogoutEnd(boolean z, List<? extends User> list) {
        if (z) {
            LogoutListenerManager.m193631a(LogoutReason.PlaceHolder, list);
        } else {
            LogoutListenerManager.m193634b(LogoutReason.PlaceHolder, list);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void startOfflineLogout(UniContext uniContext, List<String> list) {
        Intrinsics.checkParameterIsNotNull(uniContext, "uniContext");
        C40655v vVar = C40655v.f103210g;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…LOGOUT_OFFLINE_TASK_START");
        WatcherHelper.m193666a(uniContext, vVar, null, 4, null);
        if (list != null) {
            OffLineLogoutService.f164281a.mo224473a(list);
        }
        OffLineLogoutService.f164281a.mo224472a(uniContext);
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void clearForLogoutAll(Context context, List<? extends User> list) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.log.mo171465b("n_action_logout_all_clear_data", "start");
        cleanAndResetEnv(context);
        clearOkHttpSession(context);
        clearWebviewCookie(context);
        setKaLogout(context);
        ServiceFinder.m193752g().resetEverything();
        this.log.mo171465b("n_action_logout_afterlogout_task", "onLoginStatusChanged(false)");
        getMCommonService().deliverLegacyLogoutEvent();
        closeOfflinePush();
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void logoutAll(Context context, IGetDataCallback<C49376b> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.log.mo171465b("n_action_logout_start", "all_logout");
        UniContext e = WatcherUniContext.f123348l.mo171437e();
        e.appendOneSceneMonitorParam("start_type", "all");
        C40655v vVar = C40655v.f103204a;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…ode.PASSPORT_LOGOUT_START");
        WatcherHelper.m193666a(e, vVar, null, 4, null);
        List<User> allValidUserList = ServiceFinder.m193744a().getAllValidUserList();
        Intrinsics.checkExpressionValueIsNotNull(allValidUserList, "userListService.allValidUserList");
        List<User> list = allValidUserList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().userId);
        }
        ArrayList arrayList2 = arrayList;
        C65205c cVar = new C65205c(iGetDataCallback, e);
        if (!skipLogout(arrayList2, cVar)) {
            logoutUser$default(this, e, context, arrayList2, cVar, false, 16, null);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void logoutAllWithoutLogin(Context context, IGetDataCallback<C49376b> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.log.mo171465b("n_action_logout_start", "all_logout when logoutAllWithoutLogin");
        UniContext e = WatcherUniContext.f123348l.mo171437e();
        e.appendOneSceneMonitorParam("start_type", "all");
        C40655v vVar = C40655v.f103204a;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…ode.PASSPORT_LOGOUT_START");
        WatcherHelper.m193666a(e, vVar, null, 4, null);
        List<User> allValidUserList = ServiceFinder.m193744a().getAllValidUserList();
        Intrinsics.checkExpressionValueIsNotNull(allValidUserList, "userListService.allValidUserList");
        List<User> list = allValidUserList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().userId);
        }
        ArrayList arrayList2 = arrayList;
        C65206d dVar = new C65206d(iGetDataCallback, e);
        if (!skipLogout(arrayList2, dVar)) {
            logoutUser(e, context, arrayList2, dVar, false);
        }
    }

    private final boolean skipLogout(List<String> list, IGetDataCallback<C49376b> iGetDataCallback) {
        boolean z;
        boolean z2;
        if (ServiceFinder.m193744a().getForegroundUser() == null) {
            this.log.mo171468c("n_action_logout_succ_skipped", "not skip, foregroundUser is null");
        }
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.log.mo171468c("n_action_logout_succ_skipped", "params userIdList for logout is empty ");
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(new C49376b(true, LogoutReason.PlaceHolder, Collections.emptyList(), ServiceFinder.m193744a().getAllUserList()));
            }
            return true;
        }
        List<User> allValidUserList = ServiceFinder.m193744a().getAllValidUserList();
        Intrinsics.checkExpressionValueIsNotNull(allValidUserList, "userListService.allValidUserList");
        List<User> list3 = allValidUserList;
        if (list3 == null || list3.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        this.log.mo171468c("n_action_logout_succ_skipped", "userListService.allValidUserList is empty");
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(new C49376b(true, LogoutReason.PlaceHolder, ServiceFinder.m193744a().getAllUserList(), ServiceFinder.m193744a().getAllUserList()));
        }
        return true;
    }

    public void gotoLogin(Context context, SigninParams signinParams, UniContext uniContext) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(signinParams, "params");
        C64360a.m253031a(context, uniContext);
        C64340b.m252955a().mo222859a(context, signinParams, uniContext);
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void logoutMulti(Context context, List<String> list, IGetDataCallback<C49376b> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.log.mo171465b("n_action_logout_start", "multiple_logout");
        UniContext e = WatcherUniContext.f123348l.mo171437e();
        e.appendOneSceneMonitorParam("start_type", "multiple");
        C40655v vVar = C40655v.f103204a;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…ode.PASSPORT_LOGOUT_START");
        WatcherHelper.m193666a(e, vVar, null, 4, null);
        C65207e eVar = new C65207e(iGetDataCallback, e);
        if (!skipLogout(list, eVar)) {
            if (list == null) {
                Intrinsics.throwNpe();
            }
            logoutUser$default(this, e, context, list, eVar, false, 16, null);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserService
    public void logoutSingle(Context context, String str, IGetDataCallback<C49376b> iGetDataCallback) {
        boolean z;
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.log.mo171465b("n_action_logout_start", "single_logout");
        UniContext e = WatcherUniContext.f123348l.mo171437e();
        e.appendOneSceneMonitorParam("start_type", "single");
        C40655v vVar = C40655v.f103204a;
        Intrinsics.checkExpressionValueIsNotNull(vVar, "EPMClientPassportMonitor…ode.PASSPORT_LOGOUT_START");
        WatcherHelper.m193666a(e, vVar, null, 4, null);
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = CollectionsKt.arrayListOf(str);
        }
        C65208f fVar = new C65208f(iGetDataCallback, e);
        if (!skipLogout(arrayList, fVar)) {
            Intrinsics.checkExpressionValueIsNotNull(arrayList, "userIdList");
            logoutUser$default(this, e, context, arrayList, fVar, false, 16, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0139, code lost:
        if (r12 != false) goto L_0x013b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void logoutUser(com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r26, android.content.Context r27, java.util.List<java.lang.String> r28, com.larksuite.framework.callback.IGetDataCallback<com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b> r29, boolean r30) {
        /*
        // Method dump skipped, instructions count: 830
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.service.impl.LogoutUserService.logoutUser(com.ss.android.lark.passport.signinsdk_api.base.log.UniContext, android.content.Context, java.util.List, com.larksuite.framework.callback.IGetDataCallback, boolean):void");
    }

    static /* synthetic */ void logoutUser$default(LogoutUserService logoutUserService, UniContext uniContext, Context context, List list, IGetDataCallback iGetDataCallback, boolean z, int i, Object obj) {
        boolean z2;
        if ((i & 16) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        logoutUserService.logoutUser(uniContext, context, list, iGetDataCallback, z2);
    }
}
