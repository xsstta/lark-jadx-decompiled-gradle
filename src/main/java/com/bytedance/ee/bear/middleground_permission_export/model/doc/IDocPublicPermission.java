package com.bytedance.ee.bear.middleground_permission_export.model.doc;

import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0003H&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\b\u0010%\u001a\u00020\u0003H&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020\u0003H&J\b\u0010)\u001a\u00020\u0003H&J\b\u0010*\u001a\u00020\u0003H&J\b\u0010+\u001a\u00020\u0003H&J\b\u0010,\u001a\u00020\u0003H&J\b\u0010-\u001a\u00020\u0003H&J\b\u0010.\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H&J\b\u00102\u001a\u00020\u0003H&J\b\u00103\u001a\u00020\fH&J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0003H&J\u0010\u00107\u001a\u0002052\u0006\u0010%\u001a\u00020\u0003H&J\u0010\u00108\u001a\u0002052\u0006\u00109\u001a\u00020\fH&¨\u0006:"}, d2 = {"Lcom/bytedance/ee/bear/middleground_permission_export/model/doc/IDocPublicPermission;", "Lcom/bytedance/ee/util/io/NonProguard;", "adminCanCross", "", "anonymousVerify", "canUnLock", "externalAccess", "getLinkShareAnyoneEditBlockValue", "", "getLinkShareAnyoneReadBlockValue", "getLinkShareConstrains", "getReportJson", "", "hasLinkPassword", "inviteExternal", "isCommentConstraintsEdit", "isCommentSettingDisableByContainer", "isCommentSettingEnable", "isCommentWithEdit", "isCommentWithRead", "isExternalAccessConstraintByContainer", "isExternalAccessEnable", "isExternalAccessPermTypeSinglePage", "isLinkShareAnyoneEdit", "isLinkShareAnyoneEditDisable", "isLinkShareAnyoneRead", "isLinkShareAnyoneReadDisable", "isLinkShareClose", "isLinkShareInternalEdit", "isLinkShareInternalRead", "isLinkSharePermTypeSinglePage", "isLock", "isManagerCollaboratorAnyone", "isManagerCollaboratorTenant", "isManagerCollaboratorWithEdit", "isManagerCollaboratorWithFA", "isManagerCollaboratorWithRead", "isOwner", "isSecurityConstraintsEdit", "isSecurityConstraintsFa", "isSecuritySettingDisableByContainer", "isSecuritySettingEnable", "isSecurityWithEdit", "isSecurityWithFA", "isSecurityWithRead", "isShareAnyone", "isShareExternalWithEdit", "isShareExternalWithFA", "isShareExternalWithRead", "isShareInternal", "isShareOnlyMe", "linkPassword", "setHasPassword", "", "hasPassword", "setOwner", "setPassword", "password", "middleground-permission-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public interface IDocPublicPermission extends NonProguard {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground_permission_export.model.doc.IDocPublicPermission$a */
    public static final class C10162a {
        /* renamed from: a */
        public static boolean m42287a(IDocPublicPermission iDocPublicPermission) {
            return false;
        }

        /* renamed from: b */
        public static boolean m42288b(IDocPublicPermission iDocPublicPermission) {
            return false;
        }

        /* renamed from: c */
        public static int m42289c(IDocPublicPermission iDocPublicPermission) {
            return 0;
        }

        /* renamed from: d */
        public static boolean m42290d(IDocPublicPermission iDocPublicPermission) {
            return false;
        }

        /* renamed from: e */
        public static int m42291e(IDocPublicPermission iDocPublicPermission) {
            return 0;
        }

        /* renamed from: f */
        public static int m42292f(IDocPublicPermission iDocPublicPermission) {
            return 0;
        }
    }

    boolean adminCanCross();

    boolean anonymousVerify();

    boolean canUnLock();

    boolean externalAccess();

    int getLinkShareAnyoneEditBlockValue();

    int getLinkShareAnyoneReadBlockValue();

    int getLinkShareConstrains();

    String getReportJson();

    boolean hasLinkPassword();

    boolean inviteExternal();

    boolean isCommentConstraintsEdit();

    boolean isCommentSettingDisableByContainer();

    boolean isCommentSettingEnable();

    boolean isCommentWithEdit();

    boolean isCommentWithRead();

    boolean isExternalAccessConstraintByContainer();

    boolean isExternalAccessEnable();

    boolean isExternalAccessPermTypeSinglePage();

    boolean isLinkShareAnyoneEdit();

    boolean isLinkShareAnyoneEditDisable();

    boolean isLinkShareAnyoneRead();

    boolean isLinkShareAnyoneReadDisable();

    boolean isLinkShareClose();

    boolean isLinkShareInternalEdit();

    boolean isLinkShareInternalRead();

    boolean isLinkSharePermTypeSinglePage();

    boolean isLock();

    boolean isManagerCollaboratorAnyone();

    boolean isManagerCollaboratorTenant();

    boolean isManagerCollaboratorWithEdit();

    boolean isManagerCollaboratorWithFA();

    boolean isManagerCollaboratorWithRead();

    boolean isOwner();

    boolean isSecurityConstraintsEdit();

    boolean isSecurityConstraintsFa();

    boolean isSecuritySettingDisableByContainer();

    boolean isSecuritySettingEnable();

    boolean isSecurityWithEdit();

    boolean isSecurityWithFA();

    boolean isSecurityWithRead();

    boolean isShareAnyone();

    boolean isShareExternalWithEdit();

    boolean isShareExternalWithFA();

    boolean isShareExternalWithRead();

    boolean isShareInternal();

    boolean isShareOnlyMe();

    String linkPassword();

    void setHasPassword(boolean z);

    void setOwner(boolean z);

    void setPassword(String str);
}
