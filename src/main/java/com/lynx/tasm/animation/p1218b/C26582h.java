package com.lynx.tasm.animation.p1218b;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.lynx.tasm.animation.b.h */
class C26582h extends Animation {

    /* renamed from: a */
    private final View f65760a;

    /* renamed from: b */
    private final float f65761b;

    /* renamed from: c */
    private final float f65762c;

    public boolean willChangeBounds() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        this.f65760a.setAlpha(this.f65761b + (this.f65762c * f));
    }

    protected C26582h(View view, float f, float f2) {
        this.f65760a = view;
        this.f65761b = f;
        this.f65762c = f2 - f;
    }
}
