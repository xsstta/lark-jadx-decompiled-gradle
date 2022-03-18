package com.bytedance.ee.bear.bizwidget.banner.util;

import android.content.res.Resources;
import android.util.TypedValue;

/* renamed from: com.bytedance.ee.bear.bizwidget.banner.util.b */
public class C4877b {
    /* renamed from: a */
    public static int m20113a(boolean z, int i, int i2) {
        if (!z) {
            return i;
        }
        if (i == 0) {
            return i2 - 1;
        }
        if (i == i2 + 1) {
            return 0;
        }
        return i - 1;
    }

    /* renamed from: a */
    public static float m20112a(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }
}
