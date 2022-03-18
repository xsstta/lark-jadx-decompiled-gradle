package com.larksuite.framework.utils;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.ss.android.lark.log.Log;
import java.lang.reflect.InvocationTargetException;

public class DeviceUtils {
    public static volatile Boolean isSizeValid = null;
    private static int sCurrentMode = -1;
    private static volatile float sScreenDensity = 0.0f;
    private static volatile int sScreenHeight = 0;
    private static volatile int sScreenWidth = 0;
    private static int sStatusHeight = -1;

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getRomVersion() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String getAPIVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static void enterFullScreen(Activity activity) {
        hideTitleBar(activity);
        setFullScreen(activity);
    }

    public static void hideTitleBar(Activity activity) {
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }

    public static void exitFullScreen(Activity activity) {
        if (activity != null) {
            activity.getWindow().clearFlags(1024);
        }
    }

    public static void setFullScreen(Activity activity) {
        if (activity != null) {
            activity.getWindow().setFlags(1024, 1024);
        }
    }

    public static int getApplicationWindowHeight(Context context) {
        Rect rect = new Rect();
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.height();
    }

    public static int getCurrentMode(Context context) {
        int i;
        int i2 = sCurrentMode;
        if (i2 != -1) {
            return i2;
        }
        if (getDisplayId(context) == 0) {
            i = 1;
        } else {
            i = 2;
        }
        sCurrentMode = i;
        return i;
    }

    public static float getScreenDensity(Context context) {
        if (getCurrentMode(context) == 2) {
            return getScreenSizeImpl(context).f64796c;
        }
        refreshSizeIfNeed(context);
        return sScreenDensity;
    }

    public static int getScreenDensityDpi(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public static int getScreenHeight(Context context) {
        if (getCurrentMode(context) == 2) {
            return getScreenSizeImpl(context).f64795b;
        }
        refreshSizeIfNeed(context);
        return sScreenHeight;
    }

    private static C26238a getScreenSizeImpl(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return new C26238a(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.scaledDensity);
    }

    public static int getScreenWidth(Context context) {
        if (getCurrentMode(context) == 2) {
            return getScreenSizeImpl(context).f64794a;
        }
        refreshSizeIfNeed(context);
        return sScreenWidth;
    }

    public static String getUDID(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception unused) {
            Log.m165397w("DeviceUtils", "get UDID exception");
            return null;
        }
    }

    private static int getDisplayId(Context context) {
        try {
            Display display = (Display) Context.class.getMethod("getDisplay", new Class[0]).invoke(context, new Object[0]);
            if (display != null) {
                return display.getDisplayId();
            }
            return 0;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return 0;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return 0;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return 0;
        }
    }

    public static int getRealScreenHeight(Context context) {
        if (!C26326z.m95338b()) {
            return getScreenHeight(context);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    private static void refreshSizeIfNeed(Context context) {
        if (isSizeValid == null || !isSizeValid.booleanValue()) {
            if (isSizeValid == null) {
                context.getApplicationContext().registerComponentCallbacks(new ComponentCallbacks() {
                    /* class com.larksuite.framework.utils.DeviceUtils.ComponentCallbacksC262371 */

                    public void onLowMemory() {
                    }

                    public void onConfigurationChanged(Configuration configuration) {
                        DeviceUtils.isSizeValid = false;
                    }
                });
            }
            C26238a screenSizeImpl = getScreenSizeImpl(context);
            sScreenWidth = screenSizeImpl.f64794a;
            sScreenHeight = screenSizeImpl.f64795b;
            sScreenDensity = screenSizeImpl.f64796c;
            isSizeValid = true;
        }
    }

    public static int getStatusHeight(Context context) {
        int i = sStatusHeight;
        if (i != -1) {
            return i;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        sStatusHeight = dimensionPixelSize;
        if (dimensionPixelSize != -1) {
            return dimensionPixelSize;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            sStatusHeight = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (sStatusHeight <= 0) {
            Log.m165383e("DeviceUtils", "getStatusHeight error, height is： " + sStatusHeight);
        }
        return sStatusHeight;
    }

    public static int getDpFromDimenXml(Context context, int i) {
        return (int) (context.getResources().getDimension(i) / getScreenDensity(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.larksuite.framework.utils.DeviceUtils$a */
    public static class C26238a {

        /* renamed from: a */
        int f64794a;

        /* renamed from: b */
        int f64795b;

        /* renamed from: c */
        float f64796c;

        public C26238a(int i, int i2, float f) {
            this.f64794a = i;
            this.f64795b = i2;
            this.f64796c = f;
        }
    }
}
