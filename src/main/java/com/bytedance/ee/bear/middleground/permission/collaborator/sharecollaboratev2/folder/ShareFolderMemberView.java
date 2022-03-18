package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.folder;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView;
import com.bytedance.ee.bear.middleground.permission.lock.LockBannerView;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IFolderPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0002J \u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/BaseShareMemberView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/IShareFolderMemberPresenter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IFolderPermSetInfo;", "context", "Landroidx/fragment/app/FragmentActivity;", ShareHitPoint.f121869d, "", "token", "", "spaceId", "module", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "Lcom/bytedance/ee/bear/list/dto/FolderVersion;", "isShareRoot", "", "showDivider", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/FolderVersion;ZZ)V", "getToken", "()Ljava/lang/String;", "setCollaborateEnable", "", "enable", "setFolderPermSetInfo", "folderPermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "showTipDialog", "updateLockState", "lockState", "canUnlock", "isFolderV2", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.d */
public final class ShareFolderMemberView extends BaseShareMemberView<IShareFolderMemberPresenter> implements IFolderPermSetInfo {

    /* renamed from: c */
    private final String f25855c;

    /* renamed from: d */
    private HashMap f25856d;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView
    /* renamed from: a */
    public View mo36752a(int i) {
        if (this.f25856d == null) {
            this.f25856d = new HashMap();
        }
        View view = (View) this.f25856d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25856d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getToken() {
        return this.f25855c;
    }

    /* renamed from: c */
    public final void mo36826c() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40651a(this.f25855c, String.valueOf(getType()), new BearUDDialogBuilder(context).mo45344a(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title).mo45362d(R.string.CreationMobile_ECM_PermissionChangeDesc).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface$OnClickListenerC9632d(this)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, DialogInterface$OnClickListenerC9633e.f25864a).mo45368i(R.style.WindowNoAnimation).mo45359b());
        PermissionAnalyticV2.m39583E();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberView$updateLockState$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.d$f */
    public static final class C9634f extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberView f25865a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9634f(ShareFolderMemberView dVar) {
            this.f25865a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            PermissionAnalyticV2.m39593a();
            this.f25865a.mo36826c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberView$setCollaborateEnable$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.d$a */
    public static final class C9629a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberView f25857a;

        /* renamed from: b */
        final /* synthetic */ boolean f25858b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f25858b) {
                ((IShareFolderMemberPresenter) this.f25857a.getPresenter()).mo36772c();
            }
        }

        C9629a(ShareFolderMemberView dVar, boolean z) {
            this.f25857a = dVar;
            this.f25858b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberView$setCollaborateEnable$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.d$b */
    public static final class C9630b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberView f25859a;

        /* renamed from: b */
        final /* synthetic */ boolean f25860b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f25860b) {
                ((IShareFolderMemberPresenter) this.f25859a.getPresenter()).mo36773d();
            }
        }

        C9630b(ShareFolderMemberView dVar, boolean z) {
            this.f25859a = dVar;
            this.f25860b = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/folder/ShareFolderMemberView$setCollaborateEnable$3", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/CollaboratorAvatarAdapter$AvatarClickListener;", "onAvatarClicked", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.d$c */
    public static final class C9631c implements C9604b.AbstractC9605a {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberView f25861a;

        /* renamed from: b */
        final /* synthetic */ boolean f25862b;

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b.AbstractC9605a
        /* renamed from: a */
        public void mo36784a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            if (this.f25862b) {
                ((IShareFolderMemberPresenter) this.f25861a.getPresenter()).mo36773d();
            }
        }

        C9631c(ShareFolderMemberView dVar, boolean z) {
            this.f25861a = dVar;
            this.f25862b = z;
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IFolderPermSetInfo
    public void setFolderPermSetInfo(FolderPermSetInfo folderPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "folderPermSetInfo");
        C13479a.m54764b("BaseShareMemberView", "setPermissionInfo()...userPermission = " + folderPermSetInfo.mo38878n());
        ((IShareFolderMemberPresenter) getPresenter()).mo36812a(folderPermSetInfo);
        m39835a(folderPermSetInfo.mo38881q(), folderPermSetInfo.mo38882r(), folderPermSetInfo.mo38883s());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView
    public void setCollaborateEnable(boolean z) {
        float f;
        C13479a.m54764b("BaseShareMemberView", "setCollaborateEnable()...enable = " + z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3f;
        }
        LinearLayout linearLayout = (LinearLayout) mo36752a(R.id.inputLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "inputLayout");
        linearLayout.setAlpha(f);
        TextView textView = (TextView) mo36752a(R.id.inviteMemberTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView, "inviteMemberTitle");
        textView.setAlpha(f);
        ((LinearLayout) mo36752a(R.id.inputLayout)).setOnClickListener(new C9629a(this, z));
        ((LinearLayout) mo36752a(R.id.memberListLayout)).setOnClickListener(new C9630b(this, z));
        getAdapter().mo36787a(new C9631c(this, z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.d$e */
    public static final class DialogInterface$OnClickListenerC9633e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC9633e f25864a = new DialogInterface$OnClickListenerC9633e();

        DialogInterface$OnClickListenerC9633e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PermissionAnalyticV2.m39681h(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.c.d$d */
    public static final class DialogInterface$OnClickListenerC9632d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareFolderMemberView f25863a;

        DialogInterface$OnClickListenerC9632d(ShareFolderMemberView dVar) {
            this.f25863a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((LockBannerView) this.f25863a.mo36752a(R.id.lockBanner)).mo37767a();
            ((IShareFolderMemberPresenter) this.f25863a.getPresenter()).mo36774e();
            PermissionAnalyticV2.m39681h(true);
        }
    }

    /* renamed from: a */
    private final void m39835a(boolean z, boolean z2, boolean z3) {
        if (!z || !z3) {
            ((LockBannerView) mo36752a(R.id.lockBanner)).mo37767a();
            return;
        }
        String string = getContext().getString(R.string.CreationMobile_ECM_PermissionRestrictionDesc);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(tips)");
        ((LockBannerView) mo36752a(R.id.lockBanner)).mo37768a(string, z2, new C9634f(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareFolderMemberView(FragmentActivity fragmentActivity, int i, String str, String str2, String str3, FolderVersion folderVersion, boolean z, boolean z2) {
        super(fragmentActivity, i, z2);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "spaceId");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        Intrinsics.checkParameterIsNotNull(folderVersion, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        this.f25855c = str;
        setPresenter(new ShareFolderMemberPresenter(fragmentActivity, i, str, str2, folderVersion, z, str3, this));
    }
}
