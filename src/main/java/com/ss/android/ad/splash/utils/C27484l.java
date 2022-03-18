package com.ss.android.ad.splash.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ss.android.ad.splash.utils.l */
public class C27484l {

    /* renamed from: a */
    private static int f68703a = -1;

    /* renamed from: a */
    private static boolean m100398a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* renamed from: a */
    public static int m100392a(Context context) {
        if (f68703a == -1 && context != null) {
            f68703a = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return f68703a;
    }

    /* renamed from: b */
    public static final int m100399b(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m100400c(Context context) {
        try {
            if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
                return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static void m100393a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    /* renamed from: a */
    public static float m100391a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    /* renamed from: a */
    public static final void m100394a(View view, int i) {
        if (view != null && view.getVisibility() != i && m100398a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m100395a(View view, ViewGroup viewGroup) {
        ViewParent parent;
        if (view != null && viewGroup != null && (parent = view.getParent()) != viewGroup) {
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
            }
            viewGroup.addView(view);
        }
    }

    /* renamed from: a */
    public static void m100397a(boolean z, View... viewArr) {
        int i;
        if (viewArr != null) {
            for (View view : viewArr) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                m100394a(view, i);
            }
        }
    }

    /* renamed from: a */
    public static void m100396a(View view, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        m100395a(view, viewGroup);
    }
}
