package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.AbstractC22213b;
import com.google.android.material.circularreveal.CircularRevealHelper;

public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements AbstractC22213b {

    /* renamed from: f */
    private final CircularRevealHelper f54297f;

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void Y_() {
        this.f54297f.mo77254b();
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    /* renamed from: a */
    public void mo77235a() {
        this.f54297f.mo77249a();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.AbstractC22210a
    /* renamed from: c */
    public boolean mo77237c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f54297f.mo77257e();
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public int getCircularRevealScrimColor() {
        return this.f54297f.mo77256d();
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public AbstractC22213b.C22218d getRevealInfo() {
        return this.f54297f.mo77255c();
    }

    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f54297f;
        if (circularRevealHelper != null) {
            return circularRevealHelper.mo77258f();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.AbstractC22210a
    /* renamed from: a */
    public void mo77236a(Canvas canvas) {
        super.draw(canvas);
    }

    public CircularRevealCoordinatorLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f54297f.mo77252a(drawable);
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void setCircularRevealScrimColor(int i) {
        this.f54297f.mo77250a(i);
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void setRevealInfo(AbstractC22213b.C22218d dVar) {
        this.f54297f.mo77253a(dVar);
    }

    public void draw(Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f54297f;
        if (circularRevealHelper != null) {
            circularRevealHelper.mo77251a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54297f = new CircularRevealHelper(this);
    }
}
