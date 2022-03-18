package com.ss.android.lark.integrator.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.core.dependency.AbstractC36128n;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
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
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.core.o */
class C39387o implements AbstractC36128n {
    C39387o() {
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public boolean mo133072a() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isSessionNeedUpgrade();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public boolean mo133082b() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133081b(String str, String str2) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).updateAvatarKey(str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133067a(AbstractC49404s sVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerSwitchTenantListener(sVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133064a(AbstractC49379a aVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(aVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133066a(AbstractC49400m mVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addPushDeviceOnlineStatusListener(mVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133065a(AbstractC49399l lVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addPushDeviceNotifySettingListener(lVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133070a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).switchTenant(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133060a(Context context, String str, Bundle bundle) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).openSSOSdkAuthPage(context, str, bundle);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133059a(Context context, String str) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).startAccountAndSecurity(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133068a(AbstractC49405t tVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerTenantInfoListener(tVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133063a(IGetDataCallback<C49376b> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).logoutAllUsers(iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133061a(Context context, String str, IGetDataCallback<C49382d> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).switchUser(context, str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133062a(Context context, String str, BaseStepData baseStepData) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).startQRCodeConfirmActivity(context, str, baseStepData);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133071a(String str, String str2, String str3, IGetDataCallback<Boolean> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).upgradeToTeam(str, str2, str3, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133069a(String str, int i) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).onSwitchTenantUserClick(str, i);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: A */
    public boolean mo133042A() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isEnableLanguageBeforeLogin();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: B */
    public String mo133043B() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginDeviceId();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: C */
    public int mo133044C() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLocalTenantAccountUserAccount();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: D */
    public boolean mo133045D() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isCNEnv();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: E */
    public List<User> mo133046E() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAllValidUserList();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: F */
    public User mo133047F() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getForegroundUser();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: G */
    public TenantInfo mo133048G() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getForegroundTenant();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: H */
    public int mo133049H() {
        return C49121a.m193727a().mo171506b();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: c */
    public int mo133083c() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginType();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: d */
    public String mo133085d() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: e */
    public String mo133086e() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: f */
    public TenantInfo mo133087f() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantInfo();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: h */
    public boolean mo133089h() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isOverseaTenantBrand();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: i */
    public String mo133090i() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: j */
    public String mo133091j() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserUnit();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: k */
    public ISigninSdkApi mo133092k() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSigninApi();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: l */
    public IQRLoginService mo133093l() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getQRLoginService();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: m */
    public AbstractC49389b mo133094m() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: n */
    public IAccountChangeObserver mo133095n() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountObserver();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: o */
    public AbstractC49390d mo133096o() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceIdService();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: p */
    public IDeviceService mo133097p() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceService();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: q */
    public IDeviceManager mo133098q() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceManager();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: r */
    public AbstractC49394g mo133099r() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginExService();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: s */
    public ILoginService mo133100s() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginService();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: t */
    public AbstractC49370a mo133101t() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getEnvService();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: u */
    public AbstractC49388a mo133102u() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountInterceptProcessor();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: v */
    public void mo133103v() {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerDybridPlugin();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: w */
    public boolean mo133104w() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isSmallBUser();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: x */
    public AbstractC49384b mo133105x() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getKaIdp();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: y */
    public List<TenantInfo> mo133106y() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantData();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: z */
    public AbstractC49393f mo133107z() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantsByIdsService();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: I */
    public List<TenantInfo.PendingUser> mo133050I() {
        return new ArrayList(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getPendingUsers());
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: g */
    public String mo133088g() {
        LoginInfo loginInfo = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginInfo();
        if (loginInfo == null) {
            return "";
        }
        return loginInfo.getTenantId();
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public TenantInfo mo133052a(String str) {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantInfo(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133076b(AbstractC49379a aVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unregisterUserSwitchListener(aVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133077b(AbstractC49400m mVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).removePushDeviceOnlineStatusListener(mVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133078b(AbstractC49405t tVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unRegisterTenantInfoListener(tVar);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133079b(String str) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).changeTenantComplete(str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133074b(Context context, IGetDataCallback<String> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).logout(context, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: c */
    public void mo133084c(String str, IGetDataCallback<SessionResult> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).switchLoginTenantUserIPC(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public String mo133053a(String str, String str2) {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getCaptchaToken(str, str2);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133075b(Context context, String str) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).openPassportPage(context, str);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133055a(Context context, Intent intent) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).gotoPassportUpgrade(context, intent);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133056a(Context context, JSONObject jSONObject) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).passportVerifyCode(context, jSONObject);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133057a(Context context, IGetDataCallback<DeviceId> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(context, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133058a(Context context, TenantInfo tenantInfo) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).switchTenant(context, tenantInfo);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133080b(String str, IGetDataCallback<C49376b> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).logoutUser(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: b */
    public void mo133073b(Context context, int i, IGetDataCallback<User> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).switchToNextValidUser(context, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public void mo133054a(Context context, int i, IGetDataCallback<String> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unRegisterCheck(context, i, iGetDataCallback);
    }

    @Override // com.ss.android.lark.core.dependency.AbstractC36128n
    /* renamed from: a */
    public Fragment mo133051a(String str, String str2, String str3, String str4, IGetDataCallback<String> iGetDataCallback) {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSettingTeamNameFrg(str, str2, str3, str4, iGetDataCallback);
    }
}
