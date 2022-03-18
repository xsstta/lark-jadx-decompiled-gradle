package com.ss.android.lark.passport_api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49358c;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SessionResult;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.idp.AbstractC49384b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49388a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49394g;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49403r;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.setting.export.AbstractC54125a;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IPassportApi {
    void addDeviceIdChangeListener(AbstractC49390d.AbstractC49391a aVar);

    void addPushDeviceNotifySettingListener(AbstractC49399l lVar);

    void addPushDeviceOnlineStatusListener(AbstractC49400m mVar);

    void changeTenantComplete(String str);

    void checkMyPhoneNumberValid86(IGetDataCallback<Boolean> iGetDataCallback);

    void cleanAndRestEnv(AbstractC49352d<String> dVar);

    void dispatchFastLogin();

    int envType();

    void fetchVerifyStatus(AbstractC49403r rVar);

    AbstractC49388a getAccountInterceptProcessor();

    AbstractC49389b getAccountManager();

    IAccountChangeObserver getAccountObserver();

    List<User> getAllValidUserList();

    Map<String, String> getAutoInitModuleConfigMap();

    String getAvatarUrl();

    String getCaptchaToken(String str, String str2);

    String getCnUnit();

    String getDeviceId();

    void getDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback);

    void getDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback, long j);

    String getDeviceIdFromLocal();

    AbstractC49390d getDeviceIdService();

    JSONObject getDeviceInfo(Context context);

    IDeviceManager getDeviceManager();

    String getDevicePlatform();

    IDeviceService getDeviceService();

    String getDynamicUrlFromV3Config(String str);

    AbstractC49370a getEnvService();

    TenantInfo getForegroundTenant();

    User getForegroundUser();

    void getIdpIdentity(IGetDataCallback<String> iGetDataCallback);

    AbstractC49384b getKaIdp();

    int getLocalTenantAccountUserAccount();

    int getLoginAppId();

    Map<? extends String, ? extends AbstractC29186b> getLoginAppLinkHandlers(Context context);

    String getLoginDeviceId();

    AbstractC49394g getLoginExService();

    LoginInfo getLoginInfo();

    ILoginService getLoginService();

    int getLoginType();

    List<TenantInfo.PendingUser> getPendingUsers();

    IQRLoginService getQRLoginService();

    String getSession();

    Map<String, SessionInfo> getSessions();

    Fragment getSettingTeamNameFrg(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback);

    ISigninSdkApi getSigninApi();

    String getTenantCode();

    List<TenantInfo> getTenantData();

    String getTenantId();

    TenantInfo getTenantInfo();

    TenantInfo getTenantInfo(String str);

    String getTenantName();

    AbstractC49393f getTenantService();

    int getTenantTag();

    AbstractC49393f getTenantsByIdsService();

    Map<String, String> getThirdPartyModuleConfigMap();

    Map<String, String> getThirdPartyPrefixModuleConfigMap();

    User getUser();

    String getUserId();

    String getUserName();

    String getUserUnit();

    String getVaUnit();

    void gotoPassportUpgrade(Context context, Intent intent);

    void guestLogin(Context context, String str, String str2, AbstractC49358c cVar);

    void initPassportModule();

    void initProcessorDoInit(String str);

    void initSessionExpiredProcessor(Context context);

    void interceptAccount(Context context, IGetDataCallback<Boolean> iGetDataCallback);

    void interceptRustInitRequest(InitSDKRequest.C15029a aVar);

    boolean isBoe();

    boolean isCNEnv();

    boolean isCurrentEnvSameToAppInternalEnv();

    boolean isCustomer();

    boolean isEnableLanguageBeforeLogin();

    boolean isGuestUser();

    boolean isInLoginActivity(Activity activity);

    boolean isLogin();

    boolean isOverseaTenantBrand();

    boolean isPrimaryHost();

    boolean isSessionNeedUpgrade();

    boolean isSmallBUser();

    boolean isUsPackage();

    void logout(Context context, IGetDataCallback<String> iGetDataCallback);

    void logout(Context context, boolean z, String str, AbstractC49338a aVar);

    void logoutAllUsers(IGetDataCallback<C49376b> iGetDataCallback);

    void logoutAndLogin(Context context, IGetDataCallback<String> iGetDataCallback);

    void logoutUser(String str, IGetDataCallback<C49376b> iGetDataCallback);

    void logoutWithoutLogin(Context context, boolean z, String str, AbstractC49338a aVar);

    int oldSdkEnv();

    void onSwitchTenantUserClick(String str, int i);

    void openContactPointManagerPage(Context context);

    void openCountrySelect(Fragment fragment, int i, int i2, int i3, int i4);

    void openInviteTenantJoinWayPage(Context context);

    void openPassportPage(Context context, String str);

    void openSSOSdkAuthPage(Context context, String str, Bundle bundle);

    void openSecurityPasswordSettingActivity(Activity activity);

    void passportVerifyCode(Context context, com.alibaba.fastjson.JSONObject jSONObject);

    Collection<? extends AbstractC54125a> provideAccountSettingComponents(Activity activity);

    IEnv provideEnv(Context context);

    void putDeviceSetting(String str, String str2, IGetDataCallback<DeviceSetting> iGetDataCallback);

    void refreshTenantData(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback);

    void registerChangeObserver(IAccountChangeObserver.AbstractC49385a aVar);

    void registerDybridPlugin();

    void registerInterceptor(IAccountInterceptor iAccountInterceptor);

    void registerLoginEnvChangeListener(AbstractC49370a.AbstractC49371a aVar);

    void registerOnlinePush();

    void registerSwitchTenantListener(AbstractC49404s sVar);

    void registerTenantInfoListener(AbstractC49405t tVar);

    void registerUserSwitchListener(AbstractC49379a aVar);

    boolean removeDeviceIdChangeListener(AbstractC49390d.AbstractC49391a aVar);

    void removePushDeviceNotifySettingListener(AbstractC49399l lVar);

    void removePushDeviceOnlineStatusListener(AbstractC49400m mVar);

    void runOfflineLogoutTask();

    String rustSdkLogSubPath();

    String serverUnit();

    void showSwitchAnimStageTwoIfNeed(Activity activity);

    void simplifyLogin(Context context, String str, String str2);

    void startAccountAndSecurity(Context context, String str);

    void startQRCodeConfirmActivity(Context context, String str, BaseStepData baseStepData);

    void startSecurityVerify(Context context, String str, String str2, AbstractC49402q qVar);

    void switchLoginTenantUserIPC(String str, IGetDataCallback<SessionResult> iGetDataCallback);

    void switchTenant(Context context, TenantInfo tenantInfo);

    void switchTenant(String str, IGetDataCallback<Boolean> iGetDataCallback);

    void switchToNextValidUser(Context context, int i, IGetDataCallback<User> iGetDataCallback);

    void switchUser(Context context, String str, IGetDataCallback<C49382d> iGetDataCallback);

    boolean syncUpdateDevice(String str, String str2, String str3);

    void unInitPassportModule();

    void unRegisterChangeObservers(IAccountChangeObserver.AbstractC49385a aVar);

    void unRegisterCheck(Context context, int i, IGetDataCallback<String> iGetDataCallback);

    void unRegisterSwitchTenantListener(AbstractC49404s sVar);

    void unRegisterTenantInfoListener(AbstractC49405t tVar);

    void unregisterUserSwitchListener(AbstractC49379a aVar);

    void updateAvatarKey(String str, String str2);

    void upgradeToTeam(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback);

    void userSdkOAuth(String str, String str2, String str3, String str4, String str5, IGetDataCallback<String> iGetDataCallback);
}
