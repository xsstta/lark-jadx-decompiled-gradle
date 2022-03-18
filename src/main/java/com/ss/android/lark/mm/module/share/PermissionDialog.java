package com.ss.android.lark.mm.module.share;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.permission.PermissionMenu;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.widget.BaseDialog;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.avatar.Avatar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0010H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fX\u0004¢\u0006\u0002\n\u0000R)\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/share/PermissionDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "repoId", "", "user", "Lcom/ss/android/lark/mm/module/share/model/User;", "canTransfer", "", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/share/model/User;ZLcom/ss/android/lark/mm/module/share/model/SharePermission;)V", "transferConfirm", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "permission", "", "updatePermission", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setAvatar", "setMenu", "setNameAndDesc", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.b */
public final class PermissionDialog extends BaseDialog {

    /* renamed from: c */
    public final Function1<SharePermission, Unit> f118266c = new C46978b(this);

    /* renamed from: d */
    public final String f118267d;

    /* renamed from: e */
    public final User f118268e;

    /* renamed from: f */
    public final boolean f118269f;

    /* renamed from: g */
    private final Function1<SharePermission, Unit> f118270g = new C46976a(this);

    /* renamed from: h */
    private final SharePermission f118271h;

    /* renamed from: i */
    private HashMap f118272i;

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f118272i == null) {
            this.f118272i = new HashMap();
        }
        View view = (View) this.f118272i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118272i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f118272i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* renamed from: g */
    private final void m186020g() {
        C45853e.m181659a((Avatar) mo142944a(R.id.ivIcon), this.f118268e.getUserId(), this.f118268e.getAvatarUrl(), this.f118268e.getAvatarKey());
    }

    /* renamed from: h */
    private final void m186021h() {
        String str;
        boolean z;
        BoldTextView boldTextView = (BoldTextView) mo142944a(R.id.tvName);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvName");
        boldTextView.setText(this.f118268e.getUserName());
        boolean z2 = true;
        int i = 0;
        if (this.f118268e.isGroup()) {
            String groupDescription = this.f118268e.getGroupDescription();
            if (groupDescription == null || groupDescription.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = ResString.f118656a.mo165504a(R.string.MMWeb_G_GroupNoDescription);
            } else {
                str = this.f118268e.getGroupDescription();
            }
        } else {
            str = this.f118268e.getDepartmentName();
        }
        BoldTextView boldTextView2 = (BoldTextView) mo142944a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "tvDesc");
        String str2 = str;
        boldTextView2.setText(str2);
        BoldTextView boldTextView3 = (BoldTextView) mo142944a(R.id.tvDesc);
        Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "tvDesc");
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            i = 8;
        }
        boldTextView3.setVisibility(i);
    }

    /* renamed from: i */
    private final void m186022i() {
        boolean z;
        boolean z2;
        if (this.f118268e.isOwner() || this.f118268e.isEditable()) {
            z = false;
        } else {
            z = true;
        }
        ((PermissionMenu) mo142944a(R.id.menuRead)).mo165185a(z, this.f118266c);
        if (this.f118268e.isOwner() || !this.f118268e.isEditable()) {
            z2 = false;
        } else {
            z2 = true;
        }
        ((PermissionMenu) mo142944a(R.id.menuEdit)).mo165185a(z2, this.f118266c);
        ((PermissionMenu) mo142944a(R.id.menuTransfer)).mo165185a(this.f118268e.isOwner(), this.f118270g);
        ((PermissionMenu) mo142944a(R.id.menuDelete)).mo165185a(false, this.f118266c);
        int i = C46979c.f118276a[this.f118271h.ordinal()];
        if (i == 1) {
            PermissionMenu permissionMenu = (PermissionMenu) mo142944a(R.id.menuEdit);
            Intrinsics.checkExpressionValueIsNotNull(permissionMenu, "menuEdit");
            permissionMenu.setVisibility(8);
            PermissionMenu permissionMenu2 = (PermissionMenu) mo142944a(R.id.menuTransfer);
            Intrinsics.checkExpressionValueIsNotNull(permissionMenu2, "menuTransfer");
            permissionMenu2.setVisibility(8);
            PermissionMenu permissionMenu3 = (PermissionMenu) mo142944a(R.id.menuDelete);
            Intrinsics.checkExpressionValueIsNotNull(permissionMenu3, "menuDelete");
            permissionMenu3.setVisibility(8);
        } else if (i == 2) {
            PermissionMenu permissionMenu4 = (PermissionMenu) mo142944a(R.id.menuTransfer);
            Intrinsics.checkExpressionValueIsNotNull(permissionMenu4, "menuTransfer");
            permissionMenu4.setVisibility(8);
        }
        if (!this.f118268e.isPerson()) {
            PermissionMenu permissionMenu5 = (PermissionMenu) mo142944a(R.id.menuTransfer);
            Intrinsics.checkExpressionValueIsNotNull(permissionMenu5, "menuTransfer");
            permissionMenu5.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "permission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.b$a */
    static final class C46976a extends Lambda implements Function1<SharePermission, Unit> {
        final /* synthetic */ PermissionDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46976a(PermissionDialog bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharePermission sharePermission) {
            invoke(sharePermission);
            return Unit.INSTANCE;
        }

        public final void invoke(final SharePermission sharePermission) {
            Intrinsics.checkParameterIsNotNull(sharePermission, "permission");
            if (!this.this$0.f118269f) {
                C45858j.m181677a((int) R.string.MMWeb_G_RecordingCantTransferOwnership);
                return;
            }
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            String a = new ResString.Editor(R.string.MMWeb_G_SetAsOwnerQuestion).mo165506a("name", this.this$0.f118268e.getUserName()).mo165507a();
            String a2 = new ResString.Editor(R.string.MMWeb_G_SetAsOwnerInfo).mo165506a("name", this.this$0.f118268e.getUserName()).mo165507a();
            if (C47098d.m186535b(requireContext)) {
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(requireContext).title(a)).titleBold(true)).message(a2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.MMWeb_G_Cancel, (DialogInterface.OnClickListener) null)).addActionButton(R.id.ud_dialog_btn_secondary, R.string.MMWeb_G_SetAsOwner, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.lark.mm.module.share.PermissionDialog.C46976a.DialogInterface$OnClickListenerC469771 */

                    /* renamed from: a */
                    final /* synthetic */ C46976a f118273a;

                    {
                        this.f118273a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f118273a.this$0.f118266c.invoke(sharePermission);
                    }
                })).show();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "permission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.b$b */
    static final class C46978b extends Lambda implements Function1<SharePermission, Unit> {
        final /* synthetic */ PermissionDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46978b(PermissionDialog bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharePermission sharePermission) {
            invoke(sharePermission);
            return Unit.INSTANCE;
        }

        public final void invoke(SharePermission sharePermission) {
            Intrinsics.checkParameterIsNotNull(sharePermission, "permission");
            ShareRepo b = ShareRepo.f118326e.mo165209b(this.this$0.f118267d);
            if (b != null) {
                b.mo165193a(this.this$0.f118268e, sharePermission);
            }
            this.this$0.u_();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m186020g();
        m186021h();
        m186022i();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_dialog_share_permission, viewGroup, false);
    }

    public PermissionDialog(String str, User user, boolean z, SharePermission sharePermission) {
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        this.f118267d = str;
        this.f118268e = user;
        this.f118269f = z;
        this.f118271h = sharePermission;
    }
}
