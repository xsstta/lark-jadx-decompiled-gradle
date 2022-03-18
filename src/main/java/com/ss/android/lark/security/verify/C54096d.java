package com.ss.android.lark.security.verify;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.security.account.C54058a;
import com.ss.android.lark.security.account.SecurityVerifyResult;
import com.ss.android.lark.security.api.CheckSecurityPwdStep;
import com.ss.android.lark.security.api.VerifySecurityPwdResultStep;
import com.ss.android.lark.security.api.VerifySecurityPwdStep;
import com.ss.android.lark.security.verify.AbstractC54089a;
import com.ss.android.lark.utils.C57878s;

/* renamed from: com.ss.android.lark.security.verify.d */
public class C54096d extends AbstractC49021b<AbstractC54089a.AbstractC54090a, AbstractC54089a.AbstractC54091b, AbstractC54089a.AbstractC54091b.AbstractC54092a> {

    /* renamed from: d */
    public final Activity f133911d;

    /* renamed from: e */
    public String f133912e;

    /* renamed from: f */
    public String f133913f;

    /* renamed from: g */
    public String f133914g;

    /* renamed from: h */
    private final Bundle f133915h;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        m209903i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AbstractC54089a.AbstractC54091b.AbstractC54092a mo171180c() {
        return new C54099a();
    }

    /* renamed from: i */
    private void m209903i() {
        Bundle bundle = this.f133915h;
        if (bundle != null) {
            this.f133912e = bundle.getString("mini_app_id");
            this.f133913f = this.f133915h.getString("mini_app_callback_id");
        }
    }

    /* renamed from: h */
    public void mo185147h() {
        ((AbstractC54089a.AbstractC54090a) mo171182e()).mo185141a(new UIGetDataCallback(new IGetDataCallback<CheckSecurityPwdStep>() {
            /* class com.ss.android.lark.security.verify.C54096d.C540982 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((AbstractC54089a.AbstractC54091b) C54096d.this.mo171181d()).mo185124a((BaseStepData) null);
                PassportLog passportLog = C54096d.this.f123081c;
                passportLog.mo171471d("VerifySecurityPasswordPresenter", "fetchVerifyStatus callback error:" + errorResult);
            }

            /* renamed from: a */
            public void onSuccess(CheckSecurityPwdStep checkSecurityPwdStep) {
                if (!checkSecurityPwdStep.isOpen()) {
                    ((AbstractC54089a.AbstractC54091b) C54096d.this.mo171181d()).mo185124a(checkSecurityPwdStep.getNextStep());
                } else if ("verify_sec_pwd".equalsIgnoreCase(checkSecurityPwdStep.getNextStep().nextStep)) {
                    VerifySecurityPwdStep verifySecurityPwdStep = (VerifySecurityPwdStep) C57878s.m224590a(checkSecurityPwdStep.getNextStep().stepInfo.toJSONString(), VerifySecurityPwdStep.class);
                    if (verifySecurityPwdStep != null) {
                        C54096d.this.f133914g = verifySecurityPwdStep.getFlowType();
                    }
                    ((AbstractC54089a.AbstractC54091b) C54096d.this.mo171181d()).mo185125a(verifySecurityPwdStep);
                }
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.security.verify.d$a */
    public class C54099a implements AbstractC54089a.AbstractC54091b.AbstractC54092a {
        private C54099a() {
        }

        @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54091b.AbstractC54092a
        /* renamed from: a */
        public void mo185144a(String str) {
            C54096d dVar = C54096d.this;
            dVar.mo185145a(str, dVar.f133912e);
        }

        @Override // com.ss.android.lark.security.verify.AbstractC54089a.AbstractC54091b.AbstractC54092a
        /* renamed from: a */
        public void mo185143a(SecurityVerifyResult securityVerifyResult) {
            if (securityVerifyResult == null) {
                C54058a.m209797a().mo185062a(C54096d.this.f133911d, SecurityVerifyResult.newInstance(1).getVerifyResultText(), C54096d.this.f133913f);
            } else {
                C54058a.m209797a().mo185062a(C54096d.this.f133911d, securityVerifyResult.getVerifyResultText(), C54096d.this.f133913f);
            }
        }
    }

    /* renamed from: a */
    public void mo185145a(String str, String str2) {
        ((AbstractC54089a.AbstractC54090a) mo171182e()).mo185142a(str, str2, this.f133914g, new UIGetDataCallback(new IGetDataCallback<VerifySecurityPwdResultStep>() {
            /* class com.ss.android.lark.security.verify.C54096d.C540971 */

            /* renamed from: a */
            public void onSuccess(VerifySecurityPwdResultStep verifySecurityPwdResultStep) {
                ((AbstractC54089a.AbstractC54091b) C54096d.this.mo171181d()).mo185127a(verifySecurityPwdResultStep.getToken());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult.getErrorCode() == 2001) {
                    ((AbstractC54089a.AbstractC54091b) C54096d.this.mo171181d()).mo185129c(errorResult.getDisplayMsg());
                } else {
                    ((AbstractC54089a.AbstractC54091b) C54096d.this.mo171181d()).mo185128b(errorResult.getDisplayMsg());
                }
                PassportLog passportLog = C54096d.this.f123081c;
                passportLog.mo171471d("VerifySecurityPasswordPresenter", "verifyPwd callback error:" + errorResult);
            }
        }));
    }

    public C54096d(Activity activity, AbstractC54089a.AbstractC54091b bVar, AbstractC54089a.AbstractC54090a aVar, Bundle bundle, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f133911d = activity;
        this.f133915h = bundle;
    }
}
