package com.ss.android.lark.passport.infra.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.TouchDelegate;
import android.view.View;
import android.view.WindowManager;
import com.samskivert.mustache.C27035d;
import com.ss.android.lark.passport.infra.log.PassportLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.passport.infra.util.ag */
public class C49154ag {
    /* renamed from: a */
    public static Resources m193829a(Context context) {
        return context.getResources();
    }

    /* renamed from: b */
    public static int m193837b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static int m193839c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    /* renamed from: d */
    public static int m193841d(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public static boolean m193835a(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return !activity.isFinishing();
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m193833a(View view, int i) {
        m193834a(view, i, i, i, i);
    }

    /* renamed from: a */
    public static String m193830a(Context context, int i) {
        return m193829a(context).getString(i);
    }

    /* renamed from: b */
    public static float m193836b(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().scaledDensity;
    }

    /* renamed from: c */
    public static int m193840c(Context context, int i) {
        return m193829a(context).getColor(i);
    }

    /* renamed from: a */
    public static int m193828a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m193838b(Context context, int i) {
        return m193829a(context).getDimensionPixelSize(i);
    }

    /* renamed from: d */
    public static int m193842d(Context context, int i) {
        return (int) ((((float) i) / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: a */
    public static String m193832a(Context context, int i, Map<String, String> map) {
        String a = m193830a(context, i);
        if (TextUtils.isEmpty(a) || map == null || map.size() == 0) {
            return a;
        }
        return C27035d.m98270a().mo96184a(false).mo96186a(a).mo96212a(map);
    }

    /* renamed from: a */
    public static String m193831a(Context context, int i, String str, String str2, PassportLog passportLog) {
        String a = m193830a(context, i);
        if (!(str == null || str2 == null)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str, str2);
            try {
                return C27035d.m98270a().mo96184a(false).mo96186a(a).mo96212a(hashMap);
            } catch (Exception e) {
                passportLog.mo171462a("UIUtils", "mustacheFormat error", e);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static void m193834a(final View view, final int i, final int i2, final int i3, final int i4) {
        if (view != null) {
            final View view2 = (View) view.getParent();
            if (view2 != null) {
                view2.post(new Runnable() {
                    /* class com.ss.android.lark.passport.infra.util.C49154ag.RunnableC491551 */

                    public void run() {
                        Rect rect = new Rect();
                        view.getHitRect(rect);
                        rect.top -= i;
                        rect.bottom += i4;
                        rect.left -= i2;
                        rect.right += i3;
                        view2.setTouchDelegate(new TouchDelegate(rect, view));
                    }
                });
                return;
            }
            throw new RuntimeException("view set TouchDelegate must have parent view");
        }
    }
}
