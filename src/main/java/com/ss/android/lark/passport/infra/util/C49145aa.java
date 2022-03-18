package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.lark.passport.infra.util.aa */
public class C49145aa {

    /* renamed from: a */
    private static final int f123420a = 2131305954;

    /* renamed from: a */
    private static int m193792a(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        float f = 1.0f - (((float) i2) / 255.0f);
        return ((int) (((double) (((float) (i & 255)) * f)) + 0.5d)) | (((int) (((double) (((float) ((i >> 16) & 255)) * f)) + 0.5d)) << 16) | -16777216 | (((int) (((double) (((float) ((i >> 8) & 255)) * f)) + 0.5d)) << 8);
    }

    /* renamed from: a */
    public static void m193795a(Activity activity) {
        m193799b(activity, activity.getWindow(), R.color.signin_theme_bg);
    }

    /* renamed from: a */
    private static int m193793a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    private static void m193798a(Window window) {
        ViewGroup viewGroup = (ViewGroup) window.getDecorView().findViewById(16908290);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                childAt.setFitsSystemWindows(true);
                ((ViewGroup) childAt).setClipToPadding(true);
            }
        }
    }

    /* renamed from: a */
    public static void m193796a(Context context, Window window, int i) {
        m193797a(context, window, i, 0);
    }

    /* renamed from: c */
    private static void m193800c(Context context, Window window, int i) {
        if (RomUtils.m94941b(context, window)) {
            m193796a(context, window, i);
        }
    }

    /* renamed from: d */
    private static void m193801d(Context context, Window window, int i) {
        if (RomUtils.m94934a(context, window)) {
            m193796a(context, window, i);
        }
    }

    /* renamed from: b */
    public static void m193799b(Context context, Window window, int i) {
        int c = C49154ag.m193840c(context, i);
        if (UDUiModeUtils.m93319a(context)) {
            m193800c(context, window, c);
        } else {
            m193801d(context, window, c);
        }
    }

    /* renamed from: a */
    private static View m193794a(Context context, int i, int i2) {
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, m193793a(context)));
        view.setBackgroundColor(m193792a(i, i2));
        view.setId(f123420a);
        return view;
    }

    /* renamed from: a */
    public static void m193797a(Context context, Window window, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(m193792a(i, i2));
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            View findViewById = viewGroup.findViewById(f123420a);
            if (findViewById != null) {
                if (findViewById.getVisibility() == 8) {
                    findViewById.setVisibility(0);
                }
                findViewById.setBackgroundColor(m193792a(i, i2));
            } else {
                viewGroup.addView(m193794a(context, i, i2));
            }
            m193798a(window);
        }
    }
}
