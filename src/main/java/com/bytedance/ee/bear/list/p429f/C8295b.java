package com.bytedance.ee.bear.list.p429f;

import android.content.res.ColorStateList;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.f.b */
public class C8295b extends View$OnClickListenerC8546j {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32586a(C8551k kVar, int i, Document document) {
        super.mo32586a(kVar, i, document);
        kVar.f23189i.setImageResource(R.drawable.ud_icon_cancel_buzz_outlined);
        kVar.f23189i.setImageTintList(ColorStateList.valueOf(-1));
    }

    C8295b(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
