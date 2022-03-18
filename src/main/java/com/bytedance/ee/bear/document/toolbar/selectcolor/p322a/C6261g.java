package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.document.toolbar.C6218f;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.g */
public class C6261g extends C6262h implements AbstractC7666d {

    /* renamed from: g */
    private AbstractC7665c f17378g;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo5513b();
        return true;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h
    /* renamed from: f */
    public View mo25229f() {
        return C6218f.m25065a().mo25152a(super.mo25229f(), R.color.bg_body);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC7665c cVar = this.f17378g;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        mo5510a(0, R.style.SelectColorDialogStyle);
        Dialog a = super.mo946a(bundle);
        if (a.getWindow() != null) {
            a.getWindow().setWindowAnimations(R.style.RightInRightOutAnimationDialog);
        }
        return a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6262h, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
        this.f17378g = cVar;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
    }
}
