package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a;
import com.ss.android.lark.invite_new_tenant.invite.single.AbstractC40580a;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40610d;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.entity.MobileCode;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.d */
public class C40610d extends AbstractC40542a {

    /* renamed from: b */
    public C40605c.AbstractC40607b f103035b;

    /* renamed from: c */
    private InviteSingleByMobileView.AbstractC40599a f103036c = new InviteSingleByMobileView.AbstractC40599a() {
        /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40610d.C406111 */

        @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView.AbstractC40599a
        /* renamed from: a */
        public boolean mo146727a() {
            return C40610d.this.isActive();
        }

        @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView.AbstractC40599a
        /* renamed from: a */
        public void mo146725a(InviteSingleByMobileView inviteSingleByMobileView) {
            ButterKnife.bind(inviteSingleByMobileView, C40610d.this.getView());
        }

        @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.InviteSingleByMobileView.AbstractC40599a
        /* renamed from: a */
        public void mo146726a(IInviteNewTenantService.C40630a aVar) {
            C40604b a = C40604b.m160600a(aVar.f103057b, aVar.f103056a);
            a.mo146734a(new AbstractC40580a(a) {
                /* class com.ss.android.lark.invite_new_tenant.invite.single.mobile.$$Lambda$d$1$vrOPUNByLBpKB_0NstXQODsF6g */
                public final /* synthetic */ C40604b f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.invite_new_tenant.invite.single.AbstractC40580a
                public final void onItemSelected(MobileCode mobileCode) {
                    C40610d.C406111.this.m160617a(this.f$1, mobileCode);
                }
            });
            a.mo5511a(C40610d.this.getActivity().getSupportFragmentManager(), "MOBILE_AREA_DIALOG");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m160617a(C40604b bVar, MobileCode mobileCode) {
            bVar.u_();
            if (C40610d.this.f103035b != null) {
                C40610d.this.f103035b.mo146737a(mobileCode);
            }
        }
    };

    /* renamed from: b */
    public static C40610d m160615b() {
        C40610d dVar = new C40610d();
        dVar.setArguments(new Bundle());
        return dVar;
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.AbstractC40542a
    /* renamed from: a */
    public BasePresenter mo146657a() {
        C40613f fVar = new C40613f(new C40612e(), new InviteSingleByMobileView(getActivity(), this.f103036c));
        this.f103035b = fVar;
        return fVar;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_invite_single_by_mobile, viewGroup, false);
    }
}
