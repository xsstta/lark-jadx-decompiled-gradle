package com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.middleground.docsdk.plugins.subpanel.DocSDKTxtAttrId;

public enum DocSDKItemId implements ItemId.AbstractC6203a {
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
            return DocSDKTxtAttrId.values();
        }
        return null;
    }
}
