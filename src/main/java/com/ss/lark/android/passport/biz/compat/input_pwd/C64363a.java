package com.ss.lark.android.passport.biz.compat.input_pwd;

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
import com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64379b;
import com.ss.lark.android.passport.biz.compat.input_pwd.mvp.C64380c;
import com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView;
import com.ss.lark.android.passport.biz.compat.verify_code.VerifyIdentityStepInfo;

@RouterAnno(teaName = "login_enter_verify_pwd", watcherName = "input_pwd_compat")
/* renamed from: com.ss.lark.android.passport.biz.compat.input_pwd.a */
public class C64363a extends C49029b {

    /* renamed from: e */
    protected View f162639e;

    /* renamed from: f */
    public AbstractC64359a f162640f;

    /* renamed from: g */
    protected InputPwdView.AbstractC64374a f162641g = new InputPwdView.AbstractC64374a() {
        /* class com.ss.lark.android.passport.biz.compat.input_pwd.C64363a.C643641 */

        @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.AbstractC64374a
        /* renamed from: a */
        public void mo222912a() {
            C49096b.m193590f();
            if (C64363a.this.f162640f != null) {
                C64363a.this.f162640f.mo170967a();
            }
        }

        @Override // com.ss.lark.android.passport.biz.compat.input_pwd.mvp.InputPwdView.AbstractC64374a
        /* renamed from: a */
        public void mo222913a(InputPwdView inputPwdView) {
            ButterKnife.bind(inputPwdView, C64363a.this.f162639e);
        }
    };

    /* renamed from: h */
    private C64380c f162642h;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "InputPwdFrg";
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C64380c cVar = this.f162642h;
        if (cVar != null) {
            cVar.cn_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo185117d() {
        VerifyIdentityStepInfo verifyIdentityStepInfo;
        InputPwdView inputPwdView = new InputPwdView(getActivity(), this.f162641g);
        if (getArguments() != null) {
            verifyIdentityStepInfo = (VerifyIdentityStepInfo) getArguments().getSerializable("verify_step_info");
        } else {
            verifyIdentityStepInfo = null;
        }
        C64380c cVar = new C64380c(getActivity(), new C64379b(verifyIdentityStepInfo), inputPwdView, this.f123086a, this.f123087b);
        this.f162642h = cVar;
        cVar.mo171169a();
    }

    /* renamed from: a */
    public void mo222911a(AbstractC64359a aVar) {
        this.f162640f = aVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f123087b.mo171465b("InputPwdFrg", "enter pwdFrg");
        this.f162639e = layoutInflater.inflate(R.layout.signin_sdk_fragment_input_pwd_backup, viewGroup, false);
        mo185117d();
        return this.f162639e;
    }
}
