package com.bytedance.ee.bear.drive.common.mvpframeworks.app.p344b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.ee.bear.drive.common.mvpframeworks.app.b.a */
public abstract class AbstractC6902a extends AbstractC6904c {

    /* renamed from: a */
    private boolean f18675a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo25870a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25873a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25874a(View view, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25878b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo27142b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26649b(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo27143e() {
        this.f18675a = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!this.f18675a) {
            mo25878b();
            if (!this.f18675a) {
                mo25874a(view, bundle);
                if (!this.f18675a) {
                    mo25873a(view);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f18675a = false;
        View inflate = layoutInflater.inflate(mo25870a(), viewGroup, false);
        mo26649b(inflate);
        mo27142b(bundle);
        return inflate;
    }
}
