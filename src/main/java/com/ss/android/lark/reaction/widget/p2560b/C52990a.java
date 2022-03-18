package com.ss.android.lark.reaction.widget.p2560b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.utils.p1797c.C36585b;

/* renamed from: com.ss.android.lark.reaction.widget.b.a */
public class C52990a {
    /* renamed from: a */
    public static Resources m205227a(Context context) {
        return context.getResources();
    }

    /* renamed from: d */
    public static int m205241d(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: e */
    public static int m205242e(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static void m205236b(View view) {
        ViewParent parent;
        ViewParent parent2 = view.getParent();
        if (parent2 != null && (parent = parent2.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).setClipChildren(false);
        }
    }

    /* renamed from: c */
    public static int m205238c(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return m205241d(context);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: a */
    public static int m205226a(View view) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredWidth();
    }

    /* renamed from: b */
    public static int m205233b(Context context) {
        if (!DesktopUtil.m144301a(context)) {
            return m205238c(context);
        }
        if (!(context instanceof Activity)) {
            return C36512a.m144041a().mo134753a(ContainerType.Right).height();
        }
        Rect a = C36585b.m144332a().mo134976a((Activity) context);
        if (a.bottom == 0 && a.top == 0) {
            return C36512a.m144041a().mo134753a(ContainerType.Right).height();
        }
        return a.bottom - a.top;
    }

    /* renamed from: c */
    public static boolean m205240c(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.isLongClickable()) {
                viewGroup.performLongClick();
                return true;
            }
            parent = parent.getParent();
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m205237b(Activity activity) {
        if (Build.VERSION.SDK_INT < 17) {
            return !activity.isFinishing();
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m205232a(Activity activity) {
        if (activity == null) {
            return false;
        }
        return m205237b(activity);
    }

    /* renamed from: a */
    public static String m205228a(Context context, int i) {
        return m205227a(context).getString(i);
    }

    /* renamed from: b */
    public static int m205234b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m205239c(Context context, int i) {
        return m205227a(context).getColor(i);
    }

    /* renamed from: a */
    public static int m205224a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static Drawable m205235b(Context context, int i) {
        return m205227a(context).getDrawable(i);
    }

    /* renamed from: a */
    public static int m205225a(Context context, ContainerType containerType) {
        if (!DesktopUtil.m144301a(context)) {
            return m205242e(context);
        }
        int width = C36512a.m144041a().mo134753a(containerType).width();
        if (containerType == ContainerType.Left && width == 0) {
            return m205224a(context, 300.0f);
        }
        return width;
    }

    /* renamed from: a */
    public static void m205231a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m205231a(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: a */
    public static String m205229a(Context context, int i, String str, String str2) {
        String a = m205228a(context, i);
        if (str == null || str2 == null) {
            return a;
        }
        return a.replace(String.format("{{%s}}", str), str2);
    }

    /* renamed from: a */
    public static void m205230a(View view, int i, int i2, int i3, int i4) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }
}
