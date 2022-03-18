package com.google.android.material.theme.p992a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.ContextThemeWrapper;
import com.larksuite.suite.R;

/* renamed from: com.google.android.material.theme.a.a */
public class C22497a {

    /* renamed from: a */
    private static final int[] f55349a = {16842752, R.attr.theme};

    /* renamed from: b */
    private static final int[] f55350b = {R.attr.materialThemeOverlay};

    /* renamed from: a */
    private static int m81661a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f55349a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m81663b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f55350b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: a */
    public static Context m81662a(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        int b = m81663b(context, attributeSet, i, i2);
        if (!(context instanceof ContextThemeWrapper) || ((ContextThemeWrapper) context).getThemeResId() != b) {
            z = false;
        } else {
            z = true;
        }
        if (b == 0 || z) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, b);
        int a = m81661a(context, attributeSet);
        if (a != 0) {
            contextThemeWrapper.getTheme().applyStyle(a, true);
        }
        return contextThemeWrapper;
    }
}
