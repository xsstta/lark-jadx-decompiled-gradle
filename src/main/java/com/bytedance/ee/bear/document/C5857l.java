package com.bytedance.ee.bear.document;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4949j;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;

/* renamed from: com.bytedance.ee.bear.document.l */
public class C5857l extends C4918a implements AbstractC7945d<Void> {
    /* renamed from: d */
    private void m23569d() {
        for (C4943e eVar : C4949j.m20465a().mo19581b()) {
            if (eVar instanceof C6095s) {
                AbstractC5887o o = ((C6095s) eVar).mo24600o();
                if (o instanceof C6057p) {
                    ((C6057p) o).mo24483h();
                }
            }
        }
    }

    /* renamed from: a */
    public void handle(Void r1, AbstractC7947h hVar) {
        m23569d();
    }

    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.util.hideLoading", this);
    }
}
