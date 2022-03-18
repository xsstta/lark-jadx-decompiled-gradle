package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.material.circularreveal.AbstractC22213b;

public class CircularRevealRelativeLayout extends RelativeLayout implements AbstractC22213b {

    /* renamed from: a */
    private final CircularRevealHelper f54287a;

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void Y_() {
        this.f54287a.mo77254b();
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    /* renamed from: a */
    public void mo77235a() {
        this.f54287a.mo77249a();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.AbstractC22210a
    /* renamed from: c */
    public boolean mo77237c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f54287a.mo77257e();
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public int getCircularRevealScrimColor() {
        return this.f54287a.mo77256d();
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public AbstractC22213b.C22218d getRevealInfo() {
        return this.f54287a.mo77255c();
    }

    public boolean isOpaque() {
        CircularRevealHelper circularRevealHelper = this.f54287a;
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

    public CircularRevealRelativeLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f54287a.mo77252a(drawable);
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void setCircularRevealScrimColor(int i) {
        this.f54287a.mo77250a(i);
    }

    @Override // com.google.android.material.circularreveal.AbstractC22213b
    public void setRevealInfo(AbstractC22213b.C22218d dVar) {
        this.f54287a.mo77253a(dVar);
    }

    public void draw(Canvas canvas) {
        CircularRevealHelper circularRevealHelper = this.f54287a;
        if (circularRevealHelper != null) {
            circularRevealHelper.mo77251a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54287a = new CircularRevealHelper(this);
    }
}
