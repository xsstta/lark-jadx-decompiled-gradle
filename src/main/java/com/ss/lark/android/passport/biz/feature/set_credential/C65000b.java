package com.ss.lark.android.passport.biz.feature.set_credential;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView;

/* renamed from: com.ss.lark.android.passport.biz.feature.set_credential.b */
public class C65000b extends C49029b {

    /* renamed from: e */
    public View f163747e;

    /* renamed from: f */
    private C65002c f163748f;

    /* renamed from: g */
    private CommonUiContainer f163749g;

    /* renamed from: h */
    private final RecoverAccountView.AbstractC64995a f163750h = new RecoverAccountView.AbstractC64995a() {
        /* class com.ss.lark.android.passport.biz.feature.set_credential.C65000b.C650011 */

        @Override // com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.AbstractC64995a
        /* renamed from: a */
        public void mo224042a() {
            C65000b.this.finish();
        }

        @Override // com.ss.lark.android.passport.biz.feature.set_credential.RecoverAccountView.AbstractC64995a
        /* renamed from: a */
        public void mo224043a(RecoverAccountView recoverAccountView) {
            ButterKnife.bind(recoverAccountView, C65000b.this.f163747e);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "RecoverAccountFrg";
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C65002c cVar = this.f163748f;
        if (cVar != null) {
            cVar.cn_();
        }
    }

    /* renamed from: d */
    private void m255185d() {
        RecoverAccountView recoverAccountView = new RecoverAccountView(getActivity(), this.f163750h, this.f163749g);
        C65002c cVar = new C65002c(getActivity(), new RecoverAccountModel(getArguments()), recoverAccountView, this.f123086a, this.f123087b);
        this.f163748f = cVar;
        cVar.mo171169a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f163749g == null) {
            this.f163749g = CommonUiContainer.m252968a(requireActivity(), (int) R.layout.fragment_edit_contact_point, viewGroup, false);
        }
        this.f163747e = this.f163749g.f162613b;
        m255185d();
        return this.f163747e;
    }
}
