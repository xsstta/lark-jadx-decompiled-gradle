package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.MainViewPager;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.department.DepartmentFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.SelectDepPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult.SearchUserResultFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.KeywordChangeListener;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.TopbarFragment;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\"B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/KeywordChangeListener;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepPresenter$Dependency;", "()V", "depFragment", "Landroidx/fragment/app/Fragment;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepPresenter;", "searchFragment", "initMVP", "", "view", "Landroid/view/View;", "jumpToNextPage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onKeywordChange", "keyword", "", "onViewCreated", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.b */
public final class SelectDepFragment extends C7667e implements KeywordChangeListener, SelectDepPresenter.Dependency {

    /* renamed from: c */
    public static final Companion f26752c = new Companion(null);

    /* renamed from: a */
    public Fragment f26753a;

    /* renamed from: b */
    public Fragment f26754b;

    /* renamed from: d */
    private ArrayList<UserInfo> f26755d = new ArrayList<>();

    /* renamed from: e */
    private InviteMemberParams f26756e = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);

    /* renamed from: f */
    private SelectDepPresenter f26757f;

    /* renamed from: g */
    private HashMap f26758g;

    /* renamed from: b */
    public void mo37666b() {
        HashMap hashMap = this.f26758g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepFragment$Companion;", "", "()V", "EXTRA_ORIGIN_USERS", "", "EXTRA_PARAMS", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37667a(ArrayList<UserInfo> arrayList, InviteMemberParams inviteMemberParams) {
            Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
            Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_origin_user", arrayList);
            bundle.putParcelable("extra_params", inviteMemberParams);
            SelectDepFragment bVar = new SelectDepFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SelectDepPresenter dVar = this.f26757f;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.destroy();
        mo37666b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.dep.SelectDepPresenter.Dependency
    /* renamed from: a */
    public void mo37665a() {
        View view = getView();
        if (view != null && view.requestFocus()) {
            KeyboardUtils.hideKeyboard(getContext(), getView());
        }
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37489n();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
            }
        }
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        PermissionAnalyticV2.m39646b(this.f26756e.mo36834a(), this.f26756e.mo36835b(), this.f26756e.mo36837d(), this.f26756e.mo36843h(), ((ISelectedUserModel) a).getSelected());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/dep/SelectDepFragment$onViewCreated$1", "Landroidx/fragment/app/FragmentPagerAdapter;", "getCount", "", "getItem", "Landroidx/fragment/app/Fragment;", "position", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.a.b$b */
    public static final class C9891b extends FragmentPagerAdapter {

        /* renamed from: a */
        final /* synthetic */ SelectDepFragment f26759a;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i == 0) {
                return SelectDepFragment.m41136a(this.f26759a);
            }
            return SelectDepFragment.m41138b(this.f26759a);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9891b(SelectDepFragment bVar, FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f26759a = bVar;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Fragment m41136a(SelectDepFragment bVar) {
        Fragment fragment = bVar.f26753a;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depFragment");
        }
        return fragment;
    }

    /* renamed from: b */
    public static final /* synthetic */ Fragment m41138b(SelectDepFragment bVar) {
        Fragment fragment = bVar.f26754b;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchFragment");
        }
        return fragment;
    }

    /* renamed from: a */
    private final void m41137a(View view) {
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        SelectDepPresenter dVar = new SelectDepPresenter(new SelectDepModel((ISelectedUserModel) a), new SelectDepView(view), this, requireContext);
        this.f26757f = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        InviteMemberParams inviteMemberParams;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getParcelableArrayList("extra_origin_user");
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f26755d.clear();
            this.f26755d.addAll(arrayList);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (inviteMemberParams = (InviteMemberParams) arguments2.getParcelable("extra_params")) == null) {
            inviteMemberParams = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);
        }
        this.f26756e = inviteMemberParams;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.KeywordChangeListener
    /* renamed from: a */
    public void mo37469a(String str) {
        boolean z;
        boolean z2;
        View view;
        MainViewPager mainViewPager;
        MainViewPager mainViewPager2;
        MainViewPager mainViewPager3;
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        View view2 = getView();
        boolean z3 = false;
        if (view2 == null || (mainViewPager3 = (MainViewPager) view2.findViewById(R.id.permSelectContainer)) == null || mainViewPager3.getCurrentItem() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = str;
        if (str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || z) {
            if (str2.length() > 0) {
                z3 = true;
            }
            if (z3 && z && (view = getView()) != null && (mainViewPager = (MainViewPager) view.findViewById(R.id.permSelectContainer)) != null) {
                mainViewPager.setCurrentItem(1);
            }
        } else {
            View view3 = getView();
            if (!(view3 == null || (mainViewPager2 = (MainViewPager) view3.findViewById(R.id.permSelectContainer)) == null)) {
                mainViewPager2.setCurrentItem(0);
            }
        }
        Fragment fragment = this.f26754b;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchFragment");
        }
        if (fragment instanceof KeywordChangeListener) {
            Fragment fragment2 = this.f26754b;
            if (fragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchFragment");
            }
            if (fragment2 != null) {
                ((KeywordChangeListener) fragment2).mo37469a(str);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.KeywordChangeListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        String string = getString(R.string.Doc_Permission_AddUserSelctDepartmentTitle);
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.Doc_P…UserSelctDepartmentTitle)");
        getChildFragmentManager().beginTransaction().add(R.id.permSelectTopbarContainer, TopbarFragment.f26610a.mo37509a(string, 1, this.f26756e)).commitAllowingStateLoss();
        this.f26753a = DepartmentFragment.f26686a.mo37583a(this.f26755d, this.f26756e);
        this.f26754b = SearchUserResultFragment.f26562a.mo37470a(this.f26755d, 1, this.f26756e);
        MainViewPager mainViewPager = (MainViewPager) view.findViewById(R.id.permSelectContainer);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager, "view.permSelectContainer");
        mainViewPager.setAdapter(new C9891b(this, getChildFragmentManager()));
        MainViewPager mainViewPager2 = (MainViewPager) view.findViewById(R.id.permSelectContainer);
        Intrinsics.checkExpressionValueIsNotNull(mainViewPager2, "view.permSelectContainer");
        mainViewPager2.setCurrentItem(0);
        m41137a(view);
        PermissionAnalyticV2.m39676f(this.f26756e.mo36834a(), this.f26756e.mo36835b(), this.f26756e.mo36837d(), this.f26756e.mo36843h());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_selected_dep_fragment, viewGroup, false);
    }
}
