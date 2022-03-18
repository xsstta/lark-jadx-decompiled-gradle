package com.bytedance.ee.bear.middleground.permission.collaborator;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.BitableShareInviteMemberFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.DocInviteMemberFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.FolderInviteMemberFragment;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J@\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00122\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J2\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/InviteMembersUtils;", "", "()V", "TAG", "", "showBitableShareInviteMember", "", "context", "Landroidx/fragment/app/FragmentActivity;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "originUserInfos", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "isFromSharePanel", "", "showDocInviteMember", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "module", "showFolderInviteMember", "activity", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "userInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.b */
public final class InviteMembersUtils {

    /* renamed from: a */
    public static final InviteMembersUtils f25866a = new InviteMembersUtils();

    private InviteMembersUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39846a(FragmentActivity fragmentActivity, BitableSharePermSetInfo bitableSharePermSetInfo, ArrayList<UserInfo> arrayList, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(arrayList, "originUserInfos");
        BitableShareInviteMemberFragment.f26642d.mo37521a(fragmentActivity, bitableSharePermSetInfo, arrayList, z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39847a(FragmentActivity fragmentActivity, DocPermSetInfo docPermSetInfo, ArrayList<UserInfo> arrayList, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(arrayList, "originUserInfos");
        Intrinsics.checkParameterIsNotNull(str, "module");
        DocInviteMemberFragment.f26650d.mo37522a(fragmentActivity, docPermSetInfo, arrayList, str, z);
        PermissionAnalytic.m39401a(docPermSetInfo, "click_add_collaborate", (Map<String, String>) null);
        PermissionAnalyticV2.m39638b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m39848a(FragmentActivity fragmentActivity, FolderPermSetInfo folderPermSetInfo, ShareUserInfoResult shareUserInfoResult, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
        Intrinsics.checkParameterIsNotNull(str, "module");
        FolderInviteMemberFragment.f26726d.mo37634a(fragmentActivity, folderPermSetInfo, shareUserInfoResult, str, z);
        PermissionAnalytic.m39403a(folderPermSetInfo, "click_add_collaborate", (Map<String, String>) null);
        PermissionAnalyticV2.m39638b();
    }
}
