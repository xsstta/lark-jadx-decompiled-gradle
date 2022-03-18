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
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.bitableshare.BitableShareInviteMemberManagerFragment;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u0012\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BitableShareInviteMemberFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BaseInviteMemberFragment;", "()V", "canInviteExternalUser", "", "inviteDepEnable", "isFromSharePanel", "mPermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "originUserInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "ownerInfo", "buildInviteParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "fromSharePanel", "initData", "", "jumpAskOwner", "jumpInviteMemberManage", "jumpNextPage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.c */
public final class BitableShareInviteMemberFragment extends BaseInviteMemberFragment {

    /* renamed from: d */
    public static final Companion f26642d = new Companion(null);

    /* renamed from: e */
    private BitableSharePermSetInfo f26643e = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);

    /* renamed from: f */
    private final ArrayList<UserInfo> f26644f = new ArrayList<>();

    /* renamed from: g */
    private UserInfo f26645g;

    /* renamed from: h */
    private boolean f26646h;

    /* renamed from: i */
    private boolean f26647i;

    /* renamed from: j */
    private boolean f26648j = true;

    /* renamed from: k */
    private HashMap f26649k;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: a */
    public View mo37436a(int i) {
        if (this.f26649k == null) {
            this.f26649k = new HashMap();
        }
        View view = (View) this.f26649k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26649k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: m */
    public void mo37446m() {
        HashMap hashMap = this.f26649k;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BitableShareInviteMemberFragment$Companion;", "", "()V", "CAN_INVITE_EXTERNAL_USER", "", "EXTRA_DOC_INFO", "EXTRA_FROM_SHARE_PANEL", "EXTRA_USERS", "TAG", "showInviteMember", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "isFromSharePanel", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo37521a(FragmentActivity fragmentActivity, BitableSharePermSetInfo bitableSharePermSetInfo, ArrayList<UserInfo> arrayList, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "permSetInfo");
            Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
            Bundle bundle = new Bundle();
            bundle.putParcelable("doc", bitableSharePermSetInfo);
            bundle.putParcelableArrayList("users", arrayList);
            bundle.putBoolean("from_share_panel", z);
            bundle.putBoolean("can_invite_external_user", true);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, BitableShareInviteMemberFragment.class.getName(), bundle);
            if (instantiate != null) {
                ((DialogInterface$OnCancelListenerC1021b) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), BitableShareInviteMemberFragment.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: h */
    public ArrayList<UserInfo> mo37441h() {
        return this.f26644f;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: i */
    public boolean mo37442i() {
        return this.f26647i;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: n */
    public void mo37489n() {
        m40940q();
    }

    /* renamed from: q */
    private final void m40940q() {
        BitableShareInviteMemberManagerFragment.Companion aVar = BitableShareInviteMemberManagerFragment.f25954b;
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        mo37437a(aVar.mo36919a(requireContext, this.f26643e, this.f26645g, this.f26647i));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: g */
    public InviteMemberParams mo37440g() {
        String str;
        C13479a.m54764b("BitableShareInviteMemberFragment", "canReAdd = " + false);
        String d = this.f26643e.mo38783d();
        int c = this.f26643e.mo38782c();
        UserInfo userInfo = this.f26645g;
        if (userInfo == null || (str = userInfo.getId()) == null) {
            str = "";
        }
        return new InviteMemberParams(d, c, str, "", "", this.f26646h, this.f26648j, false, false, false, false, false, 3072, null);
    }

    /* renamed from: p */
    private final void m40939p() {
        UserInfo userInfo;
        Sequence asSequence;
        Object obj;
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            BitableSharePermSetInfo bitableSharePermSetInfo = (BitableSharePermSetInfo) arguments.getParcelable("doc");
            if (bitableSharePermSetInfo == null) {
                bitableSharePermSetInfo = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);
            }
            this.f26643e = bitableSharePermSetInfo;
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("users");
            ArrayList arrayList = parcelableArrayList;
            if (!CollectionUtils.isEmpty(arrayList)) {
                ArrayList<UserInfo> arrayList2 = this.f26644f;
                if (parcelableArrayList == null) {
                    Intrinsics.throwNpe();
                }
                arrayList2.addAll(arrayList);
            }
            if (parcelableArrayList == null || (asSequence = CollectionsKt.asSequence(parcelableArrayList)) == null) {
                userInfo = null;
            } else {
                Iterator a = asSequence.mo4717a();
                while (true) {
                    if (!a.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = a.next();
                    if (((UserInfo) obj).isOwner()) {
                        break;
                    }
                }
                userInfo = (UserInfo) obj;
            }
            this.f26645g = userInfo;
            this.f26647i = arguments.getBoolean("from_share_panel", false);
            this.f26648j = arguments.getBoolean("can_invite_external_user", true);
        } else {
            C13479a.m54758a("BitableShareInviteMemberFragment", "initData()...args == null!");
        }
        mo37438a((InviteMemberViewModel) aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class));
        new C10917c(new C10929e());
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f != null && f.mo19681c()) {
            z = true;
        }
        this.f26646h = !z;
        C13479a.m54764b("BitableShareInviteMemberFragment", "isConsumer:" + z + ", type=" + this.f26643e.mo38782c() + ", " + "inviteDepEnable=" + this.f26646h + ',' + "isFromSharePanel=" + this.f26647i + ", canInviteExternalUser=" + this.f26648j);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40939p();
    }
}
