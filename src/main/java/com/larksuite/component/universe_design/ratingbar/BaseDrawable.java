package com.larksuite.component.universe_design.ratingbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\r\b&\u0018\u00002\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\"\u0010\u001d\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH$J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\bH\u0016J\u0012\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010'\u001a\u00020\u00132\b\b\u0001\u0010(\u001a\u00020\bH\u0016J\u0012\u0010)\u001a\u00020\u00132\b\u0010*\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010+\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010-\u001a\u00020\u001cH\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048DX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/BaseDrawable;", "Landroid/graphics/drawable/Drawable;", "()V", "colorFilterForDraw", "Landroid/graphics/ColorFilter;", "getColorFilterForDraw", "()Landroid/graphics/ColorFilter;", "mAlpha", "", "mColorFilter", "mConstantState", "Lcom/larksuite/component/universe_design/ratingbar/BaseDrawable$CustomConstantState;", "mTintFilter", "Landroid/graphics/PorterDuffColorFilter;", "mTintList", "Landroid/content/res/ColorStateList;", "mTintMode", "Landroid/graphics/PorterDuff$Mode;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getAlpha", "getColorFilter", "getConstantState", "Landroid/graphics/drawable/Drawable$ConstantState;", "getOpacity", "isStateful", "", "onDraw", "width", "height", "onStateChange", "state", "", "setAlpha", "alpha", "setColorFilter", "colorFilter", "setTint", "tintColor", "setTintList", "tint", "setTintMode", "tintMode", "updateTintFilter", "CustomConstantState", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.ratingbar.a */
public abstract class BaseDrawable extends Drawable {

    /* renamed from: a */
    public int f63552a = 255;

    /* renamed from: b */
    private ColorFilter f63553b;

    /* renamed from: c */
    private ColorStateList f63554c;

    /* renamed from: d */
    private PorterDuff.Mode f63555d = PorterDuff.Mode.SRC_IN;

    /* renamed from: e */
    private PorterDuffColorFilter f63556e;

    /* renamed from: f */
    private final CustomConstantState f63557f = new CustomConstantState();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo91157a(Canvas canvas, int i, int i2);

    public int getOpacity() {
        return -3;
    }

    public int getAlpha() {
        return this.f63552a;
    }

    public ColorFilter getColorFilter() {
        return this.f63553b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/universe_design/ratingbar/BaseDrawable$CustomConstantState;", "Landroid/graphics/drawable/Drawable$ConstantState;", "(Lcom/larksuite/component/universe_design/ratingbar/BaseDrawable;)V", "getChangingConfigurations", "", "newDrawable", "Landroid/graphics/drawable/Drawable;", "universe-ui-ratingbar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.ratingbar.a$a */
    private final class CustomConstantState extends Drawable.ConstantState {
        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return BaseDrawable.this;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CustomConstantState() {
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f63557f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ColorFilter mo91156a() {
        ColorFilter colorFilter = this.f63553b;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.f63556e;
    }

    public boolean isStateful() {
        boolean z;
        ColorStateList colorStateList = this.f63554c;
        if (colorStateList == null) {
            return false;
        }
        if (colorStateList != null) {
            z = colorStateList.isStateful();
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m92947b() {
        ColorStateList colorStateList = this.f63554c;
        boolean z = true;
        int i = 0;
        if (colorStateList == null || this.f63555d == null) {
            if (this.f63556e == null) {
                z = false;
            }
            this.f63556e = null;
            return z;
        }
        if (colorStateList != null) {
            i = colorStateList.getColorForState(getState(), 0);
        }
        PorterDuff.Mode mode = this.f63555d;
        if (mode != null) {
            this.f63556e = new PorterDuffColorFilter(i, mode);
        }
        return true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f63553b = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Intrinsics.checkParameterIsNotNull(iArr, "state");
        return m92947b();
    }

    public void setAlpha(int i) {
        if (this.f63552a != i) {
            this.f63552a = i;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f63554c = colorStateList;
        if (m92947b()) {
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f63555d = mode;
        if (m92947b()) {
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkParameterIsNotNull(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkExpressionValueIsNotNull(bounds, "bounds");
        if (bounds.width() != 0 && bounds.height() != 0) {
            int save = canvas.save();
            mo91157a(canvas, bounds.width(), bounds.height());
            canvas.restoreToCount(save);
        }
    }
}
