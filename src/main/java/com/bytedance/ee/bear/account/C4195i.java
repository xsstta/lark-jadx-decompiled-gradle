package com.bytedance.ee.bear.account;

import com.bytedance.ee.bear.account.AbstractC4163a;
import com.bytedance.ee.bear.contract.config.DocDynamicConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ee.bear.account.i */
class C4195i implements AbstractC4163a {

    /* renamed from: a */
    private final CopyOnWriteArrayList<AbstractC4163a.AbstractC4164a> f12666a = new CopyOnWriteArrayList<>();

    C4195i() {
    }

    @Override // com.bytedance.ee.bear.account.AbstractC4163a
    /* renamed from: a */
    public void mo16375a(AbstractC4163a.AbstractC4164a aVar) {
        if (aVar != null) {
            this.f12666a.add(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.account.AbstractC4163a
    /* renamed from: a */
    public void mo16376a(DocDynamicConfig docDynamicConfig) {
        Iterator<AbstractC4163a.AbstractC4164a> it = this.f12666a.iterator();
        while (it.hasNext()) {
            it.next().onConfigChange(docDynamicConfig);
        }
    }
}
