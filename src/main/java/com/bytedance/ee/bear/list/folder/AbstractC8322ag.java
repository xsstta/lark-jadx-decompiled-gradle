package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.complaint.FolderForbiddenView;
import com.bytedance.ee.bear.list.list.AbstractC8544i;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;

/* renamed from: com.bytedance.ee.bear.list.folder.ag */
public interface AbstractC8322ag extends AbstractC8544i<AbstractC8323a> {

    /* renamed from: com.bytedance.ee.bear.list.folder.ag$a */
    public interface AbstractC8323a extends FolderForbiddenView.AbstractC8342a, AbstractC8544i.AbstractC8545a {
    }

    /* renamed from: a */
    void mo32723a(Document document);

    /* renamed from: a */
    void mo32724a(FolderForbiddenView.ForbiddenState forbiddenState);

    /* renamed from: a */
    void mo32725a(ShareFolderUserPermission shareFolderUserPermission);
}
