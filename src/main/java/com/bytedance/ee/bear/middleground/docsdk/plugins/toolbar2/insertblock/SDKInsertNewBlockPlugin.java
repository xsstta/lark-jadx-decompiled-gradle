package com.bytedance.ee.bear.middleground.docsdk.plugins.toolbar2.insertblock;

import com.bytedance.ee.bear.document.model.toolbar.insertblock.InsertNewBlock;
import com.bytedance.ee.bear.edit.component.toolbar2.insertblock.AbsInsertNewBlockPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.middleground.docsdk.v2.core.C9344a;

public class SDKInsertNewBlockPlugin extends AbsInsertNewBlockPlugin<C9344a> {
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.insertblock.AbsInsertNewBlockPlugin
    public void bindBridgeHandler(String str, AbstractC7945d<InsertNewBlock> dVar) {
        ((C9344a) getHost()).mo19448b().mo19431a(str, (AbstractC7945d) dVar);
    }
}
