package com.bytedance.ee.bear.sheet.inputbar.subpanel;

import android.os.Bundle;
import android.view.animation.Animation;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.sheet.inputbar.C11219d;
import com.bytedance.ee.bear.sheet.panel.p547a.C11260b;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.subpanel.e */
public class C11242e extends C11260b {

    /* renamed from: c */
    private C11219d f30252c;

    @Override // com.bytedance.ee.bear.sheet.panel.p547a.C11260b, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Override // com.bytedance.ee.bear.sheet.panel.p547a.C11260b, com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        this.f30252c.setActive(false);
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30252c = (C11219d) C4950k.m20474a(this, C11219d.class);
    }
}
