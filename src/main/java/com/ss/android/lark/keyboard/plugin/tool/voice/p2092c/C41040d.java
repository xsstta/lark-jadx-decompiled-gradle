package com.ss.android.lark.keyboard.plugin.tool.voice.p2092c;

import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.c.d */
public class C41040d {
    /* renamed from: a */
    private static int m162711a(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            f = (float) UIHelper.dp2px(f);
        }
        return (int) f;
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m162715a(float f, float f2) {
        return m162716a(f, f2, 0, 0, 0, 0);
    }

    /* renamed from: a */
    public static LinearLayout.LayoutParams m162712a(int i, int i2, int i3) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m162711a((float) i), m162711a((float) i2));
        layoutParams.gravity = i3;
        return layoutParams;
    }

    /* renamed from: a */
    public static RelativeLayout.LayoutParams m162714a(float f, float f2, int i) {
        return m162713a(f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, -1, -1);
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m162716a(float f, float f2, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(m162711a(f), m162711a(f2));
        layoutParams.setMargins(i, i2, i3, i4);
        return layoutParams;
    }

    /* renamed from: a */
    public static RelativeLayout.LayoutParams m162713a(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m162711a(f), m162711a(f2));
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
