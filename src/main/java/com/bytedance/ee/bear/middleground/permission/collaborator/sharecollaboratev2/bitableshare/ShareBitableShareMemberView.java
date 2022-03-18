package com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.bitableshare;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b;
import com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/ShareBitableShareMemberView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/BaseShareMemberView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/BitableShareMemberPresenter;", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/IBitableSharePermSetInfo;", "context", "Landroidx/fragment/app/FragmentActivity;", ShareHitPoint.f121869d, "", "token", "", "shareToken", "(Landroidx/fragment/app/FragmentActivity;ILjava/lang/String;Ljava/lang/String;)V", "getType", "()I", "initView", "", "Landroid/content/Context;", "setBitableSharePermSetInfo", "bitableSharePermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "setCollaborateEnable", "enable", "", "setDivider", "show", "setEnable", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.d */
public final class ShareBitableShareMemberView extends BaseShareMemberView<BitableShareMemberPresenter> implements IBitableSharePermSetInfo {

    /* renamed from: c */
    public final FragmentActivity f25774c;

    /* renamed from: d */
    private final int f25775d;

    /* renamed from: e */
    private final String f25776e;

    /* renamed from: f */
    private final String f25777f;

    /* renamed from: g */
    private HashMap f25778g;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView
    /* renamed from: a */
    public View mo36752a(int i) {
        if (this.f25778g == null) {
            this.f25778g = new HashMap();
        }
        View view = (View) this.f25778g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25778g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void setDivider(boolean z) {
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView
    public int getType() {
        return this.f25775d;
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo
    public void setEnable(boolean z) {
        setCollaborateEnable(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/ShareBitableShareMemberView$setCollaborateEnable$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.d$a */
    public static final class C9598a extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareBitableShareMemberView f25779a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9598a(ShareBitableShareMemberView dVar) {
            this.f25779a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ((BitableShareMemberPresenter) this.f25779a.getPresenter()).mo36772c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/ShareBitableShareMemberView$setCollaborateEnable$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.d$b */
    public static final class C9599b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ ShareBitableShareMemberView f25780a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9599b(ShareBitableShareMemberView dVar) {
            this.f25780a = dVar;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ((BitableShareMemberPresenter) this.f25780a.getPresenter()).mo36773d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/ShareBitableShareMemberView$setCollaborateEnable$3", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/CollaboratorAvatarAdapter$AvatarClickListener;", "onAvatarClicked", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.d$c */
    public static final class C9600c implements C9604b.AbstractC9605a {

        /* renamed from: a */
        final /* synthetic */ ShareBitableShareMemberView f25781a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9600c(ShareBitableShareMemberView dVar) {
            this.f25781a = dVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b.AbstractC9605a
        /* renamed from: a */
        public void mo36784a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            ((BitableShareMemberPresenter) this.f25781a.getPresenter()).mo36773d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/bitableshare/ShareBitableShareMemberView$setCollaborateEnable$6", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/sharecollaboratev2/CollaboratorAvatarAdapter$AvatarClickListener;", "onAvatarClicked", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.d$f */
    public static final class C9603f implements C9604b.AbstractC9605a {

        /* renamed from: a */
        final /* synthetic */ ShareBitableShareMemberView f25784a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9603f(ShareBitableShareMemberView dVar) {
            this.f25784a = dVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.p465a.C9604b.AbstractC9605a
        /* renamed from: a */
        public void mo36784a(UserInfo userInfo) {
            Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
            Toast.showText(this.f25784a.f25774c, (int) R.string.Bitable_Form_PleaseTurnOnFormShare);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.d$d */
    public static final class View$OnClickListenerC9601d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareBitableShareMemberView f25782a;

        View$OnClickListenerC9601d(ShareBitableShareMemberView dVar) {
            this.f25782a = dVar;
        }

        public final void onClick(View view) {
            Toast.showText(this.f25782a.f25774c, (int) R.string.Bitable_Form_PleaseTurnOnFormShare);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.a.a.d$e */
    public static final class View$OnClickListenerC9602e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareBitableShareMemberView f25783a;

        View$OnClickListenerC9602e(ShareBitableShareMemberView dVar) {
            this.f25783a = dVar;
        }

        public final void onClick(View view) {
            Toast.showText(this.f25783a.f25774c, (int) R.string.Bitable_Form_PleaseTurnOnFormShare);
        }
    }

    @Override // com.bytedance.ee.bear.middleground_permission_export.model.permissionset.IBitableSharePermSetInfo
    public void setBitableSharePermSetInfo(BitableSharePermSetInfo bitableSharePermSetInfo) {
        Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "bitableSharePermSetInfo");
        ((BitableShareMemberPresenter) getPresenter()).mo36770a(bitableSharePermSetInfo);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.BaseShareMemberView
    /* renamed from: a */
    public void mo36754a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.mo36754a(context);
        ((TextView) mo36752a(R.id.inviteMemberTitle)).setText(R.string.Bitable_Form_InviteCollaborator);
        ((TextView) mo36752a(R.id.manageMemberTitle)).setText(R.string.Bitable_Form_ManageCollaborator);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.sharecollaboratev2.IShareMemberView
    public void setCollaborateEnable(boolean z) {
        if (z) {
            animate().alpha(1.0f).setDuration(150).start();
            ((LinearLayout) mo36752a(R.id.inputLayout)).setOnClickListener(new C9598a(this));
            LinearLayout linearLayout = (LinearLayout) mo36752a(R.id.memberListLayout);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "memberListLayout");
            linearLayout.setEnabled(true);
            ((LinearLayout) mo36752a(R.id.memberListLayout)).setOnClickListener(new C9599b(this));
            getAdapter().mo36787a(new C9600c(this));
            return;
        }
        animate().alpha(0.3f).setDuration(150).start();
        ((LinearLayout) mo36752a(R.id.inputLayout)).setOnClickListener(new View$OnClickListenerC9601d(this));
        ((LinearLayout) mo36752a(R.id.memberListLayout)).setOnClickListener(new View$OnClickListenerC9602e(this));
        getAdapter().mo36787a(new C9603f(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareBitableShareMemberView(FragmentActivity fragmentActivity, int i, String str, String str2) {
        super(fragmentActivity, i, false);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "shareToken");
        this.f25774c = fragmentActivity;
        this.f25775d = i;
        this.f25776e = str;
        this.f25777f = str2;
        setPresenter(new BitableShareMemberPresenter(fragmentActivity, getType(), str, str2, this));
    }
}
