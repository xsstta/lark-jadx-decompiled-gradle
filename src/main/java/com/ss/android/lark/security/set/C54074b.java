package com.ss.android.lark.security.set;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.security.set.SetSecurityPasswordView;

/* renamed from: com.ss.android.lark.security.set.b */
public class C54074b extends C49029b {

    /* renamed from: e */
    public View f133883e;

    /* renamed from: f */
    private C54077d f133884f;

    /* renamed from: g */
    private final SetSecurityPasswordView.AbstractC54069a f133885g = new SetSecurityPasswordView.AbstractC54069a() {
        /* class com.ss.android.lark.security.set.C54074b.C540751 */

        @Override // com.ss.android.lark.security.set.SetSecurityPasswordView.AbstractC54069a
        /* renamed from: a */
        public void mo185101a() {
            if (C54074b.this.mo185117d()) {
                C54074b.this.finish();
            } else {
                C54074b.this.getActivity().finish();
            }
        }

        @Override // com.ss.android.lark.security.set.SetSecurityPasswordView.AbstractC54069a
        /* renamed from: a */
        public void mo185102a(SetSecurityPasswordView setSecurityPasswordView) {
            ButterKnife.bind(setSecurityPasswordView, C54074b.this.f133883e);
        }
    };

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "SetSecurityPasswordFragment";
    }

    /* renamed from: d */
    public boolean mo185117d() {
        return DesktopUtil.m144301a((Context) getActivity());
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C54077d dVar = this.f133884f;
        if (dVar != null) {
            dVar.cn_();
        }
    }

    /* renamed from: e */
    private void m209844e() {
        C54077d dVar = new C54077d(new SetSecurityPasswordView(getActivity(), getArguments(), this.f133885g), new C54076c(), getArguments(), this.f123086a, this.f123087b);
        this.f133884f = dVar;
        dVar.mo171169a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f133883e = layoutInflater.inflate(R.layout.fragment_set_security_password, viewGroup, false);
        m209844e();
        return this.f133883e;
    }
}
