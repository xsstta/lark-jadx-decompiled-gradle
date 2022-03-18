package com.bytedance.ee.bear.middleground.permission.sharefolder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import io.reactivex.AbstractC68307f;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H&J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH&J(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H&JF\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H&J,\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u001cH&J<\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u0010H&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\u0006\u0010\f\u001a\u00020\u0005H&¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/sharefolder/IFolderPermission;", "", "applyPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "", "token", "permission", "", "message", "fetchShareFolderPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "param", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isRoot", "", "fetchShareFolderPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "fetchShareFolderUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "getCollaboratorInfo", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "lastLabel", "inviteMembers", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "notify", "notes", "spaceId", "removeMember", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "userInfo", "transferOwner", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "canRecursiveTransfer", "recursiveTransfer", "updatePublicPermission", "updateUserPermission", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.f.e */
public interface IFolderPermission {
    /* renamed from: a */
    AbstractC68307f<SimpleRequestResult> mo37733a(String str);

    /* renamed from: a */
    AbstractC68307f<NetService.Result<String>> mo37734a(String str, int i, String str2);

    /* renamed from: a */
    AbstractC68307f<ShareFolderPublicPermission> mo37735a(String str, FolderVersion folderVersion);

    /* renamed from: a */
    AbstractC68307f<ShareFolderUserPermission> mo37736a(String str, FolderVersion folderVersion, boolean z);

    /* renamed from: a */
    AbstractC68307f<ShareUserInfoResult> mo37737a(String str, String str2);

    /* renamed from: a */
    AbstractC68307f<SimpleRequestResult> mo37738a(String str, String str2, UserInfo userInfo);

    /* renamed from: a */
    AbstractC68307f<NotNotifyUserResult> mo37739a(String str, String str2, UserInfo userInfo, boolean z, boolean z2);

    /* renamed from: a */
    AbstractC68307f<InviteResult> mo37740a(ArrayList<UserInfo> arrayList, boolean z, String str, String str2, String str3);

    /* renamed from: b */
    AbstractC68307f<SimpleRequestResult> mo37741b(String str);

    /* renamed from: b */
    AbstractC68307f<ShareFolderPermission> mo37742b(String str, FolderVersion folderVersion, boolean z);
}
