package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.doc;

import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView;
import com.bytedance.ee.bear.middleground.permission.lock.LockBannerView;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.image.UDAvatarList;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B=\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J(\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/BaseShareMemberView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberPresenter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IDocPermSetInfo;", "context", "Landroidx/fragment/app/FragmentActivity;", ShareHitPoint.f121869d, "", "token", "", "docName", "module", "isWiki", "", "showDivider", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getType", "()I", "setCollaborateEnable", "", "enable", "setDivider", "show", "setDocPermSetInfo", "docPermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "showNoSharePermTips", "showTipDialog", "updateLockState", "lockState", "canUnlock", "isDocV2", "isWikiVersionV2", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d */
public final class ShareDocMemberView extends BaseShareMemberView<ShareDocMemberPresenter> implements IDocPermSetInfo {

    /* renamed from: c */
    public static final Companion f25810c = new Companion(null);

    /* renamed from: d */
    private final FragmentActivity f25811d;

    /* renamed from: e */
    private final int f25812e;

    /* renamed from: f */
    private final String f25813f;

    /* renamed from: g */
    private final String f25814g;

    /* renamed from: h */
    private final String f25815h;

    /* renamed from: i */
    private final boolean f25816i;

    /* renamed from: j */
    private final boolean f25817j;

    /* renamed from: k */
    private HashMap f25818k;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView
    /* renamed from: a */
    public View mo36752a(int i) {
        if (this.f25818k == null) {
            this.f25818k = new HashMap();
        }
        View view = (View) this.f25818k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25818k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo
    public void setDivider(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberView$Companion;", "", "()V", "MAX_SHOW_DISABLE", "", "MAX_SHOW_NUM_ENABLE", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView
    public int getType() {
        return this.f25812e;
    }

    /* renamed from: d */
    public final void mo36805d() {
        Toast.showText(this.f25811d, (int) R.string.Doc_Permission_NoPermissionAccessCollaborators);
    }

    /* renamed from: c */
    public final void mo36804c() {
        int i;
        if (this.f25816i) {
            i = R.string.CreationMobile_Wiki_Permission_RestoreInherit_Placeholder;
        } else {
            i = R.string.CreationMobile_ECM_PermissionChangeDesc;
        }
        ((IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null)).mo40651a(this.f25813f, String.valueOf(getType()), new BearUDDialogBuilder(this.f25811d).mo45344a(R.string.CreationMobile_Wiki_Permission_ChangePermission_Title).mo45362d(i).mo45360c(8388611).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Confirm, new DialogInterface$OnClickListenerC9618h(this)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, DialogInterface$OnClickListenerC9619i.f25826a).mo45368i(R.style.WindowNoAnimation).mo45359b());
        PermissionAnalyticV2.m39583E();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberView$setCollaborateEnable$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$b */
    public static final class C9612b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25819a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9612b(ShareDocMemberView dVar) {
            this.f25819a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ((ShareDocMemberPresenter) this.f25819a.getPresenter()).mo36772c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberView$setCollaborateEnable$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$c */
    public static final class C9613c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25820a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9613c(ShareDocMemberView dVar) {
            this.f25820a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ((ShareDocMemberPresenter) this.f25820a.getPresenter()).mo36773d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberView$setCollaborateEnable$3", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/CollaboratorAvatarAdapter$AvatarClickListener;", "onAvatarClicked", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$d */
    public static final class C9614d implements C9604b.AbstractC9605a {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25821a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9614d(ShareDocMemberView dVar) {
            this.f25821a = dVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b.AbstractC9605a
        /* renamed from: a */
        public void mo36784a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            ((ShareDocMemberPresenter) this.f25821a.getPresenter()).mo36773d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$f */
    static final class View$OnClickListenerC9616f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25823a;

        View$OnClickListenerC9616f(ShareDocMemberView dVar) {
            this.f25823a = dVar;
        }

        public final void onClick(View view) {
            this.f25823a.mo36805d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberView$setCollaborateEnable$6", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/CollaboratorAvatarAdapter$AvatarClickListener;", "onAvatarClicked", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$g */
    public static final class C9617g implements C9604b.AbstractC9605a {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25824a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9617g(ShareDocMemberView dVar) {
            this.f25824a = dVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b.AbstractC9605a
        /* renamed from: a */
        public void mo36784a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            if (userInfo.isOwner()) {
                ((AbstractC5586d) KoinJavaComponent.m268613a(AbstractC5586d.class, null, null, 6, null)).mo22257a(userInfo.getId(), "");
            } else {
                this.f25824a.mo36805d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/doc/ShareDocMemberView$updateLockState$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$j */
    public static final class C9620j extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25827a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9620j(ShareDocMemberView dVar) {
            this.f25827a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            PermissionAnalyticV2.m39593a();
            this.f25827a.mo36804c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$e */
    static final class View$OnClickListenerC9615e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25822a;

        View$OnClickListenerC9615e(ShareDocMemberView dVar) {
            this.f25822a = dVar;
        }

        public final void onClick(View view) {
            ((ShareDocMemberPresenter) this.f25822a.getPresenter()).mo36772c();
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IDocPermSetInfo
    public void setDocPermSetInfo(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "docPermSetInfo");
        C13479a.m54764b("BaseShareMemberView", "setPermissionInfo()...userPermission = " + docPermSetInfo.mo38838k());
        ((ShareDocMemberPresenter) getPresenter()).mo36796a(docPermSetInfo, docPermSetInfo.mo38838k());
        m39796a(docPermSetInfo.mo38799H(), docPermSetInfo.mo38800I(), docPermSetInfo.mo38816Y(), docPermSetInfo.ab());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView
    public void setCollaborateEnable(boolean z) {
        C13479a.m54764b("BaseShareMemberView", "setCollaborateEnable()...enable = " + z);
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo36752a(R.id.inputLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "inputLayout");
            linearLayout.setAlpha(1.0f);
            UDAvatarList uDAvatarList = (UDAvatarList) mo36752a(R.id.memberList);
            Intrinsics.checkExpressionValueIsNotNull(uDAvatarList, "memberList");
            uDAvatarList.setAlpha(1.0f);
            TextView textView = (TextView) mo36752a(R.id.inviteMemberTitle);
            Intrinsics.checkExpressionValueIsNotNull(textView, "inviteMemberTitle");
            textView.setAlpha(1.0f);
            ((UDAvatarList) mo36752a(R.id.memberList)).setMaxCount(6);
            ((LinearLayout) mo36752a(R.id.inputLayout)).setOnClickListener(new C9612b(this));
            ((LinearLayout) mo36752a(R.id.memberListLayout)).setOnClickListener(new C9613c(this));
            getAdapter().mo36787a(new C9614d(this));
            return;
        }
        UDAvatarList uDAvatarList2 = (UDAvatarList) mo36752a(R.id.memberList);
        Intrinsics.checkExpressionValueIsNotNull(uDAvatarList2, "memberList");
        uDAvatarList2.setAlpha(1.0f);
        LinearLayout linearLayout2 = (LinearLayout) mo36752a(R.id.inputLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "inputLayout");
        linearLayout2.setAlpha(1.0f);
        TextView textView2 = (TextView) mo36752a(R.id.inviteMemberTitle);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "inviteMemberTitle");
        textView2.setAlpha(1.0f);
        ((LinearLayout) mo36752a(R.id.inputLayout)).setOnClickListener(new View$OnClickListenerC9615e(this));
        ((LinearLayout) mo36752a(R.id.memberListLayout)).setOnClickListener(new View$OnClickListenerC9616f(this));
        ((UDAvatarList) mo36752a(R.id.memberList)).setMaxCount(2);
        getAdapter().mo36787a(new C9617g(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$i */
    public static final class DialogInterface$OnClickListenerC9619i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC9619i f25826a = new DialogInterface$OnClickListenerC9619i();

        DialogInterface$OnClickListenerC9619i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            PermissionAnalyticV2.m39681h(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.b.d$h */
    public static final class DialogInterface$OnClickListenerC9618h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareDocMemberView f25825a;

        DialogInterface$OnClickListenerC9618h(ShareDocMemberView dVar) {
            this.f25825a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((LockBannerView) this.f25825a.mo36752a(R.id.lockBanner)).mo37767a();
            ((ShareDocMemberPresenter) this.f25825a.getPresenter()).mo36774e();
            PermissionAnalyticV2.m39681h(true);
        }
    }

    /* renamed from: a */
    private final void m39796a(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        if (!z || ((!(z5 = this.f25816i) || !z4) && !z3)) {
            ((LockBannerView) mo36752a(R.id.lockBanner)).mo37767a();
            return;
        }
        if (z5) {
            i = R.string.CreationMobile_Wiki_Permission_NoLongerInherit_Placeholder;
        } else {
            i = R.string.CreationMobile_ECM_PermissionRestrictionDesc;
        }
        String string = this.f25811d.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(tips)");
        ((LockBannerView) mo36752a(R.id.lockBanner)).mo37768a(string, z2, new C9620j(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDocMemberView(FragmentActivity fragmentActivity, int i, String str, String str2, String str3, boolean z, boolean z2) {
        super(fragmentActivity, i, z2);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "docName");
        Intrinsics.checkParameterIsNotNull(str3, "module");
        this.f25811d = fragmentActivity;
        this.f25812e = i;
        this.f25813f = str;
        this.f25814g = str2;
        this.f25815h = str3;
        this.f25816i = z;
        this.f25817j = z2;
        setPresenter(new ShareDocMemberPresenter(fragmentActivity, getType(), str, str3, this));
    }
}
