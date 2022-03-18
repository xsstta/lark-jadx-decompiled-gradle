package com.bytedance.ee.bear.list.star;

import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.star.d */
public class C8800d extends View$OnClickListenerC8546j {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: d */
    public boolean mo33386d() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32586a(C8551k kVar, int i, Document document) {
        super.mo32586a(kVar, i, document);
        kVar.f23189i.setImageResource(R.drawable.ud_icon_cancel_collection_outlined);
        C13747j.m55728a(kVar.f23189i, (int) R.color.static_white);
        kVar.f23189i.setTag(document);
    }

    C8800d(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
