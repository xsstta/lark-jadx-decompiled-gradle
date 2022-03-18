package com.ss.android.lark.invite_new_tenant.invite.all.qrcode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a;
import com.ss.android.lark.invite_new_tenant.invite.all.qrcode.InviteAllByQrView;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.all.qrcode.c */
public class C40570c extends AbstractC40542a {

    /* renamed from: b */
    private InviteAllByQrView.AbstractC40563a f102986b = new InviteAllByQrView.AbstractC40563a() {
        /* class com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40570c.C405711 */

        @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.InviteAllByQrView.AbstractC40563a
        /* renamed from: a */
        public void mo146686a(InviteAllByQrView inviteAllByQrView) {
            ButterKnife.bind(inviteAllByQrView, C40570c.this.getView());
        }

        @Override // com.ss.android.lark.invite_new_tenant.invite.all.qrcode.InviteAllByQrView.AbstractC40563a
        /* renamed from: a */
        public void mo146687a(String str) {
            C26311p.m95268a(C40570c.this.getContext(), str);
        }
    };

    @Override // com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a
    /* renamed from: a */
    public BasePresenter mo146657a() {
        return new C40572d(new C40568b(), new InviteAllByQrView(getActivity(), this.f102986b));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_invite_all_by_qr, viewGroup, false);
    }
}
