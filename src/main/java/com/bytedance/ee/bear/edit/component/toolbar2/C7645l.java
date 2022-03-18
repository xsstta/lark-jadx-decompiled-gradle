package com.bytedance.ee.bear.edit.component.toolbar2;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.jsbridge.IBridge;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.l */
public class C7645l extends AbstractC7616f<DocToolbarV2> {
    private AbstractC7624i docToolbarV2Compat;

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "editor";
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f
    public boolean shouldNotifyVCKeyboardEvent() {
        if (this.docToolbarV2Compat != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f
    public int getPanelHeight(Context context) {
        if (hasSubToolBarV2()) {
            return super.getPanelHeight(context) * 2;
        }
        return super.getPanelHeight(context);
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f
    public void onAttachToUI(FragmentActivity fragmentActivity, IBridge iVar) {
        super.onAttachToUI(fragmentActivity, iVar);
        this.docToolbarV2Compat = DocToolbarV2Compat.of(fragmentActivity);
    }
}
