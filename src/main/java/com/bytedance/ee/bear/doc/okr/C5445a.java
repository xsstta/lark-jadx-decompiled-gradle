package com.bytedance.ee.bear.doc.okr;

import android.content.Context;
import com.bytedance.ee.bear.edit.component.document.AbstractC7593a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.doc.okr.a */
public class C5445a extends AbstractC7593a {
    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public int getPanelHeight(Context context) {
        return 0;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "okr";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.document.AbstractC7593a
    public void onKeyboardStateChanged(int i) {
        super.onKeyboardStateChanged(i);
        if (i == 0 && getActive().mo5927b() != null && getActive().mo5927b().booleanValue()) {
            C13479a.m54764b("OkrViewModel", "keyboard hide");
            setActive(false);
        }
    }
}
