package com.bytedance.ee.bear.document.export.p307b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.export.AbstractC5168a;
import com.bytedance.ee.bear.contract.export.ExportFormatEnum;
import com.bytedance.ee.bear.document.export.p308c.C5764b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.export.b.b */
public class View$OnClickListenerC5760b extends AbstractC5756a<C5764b> implements View.OnClickListener, AbstractC5168a {
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C5764b mo23186h() {
        return (C5764b) aj.m5366a(getActivity()).mo6005a(C5764b.class);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.export_item_word) {
            mo23183a(ExportFormatEnum.DOCX);
        } else if (view.getId() == R.id.export_item_pdf) {
            mo23183a(ExportFormatEnum.PDF);
        } else if (view.getId() == R.id.export_item_image) {
            mo5513b();
            ((C5764b) this.f16225c).getDelegate().mo23206b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.export.p307b.AbstractC5756a
    /* renamed from: a */
    public void mo23182a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        View inflate = layoutInflater.inflate(R.layout.document_export_doc_items, viewGroup);
        inflate.findViewById(R.id.export_item_word).setOnClickListener(this);
        inflate.findViewById(R.id.export_item_pdf).setOnClickListener(this);
        View findViewById = inflate.findViewById(R.id.export_item_image);
        if (((C5764b) this.f16225c).shouldShowDocShot()) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        findViewById.setOnClickListener(this);
    }
}
