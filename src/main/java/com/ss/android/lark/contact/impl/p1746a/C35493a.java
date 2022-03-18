package com.ss.android.lark.contact.impl.p1746a;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.biz.core.api.AbstractC29563j;
import com.ss.android.lark.contact.impl.contacts_home.C35660a;
import java.util.List;

/* renamed from: com.ss.android.lark.contact.impl.a.a */
public class C35493a implements AbstractC29563j {

    /* renamed from: a */
    C35660a f91769a;

    @Override // com.ss.android.lark.biz.core.api.AbstractC29563j
    /* renamed from: a */
    public BaseFragment mo105759a() {
        return this.f91769a;
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29563j
    /* renamed from: a */
    public void mo105761a(List<String> list) {
        C35660a aVar = this.f91769a;
        if (aVar != null) {
            aVar.mo131401a(list);
        }
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29563j
    /* renamed from: a */
    public void mo105762a(boolean z) {
        this.f91769a.mo131402a(z);
    }

    @Override // com.ss.android.lark.biz.core.api.AbstractC29563j
    /* renamed from: a */
    public AbstractC29563j mo105760a(boolean z, boolean z2, boolean z3, AbstractC29563j.AbstractC29564a aVar) {
        C35660a a = C35660a.m139581a(z, z2, z3);
        this.f91769a = a;
        a.mo131400a(aVar);
        return this;
    }
}
