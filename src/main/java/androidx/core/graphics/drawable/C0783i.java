package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.i */
public class C0783i extends C0782h {

    /* renamed from: d */
    private static Method f3175d;

    public Rect getDirtyBounds() {
        return this.f3170c.getDirtyBounds();
    }

    /* renamed from: c */
    private void m3803c() {
        if (f3175d == null) {
            try {
                f3175d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.drawable.C0782h
    /* renamed from: b */
    public boolean mo4326b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f3170c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public boolean isProjected() {
        Method method;
        if (!(this.f3170c == null || (method = f3175d) == null)) {
            try {
                return ((Boolean) method.invoke(this.f3170c, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    C0783i(Drawable drawable) {
        super(drawable);
        m3803c();
    }

    public void getOutline(Outline outline) {
        this.f3170c.getOutline(outline);
    }

    @Override // androidx.core.graphics.drawable.C0782h
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0782h, androidx.core.graphics.drawable.AbstractC0780f
    public void setTint(int i) {
        if (mo4326b()) {
            super.setTint(i);
        } else {
            this.f3170c.setTint(i);
        }
    }

    @Override // androidx.core.graphics.drawable.C0782h, androidx.core.graphics.drawable.AbstractC0780f
    public void setTintList(ColorStateList colorStateList) {
        if (mo4326b()) {
            super.setTintList(colorStateList);
        } else {
            this.f3170c.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0782h, androidx.core.graphics.drawable.AbstractC0780f
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo4326b()) {
            super.setTintMode(mode);
        } else {
            this.f3170c.setTintMode(mode);
        }
    }

    public void setHotspot(float f, float f2) {
        this.f3170c.setHotspot(f, f2);
    }

    C0783i(C0784j jVar, Resources resources) {
        super(jVar, resources);
        m3803c();
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f3170c.setHotspotBounds(i, i2, i3, i4);
    }
}
