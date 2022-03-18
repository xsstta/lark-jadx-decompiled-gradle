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
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.InviteMemberParams;
import com.bytedance.ee.bear.middleground.permission.collaborator.invite.newinvite.folder.FolderInviteMemberManagerFragment;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/FolderInviteMemberFragment;", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/BaseInviteMemberFragment;", "()V", "canInviteExternalUser", "", "inviteDepEnable", "isFromSharePanel", "module", "", "originUserInfoList", "Ljava/util/ArrayList;", "Lcom/bytedance/ee/bear/share/export/UserInfo;", "ownerInfo", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "buildInviteParams", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/invite/InviteMemberParams;", "fromSharePanel", "initData", "", "jumpAskOwner", "jumpInviteMemberManage", "jumpNextPage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.e */
public final class FolderInviteMemberFragment extends BaseInviteMemberFragment {

    /* renamed from: d */
    public static final Companion f26726d = new Companion(null);

    /* renamed from: e */
    private FolderPermSetInfo f26727e = new FolderPermSetInfo(0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);

    /* renamed from: f */
    private final ArrayList<UserInfo> f26728f = new ArrayList<>();

    /* renamed from: g */
    private UserInfo f26729g;

    /* renamed from: h */
    private String f26730h;

    /* renamed from: i */
    private boolean f26731i;

    /* renamed from: j */
    private boolean f26732j;

    /* renamed from: k */
    private boolean f26733k = true;

    /* renamed from: l */
    private HashMap f26734l;

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: a */
    public View mo37436a(int i) {
        if (this.f26734l == null) {
            this.f26734l = new HashMap();
        }
        View view = (View) this.f26734l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f26734l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: m */
    public void mo37446m() {
        HashMap hashMap = this.f26734l;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/search/FolderInviteMemberFragment$Companion;", "", "()V", "EXTRA_FOLDER_INFO", "", "EXTRA_FROM_SHARE_PANEL", "EXTRA_SHARE_RESULT", "EXTRA_USERS", "TAG", "showInviteFolderMember", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/FolderPermSetInfo;", "userInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "module", "isFromSharePanel", "", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.search.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo37634a(FragmentActivity fragmentActivity, FolderPermSetInfo folderPermSetInfo, ShareUserInfoResult shareUserInfoResult, String str, boolean z) {
            ShareUserInfoResult shareUserInfoResult2;
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(folderPermSetInfo, "permSetInfo");
            Intrinsics.checkParameterIsNotNull(str, "module");
            Bundle bundle = new Bundle();
            bundle.putParcelable("folder", folderPermSetInfo);
            if (shareUserInfoResult != null) {
                shareUserInfoResult2 = shareUserInfoResult;
            } else {
                shareUserInfoResult2 = new ShareUserInfoResult();
            }
            bundle.putParcelable("share_user_result", shareUserInfoResult2);
            bundle.putString("permission_module", str);
            bundle.putBoolean("from_share_panel", z);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, FolderInviteMemberFragment.class.getName(), bundle);
            if (instantiate != null) {
                ((DialogInterface$OnCancelListenerC1021b) instantiate).mo5511a(fragmentActivity.getSupportFragmentManager(), FolderInviteMemberFragment.class.getName());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.DialogFragment");
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: h */
    public ArrayList<UserInfo> mo37441h() {
        return this.f26728f;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: i */
    public boolean mo37442i() {
        return this.f26732j;
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.newsearch.ISearchUserActDependency
    /* renamed from: n */
    public void mo37489n() {
        m41089q();
    }

    /* renamed from: q */
    private final void m41089q() {
        FolderInviteMemberManagerFragment.Companion aVar = FolderInviteMemberManagerFragment.f26030b;
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        FolderPermSetInfo folderPermSetInfo = this.f26727e;
        String str = this.f26730h;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        mo37437a(aVar.mo36954a(requireContext, folderPermSetInfo, str, this.f26729g, this.f26732j));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment
    /* renamed from: g */
    public InviteMemberParams mo37440g() {
        boolean z = !this.f26727e.mo38883s();
        C13479a.m54764b("FolderInviteMemberFragment", "canReAdd = " + z);
        String c = this.f26727e.mo38864c();
        int b = this.f26727e.mo38863b();
        String d = this.f26727e.mo38865d();
        String str = this.f26730h;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("module");
        }
        return new InviteMemberParams(c, b, d, "", str, this.f26731i, this.f26733k, false, z, this.f26727e.mo38883s(), false, false, 3072, null);
    }

    /* renamed from: p */
    private final void m41088p() {
        boolean z;
        UserInfo userInfo;
        Sequence asSequence;
        Object obj;
        Bundle arguments = getArguments();
        boolean z2 = false;
        if (arguments != null) {
            FolderPermSetInfo folderPermSetInfo = (FolderPermSetInfo) arguments.getParcelable("folder");
            if (folderPermSetInfo == null) {
                folderPermSetInfo = new FolderPermSetInfo(0, null, null, null, null, null, null, null, null, null, null, null, false, 8191, null);
            }
            this.f26727e = folderPermSetInfo;
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("users");
            ArrayList arrayList = parcelableArrayList;
            if (!CollectionUtils.isEmpty(arrayList)) {
                ArrayList<UserInfo> arrayList2 = this.f26728f;
                if (parcelableArrayList == null) {
                    Intrinsics.throwNpe();
                }
                arrayList2.addAll(arrayList);
            }
            String string = arguments.getString("permission_module", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "args.getString(Permissio…RA_PERMISSION_MODULE, \"\")");
            this.f26730h = string;
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
            this.f26729g = userInfo;
            this.f26732j = arguments.getBoolean("from_share_panel", false);
        } else {
            C13479a.m54758a("FolderInviteMemberFragment", "initData()...args == null!");
        }
        mo37438a((InviteMemberViewModel) aj.m5366a(requireActivity()).mo6005a(InviteMemberViewModel.class));
        new C10917c(new C10929e());
        AccountService.Account f = ((an) KoinJavaComponent.m268613a(an.class, null, null, 6, null)).mo16408f();
        if (f == null || !f.mo19681c()) {
            z = false;
        } else {
            z = true;
        }
        this.f26731i = !z;
        if ((this.f26727e.mo38883s() && this.f26727e.mo38876l()) || !this.f26727e.mo38883s()) {
            z2 = true;
        }
        this.f26733k = z2;
        C13479a.m54764b("FolderInviteMemberFragment", "isConsumer:" + z + ", " + "inviteDepEnable=" + this.f26731i + ',' + "isFromSharePanel=" + this.f26732j + ", " + "canInviteExternalUser=" + this.f26733k);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.middleground.permission.collaborator.search.BaseInviteMemberFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m41088p();
    }
}
