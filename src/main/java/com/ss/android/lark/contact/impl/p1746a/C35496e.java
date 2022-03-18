package com.ss.android.lark.contact.impl.p1746a;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29583s;
import com.ss.android.lark.contact.impl.contacts_email.BusinessCardsPickerFragment;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.a.e */
public class C35496e implements AbstractC29583s {

    /* renamed from: a */
    BusinessCardsPickerFragment f91775a;

    @Override // com.ss.android.lark.biz.core.api.AbstractC29583s
    /* renamed from: a */
    public BaseFragment mo105882a() {
        return this.f91775a;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29583s
    /* renamed from: a */
    public void mo105884a(List<String> list) {
        BusinessCardsPickerFragment cVar = this.f91775a;
        if (cVar != null) {
            cVar.mo131037a(list);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29583s
    /* renamed from: a */
    public AbstractC29583s mo105883a(boolean z, boolean z2, boolean z3, AbstractC29583s.AbstractC29584a aVar) {
        BusinessCardsPickerFragment a = BusinessCardsPickerFragment.m139022a(z, z2, z3);
        this.f91775a = a;
        a.mo131036a(aVar);
        return this;
    }
}
