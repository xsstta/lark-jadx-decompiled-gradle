package com.ss.android.lark.account_provider.serviceimpl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.account_provider.integrator.env.PassportEnv;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.env.p2419a.C49001c;
import com.ss.android.lark.passport.infra.base.network.C49073c;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49197l;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.infra.util.p2441c.C49167b;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.C49369d;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.account.UserInfoGlobalSpHelper;
import com.ss.lark.android.passport.biz.account.migration.AccountRedesignMigrationManager;
import com.ss.lark.android.passport.biz.account.migration.SessionUpgradeChecker;
import com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b;
import com.ss.lark.android.passport.biz.compat.web.WebViewActivity;
import com.ss.lark.android.passport.biz.compat.web.WebViewClearTaskActivity;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.C64601b;
import com.ss.lark.android.passport.biz.feature.login_input.LoginInputActivity;
import com.ss.lark.android.passport.biz.utils.C65248c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@ClaymoreImpl(ICommonService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016J\u0010\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u0017H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\u001a\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0017H\u0016J\u001c\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\b2\b\u0010*\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\bH\u0016J+\u00101\u001a\u00020\u00042!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000403H\u0016J\u0016\u00106\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000408H\u0016J\u001c\u00109\u001a\u00020\u00042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u000403H\u0016J,\u0010;\u001a\u00020\u00042\u000e\u0010<\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010=\u001a\u00020>2\n\u0010?\u001a\u00020@\"\u00020>H\u0016J*\u0010A\u001a\u00020\u00042\b\u0010B\u001a\u0004\u0018\u00010\n2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010E\u0018\u00010DH\u0016JL\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\n2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0I2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020K0I2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0IH\u0016J\u0010\u0010M\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u001a\u0010M\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J+\u0010N\u001a\u00020\u00042!\u00102\u001a\u001d\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u000403H\u0016¨\u0006P"}, d2 = {"Lcom/ss/android/lark/account_provider/serviceimpl/CommonServiceImpl;", "Lcom/ss/android/lark/passport/infra/service/ICommonService;", "()V", "clearCookies", "", "deliverLegacyLoginEvent", "deliverLegacyLogoutEvent", "getApplicationContext", "Landroid/content/Context;", "getDebugUnit", "", "getExistFlagActivityClass", "Ljava/lang/Class;", "Landroid/app/Activity;", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "getSigninActivityClass", "getSigninClearTaskActivityClass", "getTenantCode", "getTopActivity", "getUserId", "getUserName", "hasLegacyUser", "", "isAccountRedesignMigrationCompleted", "isAppForeground", "isBoeEnv", "isByteDanceTenant", "isCustomer", "isFgEnable", "key", "isLarkPackage", "isLogin", "isNetworkAvailable", "isNewAccountUpgradeStarted", "isNewAccountUpgraded", "isOverSea", "isOverSeaTenant", "isVaUnit", "markNewAccountUpgraded", "onAppLogEventV3", "eventName", "params", "Lorg/json/JSONObject;", "onLoginStatusChangedEvent", "openLogin", "context", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SigninParams;", "openSecurityPasswordSettingPage", "registerNetworkChangeListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "registerPushUserListChangedEvent", "callback", "Lkotlin/Function0;", "registerPushValidatingEvent", "Lcom/ss/android/lark/passport/signinsdk_api/entity/PushSessionValidating;", "registerRouterPage", "clazz", "scene", "", "scenes", "", "saveSessionToCookies", "session", "sessionMap", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/SessionInfo;", "startPerfMonitor", "serviceName", "mCategory", "", "mMetric", "", "mExtra", "statistics", "unregisterNetworkChangeListener", "Companion", "passport-provider_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CommonServiceImpl implements ICommonService {
    public static final Companion Companion = new Companion(null);

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void startPerfMonitor(String str, Map<String, String> map, Map<String, Object> map2, Map<String, String> map3) {
        Intrinsics.checkParameterIsNotNull(str, "serviceName");
        Intrinsics.checkParameterIsNotNull(map, "mCategory");
        Intrinsics.checkParameterIsNotNull(map2, "mMetric");
        Intrinsics.checkParameterIsNotNull(map3, "mExtra");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/account_provider/serviceimpl/CommonServiceImpl$Companion;", "", "()V", "TAG", "", "TENANT_CODE_BYTEDANCE", "TENANT_CODE_CUSTOMER", "TENANT_ID_BYTEDANCE", "TENANT_ID_CUSTOMER", "passport-provider_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.account_provider.serviceimpl.CommonServiceImpl$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Class<? extends Activity> getExistFlagActivityClass() {
        return LoginInputActivity.class;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public Class<? extends Activity> getSigninActivityClass() {
        return WebViewActivity.class;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public Class<? extends Activity> getSigninClearTaskActivityClass() {
        return WebViewClearTaskActivity.class;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void markNewAccountUpgraded() {
        SessionUpgradeChecker.m252937e();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void deliverLegacyLoginEvent() {
        C28513a.m104514a(true);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void deliverLegacyLogoutEvent() {
        C28513a.m104514a(false);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public String getUserId() {
        return UserInfoGlobalSpHelper.m252847a();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean hasLegacyUser() {
        return AccountRedesignMigrationManager.f162563a.mo222800b();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isAccountRedesignMigrationCompleted() {
        return AccountRedesignMigrationManager.f162563a.mo222799a();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isNewAccountUpgradeStarted() {
        return SessionUpgradeChecker.f162576a.mo222855b();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isNewAccountUpgraded() {
        return SessionUpgradeChecker.f162576a.mo222856c();
    }

    public boolean isOverSea() {
        return C49073c.m193391a();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public Context getApplicationContext() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        return application;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public String getDebugUnit() {
        String b = PassportEnv.m104518c().mo101494b();
        Intrinsics.checkExpressionValueIsNotNull(b, "PassportEnv.inst().serverUnit()");
        return b;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public LoginInfo getLoginInfo() {
        IUserService e = ServiceFinder.m193750e();
        if (e != null) {
            return e.mo171594d();
        }
        return null;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public Activity getTopActivity() {
        return ServiceFinder.m193752g().getTopActivity();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isAppForeground() {
        return ServiceFinder.m193752g().isAppForeground();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isLarkPackage() {
        return ServiceFinder.m193752g().isUsPackage();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isLogin() {
        if (ServiceFinder.m193744a().getForegroundUser() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isNetworkAvailable() {
        return !ServiceFinder.m193752g().isNetWorkUnAvailable();
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void clearCookies() {
        PassportLog.f123351c.mo171474a().mo171465b("CommonService", "clear cookies");
        C65248c.m256137a();
    }

    public String getUserName() {
        String userName;
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser == null || (userName = foregroundUser.getUserName()) == null) {
            return "";
        }
        return userName;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isByteDanceTenant() {
        String str;
        LoginInfo loginInfo = getLoginInfo();
        if (loginInfo != null) {
            str = loginInfo.getTenantId();
        } else {
            str = null;
        }
        return Intrinsics.areEqual("1", str);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isCustomer() {
        String str;
        LoginInfo loginInfo = getLoginInfo();
        if (loginInfo != null) {
            str = loginInfo.getTenantId();
        } else {
            str = null;
        }
        return Intrinsics.areEqual("0", str);
    }

    public boolean isOverSeaTenant() {
        boolean isLarkPackage = isLarkPackage();
        boolean e = C49001c.m192990e();
        if ((!isLarkPackage || !e) && (isLarkPackage || e)) {
            return false;
        }
        return true;
    }

    public boolean isBoeEnv() {
        C48998a aVar = C48998a.f123026a;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "EnvModuleExport.mInstance");
        String d = aVar.mo171069d();
        C48998a aVar2 = C48998a.f123026a;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "EnvModuleExport.mInstance");
        if (!Intrinsics.areEqual(d, aVar2.mo171074i())) {
            C48998a aVar3 = C48998a.f123026a;
            Intrinsics.checkExpressionValueIsNotNull(aVar3, "EnvModuleExport.mInstance");
            if (Intrinsics.areEqual(d, aVar3.mo171072g())) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isVaUnit() {
        C48998a aVar = C48998a.f123026a;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "EnvModuleExport.mInstance");
        String d = aVar.mo171069d();
        C48998a aVar2 = C48998a.f123026a;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "EnvModuleExport.mInstance");
        if (!Intrinsics.areEqual(d, aVar2.mo171072g())) {
            C48998a aVar3 = C48998a.f123026a;
            Intrinsics.checkExpressionValueIsNotNull(aVar3, "EnvModuleExport.mInstance");
            if (Intrinsics.areEqual(d, aVar3.mo171071f())) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public String getTenantCode() {
        LoginInfo loginInfo = getLoginInfo();
        if (loginInfo == null) {
            return "";
        }
        if (C49167b.m193878a(loginInfo.getTenantCode())) {
            String tenantCode = loginInfo.getTenantCode();
            Intrinsics.checkExpressionValueIsNotNull(tenantCode, "loginInfo.tenantCode");
            return tenantCode;
        }
        String tenantId = loginInfo.getTenantId();
        if (tenantId == null) {
            return "";
        }
        int hashCode = tenantId.hashCode();
        if (hashCode != 48) {
            if (hashCode == 49 && tenantId.equals("1")) {
                return "bytedance";
            }
            return "";
        } else if (tenantId.equals("0")) {
            return "www";
        } else {
            return "";
        }
    }

    public void onLoginStatusChangedEvent(boolean z) {
        C28513a.m104514a(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/account_provider/serviceimpl/CommonServiceImpl$registerPushUserListChangedEvent$listener$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-provider_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.account_provider.serviceimpl.CommonServiceImpl$b */
    public static final class C28520b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ Function0 f71674a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        C28520b(Function0 function0) {
            this.f71674a = function0;
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            this.f71674a.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/account_provider/serviceimpl/CommonServiceImpl$registerPushValidatingEvent$listener$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/PushSessionValidating;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport-provider_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.account_provider.serviceimpl.CommonServiceImpl$c */
    public static final class C28521c implements IGetDataCallback<C49369d> {

        /* renamed from: a */
        final /* synthetic */ Function1 f71675a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        C28521c(Function1 function1) {
            this.f71675a = function1;
        }

        /* renamed from: a */
        public void onSuccess(C49369d dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f71675a.invoke(dVar);
        }
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public boolean isFgEnable(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return ServiceFinder.m193752g().isFgEnable(str);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void openSecurityPasswordSettingPage(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C64601b.m253843a().mo223367d(context);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void registerNetworkChangeListener(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        ServiceFinder.m193752g().registerNetworkChangeListener(function1);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void statistics(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Statistics.sendEvent(str);
    }

    public void unregisterNetworkChangeListener(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "listener");
        ServiceFinder.m193752g().unregisterNetworkChangeListener(function1);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void registerPushUserListChangedEvent(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        ServiceFinder.m193752g().getPush().mo145167c(C49197l.m193954a(new C28520b(function0)));
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void registerPushValidatingEvent(Function1<? super C49369d, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        ServiceFinder.m193752g().getPush().mo145168d(C49197l.m193954a(new C28521c(function1)));
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void openLogin(Context context, SigninParams signinParams) {
        C64395b.m253103a().mo172409a(context, signinParams);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void onAppLogEventV3(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        AppLogProxy.onEventV3(str, jSONObject);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void statistics(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Statistics.sendEvent(str, jSONObject);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void saveSessionToCookies(String str, Map<String, ? extends SessionInfo> map) {
        ArrayList arrayList;
        PassportLog a = PassportLog.f123351c.mo171474a();
        a.mo171465b("CommonService", "save session and session map, session: " + C49160a.m193857b(str));
        if (map != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, ? extends SessionInfo> entry : map.entrySet()) {
                String key = entry.getKey();
                SessionInfo sessionInfo = (SessionInfo) entry.getValue();
                if (sessionInfo != null) {
                    sessionInfo.setHostUrl(key);
                }
                SessionInfo sessionInfo2 = (SessionInfo) entry.getValue();
                if (sessionInfo2 != null) {
                    arrayList2.add(sessionInfo2);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = CollectionsKt.emptyList();
        }
        if (str == null) {
            str = "";
        }
        C65248c.m256138a(str, arrayList);
    }

    @Override // com.ss.android.lark.passport.infra.service.ICommonService
    public void registerRouterPage(Class<? extends Activity> cls, int i, int... iArr) {
        Intrinsics.checkParameterIsNotNull(cls, "clazz");
        Intrinsics.checkParameterIsNotNull(iArr, "scenes");
        C49092f.m193524a(cls, i, Arrays.copyOf(iArr, iArr.length));
    }
}
