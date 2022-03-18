package com.google.android.material.p989j;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.AbstractC0780f;
import com.google.android.material.shape.AbstractC22413o;
import com.google.android.material.shape.C22398l;
import com.google.android.material.shape.MaterialShapeDrawable;

/* renamed from: com.google.android.material.j.a */
public class C22372a extends Drawable implements AbstractC0780f, AbstractC22413o {

    /* renamed from: a */
    private C22374a f54802a;

    public boolean isStateful() {
        return true;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f54802a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.j.a$a */
    public static final class C22374a extends Drawable.ConstantState {

        /* renamed from: a */
        MaterialShapeDrawable f54803a;

        /* renamed from: b */
        boolean f54804b;

        public int getChangingConfigurations() {
            return 0;
        }

        /* renamed from: a */
        public C22372a newDrawable() {
            return new C22372a(new C22374a(this));
        }

        public C22374a(MaterialShapeDrawable materialShapeDrawable) {
            this.f54803a = materialShapeDrawable;
        }

        public C22374a(C22374a aVar) {
            this.f54803a = (MaterialShapeDrawable) aVar.f54803a.getConstantState().newDrawable();
            this.f54804b = aVar.f54804b;
        }
    }

    /* renamed from: a */
    public C22372a mutate() {
        this.f54802a = new C22374a(this.f54802a);
        return this;
    }

    public int getOpacity() {
        return this.f54802a.f54803a.getOpacity();
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public C22398l getShapeAppearanceModel() {
        return this.f54802a.f54803a.getShapeAppearanceModel();
    }

    private C22372a(C22374a aVar) {
        this.f54802a = aVar;
    }

    public void setAlpha(int i) {
        this.f54802a.f54803a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f54802a.f54803a.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.shape.AbstractC22413o
    public void setShapeAppearanceModel(C22398l lVar) {
        this.f54802a.f54803a.setShapeAppearanceModel(lVar);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTint(int i) {
        this.f54802a.f54803a.setTint(i);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintList(ColorStateList colorStateList) {
        this.f54802a.f54803a.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintMode(PorterDuff.Mode mode) {
        this.f54802a.f54803a.setTintMode(mode);
    }

    public C22372a(C22398l lVar) {
        this(new C22374a(new MaterialShapeDrawable(lVar)));
    }

    public void draw(Canvas canvas) {
        if (this.f54802a.f54804b) {
            this.f54802a.f54803a.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f54802a.f54803a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f54802a.f54803a.setState(iArr)) {
            onStateChange = true;
        }
        boolean a = C22375b.m81039a(iArr);
        if (this.f54802a.f54804b == a) {
            return onStateChange;
        }
        this.f54802a.f54804b = a;
        return true;
    }
}
