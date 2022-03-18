package com.ss.android.lark.account_provider;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.p2069j.p2070a.C40651r;
import com.ss.android.lark.passport.device.service.impl.C48981b;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.config.PassportConfigHelper;
import com.ss.android.lark.passport.infra.listenermanage.LoginListenerManager;
import com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.service.AbstractC49128n;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote;
import com.ss.android.lark.passport.infra.service.IUserListService;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49138a;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.infra.util.C49229z;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.ISigninSdkApi;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.entity.C49368c;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.SSOConfirmStepInfo;
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
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49402q;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49403r;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49404s;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49405t;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceManager;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginManisService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ISSOSDKAuthService;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.android.lark.security.C54055a;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.lark.android.passport.biz.C64356c;
import com.ss.lark.android.passport.biz.account.C64291a;
import com.ss.lark.android.passport.biz.account.migration.PassportUpgradeActivity;
import com.ss.lark.android.passport.biz.account.migration.SessionUpgradeChecker;
import com.ss.lark.android.passport.biz.compat.login.C64383a;
import com.ss.lark.android.passport.biz.compat.login.C64387b;
import com.ss.lark.android.passport.biz.compat.login.C64388c;
import com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64393a;
import com.ss.lark.android.passport.biz.compat.login.serviceimpl.C64395b;
import com.ss.lark.android.passport.biz.compat.tenant.C64471a;
import com.ss.lark.android.passport.biz.compat.tenant.TenantPush;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.p3218a.C64599a;
import com.ss.lark.android.passport.biz.feature.accountandsecurity.p3218a.C64600b;
import com.ss.lark.android.passport.biz.feature.sso.loading.CommonLoadingActivity;
import com.ss.lark.android.passport.biz.jsbridge.C65152a;
import com.ss.lark.android.passport.biz.jsbridge.H5PassportPlugin;
import com.ss.lark.android.passport.biz.lazyapi.SigninSdkImpl;
import com.ss.lark.android.passport.biz.link_handler.C65158a;
import com.ss.lark.android.passport.biz.link_handler.C65159c;
import com.ss.lark.android.passport.biz.link_handler.C65162e;
import com.ss.lark.android.passport.biz.link_handler.C65173j;
import com.ss.lark.android.passport.biz.utils.C65249d;
import ee.android.framework.manis.C68183b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ss.android.lark.account_provider.b */
public class C28503b implements AbstractC49397k {

