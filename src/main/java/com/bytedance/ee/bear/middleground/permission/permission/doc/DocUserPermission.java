package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.share.export.OwnerInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00015B/\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\b\u0010\u001d\u001a\u00020\rH\u0016J\b\u0010\u001e\u001a\u00020\rH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\rH\u0016J\b\u0010\"\u001a\u00020\rH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\rH\u0002J\b\u0010%\u001a\u00020\rH\u0016J\t\u0010&\u001a\u00020\u0005HÂ\u0003J\t\u0010'\u001a\u00020\u0005HÂ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÂ\u0003J\t\u0010)\u001a\u00020\nHÂ\u0003J3\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\n\u0010.\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u00020\nH\u0016J\t\u00102\u001a\u00020\u0005HÖ\u0001J\b\u00103\u001a\u00020\rH\u0002J\t\u00104\u001a\u00020\nHÖ\u0001R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermission;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "permissionsV2", "", "permissionStatusCode", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/OwnerInfo;", "json", "", "(IILcom/bytedance/ee/bear/share/export/OwnerInfo;Ljava/lang/String;)V", "canComment", "", "canCopy", "canCreateSubNode", "canDownload", "canEdit", "canExport", "canInviteEdit", "canInviteFullAccess", "canInviteSinglePageEdit", "canInviteSinglePageFullAccess", "canInviteSinglePageView", "canInviteView", "canManageCollaborator", "canManageContainerCollaborator", "canManageContainerPermissionMeta", "canManagePermissionMeta", "canManageSinglePageCollaborator", "canManageSinglePagePermissionMeta", "canMoveSubNode", "canMoveThisNode", "canMoveToHere", "canOperateEntity", "canRead", "canShare", "canUpload", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "getOwnerInfo", "getPermissionStatusCode", "getPermissions", "getReportJson", "hashCode", "isFullAccess", "toString", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocUserPermission extends NetService.Result<Serializable> implements IDocUserPermission {
    public static final Companion Companion = new Companion(null);
    private final String json;
    private OwnerInfo ownerInfo;
    private final int permissionStatusCode;
    private int permissionsV2;

    public DocUserPermission() {
        this(0, 0, null, null, 15, null);
    }

    @JvmStatic
    public static final boolean canComment(int i) {
        return Companion.mo38036b(i);
    }

    @JvmStatic
    public static final boolean canCopy(int i) {
        return Companion.mo38038d(i);
    }

    @JvmStatic
    public static final boolean canEdit(int i) {
        return Companion.mo38037c(i);
    }

    @JvmStatic
    public static final boolean canExport(int i) {
        return Companion.mo38039e(i);
    }

    @JvmStatic
    public static final boolean canPrint(int i) {
        return Companion.mo38040f(i);
    }

    @JvmStatic
    public static final boolean canRead(int i) {
        return Companion.mo38035a(i);
    }

    private final int component1() {
        return this.permissionsV2;
    }

    private final int component2() {
        return this.permissionStatusCode;
    }

    private final OwnerInfo component3() {
        return this.ownerInfo;
    }

    private final String component4() {
        return this.json;
    }

    public static /* synthetic */ DocUserPermission copy$default(DocUserPermission docUserPermission, int i, int i2, OwnerInfo ownerInfo2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = docUserPermission.permissionsV2;
        }
        if ((i3 & 2) != 0) {
            i2 = docUserPermission.permissionStatusCode;
        }
        if ((i3 & 4) != 0) {
            ownerInfo2 = docUserPermission.ownerInfo;
        }
        if ((i3 & 8) != 0) {
            str = docUserPermission.json;
        }
        return docUserPermission.copy(i, i2, ownerInfo2, str);
    }

    @JvmStatic
    public static final boolean isFullAccess(int i) {
        return Companion.mo38041g(i);
    }

    public final DocUserPermission copy(int i, int i2, OwnerInfo ownerInfo2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "json");
        return new DocUserPermission(i, i2, ownerInfo2, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocUserPermission) {
                DocUserPermission docUserPermission = (DocUserPermission) obj;
                if (this.permissionsV2 == docUserPermission.permissionsV2) {
                    if (!(this.permissionStatusCode == docUserPermission.permissionStatusCode) || !Intrinsics.areEqual(this.ownerInfo, docUserPermission.ownerInfo) || !Intrinsics.areEqual(this.json, docUserPermission.json)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.permissionsV2 * 31) + this.permissionStatusCode) * 31;
        OwnerInfo ownerInfo2 = this.ownerInfo;
        int i2 = 0;
        int hashCode = (i + (ownerInfo2 != null ? ownerInfo2.hashCode() : 0)) * 31;
        String str = this.json;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "DocUserPermission(permissionsV2=" + this.permissionsV2 + ", permissionStatusCode=" + this.permissionStatusCode + ", ownerInfo=" + this.ownerInfo + ", json=" + this.json + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermission$Companion;", "", "()V", "USER_PERM_COMMENT", "", "USER_PERM_COPY", "USER_PERM_EDIT", "USER_PERM_EXPORT", "USER_PERM_FULL_ACCESS", "USER_PERM_PRINT", "USER_PERM_READ", "USER_PERM_SHARE", "canComment", "", "userPerm", "canCopy", "canEdit", "canExport", "canPrint", "canRead", "isFullAccess", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission$a */
    public static final class Companion {
        @JvmStatic
        /* renamed from: a */
        public final boolean mo38035a(int i) {
            return (i & 1) != 0;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo38036b(int i) {
            return (i & 2) != 0;
        }

        @JvmStatic
        /* renamed from: c */
        public final boolean mo38037c(int i) {
            return (i & 4) != 0;
        }

        @JvmStatic
        /* renamed from: d */
        public final boolean mo38038d(int i) {
            return (i & 16) != 0;
        }

        @JvmStatic
        /* renamed from: e */
        public final boolean mo38039e(int i) {
            return (i & 32) != 0;
        }

        @JvmStatic
        /* renamed from: f */
        public final boolean mo38040f(int i) {
            return (i & 64) != 0;
        }

        @JvmStatic
        /* renamed from: g */
        public final boolean mo38041g(int i) {
            return (i & 1024) != 0;
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public OwnerInfo getOwnerInfo() {
        return this.ownerInfo;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public int getPermissionStatusCode() {
        return this.permissionStatusCode;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public int getPermissions() {
        return this.permissionsV2;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public String getReportJson() {
        return this.json;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canCreateSubNode() {
        return canEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canDownload() {
        return canExport();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteEdit() {
        return canEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteFullAccess() {
        return isFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteSinglePageEdit() {
        return canEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteSinglePageFullAccess() {
        return isFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteSinglePageView() {
        return canRead();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteView() {
        return canRead();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageCollaborator() {
        return canShare();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageContainerCollaborator() {
        return canShare();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageContainerPermissionMeta() {
        return isFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManagePermissionMeta() {
        return isFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageSinglePageCollaborator() {
        return canShare();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageSinglePagePermissionMeta() {
        return isFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canMoveSubNode() {
        return canEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canMoveThisNode() {
        return isFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canMoveToHere() {
        return canEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canOperateEntity() {
        return isFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canUpload() {
        return canEdit();
    }

    private final boolean canShare() {
        if ((this.permissionsV2 & 8) != 0) {
            return true;
        }
        return false;
    }

    private final boolean isFullAccess() {
        if ((this.permissionsV2 & 1024) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canComment() {
        if ((this.permissionsV2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canCopy() {
        if ((this.permissionsV2 & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canEdit() {
        if ((this.permissionsV2 & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canExport() {
        if ((this.permissionsV2 & 32) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canRead() {
        if ((this.permissionsV2 & 1) != 0) {
            return true;
        }
        return false;
    }

    public DocUserPermission(int i, int i2, OwnerInfo ownerInfo2, String str) {
        Intrinsics.checkParameterIsNotNull(str, "json");
        this.permissionsV2 = i;
        this.permissionStatusCode = i2;
        this.ownerInfo = ownerInfo2;
        this.json = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DocUserPermission(int i, int i2, OwnerInfo ownerInfo2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : ownerInfo2, (i3 & 8) != 0 ? "" : str);
    }
}
