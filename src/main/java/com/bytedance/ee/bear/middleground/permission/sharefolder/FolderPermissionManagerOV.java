package com.bytedance.ee.bear.middleground.permission.sharefolder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.apply.C9574g;
import com.bytedance.ee.bear.middleground.permission.collaborator.C9635c;
import com.bytedance.ee.bear.middleground.permission.collaborator.NotNotifyUserResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9716f;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteResult;
import com.bytedance.ee.bear.middleground.permission.permission.folder.FolderPublicPermissionParser;
import com.bytedance.ee.bear.middleground.permission.permission.folder.FolderUserPermissionParser;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00160\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0016J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00152\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J(\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00152\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004H\u0016JF\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00152\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.2\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0016J,\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010-H\u0016J<\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010-2\u0006\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020 H\u0016J\u0016\u00108\u001a\b\u0012\u0004\u0012\u0002020\u00152\u0006\u00109\u001a\u00020\u0004H\u0016J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u0002020\u00152\u0006\u0010'\u001a\u00020\u0004H\u0016J \u0010;\u001a\u00020\u00042\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020-0,j\b\u0012\u0004\u0012\u00020-`.H\u0002J\u0010\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/sharefolder/FolderPermissionManagerOV;", "Lcom/bytedance/ee/bear/middleground/permission/sharefolder/IFolderPermission;", "()V", "ADD_SHARE_FOLDER_MEMBER", "", "APPLY_FOLDER_PERMISSION", "OLDER_GET_SHARE_FOLDER_MEMBER", "OLDER_SHARE_FOLDER_PUBLIC_PERMISSION", "OLDER_SHARE_FOLDER_USER_PERMISSION", "OLDER_UPDATE_SHARE_FOLDER_LINK_PERMISSION", "REMOVE_SHARE_FOLDER_MEMBER", "SHARE_PERMISSION_TRANSFER_FOLDER_OWNER", "SHARE_PERMISSION_TRANSFER_FOLDER_OWNER_NEW", "TAG", "TYPE_DEPARTMENT", "", "TYPE_GROUP", "TYPE_UNREGISTER", "TYPE_USER", "UPDATE_SHARE_FOLDER_MEMBER_PERMISSION", "applyPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "token", "permission", "message", "fetchShareFolderPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "spaceId", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isRoot", "", "fetchShareFolderPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "fetchShareFolderUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "getCollaboratorInfo", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "param", "lastLabel", "inviteMembers", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "notify", "notes", "removeMember", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "userInfo", "transferOwner", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "canRecursiveTransfer", "recursiveTransfer", "updatePublicPermission", "params", "updateUserPermission", "usersConvertToJson", "wrapOwnerType", ShareHitPoint.f121869d, "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.f.d */
public final class FolderPermissionManagerOV implements IFolderPermission {

    /* renamed from: a */
    public static final FolderPermissionManagerOV f26822a = new FolderPermissionManagerOV();

    /* renamed from: a */
    private final int m41259a(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i != 17) {
            return i != 18 ? 1 : 18;
        }
        return 17;
    }

    private FolderPermissionManagerOV() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<InviteResult> mo37740a(ArrayList<UserInfo> arrayList, boolean z, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUsers");
        Intrinsics.checkParameterIsNotNull(str, "notes");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "spaceId");
        HashMap hashMap = new HashMap();
        hashMap.put("token", str2);
        if (str3.length() > 0) {
            hashMap.put("space_id", str3);
        }
        hashMap.put("owners", m41260a(arrayList));
        hashMap.put("need_notify", "0");
        hashMap.put("send_lark_im", String.valueOf(z));
        hashMap.put("lark_im_text", str);
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/space/add/");
        fVar.mo20143a(1);
        fVar.mo20147a(hashMap);
        AbstractC68307f<InviteResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9716f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…teParser()).pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<NotNotifyUserResult> mo37739a(String str, String str2, UserInfo userInfo, boolean z, boolean z2) {
        String id;
        NetService.C5077f fVar = new NetService.C5077f(z ? "/api/suite/permission/share_space/transfer_owner/" : "/api/explorer/space/transfer_owner/");
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        hashMap.put("space_id", str2);
        if (!(userInfo == null || (id = userInfo.getId()) == null)) {
            str3 = id;
        }
        hashMap.put("owner_id", str3);
        hashMap.put("owner_type", "0");
        hashMap.put("recursive_transfer", String.valueOf(z2));
        fVar.mo20143a(1);
        fVar.mo20147a(hashMap);
        AbstractC68307f<NotNotifyUserResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9635c()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…erParser()).pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo37733a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "params");
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/share_space/setting/update/");
        fVar.mo20143a(1);
        fVar.mo20153c(str);
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: b */
    public AbstractC68307f<SimpleRequestResult> mo37741b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "param");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/share_space/member/update/");
        fVar.mo20143a(1);
        fVar.mo20153c(str);
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…ltParser()).pull(request)");
        return a;
    }

    /* renamed from: a */
    private final String m41260a(ArrayList<UserInfo> arrayList) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<UserInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                JSONObject jSONObject = new JSONObject();
                Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
                jSONObject.put("id", next.getId());
                jSONObject.put(ShareHitPoint.f121869d, m41259a(next.getOwnerType()));
                jSONObject.put("perm", next.getPermission());
                jSONArray.put(jSONObject);
            }
        } catch (JSONException e) {
            C13479a.m54761a("FolderPermissionManagerOV", e);
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkExpressionValueIsNotNull(jSONArray2, "jsonArray.toString()");
        return jSONArray2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "t1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "t2", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.d$a */
    static final class C9918a<T1, T2, R> implements BiFunction<ShareFolderUserPermission, ShareFolderPublicPermission, ShareFolderPermission> {

        /* renamed from: a */
        public static final C9918a f26823a = new C9918a();

        C9918a() {
        }

        /* renamed from: a */
        public final ShareFolderPermission apply(ShareFolderUserPermission shareFolderUserPermission, ShareFolderPublicPermission shareFolderPublicPermission) {
            Intrinsics.checkParameterIsNotNull(shareFolderUserPermission, "t1");
            Intrinsics.checkParameterIsNotNull(shareFolderPublicPermission, "t2");
            return new ShareFolderPermission(shareFolderUserPermission, shareFolderPublicPermission);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<ShareFolderPublicPermission> mo37735a(String str, FolderVersion folderVersion) {
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/share_space/setting/get/");
        if (str == null) {
            str = "";
        }
        fVar.mo20145a("space_id", str);
        AbstractC68307f<ShareFolderPublicPermission> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new FolderPublicPermissionParser(folderVersion)).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<ShareUserInfoResult> mo37737a(String str, String str2) {
        String str3;
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/share_space/members/");
        if (str != null) {
            str3 = str;
        } else {
            str3 = "";
        }
        fVar.mo20145a("space_id", str3);
        fVar.mo20143a(2);
        AbstractC68307f<ShareUserInfoResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9919f(str)).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: b */
    public AbstractC68307f<ShareFolderPermission> mo37742b(String str, FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        AbstractC68307f<ShareFolderPermission> a = AbstractC68307f.m265092a(mo37736a(str, folderVersion, z), mo37735a(str, folderVersion), C9918a.f26823a);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.zip(userPermFlo…1, t2)\n                })");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<NetService.Result<String>> mo37734a(String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "";
        }
        hashMap.put("token", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("message", str2);
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/space/apply_permission/");
        fVar.mo20143a(1);
        fVar.mo20147a(hashMap);
        AbstractC68307f<NetService.Result<String>> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9574g()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…lyParser()).pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<ShareFolderUserPermission> mo37736a(String str, FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        NetService.C5077f fVar = new NetService.C5077f("/api/suite/permission/share_space/member/perm/");
        if (str == null) {
            str = "";
        }
        fVar.mo20145a("space_id", str);
        AbstractC68307f<ShareFolderUserPermission> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new FolderUserPermissionParser(folderVersion, z)).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo37738a(String str, String str2, UserInfo userInfo) {
        String id;
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/space/remove/");
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        hashMap.put("space_id", str);
        if (!(userInfo == null || (id = userInfo.getId()) == null)) {
            str3 = id;
        }
        hashMap.put("owner_id", str3);
        fVar.mo20147a(hashMap);
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…ltParser()).pull(request)");
        return a;
    }
}
