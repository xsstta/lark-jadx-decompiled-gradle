package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0427af;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.internal.l */
public final class C22358l {

    /* renamed from: a */
    private static final int[] f54781a = {R.attr.colorPrimary};

    /* renamed from: b */
    private static final int[] f54782b = {R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static void m81000a(Context context) {
        m81002a(context, f54781a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m81005b(Context context) {
        m81002a(context, f54782b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static boolean m81003a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: a */
    private static void m81002a(Context context, int[] iArr, String str) {
        if (!m81003a(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: a */
    private static void m81001a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance}, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m81005b(context);
            }
        }
        m81000a(context);
    }

    /* renamed from: a */
    public static TypedArray m80999a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m81001a(context, attributeSet, i, i2);
        m81006c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static C0427af m81004b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m81001a(context, attributeSet, i, i2);
        m81006c(context, attributeSet, iArr, i, i2, iArr2);
        return C0427af.m1778a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    private static boolean m81007d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    private static void m81006c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance}, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m81007d(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }
}
