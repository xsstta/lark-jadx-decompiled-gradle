package androidx.p042i.p043a.p044a;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.AbstractC0780f;
import androidx.core.graphics.drawable.C0774a;

/* access modifiers changed from: package-private */
/* renamed from: androidx.i.a.a.h */
public abstract class AbstractC1105h extends Drawable implements AbstractC0780f {

    /* renamed from: b */
    Drawable f4105b;

    AbstractC1105h() {
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            C0774a.m3764a(drawable);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int[] getState() {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            C0774a.m3769a(drawable, theme);
        }
    }

    public void setFilterBitmap(boolean z) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return super.setState(iArr);
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            C0774a.m3765a(drawable, f, f2);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            drawable.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Drawable drawable = this.f4105b;
        if (drawable != null) {
            C0774a.m3767a(drawable, i, i2, i3, i4);
        }
    }
}
