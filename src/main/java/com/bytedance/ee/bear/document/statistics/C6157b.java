package com.bytedance.ee.bear.document.statistics;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.contract.C5234y;

/* renamed from: com.bytedance.ee.bear.document.statistics.b */
public class C6157b extends C4918a {
    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        mo19344a("biz.statistics.reportEvent", new ReportEventHandler(C5234y.m21391b()));
    }
}
