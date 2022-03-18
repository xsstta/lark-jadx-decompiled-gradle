package com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar;

import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.bytedance.ee.bear.middleground.docsdk.plugins.subpanel.DocSDKTxtAttrId;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar.a */
public class C9318a extends AbstractC6212e<DocSDKToolbar> {
    @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
    public String getPanelName() {
        return "editor";
    }

    public String toString() {
        return "DocSDKToolbar";
    }

    private void selectSpecifiedItem(DocSDKToolbar docSDKToolbar) {
        Item[] children = docSDKToolbar.getChildren();
        for (Item item : children) {
            if (item.isSelected()) {
                C13479a.m54764b("DocSDKToolbarViewModel", "selectSpecifiedItem(): " + item);
                updateExpandedSubToolbars(item.id());
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onUpdateToolbar(DocSDKToolbar docSDKToolbar, DocSDKToolbar docSDKToolbar2) {
        super.onUpdateToolbar((Toolbar) docSDKToolbar, (Toolbar) docSDKToolbar2);
        if (docSDKToolbar2 != null) {
            selectSpecifiedItem(docSDKToolbar2);
        }
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6212e
    public void processToolbarItemClick(ItemId itemId, String str) {
        super.processToolbarItemClick(itemId, str);
        if (itemId == DocSDKTxtAttrId.h1 || itemId == DocSDKTxtAttrId.h2 || itemId == DocSDKTxtAttrId.h3 || itemId == DocSDKTxtAttrId.checkbox || itemId == DocSDKTxtAttrId.unorderedList || itemId == DocSDKTxtAttrId.orderedList) {
            clearSubToolbars();
        }
    }
}
