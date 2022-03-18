package com.bytedance.ee.bear.list.share;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8534e;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.share.ac */
public class C8711ac extends C8534e {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.bytedance.ee.bear.list.list.AbstractC8538g, com.chad.library.adapter.base.BaseQuickAdapter
    public int getItemViewType(int i) {
        if (i < mo70678c()) {
            return 273;
        }
        if (mo70685d(i) instanceof TitleDocument) {
            return 22;
        }
        return 11;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e, com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        if (i == 22) {
            return new ax(LayoutInflater.from(this.f51211q).inflate(R.layout.list_recycler_item_title, viewGroup, false));
        }
        return super.mo32344a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        if (cVar.getItemViewType() == 11) {
            super.mo16806a(cVar, document);
            return;
        }
        C13479a.m54764b("ShareFolderGridStyleAdapter", "convert()...helper = " + cVar);
    }

    C8711ac(C10917c cVar, String str, String str2) {
        super(cVar, str, str2);
    }
}
