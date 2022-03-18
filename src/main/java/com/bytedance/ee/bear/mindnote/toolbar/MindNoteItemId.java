package com.bytedance.ee.bear.mindnote.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;

public enum MindNoteItemId implements ItemId.AbstractC6203a {
    outdent,
    indent,
    finish,
    mention,
    note,
    comment,
    insertImage,
    mnAttribute,
    undo,
    redo,
    delete;

    @Override // com.bytedance.ee.bear.document.toolbar.ItemId
    public ItemId[] children() {
        if (this == mnAttribute) {
            return MindNoteTxtAttrId.values();
        }
        return null;
    }
}
