package com.bytedance.ee.bear.middleground_permission_export.model.p499a;

import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10169g;
import com.bytedance.ee.bear.middleground_permission_export.model.MemberChangeListener;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.form.BitableSharePermission;
import io.reactivex.AbstractC68307f;

/* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.a.b */
public interface AbstractC10156b {
    /* renamed from: a */
    AbstractC68307f<DocPermission> mo36642a(String str, int i);

    /* renamed from: a */
    AbstractC68307f<Integer> mo36643a(String str, FolderVersion folderVersion, boolean z);

    /* renamed from: a */
    AbstractC68307f<String> mo36644a(String str, String str2, String str3, int i, int i2);

    /* renamed from: a */
    AbstractC68307f<BitableSharePermission> mo36645a(String str, String str2, String str3, String str4, int i);

    /* renamed from: a */
    void mo36646a(int i);

    /* renamed from: a */
    void mo36647a(int i, String str, boolean z, AbstractC10169g gVar);

    /* renamed from: a */
    void mo36648a(MemberChangeListener eVar);

    /* renamed from: b */
    AbstractC68307f<IDocUserPermission> mo36649b(String str, int i);

    /* renamed from: b */
    AbstractC68307f<ShareFolderPermission> mo36650b(String str, FolderVersion folderVersion, boolean z);

    /* renamed from: b */
    void mo36651b(MemberChangeListener eVar);

    /* renamed from: c */
    AbstractC68307f<IDocPublicPermission> mo36652c(String str, int i);

    /* renamed from: c */
    AbstractC68307f<ShareFolderUserPermission> mo36653c(String str, FolderVersion folderVersion, boolean z);
}
