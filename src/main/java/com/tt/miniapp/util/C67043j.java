package com.tt.miniapp.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.util.C67590h;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tt.miniapp.util.j */
public final class C67043j {

    /* renamed from: a */
    private static final Pattern f169016a = Pattern.compile("(?i)^(\\d+)\\.(\\d+)\\.(\\d+)$");

    /* renamed from: b */
    private static final Pattern f169017b = Pattern.compile("(?i)^(\\d+)\\.(\\d+)\\.(\\d+)-(beta\\d*|alpha\\d*)$");

    /* renamed from: a */
    private static long m261269a(long j, long j2, long j3, long j4) {
        return (j * 100000000000L) + (j2 * 100000000) + (j3 * 100000) + j4;
    }

    /* renamed from: e */
    public static String m261282e() {
        return "Android";
    }

    /* renamed from: a */
    public static String m261271a() {
        return Build.BRAND;
    }

    /* renamed from: b */
    public static String m261276b() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public static String m261279d() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: f */
    public static boolean m261284f() {
        return ContextSingletonInstance.getInstance().getDeviceInfo().mo234266a();
    }

    /* renamed from: c */
    public static boolean m261278c() {
        if (Build.MANUFACTURER == null || !Build.MANUFACTURER.contains("HUAWEI")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static String m261286g() {
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        return locale.getLanguage() + "-" + locale.getCountry();
    }

    /* renamed from: a */
    public static String m261272a(Configuration configuration) {
        if (UDUiModeUtils.m93320a(configuration)) {
            return "dark";
        }
        return "light";
    }

    /* renamed from: d */
    public static boolean m261280d(Context context) {
        int c = m261277c(context);
        if (c == 0 || c == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static float m261281e(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: f */
    public static String m261283f(Context context) {
        return ContextSingletonInstance.getInstance().getDeviceInfo().mo234267b(context);
    }

    /* renamed from: g */
    public static int m261285g(Context context) {
        return ContextSingletonInstance.getInstance().getDeviceInfo().mo234265a(context);
    }

    /* renamed from: j */
    public static int m261289j(Context context) {
        return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
    }

    /* renamed from: a */
    public static int m261267a(Context context) {
        Display l = m261291l(context);
        if (l == null) {
            return 0;
        }
        try {
            Point point = new Point();
            l.getSize(point);
            return point.y;
        } catch (Exception unused) {
            AppBrandLogger.m52829e("DevicesUtil", new Object[0]);
            return 0;
        }
    }

    /* renamed from: b */
    public static int m261275b(Context context) {
        Display l = m261291l(context);
        if (l == null) {
            return 0;
        }
        try {
            Point point = new Point();
            l.getSize(point);
            return point.x;
        } catch (Exception unused) {
            AppBrandLogger.m52829e("DevicesUtil", new Object[0]);
            return 0;
        }
    }

    /* renamed from: c */
    public static int m261277c(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: h */
    public static float m261287h(Context context) {
        return context.getResources().getConfiguration().fontScale * ((float) C67590h.m263087c(context, 12.0f));
    }

    /* renamed from: l */
    private static Display m261291l(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) context.getSystemService("window");
        }
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: i */
    public static int m261288i(Context context) {
        int rssi = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getRssi();
        if (rssi <= 0 && rssi >= -50) {
            return 4;
        }
        if (rssi < -50 && rssi >= -70) {
            return 3;
        }
        if (rssi < -70 && rssi >= -80) {
            return 2;
        }
        if (rssi >= -80 || rssi < -100) {
            return 0;
        }
        return 1;
    }

    /* renamed from: k */
    public static boolean m261290k(Context context) {
        boolean z;
        Exception e;
        try {
            if (!m261278c()) {
                return false;
            }
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            z = ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
            try {
                AppBrandLogger.m52828d("DevicesUtil", "hasNotchInScreen:", Boolean.valueOf(z));
            } catch (Exception e2) {
                e = e2;
            }
            return z;
        } catch (Exception e3) {
            e = e3;
            z = false;
            AppBrandLogger.m52829e("DevicesUtil", "hasNotchInScreen error:", e);
            return z;
        }
    }

    /* renamed from: a */
    public static void m261273a(Window window) {
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                if (m261278c()) {
                    Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
                    Object newInstance = cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes);
                    cls.getMethod("addHwFlags", Integer.TYPE).invoke(newInstance, 65536);
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("DevicesUtil", "setFullScreenWindowLayoutInDisplayCutout error:", e);
            }
        }
    }

    /* renamed from: a */
    private static long m261270a(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Matcher matcher = f169016a.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 3) {
            Matcher matcher2 = f169017b.matcher(str);
            if (!matcher2.find() || matcher2.groupCount() != 4) {
                return 0;
            }
            int parseInt = Integer.parseInt(matcher2.group(1));
            int parseInt2 = Integer.parseInt(matcher2.group(2));
            int parseInt3 = Integer.parseInt(matcher2.group(3));
            String group = matcher2.group(4);
            if (group.substring(0, 4).toLowerCase().equals("beta")) {
                i = Integer.parseInt(group.substring(4)) + HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
            } else if (group.substring(0, 5).toLowerCase().equals("alpha")) {
                i = Integer.parseInt(group.substring(5));
            } else {
                i = 0;
            }
            AppBrandLogger.m52830i("DevicesUtil", String.format("convertStrVersionToLong has alpha or beta:%d,%d,%d,%d", Integer.valueOf(parseInt), Integer.valueOf(parseInt2), Integer.valueOf(parseInt3), Integer.valueOf(i)));
            return m261269a((long) parseInt, (long) parseInt2, (long) parseInt3, (long) i);
        }
        int parseInt4 = Integer.parseInt(matcher.group(1));
        int parseInt5 = Integer.parseInt(matcher.group(2));
        int parseInt6 = Integer.parseInt(matcher.group(3));
        AppBrandLogger.m52830i("DevicesUtil", String.format("convertStrVersionToLong :%d,%d,%d,%d", Integer.valueOf(parseInt4), Integer.valueOf(parseInt5), Integer.valueOf(parseInt6), 20000));
        return m261269a((long) parseInt4, (long) parseInt5, (long) parseInt6, (long) 20000);
    }

    /* renamed from: a */
    public static int m261268a(Context context, String str) {
        int i = (m261270a(m261283f(context).trim()) > m261270a(str) ? 1 : (m261270a(m261283f(context).trim()) == m261270a(str) ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        if (i < 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m261274a(boolean z, Window window) {
        int i;
        try {
            Class<?> cls = window.getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Object[] objArr = new Object[2];
            if (z) {
                i = i2;
            } else {
                i = 0;
            }
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
