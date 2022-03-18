package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.h */
public class C0782h extends Drawable implements Drawable.Callback, AbstractC0780f, AbstractC0781g {

    /* renamed from: a */
    static final PorterDuff.Mode f3168a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    C0784j f3169b;

    /* renamed from: c */
    Drawable f3170c;

    /* renamed from: d */
    private int f3171d;

    /* renamed from: e */
    private PorterDuff.Mode f3172e;

    /* renamed from: f */
    private boolean f3173f;

    /* renamed from: g */
    private boolean f3174g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4326b() {
        return true;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0781g
    /* renamed from: a */
    public final Drawable mo4324a() {
        return this.f3170c;
    }

    /* renamed from: c */
    private C0784j m3799c() {
        return new C0784j(this.f3169b);
    }

    public Drawable getCurrent() {
        return this.f3170c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3170c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3170c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3170c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3170c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3170c.getOpacity();
    }

    public int[] getState() {
        return this.f3170c.getState();
    }

    public Region getTransparentRegion() {
        return this.f3170c.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return this.f3170c.isAutoMirrored();
    }

    public void jumpToCurrentState() {
        this.f3170c.jumpToCurrentState();
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C0784j jVar = this.f3169b;
        if (jVar != null) {
            i = jVar.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f3170c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0784j jVar = this.f3169b;
        if (jVar == null || !jVar.mo4361a()) {
            return null;
        }
        this.f3169b.f3176a = getChangingConfigurations();
        return this.f3169b;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        C0784j jVar;
        if (!mo4326b() || (jVar = this.f3169b) == null) {
            colorStateList = null;
        } else {
            colorStateList = jVar.f3178c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f3170c.isStateful()) {
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f3174g && super.mutate() == this) {
            this.f3169b = m3799c();
            Drawable drawable = this.f3170c;
            if (drawable != null) {
                drawable.mutate();
            }
            C0784j jVar = this.f3169b;
            if (jVar != null) {
                Drawable drawable2 = this.f3170c;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                jVar.f3177b = constantState;
            }
            this.f3174g = true;
        }
        return this;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f3170c.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f3170c.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3170c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f3170c.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f3170c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f3170c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f3170c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3170c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3170c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3170c.setFilterBitmap(z);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    C0782h(Drawable drawable) {
        this.f3169b = m3799c();
        mo4325a(drawable);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintList(ColorStateList colorStateList) {
        this.f3169b.f3178c = colorStateList;
        m3798a(getState());
    }

    @Override // androidx.core.graphics.drawable.AbstractC0780f
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3169b.f3179d = mode;
        m3798a(getState());
    }

    /* renamed from: a */
    private void m3797a(Resources resources) {
        C0784j jVar = this.f3169b;
        if (jVar != null && jVar.f3177b != null) {
            mo4325a(this.f3169b.f3177b.newDrawable(resources));
        }
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f3170c.setState(iArr);
        if (m3798a(iArr) || state) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3798a(int[] iArr) {
        if (!mo4326b()) {
            return false;
        }
        ColorStateList colorStateList = this.f3169b.f3178c;
        PorterDuff.Mode mode = this.f3169b.f3179d;
        if (colorStateList == null || mode == null) {
            this.f3173f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f3173f && colorForState == this.f3171d && mode == this.f3172e)) {
                setColorFilter(colorForState, mode);
                this.f3171d = colorForState;
                this.f3172e = mode;
                this.f3173f = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.AbstractC0781g
    /* renamed from: a */
    public final void mo4325a(Drawable drawable) {
        Drawable drawable2 = this.f3170c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3170c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0784j jVar = this.f3169b;
            if (jVar != null) {
                jVar.f3177b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C0782h(C0784j jVar, Resources resources) {
        this.f3169b = jVar;
        m3797a(resources);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f3170c.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
