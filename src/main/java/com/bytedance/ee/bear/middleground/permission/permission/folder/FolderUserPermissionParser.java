package com.bytedance.ee.bear.middleground.permission.permission.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/folder/FolderUserPermissionParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isRoot", "", "(Lcom/bytedance/ee/bear/list/dto/FolderVersion;Z)V", "()Z", "getVersion", "()Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "parse", "json", "", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.permission.a.c */
public final class FolderUserPermissionParser implements NetService.AbstractC5074c<ShareFolderUserPermission> {

    /* renamed from: a */
    public static final Companion f26837a = new Companion(null);

    /* renamed from: b */
    private final FolderVersion f26838b;

    /* renamed from: c */
    private final boolean f26839c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/folder/FolderUserPermissionParser$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public ShareFolderUserPermission parse(String str) {
        boolean z;
        int i;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ShareFolderUserPermission(0, null, null, false, null, 31, null);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            if (this.f26838b.isShareFolderV1()) {
                int optInt = optJSONObject.optInt("perm", 1);
                FolderVersion folderVersion = this.f26838b;
                boolean z2 = this.f26839c;
                String jSONObject = optJSONObject.toString();
                Intrinsics.checkExpressionValueIsNotNull(jSONObject, "dataObj.toString()");
                return new ShareFolderUserPermission(optInt, null, folderVersion, z2, jSONObject, 2, null);
            }
            optJSONObject.optBoolean("is_owner");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("actions");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            PermissionAction permissionAction = new PermissionAction(optJSONObject2.optInt("view"), optJSONObject2.optInt("edit"), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32764, null);
            permissionAction.setManage_collaborator(optJSONObject2.optInt("manage_collaborator"));
            permissionAction.setManage_meta(optJSONObject2.optInt("manage_meta"));
            permissionAction.setCreate_sub_node(optJSONObject2.optInt("create_sub_node"));
            permissionAction.setDownload(optJSONObject2.optInt("download"));
            permissionAction.setCollect(optJSONObject2.optInt("collect"));
            permissionAction.setOperate_from_dusbin(optJSONObject2.optInt("operate_from_dusbin"));
            permissionAction.setOperate_entity(optJSONObject2.optInt("operate_entity"));
            permissionAction.setInvite_full_access(optJSONObject2.optInt("invite_full_access"));
            permissionAction.setInvite_can_edit(optJSONObject2.optInt("invite_can_edit"));
            permissionAction.setInvite_can_view(optJSONObject2.optInt("invite_can_view"));
            permissionAction.setBe_moved(optJSONObject2.optInt("be_moved"));
            permissionAction.setMove_from(optJSONObject2.optInt("move_from"));
            permissionAction.setMove_to(optJSONObject2.optInt("move_to"));
            if (permissionAction.getManage_meta() == 1) {
                i = 3;
            } else if (permissionAction.getEdit() == 1) {
                i = 2;
            } else {
                i = 1;
            }
            FolderVersion folderVersion2 = this.f26838b;
            boolean z3 = this.f26839c;
            String jSONObject2 = optJSONObject.toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject2, "dataObj.toString()");
            return new ShareFolderUserPermission(i, permissionAction, folderVersion2, z3, jSONObject2);
        } catch (Throwable th) {
            C13479a.m54759a("FolderUserPermissionParser", "parse()...json = " + str, th);
            return new ShareFolderUserPermission(0, null, null, false, null, 31, null);
        }
    }

    public FolderUserPermissionParser(FolderVersion folderVersion, boolean z) {
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f26838b = folderVersion;
        this.f26839c = z;
    }
}
