package com.bytedance.ee.bear.doc.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;

public enum DocTxtAttrId implements ItemId {
    bold,
    italic,
    underline,
    strikethrough,
    highlight,
    h1,
    h2,
    h3,
    h4,
    h5,
    h6,
    h7,
    h8,
    h9,
    checkbox,
    unorderedList,
    orderedList,
    inlineCode,
    codeList,
    blockQuote,
    alignLeft,
    alignCenter,
    alignRight,
    insertSeparator;

    @Override // com.bytedance.ee.bear.document.toolbar.ItemId
    public ItemId[] children() {
        return null;
    }
}
