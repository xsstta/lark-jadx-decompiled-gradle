package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare.BitableShareInviteMemberManagerPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter$Dependency;", "()V", "fromSharePanel", "", "mPermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "mPresenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerPresenter;", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "back", "", "finish", "initMVP", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.b */
public final class BitableShareInviteMemberManagerFragment extends C7667e implements BitableShareInviteMemberManagerPresenter.Dependency {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f25953a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BitableShareInviteMemberManagerFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    public static final Companion f25954b = new Companion(null);

    /* renamed from: c */
    private BitableSharePermSetInfo f25955c = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);

    /* renamed from: d */
    private final Lazy f25956d = LazyKt.lazy(C9660b.INSTANCE);

    /* renamed from: e */
    private BitableShareInviteMemberManagerPresenter f25957e;

    /* renamed from: f */
    private UserInfo f25958f;

    /* renamed from: g */
    private boolean f25959g;

    /* renamed from: h */
    private HashMap f25960h;

    /* renamed from: d */
    private final C10917c m39946d() {
        Lazy lazy = this.f25956d;
        KProperty kProperty = f25953a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: c */
    public void mo36918c() {
        HashMap hashMap = this.f25960h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitableshare/BitableShareInviteMemberManagerFragment$Companion;", "", "()V", "EXTRA_FROM_SHARE_PANEL", "", "EXTRA_OWNER_INFO", "EXTRA_PERM_SET_INFO", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "fromSharePanel", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo36919a(Context context, BitableSharePermSetInfo bitableSharePermSetInfo, UserInfo userInfo, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "permSetInfo");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", bitableSharePermSetInfo);
            bundle.putBoolean("from_share_panel", z);
            bundle.putParcelable("extra_owner_info", userInfo);
            Fragment instantiate = Fragment.instantiate(context, BitableShareInviteMemberManagerFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…t::class.java.name, args)");
            return instantiate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.b.b$b */
    static final class C9660b extends Lambda implements Function0<C10917c> {
        public static final C9660b INSTANCE = new C9660b();

        C9660b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BitableShareInviteMemberManagerPresenter dVar = this.f25957e;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.destroy();
        mo36918c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare.BitableShareInviteMemberManagerPresenter.Dependency
    /* renamed from: a */
    public void mo36916a() {
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37443j();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare.BitableShareInviteMemberManagerPresenter.Dependency
    /* renamed from: b */
    public void mo36917b() {
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37444k();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    /* renamed from: a */
    private final void m39945a(View view) {
        String str;
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        BitableShareInviteMemberManagerModel cVar = new BitableShareInviteMemberManagerModel((ISelectedUserModel) a, this.f25955c);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        C10917c d = m39946d();
        BitableSharePermSetInfo bitableSharePermSetInfo = this.f25955c;
        UserInfo userInfo = this.f25958f;
        if (userInfo == null || (str = userInfo.getTenantId()) == null) {
            str = "";
        }
        BitableShareInviteMemberManagerPresenter dVar = new BitableShareInviteMemberManagerPresenter(cVar, new BitableShareInviteMemberManagerView(requireContext, d, view, bitableSharePermSetInfo, str), this, this.f25955c, this.f25959g);
        this.f25957e = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        BitableSharePermSetInfo bitableSharePermSetInfo;
        UserInfo userInfo;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (bitableSharePermSetInfo = (BitableSharePermSetInfo) arguments.getParcelable("extra_perm_set_info")) == null) {
            bitableSharePermSetInfo = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);
        }
        this.f25955c = bitableSharePermSetInfo;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            userInfo = (UserInfo) arguments2.getParcelable("extra_owner_info");
        } else {
            userInfo = null;
        }
        this.f25958f = userInfo;
        Bundle arguments3 = getArguments();
        boolean z = false;
        if (arguments3 != null) {
            z = arguments3.getBoolean("from_share_panel", false);
        }
        this.f25959g = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m39945a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_invite_member_manager_layout, viewGroup, false);
    }
}
