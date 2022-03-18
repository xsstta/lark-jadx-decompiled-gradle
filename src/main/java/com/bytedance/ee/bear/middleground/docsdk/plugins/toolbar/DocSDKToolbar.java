package com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import java.util.Arrays;

public class DocSDKToolbar extends Toolbar {
    @Override // com.bytedance.ee.bear.document.toolbar.Item
    public String toString() {
        return "DocSDKToolbar{items=" + Arrays.toString(getChildren()) + '}';
    }

    @Override // com.bytedance.ee.bear.document.toolbar.Toolbar
    public boolean supportSubToolbar(ItemId itemId) {
        if ((itemId != DocSDKItemId.insertImage || adminLimit(DocSDKItemId.insertImage)) && !super.supportSubToolbar(itemId)) {
            return false;
        }
        return true;
    }
}
