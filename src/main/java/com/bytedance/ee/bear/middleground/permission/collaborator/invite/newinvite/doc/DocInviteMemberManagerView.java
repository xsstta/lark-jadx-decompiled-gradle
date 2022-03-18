package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9707d;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.middleground.permission.permission.doc.DocUserPermission;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermDialog;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModel;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModelHelper;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "view", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "dialog", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermDialog;", "pos", "", "create", "", "getAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "getEditPermModelList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "Lkotlin/collections/ArrayList;", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "isSelectContainerPerm", "", "onClickRemovePermission", "onClickSetCanEdit", "onClickSetCanRead", "onClickSetFullAccess", "singlePagePermEnable", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.d */
public class DocInviteMemberManagerView extends BaseInviteMemberManagerView {

    /* renamed from: j */
    public static final Companion f26013j = new Companion(null);

    /* renamed from: f */
    public int f26014f;

    /* renamed from: g */
    public EditPermDialog f26015g;

    /* renamed from: h */
    public final Context f26016h;

    /* renamed from: i */
    public final DocPermSetInfo f26017i;

    /* renamed from: k */
    private final C10917c f26018k;

    /* renamed from: l */
    private final View f26019l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/doc/DocInviteMemberManagerView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: u */
    private final boolean m40043u() {
        if (!this.f26017i.mo38844q() || !this.f26017i.ab() || !PermFGUtils.m39534c()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: c */
    public C9638a mo36882c() {
        Locale d = C4484g.m18494b().mo17253d();
        Intrinsics.checkExpressionValueIsNotNull(d, "SdkLocaleServiceWrapper.…nstance().provideLocale()");
        C9707d dVar = new C9707d(d, ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f());
        dVar.mo36858a((C9638a.AbstractC9639a) new C9670b(this));
        return dVar;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView, com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract.IView
    /* renamed from: i */
    public boolean mo36898i() {
        if (!m40043u()) {
            return true;
        }
        if (this.f26017i.mo38797F()) {
            ImageView imageView = (ImageView) this.f26019l.findViewById(R.id.containerPermCheckBox);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.containerPermCheckBox");
            if (imageView.isSelected()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        boolean u = m40043u();
        if (u && this.f26017i.mo38797F()) {
            Group group = (Group) this.f26019l.findViewById(R.id.containerPermGroup);
            Intrinsics.checkExpressionValueIsNotNull(group, "view.containerPermGroup");
            group.setVisibility(0);
            ImageView imageView = (ImageView) this.f26019l.findViewById(R.id.containerPermCheckBox);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.containerPermCheckBox");
            imageView.setSelected(true);
            UDNotice uDNotice = (UDNotice) this.f26019l.findViewById(R.id.bannerTipsLayout3);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice, "view.bannerTipsLayout3");
            uDNotice.setVisibility(8);
        } else if (!u || !this.f26017i.mo38798G()) {
            Group group2 = (Group) this.f26019l.findViewById(R.id.containerPermGroup);
            Intrinsics.checkExpressionValueIsNotNull(group2, "view.containerPermGroup");
            group2.setVisibility(8);
            UDNotice uDNotice2 = (UDNotice) this.f26019l.findViewById(R.id.bannerTipsLayout3);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice2, "view.bannerTipsLayout3");
            uDNotice2.setVisibility(8);
        } else {
            Group group3 = (Group) this.f26019l.findViewById(R.id.containerPermGroup);
            Intrinsics.checkExpressionValueIsNotNull(group3, "view.containerPermGroup");
            group3.setVisibility(8);
            UDNotice uDNotice3 = (UDNotice) this.f26019l.findViewById(R.id.bannerTipsLayout3);
            Intrinsics.checkExpressionValueIsNotNull(uDNotice3, "view.bannerTipsLayout3");
            uDNotice3.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.d$c */
    public static final class View$OnClickListenerC9671c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocInviteMemberManagerView f26021a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26022b;

        View$OnClickListenerC9671c(DocInviteMemberManagerView dVar, UserInfo userInfo) {
            this.f26021a = dVar;
            this.f26022b = userInfo;
        }

        public final void onClick(View view) {
            this.f26021a.mo36943b(this.f26022b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.d$d */
    public static final class View$OnClickListenerC9672d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocInviteMemberManagerView f26023a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26024b;

        View$OnClickListenerC9672d(DocInviteMemberManagerView dVar, UserInfo userInfo) {
            this.f26023a = dVar;
            this.f26024b = userInfo;
        }

        public final void onClick(View view) {
            this.f26023a.mo36945d(this.f26024b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.d$e */
    public static final class View$OnClickListenerC9673e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocInviteMemberManagerView f26025a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26026b;

        View$OnClickListenerC9673e(DocInviteMemberManagerView dVar, UserInfo userInfo) {
            this.f26025a = dVar;
            this.f26026b = userInfo;
        }

        public final void onClick(View view) {
            this.f26025a.mo36944c(this.f26026b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.d$f */
    public static final class View$OnClickListenerC9674f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DocInviteMemberManagerView f26027a;

        /* renamed from: b */
        final /* synthetic */ UserInfo f26028b;

        View$OnClickListenerC9674f(DocInviteMemberManagerView dVar, UserInfo userInfo) {
            this.f26027a = dVar;
            this.f26028b = userInfo;
        }

        public final void onClick(View view) {
            this.f26027a.mo36946e(this.f26028b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36943b(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("DocInviteMemberManagerView", "onClickSetFullAccess()...pos = " + this.f26014f);
        userInfo.setPermission(1024);
        mo36892b().notifyItemChanged(this.f26014f);
        EditPermDialog bVar = this.f26015g;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo36945d(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("DocInviteMemberManagerView", "onClickSetCanEdit()...pos = " + this.f26014f);
        userInfo.setPermission(4);
        mo36892b().notifyItemChanged(this.f26014f);
        EditPermDialog bVar = this.f26015g;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo36946e(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("DocInviteMemberManagerView", "onClickRemovePermission()...pos = " + this.f26014f);
        IInviteMemberManagerContract.IView.IViewDelegate a = mo36885a();
        if (a != null) {
            a.mo36876a(userInfo);
        }
        mo36892b().notifyItemRemoved(this.f26014f);
        EditPermDialog bVar = this.f26015g;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36944c(UserInfo userInfo) {
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        C13479a.m54764b("DocInviteMemberManagerView", "onClickSetCanRead()...pos = " + this.f26014f);
        userInfo.setPermission(1);
        mo36892b().notifyItemChanged(this.f26014f);
        EditPermDialog bVar = this.f26015g;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<EditPermItemModel> mo36942a(UserInfo userInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkParameterIsNotNull(userInfo, "userInfo");
        boolean i = mo36898i();
        if (i) {
            z = this.f26017i.mo38850v();
        } else {
            z = this.f26017i.mo38854y();
        }
        if (i) {
            z2 = this.f26017i.mo38851w();
        } else {
            z2 = this.f26017i.mo38855z();
        }
        if (i) {
            z3 = this.f26017i.mo38853x();
        } else {
            z3 = this.f26017i.mo38792A();
        }
        boolean g = DocUserPermission.Companion.mo38041g(userInfo.getPermission());
        boolean c = DocUserPermission.Companion.mo38037c(userInfo.getPermission());
        boolean a = DocUserPermission.Companion.mo38035a(userInfo.getPermission());
        boolean z5 = true;
        if (!this.f26017i.mo38844q() || !this.f26017i.ab()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean Y = this.f26017i.mo38816Y();
        C13479a.m54764b("DocInviteMemberManagerView", "canUserFa: " + z + ", " + "canUserEdit: " + z2 + ", " + "canMemberEdit:" + c + ", " + "canMemberFa:" + g + ", " + "canMemberRead:" + a + ", " + "wiki2enable:" + z4 + ", " + "isDocV2: " + Y);
        EditPermItemModelHelper dVar = new EditPermItemModelHelper(this.f26016h);
        if (!z4 && !Y) {
            z5 = false;
        }
        return dVar.mo38518a(z5, z, g, this.f26017i.mo38844q(), new View$OnClickListenerC9671c(this, userInfo)).mo38521b(c, z2, new View$OnClickListenerC9672d(this, userInfo)).mo38517a(a, z3, new View$OnClickListenerC9673e(this, userInfo)).mo38515a(new View$OnClickListenerC9674f(this, userInfo)).mo38519a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "kotlin.jvm.PlatformType", "position", "", "onItemPermissionClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.c.d$b */
    static final class C9670b implements C9638a.AbstractC9639a {

        /* renamed from: a */
        final /* synthetic */ DocInviteMemberManagerView f26020a;

        C9670b(DocInviteMemberManagerView dVar) {
            this.f26020a = dVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a.AbstractC9639a
        /* renamed from: a */
        public final void mo36860a(UserInfo userInfo, int i) {
            this.f26020a.f26014f = i;
            if (this.f26020a.f26015g == null) {
                DocInviteMemberManagerView dVar = this.f26020a;
                dVar.f26015g = new EditPermDialog(dVar.f26016h);
            }
            EditPermDialog bVar = this.f26020a.f26015g;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(userInfo, "userInfo");
                bVar.mo38494a(userInfo, this.f26020a.f26017i.mo38827c(), this.f26020a.f26017i.mo38825b(), this.f26020a.mo36942a(userInfo));
            }
            PermissionAnalytic.m39397a(this.f26020a.f26017i, userInfo);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocInviteMemberManagerView(Context context, C10917c cVar, View view, DocPermSetInfo docPermSetInfo) {
        super(context, view, docPermSetInfo.mo38825b(), docPermSetInfo.mo38836i());
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
        this.f26016h = context;
        this.f26018k = cVar;
        this.f26019l = view;
        this.f26017i = docPermSetInfo;
    }
}
