package com.bytedance.ee.bear.document.model.toolbar;

import com.bytedance.ee.util.io.NonProguard;

public class DocToolbarV2 extends ToolbarV2 implements NonProguard {
    public DocToolbarV2() {
    }

    @Override // com.bytedance.ee.bear.document.model.toolbar.ToolbarV2
    public boolean supportSubToolbar(ItemIdV2 itemIdV2) {
        if (itemIdV2 == ToolbarPrimaryItemId.insertImage || super.supportSubToolbar(itemIdV2)) {
            return true;
        }
        return false;
    }

    public DocToolbarV2(ToolbarV2 toolbarV2) {
        setItems(toolbarV2.getItems());
        setShowingItemId(toolbarV2.getShowingItemId());
        setType(toolbarV2.getType());
    }
}
