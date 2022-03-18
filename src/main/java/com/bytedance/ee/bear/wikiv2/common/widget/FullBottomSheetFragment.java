package com.bytedance.ee.bear.wikiv2.common.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C22184b;
import com.google.android.material.bottomsheet.DialogC22179a;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/common/widget/FullBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "getBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "setBehavior", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.common.widget.a */
public class FullBottomSheetFragment extends C22184b {

    /* renamed from: c */
    private BottomSheetBehavior<FrameLayout> f32922c;

    /* renamed from: d */
    private HashMap f32923d;

    /* renamed from: a */
    public View mo46790a(int i) {
        if (this.f32923d == null) {
            this.f32923d = new HashMap();
        }
        View view = (View) this.f32923d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f32923d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: g */
    public void mo46793g() {
        HashMap hashMap = this.f32923d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46793g();
    }

    /* renamed from: f */
    public BottomSheetBehavior<FrameLayout> mo46792f() {
        return this.f32922c;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null) {
            FrameLayout frameLayout = (FrameLayout) ((DialogC22179a) v_).getDelegate().mo813b(R.id.design_bottom_sheet);
            if (frameLayout != null) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams != null) {
                    ((CoordinatorLayout.LayoutParams) layoutParams).height = C13749l.m55748b();
                    mo46791a(BottomSheetBehavior.m79955b(frameLayout));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
    }

    /* renamed from: a */
    public void mo46791a(BottomSheetBehavior<FrameLayout> bottomSheetBehavior) {
        this.f32922c = bottomSheetBehavior;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.appcompat.app.C0261c, com.google.android.material.bottomsheet.C22184b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        if (getContext() != null) {
            return new DialogC22179a(requireContext(), R.style.WikiTransparentBottomSheetStyleV2);
        }
        Dialog a = super.mo946a(bundle);
        Intrinsics.checkExpressionValueIsNotNull(a, "super.onCreateDialog(savedInstanceState)");
        return a;
    }
}
