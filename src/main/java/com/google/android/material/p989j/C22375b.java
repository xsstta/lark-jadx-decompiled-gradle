package com.google.android.material.p989j;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.C0768a;

/* renamed from: com.google.android.material.j.b */
public class C22375b {

    /* renamed from: a */
    public static final boolean f54805a;

    /* renamed from: b */
    static final String f54806b = C22375b.class.getSimpleName();

    /* renamed from: c */
    private static final int[] f54807c = {16842919};

    /* renamed from: d */
    private static final int[] f54808d = {16843623, 16842908};

    /* renamed from: e */
    private static final int[] f54809e = {16842908};

    /* renamed from: f */
    private static final int[] f54810f = {16843623};

    /* renamed from: g */
    private static final int[] f54811g = {16842913, 16842919};

    /* renamed from: h */
    private static final int[] f54812h = {16842913, 16843623, 16842908};

    /* renamed from: i */
    private static final int[] f54813i = {16842913, 16842908};

    /* renamed from: j */
    private static final int[] f54814j = {16842913, 16843623};

    /* renamed from: k */
    private static final int[] f54815k = {16842913};

    /* renamed from: l */
    private static final int[] f54816l = {16842910, 16842919};

    private C22375b() {
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f54805a = z;
    }

    /* renamed from: a */
    private static int m81036a(int i) {
        return C0768a.m3716c(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: b */
    public static ColorStateList m81040b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f54816l, 0)) != 0) {
            Log.w(f54806b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: a */
    public static boolean m81039a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static ColorStateList m81038a(ColorStateList colorStateList) {
        if (f54805a) {
            return new ColorStateList(new int[][]{f54815k, StateSet.NOTHING}, new int[]{m81037a(colorStateList, f54811g), m81037a(colorStateList, f54807c)});
        }
        int[] iArr = f54811g;
        int[] iArr2 = f54812h;
        int[] iArr3 = f54813i;
        int[] iArr4 = f54814j;
        int[] iArr5 = f54807c;
        int[] iArr6 = f54808d;
        int[] iArr7 = f54809e;
        int[] iArr8 = f54810f;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f54815k, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m81037a(colorStateList, iArr), m81037a(colorStateList, iArr2), m81037a(colorStateList, iArr3), m81037a(colorStateList, iArr4), 0, m81037a(colorStateList, iArr5), m81037a(colorStateList, iArr6), m81037a(colorStateList, iArr7), m81037a(colorStateList, iArr8), 0});
    }

    /* renamed from: a */
    private static int m81037a(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f54805a) {
            return m81036a(i);
        }
        return i;
    }
}
