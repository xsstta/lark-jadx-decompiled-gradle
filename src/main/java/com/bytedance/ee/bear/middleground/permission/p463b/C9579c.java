package com.bytedance.ee.bear.middleground.permission.p463b;

import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.p486f.C9920g;
import com.bytedance.ee.bear.middleground.permission.permission.bitableshare.BitableSharePermissionManager;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionFetcher;
import com.bytedance.ee.bear.middleground.permission.setting.manager.DocPublicPermissionManager;
import com.bytedance.ee.bear.middleground.permission.sharefolder.FolderPermissionManagerDispatcher;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.b.c */
class C9579c implements AbstractC10156b {

    /* renamed from: a */
    private static final List<MemberChangeListener> f25727a = new ArrayList();

    /* renamed from: com.bytedance.ee.bear.middleground.permission.b.c$a */
    private static class C9581a {

        /* renamed from: a */
        public static final C9579c f25728a = new C9579c();
    }

    private C9579c() {
    }

    /* renamed from: a */
    public static AbstractC10156b m39542a() {
        return C9581a.f25728a;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: b */
    public void mo36651b(MemberChangeListener eVar) {
        f25727a.remove(eVar);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: a */
    public void mo36646a(int i) {
        for (MemberChangeListener eVar : f25727a) {
            eVar.mo18937b(i);
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: a */
    public void mo36648a(MemberChangeListener eVar) {
        List<MemberChangeListener> list = f25727a;
        if (!list.contains(eVar)) {
            list.add(eVar);
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: a */
    public AbstractC68307f<DocPermission> mo36642a(String str, int i) {
        DocPermissionFetcher cVar = new DocPermissionFetcher();
        if (str == null) {
            str = "";
        }
        return cVar.mo38092a(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: b */
    public AbstractC68307f<IDocUserPermission> mo36649b(String str, int i) {
        DocPermissionFetcher cVar = new DocPermissionFetcher();
        if (str == null) {
            str = "";
        }
        return cVar.mo38096b(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: c */
    public AbstractC68307f<IDocPublicPermission> mo36652c(String str, int i) {
        DocPermissionFetcher cVar = new DocPermissionFetcher();
        if (str == null) {
            str = "";
        }
        return cVar.mo38097c(str, i);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: a */
    public AbstractC68307f<Integer> mo36643a(String str, FolderVersion folderVersion, boolean z) {
        return new C9920g().mo37754a(str, folderVersion, z).mo238020d($$Lambda$V4DuiK3vPMxH8EspBiOL3byYfYM.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: b */
    public AbstractC68307f<ShareFolderPermission> mo36650b(String str, FolderVersion folderVersion, boolean z) {
        return FolderPermissionManagerDispatcher.m41256a(folderVersion.isShareFolderV2()).mo37742b(str, folderVersion, z);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: c */
    public AbstractC68307f<ShareFolderUserPermission> mo36653c(String str, FolderVersion folderVersion, boolean z) {
        return FolderPermissionManagerDispatcher.m41256a(folderVersion.isShareFolderV2()).mo37736a(str, folderVersion, z);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: a */
    public void mo36647a(int i, String str, boolean z, AbstractC10169g gVar) {
        new DocPublicPermissionManager(PermFGUtils.m39533b()).mo38461a(str, i, z, 1, gVar);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: a */
    public AbstractC68307f<String> mo36644a(String str, String str2, String str3, int i, int i2) {
        return BitableSharePermissionManager.m41325a(str, str2, str3, i, i2);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10156b
    /* renamed from: a */
    public AbstractC68307f<BitableSharePermission> mo36645a(String str, String str2, String str3, String str4, int i) {
        return BitableSharePermissionManager.m41326a(str, str2, str3, str4, i);
    }
}
