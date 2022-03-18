package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalytic;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9709e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.IInviteMemberManagerContract;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermDialog;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModel;
import com.bytedance.ee.bear.middleground.permission.widget.editpermdialog.EditPermItemModelHelper;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J0\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerView;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/BaseInviteMemberManagerView;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "view", "Landroid/view/View;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "(Landroid/content/Context;Lcom/bytedance/ee/bear/service/ServiceContext;Landroid/view/View;Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;)V", "dialog", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermDialog;", "getAdapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/BaseInviteCollaboratorManageAdapter;", "getEditPermModelList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/middleground/permission/widget/editpermdialog/EditPermItemModel;", "Lkotlin/collections/ArrayList;", "adapter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/FolderInviteCollaboratorManageAdapter;", "position", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "onEditClick", "", "onFaClick", "onReadClick", "onRemoveClick", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.d */
public final class FolderInviteMemberManagerView extends BaseInviteMemberManagerView {

    /* renamed from: i */
    public static final Companion f26057i = new Companion(null);

    /* renamed from: f */
    public EditPermDialog f26058f;

    /* renamed from: g */
    public final Context f26059g;

    /* renamed from: h */
    public final FolderPermSetInfo f26060h;

    /* renamed from: j */
    private final C10917c f26061j;

    /* renamed from: k */
    private final View f26062k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerView$Companion;", "", "()V", "TAG", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.BaseInviteMemberManagerView
    /* renamed from: c */
    public C9638a mo36882c() {
        Locale d = C4484g.m18494b().mo17253d();
        Intrinsics.checkExpressionValueIsNotNull(d, "SdkLocaleServiceWrapper.…nstance().provideLocale()");
        C9709e eVar = new C9709e(d, ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f(), true);
        eVar.mo36858a((C9638a.AbstractC9639a) new C9679b(this, eVar));
        return eVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.d$c */
    public static final class View$OnClickListenerC9680c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderInviteMemberManagerView f26065a;

        /* renamed from: b */
        final /* synthetic */ C9709e f26066b;

        /* renamed from: c */
        final /* synthetic */ int f26067c;

        /* renamed from: d */
        final /* synthetic */ UserInfo f26068d;

        View$OnClickListenerC9680c(FolderInviteMemberManagerView dVar, C9709e eVar, int i, UserInfo userInfo) {
            this.f26065a = dVar;
            this.f26066b = eVar;
            this.f26067c = i;
            this.f26068d = userInfo;
        }

        public final void onClick(View view) {
            this.f26065a.mo36963b(this.f26066b, this.f26067c, this.f26068d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.d$d */
    public static final class View$OnClickListenerC9681d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderInviteMemberManagerView f26069a;

        /* renamed from: b */
        final /* synthetic */ C9709e f26070b;

        /* renamed from: c */
        final /* synthetic */ int f26071c;

        /* renamed from: d */
        final /* synthetic */ UserInfo f26072d;

        View$OnClickListenerC9681d(FolderInviteMemberManagerView dVar, C9709e eVar, int i, UserInfo userInfo) {
            this.f26069a = dVar;
            this.f26070b = eVar;
            this.f26071c = i;
            this.f26072d = userInfo;
        }

        public final void onClick(View view) {
            this.f26069a.mo36965d(this.f26070b, this.f26071c, this.f26072d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.d$e */
    public static final class View$OnClickListenerC9682e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderInviteMemberManagerView f26073a;

        /* renamed from: b */
        final /* synthetic */ C9709e f26074b;

        /* renamed from: c */
        final /* synthetic */ int f26075c;

        /* renamed from: d */
        final /* synthetic */ UserInfo f26076d;

        View$OnClickListenerC9682e(FolderInviteMemberManagerView dVar, C9709e eVar, int i, UserInfo userInfo) {
            this.f26073a = dVar;
            this.f26074b = eVar;
            this.f26075c = i;
            this.f26076d = userInfo;
        }

        public final void onClick(View view) {
            this.f26073a.mo36964c(this.f26074b, this.f26075c, this.f26076d);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.d$f */
    public static final class View$OnClickListenerC9683f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FolderInviteMemberManagerView f26077a;

        /* renamed from: b */
        final /* synthetic */ C9709e f26078b;

        /* renamed from: c */
        final /* synthetic */ int f26079c;

        /* renamed from: d */
        final /* synthetic */ UserInfo f26080d;

        View$OnClickListenerC9683f(FolderInviteMemberManagerView dVar, C9709e eVar, int i, UserInfo userInfo) {
            this.f26077a = dVar;
            this.f26078b = eVar;
            this.f26079c = i;
            this.f26080d = userInfo;
        }

        public final void onClick(View view) {
            this.f26077a.mo36966e(this.f26078b, this.f26079c, this.f26080d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "userInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "kotlin.jvm.PlatformType", "position", "", "onItemPermissionClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.d$b */
    static final class C9679b implements C9638a.AbstractC9639a {

        /* renamed from: a */
        final /* synthetic */ FolderInviteMemberManagerView f26063a;

        /* renamed from: b */
        final /* synthetic */ C9709e f26064b;

        C9679b(FolderInviteMemberManagerView dVar, C9709e eVar) {
            this.f26063a = dVar;
            this.f26064b = eVar;
        }

        @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.C9638a.AbstractC9639a
        /* renamed from: a */
        public final void mo36860a(UserInfo userInfo, int i) {
            if (this.f26063a.f26058f == null) {
                FolderInviteMemberManagerView dVar = this.f26063a;
                dVar.f26058f = new EditPermDialog(dVar.f26059g);
            }
            EditPermDialog bVar = this.f26063a.f26058f;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(userInfo, "userInfo");
                bVar.mo38494a(userInfo, this.f26063a.f26060h.mo38864c(), this.f26063a.f26060h.mo38863b(), this.f26063a.mo36962a(this.f26064b, i, userInfo));
            }
            PermissionAnalytic.m39402a(this.f26063a.f26060h, userInfo);
        }
    }

    /* renamed from: b */
    public final void mo36963b(C9709e eVar, int i, UserInfo userInfo) {
        C13479a.m54764b("FolderInviteMemberManagerView", "onFaClick()...pos = " + i);
        userInfo.setPermission(3);
        eVar.notifyItemChanged(i);
        EditPermDialog bVar = this.f26058f;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* renamed from: d */
    public final void mo36965d(C9709e eVar, int i, UserInfo userInfo) {
        C13479a.m54764b("FolderInviteMemberManagerView", "onEditClick()...pos = " + i);
        userInfo.setPermission(2);
        eVar.notifyItemChanged(i);
        EditPermDialog bVar = this.f26058f;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* renamed from: e */
    public final void mo36966e(C9709e eVar, int i, UserInfo userInfo) {
        C13479a.m54764b("FolderInviteMemberManagerView", "onRemoveClick()...pos = " + i);
        IInviteMemberManagerContract.IView.IViewDelegate a = mo36885a();
        if (a != null) {
            a.mo36876a(userInfo);
        }
        eVar.notifyItemRemoved(i);
        EditPermDialog bVar = this.f26058f;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* renamed from: c */
    public final void mo36964c(C9709e eVar, int i, UserInfo userInfo) {
        C13479a.m54764b("FolderInviteMemberManagerView", "onReadClick()...pos = " + i);
        userInfo.setPermission(1);
        eVar.notifyItemChanged(i);
        EditPermDialog bVar = this.f26058f;
        if (bVar != null) {
            bVar.mo38493a();
        }
    }

    /* renamed from: a */
    public final ArrayList<EditPermItemModel> mo36962a(C9709e eVar, int i, UserInfo userInfo) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean v = this.f26060h.mo38887v();
        boolean w = this.f26060h.mo38888w();
        boolean x = this.f26060h.mo38890x();
        if (userInfo.getPermission() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (userInfo.getPermission() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (userInfo.getPermission() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13479a.m54764b("FolderInviteMemberManagerView", "canInviteFa: " + v + ", " + "canUserEdit: " + w + ", " + "isMemberFa: " + z + ", " + "isMemberEdit: " + z2 + ", " + "isMemberRead: " + z3);
        return new EditPermItemModelHelper(this.f26059g).mo38518a(this.f26060h.mo38883s(), v, z, false, new View$OnClickListenerC9680c(this, eVar, i, userInfo)).mo38521b(z2, w, new View$OnClickListenerC9681d(this, eVar, i, userInfo)).mo38517a(z3, x, new View$OnClickListenerC9682e(this, eVar, i, userInfo)).mo38515a(new View$OnClickListenerC9683f(this, eVar, i, userInfo)).mo38519a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FolderInviteMemberManagerView(Context context, C10917c cVar, View view, FolderPermSetInfo folderPermSetInfo) {
        super(context, view, folderPermSetInfo.mo38863b(), folderPermSetInfo.mo38870g());
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
        this.f26059g = context;
        this.f26061j = cVar;
        this.f26062k = view;
        this.f26060h = folderPermSetInfo;
    }
}
