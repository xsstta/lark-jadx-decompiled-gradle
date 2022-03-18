package com.ss.android.lark.integrator.im;

import android.app.Activity;
import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.integrator.im.dependency.AbstractC39579v;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49393f;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49403r;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.utils.ApiUtils;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.m */
class C39714m implements AbstractC39579v {
    C39714m() {
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public boolean mo143667a() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isLogin();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143666a(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).refreshTenantData(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: b */
    public String mo143668b() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: c */
    public String mo143672c() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getSession();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: d */
    public TenantInfo mo143673d() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantInfo();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: f */
    public boolean mo143675f() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isOverseaTenantBrand();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: g */
    public String mo143676g() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: h */
    public boolean mo143677h() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isSmallBUser();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: i */
    public AbstractC49389b mo143678i() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: j */
    public IAccountChangeObserver mo143679j() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountObserver();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: k */
    public IDeviceService mo143680k() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceService();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: l */
    public IDeviceManager mo143681l() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceManager();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: m */
    public ILoginService mo143682m() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLoginService();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: n */
    public List<TenantInfo> mo143683n() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantData();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: o */
    public int mo143684o() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getLocalTenantAccountUserAccount();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: p */
    public List<TenantInfo.PendingUser> mo143685p() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getPendingUsers();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: q */
    public AbstractC49393f mo143686q() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getTenantService();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: r */
    public boolean mo143687r() {
        return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).isBoe();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: s */
    public int mo143688s() {
        return C49121a.m193727a().mo171506b();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: e */
    public String mo143674e() {
        LoginInfo a = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getAccountManager().mo172419a();
        if (a == null) {
            return "";
        }
        return a.getTenantId();
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143661a(C28513a.AbstractC28514a aVar) {
        C28513a.m104512a(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143656a(Activity activity) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).openSecurityPasswordSettingActivity(activity);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143657a(Context context) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).openContactPointManagerPage(context);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: b */
    public void mo143669b(AbstractC49379a aVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).unregisterUserSwitchListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: b */
    public void mo143670b(AbstractC49399l lVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).removePushDeviceNotifySettingListener(lVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: b */
    public void mo143671b(AbstractC49400m mVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).removePushDeviceOnlineStatusListener(mVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143660a(IGetDataCallback<Boolean> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).checkMyPhoneNumberValid86(iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143662a(AbstractC49379a aVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).registerUserSwitchListener(aVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143663a(AbstractC49399l lVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addPushDeviceNotifySettingListener(lVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143664a(AbstractC49400m mVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).addPushDeviceOnlineStatusListener(mVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143665a(AbstractC49403r rVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).fetchVerifyStatus(rVar);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143658a(Context context, IGetDataCallback<DeviceId> iGetDataCallback) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDeviceId(context, iGetDataCallback);
    }

    @Override // com.ss.android.lark.integrator.im.dependency.AbstractC39579v
    /* renamed from: a */
    public void mo143659a(Context context, String str, String str2, AbstractC49402q qVar) {
        ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).startSecurityVerify(context, str, str2, qVar);
    }
}
