package com.bytedance.ee.bear.middleground.permission.setting.linkshare.form;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "mBitableSharePermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "mPresenter", "Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingPresenter;", "initMVP", "", "rootView", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.a */
public final class BitableShareLinkShareSettingFragment extends C7667e {

    /* renamed from: a */
    public static final Companion f27069a = new Companion(null);

    /* renamed from: b */
    private BitableSharePermSetInfo f27070b = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);

    /* renamed from: c */
    private BitableShareLinkShareSettingPresenter f27071c;

    /* renamed from: d */
    private HashMap f27072d;

    @JvmStatic
    /* renamed from: a */
    public static final Fragment m41685a(FragmentActivity fragmentActivity, BitableSharePermSetInfo bitableSharePermSetInfo) {
        return f27069a.mo38309a(fragmentActivity, bitableSharePermSetInfo);
    }

    /* renamed from: a */
    public void mo38308a() {
        HashMap hashMap = this.f27072d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo38308a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/linkshare/form/BitableShareLinkShareSettingFragment$Companion;", "", "()V", "EXTRA_INFO", "", "TAG", "instantiate", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "bitableSharePermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/BitableSharePermSetInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Fragment mo38309a(FragmentActivity fragmentActivity, BitableSharePermSetInfo bitableSharePermSetInfo) {
            Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
            Intrinsics.checkParameterIsNotNull(bitableSharePermSetInfo, "bitableSharePermSetInfo");
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_info", bitableSharePermSetInfo);
            Fragment instantiate = Fragment.instantiate(fragmentActivity, BitableShareLinkShareSettingFragment.class.getName(), bundle);
            Intrinsics.checkExpressionValueIsNotNull(instantiate, "Fragment.instantiate(act…                    args)");
            return instantiate;
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        BitableShareLinkShareSettingPresenter cVar = this.f27071c;
        if (cVar != null) {
            cVar.destroy();
        }
    }

    /* renamed from: a */
    private final void m41686a(View view) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "requireActivity()");
        BitableShareLinkShareSettingPresenter cVar = new BitableShareLinkShareSettingPresenter(requireActivity2, new BitableShareLinkShareSettingModel(this.f27070b), new BitableShareLinkShareSettingView(requireActivity, view, this.f27070b), this.f27070b);
        this.f27071c = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            BitableSharePermSetInfo bitableSharePermSetInfo = (BitableSharePermSetInfo) arguments.getParcelable("extra_info");
            if (bitableSharePermSetInfo == null) {
                bitableSharePermSetInfo = new BitableSharePermSetInfo(null, 0, null, null, null, 31, null);
            }
            this.f27070b = bitableSharePermSetInfo;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m41686a(view);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.link_share_set_view, viewGroup, false);
    }
}
