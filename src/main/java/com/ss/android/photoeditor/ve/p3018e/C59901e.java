package com.ss.android.photoeditor.ve.p3018e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0003\u001a\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"getGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "color", "", "radius", "", "getIconDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "drawableRes", "colorList", "Landroid/content/res/ColorStateList;", "photoeditor_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.e.e */
public final class C59901e {
    /* renamed from: a */
    public static final Drawable m232467a(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return context.getDrawable(i);
    }

    /* renamed from: a */
    public static final GradientDrawable m232469a(int i, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: a */
    public static final Drawable m232468a(Context context, int i, ColorStateList colorStateList) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(colorStateList, "colorList");
        Drawable a = m232467a(context, i);
        if (a != null) {
            a.mutate();
            a.setTintList(colorStateList);
        }
        return a;
    }
}
