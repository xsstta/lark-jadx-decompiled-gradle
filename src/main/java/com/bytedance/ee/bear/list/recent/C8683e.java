package com.bytedance.ee.bear.list.recent;

import android.view.ViewGroup;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8534e;
import com.bytedance.ee.bear.list.list.C8537f;
import com.bytedance.ee.bear.list.p422a.C8143b;
import com.bytedance.ee.bear.list.preload.C8666b;
import com.bytedance.ee.bear.service.C10917c;
import com.chad.library.adapter.base.C20923c;

/* renamed from: com.bytedance.ee.bear.list.recent.e */
public class C8683e extends C8534e {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e, com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        C8143b.m32605a().mo31470c("inflate_list_layout");
        C8537f fVar = new C8537f(C8666b.m36220a().mo33672a(this.f51211q));
        C8143b.m32605a().mo31468b("inflate_list_layout");
        return fVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        C8143b.m32605a().mo31470c("bind_list_item");
        super.mo16806a(cVar, document);
        C8143b.m32605a().mo31468b("bind_list_item");
    }

    public C8683e(C10917c cVar, String str, String str2) {
        super(cVar, str, str2);
    }
}
