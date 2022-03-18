package com.ss.lark.android.passport.biz.feature.sso.suite;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.feature.sso.suite.C65066a;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.d */
public class C65076d extends AbstractC49021b<C65066a.AbstractC65067a, C65066a.AbstractC65069b, C65066a.AbstractC65069b.AbstractC65070a> {

    /* renamed from: d */
    private final Context f163888d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.d$b */
    public class C65081b implements C65066a.AbstractC65069b.AbstractC65070a {
        @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b.AbstractC65070a
        /* renamed from: a */
        public void mo224204a() {
            C65076d.this.mo224215k();
        }

        private C65081b() {
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b.AbstractC65070a
        /* renamed from: a */
        public void mo224205a(boolean z) {
            C65076d.this.mo224210a(z);
        }

        @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65069b.AbstractC65070a
        /* renamed from: b */
        public void mo224206b(final boolean z) {
            if (C65076d.this.mo171182e() != null) {
                ((C65066a.AbstractC65067a) C65076d.this.mo171182e()).mo224198b(z, new IGetDataCallback<Boolean>() {
                    /* class com.ss.lark.android.passport.biz.feature.sso.suite.C65076d.C65081b.C650821 */

                    /* renamed from: a */
                    public void onSuccess(Boolean bool) {
                        PassportLog passportLog = C65076d.this.f123081c;
                        passportLog.mo171465b("SuiteConfirmPresenter", "onNotifyChanged onSuccess " + bool);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C65076d.this.f123081c.mo171465b("SuiteConfirmPresenter", PassportLog.m193685a("onNotifyChanged onError", errorResult));
                        if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                            ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224180a(errorResult.getDisplayMsg());
                        }
                        ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224181a(!z);
                    }
                });
            }
        }
    }

