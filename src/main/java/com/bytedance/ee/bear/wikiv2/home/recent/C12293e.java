package com.bytedance.ee.bear.wikiv2.home.recent;

import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.facade.common.icon.C7713a;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.list.preload.ListTitleView;
import com.bytedance.ee.bear.service.C10917c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.recent.e */
class C12293e extends View$OnClickListenerC8546j {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo33385a(Document document, ImageView imageView) {
        imageView.setImageResource(C7713a.m30839a(document.mo32483t(), document.mo32469n()));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32727a(C8551k kVar, Document document) {
        kVar.f23184d.setText(C8292f.m34191f(this.f51211q, document));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32803a(C8551k kVar, Document document, int i) {
        String str;
        super.mo32803a(kVar, document, i);
        kVar.f23181a.setSwipeEnable(false);
        ListTitleView listTitleView = kVar.f23183c;
        if (TextUtils.isEmpty(document.mo32469n())) {
            str = this.f51211q.getString(R.string.Doc_Wiki_UntitledPage);
        } else {
            str = C8292f.m34193g(this.f51211q, document);
        }
        listTitleView.setTitle(str);
        if (((WikiDocument) document).mo21018f() == 2) {
            kVar.mo33389a(document.mo32486u());
            return;
        }
        kVar.f23191k.setVisibility(8);
        kVar.f23190j.setVisibility(8);
    }

    C12293e(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager) {
        super(cVar, str, str2, docsLinearLayoutManager);
    }
}
