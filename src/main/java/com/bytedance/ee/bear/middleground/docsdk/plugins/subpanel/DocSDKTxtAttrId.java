package com.bytedance.ee.bear.middleground.docsdk.plugins.subpanel;

import com.bytedance.ee.bear.document.toolbar.ItemId;

public enum DocSDKTxtAttrId implements ItemId {
    bold,
    italic,
    underline,
    strikethrough,
    highlight,
    h1,
    h2,
    h3,
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
