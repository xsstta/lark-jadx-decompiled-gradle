package com.ss.android.lark.integrator.passport;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.integrator.p2019f.C39404b;
import com.ss.android.lark.integrator.p2019f.C39407c;
import com.ss.android.lark.integrator.passport.env.AppEnv;
import com.ss.android.lark.integrator.passport.env.C39957a;
import com.ss.android.lark.integrator.passport.lazy.C39959a;
import com.ss.android.lark.integrator.tenant.SwitchTenantHitPoint;
import com.ss.android.lark.p2567s.p2568a.p2577i.C53211a;
import com.ss.android.lark.p2567s.p2568a.p2577i.C53212b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
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
import com.ss.android.lark.passport.signinsdk_api.idp.IGetIdpTokenCallback;
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
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.passport_api.IEnv;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.feature.session.SessionInvalidProcessor;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

@ClaymoreImpl(IPassportApi.class)
public class PassportApiImpl implements IPassportApi {
    public static final PassportLog log = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public Fragment getSettingTeamNameFrg(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
        return null;
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void guestLogin(Context context, String str, String str2, AbstractC49358c cVar) {
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isGuestUser() {
        return false;
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void simplifyLogin(Context context, String str, String str2) {
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void upgradeToTeam(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback) {
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public Map<String, String> getAutoInitModuleConfigMap() {
        return C53211a.f131548a;
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public Map<String, String> getThirdPartyModuleConfigMap() {
        return C53211a.f131549b;
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public Map<String, String> getThirdPartyPrefixModuleConfigMap() {
        return C53211a.f131550c;
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void dispatchFastLogin() {
        C39959a.m158588a().mo101451h();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void initPassportModule() {
        C39959a.m158588a().mo101405a();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isUsPackage() {
        return C39954b.m158574a();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerOnlinePush() {
        C39959a.m158588a().mo101385B();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void runOfflineLogoutTask() {
        C39959a.m158588a().mo101400Q();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void unInitPassportModule() {
        C39959a.m158588a().mo101429b();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public int envType() {
        return AppEnv.m158575a().mo145139d();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49388a getAccountInterceptProcessor() {
        return C39959a.m158588a().mo101462s();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49389b getAccountManager() {
        return C39959a.m158588a().mo101457n();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public IAccountChangeObserver getAccountObserver() {
        return C39959a.m158588a().mo101458o();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public List<User> getAllValidUserList() {
        return C39959a.m158588a().mo101444d();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getCnUnit() {
        return C39959a.m158588a().mo101394K();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getDeviceId() {
        return C39959a.m158588a().mo101397N().getDeviceId();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getDeviceIdFromLocal() {
        return C39959a.m158588a().mo101397N().getDeviceIdFromLocal();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49390d getDeviceIdService() {
        return C39959a.m158588a().mo101397N();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public IDeviceManager getDeviceManager() {
        return C39959a.m158588a().mo101396M();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getDevicePlatform() {
        return C39959a.m158588a().mo101395L().getDevicePlatform();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public IDeviceService getDeviceService() {
        return C39959a.m158588a().mo101395L();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49370a getEnvService() {
        return C39959a.m158588a().mo101391H();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public TenantInfo getForegroundTenant() {
        return C39959a.m158588a().mo101450g();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public User getForegroundUser() {
        return C39959a.m158588a().mo101449f();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49384b getKaIdp() {
        return C39959a.m158588a().mo101398O();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public int getLocalTenantAccountUserAccount() {
        return C39959a.m158588a().mo101388E();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public int getLoginAppId() {
        return C49121a.m193727a().mo171506b();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getLoginDeviceId() {
        return C39959a.m158588a().mo101467x();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49394g getLoginExService() {
        return C39959a.m158588a().mo101460q();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public LoginInfo getLoginInfo() {
        return C39959a.m158588a().mo101452i();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public ILoginService getLoginService() {
        return C39959a.m158588a().mo101459p();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public int getLoginType() {
        return C39959a.m158588a().mo101461r();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public List<TenantInfo.PendingUser> getPendingUsers() {
        return C39959a.m158588a().mo101387D();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public IQRLoginService getQRLoginService() {
        return C39959a.m158588a().mo101468y();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public ISigninSdkApi getSigninApi() {
        return C39959a.m158588a().mo101399P();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getTenantCode() {
        return C39959a.m158588a().mo101455l();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public List<TenantInfo> getTenantData() {
        return C39959a.m158588a().mo101386C();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public TenantInfo getTenantInfo() {
        return C39959a.m158588a().mo101463t();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49393f getTenantService() {
        return (AbstractC49393f) ApiUtils.getApi(AbstractC49393f.class);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public int getTenantTag() {
        return C39959a.m158588a().mo101449f().getTenantTag();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public AbstractC49393f getTenantsByIdsService() {
        return C39959a.m158588a().mo101384A();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public User getUser() {
        return C39959a.m158588a().mo101449f();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getUserId() {
        return C39959a.m158588a().mo101453j();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getUserUnit() {
        return C39959a.m158588a().mo101389F();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getVaUnit() {
        return C39959a.m158588a().mo101393J();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isBoe() {
        if (AppEnv.m158575a().mo145139d() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isCNEnv() {
        return C39959a.m158588a().mo101390G();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isCurrentEnvSameToAppInternalEnv() {
        return AppEnv.m158575a().mo145137b();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isCustomer() {
        return C39959a.m158588a().mo101456m();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isEnableLanguageBeforeLogin() {
        return C39959a.m158588a().mo101464u();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isLogin() {
        return C39959a.m158588a().mo101448e();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isOverseaTenantBrand() {
        return C39959a.m158588a().mo101392I();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isPrimaryHost() {
        return C39959a.m158588a().mo101454k();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isSessionNeedUpgrade() {
        return C39959a.m158588a().mo101443c();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isSmallBUser() {
        return C39959a.m158588a().mo101466w();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public int oldSdkEnv() {
        return AppEnv.m158575a().mo145138c();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerDybridPlugin() {
        C39959a.m158588a().mo101469z();
        C39959a.m158588a().mo101465v();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String rustSdkLogSubPath() {
        return AppEnv.m158575a().mo145141f();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String serverUnit() {
        return AppEnv.m158575a().mo145140e();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getAvatarUrl() {
        LoginInfo i = C39959a.m158588a().mo101452i();
        if (i == null) {
            return "";
        }
        return i.getAvatarUrl();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getSession() {
        LoginInfo i = C39959a.m158588a().mo101452i();
        if (i == null) {
            return "";
        }
        return i.getSession();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public Map<String, SessionInfo> getSessions() {
        User f = C39959a.m158588a().mo101449f();
        if (f == null) {
            return new HashMap();
        }
        return f.getSessionWithDomainMap();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getTenantId() {
        TenantInfo g = C39959a.m158588a().mo101450g();
        if (g == null) {
            return "";
        }
        return g.getTenantId();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getTenantName() {
        LoginInfo i = C39959a.m158588a().mo101452i();
        if (i == null) {
            return "";
        }
        return i.getTenantName();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getUserName() {
        LoginInfo i = C39959a.m158588a().mo101452i();
        if (i == null) {
            return "";
        }
        return i.getUserName();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void initProcessorDoInit(String str) {
        C53212b.m205846a(str);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void initSessionExpiredProcessor(Context context) {
        SessionInvalidProcessor.m255030a();
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void showSwitchAnimStageTwoIfNeed(Activity activity) {
        C39407c.m155647b(activity);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void addPushDeviceNotifySettingListener(AbstractC49399l lVar) {
        C39959a.m158588a().mo101419a(lVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void addPushDeviceOnlineStatusListener(AbstractC49400m mVar) {
        C39959a.m158588a().mo101420a(mVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void changeTenantComplete(String str) {
        C39959a.m158588a().mo101446d(str);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void checkMyPhoneNumberValid86(IGetDataCallback<Boolean> iGetDataCallback) {
        C39959a.m158588a().mo101434b(iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void cleanAndRestEnv(AbstractC49352d<String> dVar) {
        C39959a.m158588a().mo101417a(dVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void fetchVerifyStatus(AbstractC49403r rVar) {
        C39959a.m158588a().mo101421a(rVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void interceptRustInitRequest(InitSDKRequest.C15029a aVar) {
        AppEnv.m158575a().mo145136a(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void logoutAllUsers(IGetDataCallback<C49376b> iGetDataCallback) {
        C39959a.m158588a().mo101416a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void openContactPointManagerPage(Context context) {
        C39959a.m158588a().mo101442c(context);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void openInviteTenantJoinWayPage(Context context) {
        C39959a.m158588a().mo101447e(context);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void openSecurityPasswordSettingActivity(Activity activity) {
        C39959a.m158588a().mo101445d(activity);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public IEnv provideEnv(Context context) {
        return C39957a.m158583a(context);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerSwitchTenantListener(AbstractC49404s sVar) {
        C39959a.m158588a().mo101422a(sVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerTenantInfoListener(AbstractC49405t tVar) {
        C39959a.m158588a().mo101423a(tVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerUserSwitchListener(AbstractC49379a aVar) {
        C39959a.m158588a().mo101418a(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void removePushDeviceNotifySettingListener(AbstractC49399l lVar) {
        C39959a.m158588a().mo101436b(lVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void removePushDeviceOnlineStatusListener(AbstractC49400m mVar) {
        C39959a.m158588a().mo101437b(mVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void unRegisterSwitchTenantListener(AbstractC49404s sVar) {
        C39959a.m158588a().mo101438b(sVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void unRegisterTenantInfoListener(AbstractC49405t tVar) {
        C39959a.m158588a().mo101439b(tVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void unregisterUserSwitchListener(AbstractC49379a aVar) {
        C39959a.m158588a().mo101435b(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void addDeviceIdChangeListener(AbstractC49390d.AbstractC49391a aVar) {
        C39959a.m158588a().mo101397N().addDeviceIdChangeListener(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public JSONObject getDeviceInfo(Context context) {
        return C39959a.m158588a().mo101397N().getDeviceInfo(context);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getDynamicUrlFromV3Config(String str) {
        return C39959a.m158588a().mo101428b(str);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public Map<? extends String, ? extends AbstractC29186b> getLoginAppLinkHandlers(Context context) {
        return C39959a.m158588a().mo101404a(context);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean isInLoginActivity(Activity activity) {
        return C39959a.m158588a().mo101460q().mo172435a(activity);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public Collection<? extends AbstractC54125a> provideAccountSettingComponents(Activity activity) {
        return C39959a.m158588a().mo101403a(activity);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerChangeObserver(IAccountChangeObserver.AbstractC49385a aVar) {
        C39959a.m158588a().mo101458o().mo172398a(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerInterceptor(IAccountInterceptor iAccountInterceptor) {
        C39959a.m158588a().mo101462s().mo171621a(iAccountInterceptor);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void registerLoginEnvChangeListener(AbstractC49370a.AbstractC49371a aVar) {
        C39959a.m158588a().mo101391H().registerLoginEnvChangeListener(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean removeDeviceIdChangeListener(AbstractC49390d.AbstractC49391a aVar) {
        return C39959a.m158588a().mo101397N().removeDeviceIdChangeListener(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void unRegisterChangeObservers(IAccountChangeObserver.AbstractC49385a aVar) {
        C39959a.m158588a().mo101458o().mo172399b(aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void getIdpIdentity(final IGetDataCallback<String> iGetDataCallback) {
        C39959a.m158588a().mo101398O().mo171895d().mo171960a((Context) LarkContext.getApplication(), true, (IGetIdpTokenCallback<String>) new IGetIdpTokenCallback<String>() {
            /* class com.ss.android.lark.integrator.passport.PassportApiImpl.C399471 */

            /* renamed from: a */
            public void mo145132a(String str, int i, String str2) {
                if (i == 0 || 1 == i) {
                    iGetDataCallback.onSuccess(str);
                    return;
                }
                iGetDataCallback.onError(new ErrorResult(i, str2));
                if (3 == i) {
                    PassportApiImpl.log.mo171471d("PassportApiImpl", "getIdpIdentity error makes logout");
                    C39959a.m158588a().mo101459p().mo172412a(LarkContext.getApplication(), true, String.format(Locale.getDefault(), "IdpRefreshTokenInvalid makes logout. msg=%s", "ka refresh token invalid"), new AbstractC49338a() {
                        /* class com.ss.android.lark.integrator.passport.PassportApiImpl.C399471.C399481 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
                        public void onResult(boolean z) {
                        }
                    });
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public TenantInfo getTenantInfo(String str) {
        return C39959a.m158588a().mo101441c(str);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void switchTenant(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        C39404b.m155634a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void gotoPassportUpgrade(Context context, Intent intent) {
        C39959a.m158588a().mo101407a(context, intent);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void logout(Context context, IGetDataCallback<String> iGetDataCallback) {
        C39959a.m158588a().mo101409a(context, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void logoutUser(String str, IGetDataCallback<C49376b> iGetDataCallback) {
        C39959a.m158588a().mo101424a(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void onSwitchTenantUserClick(String str, int i) {
        C39404b.m155633a(str);
        SwitchTenantHitPoint.m155630a(i);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void openPassportPage(Context context, String str) {
        C39959a.m158588a().mo101411a(context, str);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void passportVerifyCode(Context context, com.alibaba.fastjson.JSONObject jSONObject) {
        C39959a.m158588a().mo101408a(context, jSONObject);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void startAccountAndSecurity(Context context, String str) {
        C39959a.m158588a().mo101432b(context, str);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void switchTenant(Context context, TenantInfo tenantInfo) {
        C39959a.m158588a().mo101410a(context, tenantInfo);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void updateAvatarKey(String str, String str2) {
        C39959a.m158588a().mo101440b(str, str2);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public String getCaptchaToken(String str, String str2) {
        return C39959a.m158588a().mo101402a(str, str2);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void getDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback) {
        PassportLog.f123351c.mo171474a().mo171465b("PassportApiImpl", "getDeviceId");
        C39959a.m158588a().mo101397N().getDeviceId(context, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void interceptAccount(Context context, final IGetDataCallback<Boolean> iGetDataCallback) {
        C39959a.m158588a().mo101462s().mo171619a(context, new IAccountInterceptor.AbstractC49386a() {
            /* class com.ss.android.lark.integrator.passport.PassportApiImpl.C399492 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
            /* renamed from: b */
            public /* synthetic */ void mo133324b() {
                IAccountInterceptor.AbstractC49386a.CC.$default$b(this);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountInterceptor.AbstractC49386a
            /* renamed from: a */
            public void mo133323a() {
                iGetDataCallback.onSuccess(true);
            }
        });
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void logoutAndLogin(Context context, final IGetDataCallback<String> iGetDataCallback) {
        C39959a.m158588a().mo101459p().mo172412a(context, false, "User makes logout. Mine system setting logout", new AbstractC49338a() {
            /* class com.ss.android.lark.integrator.passport.PassportApiImpl.C399503 */

            @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
            public void onResult(boolean z) {
                if (!z) {
                    PassportApiImpl.log.mo171465b("PassportApiImpl", "logout error");
                    iGetDataCallback.onError(new ErrorResult(-1, ""));
                    return;
                }
                PassportApiImpl.log.mo171465b("PassportApiImpl", "logout success");
                C28513a.m104514a(false);
                iGetDataCallback.onSuccess("");
            }
        });
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void switchLoginTenantUserIPC(String str, final IGetDataCallback<SessionResult> iGetDataCallback) {
        C399514 r0 = new ILoginManisService.AbstractC49387a() {
            /* class com.ss.android.lark.integrator.passport.PassportApiImpl.C399514 */

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService.AbstractC49387a
            public void onSuccess(SessionResult sessionResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(sessionResult);
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService.AbstractC49387a
            public void onError(int i, String str) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult(i, str));
                }
            }
        };
        ILoginManisService b = C39959a.m158588a().mo101427b(LarkContext.getApplication());
        if (b == null) {
            r0.onError(0, "login manis service null");
            log.mo171471d("PassportApiImpl", "switchUser ILoginManisService is null");
            return;
        }
        b.switchLoginTenantUser(str, r0);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void openSSOSdkAuthPage(Context context, String str, Bundle bundle) {
        C39959a.m158588a().mo101412a(context, str, bundle);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void refreshTenantData(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback) {
        C39959a.m158588a().mo101425a(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void startQRCodeConfirmActivity(Context context, String str, BaseStepData baseStepData) {
        C39959a.m158588a().mo101414a(context, str, baseStepData);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void switchToNextValidUser(Context context, int i, IGetDataCallback<User> iGetDataCallback) {
        C39959a.m158588a().mo101406a(context, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void switchUser(Context context, String str, IGetDataCallback<C49382d> iGetDataCallback) {
        C39959a.m158588a().mo101413a(context, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void unRegisterCheck(Context context, int i, IGetDataCallback<String> iGetDataCallback) {
        C39959a.m158588a().mo101430b(context, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void putDeviceSetting(String str, String str2, IGetDataCallback<DeviceSetting> iGetDataCallback) {
        C39959a.m158588a().mo101395L().putDeviceSetting(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public boolean syncUpdateDevice(String str, String str2, String str3) {
        return C39959a.m158588a().mo101395L().syncUpdateDevice(str, str2, str3);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void getDeviceId(Context context, IGetDataCallback<DeviceId> iGetDataCallback, long j) {
        C39959a.m158588a().mo101397N().getDeviceId(context, iGetDataCallback, j);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void startSecurityVerify(Context context, String str, String str2, AbstractC49402q qVar) {
        C39959a.m158588a().mo101415a(context, str, str2, qVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void logout(Context context, boolean z, String str, AbstractC49338a aVar) {
        C39959a.m158588a().mo101459p().mo172412a(context, z, str, aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void logoutWithoutLogin(Context context, boolean z, String str, AbstractC49338a aVar) {
        C39959a.m158588a().mo101459p().mo172414b(context, z, str, aVar);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void openCountrySelect(Fragment fragment, int i, int i2, int i3, int i4) {
        C39959a.m158588a().mo101460q().mo172433a(fragment, i, i2, i3, i4);
    }

    @Override // com.ss.android.lark.passport_api.IPassportApi
    public void userSdkOAuth(String str, String str2, String str3, String str4, String str5, IGetDataCallback<String> iGetDataCallback) {
        C39959a.m158588a().mo101426a(str, str2, str3, str4, str5, iGetDataCallback);
    }
}
