package com.bytedance.ee.bear.doc.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import java.util.Arrays;

public class DocToolbar extends Toolbar {
    @Override // com.bytedance.ee.bear.document.toolbar.Item
    public String toString() {
        return "DocToolbar{items=" + Arrays.toString(getChildren()) + '}';
    }

    @Override // com.bytedance.ee.bear.document.toolbar.Toolbar
    public boolean supportSubToolbar(ItemId itemId) {
        if ((itemId != DocItemId.insertImage || adminLimit(DocItemId.insertImage)) && !super.supportSubToolbar(itemId)) {
            return false;
        }
        return true;
    }
}
