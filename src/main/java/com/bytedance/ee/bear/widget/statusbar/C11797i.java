package com.bytedance.ee.bear.widget.statusbar;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.bytedance.ee.bear.widget.statusbar.i */
public class C11797i {
    /* renamed from: a */
    public static int m48882a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
