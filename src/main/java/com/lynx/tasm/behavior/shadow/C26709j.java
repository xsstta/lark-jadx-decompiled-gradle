package com.lynx.tasm.behavior.shadow;

import android.view.View;

/* renamed from: com.lynx.tasm.behavior.shadow.j */
public class C26709j implements AbstractC26702c {

    /* renamed from: a */
    private View f66106a;

    /* renamed from: b */
    private Runnable f66107b;

    /* renamed from: a */
    public void mo94823a() {
        Runnable runnable = this.f66107b;
        if (runnable != null) {
            runnable.run();
        }
        this.f66107b = null;
    }

    /* renamed from: a */
    public void mo94824a(View view) {
        this.f66106a = view;
    }

    public C26709j(View view) {
        this.f66106a = view;
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC26702c
    /* renamed from: a */
    public void mo94816a(Runnable runnable) {
        View view = this.f66106a;
        if (view != null) {
            view.requestLayout();
        }
        this.f66107b = runnable;
    }
}
