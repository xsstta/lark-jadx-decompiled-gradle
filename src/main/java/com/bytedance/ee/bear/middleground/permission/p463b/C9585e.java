package com.bytedance.ee.bear.middleground.permission.p463b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.apply.ApplyPermissionPanel;
import com.bytedance.ee.bear.middleground.permission.apply.NoPermission;
import com.bytedance.ee.bear.middleground.permission.apply.PermForbidFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.AvatarLoadHelper;
import com.bytedance.ee.bear.middleground.permission.collaborator.InviteMembersUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.BitableProInviteMemberFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.bitableshare.ShareBitableShareMemberView;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.doc.ShareDocMemberView;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.folder.ShareFolderMemberView;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.C10071n;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10061h;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10062i;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset.BitableShareLinkShareSetView;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset.DocLinkShareSetView;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.sharelinkset.FolderLinkShareSetView;
import com.bytedance.ee.bear.middleground.permission.setting.sharepermset.SharePermSetView;
import com.bytedance.ee.bear.middleground.permission.util.NotNotifyOperator;
import com.bytedance.ee.bear.middleground_permission_export.model.AbstractC10154a;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.component.universe_design.image.UDAvatar;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.middleground.permission.b.e */
class C9585e implements AbstractC10159e {

    /* renamed from: com.bytedance.ee.bear.middleground.permission.b.e$a */
    private static class C9587a {

        /* renamed from: a */
        public static final C9585e f25730a = new C9585e();
    }

    private C9585e() {
    }

    /* renamed from: a */
    public static AbstractC10159e m39562a() {
        return C9587a.f25730a;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36675a(FragmentManager fragmentManager, int i, String str, C8275a aVar, String str2, boolean z, boolean z2, String str3, boolean z3, boolean z4, String str4, String str5, String str6) {
        new NoPermission.Builder().mo36582a(z).mo36581a(m39563a(str2)).mo36586c(m39563a(str)).mo36580a(aVar).mo36587c(z2).mo36579a(i).mo36590e(str3).mo36589d(z3).mo36591e(z4).mo36592f(str4).mo36594g(str5).mo36595h(str6).mo36583a().showView(fragmentManager);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36676a(FragmentManager fragmentManager, int i, boolean z, int i2, boolean z2, boolean z3, String str, int i3, String str2, boolean z4, boolean z5, String str3, String str4, String str5) {
        PermForbidFragment.m39525a(fragmentManager, i, z, i2, z2, z3, str, i3, str2, z4, z5, str3, str4, str5);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36673a(FragmentActivity fragmentActivity, String str, C8275a aVar, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, String str6, String str7, String str8, boolean z5) {
        new NoPermission.Builder().mo36582a(z2).mo36581a(m39563a(str2)).mo36584b(m39563a(str3)).mo36586c(m39563a(str)).mo36585b(z).mo36580a(aVar).mo36588d(m39563a(str4)).mo36587c(true).mo36579a(-1).mo36593f(z5).mo36590e(str5).mo36589d(z3).mo36591e(z4).mo36592f(str6).mo36594g(str7).mo36595h(str8).mo36583a().show(fragmentActivity.getSupportFragmentManager());
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36669a(Activity activity, String str) {
        NotNotifyOperator.m41292a(activity, str);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36670a(Context context, int i, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AbstractC10154a aVar, String str2, boolean z6, boolean z7) {
        C10071n.m41906a(context, i, str == null ? "" : str, z, z2, z3, z4, z5, aVar, str2, z6, z7);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36672a(FragmentActivity fragmentActivity, String str, int i, String str2, String str3, String str4) {
        ApplyPermissionPanel.m39480a(fragmentActivity, str, i, str2, str3, str4);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36671a(FragmentActivity fragmentActivity, DocPermSetInfo docPermSetInfo, ArrayList<UserInfo> arrayList, String str, boolean z) {
        InviteMembersUtils.m39847a(fragmentActivity, docPermSetInfo, arrayList, str, z);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36677a(UDAvatar uDAvatar, UserInfo userInfo) {
        AvatarLoadHelper aVar = AvatarLoadHelper.f25748a;
        AvatarLoadHelper.m39732a(uDAvatar, userInfo);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public void mo36674a(FragmentActivity fragmentActivity, String str, String str2, String str3, ArrayList<UserInfo> arrayList) {
        BitableProInviteMemberFragment.m40884a(fragmentActivity, str, str3, str2, arrayList);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public View mo36660a(Context context) {
        return new BitableShareLinkShareSetView(context);
    }

    /* renamed from: a */
    private String m39563a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public View mo36662a(Context context, String str, boolean z) {
        DocLinkShareSetView docLinkShareSetView = new DocLinkShareSetView(context);
        docLinkShareSetView.mo38425a(str, z);
        return docLinkShareSetView;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public View mo36663a(Context context, boolean z, String str, boolean z2) {
        FolderLinkShareSetView folderLinkShareSetView = new FolderLinkShareSetView(context);
        folderLinkShareSetView.mo38428a(z, str, z2);
        return folderLinkShareSetView;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public View mo36664a(FragmentActivity fragmentActivity, int i, String str, String str2) {
        return new ShareBitableShareMemberView(fragmentActivity, i, str, str2);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public DialogInterface$OnCancelListenerC1021b mo36667a(FragmentActivity fragmentActivity, String str, int i, boolean z, Runnable runnable) {
        return C10061h.m41866a(fragmentActivity, i, str, z, runnable);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public View mo36661a(Context context, String str, String str2, int i, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        SharePermSetView sharePermSetView = new SharePermSetView(context);
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        if (str2 == null) {
            str5 = "";
        } else {
            str5 = str2;
        }
        if (str3 == null) {
            str6 = "";
        } else {
            str6 = str3;
        }
        sharePermSetView.mo38490a(str4, str5, i, str6, z);
        return sharePermSetView;
    }

    /* renamed from: a */
    public C7667e mo36678b(FragmentManager fragmentManager, String str, int i, int i2, boolean z, Runnable runnable) {
        return C10062i.m41874a(fragmentManager, str, i, i2, z, runnable);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public View mo36666a(FragmentActivity fragmentActivity, int i, String str, String str2, String str3, boolean z, boolean z2) {
        return new ShareDocMemberView(fragmentActivity, i, str, str2, str3, z, z2);
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e
    /* renamed from: a */
    public View mo36665a(FragmentActivity fragmentActivity, int i, String str, String str2, String str3, FolderVersion folderVersion, boolean z, boolean z2) {
        return new ShareFolderMemberView(fragmentActivity, i, str, str2, str3, folderVersion, z, z2);
    }
}
