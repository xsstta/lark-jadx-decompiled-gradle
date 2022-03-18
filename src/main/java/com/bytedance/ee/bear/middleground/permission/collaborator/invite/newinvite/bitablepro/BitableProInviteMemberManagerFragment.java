package com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro.BitableProInviteMemberManagerPresenter;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.InviteMemberViewModel;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency;
import com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISelectedUserModel;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter$Dependency;", "()V", "mPresenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerPresenter;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "ownerId", "", "roleId", "token", ShareHitPoint.f121869d, "", "back", "", "finish", "initMVP", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.b */
public final class BitableProInviteMemberManagerFragment extends C7667e implements BitableProInviteMemberManagerPresenter.Dependency {

    /* renamed from: a */
    public static final Companion f25889a = new Companion(null);

    /* renamed from: b */
    private BitableProInviteMemberManagerPresenter f25890b;

    /* renamed from: c */
    private String f25891c = "";

    /* renamed from: d */
    private int f25892d;

    /* renamed from: e */
    private String f25893e;

    /* renamed from: f */
    private ArrayList<UserInfo> f25894f;

    /* renamed from: g */
    private String f25895g;

    /* renamed from: h */
    private HashMap f25896h;

    /* renamed from: c */
    public void mo36865c() {
        HashMap hashMap = this.f25896h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/newinvite/bitablepro/BitableProInviteMemberManagerFragment$Companion;", "", "()V", "EXTRA_OWNER_ID", "", "EXTRA_ROLE_ID", "EXTRA_TOKEN", "EXTRA_TYPE", "EXTRA_USERS", "TAG", "newInstance", "Landroidx/fragment/app/Fragment;", "context", "Landroid/content/Context;", "token", ShareHitPoint.f121869d, "", "roleId", "ownerId", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "Lkotlin/collections/ArrayList;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.invite.a.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Fragment mo36866a(Context context, String str, int i, String str2, String str3, ArrayList<UserInfo> arrayList) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, "roleId");
            Intrinsics.checkParameterIsNotNull(str3, "ownerId");
            Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
            Bundle bundle = new Bundle();
            bundle.putString("extra_token", str);
            bundle.putInt("extra_type", i);
            bundle.putString("extra_owner_id", str3);
            bundle.putSerializable("extra_users", arrayList);
            bundle.putString("extra_role_id", str2);
            Fragment instantiate = Fragment.instantiate(context, BitableProInviteMemberManagerFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(con…t::class.java.name, args)");
            return instantiate;
        }
    }

    public BitableProInviteMemberManagerFragment() {
        C8275a aVar = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.BITABLE");
        this.f25892d = aVar.mo32555b();
        this.f25893e = "";
        this.f25894f = new ArrayList<>();
        this.f25895g = "";
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        BitableProInviteMemberManagerPresenter dVar = this.f25890b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.destroy();
        mo36865c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro.BitableProInviteMemberManagerPresenter.Dependency
    /* renamed from: a */
    public void mo36863a() {
        if (getParentFragment() != null && (getParentFragment() instanceof ISearchUserActDependency)) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                ((ISearchUserActDependency) parentFragment).mo37443j();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro.BitableProInviteMemberManagerPresenter.Dependency
    /* renamed from: b */
    public void mo36864b() {
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
    private final void m39872a(View view) {
        AbstractC1142af a = aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(re…berViewModel::class.java)");
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        BitableProInviteMemberManagerPresenter dVar = new BitableProInviteMemberManagerPresenter(new BitableProInviteMemberManagerModel((ISelectedUserModel) a, this.f25891c, this.f25895g, this.f25894f), new BitableProInviteMemberManagerView(requireContext, view, this.f25892d, this.f25893e), this, this.f25891c);
        this.f25890b = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPresenter");
        }
        dVar.create();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        int i;
        String str2;
        Serializable serializable;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str3 = "";
        if (arguments == null || (str = arguments.getString("extra_token", str3)) == null) {
            str = str3;
        }
        this.f25891c = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            i = arguments2.getInt("extra_type", this.f25892d);
        } else {
            i = this.f25892d;
        }
        this.f25892d = i;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str2 = arguments3.getString("extra_owner_id", str3)) == null) {
            str2 = str3;
        }
        this.f25893e = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            serializable = arguments4.getSerializable("extra_users");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f25894f = (ArrayList) serializable;
            Bundle arguments5 = getArguments();
            if (!(arguments5 == null || (string = arguments5.getString("extra_role_id", str3)) == null)) {
                str3 = string;
            }
            this.f25895g = str3;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.bytedance.ee.bear.share.export.UserInfo> /* = java.util.ArrayList<com.bytedance.ee.bear.share.export.UserInfo> */");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m39872a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_invite_member_manager_layout, viewGroup, false);
    }
}
