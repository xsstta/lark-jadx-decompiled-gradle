package com.bytedance.ee.bear.list.share;

import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.service.C10917c;

/* renamed from: com.bytedance.ee.bear.list.share.t */
public class C8746t extends View$OnClickListenerC8546j {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32727a(C8551k kVar, Document document) {
        if (this.f23164g == ShareFileSort.CREATE_TIME.getRank()) {
            kVar.f23184d.setText(C8292f.m34184d(this.f51211q, document));
        } else if (this.f23164g == ShareFileSort.MODIFIED_TIME.getRank()) {
            kVar.f23184d.setText(C8292f.m34130a(this.f51211q, document));
        } else {
            kVar.f23184d.setText(C8292f.m34131a(this.f51211q, document, this.f23165h));
        }
    }

    C8746t(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
