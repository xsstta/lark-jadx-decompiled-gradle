package com.bytedance.ee.bear.bizwidget.p271a;

import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bizwidget.a.b */
public class C4861b extends DialogInterface$OnCancelListenerC1021b {
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public void mo5511a(FragmentManager fragmentManager, String str) {
        mo5510a(0, R.style.SpaceFullDialogFragment);
        if (fragmentManager.isStateSaved()) {
            C13479a.m54764b("BaseDialogFragment", "manager.isStateSaved()");
        } else if (fragmentManager.findFragmentByTag(str) != null) {
            C13479a.m54764b("BaseDialogFragment", "fragment already show");
        } else {
            super.mo5511a(fragmentManager, str);
        }
    }
}
