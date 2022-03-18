package com.bytedance.ee.bear.facade.common;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.log.C13479a;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.facade.common.e */
public class C7667e extends C7718l implements AbstractC7666d {
    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: m */
    public void mo30124m() {
        mo30123c(0);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        if (fragments == null) {
            return false;
        }
        for (int size = fragments.size() - 1; size >= 0; size--) {
            Fragment fragment = fragments.get(size);
            if ((fragment instanceof AbstractC7666d) && ((AbstractC7666d) fragment).onBackPressed()) {
                C13479a.m54764b("BaseFragment", "Back press consumed by :" + fragment);
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: c */
    public void mo30123c(int i) {
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
}
