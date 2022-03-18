package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.internal.p */
public class C22363p implements AbstractC22364q {

    /* renamed from: a */
    private final ViewOverlay f54790a;

    @Override // com.google.android.material.internal.AbstractC22364q
    /* renamed from: a */
    public void mo77864a(Drawable drawable) {
        this.f54790a.add(drawable);
    }

    @Override // com.google.android.material.internal.AbstractC22364q
    /* renamed from: b */
    public void mo77865b(Drawable drawable) {
        this.f54790a.remove(drawable);
    }

    C22363p(View view) {
        this.f54790a = view.getOverlay();
    }
}
