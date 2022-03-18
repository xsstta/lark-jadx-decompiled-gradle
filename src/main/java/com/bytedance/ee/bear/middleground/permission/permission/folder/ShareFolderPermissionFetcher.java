package com.bytedance.ee.bear.middleground.permission.permission.folder;

import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import io.reactivex.AbstractC68307f;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(level = DeprecationLevel.WARNING, message = "Use FolderPermissionManagerOV.fetchShareFolderPermission instead")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/folder/ShareFolderPermissionFetcher;", "", "()V", "fetchOldShareFolderPublicPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "spaceId", "", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "fetchOldShareFolderUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "isRoot", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.a.d */
public final class ShareFolderPermissionFetcher {
    /* renamed from: a */
    public final AbstractC68307f<ShareFolderUserPermission> mo37774a(String str, FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        FolderPermissionExecutor aVar = FolderPermissionExecutor.f26834a;
        if (str == null) {
            str = "";
        }
        return aVar.mo37771a(str, folderVersion, z);
    }
}
