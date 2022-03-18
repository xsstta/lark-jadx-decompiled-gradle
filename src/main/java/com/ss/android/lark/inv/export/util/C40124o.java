package com.ss.android.lark.inv.export.util;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.suite.R;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.inv.export.util.o */
public class C40124o {
    /* renamed from: a */
    public static void m159088a(FragmentActivity fragmentActivity, int i, Fragment fragment, boolean z, boolean z2) {
        if (fragmentActivity == null) {
            C53241h.m205894a("FragmentUtils", "activity is null");
        } else if (fragment == null) {
            C53241h.m205894a("FragmentUtils", "fragment is null");
        } else {
            m159089a(fragmentActivity.getSupportFragmentManager(), i, fragment, z, z2);
        }
    }

    /* renamed from: a */
    public static void m159089a(FragmentManager fragmentManager, int i, Fragment fragment, boolean z, boolean z2) {
        if (fragmentManager == null) {
            C53241h.m205894a("FragmentUtils", "fm is null");
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (z2) {
            beginTransaction.setCustomAnimations(R.anim.activity_open_enter, R.anim.activity_close_exit, R.anim.activity_open_enter, R.anim.activity_close_exit);
        }
        String name = fragment.getClass().getName();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(name);
        if (findFragmentByTag != null && findFragmentByTag.isAdded()) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.add(i, fragment, name);
        if (z) {
            beginTransaction.addToBackStack(name);
        }
        beginTransaction.commitNowAllowingStateLoss();
    }
}
