package com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.TopbarPresenter;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter$IDependency;", "()V", "from", "", "inviteMemberParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "presenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarPresenter;", "title", "", "onBack", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.c */
public final class TopbarFragment extends C7667e implements TopbarPresenter.IDependency {

    /* renamed from: a */
    public static final Companion f26610a = new Companion(null);

    /* renamed from: b */
    private TopbarPresenter f26611b;

    /* renamed from: c */
    private String f26612c = "";

    /* renamed from: d */
    private int f26613d;

    /* renamed from: e */
    private InviteMemberParams f26614e = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);

    /* renamed from: f */
    private HashMap f26615f;

    /* renamed from: b */
    public void mo37508b() {
        HashMap hashMap = this.f26615f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/TopbarFragment$Companion;", "", "()V", "EXTRA_FROM", "", "EXTRA_PARAMS", "EXTRA_TITLE", "FROM_DEP_SEARCH", "", "FROM_MEMBER_SEARCH", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "title", "from", "inviteMemberParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37509a(String str, int i, InviteMemberParams inviteMemberParams) {
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(inviteMemberParams, "inviteMemberParams");
            Bundle bundle = new Bundle();
            bundle.putString("extra_title", str);
            bundle.putParcelable("extra_params", inviteMemberParams);
            bundle.putInt("extra_from", i);
            TopbarFragment cVar = new TopbarFragment();
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        TopbarPresenter eVar = this.f26611b;
        if (eVar != null) {
            eVar.destroy();
        }
        mo37508b();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.TopbarPresenter.IDependency
    /* renamed from: a */
    public void mo37507a() {
        if (getParentFragment() != null) {
            Fragment requireParentFragment = requireParentFragment();
            Intrinsics.checkExpressionValueIsNotNull(requireParentFragment, "requireParentFragment()");
            if (requireParentFragment.getParentFragment() != null) {
                Fragment requireParentFragment2 = requireParentFragment();
                Intrinsics.checkExpressionValueIsNotNull(requireParentFragment2, "requireParentFragment()");
                if (requireParentFragment2.getParentFragment() instanceof ISearchUserActDependency) {
                    Fragment requireParentFragment3 = requireParentFragment();
                    Intrinsics.checkExpressionValueIsNotNull(requireParentFragment3, "requireParentFragment()");
                    Fragment parentFragment = requireParentFragment3.getParentFragment();
                    if (parentFragment != null) {
                        ((ISearchUserActDependency) parentFragment).mo37443j();
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        InviteMemberParams inviteMemberParams;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("extra_title")) == null) {
            str = getString(R.string.Doc_Share_InviteCollaborator);
            Intrinsics.checkExpressionValueIsNotNull(str, "getString(\n             …Share_InviteCollaborator)");
        }
        this.f26612c = str;
        Bundle arguments2 = getArguments();
        int i = 0;
        if (arguments2 != null) {
            i = arguments2.getInt("extra_from", 0);
        }
        this.f26613d = i;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (inviteMemberParams = (InviteMemberParams) arguments3.getParcelable("extra_params")) == null) {
            inviteMemberParams = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);
        }
        this.f26614e = inviteMemberParams;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        Fragment parentFragment = getParentFragment();
        KeywordChangeListener bVar = null;
        if (parentFragment == null || !(parentFragment instanceof KeywordChangeListener)) {
            C13479a.m54758a("TopbarFragment", "keywordChangeListener is null");
        } else {
            bVar = (KeywordChangeListener) parentFragment;
        }
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        TopbarModel dVar = new TopbarModel((ISelectedUserModel) a);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        FragmentActivity fragmentActivity = requireActivity;
        String str = this.f26612c;
        boolean f = this.f26614e.mo36841f();
        int i = this.f26613d;
        boolean z2 = true;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 0) {
            z2 = false;
        }
        TopbarPresenter eVar = new TopbarPresenter(dVar, new TopbarView(fragmentActivity, view, str, f, z, z2), this, bVar, this.f26614e, this.f26613d);
        this.f26611b = eVar;
        eVar.create();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_search_user_top_bar, viewGroup, false);
    }
}
