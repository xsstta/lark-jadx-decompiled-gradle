package com.ss.android.lark.chat.utils;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.utils.l */
public class C34346l {
    /* renamed from: a */
    private static int m133186a(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            f = (float) UIHelper.dp2px(f);
        }
        return (int) f;
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m133187a(float f, float f2) {
        return m133188a(f, f2, 0, 0, 0, 0);
    }

    /* renamed from: a */
    public static void m133189a(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        if (viewGroup != null && view != null) {
            ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            if (viewGroup2 == null) {
                viewGroup.addView(view, layoutParams);
            } else if (viewGroup2 == viewGroup) {
                view.setLayoutParams(layoutParams);
            } else {
                viewGroup2.removeView(view);
                viewGroup.addView(view, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m133188a(float f, float f2, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(m133186a(f), m133186a(f2));
        layoutParams.setMargins(m133186a((float) i), m133186a((float) i2), m133186a((float) i3), m133186a((float) i4));
        return layoutParams;
    }
}
