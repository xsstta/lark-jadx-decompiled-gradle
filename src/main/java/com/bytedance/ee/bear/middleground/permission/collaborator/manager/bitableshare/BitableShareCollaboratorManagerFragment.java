package com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "info", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "mPresenter", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerPresenter;", "shareUserInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "root", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.b */
public final class BitableShareCollaboratorManagerFragment extends C7667e {

    /* renamed from: a */
    public static final Companion f26272a = new Companion(null);

    /* renamed from: b */
    private BitableSharePermSetInfo f26273b = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);

    /* renamed from: c */
    private ShareUserInfoResult f26274c = new ShareUserInfoResult();

    /* renamed from: d */
    private BitableShareCollaboratorManagerPresenter f26275d;

    /* renamed from: e */
    private HashMap f26276e;

    @JvmStatic
    /* renamed from: a */
    public static final Fragment m40300a(FragmentActivity fragmentActivity, BitableSharePermSetInfo bitableSharePermSetInfo, ShareUserInfoResult shareUserInfoResult) {
        return f26272a.mo37154a(fragmentActivity, bitableSharePermSetInfo, shareUserInfoResult);
    }

    /* renamed from: a */
    public void mo37153a() {
        HashMap hashMap = this.f26276e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo37153a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/collaborator/manager/bitableshare/BitableShareCollaboratorManagerFragment$Companion;", "", "()V", "EXTRA_PERM_INFO", "", "EXTRA_USER_INFO_RESULT", "getInstance", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "bitableSharePermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "shareUserInfoResult", "Lcom/bytedance/ee/bear/middleground/permission/collaborator/ShareUserInfoResult;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Fragment mo37154a(FragmentActivity fragmentActivity, BitableSharePermSetInfo bitableSharePermSetInfo, ShareUserInfoResult shareUserInfoResult) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "bitableSharePermSetInfo");
            Intrinsics.checkParameterIsNotNull(shareUserInfoResult, "shareUserInfoResult");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_perm_info", bitableSharePermSetInfo);
            bundle.putParcelable("extra_user_info_result", shareUserInfoResult);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, BitableShareCollaboratorManagerFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(act…                    args)");
            return instantiate;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        BitableShareCollaboratorManagerPresenter dVar = this.f26275d;
        if (dVar != null) {
            dVar.destroy();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            BitableSharePermSetInfo bitableSharePermSetInfo = (BitableSharePermSetInfo) arguments.getParcelable("extra_perm_info");
            if (bitableSharePermSetInfo == null) {
                bitableSharePermSetInfo = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);
            }
            this.f26273b = bitableSharePermSetInfo;
            ShareUserInfoResult shareUserInfoResult = (ShareUserInfoResult) arguments.getParcelable("extra_user_info_result");
            if (shareUserInfoResult == null) {
                shareUserInfoResult = new ShareUserInfoResult();
            }
            this.f26274c = shareUserInfoResult;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "root");
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        BitableShareCollaboratorManagerPresenter dVar = new BitableShareCollaboratorManagerPresenter(requireActivity, this, new BitableShareCollaboratorManagerModel(this.f26273b), new BitableShareCollaboratorManagerView(view), this.f26273b, this.f26274c);
        this.f26275d = dVar;
        if (dVar != null) {
            dVar.create();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.permission_fragment_collaborator_manage, viewGroup, false);
    }
}
