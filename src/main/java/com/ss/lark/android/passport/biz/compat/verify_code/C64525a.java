package com.ss.lark.android.passport.biz.compat.verify_code;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.lark.android.passport.biz.compat.AbstractC64359a;
import com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64540b;
import com.ss.lark.android.passport.biz.compat.verify_code.mvp.C64541c;
import com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView;

@RouterAnno(teaName = "passport_enter_verify_code", watcherName = "verify_code_compat")
/* renamed from: com.ss.lark.android.passport.biz.compat.verify_code.a */
public class C64525a extends C49029b {

    /* renamed from: e */
    public View f162913e;

    /* renamed from: f */
    public AbstractC64359a f162914f;

    /* renamed from: g */
    protected LoginVerifyCodeView.AbstractC64535b f162915g = new LoginVerifyCodeView.AbstractC64535b() {
        /* class com.ss.lark.android.passport.biz.compat.verify_code.C64525a.C645261 */

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.AbstractC64535b
        /* renamed from: a */
        public void mo223198a() {
            C49096b.m193588e();
            if (C64525a.this.f162914f != null) {
                C64525a.this.f162914f.mo170967a();
            }
        }

        @Override // com.ss.lark.android.passport.biz.compat.verify_code.mvp.LoginVerifyCodeView.AbstractC64535b
        /* renamed from: a */
        public void mo223199a(LoginVerifyCodeView loginVerifyCodeView) {
            ButterKnife.bind(loginVerifyCodeView, C64525a.this.f162913e);
        }
    };

    /* renamed from: h */
    private C64541c f162916h;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "LoginVerifyCodeFrg";
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C64541c cVar = this.f162916h;
        if (cVar != null) {
            cVar.cn_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo185117d() {
        VerifyIdentityStepInfo verifyIdentityStepInfo;
        LoginVerifyCodeView loginVerifyCodeView = new LoginVerifyCodeView(getActivity(), this.f162915g);
        if (getArguments() != null) {
            verifyIdentityStepInfo = (VerifyIdentityStepInfo) getArguments().getSerializable("verify_step_info");
        } else {
            verifyIdentityStepInfo = null;
        }
        C64541c cVar = new C64541c(getActivity(), new C64540b(verifyIdentityStepInfo), loginVerifyCodeView, this.f123086a, this.f123087b);
        this.f162916h = cVar;
        cVar.mo171169a();
    }

    /* renamed from: a */
    public void mo223197a(AbstractC64359a aVar) {
        this.f162914f = aVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f162913e = layoutInflater.inflate(R.layout.signin_sdk_fragment_verify_code_backup, viewGroup, false);
        mo185117d();
        return this.f162913e;
    }
}
