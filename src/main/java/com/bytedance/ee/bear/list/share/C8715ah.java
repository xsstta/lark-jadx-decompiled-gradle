package com.bytedance.ee.bear.list.share;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.FolderSort;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.share.ah */
public class C8715ah extends View$OnClickListenerC8546j {
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
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j, com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        if (i == 22) {
            return new ax(LayoutInflater.from(this.f51211q).inflate(R.layout.list_recycler_item_title, viewGroup, false));
        }
        return super.mo32344a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32727a(C8551k kVar, Document document) {
        if (this.f23164g == FolderSort.CREATED_TIME.getRank()) {
            kVar.f23184d.setText(C8292f.m34184d(this.f51211q, document));
        } else {
            kVar.f23184d.setText(C8292f.m34130a(this.f51211q, document));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        if (cVar.getItemViewType() == 11) {
            super.mo16806a(cVar, document);
            return;
        }
        C13479a.m54764b("ShareFolderListStyleAdapter", "convert()...helper = " + cVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32586a(C8551k kVar, int i, Document document) {
        int i2;
        int i3;
        super.mo32586a(kVar, i, document);
        ImageView imageView = kVar.f23189i;
        if (document.mo32456j()) {
            i2 = R.drawable.ud_icon_cancel_collection_outlined;
        } else {
            i2 = R.drawable.ud_icon_collection_outlined;
        }
        imageView.setImageResource(i2);
        ImageView imageView2 = kVar.f23189i;
        if (document.mo32456j()) {
            i3 = R.color.function_danger_500;
        } else {
            i3 = R.color.space_list_bg_item_menu_start;
        }
        imageView2.setBackgroundResource(i3);
    }

    C8715ah(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
