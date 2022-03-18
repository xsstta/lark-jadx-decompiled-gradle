package com.ss.android.lark.contact.feat.contact_external;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.feat.contact_external.mvp.C35442a;
import com.ss.android.lark.contact.feat.contact_external.mvp.C35446b;
import com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;

/* renamed from: com.ss.android.lark.contact.feat.contact_external.a */
public class C35433a extends BaseFragment {

    /* renamed from: a */
    public View f91607a;

    /* renamed from: b */
    private C35446b f91608b;

    /* renamed from: c */
    private ExternalContactView2.AbstractC35441c f91609c = new ExternalContactView2.AbstractC35441c() {
        /* class com.ss.android.lark.contact.feat.contact_external.C35433a.C354341 */

        @Override // com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2.AbstractC35441c
        /* renamed from: a */
        public void mo130764a(ExternalContactView2 externalContactView2) {
            ButterKnife.bind(externalContactView2, C35433a.this.f91607a);
        }

        @Override // com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2.AbstractC35441c
        /* renamed from: a */
        public void mo130763a(Chatter chatter) {
            C35358a.m138143a().mo130151b(C35433a.this.getActivity(), chatter);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C35446b bVar = this.f91608b;
        if (bVar != null) {
            bVar.destroy();
        }
        this.f91609c = null;
    }

    /* renamed from: a */
    private void m138583a() {
        C35446b bVar = new C35446b(new C35442a(), new ExternalContactView2(this.f91609c));
        this.f91608b = bVar;
        bVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f91607a = layoutInflater.inflate(R.layout.activity_external_contact_2, viewGroup, false);
        m138583a();
        ContactHitPoint.m140817r();
        return this.f91607a;
    }
}
