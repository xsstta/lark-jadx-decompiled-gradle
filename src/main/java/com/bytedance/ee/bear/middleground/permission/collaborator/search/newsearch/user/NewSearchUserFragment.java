package com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.NewSearchUserPresenter;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0010H\u0016J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/KeywordChangeListener;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter$Dependency;", "()V", "inviteMemberParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserPresenter;", "searchUserResultFragment", "Landroidx/fragment/app/Fragment;", "hideKeyboard", "", "initMVP", "view", "Landroid/view/View;", "jumpToNextPage", "jumpToSelectedDep", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onKeywordChange", "keyword", "", "onViewCreated", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.b */
public final class NewSearchUserFragment extends C7667e implements KeywordChangeListener, NewSearchUserPresenter.Dependency {

    /* renamed from: a */
    public static final Companion f26768a = new Companion(null);

    /* renamed from: b */
    private ArrayList<UserInfo> f26769b = new ArrayList<>();

    /* renamed from: c */
    private NewSearchUserPresenter f26770c;

    /* renamed from: d */
    private Fragment f26771d;

    /* renamed from: e */
    private InviteMemberParams f26772e = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);

    /* renamed from: f */
    private HashMap f26773f;

    /* renamed from: c */
    public void mo37683c() {
        HashMap hashMap = this.f26773f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/newsearch/user/NewSearchUserFragment$Companion;", "", "()V", "EXTRA_ORIGIN_USERS", "", "EXTRA_PARAMS", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "inviteMemberParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37684a(ArrayList<UserInfo> arrayList, InviteMemberParams inviteMemberParams) {
            Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
            Intrinsics.checkParameterIsNotNull(inviteMemberParams, "inviteMemberParams");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_origin_user", arrayList);
            bundle.putParcelable("extra_params", inviteMemberParams);
            NewSearchUserFragment bVar = new NewSearchUserFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: d */
    private final void m41169d() {
        View view = getView();
        if (view != null && view.requestFocus()) {
            KeyboardUtils.hideKeyboard(getContext(), getView());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        NewSearchUserPresenter dVar = this.f26770c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.destroy();
        mo37683c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.NewSearchUserPresenter.Dependency
    /* renamed from: b */
    public void mo37682b() {
        m41169d();
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
        PermissionAnalyticV2.m39616a(this.f26772e.mo36834a(), this.f26772e.mo36835b(), this.f26772e.mo36837d(), this.f26772e.mo36843h(), ((ISelectedUserModel) a).getSelected());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.user.NewSearchUserPresenter.Dependency
    /* renamed from: a */
    public void mo37681a() {
        m41169d();
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37445l();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
            }
        }
        PermissionAnalyticV2.m39672e(this.f26772e.mo36834a(), this.f26772e.mo36835b(), this.f26772e.mo36837d(), this.f26772e.mo36843h());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.KeywordChangeListener
    /* renamed from: a */
    public void mo37469a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        Fragment fragment = this.f26771d;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserResultFragment");
        }
        if (fragment instanceof KeywordChangeListener) {
            Fragment fragment2 = this.f26771d;
            if (fragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchUserResultFragment");
            }
            if (fragment2 != null) {
                ((KeywordChangeListener) fragment2).mo37469a(str);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.KeywordChangeListener");
            }
        }
        NewSearchUserPresenter dVar = this.f26770c;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        dVar.mo37686a(str);
    }

    /* renamed from: a */
    private final void m41168a(View view) {
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        NewSearchUserPresenter dVar = new NewSearchUserPresenter(new NewSearchUserModel((ISelectedUserModel) a), new NewSearchUserView(view, this.f26772e.mo36841f()), this, requireActivity);
        this.f26770c = dVar;
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
            this.f26769b.clear();
            this.f26769b.addAll(arrayList);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (inviteMemberParams = (InviteMemberParams) arguments2.getParcelable("extra_params")) == null) {
            inviteMemberParams = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);
        }
        this.f26772e = inviteMemberParams;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (Intrinsics.areEqual(this.f26772e.mo36839e(), "template")) {
            str = getString(R.string.Doc_List_ShareTemplTitle);
        } else {
            int b = this.f26772e.mo36835b();
            C8275a aVar = C8275a.f22380m;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.BITABLE_FORM");
            if (b == aVar.mo32555b()) {
                str = getString(R.string.Bitable_Form_AddCollaborator);
            } else {
                str = getString(R.string.Doc_Share_InviteCollaborator);
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "if (inviteMemberParams.m…teCollaborator)\n        }");
        getChildFragmentManager().beginTransaction().add(R.id.permSearchUserTopbarContainer, TopbarFragment.f26610a.mo37509a(str, 0, this.f26772e)).commitAllowingStateLoss();
        this.f26771d = SearchUserResultFragment.f26562a.mo37470a(this.f26769b, 0, this.f26772e);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        Fragment fragment = this.f26771d;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchUserResultFragment");
        }
        beginTransaction.add(R.id.permSearchUserResultContainer, fragment).commitAllowingStateLoss();
        m41168a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_new_search_user_fragment, viewGroup, false);
    }
}
