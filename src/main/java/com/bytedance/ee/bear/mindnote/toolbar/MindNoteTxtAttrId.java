package com.bytedance.ee.bear.mindnote.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;

public enum MindNoteTxtAttrId implements ItemId {
    bold,
    italic,
    underline,
    h1,
    h2,
    h3,
    highlight;

    @Override // com.bytedance.ee.bear.document.toolbar.ItemId
    public ItemId[] children() {
        return null;
    }
}
