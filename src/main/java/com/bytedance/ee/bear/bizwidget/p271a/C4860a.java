package com.bytedance.ee.bear.bizwidget.p271a;

import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.google.android.material.bottomsheet.C22184b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.bizwidget.a.a */
public class C4860a extends C22184b {
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: e */
    public int mo5515e() {
        if (getContext() == null || !C13653a.m55399c(getContext())) {
            return R.style.CustomBottomSheetDialog;
        }
        return R.style.CustomPadBottomSheetDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public void mo5511a(FragmentManager fragmentManager, String str) {
        if (fragmentManager.isStateSaved()) {
            C13479a.m54764b("BaseDialogFragment", "manager.isStateSaved()");
        } else if (fragmentManager.findFragmentByTag(str) != null) {
            C13479a.m54764b("BaseDialogFragment", "fragment already show");
        } else {
            super.mo5511a(fragmentManager, str);
        }
    }
}
