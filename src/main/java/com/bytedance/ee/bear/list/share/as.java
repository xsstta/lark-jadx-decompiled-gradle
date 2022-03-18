package com.bytedance.ee.bear.list.share;

import android.widget.ImageView;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

public class as extends View$OnClickListenerC8546j {
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

    as(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
