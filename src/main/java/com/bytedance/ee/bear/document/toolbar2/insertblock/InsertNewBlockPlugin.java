package com.bytedance.ee.bear.document.toolbar2.insertblock;

import com.bytedance.ee.bear.browser.BridgeHolder;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.model.toolbar.insertblock.InsertNewBlock;
import com.bytedance.ee.bear.edit.component.toolbar2.insertblock.AbsInsertNewBlockPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;

public class InsertNewBlockPlugin extends AbsInsertNewBlockPlugin<C4943e> {
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.insertblock.AbsInsertNewBlockPlugin
    public void bindBridgeHandler(String str, AbstractC7945d<InsertNewBlock> dVar) {
        ((BridgeHolder) getHostAbility(BridgeHolder.class)).mo19354a().mo19349a(str, dVar);
    }
}
