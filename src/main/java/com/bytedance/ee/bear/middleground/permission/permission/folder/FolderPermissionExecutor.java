package com.bytedance.ee.bear.middleground.permission.permission.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import io.reactivex.AbstractC68307f;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Deprecated(message = "repace by FolderPermissionManagerOV")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/folder/FolderPermissionExecutor;", "", "()V", "OLDER_SHARE_FOLDER_PUBLIC_PERMISSION", "", "OLDER_SHARE_FOLDER_USER_PERMISSION", "requestOldShareFolderPublicPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "spaceId", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "requestOldShareFolderUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "isShareRoot", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.a.a */
public final class FolderPermissionExecutor {

    /* renamed from: a */
    public static final FolderPermissionExecutor f26834a = new FolderPermissionExecutor();

    private FolderPermissionExecutor() {
    }

    @Deprecated(message = "repace by FolderPermissionManagerOV.requestOldShareFolderUserPermission")
    /* renamed from: a */
    public final AbstractC68307f<ShareFolderUserPermission> mo37771a(String str, FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/share_space/member/perm/");
        fVar.mo20145a("space_id", str);
        AbstractC68307f<ShareFolderUserPermission> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new FolderUserPermissionParser(folderVersion, z)).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }
}
