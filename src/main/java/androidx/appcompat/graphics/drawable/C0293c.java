package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0774a;

/* renamed from: androidx.appcompat.graphics.drawable.c */
public class C0293c extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f867a;

    /* renamed from: a */
    public Drawable mo1105a() {
        return this.f867a;
    }

    public int getChangingConfigurations() {
        return this.f867a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f867a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f867a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f867a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f867a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f867a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f867a.getOpacity();
    }

    public int[] getState() {
        return this.f867a.getState();
    }

    public Region getTransparentRegion() {
        return this.f867a.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return C0774a.m3773b(this.f867a);
    }

    public boolean isStateful() {
        return this.f867a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f867a.jumpToCurrentState();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public C0293c(Drawable drawable) {
        mo1106a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f867a.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f867a.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f867a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f867a.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f867a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0774a.m3772a(this.f867a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f867a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f867a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f867a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f867a.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return this.f867a.setState(iArr);
    }

    public void setTint(int i) {
        C0774a.m3766a(this.f867a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0774a.m3768a(this.f867a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0774a.m3771a(this.f867a, mode);
    }

    /* renamed from: a */
    public void mo1106a(Drawable drawable) {
        Drawable drawable2 = this.f867a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f867a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        C0774a.m3765a(this.f867a, f, f2);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f867a.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0774a.m3767a(this.f867a, i, i2, i3, i4);
    }
}
