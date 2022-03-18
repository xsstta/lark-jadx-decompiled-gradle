package com.ss.android.vc.common.p3083e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.vc.dependency.ar;

/* renamed from: com.ss.android.vc.common.e.o */
public class C60773o {
    /* renamed from: a */
    public static int m236115a(double d) {
        return UIUtils.dp2px(ar.m236694a(), (float) d);
    }

    /* renamed from: b */
    public static int m236122b(double d) {
        return UIUtils.px2dp(ar.m236694a(), (float) d);
    }

    /* renamed from: c */
    public static long m236125c(int i) {
        return (long) m236118a(ar.m236694a().getResources(), i);
    }

    /* renamed from: d */
    public static int m236126d(int i) {
        return ContextCompat.getColor(ar.m236698c(), i);
    }

    /* renamed from: e */
    public static ColorStateList m236127e(int i) {
        return ContextCompat.getColorStateList(ar.m236698c(), i);
    }

    /* renamed from: f */
    public static Drawable m236128f(int i) {
        return ContextCompat.getDrawable(ar.m236698c(), i);
    }

    /* renamed from: b */
    public static int m236123b(int i) {
        return ar.m236694a().getResources().getDimensionPixelSize(i);
    }

    /* renamed from: a */
    public static String m236119a(int i) {
        return ar.m236694a().getResources().getString(i);
    }

    /* renamed from: b */
    public static Activity m236124b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m236120a(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isRestricted()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return true;
        }
        try {
            if (activity.isDestroyed()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        } catch (Error e2) {
            e2.printStackTrace();
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m236121a(Context context) {
        if (context == null) {
            return false;
        }
        if (context instanceof ContextThemeWrapper) {
            context = ((ContextThemeWrapper) context).getBaseContext();
        }
        if ((context instanceof Activity) && m236120a((Activity) context)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m236116a(int i, float f) {
        return m236117a(null, i, f);
    }

    /* renamed from: a */
    public static int m236118a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* renamed from: a */
    public static int m236117a(Context context, int i, float f) {
        return C25653b.m91893a(ContextCompat.getColor(ar.m236698c(), i), f);
    }
}
