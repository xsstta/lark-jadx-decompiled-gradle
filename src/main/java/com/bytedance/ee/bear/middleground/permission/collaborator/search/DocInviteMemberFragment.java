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
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.askowner.InviteMemberAskOwnerFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.doc.DocInviteMemberManagerFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.sendlink.InviteMemberSendLinkFragment;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.bytedance.ee.log.C13479a;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/DocInviteMemberFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BaseInviteMemberFragment;", "()V", "canInviteExternalUser", "", "inviteDepEnable", "isFromSharePanel", "module", "", "originUserInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "ownerInfo", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "buildInviteParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "fromSharePanel", "initData", "", "jumpAskOwner", "jumpInviteMemberManage", "jumpNextPage", "jumpSendLink", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.d */
public final class DocInviteMemberFragment extends BaseInviteMemberFragment {

    /* renamed from: d */
    public static final Companion f26650d = new Companion(null);

    /* renamed from: e */
    private DocPermSetInfo f26651e = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);

    /* renamed from: f */
    private final ArrayList<UserInfo> f26652f = new ArrayList<>();

    /* renamed from: g */
    private UserInfo f26653g;

    /* renamed from: h */
    private String f26654h;

    /* renamed from: i */
    private boolean f26655i;

    /* renamed from: j */
    private boolean f26656j;

    /* renamed from: k */
    private boolean f26657k = true;

    /* renamed from: l */
    private HashMap f26658l;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: a */
    public View mo37436a(int i) {
        if (this.f26658l == null) {
            this.f26658l = new HashMap();
        }
        View view = (View) this.f26658l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26658l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: m */
    public void mo37446m() {
        HashMap hashMap = this.f26658l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37446m();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/DocInviteMemberFragment$Companion;", "", "()V", "CAN_INVITE_EXTERNAL_USER", "", "EXTRA_DOC_INFO", "EXTRA_FROM_SHARE_PANEL", "EXTRA_USERS", "TAG", "showInviteDocumentMember", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "originUsers", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "module", "isFromSharePanel", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo37522a(FragmentActivity fragmentActivity, DocPermSetInfo docPermSetInfo, ArrayList<UserInfo> arrayList, String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            Intrinsics.checkParameterIsNotNull(arrayList, "originUsers");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Bundle bundle = new Bundle();
            bundle.putParcelable("doc", docPermSetInfo);
            bundle.putParcelableArrayList("users", arrayList);
            bundle.putString("permission_module", str);
            bundle.putBoolean("from_share_panel", z);
            boolean z2 = false;
            if (!docPermSetInfo.mo38844q() ? !((!docPermSetInfo.mo38816Y() || !docPermSetInfo.mo38794C()) && docPermSetInfo.mo38816Y()) : !(docPermSetInfo.ab() && (!docPermSetInfo.ab() || !PermFGUtils.m39534c() || !docPermSetInfo.mo38794C()))) {
                z2 = true;
            }
            bundle.putBoolean("can_invite_external_user", z2);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, DocInviteMemberFragment.class.getName(), bundle);
            if (instantiate != null) {
                ((DialogInterface$OnCancelListenerC1021b) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), DocInviteMemberFragment.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: h */
    public ArrayList<UserInfo> mo37441h() {
        return this.f26652f;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: i */
    public boolean mo37442i() {
        return this.f26656j;
    }

    /* renamed from: r */
    private final void m40951r() {
        InviteMemberSendLinkFragment.Companion aVar = InviteMemberSendLinkFragment.f26211b;
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        DocPermSetInfo docPermSetInfo = this.f26651e;
        String str = this.f26654h;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        mo37437a(aVar.mo37124a(requireContext, docPermSetInfo, str));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: n */
    public void mo37489n() {
        if (this.f26651e.mo38796E()) {
            m40950q();
        } else if (this.f26651e.mo38837j().isLinkShareClose()) {
            mo37490o();
        } else {
            m40951r();
        }
    }

    /* renamed from: q */
    private final void m40950q() {
        DocInviteMemberManagerFragment.Companion aVar = DocInviteMemberManagerFragment.f25983b;
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        DocPermSetInfo docPermSetInfo = this.f26651e;
        String str = this.f26654h;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        mo37437a(aVar.mo36931a(requireContext, docPermSetInfo, str, this.f26653g, this.f26656j));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: o */
    public void mo37490o() {
        InviteMemberAskOwnerFragment.Companion aVar = InviteMemberAskOwnerFragment.f26143b;
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        DocPermSetInfo docPermSetInfo = this.f26651e;
        UserInfo userInfo = this.f26653g;
        String str = this.f26654h;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        mo37437a(aVar.mo37027a(requireContext, docPermSetInfo, userInfo, str, "send_link"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams mo37440g() {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.permission.collaborator.search.DocInviteMemberFragment.mo37440g():com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams");
    }

    /* renamed from: p */
    private final void m40949p() {
        boolean z;
        UserInfo userInfo;
        Sequence asSequence;
        Object obj;
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments != null) {
            DocPermSetInfo docPermSetInfo = (DocPermSetInfo) arguments.getParcelable("doc");
            if (docPermSetInfo == null) {
                docPermSetInfo = new DocPermSetInfo(null, 0, null, false, null, null, null, false, false, false, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
            }
            this.f26651e = docPermSetInfo;
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("users");
            ArrayList arrayList = parcelableArrayList;
            if (!CollectionUtils.isEmpty(arrayList)) {
                ArrayList<UserInfo> arrayList2 = this.f26652f;
                if (parcelableArrayList == null) {
                    Intrinsics.throwNpe();
                }
                arrayList2.addAll(arrayList);
            }
            String string = arguments.getString("permission_module", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "args.getString(Permissio…RA_PERMISSION_MODULE, \"\")");
            this.f26654h = string;
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
            this.f26653g = userInfo;
            this.f26656j = arguments.getBoolean("from_share_panel", false);
            this.f26657k = arguments.getBoolean("can_invite_external_user", true);
        } else {
            C13479a.m54758a("InviteMemberFragment", "initData()...args == null!");
        }
        mo37438a((InviteMemberViewModel) aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class));
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f == null || !f.mo19681c()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String str = this.f26654h;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("module");
            }
            if (!Intrinsics.areEqual(str, "template")) {
                z2 = true;
            }
        }
        this.f26655i = z2;
        C13479a.m54764b("InviteMemberFragment", "isConsumer:" + z + ", type=" + this.f26651e.mo38825b() + ", " + "inviteDepEnable=" + this.f26655i + ',' + "isFromSharePanel=" + this.f26656j + ", canInviteExternalUser=" + this.f26657k);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40949p();
    }
}
