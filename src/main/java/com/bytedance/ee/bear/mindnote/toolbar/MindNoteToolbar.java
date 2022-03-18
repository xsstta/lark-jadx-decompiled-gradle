package com.bytedance.ee.bear.mindnote.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import java.util.Arrays;

public class MindNoteToolbar extends Toolbar {
    @Override // com.bytedance.ee.bear.document.toolbar.Item
    public String toString() {
        return "MindNoteToolbar{items=" + Arrays.toString(getChildren()) + '}';
    }

    @Override // com.bytedance.ee.bear.document.toolbar.Toolbar
    public boolean supportSubToolbar(ItemId itemId) {
        if ((itemId != MindNoteItemId.insertImage || adminLimit(MindNoteItemId.insertImage)) && !super.supportSubToolbar(itemId)) {
            return false;
        }
        return true;
    }
}
