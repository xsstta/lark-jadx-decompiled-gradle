package com.bytedance.ee.bear.doc.toolbar;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.toolbar.AbstractC6208d;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.C6226g;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6236a;

/* renamed from: com.bytedance.ee.bear.doc.toolbar.c */
public class C5545c extends AbstractC6208d<DocToolbar> {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public int mo22139a(ItemId itemId) {
        return C6226g.m25078a((DocItemId) itemId);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: a */
    public AbstractC6212e mo22140a(FragmentActivity fragmentActivity) {
        return (AbstractC6212e) aj.m5366a(fragmentActivity).mo6005a(C5546d.class);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6208d
    /* renamed from: b */
    public Class<? extends DialogInterface$OnCancelListenerC1021b> mo22141b(ItemId itemId) {
        if (itemId == DocItemId.attribution) {
            return C5547e.class;
        }
        if (itemId == DocItemId.insertImage) {
            return C6236a.class;
        }
        throw new IllegalStateException("get subToolbarFragmentClass on:" + itemId);
    }
}
