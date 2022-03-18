package com.bytedance.ee.bear.middleground.permission.sharefolder;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
import com.bytedance.ee.bear.middleground.permission.setting.manager.CheckLockParser;
import com.bytedance.ee.bear.middleground.permission.setting.manager.CheckLockResult;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00170\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0016J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u0010H\u0007J2\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0010H\u0007J \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020\u001cH\u0007J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020\u0010H\u0007J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\u0006\u0010&\u001a\u00020\u0004H\u0002J&\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001cH\u0016J \u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*H\u0016J(\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001cH\u0016J\"\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00162\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u0004H\u0016JF\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00162\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`92\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0016J,\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00162\b\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010?\u001a\u0004\u0018\u000108H\u0016J0\u0010@\u001a\b\u0012\u0004\u0012\u00020/0\u00162\u0006\u0010A\u001a\u00020B2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001cH\u0002J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004J<\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010?\u001a\u0004\u0018\u0001082\u0006\u0010F\u001a\u00020\u001c2\u0006\u0010G\u001a\u00020\u001cH\u0016J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020>0\u00162\u0006\u0010&\u001a\u00020\u0004H\u0016J\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020>0\u00162\u0006\u0010&\u001a\u00020\u0004H\u0016J \u0010J\u001a\u00020B2\u0016\u00106\u001a\u0012\u0012\u0004\u0012\u00020807j\b\u0012\u0004\u0012\u000208`9H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/sharefolder/FolderPermissionManager;", "Lcom/bytedance/ee/bear/middleground/permission/sharefolder/IFolderPermission;", "()V", "APPLY_PERMISSION_V2", "", "CHECK_LOCK_MEMBERS_DELETE", "CHECK_LOCK_MEMBERS_UPDATE", "CHECK_LOCK_PUBLIC_PERMISSION_UPDATE", "FETCH_MEMBERS_V2", "INVITE_MEMBERS_V2", "MEMBERS_UPDATE_V2", "OLDER_SHARE_FOLDER_PUBLIC_PERMISSION_V2", "OLDER_SHARE_FOLDER_USER_PERMISSION_V2", "PERMISSION_UNLOCK", "REMOVE_MEMBER_V2", "REMOVE_PERMISSION", "", "TAG", "TRANSFER_OWNER_V2", "TRANS_OWNER_PERMISSION", "UPDATE_PUBLIC_PERMISSION_V2", "applyPermission", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "token", "permission", "message", "checkMembersDeleteLock", "", "memberId", "memberType", "checkMembersUpdateLock", "permRole", "checkUpdateExternalAccess", "externalAccess", "checkUpdateLinkShareEntity", "linkShareEntity", "checkUpdatePublicPermLock", "params", "fetchShareFolderPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "folderVersion", "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isRoot", "fetchShareFolderPublicPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "fetchShareFolderUserPermission", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "getCollaboratorInfo", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "param", "lastLabel", "inviteMembers", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteResult;", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "notify", "notes", "spaceId", "removeMember", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "userInfo", "requestOldShareFolderUserPermissionV2", "actionArray", "Lcom/alibaba/fastjson/JSONArray;", "requestUnlock", "transferOwner", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/NotNotifyUserResult;", "canRecursiveTransfer", "recursiveTransfer", "updatePublicPermission", "updateUserPermission", "usersConvertToJson", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.f.b */
public final class FolderPermissionManager implements IFolderPermission {

    /* renamed from: a */
    public static final FolderPermissionManager f26813a = new FolderPermissionManager();

    private FolderPermissionManager() {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<ShareFolderPublicPermission> mo37735a(String str, FolderVersion folderVersion) {
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/setting/");
        if (str == null) {
            str = "";
        }
        fVar.mo20145a("token", str);
        AbstractC68307f<ShareFolderPublicPermission> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new FolderPublicPermissionParser(folderVersion)).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<ShareUserInfoResult> mo37737a(String str, String str2) {
        C13479a.m54764b("FolderPermissionManager", "getUserInfoV2()...lastLabel = " + str2);
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/collaborators/");
        if (str == null) {
            str = "";
        }
        fVar.mo20145a("token", str);
        if (str2 == null) {
            str2 = "";
        }
        fVar.mo20145a("last_label", str2);
        AbstractC68307f<ShareUserInfoResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CollaboratorInfoParser()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<InviteResult> mo37740a(ArrayList<UserInfo> arrayList, boolean z, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(arrayList, "selectedUsers");
        Intrinsics.checkParameterIsNotNull(str, "notes");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "spaceId");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/collaborators/create/");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((Object) "token", (Object) str2);
        jSONObject2.put((Object) "collaborators", (Object) m41233a(arrayList));
        jSONObject2.put((Object) "need_notify", (Object) Boolean.valueOf(z));
        jSONObject2.put((Object) "notify_text", (Object) str);
        fVar.mo20153c(jSONObject.toJSONString());
        fVar.mo20143a(1);
        AbstractC68307f<InviteResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9716f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo37738a(String str, String str2, UserInfo userInfo) {
        String id;
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/collaborators/delete/");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        jSONObject2.put((Object) "token", (Object) str2);
        if (!(userInfo == null || (id = userInfo.getId()) == null)) {
            str3 = id;
        }
        jSONObject2.put((Object) "collaborator_id", (Object) str3);
        jSONObject2.put((Object) "collaborator_type", (Object) Integer.valueOf(userInfo != null ? userInfo.getOwnerType() : 0));
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<NotNotifyUserResult> mo37739a(String str, String str2, UserInfo userInfo, boolean z, boolean z2) {
        String id;
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/collaborators/transfer/");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        jSONObject2.put((Object) "token", (Object) str);
        if (!(userInfo == null || (id = userInfo.getId()) == null)) {
            str3 = id;
        }
        jSONObject2.put((Object) "collaborator_id", (Object) str3);
        if (z) {
            jSONObject2.put((Object) "recursive_transfer", (Object) Boolean.valueOf(z2));
        }
        fVar.mo20143a(1);
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<NotNotifyUserResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9635c()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.b$d */
    public static final class C9915d<T, R> implements Function<Throwable, Boolean> {

        /* renamed from: a */
        public static final C9915d f26817a = new C9915d();

        C9915d() {
        }

        /* renamed from: a */
        public final boolean mo37747a(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            C13479a.m54759a("FolderPermissionManager", "checkUpdatePublicPermLock()...", th);
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.Function
        public /* synthetic */ Boolean apply(Throwable th) {
            return Boolean.valueOf(mo37747a(th));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.b$f */
    public static final class C9917f<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C9917f f26819a = new C9917f();

        C9917f() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(SimpleRequestResult simpleRequestResult) {
            Intrinsics.checkParameterIsNotNull(simpleRequestResult, "it");
            return AbstractC68307f.m265083a((Object) true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.b$a */
    static final class C9912a<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C9912a f26814a = new C9912a();

        C9912a() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(CheckLockResult checkLockResult) {
            Intrinsics.checkParameterIsNotNull(checkLockResult, "it");
            return AbstractC68307f.m265083a(Boolean.valueOf(checkLockResult.isNeedLock()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.b$b */
    static final class C9913b<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C9913b f26815a = new C9913b();

        C9913b() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(CheckLockResult checkLockResult) {
            Intrinsics.checkParameterIsNotNull(checkLockResult, "it");
            return AbstractC68307f.m265083a(Boolean.valueOf(checkLockResult.isNeedLock()));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/middleground/permission/setting/manager/CheckLockResult;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.b$c */
    public static final class C9914c<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C9914c f26816a = new C9914c();

        C9914c() {
        }

        /* renamed from: a */
        public final AbstractC68307f<Boolean> apply(CheckLockResult checkLockResult) {
            Intrinsics.checkParameterIsNotNull(checkLockResult, "it");
            return AbstractC68307f.m265083a(Boolean.valueOf(checkLockResult.isNeedLock()));
        }
    }

    /* renamed from: d */
    private final AbstractC68307f<Boolean> m41238d(String str) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/check_lock/public/update/");
        fVar.mo20153c(str);
        AbstractC68307f<Boolean> f = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CheckLockParser()).mo20141a(fVar).mo238014c(C9914c.f26816a).mo238029f(C9915d.f26817a);
        Intrinsics.checkExpressionValueIsNotNull(f, "KoinJavaComponent.get(Ne…  false\n                }");
        return f;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: b */
    public AbstractC68307f<SimpleRequestResult> mo37741b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "params");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/collaborators/update/");
        fVar.mo20153c(str);
        fVar.mo20143a(1);
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    /* renamed from: a */
    private final JSONArray m41233a(ArrayList<UserInfo> arrayList) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator<UserInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                UserInfo next = it.next();
                JSONObject jSONObject = new JSONObject();
                Intrinsics.checkExpressionValueIsNotNull(next, "userInfo");
                jSONObject.put((Object) "collaborator_id", (Object) next.getId());
                jSONObject.put((Object) "collaborator_type", (Object) Integer.valueOf(next.getOwnerType()));
                jSONObject.put((Object) "perm_role", (Object) Integer.valueOf(next.getPermission()));
                jSONArray.add(jSONObject);
            }
        } catch (JSONException e) {
            C13479a.m54761a("FolderPermissionManager", e);
        }
        return jSONArray;
    }

    /* renamed from: c */
    public final AbstractC68307f<Boolean> mo37743c(String str) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/unlock/");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        fVar.mo20153c(jSONObject.toJSONString());
        fVar.mo20143a(1);
        AbstractC68307f<Boolean> c = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar).mo238014c(C9917f.f26819a);
        Intrinsics.checkExpressionValueIsNotNull(c, "KoinJavaComponent.get(Ne…p { Flowable.just(true) }");
        return c;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<SimpleRequestResult> mo37733a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "params");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/setting/update/");
        fVar.mo20153c(str);
        fVar.mo20143a(1);
        AbstractC68307f<SimpleRequestResult> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C5205f()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPermission;", "t1", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "t2", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderPublicPermission;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.f.b$e */
    static final class C9916e<T1, T2, R> implements BiFunction<ShareFolderUserPermission, ShareFolderPublicPermission, ShareFolderPermission> {

        /* renamed from: a */
        public static final C9916e f26818a = new C9916e();

        C9916e() {
        }

        /* renamed from: a */
        public final ShareFolderPermission apply(ShareFolderUserPermission shareFolderUserPermission, ShareFolderPublicPermission shareFolderPublicPermission) {
            Intrinsics.checkParameterIsNotNull(shareFolderUserPermission, "t1");
            Intrinsics.checkParameterIsNotNull(shareFolderPublicPermission, "t2");
            return new ShareFolderPermission(shareFolderUserPermission, shareFolderPublicPermission);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41235a(String str, int i) {
        C13479a.m54764b("FolderPermissionManager", "updateLinkShareEntity");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "link_share_entity", (Object) Integer.valueOf(i));
        FolderPermissionManager bVar = f26813a;
        String jSONString = jSONObject.toJSONString();
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "params.toJSONString()");
        return bVar.m41238d(jSONString);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<ShareFolderUserPermission> mo37736a(String str, FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        JSONArray jSONArray = new JSONArray();
        if (str == null) {
            str = "";
        }
        return m41234a(jSONArray, str, folderVersion, z);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: b */
    public AbstractC68307f<ShareFolderPermission> mo37742b(String str, FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(folderVersion, "folderVersion");
        AbstractC68307f<ShareFolderPermission> a = AbstractC68307f.m265092a(mo37736a(str, folderVersion, z), mo37735a(str, folderVersion), C9916e.f26818a);
        Intrinsics.checkExpressionValueIsNotNull(a, "Flowable.zip(userPermFlo…1, t2)\n                })");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41236a(String str, String str2, int i) {
        C13479a.m54764b("FolderPermissionManager", "checkMembersDeleteLock");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put((Object) "collaborator_id", (Object) str2);
        jSONObject2.put((Object) "collaborator_type", (Object) Integer.valueOf(i));
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/check_lock/collaborators/delete/");
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<Boolean> c = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CheckLockParser()).mo20141a(fVar).mo238014c(C9912a.f26814a);
        Intrinsics.checkExpressionValueIsNotNull(c, "KoinJavaComponent.get(Ne…ble.just(it.isNeedLock) }");
        return c;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.sharefolder.IFolderPermission
    /* renamed from: a */
    public AbstractC68307f<NetService.Result<String>> mo37734a(String str, int i, String str2) {
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/apply_permission/");
        fVar.mo20143a(1);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "perm_role", (Object) Integer.valueOf(i));
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put((Object) "message", (Object) str2);
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<NetService.Result<String>> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new C9574g()).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…lyParser()).pull(request)");
        return a;
    }

    /* renamed from: a */
    private final AbstractC68307f<ShareFolderUserPermission> m41234a(JSONArray jSONArray, String str, FolderVersion folderVersion, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        jSONObject2.put((Object) "actions", (Object) jSONArray);
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/collaborator/perm/");
        fVar.mo20153c(jSONObject.toJSONString());
        fVar.mo20143a(1);
        AbstractC68307f<ShareFolderUserPermission> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new FolderUserPermissionParser(folderVersion, z)).mo20141a(fVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…           .pull(request)");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC68307f<Boolean> m41237a(String str, String str2, int i, int i2) {
        C13479a.m54764b("FolderPermissionManager", "checkUpdateMembersLock");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((Object) "token", (Object) str);
        if (str2 == null) {
            str2 = "";
        }
        jSONObject2.put((Object) "collaborator_id", (Object) str2);
        jSONObject2.put((Object) "collaborator_type", (Object) Integer.valueOf(i));
        jSONObject2.put((Object) "perm_role", (Object) Integer.valueOf(i2));
        NetService.C5077f fVar = new NetService.C5077f("/space/api/suite/permission/space/check_lock/collaborators/update/");
        fVar.mo20153c(jSONObject.toJSONString());
        AbstractC68307f<Boolean> c = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new CheckLockParser()).mo20141a(fVar).mo238014c(C9913b.f26815a);
        Intrinsics.checkExpressionValueIsNotNull(c, "KoinJavaComponent.get(Ne…ble.just(it.isNeedLock) }");
        return c;
    }
}
