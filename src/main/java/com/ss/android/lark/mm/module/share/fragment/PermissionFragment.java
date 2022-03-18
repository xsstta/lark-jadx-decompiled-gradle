package com.ss.android.lark.mm.module.share.fragment;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.module.share.adapter.UserListAdapter;
import com.ss.android.lark.mm.module.share.invite.MmInviteTitleBar;
import com.ss.android.lark.mm.module.share.model.SharePermission;
import com.ss.android.lark.mm.module.share.model.User;
import com.ss.android.lark.mm.module.share.repo.ShareRepo;
import com.ss.android.lark.mm.utils.ResString;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/share/fragment/PermissionFragment;", "Lcom/ss/android/lark/mm/module/share/fragment/ShareBaseFragment;", "repoId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;", "allowExternalShare", "", "canTransfer", "selfPermission", "Lcom/ss/android/lark/mm/module/share/model/SharePermission;", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "fromSource", "", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/share/fragment/FragmentType;ZZLcom/ss/android/lark/mm/module/share/model/SharePermission;Lcom/ss/android/lark/mm/base/IFragmentManager;I)V", "bindData", "", "collaboratorList", "", "Lcom/ss/android/lark/mm/module/share/model/User;", "init", "initData", "initView", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.share.fragment.b */
public final class PermissionFragment extends ShareBaseFragment {

    /* renamed from: a */
    private HashMap f118291a;

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f118291a == null) {
            this.f118291a = new HashMap();
        }
        View view = (View) this.f118291a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118291a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f118291a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment, com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/share/fragment/PermissionFragment$initData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.b$a */
    public static final class C46990a extends Lambda implements Function0<Unit> {
        final /* synthetic */ ShareRepo $this_apply;
        final /* synthetic */ PermissionFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46990a(ShareRepo shareRepo, PermissionFragment bVar) {
            super(0);
            this.$this_apply = shareRepo;
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164984a(this.$this_apply.mo165199b());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.b$b */
    public static final class C46991b extends Lambda implements Function0<Unit> {
        final /* synthetic */ PermissionFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46991b(PermissionFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.this$0.mo164953j().bj_();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.module.share.MmShareBaseFragment, com.ss.android.lark.mm.module.share.fragment.ShareBaseFragment
    /* renamed from: e */
    public void mo163508e() {
        super.mo163508e();
        m186049g();
        m186050l();
    }

    /* renamed from: l */
    private final void m186050l() {
        ShareRepo b = ShareRepo.f118326e.mo165209b(mo164952i());
        if (b != null) {
            mo161167a().mo237937a(b.mo165190a(ShareRepo.DataSource.ShareInfo, new C46990a(b, this)));
            mo164984a(b.mo165199b());
        }
    }

    /* renamed from: g */
    private final void m186049g() {
        MmInviteTitleBar.m186074a((MmInviteTitleBar) mo161166a(R.id.titleBar), (int) R.drawable.ud_icon_left_outlined, 0, new C46991b(this), 2, (Object) null);
        ((MmInviteTitleBar) mo161166a(R.id.titleBar)).setTitle(new ResString.Editor(R.string.MMWeb_G_CollaboratorsNumber).mo165506a("number", "0").mo165507a());
        MmInviteTitleBar.m186075a((MmInviteTitleBar) mo161166a(R.id.titleBar), (int) R.drawable.ud_icon_member_add_outlined, 0, new C46992c(this), 2, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.share.fragment.b$c */
    public static final class C46992c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ PermissionFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46992c(PermissionFragment bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.this$0.mo164953j().mo161184a(FragmentType.Search);
        }
    }

    /* renamed from: a */
    public final void mo164984a(List<User> list) {
        int i;
        MmInviteTitleBar mmInviteTitleBar = (MmInviteTitleBar) mo161166a(R.id.titleBar);
        ResString.Editor aVar = new ResString.Editor(R.string.MMWeb_G_CollaboratorsNumber);
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        mmInviteTitleBar.setTitle(aVar.mo165506a("number", String.valueOf(i)).mo165507a());
        UserListAdapter.m186015a(mo164991f(), list, null, 2, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionFragment(String str, FragmentType fragmentType, boolean z, boolean z2, SharePermission sharePermission, IFragmentManager bVar, int i) {
        super(str, fragmentType, z, z2, sharePermission, bVar, i);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(fragmentType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(sharePermission, "selfPermission");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
    }
}
