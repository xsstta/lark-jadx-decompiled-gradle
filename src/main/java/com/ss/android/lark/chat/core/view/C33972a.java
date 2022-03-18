package com.ss.android.lark.chat.core.view;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.chat.core.view.a */
public class C33972a {
    /* renamed from: a */
    private static int m131456a(Context context, float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            f = (float) UIUtils.dp2px(context, f);
        }
        return (int) f;
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m131457a(Context context, float f, float f2) {
        return m131458a(context, f, f2, 0, 0, 0, 0);
    }

    /* renamed from: a */
    public static ConstraintLayout.LayoutParams m131458a(Context context, float f, float f2, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(m131456a(context, f), m131456a(context, f2));
        layoutParams.setMargins(m131456a(context, (float) i), m131456a(context, (float) i2), m131456a(context, (float) i3), m131456a(context, (float) i4));
        return layoutParams;
    }
}
