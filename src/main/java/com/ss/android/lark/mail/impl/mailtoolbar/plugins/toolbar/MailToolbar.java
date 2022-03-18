package com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar;

import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.document.toolbar.Toolbar;
import com.ss.android.lark.mail.impl.compose.C41970e;
import java.util.Arrays;

public class MailToolbar extends Toolbar {
    @Override // com.bytedance.ee.bear.document.toolbar.Item
    public String toString() {
        return "MailToolbar{items=" + Arrays.toString(getChildren()) + '}';
    }

    @Override // com.bytedance.ee.bear.document.toolbar.Toolbar
    public boolean supportSubToolbar(ItemId itemId) {
        if (itemId == MailItemId.insertImage || super.supportSubToolbar(itemId) || itemId == MailItemId.attachment || (itemId == MailItemId.signature && C41970e.m166941d().mo150951a())) {
            return true;
        }
        return false;
    }
}
