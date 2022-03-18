package com.bytedance.ee.bear.middleground_permission_export.model.doc;

import com.bytedance.ee.bear.share.export.OwnerInfo;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH&J\b\u0010\u001f\u001a\u00020\u001eH&J\b\u0010 \u001a\u00020!H\u0016¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocUserPermission;", "Lcom/bytedance/ee/util/io/NonProguard;", "canComment", "", "canCopy", "canCreateSubNode", "canDownload", "canEdit", "canExport", "canInviteEdit", "canInviteFullAccess", "canInviteSinglePageEdit", "canInviteSinglePageFullAccess", "canInviteSinglePageView", "canInviteView", "canManageCollaborator", "canManageContainerCollaborator", "canManageContainerPermissionMeta", "canManagePermissionMeta", "canManageSinglePageCollaborator", "canManageSinglePagePermissionMeta", "canMoveSubNode", "canMoveThisNode", "canMoveToHere", "canOperateEntity", "canRead", "canUpload", "getOwnerInfo", "Lcom/bytedance/ee/bear/share/export/OwnerInfo;", "getPermissionStatusCode", "", "getPermissions", "getReportJson", "", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IDocUserPermission extends NonProguard {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocUserPermission$a */
    public static final class C10163a {
        /* renamed from: a */
        public static String m42293a(IDocUserPermission iDocUserPermission) {
            return "";
        }
    }

    boolean canComment();

    boolean canCopy();

    boolean canCreateSubNode();

    boolean canDownload();

    boolean canEdit();

    boolean canExport();

    boolean canInviteEdit();

    boolean canInviteFullAccess();

    boolean canInviteSinglePageEdit();

    boolean canInviteSinglePageFullAccess();

    boolean canInviteSinglePageView();

    boolean canInviteView();

    boolean canManageCollaborator();

    boolean canManageContainerCollaborator();

    boolean canManageContainerPermissionMeta();

    boolean canManagePermissionMeta();

    boolean canManageSinglePageCollaborator();

    boolean canManageSinglePagePermissionMeta();

    boolean canMoveSubNode();

    boolean canMoveThisNode();

    boolean canMoveToHere();

    boolean canOperateEntity();

    boolean canRead();

    boolean canUpload();

    OwnerInfo getOwnerInfo();

    int getPermissionStatusCode();

    int getPermissions();

    String getReportJson();
}
