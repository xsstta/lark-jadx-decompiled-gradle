package com.bytedance.ee.bear.document.toolbar;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.document.toolbar.c */
public abstract class AbstractC6207c extends DialogInterface$OnCancelListenerC1021b implements AbstractC10549e {
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public View mo22135i() {
        return new View(getContext());
    }

    /* renamed from: f */
    private int mo22132f() {
        int j = AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39936j();
        if (j >= 300) {
            return j;
        }
        return C13749l.m55738a((int) LocationRequest.PRIORITY_INDOOR);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (getActivity() != null && !getActivity().getSupportFragmentManager().isDestroyed()) {
            AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    /* renamed from: a */
    public Dialog mo946a(Bundle bundle) {
        Dialog a = super.mo946a(bundle);
        a.requestWindowFeature(1);
        View i = mo22135i();
        C13747j.m55726a(i, (int) R.color.bg_body);
        ViewGroup viewGroup = (ViewGroup) i.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            C13747j.m55726a(viewGroup, (int) R.color.bg_body);
        }
        a.setContentView(i);
        if (a.getWindow() != null) {
            WindowManager.LayoutParams attributes = a.getWindow().getAttributes();
            attributes.type = 1000;
            attributes.width = -1;
            attributes.height = mo22132f();
            attributes.softInputMode = 1;
            attributes.flags |= 264;
            attributes.flags &= -3;
            attributes.gravity = 80;
            a.getWindow().setAttributes(attributes);
            a.getWindow().setBackgroundDrawableResource(17170445);
            a.setCanceledOnTouchOutside(false);
        }
        return a;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        Dialog v_;
        Window window;
        if (i > 0 && (v_ = v_()) != null && v_.isShowing() && (window = v_.getWindow()) != null) {
            View decorView = window.getDecorView();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = i;
            window.getWindowManager().updateViewLayout(decorView, attributes);
        }
    }
}
