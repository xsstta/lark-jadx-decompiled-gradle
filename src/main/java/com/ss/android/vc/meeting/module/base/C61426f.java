package com.ss.android.vc.meeting.module.base;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.base.f */
public class C61426f {
    /* renamed from: a */
    public static void m239679a(FragmentManager fragmentManager) {
        List<Fragment> fragments;
        if (!(fragmentManager == null || (fragments = fragmentManager.getFragments()) == null || fragments.size() == 0)) {
            for (int size = fragments.size() - 1; size >= 0; size--) {
                Fragment fragment = fragments.get(size);
                if (fragment instanceof AbstractC61428h) {
                    ((AbstractC61428h) fragment).mo212915c();
                }
            }
        }
    }
}
