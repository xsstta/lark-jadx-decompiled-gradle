package com.bytedance.ee.bear.document.offline;

import com.bytedance.ee.bear.browser.AbstractC4928g;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4918a;
import com.bytedance.ee.bear.document.offline.base.C5906d;
import com.bytedance.ee.bear.document.offline.base.C5912g;
import com.bytedance.ee.bear.document.offline.create.GetCreatedDocHandler;
import com.bytedance.ee.bear.document.offline.p317d.C5918a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;

/* renamed from: com.bytedance.ee.bear.document.offline.b */
public class C5891b extends C4918a {
    @Override // com.bytedance.ee.bear.browser.C4918a, com.bytedance.ee.bear.browser.AbstractC4934l
    /* renamed from: a */
    public void mo19340a(AbstractC4928g gVar, AbstractC4931i iVar) {
        super.mo19340a(gVar, iVar);
        C10917c cVar = new C10917c(new C10929e());
        mo19344a("biz.util.setData", new C5912g(cVar));
        mo19344a("biz.util.getData", new C5906d());
        mo19344a("biz.util.setOfflineName", new C5918a(cVar));
        mo19344a("biz.util.getOfflineCreatedDoc", new GetCreatedDocHandler(cVar));
    }
}
