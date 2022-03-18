package com.google.android.material.p986g;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.g.c */
public final class C22308c {

    /* renamed from: a */
    private final View f54587a;

    /* renamed from: b */
    private boolean f54588b;

    /* renamed from: c */
    private int f54589c;

    /* renamed from: c */
    public int mo77666c() {
        return this.f54589c;
    }

    /* renamed from: a */
    public boolean mo77664a() {
        return this.f54588b;
    }

    /* renamed from: d */
    private void m80773d() {
        ViewParent parent = this.f54587a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo3947b(this.f54587a);
        }
    }

    /* renamed from: b */
    public Bundle mo77665b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f54588b);
        bundle.putInt("expandedComponentIdHint", this.f54589c);
        return bundle;
    }

    /* renamed from: a */
    public void mo77662a(int i) {
        this.f54589c = i;
    }

    public C22308c(AbstractC22307b bVar) {
        this.f54587a = (View) bVar;
    }

    /* renamed from: a */
    public void mo77663a(Bundle bundle) {
        this.f54588b = bundle.getBoolean("expanded", false);
        this.f54589c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f54588b) {
            m80773d();
        }
    }
}
