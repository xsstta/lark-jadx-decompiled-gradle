package com.ss.android.videoshop.p3203i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.Logger;
import com.ss.android.videoshop.p3199e.C64159a;

/* renamed from: com.ss.android.videoshop.i.f */
public class C64177f {

    /* renamed from: a */
    private static int f162142a;

    /* renamed from: b */
    private static int f162143b;

    /* renamed from: a */
    public static boolean m252217a(int i) {
        if (i == 0 || i == 6 || i == 8 || (Build.VERSION.SDK_INT >= 18 && i == 11)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Activity m252219b(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m252224c(int i) {
        if (m252217a(i) || m252220b(i) || (Build.VERSION.SDK_INT >= 18 && i == 14)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static int m252226e(Context context) {
        Window window;
        View decorView;
        Activity a = C64174c.m252210a(context);
        if (a == null || (window = a.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return -1;
        }
        return decorView.getSystemUiVisibility();
    }

    /* renamed from: a */
    public static int m252216a(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        if (f162142a <= 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Activity b = m252219b(context);
                if (Build.VERSION.SDK_INT < 17 || b == null) {
                    displayMetrics = context.getResources().getDisplayMetrics();
                } else {
                    b.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                }
                if (displayMetrics != null) {
                    i = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
                }
                f162142a = i;
            } catch (Exception unused) {
            }
        }
        return f162142a;
    }

    /* renamed from: b */
    public static boolean m252220b(int i) {
        if (i == 1 || i == 7 || i == 9) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 18 || i != 12) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m252222c(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        if (f162143b <= 0) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Activity b = m252219b(context);
                if (Build.VERSION.SDK_INT < 17 || b == null) {
                    displayMetrics = context.getResources().getDisplayMetrics();
                } else {
                    b.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                }
                if (displayMetrics != null) {
                    i = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                f162143b = i;
            } catch (Exception unused) {
            }
        }
        return f162143b;
    }

    /* renamed from: d */
    public static int m252225d(Context context) {
        WindowManager windowManager;
        Activity a = C64174c.m252210a(context);
        if (a != null) {
            windowManager = a.getWindowManager();
        } else {
            windowManager = null;
        }
        if (windowManager == null) {
            return -1;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 1;
        }
        if (rotation == 1) {
            return 0;
        }
        if (rotation == 2) {
            return 9;
        }
        if (rotation != 3) {
            return -1;
        }
        return 8;
    }

    /* renamed from: a */
    public static boolean m252218a(View view) {
        if (view == null) {
            return false;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AbsListView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m252221b(View view) {
        if (view == null) {
            return false;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            try {
                if (parent instanceof RecyclerView) {
                    return true;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m252223c(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                C64159a.m252084c("VideoUIUtils", "parent isnot ViewGroup. view.context: " + view.getContext() + ", parent: " + parent);
                return;
            }
            try {
                ((ViewGroup) parent).removeView(view);
            } catch (Exception e) {
                Logger.throwException(e);
                C64159a.m252084c("VideoUIUtils", "first remove crash. view.context: " + view.getContext() + ", parent: " + parent);
            }
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent2).endViewTransition(view);
                    ((ViewGroup) parent2).removeView(view);
                } catch (Exception e2) {
                    Logger.throwException(e2);
                    C64159a.m252084c("VideoUIUtils", "second remove crash. view.context: " + view.getContext() + ", parent: " + parent2);
                }
            }
        }
    }
}
