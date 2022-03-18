package com.bytedance.ee.bear.doc.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;

public enum DocItemId implements ItemId.AbstractC6203a {
    reminder,
    attribution,
    insertImage,
    mention,
    comment,
    indentLeft,
    indentRight,
    undo,
    redo;

    @Override // com.bytedance.ee.bear.document.toolbar.ItemId
    public ItemId[] children() {
        if (this == attribution) {
            return DocTxtAttrId.values();
        }
        return null;
    }
}
