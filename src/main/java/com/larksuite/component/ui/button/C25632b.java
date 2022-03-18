package com.larksuite.component.ui.button;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

/* access modifiers changed from: package-private */
/* renamed from: com.larksuite.component.ui.button.b */
public class C25632b {
    /* renamed from: a */
    private static Drawable m91705a(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) i2);
        gradientDrawable.setColor(i);
        if (i4 > 0) {
            gradientDrawable.setStroke(i4, i3);
        }
        return gradientDrawable;
    }

    /* renamed from: a */
    static StateListDrawable m91706a(int i, int i2, int i3, int i4, int i5, int i6) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, m91705a(i2, i4, i5, i6));
        stateListDrawable.addState(new int[]{-16842910}, m91705a(i3, i4, i5, i6));
        stateListDrawable.addState(new int[0], m91705a(i, i4, i5, i6));
        return stateListDrawable;
    }
}
