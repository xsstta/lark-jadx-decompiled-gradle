package com.bytedance.ee.bear.doc.toolbar;

import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.doc.toolbar.d */
public class C5546d extends AbstractC6212e<DocToolbar> {
    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "editor";
    }

    public String toString() {
        return "DocToolbar";
    }

    private void selectSpecifiedItem(DocToolbar docToolbar) {
        Item[] children = docToolbar.getChildren();
        for (Item item : children) {
            if (item.isSelected()) {
                C13479a.m54764b("DocToolbarPanelViewModel", "selectSpecifiedItem(): " + item);
                updateExpandedSubToolbars(item.id());
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onUpdateToolbar(DocToolbar docToolbar, DocToolbar docToolbar2) {
        super.onUpdateToolbar((Toolbar) docToolbar, (Toolbar) docToolbar2);
        if (docToolbar2 != null) {
            selectSpecifiedItem(docToolbar2);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6212e
    public void processToolbarItemClick(ItemId itemId, String str) {
        super.processToolbarItemClick(itemId, str);
        if (itemId == DocTxtAttrId.h1 || itemId == DocTxtAttrId.h2 || itemId == DocTxtAttrId.h3 || itemId == DocTxtAttrId.h4 || itemId == DocTxtAttrId.h5 || itemId == DocTxtAttrId.h6 || itemId == DocTxtAttrId.h7 || itemId == DocTxtAttrId.h8 || itemId == DocTxtAttrId.h9 || itemId == DocTxtAttrId.checkbox || itemId == DocTxtAttrId.unorderedList || itemId == DocTxtAttrId.orderedList) {
            clearSubToolbars();
        }
    }
}