    /* renamed from: m */
    private C65066a.AbstractC65067a.AbstractC65068a m255559m() {
        return new C65080a();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo224211g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C65066a.AbstractC65069b.AbstractC65070a mo171180c() {
        return new C65081b();
    }

    /* renamed from: n */
    private void m255560n() {
        if (mo171182e() != null) {
            ((C65066a.AbstractC65067a) mo171182e()).mo224197b(new IGetDataCallback<Boolean>() {
                /* class com.ss.lark.android.passport.biz.feature.sso.suite.C65076d.C650771 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C65076d.this.f123081c.mo171471d("SuiteConfirmPresenter", PassportLog.m193685a("getNotifyStatus err", errorResult));
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    PassportLog passportLog = C65076d.this.f123081c;
                    passportLog.mo171465b("SuiteConfirmPresenter", "getNotifyStatus onSuccess " + bool);
                    ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224181a(bool.booleanValue());
                }
            });
        }
    }

    /* renamed from: h */
    public void mo224212h() {
        m255558b(((C65066a.AbstractC65067a) mo171182e()).cy_());
        if (((C65066a.AbstractC65067a) mo171182e()).cy_()) {
            m255560n();
        }
    }

    /* renamed from: l */
    public void mo224216l() {
        if (mo171182e() != null) {
            ((C65066a.AbstractC65067a) mo171182e()).mo224195a(new IGetDataCallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.sso.suite.C65076d.C650793 */

                /* renamed from: a */
                public void onSuccess(BaseStepData baseStepData) {
                    C65076d.this.f123081c.mo171465b("n_action_auth_login_cancel_request_succ", "suite onQRLoginCancel onSuccess");
                    ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224185d();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C65076d.this.f123081c.mo171471d("n_action_auth_login_cancel_request_fail", PassportLog.m193685a("suite onQRLoginCancel onError", errorResult));
                    ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224185d();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.feature.sso.suite.d$a */
    public class C65080a implements C65066a.AbstractC65067a.AbstractC65068a {
        @Override // com.ss.lark.android.passport.biz.feature.sso.suite.C65066a.AbstractC65067a.AbstractC65068a
        /* renamed from: a */
        public void mo224203a() {
            if (C65076d.this.mo171181d() != null) {
                ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224180a(UIHelper.getString(R.string.Lark_Legacy_TokenInvalid));
                ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224185d();
            }
        }

        private C65080a() {
        }
    }

    /* renamed from: o */
    private void m255561o() {
        ILoginSourceService n = ServiceFinder.m193759n();
        if (n.getLoginSource().getLoginSource() == 1) {
            n.resetLoginSource();
            ServiceFinder.m193752g().onLoginCallback(this.f163888d, ServiceFinder.m193744a().getForegroundUser(), null);
            this.f123081c.mo171465b("n_page_suite_end", "checkLoginSource finish for external login");
        }
    }

    /* renamed from: g */
    public void mo224211g() {
        if (((C65066a.AbstractC65067a) mo171182e()).cx_() != null) {
            mo224212h();
            ((C65066a.AbstractC65069b) mo171181d()).mo224178a(((C65066a.AbstractC65067a) mo171182e()).cx_());
            return;
        }
        this.f123081c.mo171471d("SuiteConfirmPresenter", "suiteInfo is null");
    }

    /* renamed from: j */
    public void mo224214j() {
        this.f123081c.mo171465b("n_action_auth_login_confirm_request_succ", "onConfirmSucc after request succ");
        if (!((C65066a.AbstractC65069b) mo171181d()).mo224188g()) {
            m255561o();
            if (((C65066a.AbstractC65067a) mo171182e()).mo224202e() == 2) {
                ((C65066a.AbstractC65069b) mo171181d()).mo224184c(true);
            }
            if (!DesktopUtil.m144301a(this.f163888d)) {
                ((C65066a.AbstractC65069b) mo171181d()).mo224189h();
            } else {
                ((C65066a.AbstractC65069b) mo171181d()).mo224185d();
            }
        }
    }

    /* renamed from: k */
    public void mo224215k() {
        this.f123081c.mo171465b("n_action_suite_back", "click close or back,onBackEvent");
        if (!((C65066a.AbstractC65069b) mo171181d()).mo224188g()) {
            if (!TextUtils.isEmpty(((C65066a.AbstractC65067a) mo171182e()).mo224199c())) {
                mo224216l();
            }
            m255561o();
            if (((C65066a.AbstractC65067a) mo171182e()).mo224202e() == 2) {
                ((C65066a.AbstractC65069b) mo171181d()).mo224184c(true);
            }
            if (!DesktopUtil.m144301a(this.f163888d)) {
                ((C65066a.AbstractC65069b) mo171181d()).mo224189h();
            } else {
                ((C65066a.AbstractC65069b) mo171181d()).mo224185d();
            }
        }
    }

    /* renamed from: b */
    private void m255558b(boolean z) {
        ((C65066a.AbstractC65069b) mo171181d()).mo224183b(z);
    }

    /* renamed from: a */
    public void mo224210a(final boolean z) {
        if (mo171182e() != null) {
            ((C65066a.AbstractC65069b) mo171181d()).mo224186e();
            ((C65066a.AbstractC65067a) mo171182e()).mo224196a(z, new IGetDataCallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.sso.suite.C65076d.C650782 */

                /* renamed from: a */
                public void onSuccess(BaseStepData baseStepData) {
                    ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224187f();
                    PassportLog passportLog = C65076d.this.f123081c;
                    passportLog.mo171465b("n_action_auth_login_confirm_request_succ", "isMultiLogin = " + z);
                    ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224180a(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Loginsuccess));
                    C65076d.this.mo224214j();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224187f();
                    if (errorResult.getErrorCode() == 4402) {
                        ((C65066a.AbstractC65069b) C65076d.this.mo171181d()).mo224182b(errorResult.getDebugMsg());
                    }
                    C65076d.this.f123081c.mo171471d("n_action_auth_login_confirm_request_fail", PassportLog.m193685a("qrConfirm onError", errorResult));
                }
            });
        }
    }

    public C65076d(FragmentActivity fragmentActivity, SuiteConfirmView suiteConfirmView, C65073c cVar, UniContext uniContext, PassportLog passportLog) {
        super(cVar, suiteConfirmView, uniContext, passportLog);
        this.f163888d = fragmentActivity;
        cVar.mo224207a(m255559m());
    }
}
