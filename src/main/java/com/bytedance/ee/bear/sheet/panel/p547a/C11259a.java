package com.bytedance.ee.bear.sheet.panel.p547a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.bytedance.ee.bear.sheet.panel.AbstractC11257a;
import com.bytedance.ee.bear.sheet.panel.AbstractC11261b;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11271b;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.panel.a.a */
public class C11259a extends AbstractC11257a<SheetItem> {
    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: c */
    public String mo42711c() {
        return "freezeSheet";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: a */
    public void mo42707a() {
        mo30124m();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo30123c(R.anim.child_fragment_exit);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a
    /* renamed from: b */
    public AbstractC11261b<SheetItem> mo42710b() {
        return (AbstractC11261b) C4950k.m20474a(this, C11271b.class);
    }

    @Override // com.bytedance.ee.bear.sheet.panel.AbstractC11257a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo43165a((CharSequence) mo42710b().getPanelTitle("freezeSheet"));
        SheetPanelRouter.f29786a.mo42307a(this, getFragmentManager(), null);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            return AnimationUtils.loadAnimation(getContext(), R.anim.child_fragment_enter);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sheet_freeze_fragment, viewGroup, false);
    }
}
