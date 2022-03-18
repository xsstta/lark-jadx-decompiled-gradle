package com.ss.lark.android.passport.biz.feature.login_input.mvp;

import android.app.Activity;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.network.handler.UnknownCodeHandler;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.base.storage.util.IsolateStorageUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.account.UserGlobalKeys;
import com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil;
import com.ss.lark.android.passport.biz.feature.login_input.LoginStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.login_input.mvp.AbstractC64881b;
import com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64909c;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.HashMap;

public class LoginInputPresenter extends AbstractC64909c<C64883c, C64886d> {

    /* renamed from: d */
    protected Activity f163541d;

    /* renamed from: e */
    public boolean f163542e;

    /* renamed from: g */
    private boolean f163543g;
    @RouterFieldAnno

    /* renamed from: h */
    private LoginData f163544h;

    public static class LoginData implements Serializable {
        @JSONField(name = "start_cause_rebuild")
        public boolean startCauseRebuild;
    }

    /* renamed from: h */
    public void mo223846h() {
        this.f163542e = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C64879a mo223848j() {
        return new C64879a();
    }

    /* renamed from: g */
    public void mo223845g() {
        this.f163542e = true;
        if (this.f163543g) {
            this.f123081c.mo171465b("n_page_login_input_start", "start checkOneKeyAuth");
            mo223843a(((C64883c) mo171182e()).mo223852g());
            this.f163543g = false;
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b, com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64909c
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        C49092f.m193525a(this, this.f163541d.getIntent());
        SigninParams signinParams = (SigninParams) this.f163541d.getIntent().getSerializableExtra("tag_signin_params");
        if (signinParams == null) {
            signinParams = SigninParams.DEFAULT;
            this.f123081c.mo171465b("n_page_login_input_start", "use default SignInParams");
        }
        if (this.f163544h != null) {
            signinParams = signinParams.buildUpon().mo172355e(this.f163544h.startCauseRebuild).mo172350a();
        }
        ((C64883c) mo171182e()).mo223850a(signinParams);
        if (signinParams.isShowLoginBackIcon()) {
            ((C64886d) mo171181d()).mo223859d();
        }
        ((C64886d) mo171181d()).mo223856a(signinParams.isShowCloseIcon());
        ((C64886d) mo171181d()).mo223858b(signinParams.isShowLanguageSwitcher());
        this.f163543g = true;
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.login_input.mvp.LoginInputPresenter$a */
    public class C64879a extends AbstractC64909c.C64910a implements AbstractC64881b.AbstractC64882a {
        public C64879a() {
            super();
        }
    }

    /* renamed from: b */
    private void m254807b(final SigninParams signinParams) {
        final int i;
        if (signinParams.isRegister()) {
            i = 1;
        } else {
            i = 2;
        }
        WatcherHelper.m193664a(this.f123080b, C40654u.f103186i);
        OneKeyAuthUtil.f163513a.mo223823a((AbstractC49352d<OperatorAuthTokenInfo>) new AbstractC49352d<OperatorAuthTokenInfo>() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.LoginInputPresenter.C648771 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                LoginInputPresenter.this.f123081c.mo171471d("n_action_login_input_onekey_login", PassportLog.m193687a("startOneKeyAuth error", networkErrorResult));
            }

            /* renamed from: a */
            public void mo145179a(OperatorAuthTokenInfo operatorAuthTokenInfo) {
                if (operatorAuthTokenInfo.getSecurityPhone() == null || operatorAuthTokenInfo.getSecurityPhone().length() <= 0) {
                    LoginInputPresenter.this.f123081c.mo171471d("n_action_login_input_onekey_login", "getSecurityPhone success but phone number is invalid");
                } else if (LoginInputPresenter.this.f163542e) {
                    OneKeyAuthUtil.f163513a.mo223819a(LoginInputPresenter.this.f163541d, i, signinParams.isFromGuide(), LoginInputPresenter.this.f123080b);
                    LoginInputPresenter.this.f123081c.mo171465b("n_action_login_input_onekey_login", "getSecurityPhone success");
                }
            }
        }, false, this.f123080b, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64909c
    /* renamed from: a */
    public void mo223842a(CountryBean countryBean) {
        if (countryBean == null) {
            this.f123081c.mo171471d("n_page_login_input_start", "handleCountryBean bean is null");
        } else {
            ((C64886d) mo171181d()).mo223876a(countryBean);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.lark.android.passport.biz.feature.login_register_base.mvp.AbstractC64909c
    /* renamed from: a */
    public void mo223844a(String str) {
        ((C64886d) mo171181d()).mo223885l();
        this.f123081c.mo171465b("n_action_login_input_next", "start next");
        LoginStatisticsHelper.m254799a();
        ((C64883c) mo171182e()).mo223851a(str, ((C64883c) mo171182e()).mo223912h(), new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.login_input.mvp.LoginInputPresenter.C648782 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                ((C64886d) LoginInputPresenter.this.mo171181d()).mo223886m();
                LoginInputPresenter.this.f123081c.mo171471d("n_action_login_input_next", PassportLog.m193687a("loginType error", networkErrorResult));
                if (networkErrorResult != null) {
                    if (networkErrorResult.getErrorCode() == 4201) {
                        ((C64886d) LoginInputPresenter.this.mo171181d()).mo223855a(networkErrorResult.getErrorMessage());
                    } else if (networkErrorResult.getErrorCode() == 4208) {
                        ((C64886d) LoginInputPresenter.this.mo171181d()).mo223857b(networkErrorResult.getErrorMessage());
                    } else {
                        UnknownCodeHandler.f123256a.mo171331c(LoginInputPresenter.this.f163541d, networkErrorResult);
                    }
                }
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                ((C64886d) LoginInputPresenter.this.mo171181d()).mo223886m();
                if (responseModel.getCode() != 0 || responseModel.getData() == null) {
                    LoginInputPresenter.this.f123081c.mo171471d("n_action_login_input_next", "loginType onSuccess but LoginTypeData is null");
                    return;
                }
                BaseStepData data = responseModel.getData();
                PassportLog passportLog = LoginInputPresenter.this.f123081c;
                passportLog.mo171465b("n_action_login_input_next", "loginType onSuccess next step: " + data.nextStep);
                HashMap hashMap = new HashMap();
                hashMap.put("next_step", data.nextStep);
                WatcherHelper.m193665a(LoginInputPresenter.this.f123080b, C40654u.f103179b, hashMap);
                C49092f.m193532a(LoginInputPresenter.this.f163541d, data.nextStep, data.stepInfo, RouterScene.BEFORE_LOGIN.value, LoginInputPresenter.this.f123080b, LoginInputPresenter.this.f123081c, (AbstractC49336a) null);
            }
        });
    }

    /* renamed from: a */
    public void mo223843a(SigninParams signinParams) {
        if (ServiceFinder.m193748c().isLogin()) {
            this.f123081c.mo171468c("n_action_login_input_onekey_login", "has login users, skip");
        } else if (signinParams == null || signinParams.isSkipOneKeyAuth()) {
            this.f123081c.mo171468c("n_action_login_input_onekey_login", "params is null or skip");
        } else if (ServiceFinder.m193752g().getCommonEnv().isOverSea()) {
            this.f123081c.mo171468c("n_action_login_input_onekey_login", "isOverSea");
        } else if (!OneKeyAuthUtil.f163513a.mo223826c()) {
            this.f123081c.mo171468c("n_action_login_input_onekey_login", "enableOneKeyLogin is false");
        } else if (signinParams.isRegister() || signinParams.isFromGuide()) {
            this.f123081c.mo171468c("n_action_login_input_onekey_login", "from register or guide");
            m254807b(signinParams);
        } else if (((Integer) IsolateStorageUtil.f123196a.mo171260d(UserGlobalKeys.f162502d, -1)).intValue() == 1) {
            this.f123081c.mo171465b("n_action_login_input_onekey_login", "last mode is phone number, start getSecurityPhone");
            m254807b(signinParams);
        }
    }

    public LoginInputPresenter(Activity activity, C64883c cVar, C64886d dVar, UniContext uniContext, PassportLog passportLog) {
        super(activity, cVar, dVar, uniContext, passportLog);
        this.f163541d = activity;
    }
}
