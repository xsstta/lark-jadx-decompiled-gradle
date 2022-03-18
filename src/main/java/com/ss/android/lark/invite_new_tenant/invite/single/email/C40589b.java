package com.ss.android.lark.invite_new_tenant.invite.single.email;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a;
import com.ss.android.lark.invite_new_tenant.invite.single.email.InviteSingleByEmailView;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.b */
public class C40589b extends AbstractC40542a {

    /* renamed from: b */
    private InviteSingleByEmailView.AbstractC40584a f103007b = new InviteSingleByEmailView.AbstractC40584a() {
        /* class com.ss.android.lark.invite_new_tenant.invite.single.email.C40589b.C405901 */

        @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.InviteSingleByEmailView.AbstractC40584a
        /* renamed from: a */
        public void mo146712a(InviteSingleByEmailView inviteSingleByEmailView) {
            ButterKnife.bind(inviteSingleByEmailView, C40589b.this.getView());
        }
    };

    /* renamed from: b */
    public static C40589b m160571b() {
        C40589b bVar = new C40589b();
        bVar.setArguments(new Bundle());
        return bVar;
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a
    /* renamed from: a */
    public BasePresenter mo146657a() {
        return new C40592d(new C40591c(), new InviteSingleByEmailView(getActivity(), this.f103007b));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_invite_single_by_email, viewGroup, false);
    }
}
