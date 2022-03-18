package com.bytedance.ee.util.p718t;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.core.graphics.C0768a;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.t.l */
public class C13749l {

    /* renamed from: a */
    private static int f35943a;

    /* renamed from: b */
    private static int f35944b;

    /* renamed from: c */
    private static int f35945c;

    /* renamed from: a */
    public static String m55745a(Context context, int i) {
        return m55742a(context).getString(i);
    }

    /* renamed from: a */
    public static boolean m55746a(Configuration configuration) {
        if (configuration != null) {
            return configuration.toString().contains("magic-windows");
        }
        C13479a.m54775e("UIUtils", "configuration can't be null");
        return false;
    }

    /* renamed from: a */
    public static boolean m55747a(View view, MotionEvent motionEvent) {
        return m55759d(view).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* renamed from: a */
    public static int m55736a() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* renamed from: b */
    public static int m55748b() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: a */
    public static Resources m55742a(Context context) {
        return context.getResources();
    }

    /* renamed from: d */
    public static int m55757d(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: a */
    public static int m55737a(float f) {
        return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m55749b(int i) {
        return (int) ((((float) i) / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: c */
    public static int m55753c(int i) {
        return (int) ((((float) i) * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: e */
    public static int m55760e(Context context) {
        if (f35943a <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f35943a = displayMetrics.widthPixels;
        }
        return f35943a;
    }

    /* renamed from: f */
    public static int m55762f(Context context) {
        if (f35944b <= 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            f35944b = displayMetrics.heightPixels;
        }
        return f35944b;
    }

    /* renamed from: g */
    public static boolean m55763g(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().toString().contains("magic-windows");
        }
        C13479a.m54775e("UIUtils", "context can't be null");
        return false;
    }

    /* renamed from: a */
    public static int m55738a(int i) {
        return m55737a(Float.valueOf((float) i).floatValue());
    }

    /* renamed from: c */
    public static int m55754c(Context context) {
        int i = f35945c;
        if (i != 0) {
            return i;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        f35945c = displayMetrics.heightPixels;
        return displayMetrics.heightPixels;
    }

    /* renamed from: d */
    public static RectF m55759d(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getMeasuredWidth()), (float) (iArr[1] + view.getMeasuredHeight()));
    }

    /* renamed from: e */
    public static void m55761e(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
    }

    /* renamed from: b */
    public static DisplayMetrics m55751b(Context context) {
        return m55742a(context).getDisplayMetrics();
    }

    /* renamed from: c */
    public static void m55756c(View view) {
        if (!view.requestFocus()) {
            view.setFocusableInTouchMode(true);
            view.setFocusable(true);
            view.requestFocus();
        }
    }

    /* renamed from: b */
    public static void m55752b(final View view) {
        final Context context = view.getContext();
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.bytedance.ee.util.p718t.C13749l.ViewTreeObserver$OnPreDrawListenerC137501 */

            public boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                view.setTranslationY((((float) C13749l.m55754c(context)) / 3.0f) - (((float) iArr[1]) - view.getTranslationY()));
                return false;
            }
        });
    }

    /* renamed from: a */
    public static int m55741a(View view) {
        if (view == null) {
            return 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    /* renamed from: c */
    public static int m55755c(Context context, int i) {
        return m55742a(context).getColor(i);
    }

    /* renamed from: d */
    public static int m55758d(Context context, int i) {
        return m55740a(context, Float.valueOf((float) i).floatValue());
    }

    /* renamed from: b */
    public static int m55750b(Context context, int i) {
        return m55742a(context).getDimensionPixelSize(i);
    }

    /* renamed from: a */
    public static int m55739a(int i, double d) {
        if (d >= 0.0d && d <= 1.0d) {
            return C0768a.m3716c(i, (int) (d * 255.0d));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public static int m55740a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: a */
    public static <T extends View> T m55744a(View view, int i) {
        return (T) view.findViewById(i);
    }

    /* renamed from: a */
    public static RectF m55743a(View view, int i, int i2, int i3, int i4) {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rectF.left = (float) (iArr[0] - m55738a(i));
        rectF.top = (float) (iArr[1] - m55738a(i2));
        rectF.right = (float) (iArr[0] + view.getMeasuredWidth() + m55738a(i3));
        rectF.bottom = (float) (iArr[1] + view.getMeasuredHeight() + m55738a(i4));
        return rectF;
    }
}
