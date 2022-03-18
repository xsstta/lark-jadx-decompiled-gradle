package com.bytedance.ee.bear.list.manualoffline;

import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p716r.C13721c;

/* renamed from: com.bytedance.ee.bear.list.manualoffline.c */
public class C8602c extends View$OnClickListenerC8546j {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32727a(C8551k kVar, Document document) {
        String str;
        if (C8292f.m34162a(document)) {
            str = C8292f.m34189e(this.f51211q, document);
        } else if (this.f23164g == ManualOfflineSort.CREATED.getRank()) {
            str = C8292f.m34184d(this.f51211q, document);
        } else {
            str = C8292f.m34130a(this.f51211q, document);
        }
        if (document.mo32483t() == C8275a.f22375h.mo32555b()) {
            str = C13675f.m55508b(C13721c.m55642a(document.mo32407W(), 0L)) + " " + str;
        }
        kVar.f23184d.setText(str);
    }

    C8602c(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