    /* renamed from: a */
    public final PassportLog f71651a = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: B */
    public void mo101385B() {
        TenantPush.m253344a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: h */
    public void mo101451h() {
        LoginListenerManager.m193625a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101413a(Context context, String str, final IGetDataCallback<C49382d> iGetDataCallback) {
        ((AbstractC49128n) ServiceFinder.m193746a(AbstractC49128n.class)).switchUser(context, str, new IGetDataCallback<C49382d>() {
            /* class com.ss.android.lark.account_provider.C28503b.C285041 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                } else {
                    C28503b.this.f71651a.mo171471d("PassportModule", "switchUser onError, but callback is null");
                }
            }

            /* renamed from: a */
            public void onSuccess(C49382d dVar) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback == null || dVar == null) {
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult(-1, "switchUser onSuccess, but callback is null"));
                    }
                    C28503b.this.f71651a.mo171471d("PassportModule", "switchUser onSuccess, but callback is null");
                    return;
                }
                C28503b.this.f71651a.mo171465b("PassportModule", "SwitchUser onSuccess");
                iGetDataCallback.onSuccess(dVar);
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101424a(String str, IGetDataCallback<C49376b> iGetDataCallback) {
        mo101433b(LarkContext.getApplication(), str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101416a(IGetDataCallback<C49376b> iGetDataCallback) {
        mo101431b(LarkContext.getApplication(), iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101411a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            this.f71651a.mo171471d("PassportModule", "openPassportPage path is null");
            return;
        }
        String path = Uri.parse(str).getPath();
        if (str.contains("account_management")) {
            C49092f.m193531a(context, "account_management", (JSONObject) null, RouterScene.ACCOUNT_MANAGER.value, this.f71651a, (AbstractC49336a) null);
        }
        if ("/client/tenant/join_team".contains(path)) {
            new C65159c().mo103483c(context, new AppLink(str, 0));
        } else if ("/client/tenant/upgrade_or_create_team".contains(path)) {
            new C65173j().mo103483c(context, new AppLink(str, 0));
        } else if ("/client/tenant/team_conversion_selection".contains(path)) {
            new C65158a().mo103483c(context, new AppLink(str, 0));
        } else if ("/client/tenant/personal_use".contains(path)) {
            new C65162e().mo103483c(context, new AppLink(str, 0));
        } else if ("/client/passport/password".contains(path)) {
            new C64600b().mo103483c(context, new AppLink(str, 0));
        } else if ("/client/passport/account_management".contains(path)) {
            new C64599a().mo103483c(context, new AppLink(str, 0));
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101412a(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.contains("safety_mode")) {
                this.f71651a.mo171465b("n_action_open_sso_sdk_auth", "old version sdk");
                m104401c(context, str);
                return;
            }
            this.f71651a.mo171465b("n_action_open_sso_sdk_auth", "new version sdk, safety mode");
            m104400b(context, str, bundle);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101426a(String str, String str2, String str3, String str4, String str5, final IGetDataCallback<String> iGetDataCallback) {
        this.f71651a.mo171465b("n_action_auth_auto_check", "userSdkOAuth start");
        if (m104399a(str, str2, str3)) {
            this.f71651a.mo171471d("n_action_auth_auto_check", "userSdkOAuth return forappId or packageId or signature is invalid");
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(new ErrorResult(-1, "appId or packageId or signature is invalid"));
                return;
            }
            return;
        }
        ISSOSDKAuthService pVar = (ISSOSDKAuthService) ServiceFinder.m193746a(ISSOSDKAuthService.class);
        if (pVar != null) {
            this.f71651a.mo171465b("n_action_auth_auto_check", "userSdkOAuth request start");
            pVar.userSdkOAuth(WatcherUniContext.m193676e(), str, str2, str3, str4, str5, new IGetDataCallback<SSOConfirmStepInfo>() {
                /* class com.ss.android.lark.account_provider.C28503b.C285052 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C28503b.this.f71651a.mo171471d("n_action_auth_auto_check", PassportLog.m193685a("userSdkOauth failed,", errorResult));
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }

                /* renamed from: a */
                public void onSuccess(SSOConfirmStepInfo sSOConfirmStepInfo) {
                    if (sSOConfirmStepInfo == null || iGetDataCallback == null) {
                        C28503b.this.f71651a.mo171471d("n_action_auth_auto_check", "ssoConfirmData or stepInfo is null");
                        return;
                    }
                    C28503b.this.f71651a.mo171465b("n_action_auth_auto_check", "userSdkOAuth onSuccess");
                    iGetDataCallback.onSuccess(C28503b.this.mo101401a(sSOConfirmStepInfo.uri));
                }
            });
            return;
        }
        this.f71651a.mo171471d("n_action_auth_auto_check", "ISSOSDKAuthService find result is null");
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101414a(Context context, String str, BaseStepData baseStepData) {
        IQRLoginService nVar = (IQRLoginService) ServiceFinder.m193746a(IQRLoginService.class);
        if (nVar != null) {
            nVar.startQRCodeConfirmActivity(context, str, baseStepData);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101425a(String str, String str2, IGetDataCallback<TenantInfo> iGetDataCallback) {
        C64471a.f162788a.mo223062a(str, str2, iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101423a(AbstractC49405t tVar) {
        C64471a.f162788a.mo223060a(tVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101439b(AbstractC49405t tVar) {
        C64471a.f162788a.mo223066b(tVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101422a(AbstractC49404s sVar) {
        C64471a.f162788a.mo223059a(sVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101438b(AbstractC49404s sVar) {
        C64471a.f162788a.mo223065b(sVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101410a(Context context, TenantInfo tenantInfo) {
        if (tenantInfo == null) {
            this.f71651a.mo171471d("PassportModule", "tenantInfo is null");
        } else {
            mo101413a(context, tenantInfo.getUserId(), new IGetDataCallback<C49382d>() {
                /* class com.ss.android.lark.account_provider.C28503b.C285096 */

                /* renamed from: a */
                public void onSuccess(C49382d dVar) {
                    C28503b.this.f71651a.mo171465b("PassportModule", "SwitchTenant, switch user onSuccess");
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C28503b.this.f71651a.mo171471d("PassportModule", "SwitchTenant, switch user onError");
                }
            });
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101417a(AbstractC49352d<String> dVar) {
        C48998a.f123026a.mo171062a(dVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101419a(AbstractC49399l lVar) {
        if (lVar != null) {
            C48981b.m192898a().mo171012a(lVar);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101420a(AbstractC49400m mVar) {
        if (mVar != null) {
            C48981b.m192898a().mo171013a(mVar);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101437b(AbstractC49400m mVar) {
        if (mVar != null) {
            C48981b.m192898a().mo171016b(mVar);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101415a(Context context, String str, String str2, AbstractC49402q qVar) {
        C54055a.f133856a.mo185054a(context, str, str2, qVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101421a(AbstractC49403r rVar) {
        C54055a.f133856a.mo185055a(rVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101440b(String str, final String str2) {
        PassportLog passportLog = this.f71651a;
        passportLog.mo171465b("PassportModule", "external updateAvatarKey, userId: " + str);
        ServiceFinder.m193744a().updateUser(str, "external update avatar key", new Function1<User, Unit>() {
            /* class com.ss.android.lark.account_provider.C28503b.C285107 */

            /* renamed from: a */
            public Unit invoke(User user) {
                user.avatarKey = str2;
                return null;
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: C */
    public List<TenantInfo> mo101386C() {
        return C64471a.f162788a.mo223068c();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: D */
    public List<TenantInfo.PendingUser> mo101387D() {
        return C64471a.f162788a.mo223069d();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: E */
    public int mo101388E() {
        return C64471a.f162788a.mo223070e();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: F */
    public String mo101389F() {
        return C48998a.f123026a.mo171069d();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: H */
    public AbstractC49370a mo101391H() {
        return ServiceFinder.m193749d();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: I */
    public boolean mo101392I() {
        return C48998a.f123026a.mo171066a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: J */
    public String mo101393J() {
        return C48998a.f123026a.mo171071f();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: K */
    public String mo101394K() {
        return C48998a.f123026a.mo171073h();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: L */
    public IDeviceService mo101395L() {
        return ServiceFinder.m193761p();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: N */
    public AbstractC49390d mo101397N() {
        return ServiceFinder.m193762q();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: P */
    public ISigninSdkApi mo101399P() {
        return new SigninSdkImpl();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: g */
    public TenantInfo mo101450g() {
        return mo101463t();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: n */
    public AbstractC49389b mo101457n() {
        return C64387b.m253089a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: o */
    public IAccountChangeObserver mo101458o() {
        return C64383a.m253083a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: p */
    public ILoginService mo101459p() {
        return C64395b.m253103a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: q */
    public AbstractC49394g mo101460q() {
        return C64393a.m253096b();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: r */
    public int mo101461r() {
        return C65249d.m256139a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: s */
    public AbstractC49388a mo101462s() {
        return C49138a.m193781a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: u */
    public boolean mo101464u() {
        return PassportConfigHelper.m193019a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: x */
    public String mo101467x() {
        return C64291a.m252813d();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: A */
    public AbstractC49393f mo101384A() {
        return (AbstractC49393f) ServiceFinder.m193746a(AbstractC49393f.class);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: G */
    public boolean mo101390G() {
        return ServiceFinder.m193749d().isCnEnv();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: M */
    public IDeviceManager mo101396M() {
        return ServiceFinder.m193761p().getDeviceManager();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: O */
    public AbstractC49384b mo101398O() {
        return ServiceFinder.m193763r().getKaIdp();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: e */
    public boolean mo101448e() {
        return ServiceFinder.m193748c().isLogin();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: f */
    public User mo101449f() {
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser == null) {
            return new User();
        }
        return foregroundUser;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: i */
    public LoginInfo mo101452i() {
        return ServiceFinder.m193748c().getLoginInfo();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: j */
    public String mo101453j() {
        return ServiceFinder.m193748c().getUserId();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: k */
    public boolean mo101454k() {
        return ServiceFinder.m193748c().isByteDanceTenant();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: l */
    public String mo101455l() {
        return ServiceFinder.m193748c().getTenantCode();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: m */
    public boolean mo101456m() {
        return ServiceFinder.m193748c().isCustomer();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: t */
    public TenantInfo mo101463t() {
        return C64471a.f162788a.mo223057a(ServiceFinder.m193748c().getUserId());
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: y */
    public IQRLoginService mo101468y() {
        return (IQRLoginService) ServiceFinder.m193746a(IQRLoginService.class);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: Q */
    public void mo101400Q() {
        this.f71651a.mo171465b("PassportModule", "runOfflineLogoutTask");
        C28498a.m104383a().mo101375c();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101429b() {
        C28498a.m104383a().mo101380h();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: c */
    public boolean mo101443c() {
        return SessionUpgradeChecker.m252935a();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: d */
    public List<User> mo101444d() {
        IUserListService iUserListService = (IUserListService) ServiceFinder.m193746a(IUserListService.class);
        if (iUserListService == null) {
            return new ArrayList();
        }
        return iUserListService.getAllValidUserList();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: w */
    public boolean mo101466w() {
        User e;
        IUserService e2 = ServiceFinder.m193750e();
        if (e2 == null || (e = e2.mo171597e()) == null) {
            return false;
        }
        return e.isSmallB();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: z */
    public void mo101469z() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("biz.user.userInfo.get");
        ServiceFinder.m193752g().registerPlugin(new H5PluginConfig(new C65152a(), arrayList));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: v */
    public void mo101465v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("biz.passport.stateMachine");
        arrayList.add("biz.account.appInfo");
        arrayList.add("h5PageClosed");
        arrayList.add("h5PageCreated");
        arrayList.add("biz.account.unRegisterFinish");
        arrayList.add("biz.account.unRegisterRedPacket");
        ServiceFinder.m193752g().registerPlugin(new H5PluginConfig(new H5PassportPlugin(), arrayList));
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101405a() {
        C28498a.m104383a().mo101378f();
        C28498a.m104383a().mo101376d();
        C28498a.m104383a().mo101379g();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101418a(AbstractC49379a aVar) {
        UserSwitchListenerManager.m193648a(aVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101435b(AbstractC49379a aVar) {
        UserSwitchListenerManager.m193650b(aVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public List<AbstractC54125a> mo101403a(Activity activity) {
        return C64356c.f162622a.mo222901b(activity);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public String mo101428b(String str) {
        return PassportConfigHelper.m193016a(str);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: c */
    public TenantInfo mo101441c(String str) {
        return C64471a.f162788a.mo223057a(str);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: d */
    public void mo101445d(Context context) {
        C54055a.f133856a.mo185053a(context);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: e */
    public void mo101447e(Context context) {
        C64388c.m253090a().mo222942a(context);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public Map<String, AbstractC29186b> mo101404a(Context context) {
        return C64356c.f162622a.mo222903c();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public ILoginManisService mo101427b(Context context) {
        return (ILoginManisService) C68183b.m264839a().mo237086a(context, ILoginManisService.class);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: c */
    public void mo101442c(Context context) {
        C64356c.f162622a.mo222897a(context);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: d */
    public void mo101446d(String str) {
        C64471a.f162788a.mo223067b(str);
    }

    /* renamed from: a */
    public String mo101401a(String str) {
        if (TextUtils.isEmpty(str)) {
            return String.valueOf(-1);
        }
        Uri parse = Uri.parse(str);
        if (parse == null || TextUtils.isEmpty(parse.getQueryParameter("code"))) {
            return String.valueOf(-1);
        }
        return parse.getQueryParameter("code");
    }

    public C28503b(AbstractC49397k.C49398a aVar) {
        for (int i = 0; i < aVar.mo172440a().size(); i++) {
            C49121a.m193727a().mo171505a(aVar.mo172440a().keyAt(i), aVar.mo172440a().valueAt(i));
        }
        C49121a.m193727a().mo171503a(1161);
        C49121a.m193727a().mo171504a(1, new C49368c("300011971960", "92F73C02D42B096941B405D9AB3E564C"));
        C49121a.m193727a().mo171504a(2, new C49368c("99166000000000001998", "2a53e79c6a476a2147a032ece796ba0e"));
        C49121a.m193727a().mo171504a(3, new C49368c("8236426536", "W0yPI0aMx9UVzWjBXYDBHMjxkelJpw7Q"));
        C28498a.m104383a().mo101374b();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101434b(IGetDataCallback<Boolean> iGetDataCallback) {
        C64356c.f162622a.mo222900a(iGetDataCallback);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101436b(AbstractC49399l lVar) {
        if (lVar != null) {
            C48981b.m192898a().mo171015b(lVar);
        }
    }

    /* renamed from: c */
    private void m104401c(Context context, String str) {
        UniContext e = WatcherUniContext.m193676e();
        Intent intent = new Intent(context, CommonLoadingActivity.class);
        intent.putExtra("sso_url", str);
        intent.putExtra("activity_flag", "SSO_SDK");
        intent.putExtra("key_of_uni_context", e);
        intent.setFlags(268435456);
        context.startActivity(intent);
        e.appendOneSceneMonitorParam("sdk_version", "old");
        WatcherHelper.m193664a(e, C40651r.f103150l);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public String mo101402a(String str, String str2) {
        String str3;
        Application application = LarkContext.getApplication();
        try {
            str3 = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        } catch (Exception e) {
            this.f71651a.mo171462a("PassportModule", "sendRequestBeforeGetToken, init error", e);
            str3 = "";
        }
        return ServiceFinder.m193752g().getCaptchaTokenSync(str, str2, str3, "android");
    }

    /* renamed from: b */
    public void mo101431b(Context context, IGetDataCallback<C49376b> iGetDataCallback) {
        ILogoutUserService hVar = (ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class);
        if (hVar != null) {
            hVar.logoutAll(context, iGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101432b(Context context, String str) {
        C64356c.f162622a.mo222899a(context, str);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101407a(Context context, Intent intent) {
        ComponentName callingActivity;
        Intent intent2 = new Intent(context, PassportUpgradeActivity.class);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                intent2.putExtras(extras);
            }
            Uri data = intent.getData();
            if (data != null) {
                intent2.putExtra("extra_uri_from_link", data);
            }
            if ((context instanceof Activity) && (callingActivity = ((Activity) context).getCallingActivity()) != null) {
                intent2.putExtra("extra_calling_activity_package_name", callingActivity.getPackageName());
                intent2.putExtra("extra_calling_activity_class_name", callingActivity.getClassName());
            }
        }
        context.startActivity(intent2);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101408a(Context context, JSONObject jSONObject) {
        C64356c.f162622a.mo222898a(context, jSONObject);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101409a(Context context, final IGetDataCallback<String> iGetDataCallback) {
        if (C49224w.m194054b(LarkContext.getApplication())) {
            C64395b.m253103a().mo172412a(context, true, "", new AbstractC49338a() {
                /* class com.ss.android.lark.account_provider.C28503b.C285063 */

                @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
                public void onResult(boolean z) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        if (z) {
                            iGetDataCallback.onSuccess(null);
                        } else {
                            iGetDataCallback.onError(new ErrorResult("logout error"));
                        }
                    }
                }
            });
        } else {
            ((ILogoutUserServiceRemote) C68183b.m264839a().mo237086a(context, ILogoutUserServiceRemote.class)).logout(new ILogoutUserServiceRemote.ILogoutCallBack() {
                /* class com.ss.android.lark.account_provider.C28503b.C285074 */

                @Override // com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote.ILogoutCallBack
                public void onResult(boolean z) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        if (z) {
                            iGetDataCallback.onSuccess(null);
                        } else {
                            iGetDataCallback.onError(new ErrorResult("logout error"));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private boolean m104399a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: b */
    public void mo101430b(Context context, int i, final IGetDataCallback<String> iGetDataCallback) {
        FeatureCApi.m253691a(i, UniContext.CONTEXT_GLOBAL, new ICallback<BaseStepData>() {
            /* class com.ss.android.lark.account_provider.C28503b.C285085 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult(networkErrorResult.getErrorCode(), networkErrorResult.getErrorMessage()));
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                if (iGetDataCallback == null) {
                    return;
                }
                if (responseModel.getData() == null || responseModel.getData().stepInfo == null) {
                    iGetDataCallback.onError(new ErrorResult(-1, "unregister check return empty step info"));
                } else {
                    iGetDataCallback.onSuccess(responseModel.getData().stepInfo.toJSONString());
                }
            }
        });
    }

    /* renamed from: b */
    private void m104400b(Context context, String str, Bundle bundle) {
        UniContext e = WatcherUniContext.m193676e();
        String string = bundle.getString("package_id");
        String string2 = bundle.getString("class_name");
        if (!TextUtils.isEmpty(string)) {
            List<String> a = C49229z.m194069a(context, string);
            if (a == null || a.size() == 0) {
                this.f71651a.mo171471d("PassportModule", "the md5 list is null");
                return;
            } else if (C49229z.m194070a(context, string, a.get(0))) {
                PassportLog passportLog = this.f71651a;
                passportLog.mo171465b("PassportModule", "packageName is " + string + ",md5 is " + a.get(0));
                Intent intent = new Intent(context, CommonLoadingActivity.class);
                intent.putExtra("sso_url", str);
                intent.putExtra("activity_flag", "SSO_SDK");
                intent.putExtra("package_id", string);
                intent.putExtra("signature", a.get(0));
                intent.putExtra("class_name", string2);
                intent.putExtra("key_of_uni_context", e);
                intent.setFlags(268435456);
                context.startActivity(intent);
            } else {
                this.f71651a.mo171471d("PassportModule", "Package name and signature verification failed");
            }
        } else {
            this.f71651a.mo171471d("PassportModule", "the PackageName is null");
        }
        e.appendOneSceneMonitorParam("sdk_version", "safety");
        WatcherHelper.m193664a(e, C40651r.f103150l);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49397k
    /* renamed from: a */
    public void mo101406a(Context context, int i, IGetDataCallback<User> iGetDataCallback) {
        AbstractC49128n nVar = (AbstractC49128n) ServiceFinder.m193746a(AbstractC49128n.class);
        if (nVar != null) {
            nVar.switchToNextValidUser(context, i, 0, iGetDataCallback);
        } else {
            iGetDataCallback.onError(new ErrorResult("switch user service not found"));
        }
    }

    /* renamed from: b */
    public void mo101433b(Context context, String str, IGetDataCallback<C49376b> iGetDataCallback) {
        ILogoutUserService hVar = (ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class);
        if (hVar != null) {
            hVar.logoutSingle(context, str, iGetDataCallback);
        }
    }
}
