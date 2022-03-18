package com.bytedance.ee.bear.sheet.panel.p547a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.sheet.common.SheetDragView;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.panel.a.b */
public class C11260b extends AbstractC6207c implements AbstractC7666d {

    /* renamed from: c */
    private SheetDragView f30287c;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo43173a(R.anim.child_fragment_exit);
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SheetDragView sheetDragView = this.f30287c;
        if (sheetDragView != null) {
            sheetDragView.mo45442c(true);
        }
    }

    /* renamed from: a */
    public void mo43173a(int i) {
        FragmentManager fragmentManager;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            fragmentManager = parentFragment.getChildFragmentManager();
        } else {
            fragmentManager = getFragmentManager();
        }
        if (fragmentManager != null) {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (i != 0) {
                beginTransaction.setCustomAnimations(0, i);
            }
            beginTransaction.remove(this).commitAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        SheetDragView sheetDragView = (SheetDragView) view.getRootView().findViewById(R.id.fab_dragview);
        this.f30287c = sheetDragView;
        if (sheetDragView != null) {
            sheetDragView.mo45442c(false);
            this.f30287c.mo42244b();
        }
        SheetPanelRouter.f29786a.mo42307a(this, getFragmentManager(), null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return mo22135i();
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            return AnimationUtils.loadAnimation(getContext(), R.anim.child_fragment_enter);
        }
        return null;
    }
}
