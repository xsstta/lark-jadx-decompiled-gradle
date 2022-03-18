package com.ss.android.lark.contact.impl.contacts_new;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_new.NewContactView;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;

/* renamed from: com.ss.android.lark.contact.impl.contacts_new.b */
public class C35700b extends BaseFragment {

    /* renamed from: a */
    public View f92325a;

    /* renamed from: b */
    private C35706d f92326b;

    /* renamed from: c */
    private NewContactView.AbstractC35694b f92327c = new NewContactView.AbstractC35694b() {
        /* class com.ss.android.lark.contact.impl.contacts_new.C35700b.C357011 */

        @Override // com.ss.android.lark.contact.impl.contacts_new.NewContactView.AbstractC35694b
        /* renamed from: a */
        public void mo131476a() {
            C35358a.m138143a().mo130158e().mo130214a((Context) C35700b.this.getActivity(), "contact_new");
        }

        @Override // com.ss.android.lark.contact.impl.contacts_new.NewContactView.AbstractC35694b
        /* renamed from: a */
        public void mo131477a(NewContactView newContactView) {
            ButterKnife.bind(newContactView, C35700b.this.f92325a);
        }

        @Override // com.ss.android.lark.contact.impl.contacts_new.NewContactView.AbstractC35694b
        /* renamed from: a */
        public void mo131478a(String str, String str2) {
            C35358a.m138143a().mo130146a(C35700b.this.getActivity(), str, str2);
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C35706d dVar = this.f92326b;
        if (dVar != null) {
            dVar.destroy();
        }
        this.f92327c = null;
    }

    /* renamed from: a */
    private void m139761a() {
        C35706d dVar = new C35706d(new C35702c(), new NewContactView(this.f92327c));
        this.f92326b = dVar;
        dVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f92325a = layoutInflater.inflate(R.layout.activity_new_contact, viewGroup, false);
        m139761a();
        ContactHitPoint.m140818s();
        return this.f92325a;
    }
}
