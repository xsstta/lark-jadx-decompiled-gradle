package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;

/* renamed from: com.prolificinteractive.materialcalendarview.k */
class C27003k extends ImageView {
    /* renamed from: a */
    public void mo96099a(int i) {
        setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public C27003k(Context context) {
        super(context);
        setBackgroundResource(m98157a(context));
    }

    public void setEnabled(boolean z) {
        float f;
        super.setEnabled(z);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.1f;
        }
        setAlpha(f);
    }

    /* renamed from: a */
    private static int m98157a(Context context) {
        int identifier = context.getResources().getIdentifier("selectableItemBackgroundBorderless", "attr", context.getPackageName());
        if (identifier == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                identifier = 16843868;
            } else {
                identifier = 16843534;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.resourceId;
    }
}
