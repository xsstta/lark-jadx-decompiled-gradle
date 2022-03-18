package com.bytedance.ee.bear.list.recent;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.preload.C8668c;
import com.bytedance.ee.bear.service.C10917c;
import com.chad.library.adapter.base.C20923c;

/* renamed from: com.bytedance.ee.bear.list.recent.g */
public class C8684g extends View$OnClickListenerC8546j {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        C8143b.m32605a().mo31470c("bind_list_item");
        super.mo16806a(cVar, document);
        C8143b.m32605a().mo31468b("bind_list_item");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j, com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        C8143b.m32605a().mo31470c("inflate_list_layout");
        C8551k kVar = new C8551k(C8668c.m36224a().mo33674b(viewGroup.getContext()));
        C8143b.m32605a().mo31468b("inflate_list_layout");
        return kVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32727a(C8551k kVar, Document document) {
        if (!TextUtils.isEmpty(document.mo32449i())) {
            kVar.f23184d.setText(document.mo32449i());
        } else if (C8292f.m34162a(document)) {
            kVar.f23184d.setText(C8292f.m34189e(this.f51211q, document));
        } else if (this.f23164g == RecentSort.CREATED.getRank()) {
            kVar.f23184d.setText(C8292f.m34184d(this.f51211q, document));
        } else if (this.f23164g == RecentSort.MODIFIED.getRank()) {
            kVar.f23184d.setText(C8292f.m34169b(this.f51211q, document));
        } else if (this.f23164g == RecentSort.OPENED.getRank()) {
            kVar.f23184d.setText(C8292f.m34191f(this.f51211q, document));
        } else {
            kVar.f23184d.setText(C8292f.m34179c(this.f51211q, document));
        }
    }

    C8684g(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
