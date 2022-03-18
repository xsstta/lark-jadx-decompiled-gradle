package com.bytedance.ee.bear.middleground.permission.collaborator.search.searchresult;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.KeywordChangeListener;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/topbar/KeywordChangeListener;", "()V", "from", "", "hasReport", "", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "searchUserPresenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultPresenter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onKeywordChange", "keyword", "", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.b */
public final class SearchUserResultFragment extends C7667e implements KeywordChangeListener {

    /* renamed from: a */
    public static final Companion f26562a = new Companion(null);

    /* renamed from: b */
    private ArrayList<UserInfo> f26563b = new ArrayList<>();

    /* renamed from: c */
    private SearchUserResultPresenter f26564c;

    /* renamed from: d */
    private int f26565d;

    /* renamed from: e */
    private InviteMemberParams f26566e = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);

    /* renamed from: f */
    private boolean f26567f;

    /* renamed from: g */
    private HashMap f26568g;

    /* renamed from: a */
    public void mo37468a() {
        HashMap hashMap = this.f26568g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/searchresult/SearchUserResultFragment$Companion;", "", "()V", "EXTRA_FROM", "", "EXTRA_ORIGIN_USERS", "EXTRA_PARAMS", "FROM_DEP_SEARCH", "", "FROM_MEMBER_SEARCH", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "userInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "from", "params", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo37470a(ArrayList<UserInfo> arrayList, int i, InviteMemberParams inviteMemberParams) {
            Intrinsics.checkParameterIsNotNull(arrayList, "userInfoList");
            Intrinsics.checkParameterIsNotNull(inviteMemberParams, "params");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_origin_users", arrayList);
            bundle.putInt("extra_from", i);
            bundle.putParcelable("extra_params", inviteMemberParams);
            SearchUserResultFragment bVar = new SearchUserResultFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SearchUserResultPresenter dVar = this.f26564c;
        if (dVar != null) {
            dVar.destroy();
        }
        mo37468a();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.topbar.KeywordChangeListener
    /* renamed from: a */
    public void mo37469a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        SearchUserResultPresenter dVar = this.f26564c;
        if (dVar != null) {
            dVar.mo37480a(str);
        }
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f26567f) {
            int i = this.f26565d;
            if (i == 1) {
                PermissionAnalyticV2.m39678g(this.f26566e.mo36834a(), this.f26566e.mo36835b(), this.f26566e.mo36837d(), this.f26566e.mo36843h());
            } else if (i == 0) {
                PermissionAnalyticV2.m39644b(this.f26566e.mo36834a(), this.f26566e.mo36835b(), this.f26566e.mo36837d(), this.f26566e.mo36843h());
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        InviteMemberParams inviteMemberParams;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arrayList = arguments.getParcelableArrayList("extra_origin_users");
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f26563b.clear();
            this.f26563b.addAll(arrayList);
        }
        Bundle arguments2 = getArguments();
        int i = 0;
        if (arguments2 != null) {
            i = arguments2.getInt("extra_from", 0);
        }
        this.f26565d = i;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (inviteMemberParams = (InviteMemberParams) arguments3.getParcelable("extra_params")) == null) {
            inviteMemberParams = new InviteMemberParams(null, 0, null, null, null, false, false, false, false, false, false, false, 4095, null);
        }
        this.f26566e = inviteMemberParams;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        C10917c cVar = new C10917c(new C10929e());
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        Context requireContext2 = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext2, "requireContext()");
        SearchUserResultPresenter dVar = new SearchUserResultPresenter(new SearchUserResultModel(requireContext, cVar, (ISelectedUserModel) a, this.f26566e), new SearchUserResultView(requireContext2, view, cVar, this.f26563b, this.f26566e), this, this.f26566e);
        this.f26564c = dVar;
        if (dVar != null) {
            dVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_search_user_result_fragment, viewGroup, false);
    }
}
