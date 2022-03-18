package com.ss.android.lark.ui.p2892a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.p017a.p018a.C0215a;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.ui.a.a */
public class C57582a {

    /* renamed from: a */
    private static int f141922a = 0;

    /* renamed from: b */
    private static int f141923b = -1;

    /* renamed from: c */
    private static int[] f141924c = new int[2];

    /* renamed from: d */
    private static RectF f141925d;

    /* renamed from: a */
    public static Resources m223603a(Context context) {
        return context.getResources();
    }

    /* renamed from: b */
    public static void m223612b(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static int m223600a(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m223609b(Context context) {
        int i = f141922a;
        if (i != 0) {
            return i;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        f141922a = displayMetrics.heightPixels;
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static void m223615c(final View view) {
        final Context context = view.getContext();
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.lark.ui.p2892a.C57582a.ViewTreeObserver$OnPreDrawListenerC575831 */

            public boolean onPreDraw() {
                int[] iArr;
                float f;
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr2 = new int[2];
                if (DesktopUtil.m144301a(context)) {
                    f = (float) C36512a.m144041a().mo134753a(ContainerType.Left).height();
                    iArr = DesktopUtil.m144302a(view);
                } else {
                    float b = (float) C57582a.m223609b(context);
                    view.getLocationOnScreen(iArr2);
                    iArr = iArr2;
                    f = b;
                }
                view.setTranslationY((f / 3.0f) - (((float) iArr[1]) - view.getTranslationY()));
                return false;
            }
        });
    }

    /* renamed from: b */
    private static boolean m223613b(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m223606a(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static boolean m223607a(Activity activity) {
        if (activity == null || !m223613b(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static Drawable m223617e(Context context, int i) {
        return C0215a.m655b(context, i);
    }

    /* renamed from: a */
    public static String m223604a(Context context, int i) {
        return m223603a(context).getString(i);
    }

    /* renamed from: b */
    public static int m223610b(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static Drawable m223614c(Context context, int i) {
        return m223603a(context).getDrawable(i);
    }

    /* renamed from: d */
    public static int m223616d(Context context, int i) {
        return m223603a(context).getColor(i);
    }

    /* renamed from: a */
    public static int m223601a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m223611b(Context context, int i) {
        return m223603a(context).getDimensionPixelSize(i);
    }

    /* renamed from: a */
    public static int m223602a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static boolean m223608a(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(f141924c);
        int[] iArr = f141924c;
        RectF rectF = new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (f141924c[1] + view.getHeight()));
        f141925d = rectF;
        return rectF.contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* renamed from: a */
    public static void m223605a(Activity activity, float f, Drawable drawable) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            View decorView = window.getDecorView();
            if (Build.VERSION.SDK_INT >= 23) {
                decorView.setForeground(drawable);
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f;
            window.setAttributes(attributes);
        }
    }
}
