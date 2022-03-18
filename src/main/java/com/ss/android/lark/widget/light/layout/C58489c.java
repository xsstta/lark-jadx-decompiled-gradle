package com.ss.android.lark.widget.light.layout;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.ss.android.lark.widget.light.layout.c */
public class C58489c {
    /* renamed from: a */
    public static int m226886a(Layout layout) {
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, (int) layout.getLineRight(i2));
        }
        return i;
    }

    /* renamed from: b */
    public static int m226887b(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            int max = Math.max(0, layout.getLineCount() - 1);
            float lineDescent = (float) (layout.getLineDescent(max) - layout.getLineAscent(max));
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            i = spacingAdd >= BitmapDescriptorFactory.HUE_RED ? (int) (((double) spacingAdd) + 0.5d) : -((int) (((double) (-spacingAdd)) + 0.5d));
        }
        return layout.getHeight() - i;
    }
}
