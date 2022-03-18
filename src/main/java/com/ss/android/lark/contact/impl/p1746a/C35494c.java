package com.ss.android.lark.contact.impl.p1746a;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.contact.impl.contacts_selector.ContactsSelectorFragment;
import com.ss.android.lark.contact.impl.contacts_selector.IContactsSelectorContract;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.a.c */
public class C35494c implements AbstractC29565l {

    /* renamed from: a */
    private ContactsSelectorFragment.Builder f91771a;

    /* renamed from: b */
    private BaseFragment f91772b;

    /* renamed from: c */
    private IContactsSelectorContract.IContactsSelectorFragmentDelegate f91773c;

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: b */
    public AbstractC29565l.AbstractC29568c mo105774b() {
        return $$Lambda$o_kRlTKzygzBCp7ccqgRHIpCh4.INSTANCE;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: a */
    public BaseFragment mo105769a() {
        if (this.f91772b == null) {
            this.f91772b = this.f91771a.mo131600l();
        }
        if (this.f91773c == null) {
            BaseFragment baseFragment = this.f91772b;
            if (baseFragment instanceof IContactsSelectorContract.IContactsSelectorFragmentDelegate) {
                this.f91773c = (IContactsSelectorContract.IContactsSelectorFragmentDelegate) baseFragment;
            }
        }
        return this.f91772b;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: a */
    public void mo105771a(int i) {
        this.f91771a.mo131583c(i);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: b */
    public void mo105775b(List<RecyclerView.Adapter<?>> list) {
        this.f91771a.mo131580b(list);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: a */
    public void mo105772a(List<RecyclerView.Adapter<?>> list) {
        this.f91771a.mo131575a(list);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: b */
    public void mo105776b(boolean z) {
        BaseFragment baseFragment;
        if (this.f91773c != null && (baseFragment = this.f91772b) != null && baseFragment.isActive()) {
            this.f91773c.mo131570b(z);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: a */
    public void mo105773a(boolean z) {
        BaseFragment baseFragment;
        if (this.f91773c != null && (baseFragment = this.f91772b) != null && baseFragment.isActive()) {
            this.f91773c.mo131568a(z);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29565l
    /* renamed from: a */
    public AbstractC29565l mo105770a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, AbstractC29565l.AbstractC29566a aVar, AbstractC29565l.AbstractC29567b bVar) {
        this.f91771a = new ContactsSelectorFragment.Builder().mo131573a(z).mo131579b(z2).mo131593h(z3).mo131584d(z4).mo131582c(z5).mo131586e(z6).mo131595i(z7).mo131596j(z8).mo131598k(z9).mo131588f(z10).mo131571a(aVar).mo131572a(bVar);
        return this;
    }
}
