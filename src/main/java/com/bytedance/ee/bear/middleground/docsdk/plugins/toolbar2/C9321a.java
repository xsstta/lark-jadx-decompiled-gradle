package com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2;

import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7603a;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.edit.component.toolbar2.C7645l;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2.a */
public class C9321a extends AbstractC7603a {

    /* renamed from: a */
    static final /* synthetic */ boolean f25055a = true;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d
    /* renamed from: a */
    public AbstractC7616f<DocToolbarV2> mo22161a() {
        if (f25055a || getActivity() != null) {
            return (AbstractC7616f) C4950k.m20474a(this, C7645l.class);
        }
        throw new AssertionError();
    }
}
