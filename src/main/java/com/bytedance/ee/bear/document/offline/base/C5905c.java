package com.bytedance.ee.bear.document.offline.base;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;

/* renamed from: com.bytedance.ee.bear.document.offline.base.c */
public class C5905c extends C4918a {

    /* renamed from: a */
    private C5900a f16538a;

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19341a(AbstractC4931i iVar) {
        C5900a aVar = this.f16538a;
        if (aVar != null) {
            aVar.mo23868b();
        }
        super.mo19341a(iVar);
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        C5900a aVar = new C5900a(mo19345b(), gVar);
        this.f16538a = aVar;
        mo19344a("biz.util.fetch", aVar);
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19342a(AbstractC4931i iVar, boolean z) {
        super.mo19342a(iVar, z);
        if (!z) {
            this.f16538a.mo23864a();
        }
    }
}
