package com.ss.android.lark.security.verify;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.security.verify.VerifySecurityPasswordView;

/* renamed from: com.ss.android.lark.security.verify.b */
public class C54093b extends C49029b {

    /* renamed from: e */
    public View f133906e;

    /* renamed from: f */
    private Bundle f133907f;

    /* renamed from: g */
    private C54096d f133908g;

    /* renamed from: h */
    private final VerifySecurityPasswordView.AbstractC54088a f133909h = new VerifySecurityPasswordView.AbstractC54088a() {
        /* class com.ss.android.lark.security.verify.C54093b.C540941 */

        @Override // com.ss.android.lark.security.verify.VerifySecurityPasswordView.AbstractC54088a
        /* renamed from: a */
        public void mo185140a(VerifySecurityPasswordView verifySecurityPasswordView) {
            ButterKnife.bind(verifySecurityPasswordView, C54093b.this.f133906e);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "VerifySecurityPasswordFragment";
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C54096d dVar = this.f133908g;
        if (dVar != null) {
            dVar.cn_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f133908g.mo185147h();
    }

    /* renamed from: d */
    private void m209896d() {
        C54096d dVar = new C54096d(getActivity(), new VerifySecurityPasswordView(getActivity(), this.f133909h), new C54095c(), this.f133907f, this.f123086a, this.f123087b);
        this.f133908g = dVar;
        dVar.mo171169a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f133907f = getArguments();
        this.f133906e = layoutInflater.inflate(R.layout.fragment_verify_security_password, viewGroup, false);
        m209896d();
        return this.f133906e;
    }
}
