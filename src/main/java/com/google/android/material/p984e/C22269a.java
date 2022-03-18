package com.google.android.material.p984e;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.material.e.a */
public final class C22269a {
    /* renamed from: a */
    public static void m80566a(RippleDrawable rippleDrawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e);
        }
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m80565a(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
