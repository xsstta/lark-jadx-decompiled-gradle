package com.bytedance.ee.bear.document;

import com.bytedance.ee.bear.contract.AbstractC5232w;
import com.bytedance.ee.bear.document.offline.offlinestorage.C5955d;
import com.bytedance.ee.bear.document.offline.sync.sync.C6027a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.document.ah */
public class C5639ah extends AbstractC5232w {
    @Override // com.bytedance.ee.bear.service.base.AbstractC10913a
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void clearOffMemCache() {
        C5955d.m24025b().mo24106h();
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void clearOfflineDB() {
        C5955d.m24025b().mo24104g();
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void delDocs(String str) {
        C6027a.m24403a().mo24350a(str);
    }

    @Override // com.bytedance.ee.bear.contract.as
    public void delDocsList(List<String> list) {
        C6027a.m24403a().mo24351a(list);
    }
}
