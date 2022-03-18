package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder.FolderInviteMemberManagerPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter$Dependency;", "()V", "fromSharePanel", "", "module", "", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerPresenter;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "back", "", "finish", "initFolderMVP", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.a */
public final class FolderInviteMemberManagerFragment extends C7667e implements FolderInviteMemberManagerPresenter.Dependency {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f26029a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(FolderInviteMemberManagerFragment.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};

    /* renamed from: b */
    public static final Companion f26030b = new Companion(null);

    /* renamed from: c */
    private FolderPermSetInfo f26031c = new FolderPermSetInfo(0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);

    /* renamed from: d */
    private final Lazy f26032d = LazyKt.lazy(C9675b.INSTANCE);

    /* renamed from: e */
    private FolderInviteMemberManagerPresenter f26033e;

    /* renamed from: f */
    private String f26034f;

    /* renamed from: g */
    private UserInfo f26035g;

    /* renamed from: h */
    private boolean f26036h;

    /* renamed from: i */
    private HashMap f26037i;

    /* renamed from: d */
    private final C10917c m40053d() {
        Lazy lazy = this.f26032d;
        KProperty kProperty = f26029a[0];
        return (C10917c) lazy.getValue();
    }

    /* renamed from: c */
    public void mo36953c() {
        HashMap hashMap = this.f26037i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/folder/FolderInviteMemberManagerFragment$Companion;", "", "()V", "EXTRA_FROM_SHARE_PANEL", "", "EXTRA_MODULE", "EXTRA_OWNER_INFO", "EXTRA_PERM_SET_INFO", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "module", "ownerInfo", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "fromSharePanel", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo36954a(Context context, FolderPermSetInfo folderPermSetInfo, String str, UserInfo userInfo, boolean z) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_set_info", folderPermSetInfo);
            bundle.putString("extra_module", str);
            bundle.putBoolean("from_share_panel", z);
            bundle.putParcelable("extra_owner_info", userInfo);
            Fragment instantiate = Fragment.instantiate(context, FolderInviteMemberManagerFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…t::class.java.name, args)");
            return instantiate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.d.a$b */
    static final class C9675b extends Lambda implements Function0<C10917c> {
        public static final C9675b INSTANCE = new C9675b();

        C9675b() {
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
        FolderInviteMemberManagerPresenter cVar = this.f26033e;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        cVar.destroy();
        mo36953c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder.FolderInviteMemberManagerPresenter.Dependency
    /* renamed from: a */
    public void mo36951a() {
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37443j();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder.FolderInviteMemberManagerPresenter.Dependency
    /* renamed from: b */
    public void mo36952b() {
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
    private final void m40052a(View view) {
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        FolderInviteMemberManagerModel bVar = new FolderInviteMemberManagerModel(m40053d(), (ISelectedUserModel) a, this.f26031c);
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        FolderInviteMemberManagerView dVar = new FolderInviteMemberManagerView(requireContext, m40053d(), view, this.f26031c);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        C10917c d = m40053d();
        FolderInviteMemberManagerFragment aVar = this;
        FolderPermSetInfo folderPermSetInfo = this.f26031c;
        String str = this.f26034f;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        FolderInviteMemberManagerPresenter cVar = new FolderInviteMemberManagerPresenter(requireActivity, d, bVar, dVar, aVar, folderPermSetInfo, str, this.f26035g, this.f26036h);
        this.f26033e = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        cVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        FolderPermSetInfo folderPermSetInfo;
        UserInfo userInfo;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (folderPermSetInfo = (FolderPermSetInfo) arguments.getParcelable("extra_perm_set_info")) == null) {
            folderPermSetInfo = new FolderPermSetInfo(0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);
        }
        this.f26031c = folderPermSetInfo;
        Bundle arguments2 = getArguments();
        String str = "";
        if (!(arguments2 == null || (string = arguments2.getString("extra_module", str)) == null)) {
            str = string;
        }
        this.f26034f = str;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            userInfo = (UserInfo) arguments3.getParcelable("extra_owner_info");
        } else {
            userInfo = null;
        }
        this.f26035g = userInfo;
        Bundle arguments4 = getArguments();
        boolean z = false;
        if (arguments4 != null) {
            z = arguments4.getBoolean("from_share_panel", false);
        }
        this.f26036h = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m40052a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_invite_member_manager_layout, viewGroup, false);
    }
}
