package com.bytedance.ee.bear.list.folder;

import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.folder.y */
public class C8386y implements Function<DocumentListInfo, AbstractC70020b<DocumentListInfo>> {
    /* renamed from: a */
    public AbstractC70020b<DocumentListInfo> apply(DocumentListInfo documentListInfo) {
        Document parent = documentListInfo.getParent();
        if (parent != null && FolderVersion.isShareFolderV2(parent.an())) {
            return ((AbstractC10157c) KoinJavaComponent.m268610a(AbstractC10157c.class)).mo36638a().mo36653c(parent.mo32472o(), new FolderVersion(parent.an(), parent.mo32397M(), parent.ap()), parent.mo32402R()).mo238020d(new Function() {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$y$iOrQbW9eDyWeA6Rni0eLVCA5ID0 */

                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return C8386y.m34729a(DocumentListInfo.this, (ShareFolderUserPermission) obj);
                }
            });
        }
        C13479a.m54764b("GetV2FolderPermissionFunction", "shareFolderUserPermission...no need, so return");
        return AbstractC68307f.m265083a(documentListInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ DocumentListInfo m34729a(DocumentListInfo documentListInfo, ShareFolderUserPermission shareFolderUserPermission) throws Exception {
        C13479a.m54764b("GetV2FolderPermissionFunction", "fetchShareFolderUserPermission()...success, permission = " + shareFolderUserPermission);
        documentListInfo.setParentPermission(shareFolderUserPermission);
        return documentListInfo;
    }
}
