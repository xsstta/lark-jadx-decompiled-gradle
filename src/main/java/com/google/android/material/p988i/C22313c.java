package com.google.android.material.p988i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.C0427af;

/* renamed from: com.google.android.material.i.c */
public class C22313c {
    /* renamed from: a */
    static int m80794a(TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(i)) {
            return i;
        }
        return i2;
    }

    /* renamed from: b */
    public static Drawable m80797b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C0215a.m655b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }

    /* renamed from: c */
    public static C22314d m80798c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C22314d(context, resourceId);
    }

    /* renamed from: a */
    public static ColorStateList m80795a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (a = C0215a.m652a(context, resourceId)) != null) {
            return a;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) {
            return typedArray.getColorStateList(i);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: a */
    public static ColorStateList m80796a(Context context, C0427af afVar, int i) {
        int b;
        int g;
        ColorStateList a;
        if (afVar.mo2492g(i) && (g = afVar.mo2491g(i, 0)) != 0 && (a = C0215a.m652a(context, g)) != null) {
            return a;
        }
        if (Build.VERSION.SDK_INT > 15 || (b = afVar.mo2480b(i, -1)) == -1) {
            return afVar.mo2488e(i);
        }
        return ColorStateList.valueOf(b);
    }

    /* renamed from: a */
    public static int m80793a(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
