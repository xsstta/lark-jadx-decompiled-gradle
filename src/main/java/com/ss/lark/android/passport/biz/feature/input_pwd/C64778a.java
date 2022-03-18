package com.ss.lark.android.passport.biz.feature.input_pwd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.VerifyIdentityStepInfo;
import com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64791b;
import com.ss.lark.android.passport.biz.feature.input_pwd.mvp.C64793c;
import com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView;
import com.ss.lark.android.passport.biz.feature.verify_code.IChangePage;

@RouterAnno(teaName = "passport_pwd_verify_view", watcherName = "input_pwd")
/* renamed from: com.ss.lark.android.passport.biz.feature.input_pwd.a */
public class C64778a extends C49029b {

    /* renamed from: e */
    protected View f163354e;

    /* renamed from: f */
    public IChangePage f163355f;

    /* renamed from: g */
    public VerifyIdentityStepInfo f163356g;

    /* renamed from: h */
    protected InputPwdView.AbstractC64786a f163357h = new InputPwdView.AbstractC64786a() {
        /* class com.ss.lark.android.passport.biz.feature.input_pwd.C64778a.C647791 */

        @Override // com.ss.lark.android.passport.biz.feature.input_pwd.mvp.InputPwdView.AbstractC64786a
        /* renamed from: a */
        public void mo223658a() {
            String str;
            if (C64778a.this.f163356g == null || C64778a.this.f163356g.verifyPwd == null) {
                str = "";
            } else {
                str = C64778a.this.f163356g.verifyPwd.flowType;
            }
            PwdVerifyStatisticsHelper.m254422a(str);
            if (C64778a.this.f163355f != null) {
                C64778a.this.f163355f.mo224310d();
            }
        }
    };

    /* renamed from: i */
    private C64793c f163358i;

    /* renamed from: j */
    private CommonUiContainer f163359j;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "InputPwdFrg";
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C64793c cVar = this.f163358i;
        if (cVar != null) {
            cVar.cn_();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo185117d() {
        String str;
        InputPwdView inputPwdView = new InputPwdView(getActivity(), this.f163357h, this.f163359j);
        if (getArguments() != null) {
            this.f163356g = (VerifyIdentityStepInfo) getArguments().getSerializable("verify_step_info");
        }
        C64793c cVar = new C64793c(getActivity(), new C64791b(this.f163356g), inputPwdView, this.f123086a, this.f123087b);
        this.f163358i = cVar;
        cVar.mo171169a();
        VerifyIdentityStepInfo verifyIdentityStepInfo = this.f163356g;
        if (verifyIdentityStepInfo == null || verifyIdentityStepInfo.verifyPwd == null) {
            str = "";
        } else {
            str = this.f163356g.verifyPwd.flowType;
        }
        PwdVerifyStatisticsHelper.m254425c(str);
        this.f123087b.mo171460a("n_page_verify_pwd_start");
    }

    /* renamed from: a */
    public void mo223657a(IChangePage aVar) {
        this.f163355f = aVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f123087b.mo171465b("n_page_verify_pwd_start", "enter pwdFrg");
        if (this.f163359j == null) {
            this.f163359j = CommonUiContainer.m252968a(requireActivity(), (int) R.layout.signin_sdk_fragment_input_pwd, viewGroup, false);
        }
        this.f163354e = this.f163359j.f162613b;
        mo185117d();
        return this.f163354e;
    }
}
