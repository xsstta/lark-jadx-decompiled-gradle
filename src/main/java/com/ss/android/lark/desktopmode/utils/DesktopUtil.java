package com.ss.android.lark.desktopmode.utils;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.p1795a.C36574b;
import com.ss.android.lark.desktopmode.utils.p1797c.C36585b;
import com.ss.android.lark.desktopmode.utils.window.DesktopWindowLaunchHelper;
import com.ss.android.lark.desktopmode.utils.window.LaunchParam;
import com.ss.android.lark.log.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class DesktopUtil {

    /* renamed from: a */
    private static int f94137a = -1;

    /* renamed from: b */
    private static AtomicInteger f94138b = new AtomicInteger(-1);

    /* renamed from: c */
    private static AtomicBoolean f94139c = new AtomicBoolean(false);

    /* renamed from: d */
    private static boolean f94140d = false;

    /* renamed from: e */
    private static boolean f94141e = false;

    public @interface CaptionBarType {
    }

    /* renamed from: a */
    public static int m144293a(int i) {
        int i2;
        if (i < 100) {
            return 100;
        }
        if (i < 240 && (i2 = i * 2) < 240) {
            return i2;
        }
        return 240;
    }

    /* renamed from: a */
    public static String m144296a() {
        return "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.84 Safari/537.36";
    }

    /* renamed from: b */
    public static boolean m144307b() {
        return f94141e;
    }

    /* renamed from: a */
    public static int[] m144302a(View view) {
        return C36585b.m144332a().mo134977a(view);
    }

    /* renamed from: c */
    public static String m144310c() {
        return C36574b.m144312a().mo134971b();
    }

    /* renamed from: b */
    public static void m144306b(TextView... textViewArr) {
        if (m144307b()) {
            for (TextView textView : textViewArr) {
                textView.setTextSize(12.0f);
            }
        }
    }

    /* renamed from: c */
    public static int m144309c(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m144303b(Context context) {
        int i;
        int i2 = f94137a;
        if (i2 != -1) {
            return i2;
        }
        try {
            if (((WindowManager) context.getSystemService("window")).getDefaultDisplay().getDisplayId() == 0) {
                i = 1;
            } else {
                i = 2;
            }
            f94137a = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f94137a;
    }

    /* renamed from: a */
    public static void m144297a(boolean z) {
        Log.m165389i("DesktopUtil", "setEnableDesktopFeature:" + z);
        f94140d = z;
        f94139c.set(true);
    }

    /* renamed from: b */
    public static void m144304b(View view) {
        if (m144301a(view.getContext())) {
            int dp2px = UIUtils.dp2px(view.getContext(), 32.0f);
            view.getLayoutParams().width = dp2px;
            view.getLayoutParams().height = dp2px;
        }
    }

    /* renamed from: a */
    public static void m144298a(View... viewArr) {
        if (m144307b()) {
            for (View view : viewArr) {
                view.getLayoutParams().height = UIUtils.dp2px(view.getContext(), 48.0f);
            }
        }
    }

    /* renamed from: b */
    public static void m144305b(View... viewArr) {
        if (m144307b()) {
            for (View view : viewArr) {
                view.getLayoutParams().height = -2;
                view.setMinimumHeight(UIUtils.dp2px(view.getContext(), 60.0f));
            }
        }
    }

    /* renamed from: a */
    public static void m144299a(TextView... textViewArr) {
        if (m144307b()) {
            for (TextView textView : textViewArr) {
                textView.setTextSize(14.0f);
            }
        }
    }

    /* renamed from: b */
    private static boolean m144308b(Activity activity) {
        if (Build.VERSION.SDK_INT < 17) {
            return !activity.isFinishing();
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m144300a(Activity activity) {
        if (activity == null) {
            return false;
        }
        return m144308b(activity);
    }

    /* renamed from: a */
    public static boolean m144301a(Context context) {
        boolean z;
        if (f94138b.get() == -1) {
            if (m144303b(context) != 2 || !f94140d) {
                z = false;
            } else {
                z = true;
            }
            f94141e = z;
            if (!f94140d) {
                Log.m165383e("DesktopUtil", "isDesktopMode:" + f94141e + " desktop feature is not enabled");
                if (C26284k.m95185a(context)) {
                    Log.m165383e("DesktopUtil", "desktop mode called by: %s" + android.util.Log.getStackTraceString(new Throwable()));
                }
            } else {
                Log.m165389i("DesktopUtil", "isDesktopMode:" + f94141e);
            }
            if (f94139c.get()) {
                f94138b.compareAndSet(-1, 0);
            }
        }
        return f94141e;
    }

    /* renamed from: a */
    public static ActivityOptions m144295a(Activity activity, StandAloneParam standAloneParam) {
        return DesktopWindowLaunchHelper.f94149b.mo134981a().mo134980a(activity, LaunchParam.m144350a(activity, standAloneParam));
    }

    /* renamed from: a */
    public static ActivityOptions m144294a(Activity activity, int i, int i2) {
        return DesktopWindowLaunchHelper.f94149b.mo134981a().mo134980a(activity, new LaunchParam(new int[]{-1, -1}, 0, i, i2, false));
    }
}
