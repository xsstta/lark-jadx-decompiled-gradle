package com.bytedance.ee.bear.middleground.permission.permission.doc;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission;
import com.bytedance.ee.bear.share.export.OwnerInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\b\u0010$\u001a\u00020\u0005H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\t\u0010'\u001a\u00020\u0005HÂ\u0003J\t\u0010(\u001a\u00020\u0007HÂ\u0003J\t\u0010)\u001a\u00020\tHÂ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u0010+\u001a\u00020\rHÂ\u0003J=\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\n\u00100\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u00101\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\rH\u0016J\t\u00104\u001a\u00020\u0007HÖ\u0001J\t\u00105\u001a\u00020\rHÖ\u0001R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocUserPermissionV2;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "isOwner", "", "permissionStatusCode", "", "actions", "Lcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionAction;", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/OwnerInfo;", "json", "", "(ZILcom/bytedance/ee/bear/middleground/permission/permission/doc/DocPermissionAction;Lcom/bytedance/ee/bear/share/export/OwnerInfo;Ljava/lang/String;)V", "canComment", "canCopy", "canCreateSubNode", "canDownload", "canEdit", "canExport", "canInviteEdit", "canInviteFullAccess", "canInviteSinglePageEdit", "canInviteSinglePageFullAccess", "canInviteSinglePageView", "canInviteView", "canManageCollaborator", "canManageContainerCollaborator", "canManageContainerPermissionMeta", "canManagePermissionMeta", "canManageSinglePageCollaborator", "canManageSinglePagePermissionMeta", "canMoveSubNode", "canMoveThisNode", "canMoveToHere", "canOperateEntity", "canRead", "canUpload", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getOwnerInfo", "getPermissionStatusCode", "getPermissions", "getReportJson", "hashCode", "toString", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocUserPermissionV2 extends NetService.Result<Serializable> implements IDocUserPermission {
    private final DocPermissionAction actions;
    private final boolean isOwner;
    private final String json;
    private OwnerInfo ownerInfo;
    private final int permissionStatusCode;

    public DocUserPermissionV2() {
        this(false, 0, null, null, null, 31, null);
    }

    private final boolean component1() {
        return this.isOwner;
    }

    private final int component2() {
        return this.permissionStatusCode;
    }

    private final DocPermissionAction component3() {
        return this.actions;
    }

    private final OwnerInfo component4() {
        return this.ownerInfo;
    }

    private final String component5() {
        return this.json;
    }

    public static /* synthetic */ DocUserPermissionV2 copy$default(DocUserPermissionV2 docUserPermissionV2, boolean z, int i, DocPermissionAction docPermissionAction, OwnerInfo ownerInfo2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = docUserPermissionV2.isOwner;
        }
        if ((i2 & 2) != 0) {
            i = docUserPermissionV2.permissionStatusCode;
        }
        if ((i2 & 4) != 0) {
            docPermissionAction = docUserPermissionV2.actions;
        }
        if ((i2 & 8) != 0) {
            ownerInfo2 = docUserPermissionV2.ownerInfo;
        }
        if ((i2 & 16) != 0) {
            str = docUserPermissionV2.json;
        }
        return docUserPermissionV2.copy(z, i, docPermissionAction, ownerInfo2, str);
    }

    public final DocUserPermissionV2 copy(boolean z, int i, DocPermissionAction docPermissionAction, OwnerInfo ownerInfo2, String str) {
        Intrinsics.checkParameterIsNotNull(docPermissionAction, "actions");
        Intrinsics.checkParameterIsNotNull(str, "json");
        return new DocUserPermissionV2(z, i, docPermissionAction, ownerInfo2, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DocUserPermissionV2) {
                DocUserPermissionV2 docUserPermissionV2 = (DocUserPermissionV2) obj;
                if (this.isOwner == docUserPermissionV2.isOwner) {
                    if (!(this.permissionStatusCode == docUserPermissionV2.permissionStatusCode) || !Intrinsics.areEqual(this.actions, docUserPermissionV2.actions) || !Intrinsics.areEqual(this.ownerInfo, docUserPermissionV2.ownerInfo) || !Intrinsics.areEqual(this.json, docUserPermissionV2.json)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public int getPermissions() {
        return 0;
    }

    public int hashCode() {
        boolean z = this.isOwner;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = ((i * 31) + this.permissionStatusCode) * 31;
        DocPermissionAction docPermissionAction = this.actions;
        int i5 = 0;
        int hashCode = (i4 + (docPermissionAction != null ? docPermissionAction.hashCode() : 0)) * 31;
        OwnerInfo ownerInfo2 = this.ownerInfo;
        int hashCode2 = (hashCode + (ownerInfo2 != null ? ownerInfo2.hashCode() : 0)) * 31;
        String str = this.json;
        if (str != null) {
            i5 = str.hashCode();
        }
        return hashCode2 + i5;
    }

    public String toString() {
        return "DocUserPermissionV2(isOwner=" + this.isOwner + ", permissionStatusCode=" + this.permissionStatusCode + ", actions=" + this.actions + ", ownerInfo=" + this.ownerInfo + ", json=" + this.json + ")";
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
    public String getReportJson() {
        return this.json;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canComment() {
        return this.actions.canComment();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canCopy() {
        return this.actions.canCopy();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canCreateSubNode() {
        return this.actions.canCreate();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canDownload() {
        return this.actions.canDownload();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canEdit() {
        return this.actions.canEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canExport() {
        return this.actions.canExport();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteEdit() {
        return this.actions.canInviteEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteFullAccess() {
        return this.actions.canInviteFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteSinglePageEdit() {
        return this.actions.canInviteSinglePageEdit();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteSinglePageFullAccess() {
        return this.actions.canInviteSinglePageFullAccess();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteSinglePageView() {
        return this.actions.canInviteSinglePageView();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canInviteView() {
        return this.actions.canInviteView();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageContainerCollaborator() {
        return this.actions.canManageContainerCollaborator();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageContainerPermissionMeta() {
        return this.actions.canManageContainerPermissionMeta();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageSinglePageCollaborator() {
        return this.actions.canManageSinglePageCollaborator();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageSinglePagePermissionMeta() {
        return this.actions.canManageSinglePagePermissionMeta();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canMoveSubNode() {
        return this.actions.canMoveSubNode();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canMoveThisNode() {
        return this.actions.canMoveThisNode();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canMoveToHere() {
        return this.actions.canMoveToHere();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canOperateEntity() {
        return this.actions.canOperateEntity();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canRead() {
        return this.actions.canView();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canUpload() {
        return this.actions.canUpload();
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManageCollaborator() {
        if (canManageContainerCollaborator() || canManageSinglePageCollaborator()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission
    public boolean canManagePermissionMeta() {
        if (canManageContainerPermissionMeta() || canManageSinglePagePermissionMeta()) {
            return true;
        }
        return false;
    }

    public DocUserPermissionV2(boolean z, int i, DocPermissionAction docPermissionAction, OwnerInfo ownerInfo2, String str) {
        Intrinsics.checkParameterIsNotNull(docPermissionAction, "actions");
        Intrinsics.checkParameterIsNotNull(str, "json");
        this.isOwner = z;
        this.permissionStatusCode = i;
        this.actions = docPermissionAction;
        this.ownerInfo = ownerInfo2;
        this.json = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DocUserPermissionV2(boolean r32, int r33, com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionAction r34, com.bytedance.ee.bear.share.export.OwnerInfo r35, java.lang.String r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermissionV2.<init>(boolean, int, com.bytedance.ee.bear.middleground.permission.permission.doc.DocPermissionAction, com.bytedance.ee.bear.share.export.OwnerInfo, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
