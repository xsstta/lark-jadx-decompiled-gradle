package com.bytedance.ee.bear.middleground.permission.collaborator.search;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitablepro.BitableProInviteMemberManagerFragment;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BitableProInviteMemberFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BaseInviteMemberFragment;", "()V", "originUserInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "ownerId", "", "roleId", "token", ShareHitPoint.f121869d, "", "buildInviteParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "fromSharePanel", "", "initData", "", "jumpAskOwner", "jumpInviteMemberManage", "jumpNextPage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b */
public final class BitableProInviteMemberFragment extends BaseInviteMemberFragment {

    /* renamed from: d */
    public static final Companion f26603d = new Companion(null);

    /* renamed from: e */
    private final ArrayList<UserInfo> f26604e = new ArrayList<>();

    /* renamed from: f */
    private String f26605f = "";

    /* renamed from: g */
    private String f26606g = "";

    /* renamed from: h */
    private String f26607h = "";

    /* renamed from: i */
    private final int f26608i;

    /* renamed from: j */
    private HashMap f26609j;

    @JvmStatic
    /* renamed from: a */
    public static final void m40884a(FragmentActivity fragmentActivity, String str, String str2, String str3, ArrayList<UserInfo> arrayList) {
        f26603d.mo37491a(fragmentActivity, str, str2, str3, arrayList);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: a */
    public View mo37436a(int i) {
        if (this.f26609j == null) {
            this.f26609j = new HashMap();
        }
        View view = (View) this.f26609j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26609j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: i */
    public boolean mo37442i() {
        return false;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: m */
    public void mo37446m() {
        HashMap hashMap = this.f26609j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: o */
    public void mo37490o() {
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37446m();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BitableProInviteMemberFragment$Companion;", "", "()V", "EXTRA_OWNER_ID", "", "EXTRA_ROLE_ID", "EXTRA_TOKEN", "EXTRA_USERS", "TAG", "showInviteMember", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "token", "ownerId", "roleId", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo37491a(FragmentActivity fragmentActivity, String str, String str2, String str3, ArrayList<UserInfo> arrayList) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "token");
            Intrinsics.checkParameterIsNotNull(str2, "ownerId");
            Intrinsics.checkParameterIsNotNull(str3, "roleId");
            Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
            Bundle bundle = new Bundle();
            bundle.putString("extra_token", str);
            bundle.putString("extra_owner_id", str2);
            bundle.putString("extra_role_id", str3);
            bundle.putParcelableArrayList("users", arrayList);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, BitableProInviteMemberFragment.class.getName(), bundle);
            if (instantiate != null) {
                ((DialogInterface$OnCancelListenerC1021b) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), BitableProInviteMemberFragment.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: h */
    public ArrayList<UserInfo> mo37441h() {
        return this.f26604e;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: n */
    public void mo37489n() {
        m40886q();
    }

    public BitableProInviteMemberFragment() {
        C8275a aVar = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.BITABLE");
        this.f26608i = aVar.mo32555b();
    }

    /* renamed from: q */
    private final void m40886q() {
        BitableProInviteMemberManagerFragment.Companion aVar = BitableProInviteMemberManagerFragment.f25889a;
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        mo37437a(aVar.mo36866a(requireContext, this.f26605f, this.f26608i, this.f26606g, this.f26607h, this.f26604e));
    }

    /* renamed from: p */
    private final void m40885p() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("users");
            ArrayList arrayList = parcelableArrayList;
            if (!CollectionUtils.isEmpty(arrayList)) {
                ArrayList<UserInfo> arrayList2 = this.f26604e;
                if (parcelableArrayList == null) {
                    Intrinsics.throwNpe();
                }
                arrayList2.addAll(arrayList);
            }
            String string = arguments.getString("extra_token", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "args.getString(EXTRA_TOKEN, \"\")");
            this.f26605f = string;
            String string2 = arguments.getString("extra_role_id", "");
            Intrinsics.checkExpressionValueIsNotNull(string2, "args.getString(EXTRA_ROLE_ID, \"\")");
            this.f26606g = string2;
            String string3 = arguments.getString("extra_owner_id", "");
            Intrinsics.checkExpressionValueIsNotNull(string3, "args.getString(EXTRA_OWNER_ID, \"\")");
            this.f26607h = string3;
        } else {
            C13479a.m54758a("BitableProInviteMemberFragment", "initData()...args == null!");
        }
        mo37438a((InviteMemberViewModel) aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: g */
    public InviteMemberParams mo37440g() {
        boolean z;
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f == null || !f.mo19681c()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        C13479a.m54764b("BitableProInviteMemberFragment", "isConsumer:" + z + " inviteDepEnable=" + z2);
        return new InviteMemberParams(this.f26605f, this.f26608i, this.f26607h, "", "", z2, true, false, false, false, true, false, 2048, null);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40885p();
    }
}
