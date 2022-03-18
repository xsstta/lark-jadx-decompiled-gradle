package com.bytedance.ee.bear.document.toolbar.selectcolor.p322a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.toolbar.C6218f;
import com.bytedance.ee.bear.facade.common.AbstractC7665c;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.selectcolor.a.b */
public class C6249b extends C6251d implements AbstractC7666d {

    /* renamed from: d */
    private AbstractC7665c f17335d;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo5513b();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6251d
    /* renamed from: f */
    public C6267j mo22132f() {
        return (C6267j) C4950k.m20474a(this, C6267j.class);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6251d, com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: i */
    public View mo22135i() {
        return C6218f.m25065a().mo25152a(super.mo22135i(), R.color.space_kit_white);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC7665c cVar = this.f17335d;
        if (cVar != null) {
            cVar.mo30122b(this);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6251d, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC7665c cVar = (AbstractC7665c) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7665c.class);
        this.f17335d = cVar;
        if (cVar != null) {
            cVar.mo30121a(this);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6251d, com.bytedance.ee.bear.document.toolbar.AbstractC6207c
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        mo5510a(0, R.style.SelectColorDialogStyle);
        Dialog a = super.mo946a(bundle);
        Window window = a.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = ((int) (((float) attributes.height) + getResources().getDimension(R.dimen.toolbar_menu_height))) + C13749l.m55738a(6);
            window.setWindowAnimations(R.style.RightInRightOutAnimationDialog);
            window.setAttributes(attributes);
        }
        return a;
    }
}
