package com.ss.android.lark.widget;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.widget.b */
public class C58323b {
    /* renamed from: a */
    private static int m226137a(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            f = (float) UIHelper.dp2px(f);
        }
        return (int) f;
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m226142a(float f, float f2) {
        return m226143a(f, f2, 0, 0, 0, 0);
    }

    /* renamed from: b */
    public static FrameLayout.LayoutParams m226144b(float f, float f2, int i) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m226137a(f), m226137a(f2));
        layoutParams.gravity = i;
        return layoutParams;
    }

    /* renamed from: a */
    public static LinearLayout.LayoutParams m226138a(int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m226137a((float) i), m226137a((float) i2));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    /* renamed from: a */
    public static RelativeLayout.LayoutParams m226141a(float f, float f2, int i) {
        return m226140a(f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, -1, -1);
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m226143a(float f, float f2, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(m226137a(f), m226137a(f2));
        layoutParams.setMargins(m226137a((float) i), m226137a((float) i2), m226137a((float) i3), m226137a((float) i4));
        return layoutParams;
    }

    /* renamed from: a */
    public static LinearLayout.LayoutParams m226139a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m226137a((float) i), m226137a((float) i2));
        layoutParams.setMargins(UIHelper.dp2px((float) i4), UIHelper.dp2px((float) i5), UIHelper.dp2px((float) i6), UIHelper.dp2px((float) i7));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    /* renamed from: a */
    public static RelativeLayout.LayoutParams m226140a(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m226137a(f), m226137a(f2));
        if (i >= 0) {
            layoutParams.addRule(i);
        }
        if (i2 >= 0 && i3 >= 0) {
            layoutParams.addRule(i2, i3);
        }
        layoutParams.setMargins(UIHelper.dp2px(f3), UIHelper.dp2px(f4), UIHelper.dp2px(f5), UIHelper.dp2px(f6));
        return layoutParams;
    }
}
