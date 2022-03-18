package com.ss.android.lark.passport.infra.service;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.C49369d;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH&J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH&J\u0010\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH&J\b\u0010\u0011\u001a\u00020\tH&J\n\u0010\u0012\u001a\u0004\u0018\u00010\fH&J\n\u0010\u0013\u001a\u0004\u0018\u00010\tH&J\n\u0010\u0014\u001a\u0004\u0018\u00010\tH&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0016H&J\b\u0010\u001a\u001a\u00020\u0016H&J\b\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\tH&J\b\u0010\u001e\u001a\u00020\u0016H&J\b\u0010\u001f\u001a\u00020\u0016H&J\b\u0010 \u001a\u00020\u0016H&J\b\u0010!\u001a\u00020\u0016H&J\b\u0010\"\u001a\u00020\u0016H&J\b\u0010#\u001a\u00020\u0016H&J\b\u0010$\u001a\u00020\u0016H&J\b\u0010%\u001a\u00020\u0016H&J\b\u0010&\u001a\u00020\u0003H&J\u001a\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H&J\u001c\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u00072\b\u0010)\u001a\u0004\u0018\u00010.H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0007H&J+\u00100\u001a\u00020\u00032!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u000302H&J\u0016\u00105\u001a\u00020\u00032\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000307H&J\u001c\u00108\u001a\u00020\u00032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u000302H&J,\u0010:\u001a\u00020\u00032\u000e\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010<\u001a\u00020=2\n\u0010>\u001a\u00020?\"\u00020=H&J*\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\t2\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010D\u0018\u00010CH&JL\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\t2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0H2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010H2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0HH&J\u0010\u0010K\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\tH&J\u001a\u0010K\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*H&J+\u0010L\u001a\u00020\u00032!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u000302H&¨\u0006M"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/ICommonService;", "", "clearCookies", "", "deliverLegacyLoginEvent", "deliverLegacyLogoutEvent", "getApplicationContext", "Landroid/content/Context;", "getDebugUnit", "", "getExistFlagActivityClass", "Ljava/lang/Class;", "Landroid/app/Activity;", "getLoginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "getSigninActivityClass", "getSigninClearTaskActivityClass", "getTenantCode", "getTopActivity", "getUserId", "getUserName", "hasLegacyUser", "", "isAccountRedesignMigrationCompleted", "isAppForeground", "isBoeEnv", "isByteDanceTenant", "isCustomer", "isFgEnable", "key", "isLarkPackage", "isLogin", "isNetworkAvailable", "isNewAccountUpgradeStarted", "isNewAccountUpgraded", "isOverSea", "isOverSeaTenant", "isVaUnit", "markNewAccountUpgraded", "onAppLogEventV3", "eventName", "params", "Lorg/json/JSONObject;", "onLoginStatusChangedEvent", "openLogin", "context", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SigninParams;", "openSecurityPasswordSettingPage", "registerNetworkChangeListener", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "registerPushUserListChangedEvent", "callback", "Lkotlin/Function0;", "registerPushValidatingEvent", "Lcom/ss/android/lark/passport/signinsdk_api/entity/PushSessionValidating;", "registerRouterPage", "clazz", "scene", "", "scenes", "", "saveSessionToCookies", "session", "sessionMap", "", "Lcom/ss/android/lark/passport/signinsdk_api/account/SessionInfo;", "startPerfMonitor", "serviceName", "mCategory", "", "mMetric", "mExtra", "statistics", "unregisterNetworkChangeListener", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.service.a */
public interface ICommonService {
    void clearCookies();

    void deliverLegacyLoginEvent();

    void deliverLegacyLogoutEvent();

    Context getApplicationContext();

    String getDebugUnit();

    LoginInfo getLoginInfo();

    Class<? extends Activity> getSigninActivityClass();

    Class<? extends Activity> getSigninClearTaskActivityClass();

    String getTenantCode();

    Activity getTopActivity();

    String getUserId();

    boolean hasLegacyUser();

    boolean isAccountRedesignMigrationCompleted();

    boolean isAppForeground();

    boolean isByteDanceTenant();

    boolean isCustomer();

    boolean isFgEnable(String str);

    boolean isLarkPackage();

    boolean isLogin();

    boolean isNetworkAvailable();

    boolean isNewAccountUpgradeStarted();

    boolean isNewAccountUpgraded();

    boolean isVaUnit();

    void markNewAccountUpgraded();

    void onAppLogEventV3(String str, JSONObject jSONObject);

    void openLogin(Context context, SigninParams signinParams);

    void openSecurityPasswordSettingPage(Context context);

    void registerNetworkChangeListener(Function1<? super Boolean, Unit> function1);

    void registerPushUserListChangedEvent(Function0<Unit> function0);

    void registerPushValidatingEvent(Function1<? super C49369d, Unit> function1);

    void registerRouterPage(Class<? extends Activity> cls, int i, int... iArr);

    void saveSessionToCookies(String str, Map<String, ? extends SessionInfo> map);

    void startPerfMonitor(String str, Map<String, String> map, Map<String, Object> map2, Map<String, String> map3);

    void statistics(String str);

    void statistics(String str, JSONObject jSONObject);
}
