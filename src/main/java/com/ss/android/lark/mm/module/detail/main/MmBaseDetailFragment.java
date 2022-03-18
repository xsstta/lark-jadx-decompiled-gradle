package com.ss.android.lark.mm.module.detail.main;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.mm.base.BaseFragment;
import com.ss.android.lark.mm.module.detail.C45950b;
import com.ss.android.lark.mm.module.detail.MmDetailActivity;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/main/MmBaseDetailFragment;", "Lcom/ss/android/lark/mm/base/BaseFragment;", "()V", "getApiHost", "", "getControlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "getToken", "getUrl", "getViewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.main.d */
public class MmBaseDetailFragment extends BaseFragment {

    /* renamed from: a */
    private HashMap f116119a;

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116119a == null) {
            this.f116119a = new HashMap();
        }
        View view = (View) this.f116119a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116119a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116119a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    /* renamed from: d */
    public final MmControlRegister mo161908d() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MmDetailActivity)) {
            activity = null;
        }
        MmDetailActivity mmDetailActivity = (MmDetailActivity) activity;
        if (mmDetailActivity != null) {
            return mmDetailActivity.mo161326i();
        }
        return null;
    }

    /* renamed from: f */
    public final MmViewControlRegister mo161909f() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MmDetailActivity)) {
            activity = null;
        }
        MmDetailActivity mmDetailActivity = (MmDetailActivity) activity;
        if (mmDetailActivity != null) {
            return mmDetailActivity.mo161325h();
        }
        return null;
    }

    /* renamed from: g */
    public final String mo161910g() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        return C45950b.m182104a(requireActivity).mo161315a();
    }

    /* renamed from: h */
    public final String mo161911h() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        return C45950b.m182104a(requireActivity).bc_();
    }
}
