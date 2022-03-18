package com.bytedance.ee.bear.list;

import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DefaultDocUserPermission;

/* access modifiers changed from: package-private */
public class DocumentUtils$2 extends DefaultDocUserPermission {
    final /* synthetic */ Document val$item;

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.DefaultDocUserPermission, com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canExport() {
        return this.val$item.mo32405U();
    }

    DocumentUtils$2(Document document) {
        this.val$item = document;
    }
}
