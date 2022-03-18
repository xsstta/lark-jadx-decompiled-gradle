package com.bytedance.ee.bear.middleground_permission_export.model.folder;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0005\b\b\u0018\u0000 72\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00017B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\nJ\u0006\u0010!\u001a\u00020\nJ\u0006\u0010\"\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nJ\u0006\u0010'\u001a\u00020\nJ\u0006\u0010(\u001a\u00020\nJ\u0006\u0010)\u001a\u00020\nJ\u0006\u0010*\u001a\u00020\nJ\t\u0010+\u001a\u00020\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J;\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u00101\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\u0006\u00104\u001a\u00020\fJ\t\u00105\u001a\u00020\u0004HÖ\u0001J\t\u00106\u001a\u00020\fHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00068"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "permissions", "", "actions", "Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/PermissionAction;", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isRoot", "", "json", "", "(ILcom/bytedance/ee/bear/middleground_permission_export/model/folder/PermissionAction;Lcom/bytedance/ee/bear/list/dto/FolderVersion;ZLjava/lang/String;)V", "getActions", "()Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/PermissionAction;", "setActions", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/PermissionAction;)V", "()Z", "setRoot", "(Z)V", "getJson", "()Ljava/lang/String;", "getPermissions", "()I", "setPermissions", "(I)V", "getVersion", "()Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "setVersion", "(Lcom/bytedance/ee/bear/list/dto/FolderVersion;)V", "canBeMoved", "canCreateSubNode", "canEdit", "canInviteEdit", "canInviteFullAccess", "canInviteView", "canManagePermissionMeta", "isOwner", "canManagerCollaborator", "canMoveSubNode", "canMoveToHere", "canView", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getReportJson", "hashCode", "toString", "Companion", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareFolderUserPermission extends NetService.Result<Serializable> {
    public static final Companion Companion = new Companion(null);
    private PermissionAction actions;
    private boolean isRoot;
    private final String json;
    private int permissions;
    private FolderVersion version;

    public ShareFolderUserPermission() {
        this(0, null, null, false, null, 31, null);
    }

    public static /* synthetic */ ShareFolderUserPermission copy$default(ShareFolderUserPermission shareFolderUserPermission, int i, PermissionAction permissionAction, FolderVersion folderVersion, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shareFolderUserPermission.permissions;
        }
        if ((i2 & 2) != 0) {
            permissionAction = shareFolderUserPermission.actions;
        }
        if ((i2 & 4) != 0) {
            folderVersion = shareFolderUserPermission.version;
        }
        if ((i2 & 8) != 0) {
            z = shareFolderUserPermission.isRoot;
        }
        if ((i2 & 16) != 0) {
            str = shareFolderUserPermission.json;
        }
        return shareFolderUserPermission.copy(i, permissionAction, folderVersion, z, str);
    }

    public final int component1() {
        return this.permissions;
    }

    public final PermissionAction component2() {
        return this.actions;
    }

    public final FolderVersion component3() {
        return this.version;
    }

    public final boolean component4() {
        return this.isRoot;
    }

    public final String component5() {
        return this.json;
    }

    public final ShareFolderUserPermission copy(int i, PermissionAction permissionAction, FolderVersion folderVersion, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(permissionAction, "actions");
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str, "json");
        return new ShareFolderUserPermission(i, permissionAction, folderVersion, z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShareFolderUserPermission) {
                ShareFolderUserPermission shareFolderUserPermission = (ShareFolderUserPermission) obj;
                if ((this.permissions == shareFolderUserPermission.permissions) && Intrinsics.areEqual(this.actions, shareFolderUserPermission.actions) && Intrinsics.areEqual(this.version, shareFolderUserPermission.version)) {
                    if (!(this.isRoot == shareFolderUserPermission.isRoot) || !Intrinsics.areEqual(this.json, shareFolderUserPermission.json)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.permissions * 31;
        PermissionAction permissionAction = this.actions;
        int i2 = 0;
        int hashCode = (i + (permissionAction != null ? permissionAction.hashCode() : 0)) * 31;
        FolderVersion folderVersion = this.version;
        int hashCode2 = (hashCode + (folderVersion != null ? folderVersion.hashCode() : 0)) * 31;
        boolean z = this.isRoot;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str = this.json;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i6 + i2;
    }

    public String toString() {
        return "ShareFolderUserPermission(permissions=" + this.permissions + ", actions=" + this.actions + ", version=" + this.version + ", isRoot=" + this.isRoot + ", json=" + this.json + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/folder/ShareFolderUserPermission$Companion;", "", "()V", "PERM_ROLE_EDIT", "", "PERM_ROLE_FULL_ACCESS", "PERM_ROLE_VIEW", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final PermissionAction getActions() {
        return this.actions;
    }

    public final String getJson() {
        return this.json;
    }

    public final int getPermissions() {
        return this.permissions;
    }

    public final String getReportJson() {
        return this.json;
    }

    public final FolderVersion getVersion() {
        return this.version;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final boolean canBeMoved() {
        if (!this.version.isFolderV1()) {
            return this.actions.canMoveThisNode();
        }
        if (this.permissions == 2) {
            return true;
        }
        return false;
    }

    public final boolean canCreateSubNode() {
        if (!this.version.isFolderV1()) {
            return this.actions.canCreate();
        }
        if (this.permissions == 2) {
            return true;
        }
        return false;
    }

    public final boolean canEdit() {
        if (!this.version.isFolderV1()) {
            return this.actions.canEdit();
        }
        if (this.permissions == 2) {
            return true;
        }
        return false;
    }

    public final boolean canInviteEdit() {
        if (!this.version.isFolderV1()) {
            return this.actions.canInviteEdit();
        }
        if (this.permissions == 2) {
            return true;
        }
        return false;
    }

    public final boolean canInviteFullAccess() {
        if (this.version.isFolderV1()) {
            return false;
        }
        return this.actions.canInviteFullAccess();
    }

    public final boolean canInviteView() {
        if (!this.version.isFolderV1()) {
            return this.actions.canInviteView();
        }
        int i = this.permissions;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final boolean canManagerCollaborator() {
        if (this.version.isFolderV1()) {
            return this.isRoot;
        }
        return this.actions.canManageCollaborator();
    }

    public final boolean canMoveSubNode() {
        if (!this.version.isFolderV1()) {
            return this.actions.canMoveSubNode();
        }
        if (this.permissions == 2) {
            return true;
        }
        return false;
    }

    public final boolean canMoveToHere() {
        if (!this.version.isFolderV1()) {
            return this.actions.canMoveToHere();
        }
        if (this.permissions == 2) {
            return true;
        }
        return false;
    }

    public final boolean canView() {
        if (!this.version.isFolderV1()) {
            return this.actions.canView();
        }
        int i = this.permissions;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final void setPermissions(int i) {
        this.permissions = i;
    }

    public final void setRoot(boolean z) {
        this.isRoot = z;
    }

    public final void setActions(PermissionAction permissionAction) {
        Intrinsics.checkParameterIsNotNull(permissionAction, "<set-?>");
        this.actions = permissionAction;
    }

    public final void setVersion(FolderVersion folderVersion) {
        Intrinsics.checkParameterIsNotNull(folderVersion, "<set-?>");
        this.version = folderVersion;
    }

    public final boolean canManagePermissionMeta(boolean z) {
        if (this.version.isFolderV1()) {
            return z;
        }
        return this.actions.canManagePermissionMeta();
    }

    public ShareFolderUserPermission(int i, PermissionAction permissionAction, FolderVersion folderVersion, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(permissionAction, "actions");
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str, "json");
        this.permissions = i;
        this.actions = permissionAction;
        this.version = folderVersion;
        this.isRoot = z;
        this.json = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ShareFolderUserPermission(int r21, com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction r22, com.bytedance.ee.bear.list.dto.FolderVersion r23, boolean r24, java.lang.String r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r20 = this;
            r0 = r26 & 1
            if (r0 == 0) goto L_0x0006
            r0 = 1
            goto L_0x0008
        L_0x0006:
            r0 = r21
        L_0x0008:
            r1 = r26 & 2
            if (r1 == 0) goto L_0x0028
            com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction r1 = new com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction
            r2 = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 32767(0x7fff, float:4.5916E-41)
            r19 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x002a
        L_0x0028:
            r1 = r22
        L_0x002a:
            r2 = r26 & 4
            if (r2 == 0) goto L_0x003a
            com.bytedance.ee.bear.list.dto.FolderVersion r2 = new com.bytedance.ee.bear.list.dto.FolderVersion
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 7
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L_0x003c
        L_0x003a:
            r2 = r23
        L_0x003c:
            r3 = r26 & 8
            if (r3 == 0) goto L_0x0042
            r3 = 0
            goto L_0x0044
        L_0x0042:
            r3 = r24
        L_0x0044:
            r4 = r26 & 16
            if (r4 == 0) goto L_0x004b
            java.lang.String r4 = ""
            goto L_0x004d
        L_0x004b:
            r4 = r25
        L_0x004d:
            r21 = r20
            r22 = r0
            r23 = r1
            r24 = r2
            r25 = r3
            r26 = r4
            r21.<init>(r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission.<init>(int, com.bytedance.ee.bear.middleground_permission_export.model.folder.PermissionAction, com.bytedance.ee.bear.list.dto.FolderVersion, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
