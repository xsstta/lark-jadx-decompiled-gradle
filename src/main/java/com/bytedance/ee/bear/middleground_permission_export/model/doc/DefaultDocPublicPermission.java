package com.bytedance.ee.bear.middleground_permission_export.model.doc;

import com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0004H\u0016J\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020\u0004H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\b\u0010-\u001a\u00020\tH\u0016J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0004H\u0016J\u0010\u00101\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\tH\u0016¨\u00064"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/DefaultDocPublicPermission;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "()V", "adminCanCross", "", "anonymousVerify", "canUnLock", "externalAccess", "getReportJson", "", "hasLinkPassword", "inviteExternal", "isCommentSettingDisableByContainer", "isCommentSettingEnable", "isCommentWithEdit", "isCommentWithRead", "isExternalAccessConstraintByContainer", "isExternalAccessEnable", "isExternalAccessPermTypeSinglePage", "isLinkShareAnyoneEdit", "isLinkShareAnyoneRead", "isLinkShareClose", "isLinkShareInternalEdit", "isLinkShareInternalRead", "isLinkSharePermTypeSinglePage", "isLock", "isManagerCollaboratorAnyone", "isManagerCollaboratorTenant", "isManagerCollaboratorWithEdit", "isManagerCollaboratorWithFA", "isManagerCollaboratorWithRead", "isOwner", "isSecurityConstraintsEdit", "isSecurityConstraintsFa", "isSecuritySettingDisableByContainer", "isSecuritySettingEnable", "isSecurityWithEdit", "isSecurityWithFA", "isSecurityWithRead", "isShareAnyone", "isShareExternalWithEdit", "isShareExternalWithFA", "isShareExternalWithRead", "isShareInternal", "isShareOnlyMe", "linkPassword", "setHasPassword", "", "hasPassword", "setOwner", "setPassword", "password", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public class DefaultDocPublicPermission implements IDocPublicPermission {
    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean adminCanCross() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean anonymousVerify() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean canUnLock() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean externalAccess() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public String getReportJson() {
        return "";
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean hasLinkPassword() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean inviteExternal() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentSettingDisableByContainer() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentSettingEnable() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentWithEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentWithRead() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessConstraintByContainer() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessEnable() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isExternalAccessPermTypeSinglePage() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneRead() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareClose() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareInternalEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareInternalRead() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkSharePermTypeSinglePage() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLock() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorAnyone() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorTenant() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithFA() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isManagerCollaboratorWithRead() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isOwner() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityConstraintsEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityConstraintsFa() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecuritySettingDisableByContainer() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecuritySettingEnable() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithFA() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isSecurityWithRead() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareAnyone() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithEdit() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithFA() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareExternalWithRead() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareInternal() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isShareOnlyMe() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public String linkPassword() {
        return "";
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public void setHasPassword(boolean z) {
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public void setOwner(boolean z) {
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public void setPassword(String str) {
        Intrinsics.checkParameterIsNotNull(str, "password");
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareAnyoneEditBlockValue() {
        return IDocPublicPermission.C10162a.m42291e(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareAnyoneReadBlockValue() {
        return IDocPublicPermission.C10162a.m42289c(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public int getLinkShareConstrains() {
        return IDocPublicPermission.C10162a.m42292f(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isCommentConstraintsEdit() {
        return IDocPublicPermission.C10162a.m42287a(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneEditDisable() {
        return IDocPublicPermission.C10162a.m42290d(this);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission
    public boolean isLinkShareAnyoneReadDisable() {
        return IDocPublicPermission.C10162a.m42288b(this);
    }
}
