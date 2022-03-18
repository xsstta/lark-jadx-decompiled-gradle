package com.ss.android.appcenter.common.util;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.ss.android.appcenter.common.util.k */
public class C28190k {
    /* renamed from: a */
    public static int m103259a(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: b */
    public static int m103260b(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: c */
    public static int m103261c(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: d */
    public static int m103262d(Context context) {
        Resources resources = context.getResources();
        return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
    }
}
